package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class np1 extends qp1 implements d71, q51 {
    public static final /* synthetic */ long j0 = iu.a.objectFieldOffset(np1.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final u61 f0;
    public final s51 g0;
    public Object h0;
    public final Object i0;

    public np1(u61 u61Var, s51 s51Var) {
        super(-1);
        this.f0 = u61Var;
        this.g0 = s51Var;
        this.h0 = op1.a;
        this.i0 = g98.b(s51Var.w());
    }

    @Override // defpackage.d71
    public final d71 c() {
        return this.g0;
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        Throwable thA = sj6.a(obj);
        Object xx0Var = thA == null ? obj : new xx0(thA, false);
        s51 s51Var = this.g0;
        s61 s61VarW = s51Var.w();
        u61 u61Var = this.f0;
        if (op1.c(u61Var, s61VarW)) {
            this.h0 = xx0Var;
            this.Z = 0;
            op1.b(u61Var, s51Var.w(), this);
            return;
        }
        d42 d42VarA = j98.a();
        if (d42VarA.Z >= 4294967296L) {
            this.h0 = xx0Var;
            this.Z = 0;
            d42VarA.e1(this);
            return;
        }
        d42VarA.f1(true);
        try {
            s61 s61VarW2 = s51Var.w();
            Object objC = g98.c(s61VarW2, this.i0);
            try {
                s51Var.f(obj);
                g98.a(s61VarW2, objC);
                while (d42VarA.h1()) {
                }
            } catch (Throwable th) {
                g98.a(s61VarW2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                d42VarA.d1(true);
            }
        }
    }

    @Override // defpackage.qp1
    public final Object i() {
        Object obj = this.h0;
        this.h0 = op1.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f0 + ", " + zc1.n0(this.g0) + ']';
    }

    @Override // defpackage.q51
    public final s61 w() {
        return this.g0.w();
    }

    @Override // defpackage.qp1
    public final q51 d() {
        return this;
    }
}
