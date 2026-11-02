package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qx5 extends g33 {
    public final sx5[] f;

    public qx5(g33 g33Var, sx5[] sx5VarArr) {
        this.f = sx5VarArr;
    }

    @Override // defpackage.g33
    public final g33 J(Class cls, ar3 ar3Var) {
        sx5[] sx5VarArr = this.f;
        int length = sx5VarArr.length;
        if (length == 8) {
            return this;
        }
        sx5[] sx5VarArr2 = (sx5[]) Arrays.copyOf(sx5VarArr, length + 1);
        sx5VarArr2[length] = new sx5(cls, ar3Var);
        return new qx5(this, sx5VarArr2);
    }

    @Override // defpackage.g33
    public final ar3 R(Class cls) {
        sx5[] sx5VarArr = this.f;
        sx5 sx5Var = sx5VarArr[0];
        if (sx5Var.a == cls) {
            return sx5Var.b;
        }
        sx5 sx5Var2 = sx5VarArr[1];
        if (sx5Var2.a == cls) {
            return sx5Var2.b;
        }
        sx5 sx5Var3 = sx5VarArr[2];
        if (sx5Var3.a == cls) {
            return sx5Var3.b;
        }
        switch (sx5VarArr.length) {
            case 8:
                sx5 sx5Var4 = sx5VarArr[7];
                if (sx5Var4.a == cls) {
                    return sx5Var4.b;
                }
            case 7:
                sx5 sx5Var5 = sx5VarArr[6];
                if (sx5Var5.a == cls) {
                    return sx5Var5.b;
                }
            case 6:
                sx5 sx5Var6 = sx5VarArr[5];
                if (sx5Var6.a == cls) {
                    return sx5Var6.b;
                }
            case 5:
                sx5 sx5Var7 = sx5VarArr[4];
                if (sx5Var7.a == cls) {
                    return sx5Var7.b;
                }
            case 4:
                sx5 sx5Var8 = sx5VarArr[3];
                if (sx5Var8.a == cls) {
                    return sx5Var8.b;
                }
                return null;
            default:
                return null;
        }
    }
}
