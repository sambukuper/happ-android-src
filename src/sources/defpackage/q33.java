package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q33 extends m33 {
    @Override // defpackage.al8, java.util.ResourceBundle
    public final Object handleGetObject(String str) {
        z33 z33Var = (z33) this.b.h0;
        int iL = ((y33) this.i).l(z33Var, str);
        if (iL >= 0) {
            int iH = this.i.h(z33Var, iL);
            String strG = z33Var.g(iH);
            if (strG != null) {
                return strG;
            }
            t33 t33VarA = z33Var.a(iH);
            if (t33VarA != null) {
                int i = t33VarA.b;
                String[] strArr = new String[i];
                for (int i2 = 0; i2 != i; i2++) {
                    String strG2 = z33Var.g(t33VarA.h(z33Var, i2));
                    if (strG2 != null) {
                        strArr[i2] = strG2;
                    }
                }
                return strArr;
            }
        }
        return t(str, this);
    }

    @Override // defpackage.al8, java.util.ResourceBundle
    public final Set handleKeySet() {
        z33 z33Var = (z33) this.b.h0;
        TreeSet treeSet = new TreeSet();
        y33 y33Var = (y33) this.i;
        for (int i = 0; i < y33Var.b; i++) {
            treeSet.add(y33Var.n(z33Var, i));
        }
        return treeSet;
    }

    @Override // defpackage.al8
    public final int p() {
        return 2;
    }

    @Override // defpackage.al8
    public final al8 r(int i, al8 al8Var) {
        y33 y33Var = (y33) this.i;
        fu6 fu6Var = this.b;
        String strN = y33Var.n((z33) fu6Var.h0, i);
        if (strN != null) {
            return z(strN, this.i.h((z33) fu6Var.h0, i), null, al8Var);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.al8
    public final al8 s(String str, HashMap map, al8 al8Var) {
        y33 y33Var = (y33) this.i;
        fu6 fu6Var = this.b;
        int iL = y33Var.l((z33) fu6Var.h0, str);
        if (iL < 0) {
            return null;
        }
        return z(str, this.i.h((z33) fu6Var.h0, iL), map, al8Var);
    }
}
