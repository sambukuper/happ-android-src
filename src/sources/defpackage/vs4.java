package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vs4 implements dn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;
    public final int f0;

    public /* synthetic */ vs4(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = i;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        List listY0;
        byte b = this.X;
        d02 d02Var = d02.X;
        int i = this.f0;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ys4 ys4Var = (ys4) obj2;
                d2 d2Var = (d2) obj;
                jl1 jl1Var = ys4Var.a;
                wb4 wb4VarA = ys4Var.a((ed1) jl1Var.Z);
                listY0 = wb4VarA != null ? wv0.Y0(((hl1) jl1Var.X).e.a(wb4VarA, d2Var, i)) : null;
                return listY0 == null ? d02Var : listY0;
            case 1:
                ys4 ys4Var2 = (ys4) obj2;
                d2 d2Var2 = (d2) obj;
                jl1 jl1Var2 = ys4Var2.a;
                wb4 wb4VarA2 = ys4Var2.a((ed1) jl1Var2.Z);
                listY0 = wb4VarA2 != null ? ((hl1) jl1Var2.X).e.e(wb4VarA2, d2Var2, i) : null;
                return listY0 == null ? d02Var : listY0;
            default:
                w39 w39Var = (w39) obj2;
                e3 e3Var = (e3) ((ArrayList) obj).get(i);
                w39Var.getClass();
                km kmVarF = ((e3Var.c == null) || (w39Var.F() == km.TYPE_PARAMETER_BOUNDS)) ? w39Var.F() : km.TYPE_USE;
                rl3 rl3Var = e3Var.b;
                if (rl3Var != null) {
                    return (bk3) rl3Var.a.get(kmVarF);
                }
                return null;
        }
    }
}
