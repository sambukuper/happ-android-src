package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cy6 extends oh1 implements s01, w85 {
    public my6 A0;
    public nh1 B0;
    public ud C0;
    public td D0;
    public boolean E0;
    public ny6 s0;
    public sd5 t0;
    public boolean u0;
    public he2 v0;
    public xz4 w0;
    public w80 x0;
    public boolean y0;
    public td z0;

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        this.E0 = c1();
        b1();
        if (this.A0 == null) {
            ny6 ny6Var = this.s0;
            td tdVar = this.y0 ? this.D0 : this.z0;
            my6 my6Var = new my6(tdVar, this.x0, this.v0, this.w0, this.t0, ny6Var, this.u0, this.E0);
            Y0(my6Var);
            this.A0 = my6Var;
        }
    }

    @Override // defpackage.jx4
    public final void R0() {
        nh1 nh1Var = this.B0;
        if (nh1Var != null) {
            Z0(nh1Var);
        }
    }

    @Override // defpackage.nh1
    public final void V() {
        boolean zC1 = c1();
        if (this.E0 != zC1) {
            this.E0 = zC1;
            ny6 ny6Var = this.s0;
            sd5 sd5Var = this.t0;
            boolean z = this.y0;
            td tdVar = z ? this.D0 : this.z0;
            d1(tdVar, this.x0, this.v0, this.w0, sd5Var, ny6Var, z, this.u0);
        }
    }

    public final void b1() {
        nh1 nh1Var = this.B0;
        if (nh1Var != null) {
            if (((jx4) nh1Var).X.p0) {
                return;
            }
            Y0(nh1Var);
            return;
        }
        if (this.y0) {
            ch3.N(this, new hr5(this, (byte) 15));
        }
        td tdVar = this.y0 ? this.D0 : this.z0;
        if (tdVar != null) {
            oh1 oh1Var = tdVar.i;
            if (oh1Var.X.p0) {
                return;
            }
            Y0(oh1Var);
            this.B0 = oh1Var;
        }
    }

    public final boolean c1() {
        return (this.p0 ? yn0.Z(this).B0 : z24.X) != z24.Y || this.t0 == sd5.X;
    }

    public final void d1(td tdVar, w80 w80Var, he2 he2Var, xz4 xz4Var, sd5 sd5Var, ny6 ny6Var, boolean z, boolean z2) {
        boolean z3;
        this.s0 = ny6Var;
        this.t0 = sd5Var;
        boolean z4 = true;
        if (this.y0 != z) {
            this.y0 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (dh3.f(this.z0, tdVar)) {
            z4 = false;
        } else {
            this.z0 = tdVar;
        }
        if (z3 || (z4 && !z)) {
            nh1 nh1Var = this.B0;
            if (nh1Var != null) {
                Z0(nh1Var);
            }
            this.B0 = null;
            b1();
        }
        this.u0 = z2;
        this.v0 = he2Var;
        this.w0 = xz4Var;
        this.x0 = w80Var;
        boolean zC1 = c1();
        this.E0 = zC1;
        my6 my6Var = this.A0;
        if (my6Var != null) {
            my6Var.t1(this.y0 ? this.D0 : this.z0, w80Var, he2Var, xz4Var, sd5Var, ny6Var, z2, zC1);
        }
    }

    @Override // defpackage.w85
    public final void q0() {
        ud udVar = (ud) hi5.W(this, kf5.a);
        if (dh3.f(udVar, this.C0)) {
            return;
        }
        this.C0 = udVar;
        this.D0 = null;
        nh1 nh1Var = this.B0;
        if (nh1Var != null) {
            Z0(nh1Var);
        }
        this.B0 = null;
        b1();
        my6 my6Var = this.A0;
        if (my6Var != null) {
            ny6 ny6Var = this.s0;
            sd5 sd5Var = this.t0;
            td tdVar = this.y0 ? this.D0 : this.z0;
            my6Var.t1(tdVar, this.x0, this.v0, this.w0, sd5Var, ny6Var, this.u0, this.E0);
        }
    }
}
