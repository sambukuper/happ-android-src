package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wq6 implements xr4, tq6 {
    public final et a;
    public final o50 b;

    public wq6(et etVar, o50 o50Var) {
        this.a = etVar;
        this.b = o50Var;
    }

    @Override // defpackage.tq6
    public final void a(int i, zr4 zr4Var, int[] iArr, int[] iArr2) {
        this.a.d(zr4Var, i, iArr, zr4Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.tq6
    public final long b(int i, int i2, int i3, boolean z) {
        return !z ? s31.a(i, i2, 0, i3) : z68.B(i, i2, 0, i3);
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        return vr3.O(this, q31.j(j), q31.i(j), q31.h(j), q31.g(j), zr4Var.x0(this.a.a()), zr4Var, list, new eo5[list.size()], list.size());
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
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
                int iMin2 = Math.min(tr4Var.m(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tr4Var.a(iMin2));
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
                iMax = Math.max(iMax, tr4Var2.a(iRound != Integer.MAX_VALUE ? Math.round(iRound * fX2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.tq6
    public final yr4 e(eo5[] eo5VarArr, zr4 zr4Var, int[] iArr, int i, int i2) {
        return zr4Var.g0(i, i2, e02.X, new k8(eo5VarArr, this, i2, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq6)) {
            return false;
        }
        wq6 wq6Var = (wq6) obj;
        return this.a.equals(wq6Var.a) && dh3.f(this.b, wq6Var.b);
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
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
            int iK = tr4Var.k(i);
            if (fX == 0.0f) {
                i2 += iK;
            } else if (fX > 0.0f) {
                f += fX;
                iMax = Math.max(iMax, Math.round(iK / fX));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
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
                int iMin2 = Math.min(tr4Var.m(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tr4Var.K(iMin2));
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
                iMax = Math.max(iMax, tr4Var2.K(iRound != Integer.MAX_VALUE ? Math.round(iRound * fX2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.tq6
    public final int h(eo5 eo5Var) {
        return eo5Var.Y;
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            tr4 tr4Var = (tr4) list.get(i3);
            float fX = dh3.x(dh3.w(tr4Var));
            int iM = tr4Var.m(i);
            if (fX == 0.0f) {
                i2 += iM;
            } else if (fX > 0.0f) {
                f += fX;
                iMax = Math.max(iMax, Math.round(iM / fX));
            }
        }
        return ((list.size() - 1) * iX0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.tq6
    public final int j(eo5 eo5Var) {
        return eo5Var.X;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
