package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qh7 extends b3 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.b3
    public final boolean a(a3 a3Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ph7.a);
        return true;
    }

    @Override // defpackage.b3
    public final q51[] b(a3 a3Var) {
        this.a.set(null);
        return yn0.a;
    }
}
