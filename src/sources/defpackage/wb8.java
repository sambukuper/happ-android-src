package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wb8 implements x67 {
    public final y05 a;
    public final x67 b;
    public final x67 c;
    public final lf d = nf.a();
    public final lf e = nf.a();
    public final lf f = nf.a();

    public wb8(y05 y05Var, x67 x67Var, x67 x67Var2) {
        this.a = y05Var;
        this.b = x67Var;
        this.c = x67Var2;
    }

    @Override // defpackage.x67
    public final mb6 a(long j, z24 z24Var, fi1 fi1Var) {
        lf lfVar = this.d;
        lfVar.g();
        lf lfVar2 = this.e;
        lfVar2.g();
        lf lfVar3 = this.f;
        lfVar3.g();
        mb6 mb6VarA = this.b.a(j, z24Var, fi1Var);
        mb6 mb6VarA2 = this.c.a(j, z24Var, fi1Var);
        if (mb6VarA instanceof zd5) {
            lf.a(lfVar, ((zd5) mb6VarA).j0);
        } else if (mb6VarA instanceof be5) {
            lf.c(lfVar, ((be5) mb6VarA).j0);
        } else {
            if (!(mb6VarA instanceof ae5)) {
                b61.c();
                return null;
            }
            lf.b(lfVar, ((ae5) mb6VarA).j0);
        }
        if (mb6VarA2 instanceof zd5) {
            lf.a(lfVar3, ((zd5) mb6VarA2).j0);
        } else if (mb6VarA2 instanceof be5) {
            lf.c(lfVar3, ((be5) mb6VarA2).j0);
        } else {
            if (!(mb6VarA2 instanceof ae5)) {
                b61.c();
                return null;
            }
            lf.b(lfVar3, ((ae5) mb6VarA2).j0);
        }
        float[] fArr = ((or4) this.a.getValue()).a;
        Matrix matrix = lfVar3.d;
        if (matrix == null) {
            matrix = new Matrix();
            lfVar3.d = matrix;
        }
        nr4.R(matrix, fArr);
        Path path = lfVar3.a;
        Matrix matrix2 = lfVar3.d;
        matrix2.getClass();
        path.transform(matrix2);
        lfVar2.f(lfVar, lfVar3, 2);
        return new zd5(lfVar2);
    }
}
