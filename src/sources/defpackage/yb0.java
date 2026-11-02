package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yb0 implements ub0 {
    public List a;

    @Override // defpackage.ub0
    public final boolean a(et6 et6Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (fc0.k((dc0) it.next(), et6Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.a + ")";
    }
}
