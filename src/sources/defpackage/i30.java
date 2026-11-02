package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i30 implements q38 {
    public final zy0 a;
    public final m15 b = new m15();
    public final rh5 c = z51.H(null);

    public i30(zy0 zy0Var) {
        this.a = zy0Var;
    }

    @Override // defpackage.q38
    public final Object a(h38 h38Var, uy7 uy7Var) {
        q51 q51Var = null;
        Object objN = gv3.n(new kg3(f15.X, this.b, new da(this, new h30(h38Var), q51Var, (byte) 3), q51Var, (byte) 1), uy7Var);
        return objN == c71.X ? objN : dn8.a;
    }

    public final void b(final dn2 dn2Var, lp2 lp2Var, final int i) {
        final dn2 dn2Var2;
        lp2 lp2Var2;
        lp2Var.X(723898654);
        int i2 = (lp2Var.f(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            h30 h30Var = (h30) this.c.getValue();
            if (h30Var == null) {
                j86 j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2(this, dn2Var, i, b) { // from class: g30
                        public final /* synthetic */ byte X;
                        public final /* synthetic */ i30 Y;
                        public final /* synthetic */ dn2 Z;

                        {
                            this.X = b;
                            this.Y = this;
                        }

                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            byte b3 = this.X;
                            dn8 dn8Var = dn8.a;
                            dn2 dn2Var3 = this.Z;
                            i30 i30Var = this.Y;
                            lp2 lp2Var3 = (lp2) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    i30Var.b(dn2Var3, lp2Var3, w79.P(7));
                                    break;
                                default:
                                    i30Var.b(dn2Var3, lp2Var3, w79.P(7));
                                    break;
                            }
                            return dn8Var;
                        }
                    };
                    return;
                }
                return;
            }
            dn2Var2 = dn2Var;
            lp2Var2 = lp2Var;
            this.a.N(h30Var, h30Var.a, dn2Var2, lp2Var2, 384);
        } else {
            dn2Var2 = dn2Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR2 = lp2Var2.r();
        if (j86VarR2 != null) {
            j86VarR2.d = new rn2(this, dn2Var2, i, b2) { // from class: g30
                public final /* synthetic */ byte X;
                public final /* synthetic */ i30 Y;
                public final /* synthetic */ dn2 Z;

                {
                    this.X = b2;
                    this.Y = this;
                }

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    byte b3 = this.X;
                    dn8 dn8Var = dn8.a;
                    dn2 dn2Var3 = this.Z;
                    i30 i30Var = this.Y;
                    lp2 lp2Var3 = (lp2) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            i30Var.b(dn2Var3, lp2Var3, w79.P(7));
                            break;
                        default:
                            i30Var.b(dn2Var3, lp2Var3, w79.P(7));
                            break;
                    }
                    return dn8Var;
                }
            };
        }
    }
}
