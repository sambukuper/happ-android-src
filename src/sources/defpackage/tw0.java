package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tw0 implements xr4, tq6 {
    public final gt a;
    public final n50 b;

    public tw0(gt gtVar, n50 n50Var) {
        this.a = gtVar;
        this.b = n50Var;
    }

    @Override // defpackage.tq6
    public final void a(int i, zr4 zr4Var, int[] iArr, int[] iArr2) {
        this.a.e(i, zr4Var, iArr, iArr2);
    }

    @Override // defpackage.tq6
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? s31.a(0, i3, i, i2) : z68.A(0, i3, i, i2);
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        return vr3.O(this, q31.i(j), q31.j(j), q31.g(j), q31.h(j), zr4Var.x0(this.a.a()), zr4Var, list, new eo5[list.size()], list.size());
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        int iX0 = i55Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            tr4 tr4Var = (tr4) list.get(i3);
            float fX = dh3.x(dh3.w(tr4Var));
            int iA = tr4Var.a(i);
            if (fX == 0.0f) {
                i2 += iA;
            } else if (fX > 0.0f) {
                f += fX;
                iMax = Math.max(iMax, Math.round(iA / fX));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.tq6
    public final yr4 e(eo5[] eo5VarArr, zr4 zr4Var, int[] iArr, int i, int i2) {
        return zr4Var.g0(i2, i, e02.X, new sw0(eo5VarArr, this, i2, zr4Var, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return this.a.equals(tw0Var.a) && this.b.equals(tw0Var.b);
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        int iX0 = i55Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iX0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            tr4 tr4Var = (tr4) list.get(i2);
            float fX = dh3.x(dh3.w(tr4Var));
            if (fX == 0.0f) {
                int iMin2 = Math.min(tr4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tr4Var.k(iMin2));
            } else if (fX > 0.0f) {
                f += fX;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tr4 tr4Var2 = (tr4) list.get(i3);
            float fX2 = dh3.x(dh3.w(tr4Var2));
            if (fX2 > 0.0f) {
                iMax = Math.max(iMax, tr4Var2.k(iRound != Integer.MAX_VALUE ? Math.round(iRound * fX2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        int iX0 = i55Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            tr4 tr4Var = (tr4) list.get(i3);
            float fX = dh3.x(dh3.w(tr4Var));
            int iK = tr4Var.K(i);
            if (fX == 0.0f) {
                i2 += iK;
            } else if (fX > 0.0f) {
                f += fX;
                iMax = Math.max(iMax, Math.round(iK / fX));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.tq6
    public final int h(eo5 eo5Var) {
        return eo5Var.X;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        int iX0 = i55Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iX0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            tr4 tr4Var = (tr4) list.get(i2);
            float fX = dh3.x(dh3.w(tr4Var));
            if (fX == 0.0f) {
                int iMin2 = Math.min(tr4Var.a(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tr4Var.m(iMin2));
            } else if (fX > 0.0f) {
                f += fX;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tr4 tr4Var2 = (tr4) list.get(i3);
            float fX2 = dh3.x(dh3.w(tr4Var2));
            if (fX2 > 0.0f) {
                iMax = Math.max(iMax, tr4Var2.m(iRound != Integer.MAX_VALUE ? Math.round(iRound * fX2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.tq6
    public final int j(eo5 eo5Var) {
        return eo5Var.Y;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
