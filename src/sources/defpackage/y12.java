package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y12 extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ x77 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y12(x77 x77Var, byte b) {
        super(0);
        this.Y = b;
        this.Z = x77Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        x77 x77Var = this.Z;
        switch (b) {
            case 0:
                return x77Var;
            default:
                rh5 rh5Var = x77Var.b;
                Boolean bool = Boolean.FALSE;
                rh5Var.setValue(bool);
                x77Var.c(false);
                d6 d6Var = x77Var.c;
                ((rh5) d6Var.Y).setValue(bool);
                ((rh5) d6Var.h0).setValue(bool);
                ((rh5) d6Var.j0).setValue(bool);
                ((rh5) d6Var.k0).setValue(bool);
                x77Var.e = dw0.f;
                x77Var.f = 1.0f;
                x77Var.g = 1.0f;
                vu8 vu8Var = x77Var.j;
                if (vu8Var != null) {
                    ka1[] ka1VarArr = vu8Var.d;
                    eu.m0(0, ka1VarArr.length, null, ka1VarArr);
                    vu8Var.e = 0;
                }
                x77Var.h = gd8.b;
                x77Var.i = 0L;
                return dn8.a;
        }
    }
}
