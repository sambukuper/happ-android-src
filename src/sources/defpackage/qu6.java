package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qu6 extends s51 implements ze2 {
    public final ze2 f0;
    public final s61 g0;
    public final int h0;
    public s61 i0;
    public q51 j0;

    public qu6(ze2 ze2Var, s61 s61Var) {
        super(wx0.Z, b02.X);
        this.f0 = ze2Var;
        this.g0 = s61Var;
        this.h0 = ((Number) s61Var.U(new nw2((byte) 28), 0)).intValue();
    }

    @Override // defpackage.r10, defpackage.d71
    public final d71 c() {
        q51 q51Var = this.j0;
        if (q51Var instanceof d71) {
            return (d71) q51Var;
        }
        return null;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        try {
            Object objU = u(q51Var, obj);
            return objU == c71.X ? objU : dn8.a;
        } catch (Throwable th) {
            this.i0 = new jt1(q51Var.w(), th);
            throw th;
        }
    }

    @Override // defpackage.r10
    public final StackTraceElement p() {
        return null;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        Throwable thA = sj6.a(obj);
        if (thA != null) {
            this.i0 = new jt1(w(), thA);
        }
        q51 q51Var = this.j0;
        if (q51Var != null) {
            q51Var.f(obj);
        }
        return c71.X;
    }

    public final Object u(q51 q51Var, Object obj) {
        s61 s61VarW = q51Var.w();
        u70.I(s61VarW);
        s61 s61Var = this.i0;
        if (s61Var != s61VarW) {
            if (s61Var instanceof jt1) {
                throw new IllegalStateException(gm7.N("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((jt1) s61Var).Y + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) s61VarW.U(new b1(this, (byte) 18), 0)).intValue() != this.h0) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.g0 + ",\n\t\tbut emission happened in " + s61VarW + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.i0 = s61VarW;
        }
        this.j0 = q51Var;
        sn2 sn2Var = su6.a;
        ze2 ze2Var = this.f0;
        ze2Var.getClass();
        Object objX = sn2Var.x(ze2Var, obj, this);
        if (!dh3.f(objX, c71.X)) {
            this.j0 = null;
        }
        return objX;
    }

    @Override // defpackage.s51, defpackage.q51
    public final s61 w() {
        s61 s61Var = this.i0;
        return s61Var == null ? b02.X : s61Var;
    }
}
