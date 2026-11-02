// Apply Go pclntab symbol names to the analyzed program.
// Args: [0] pclntab TSV (addr \t end \t name), [1] max functions to create (int)
import ghidra.app.script.GhidraScript;
import ghidra.app.cmd.disassemble.DisassembleCommand;
import ghidra.app.cmd.function.CreateFunctionCmd;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.*;
import java.io.*;
import java.util.*;

public class ImportGoNames extends GhidraScript {
    @Override
    public void run() throws Exception {
        String tsv = getScriptArgs()[0];
        int maxCreate = getScriptArgs().length > 1 ? Integer.parseInt(getScriptArgs()[1]) : 2000;

        Map<Long, String> byAddr = new HashMap<Long, String>();
        Map<Long, Long> ends = new HashMap<Long, Long>();
        BufferedReader r = new BufferedReader(new FileReader(tsv));
        String line;
        while ((line = r.readLine()) != null) {
            String[] p = line.split("\t");
            if (p.length < 3) continue;
            long a = Long.decode(p[0]);
            byAddr.put(a, p[2]);
            ends.put(a, Long.decode(p[1]));
            if (byAddr.size() % 50000 == 0 && monitor.isCancelled()) return;
        }
        r.close();
        System.out.println("pclntab names: " + byAddr.size());

        FunctionManager fm = currentProgram.getFunctionManager();
        SymbolTable st = currentProgram.getSymbolTable();

        int renamed = 0;
        for (Function f : fm.getFunctions(true)) {
            String n = byAddr.get(f.getEntryPoint().getOffset());
            if (n != null) {
                try {
                    f.setName(n, SourceType.IMPORTED);
                    renamed++;
                } catch (Exception e) { /* invalid name or duplicate */ }
            }
        }
        System.out.println("renamed existing functions: " + renamed);

        // Create functions for selected names that Ghidra has not discovered.
        int created = 0;
        for (Map.Entry<Long, String> e : byAddr.entrySet()) {
            if (created >= maxCreate) break;
            if (monitor.isCancelled()) break;
            String n = e.getValue();
            if (!interesting(n)) continue;
            Address a = currentProgram.getAddressFactory().getDefaultAddressSpace().getAddress(e.getKey());
            if (fm.getFunctionAt(a) != null) continue;
            if (currentProgram.getMemory().getBlock(a) == null) continue;
            long end = ends.get(e.getKey());
            try {
                new DisassembleCommand(a, null, true).applyTo(currentProgram, monitor);
                Function f = createFunction(a, (String) null);
                if (f == null) {
                    f = fm.getFunctionAt(a);
                }
                if (f != null) {
                    f.setName(n, SourceType.IMPORTED);
                    created++;
                }
            } catch (Exception ex) { /* skip */ }
        }
        System.out.println("created functions: " + created);
    }

    private static boolean interesting(String n) {
        return n.startsWith("Java_") || n.startsWith("proxylibxray") || n.startsWith("proxy_")
            || n.startsWith("cproxylibxray") || n.startsWith("new_libxray")
            || n.startsWith("github.com/xtls/xray-core") || n.startsWith("github.com/xtls/reality")
            || n.startsWith("main.") || n.startsWith("gobind");
    }
}
