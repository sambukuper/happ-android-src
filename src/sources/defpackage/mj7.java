package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mj7 extends hw7 implements Serializable {
    public static void l(al alVar, f25 f25Var, vp4 vp4Var, m85 m85Var, HashMap map) {
        String strK;
        if (f25Var.Z == null && (strK = m85Var.K(alVar)) != null) {
            f25Var = new f25(f25Var.X, strK);
        }
        f25 f25Var2 = new f25(f25Var.X, null);
        if (map.containsKey(f25Var2)) {
            if (f25Var.Z == null || ((f25) map.get(f25Var2)).Z != null) {
                return;
            }
            map.put(f25Var2, f25Var);
            return;
        }
        map.put(f25Var2, f25Var);
        List listJ = m85Var.J(alVar);
        if (listJ != null) {
            ArrayList<f25> arrayList = (ArrayList) listJ;
            if (arrayList.isEmpty()) {
                return;
            }
            for (f25 f25Var3 : arrayList) {
                l(bl.i(vp4Var, f25Var3.X, vp4Var), f25Var3, vp4Var, m85Var, map);
            }
        }
    }

    public final ArrayList m(vp4 vp4Var, gl glVar, dh8 dh8Var) {
        Class clsN;
        List listJ;
        m85 m85VarD = vp4Var.d();
        if (dh8Var != null) {
            clsN = dh8Var.j0;
        } else {
            if (glVar == null) {
                bt.q("Both property and base type are nulls");
                return null;
            }
            clsN = glVar.N();
        }
        HashMap map = new HashMap();
        if (glVar != null && (listJ = m85VarD.J(glVar)) != null) {
            for (f25 f25Var : (ArrayList) listJ) {
                l(bl.i(vp4Var, f25Var.X, vp4Var), f25Var, vp4Var, m85VarD, map);
            }
        }
        l(bl.i(vp4Var, clsN, vp4Var), new f25(clsN, null), vp4Var, m85VarD, map);
        return new ArrayList(map.values());
    }
}
