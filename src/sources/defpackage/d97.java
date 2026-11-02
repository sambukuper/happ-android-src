package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d97 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public qg5 c = new qg5("V", null);

    public d97(xd6 xd6Var, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, ql3... ql3VarArr) {
        rh8 rh8Var;
        str.getClass();
        if (ql3VarArr.length == 0) {
            rh8Var = null;
        } else {
            gu guVar = new gu(new o7((Object) ql3VarArr, (byte) 8), (byte) 1);
            int iG = aq4.G(xv0.Z(guVar, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            Iterator it = guVar.iterator();
            while (true) {
                rw1 rw1Var = (rw1) it;
                if (!rw1Var.Y.hasNext()) {
                    break;
                }
                pb3 pb3Var = (pb3) rw1Var.next();
                linkedHashMap.put(Integer.valueOf(pb3Var.a), (ql3) pb3Var.b);
            }
            rh8Var = new rh8(linkedHashMap);
        }
        this.b.add(new qg5(str, rh8Var));
    }

    public final void b(ut3 ut3Var) {
        ut3Var.getClass();
        this.c = new qg5(ut3Var.Z, null);
    }

    public final void c(String str, ql3... ql3VarArr) {
        str.getClass();
        gu guVar = new gu(new o7((Object) ql3VarArr, (byte) 8), (byte) 1);
        int iG = aq4.G(xv0.Z(guVar, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        Iterator it = guVar.iterator();
        while (true) {
            rw1 rw1Var = (rw1) it;
            if (!rw1Var.Y.hasNext()) {
                this.c = new qg5(str, new rh8(linkedHashMap));
                return;
            } else {
                pb3 pb3Var = (pb3) rw1Var.next();
                linkedHashMap.put(Integer.valueOf(pb3Var.a), (ql3) pb3Var.b);
            }
        }
    }
}
