package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class za5 extends aq7 {
    public final aq7 g0;
    public final cn2 h0;
    public boolean i0;

    public za5(aq7 aq7Var, cn2 cn2Var) {
        this.g0 = aq7Var;
        this.h0 = cn2Var;
    }

    @Override // defpackage.u85
    public final void b() {
        if (this.i0) {
            return;
        }
        this.g0.b();
    }

    @Override // defpackage.aq7
    public final void f(iv5 iv5Var) {
        this.g0.f(iv5Var);
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        if (this.i0) {
            jr6.b(th);
        } else {
            this.i0 = true;
            this.g0.onError(th);
        }
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        try {
            this.g0.onNext(this.h0.a(obj));
        } catch (Throwable th) {
            vr3.c0(th);
            c();
            ma5.a(obj, th);
            onError(th);
        }
    }
}
