package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 implements dn2 {
    public final /* synthetic */ byte X;
    public final qj1 Y;

    public /* synthetic */ pj1(qj1 qj1Var, byte b) {
        this.X = b;
        this.Y = qj1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        qj1 qj1Var = this.Y;
        switch (b) {
            case 0:
                return ms8.d(qj1Var.K());
            default:
                zg5 zg5VarK = qj1Var.K();
                ej1 ej1Var = qj1Var.X;
                if (!(zg5VarK instanceof i44) || !dh3.f(ms8.h(ej1Var), zg5VarK) || (!ej1Var.X.c() && ej1Var.V().r() != 2)) {
                    return (Type) ej1Var.r().a().get(qj1Var.Y);
                }
                ov3 ov3VarD = ej1Var.D();
                ev3 ev3Var = ov3VarD instanceof ev3 ? (ev3) ov3VarD : null;
                if (ev3Var != null) {
                    return zc1.M(ev3Var);
                }
                xw3.j(zg5VarK, "Cannot determine receiver Java type of inherited declaration: ");
                return null;
        }
    }
}
