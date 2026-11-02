package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qp1 extends x18 {
    public int Z;

    public qp1(int i) {
        super(0L, false);
        this.Z = i;
    }

    public abstract q51 d();

    public Throwable e(Object obj) {
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        if (xx0Var != null) {
            return xx0Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        vr3.F(d().w(), new i71("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            q51 q51VarD = d();
            q51VarD.getClass();
            np1 np1Var = (np1) q51VarD;
            s51 s51Var = np1Var.g0;
            Object obj = np1Var.i0;
            s61 s61VarW = s51Var.w();
            Object objC = g98.c(s61VarW, obj);
            bm3 bm3Var = null;
            am8 am8VarT = objC != g98.a ? ch3.T(s51Var, s61VarW, objC) : null;
            try {
                s61 s61VarW2 = s51Var.w();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i = this.Z;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        bm3Var = (bm3) s61VarW2.H0(oy1.E0);
                    }
                }
                if (bm3Var != null && !bm3Var.k()) {
                    CancellationException cancellationExceptionR = bm3Var.R();
                    b(cancellationExceptionR);
                    s51Var.f(w39.t(cancellationExceptionR));
                } else if (thE != null) {
                    s51Var.f(new rj6(thE));
                } else {
                    s51Var.f(g(objI));
                }
            } finally {
                if (am8VarT == null || am8VarT.p0()) {
                    g98.a(s61VarW, objC);
                }
            }
        } catch (mp1 e) {
            vr3.F(d().w(), e.X);
        } catch (Throwable th) {
            h(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
