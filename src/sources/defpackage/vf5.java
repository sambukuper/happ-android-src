package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vf5 implements wf5 {
    public final ArrayList a;

    public vf5(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.wf5
    public final boolean a(fk2 fk2Var) {
        fk2Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (dh3.f(((uf5) ((tf5) it.next())).i0, fk2Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wf5
    public final void b(fk2 fk2Var, ArrayList arrayList) {
        fk2Var.getClass();
        for (Object obj : this.a) {
            if (dh3.f(((uf5) ((tf5) obj)).i0, fk2Var)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.wf5
    public final Collection t(fk2 fk2Var, gn2 gn2Var) {
        fk2Var.getClass();
        return w27.n0(new la2(w27.l0(new hu(this.a, (byte) 1), cd5.g0), true, new e01(fk2Var, (byte) 1)));
    }
}
