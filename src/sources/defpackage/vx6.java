package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vx6 extends jx4 implements g34, w07 {
    public ay6 q0;
    public boolean r0;

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!this.r0) {
            i = Integer.MAX_VALUE;
        }
        return tr4Var.a(i);
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        os4.j(j, this.r0 ? sd5.X : sd5.Y);
        eo5 eo5VarO = tr4Var.o(q31.a(j, 0, this.r0 ? q31.h(j) : Integer.MAX_VALUE, 0, this.r0 ? Integer.MAX_VALUE : q31.g(j), 5));
        int i = eo5VarO.X;
        int iH = q31.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = eo5VarO.Y;
        int iG = q31.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = eo5VarO.Y - i2;
        int i4 = eo5VarO.X - i;
        if (!this.r0) {
            i3 = i4;
        }
        this.q0.a(i3);
        this.q0.Y.m(this.r0 ? i2 : i);
        this.q0.Z.m(this.r0 ? eo5VarO.Y : eo5VarO.X);
        this.q0.f0.setValue(Boolean.FALSE);
        return zr4Var.g0(i, i2, e02.X, new ux2((byte) 3, i3, this, eo5VarO));
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        d17.f(f17Var);
        final byte b = 0;
        final byte b2 = 1;
        jx6 jx6Var = new jx6(new dn2(this) { // from class: ux6
            public final /* synthetic */ vx6 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                int iL;
                byte b3 = b;
                vx6 vx6Var = this.Y;
                switch (b3) {
                    case 0:
                        iL = vx6Var.q0.X.l();
                        break;
                    default:
                        iL = vx6Var.q0.h0.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        }, new dn2(this) { // from class: ux6
            public final /* synthetic */ vx6 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                int iL;
                byte b3 = b2;
                vx6 vx6Var = this.Y;
                switch (b3) {
                    case 0:
                        iL = vx6Var.q0.X.l();
                        break;
                    default:
                        iL = vx6Var.q0.h0.l();
                        break;
                }
                return Float.valueOf(iL);
            }
        });
        if (this.r0) {
            e17 e17Var = c17.w;
            nw3 nw3Var = d17.a[13];
            e17Var.getClass();
            f17Var.a(e17Var, jx6Var);
            return;
        }
        e17 e17Var2 = c17.v;
        nw3 nw3Var2 = d17.a[12];
        e17Var2.getClass();
        f17Var.a(e17Var2, jx6Var);
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (this.r0) {
            i = Integer.MAX_VALUE;
        }
        return tr4Var.m(i);
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (this.r0) {
            i = Integer.MAX_VALUE;
        }
        return tr4Var.k(i);
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!this.r0) {
            i = Integer.MAX_VALUE;
        }
        return tr4Var.K(i);
    }
}
