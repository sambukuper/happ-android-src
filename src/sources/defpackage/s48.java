package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s48 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y48 Y;

    public /* synthetic */ s48(y48 y48Var, byte b) {
        this.X = b;
        this.Y = y48Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        byte b2 = 1;
        s88 s88Var = s88.Z;
        q51 q51Var = null;
        dn8 dn8Var = dn8.a;
        y48 y48Var = this.Y;
        switch (b) {
            case 0:
                w51.G(y48Var.M0(), null, null, new v48(y48Var, q51Var, b2), 3);
                return Boolean.TRUE;
            case 1:
                y48Var.F0 = (t09) hi5.W(y48Var, y01.u);
                y48Var.u0.h = y48Var.e1();
                if (y48Var.e1() && y48Var.G0 == null) {
                    y48Var.G0 = w51.G(y48Var.M0(), null, null, new v48(y48Var, q51Var, (byte) 4), 3);
                } else if (!y48Var.e1()) {
                    og7 og7Var = y48Var.G0;
                    if (og7Var != null) {
                        og7Var.m(null);
                    }
                    y48Var.G0 = null;
                }
                return dn8Var;
            case 2:
                yn0.W(y48Var);
                return dn8Var;
            case 3:
                yn0.W(y48Var);
                return dn8Var;
            case 4:
                pu.w(y48Var);
                return null;
            case 5:
                pu.w(y48Var);
                return q48.a;
            case 6:
                w51.G(y48Var.M0(), null, null, new v48(y48Var, q51Var, (byte) 2), 3);
                return Boolean.TRUE;
            case 7:
                return y48Var.s0.a.c().Z.toString();
            case 8:
                if (y48Var.e1()) {
                    ((ai1) y48Var.f1()).a();
                } else {
                    ci2 ci2Var = y48Var.B0;
                    if (ci2Var.p0) {
                        ai2.h1(ci2Var.x0);
                    }
                }
                return Boolean.TRUE;
            case 9:
                if (!y48Var.e1()) {
                    ci2 ci2Var2 = y48Var.B0;
                    if (ci2Var2.p0) {
                        ai2.h1(ci2Var2.x0);
                    }
                }
                y48Var.u0.y(s88Var);
                return Boolean.TRUE;
            case 10:
                w51.G(y48Var.M0(), null, null, new v48(y48Var, q51Var, (byte) 0), 3);
                return Boolean.TRUE;
            case 11:
                if (y48Var.J0 != null) {
                    ((ai1) y48Var.f1()).a();
                } else {
                    y48Var.g1(true);
                }
                return dn8Var;
            default:
                y48Var.u0.y(s88Var);
                return dn8Var;
        }
    }
}
