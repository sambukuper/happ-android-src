package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t21 implements u27 {
    public final AtomicReference a;

    public t21(u27 u27Var) {
        this.a = new AtomicReference(u27Var);
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        u27 u27Var = (u27) this.a.getAndSet(null);
        if (u27Var != null) {
            return u27Var.iterator();
        }
        bt.i("This sequence can be consumed only once.");
        return null;
    }
}
