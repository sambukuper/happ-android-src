package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yc6 implements b71, vc6 {
    public static final rm0 f0 = new rm0(0);
    public final s61 X;
    public final yc6 Y = this;
    public volatile s61 Z;

    public yc6(s61 s61Var) {
        this.X = s61Var;
    }

    @Override // defpackage.vc6
    public final void a() {
        d();
    }

    @Override // defpackage.vc6
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.Y) {
            try {
                s61 s61Var = this.Z;
                if (s61Var == null) {
                    this.Z = f0;
                } else {
                    u70.x(s61Var, new nj2());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        s61 s61VarB0;
        s61 s61Var = this.Z;
        if (s61Var == null || s61Var == f0) {
            p01 p01Var = (p01) this.X.H0(p01.Y);
            s61 xc6Var = p01Var != null ? new xc6(p01Var, this) : b02.X;
            synchronized (this.Y) {
                try {
                    s61 s61Var2 = this.Z;
                    if (s61Var2 == null) {
                        s61 s61Var3 = this.X;
                        s61VarB0 = s61Var3.B0(new dm3((bm3) s61Var3.H0(oy1.E0))).B0(b02.X).B0(xc6Var);
                    } else if (s61Var2 == f0) {
                        s61 s61Var4 = this.X;
                        dm3 dm3Var = new dm3((bm3) s61Var4.H0(oy1.E0));
                        dm3Var.i(new nj2());
                        s61VarB0 = s61Var4.B0(dm3Var).B0(b02.X).B0(xc6Var);
                    } else {
                        s61VarB0 = s61Var2;
                    }
                    this.Z = s61VarB0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            s61Var = s61VarB0;
        }
        s61Var.getClass();
        return s61Var;
    }

    @Override // defpackage.vc6
    public final void c() {
    }
}
