package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ay6 implements ny6 {
    public static final xd6 n0 = new xd6(new ew6((byte) 7), new zx6(0), 6);
    public final oh5 X;
    public float i0;
    public final zi1 l0;
    public final zi1 m0;
    public final oh5 Y = new oh5(0);
    public final oh5 Z = new oh5(0);
    public final rh5 f0 = z51.H(Boolean.FALSE);
    public final xz4 g0 = new xz4();
    public final oh5 h0 = new oh5(Integer.MAX_VALUE);
    public final fu6 j0 = new fu6(new t16((Object) this, (byte) 12));
    public final lr5 k0 = new lr5((Object) this, (byte) 11);

    public ay6(int i) {
        this.X = new oh5(i);
        final byte b = 0;
        this.l0 = rd7.b(new dn2(this) { // from class: yx6
            public final /* synthetic */ ay6 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                ay6 ay6Var = this.Y;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(ay6Var.X.l() < ay6Var.h0.l());
                    default:
                        return Boolean.valueOf(ay6Var.X.l() > 0);
                }
            }
        });
        final byte b2 = 1;
        this.m0 = rd7.b(new dn2(this) { // from class: yx6
            public final /* synthetic */ ay6 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                ay6 ay6Var = this.Y;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(ay6Var.X.l() < ay6Var.h0.l());
                    default:
                        return Boolean.valueOf(ay6Var.X.l() > 0);
                }
            }
        });
    }

    public final void a(int i) {
        oh5 oh5Var = this.X;
        this.h0.m(i);
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            if (oh5Var.l() > i) {
                oh5Var.m(i);
            }
        } finally {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
        }
    }

    @Override // defpackage.ny6
    public final boolean b() {
        return this.j0.b();
    }

    @Override // defpackage.ny6
    public final Object i(f15 f15Var, rn2 rn2Var, q51 q51Var) {
        Object objI = this.j0.i(f15Var, rn2Var, q51Var);
        return objI == c71.X ? objI : dn8.a;
    }

    @Override // defpackage.ny6
    public final boolean j() {
        return ((Boolean) this.m0.getValue()).booleanValue();
    }

    @Override // defpackage.ny6
    public final boolean m() {
        return ((Boolean) this.l0.getValue()).booleanValue();
    }

    @Override // defpackage.ny6
    public final float n(float f) {
        return this.j0.n(f);
    }

    @Override // defpackage.ny6
    public final tx6 o() {
        return this.k0;
    }
}
