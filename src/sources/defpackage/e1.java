package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends rm3 implements q51, b71 {
    public final s61 f0;

    public e1(s61 s61Var, boolean z) {
        super(z);
        P((bm3) s61Var.H0(oy1.E0));
        this.f0 = s61Var.B0(this);
    }

    @Override // defpackage.rm3
    public final void O(yx0 yx0Var) {
        vr3.F(this.f0, yx0Var);
    }

    @Override // defpackage.rm3
    public String X() {
        return super.X();
    }

    @Override // defpackage.rm3
    public final void d0(Object obj) {
        if (!(obj instanceof xx0)) {
            m0(obj);
        } else {
            xx0 xx0Var = (xx0) obj;
            l0(xx0Var.a, iu.a.getIntVolatile(xx0Var, xx0.b) == 1);
        }
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        Throwable thA = sj6.a(obj);
        if (thA != null) {
            obj = new xx0(thA, false);
        }
        Object objW = W(obj);
        if (objW == sm3.b) {
            return;
        }
        e(objW);
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        return this.f0;
    }

    public final void n0(e71 e71Var, e1 e1Var, rn2 rn2Var) {
        Object objK;
        int iOrdinal = e71Var.ordinal();
        dn8 dn8Var = dn8.a;
        if (iOrdinal == 0) {
            try {
                op1.a(mb6.H(mb6.w(e1Var, this, rn2Var)), dn8Var);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof mp1) {
                    th = ((mp1) th).X;
                }
                f(new rj6(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                rn2Var.getClass();
                mb6.H(mb6.w(e1Var, this, rn2Var)).f(dn8Var);
                return;
            }
            if (iOrdinal != 3) {
                b61.c();
                return;
            }
            try {
                s61 s61Var = this.f0;
                Object objC = g98.c(s61Var, null);
                try {
                    if (rn2Var instanceof r10) {
                        ci8.i(2, rn2Var);
                        objK = rn2Var.K(e1Var, this);
                    } else {
                        objK = mb6.k0(rn2Var, e1Var, this);
                    }
                    g98.a(s61Var, objC);
                    if (objK != c71.X) {
                        f(objK);
                    }
                } catch (Throwable th2) {
                    g98.a(s61Var, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof mp1) {
                    th = ((mp1) th).X;
                }
                f(new rj6(th));
            }
        }
    }

    @Override // defpackage.rm3
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.q51
    public final s61 w() {
        return this.f0;
    }

    public void m0(Object obj) {
    }

    public void l0(Throwable th, boolean z) {
    }
}
