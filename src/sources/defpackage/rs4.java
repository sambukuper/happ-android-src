package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rs4 extends yz4 {
    public yu6 l;

    @Override // defpackage.qc4
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            uu6 uu6Var = (uu6) it;
            if (!uu6Var.hasNext()) {
                return;
            }
            qs4 qs4Var = (qs4) ((Map.Entry) uu6Var.next()).getValue();
            qs4Var.a.f(qs4Var);
        }
    }

    @Override // defpackage.qc4
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            uu6 uu6Var = (uu6) it;
            if (!uu6Var.hasNext()) {
                return;
            }
            qs4 qs4Var = (qs4) ((Map.Entry) uu6Var.next()).getValue();
            qs4Var.a.i(qs4Var);
        }
    }
}
