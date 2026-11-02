package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sw0 implements gn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ sw0(ai2 ai2Var, ai2 ai2Var2, s86 s86Var, int i, sn snVar) {
        this.Z = ai2Var;
        this.f0 = ai2Var2;
        this.g0 = s86Var;
        this.Y = i;
        this.h0 = snVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        int iA;
        byte b = this.X;
        Object obj2 = this.h0;
        int i = this.Y;
        Object obj3 = this.g0;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        switch (b) {
            case 0:
                eo5[] eo5VarArr = (eo5[]) obj5;
                tw0 tw0Var = (tw0) obj4;
                zr4 zr4Var = (zr4) obj3;
                int[] iArr = (int[]) obj2;
                do5 do5Var = (do5) obj;
                int length = eo5VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    eo5 eo5Var = eo5VarArr[i2];
                    int i4 = i3 + 1;
                    eo5Var.getClass();
                    Object objW = eo5Var.w();
                    uq6 uq6Var = objW instanceof uq6 ? (uq6) objW : null;
                    z24 layoutDirection = zr4Var.getLayoutDirection();
                    p71 p71Var = uq6Var != null ? uq6Var.c : null;
                    if (p71Var != null) {
                        iA = p71Var.a.a(eo5Var.X, i, layoutDirection);
                    } else {
                        iA = tw0Var.b.a(eo5Var.X, i, layoutDirection);
                    }
                    do5.f(do5Var, eo5Var, iA, iArr[i3]);
                    i2++;
                    i3 = i4;
                }
                return dn8.a;
            default:
                ai2 ai2Var = (ai2) obj4;
                s86 s86Var = (s86) obj3;
                sn snVar = (sn) obj2;
                k50 k50Var = (k50) obj;
                if (((ai2) obj5) != ((gh2) yn0.a0(ai2Var).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zN = gs8.n(i, snVar, ai2Var, s86Var);
                Boolean boolValueOf = Boolean.valueOf(zN);
                if (zN || !k50Var.a()) {
                    return boolValueOf;
                }
                return null;
        }
    }

    public /* synthetic */ sw0(eo5[] eo5VarArr, tw0 tw0Var, int i, zr4 zr4Var, int[] iArr) {
        this.Z = eo5VarArr;
        this.f0 = tw0Var;
        this.Y = i;
        this.g0 = zr4Var;
        this.h0 = iArr;
    }
}
