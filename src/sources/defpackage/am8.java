package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class am8 extends fx6 {
    public final ThreadLocal h0;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public am8(q51 q51Var, s61 s61Var) {
        rm0 rm0Var = rm0.Z;
        super(q51Var, s61Var.H0(rm0Var) == null ? s61Var.B0(rm0Var) : s61Var);
        this.h0 = new ThreadLocal();
        if (q51Var.w().H0(pz2.E0) instanceof u61) {
            return;
        }
        Object objC = g98.c(s61Var, null);
        g98.a(s61Var, objC);
        r0(s61Var, objC);
    }

    @Override // defpackage.fx6, defpackage.rm3
    public final void e(Object obj) {
        q0();
        Object objQ = gv3.Q(obj);
        q51 q51Var = this.g0;
        s61 s61VarW = q51Var.w();
        Object objC = g98.c(s61VarW, null);
        am8 am8VarT = objC != g98.a ? ch3.T(q51Var, s61VarW, objC) : null;
        try {
            q51Var.f(objQ);
        } finally {
            if (am8VarT == null || am8VarT.p0()) {
                g98.a(s61VarW, objC);
            }
        }
    }

    @Override // defpackage.fx6
    public final void o0() {
        q0();
    }

    public final boolean p0() {
        boolean z = this.threadLocalIsSet && this.h0.get() == null;
        this.h0.remove();
        return !z;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            qg5 qg5Var = (qg5) this.h0.get();
            if (qg5Var != null) {
                g98.a((s61) qg5Var.X, qg5Var.Y);
            }
            this.h0.remove();
        }
    }

    public final void r0(s61 s61Var, Object obj) {
        this.threadLocalIsSet = true;
        this.h0.set(new qg5(s61Var, obj));
    }
}
