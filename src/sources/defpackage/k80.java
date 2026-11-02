package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 implements xr4 {
    public final p50 a;
    public final boolean b;

    public k80(p50 p50Var, boolean z) {
        this.a = p50Var;
        this.b = z;
    }

    @Override // defpackage.xr4
    public final yr4 c(final zr4 zr4Var, List list, long j) {
        final eo5 eo5VarO;
        final int iMax;
        final int i;
        boolean zIsEmpty = list.isEmpty();
        e02 e02Var = e02.X;
        if (zIsEmpty) {
            return zr4Var.g0(q31.j(j), q31.i(j), e02Var, new h80((byte) 0));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final tr4 tr4Var = (tr4) list.get(0);
            Object objW = tr4Var.w();
            e80 e80Var = objW instanceof e80 ? (e80) objW : null;
            if (e80Var != null ? e80Var.r0 : false) {
                int iJ = q31.j(j);
                int i2 = q31.i(j);
                int iJ2 = q31.j(j);
                int i3 = q31.i(j);
                if (!((i3 >= 0) & (iJ2 >= 0))) {
                    yc3.a("width and height must be >= 0");
                }
                eo5VarO = tr4Var.o(s31.h(iJ2, iJ2, i3, i3));
                iMax = i2;
                i = iJ;
            } else {
                eo5 eo5VarO2 = tr4Var.o(j2);
                int iMax2 = Math.max(q31.j(j), eo5VarO2.X);
                iMax = Math.max(q31.i(j), eo5VarO2.Y);
                i = iMax2;
                eo5VarO = eo5VarO2;
            }
            return zr4Var.g0(i, iMax, e02Var, new gn2() { // from class: i80
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    g80.d((do5) obj, eo5VarO, tr4Var, zr4Var.getLayoutDirection(), i, iMax, this.a);
                    return dn8.a;
                }
            });
        }
        eo5[] eo5VarArr = new eo5[list.size()];
        ca6 ca6Var = new ca6();
        ca6Var.X = q31.j(j);
        ca6 ca6Var2 = new ca6();
        ca6Var2.X = q31.i(j);
        int size = list.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            tr4 tr4Var2 = (tr4) list.get(i4);
            Object objW2 = tr4Var2.w();
            e80 e80Var2 = objW2 instanceof e80 ? (e80) objW2 : null;
            if (e80Var2 != null ? e80Var2.r0 : false) {
                z = true;
            } else {
                eo5 eo5VarO3 = tr4Var2.o(j2);
                eo5VarArr[i4] = eo5VarO3;
                ca6Var.X = Math.max(ca6Var.X, eo5VarO3.X);
                ca6Var2.X = Math.max(ca6Var2.X, eo5VarO3.Y);
            }
        }
        if (z) {
            int i5 = ca6Var.X;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = ca6Var2.X;
            long jA = s31.a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                tr4 tr4Var3 = (tr4) list.get(i8);
                Object objW3 = tr4Var3.w();
                e80 e80Var3 = objW3 instanceof e80 ? (e80) objW3 : null;
                if (e80Var3 != null ? e80Var3.r0 : false) {
                    eo5VarArr[i8] = tr4Var3.o(jA);
                }
            }
        }
        return zr4Var.g0(ca6Var.X, ca6Var2.X, e02Var, new j80(eo5VarArr, list, zr4Var, ca6Var, ca6Var2, this, (byte) 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return this.a.equals(k80Var.a) && this.b == k80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
