// Export Go/libxray analysis artifacts from an analyzed program.
// Args: [0] output directory
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.symbol.*;
import java.io.*;
import java.util.*;

public class ExportGo extends GhidraScript {
    private static final int MAX_FUNCS = 400;
    private static final int DECOMP_TIMEOUT_S = 90;

    private static boolean selected(String n) {
        return n.startsWith("Java_libxray") || n.startsWith("Java_go_Seq")
            || n.startsWith("proxylibxray") || n.startsWith("cproxylibxray")
            || n.startsWith("new_libxray") || n.startsWith("proxy_")
            || n.equals("main.main") || n.startsWith("_cgoexp_");
    }

    private static String safe(String n) {
        return n.replaceAll("[^A-Za-z0-9_.$-]", "_");
    }

    @Override
    public void run() throws Exception {
        String outDir = getScriptArgs()[0];
        File cDir = new File(outDir, "c");
        cDir.mkdirs();

        List<Function> selectedFuncs = new ArrayList<Function>();
        File fnFile = new File(outDir, "functions.tsv");
        PrintWriter fnw = new PrintWriter(new BufferedWriter(new FileWriter(fnFile)));
        for (Function f : currentProgram.getFunctionManager().getFunctions(true)) {
            String n = f.getName();
            fnw.println(f.getEntryPoint() + "\t" + n);
            if (selected(n)) selectedFuncs.add(f);
        }
        fnw.close();
        System.out.println("functions: " + currentProgram.getFunctionManager().getFunctionCount()
                + " selected: " + selectedFuncs.size());

        DecompInterface d = new DecompInterface();
        DecompileOptions opts = new DecompileOptions();
        opts.grabFromProgram(currentProgram);
        d.setOptions(opts);
        d.toggleCCode(true);
        d.toggleSyntaxTree(true);
        d.setSimplificationStyle("decompile");
        if (!d.openProgram(currentProgram)) {
            System.out.println("decompiler open failed: " + d.getLastMessage());
            return;
        }

        PrintWriter refw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outDir, "refs.txt"))));
        int done = 0;
        for (Function f : selectedFuncs) {
            if (done++ >= MAX_FUNCS) break;
            String name = f.getName();
            File out = new File(cDir, safe(name) + ".c");
            PrintWriter w = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out), "UTF-8"));
            w.println("// " + name + " @ " + f.getEntryPoint()
                    + " size=" + f.getBody().getNumAddresses());
            ReferenceIterator it = currentProgram.getReferenceManager().getReferencesTo(f.getEntryPoint());
            w.println("// callers:");
            int rc = 0;
            while (it.hasNext() && rc++ < 50) {
                Reference r = it.next();
                Function caller = currentProgram.getFunctionManager().getFunctionContaining(r.getFromAddress());
                String line = "//   " + r.getFromAddress() + " " + (caller == null ? "?" : caller.getName());
                w.println(line);
                refw.println(name + "\t" + line.substring(5));
            }
            DecompileResults res = d.decompileFunction(f, DECOMP_TIMEOUT_S, monitor);
            if (res != null && res.decompileCompleted()) {
                w.println(res.getDecompiledFunction().getC());
            } else {
                w.println("// DECOMPILE FAILED: " + (res == null ? "null" : res.getErrorMessage()));
            }
            w.close();
        }
        refw.close();
        d.dispose();
        System.out.println("exported " + Math.min(done, MAX_FUNCS) + " functions to " + cDir);
    }
}
