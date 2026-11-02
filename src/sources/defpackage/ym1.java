package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ym1 {
    public static final /* synthetic */ int a = 0;

    static {
        lh4.a1("DiagnosticsWrkr");
    }

    public static final void a(b49 b49Var, p49 p49Var, l08 l08Var, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l49 l49Var = (l49) it.next();
            s39 s39VarB = v18.b(l49Var);
            String str = l49Var.a;
            l08Var.getClass();
            String str2 = s39VarB.a;
            int i = s39VarB.b;
            str2.getClass();
            j08 j08Var = (j08) u15.G(l08Var.a, true, false, new k08(str2, i, (byte) 0));
            Integer numValueOf = j08Var != null ? Integer.valueOf(j08Var.c) : null;
            b49Var.getClass();
            str.getClass();
            String strY0 = wv0.y0((List) u15.G(b49Var.a, true, false, new nm7(str, (byte) 4)), ",", null, null, null, 62);
            p49Var.getClass();
            String strY1 = wv0.y0((List) u15.G(p49Var.a, true, false, new nm7(str, (byte) 18)), ",", null, null, null, 62);
            String str3 = l49Var.c;
            String strName = l49Var.b.name();
            StringBuilder sbT = oi0.t("\n", str, "\t ", str3, "\t ");
            sbT.append(numValueOf);
            sbT.append("\t ");
            sbT.append(strName);
            sbT.append("\t ");
            oi0.y(sbT, strY0, "\t ", strY1, "\t");
        }
    }
}
