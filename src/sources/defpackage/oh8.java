package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oh8 implements gn2 {
    public final /* synthetic */ byte X;
    public final fc8 Y;

    public /* synthetic */ oh8(fc8 fc8Var, byte b) {
        this.X = b;
        this.Y = fc8Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        fc8 fc8Var = this.Y;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                jl1 jl1Var = (jl1) fc8Var.Y;
                qs0 qs0VarL = u70.L((w15) jl1Var.Y, iIntValue);
                boolean z = qs0VarL.c;
                hl1 hl1Var = (hl1) jl1Var.X;
                if (!z) {
                    return oc.n(hl1Var.b, qs0VarL);
                }
                os0 os0Var = hl1Var.t;
                Set set = os0.c;
                return os0Var.a(qs0VarL, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                jl1 jl1Var2 = (jl1) fc8Var.Y;
                qs0 qs0VarL2 = u70.L((w15) jl1Var2.Y, iIntValue2);
                if (qs0VarL2.c) {
                    return null;
                }
                vx4 vx4Var = ((hl1) jl1Var2.X).b;
                vx4Var.getClass();
                ot0 ot0VarN = oc.n(vx4Var, qs0VarL2);
                if (ot0VarN instanceof km1) {
                    return (km1) ot0VarN;
                }
                return null;
            default:
                nz5 nz5Var = (nz5) obj;
                nz5Var.getClass();
                return vr3.R(nz5Var, (ux4) ((jl1) fc8Var.Y).f0);
        }
    }
}
