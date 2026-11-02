package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements ub0 {
    public final boolean a;
    public final String b;

    public ac0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.ub0
    public final boolean a(et6 et6Var) {
        int i;
        boolean z = this.a;
        String strO = this.b;
        if (z && strO == null) {
            strO = et6Var.o();
        }
        ct6 ct6Var = et6Var.b;
        if (ct6Var != null) {
            Iterator it = ct6Var.g().iterator();
            i = 0;
            while (it.hasNext()) {
                et6 et6Var2 = (et6) ((gt6) it.next());
                if (strO == null || et6Var2.o().equals(strO)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? pc6.p("only-of-type <", this.b, ">") : "only-child";
    }
}
