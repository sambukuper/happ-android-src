package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j13 extends jx4 implements kq5 {
    public xz4 q0;
    public d13 r0;

    @Override // defpackage.kq5
    public final void I() {
        a1();
    }

    @Override // defpackage.jx4
    public final void R0() {
        a1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y0(s51 s51Var) throws Throwable {
        g13 g13Var;
        d13 d13Var;
        if (s51Var instanceof g13) {
            g13Var = (g13) s51Var;
            int i = g13Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                g13Var.i0 = i - Integer.MIN_VALUE;
            } else {
                g13Var = new g13(this, s51Var);
            }
        } else {
            g13Var = new g13(this, s51Var);
        }
        Object obj = g13Var.g0;
        int i2 = g13Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            if (this.r0 == null) {
                d13 d13Var2 = new d13();
                xz4 xz4Var = this.q0;
                g13Var.f0 = d13Var2;
                g13Var.i0 = 1;
                Object objA = xz4Var.a(d13Var2, g13Var);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
                d13Var = d13Var2;
            }
            return dn8.a;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d13Var = g13Var.f0;
        w39.n0(obj);
        this.r0 = d13Var;
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(s51 s51Var) throws Throwable {
        h13 h13Var;
        if (s51Var instanceof h13) {
            h13Var = (h13) s51Var;
            int i = h13Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                h13Var.h0 = i - Integer.MIN_VALUE;
            } else {
                h13Var = new h13(this, s51Var);
            }
        } else {
            h13Var = new h13(this, s51Var);
        }
        Object obj = h13Var.f0;
        int i2 = h13Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            d13 d13Var = this.r0;
            if (d13Var != null) {
                e13 e13Var = new e13(d13Var);
                xz4 xz4Var = this.q0;
                h13Var.h0 = 1;
                Object objA = xz4Var.a(e13Var, h13Var);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
            }
            return dn8.a;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        this.r0 = null;
        return dn8.a;
    }

    public final void a1() {
        d13 d13Var = this.r0;
        if (d13Var != null) {
            this.q0.b(new e13(d13Var));
            this.r0 = null;
        }
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        if (bq5Var == bq5.Y) {
            int i = aq5Var.f;
            q51 q51Var = null;
            if (i == 4) {
                w51.G(M0(), null, null, new i13(this, q51Var, (byte) 0), 3);
            } else if (i == 5) {
                w51.G(M0(), null, null, new i13(this, q51Var, (byte) 1), 3);
            }
        }
    }
}
