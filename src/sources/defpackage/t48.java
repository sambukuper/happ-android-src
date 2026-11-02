package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t48 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y48 Y;

    public /* synthetic */ t48(y48 y48Var, byte b) {
        this.X = b;
        this.Y = y48Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        byte b2 = 1;
        dn8 dn8Var = dn8.a;
        y48 y48Var = this.Y;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = y48Var.w0;
                if (zBooleanValue) {
                    if (((xd3) ((zd3) ((yd3) hi5.W(y48Var, y01.m))).a.getValue()).a != 1) {
                        y48Var.u0.w(false);
                    }
                    if (z) {
                        y48Var.g1(false);
                    }
                } else {
                    y48Var.c1();
                    kd8 kd8Var = y48Var.s0;
                    y68 y68Var = kd8Var.a;
                    de3 de3Var = kd8Var.b;
                    y68Var.b.a().A();
                    g48 g48Var = y68Var.b;
                    g48Var.f(null);
                    kd8Var.l(g48Var);
                    y68Var.b(de3Var, true, e58.X);
                    y68Var.f(true);
                    y68Var.e(y68Var.b.g0);
                    y48Var.s0.a();
                }
                ch3.N(y48Var, new s48(y48Var, b2));
                return dn8Var;
            case 1:
                pu.w(y48Var);
                return dn8Var;
            case 2:
                qt1 qt1Var = new qt1();
                y48Var.z0.b(qt1Var);
                y48Var.D0 = qt1Var;
                pu.w(y48Var);
                return dn8Var;
            case 3:
                y78 y78Var = y48Var.t0;
                long jP = ((z85) obj).a;
                y24 y24VarB = y78Var.b();
                if (y24VarB != null && y24VarB.g()) {
                    jP = y24VarB.p(jP);
                }
                int iD = y48Var.t0.d(jP, true);
                if (iD >= 0) {
                    y48Var.s0.j(ct7.c(iD, iD));
                }
                y48Var.u0.B(ev2.X, jP);
                return dn8Var;
            case 4:
                y48Var.d1();
                y48Var.u0.b();
                pu.w(y48Var);
                return dn8Var;
            case 5:
                y48Var.d1();
                return dn8Var;
            case 6:
                List list = (List) obj;
                x78 x78VarC = y48Var.t0.c();
                return Boolean.valueOf(x78VarC != null ? list.add(x78VarC) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                y48Var.u0.k.setValue(bool);
                return dn8Var;
        }
    }
}
