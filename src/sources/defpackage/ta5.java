package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta5 extends aq7 {
    public final ua5 g0;
    public long h0;

    public ta5(ua5 ua5Var) {
        this.g0 = ua5Var;
    }

    @Override // defpackage.u85
    public final void b() {
        this.g0.i(this.h0);
    }

    @Override // defpackage.aq7
    public final void f(iv5 iv5Var) {
        this.g0.i0.b(iv5Var);
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        ua5 ua5Var = this.g0;
        AtomicReference atomicReference = ua5Var.l0;
        if (!m42.a(atomicReference, th)) {
            jr6.b(th);
            return;
        }
        Throwable thB = m42.b(atomicReference);
        if (thB != m42.X) {
            ua5Var.g0.onError(thB);
        }
        ua5Var.c();
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        this.h0++;
        this.g0.g0.onNext(obj);
    }
}
