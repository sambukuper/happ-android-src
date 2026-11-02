package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb4 implements xr4 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ cb4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        int i;
        Float fValueOf;
        int iMax;
        int iMax2;
        int i2;
        int i3;
        int iO;
        byte b = this.a;
        e02 e02Var = e02.X;
        switch (b) {
            case 0:
                return zr4Var.g0(q31.h(j), q31.g(j), e02Var, new zw2(list, this, (byte) 11));
            default:
                wb7 wb7Var = (wb7) this.b;
                byte b2 = wb7Var.X;
                float[] fArr = wb7Var.h0;
                sd5 sd5Var = wb7Var.n0;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    tr4 tr4Var = (tr4) list.get(i4);
                    if (x97.z(tr4Var) == kb7.X) {
                        final eo5 eo5VarO = tr4Var.o(j);
                        int size2 = list.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            tr4 tr4Var2 = (tr4) list.get(i5);
                            if (x97.z(tr4Var2) == kb7.Y) {
                                int i6 = 1;
                                sd5 sd5Var2 = sd5.X;
                                eo5 eo5VarO2 = sd5Var == sd5Var2 ? tr4Var2.o(q31.a(s31.j(j, 0, -eo5VarO.Y, 1), 0, 0, 0, 0, 14)) : tr4Var2.o(q31.a(s31.j(j, -eo5VarO.X, 0, 2), 0, 0, 0, 0, 11));
                                final ca6 ca6Var = new ca6();
                                float fB = wb7Var.b();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    fValueOf = null;
                                    i = 0;
                                } else {
                                    i = 0;
                                    fValueOf = Float.valueOf(fArr[0]);
                                }
                                if (!dh3.e(fB, fValueOf) && !dh3.e(fB, eu.A0(fArr))) {
                                    i6 = i;
                                }
                                int iN = eo5VarO2.N(vb7.f);
                                if (iN != Integer.MIN_VALUE) {
                                    i = iN;
                                }
                                if (sd5Var == sd5Var2) {
                                    iMax = Math.max(eo5VarO2.X, eo5VarO.X);
                                    int i7 = eo5VarO.Y;
                                    int i8 = eo5VarO2.Y;
                                    iMax2 = i7 + i8;
                                    i2 = (iMax - eo5VarO2.X) / 2;
                                    i3 = i7 / 2;
                                    iO = (iMax - eo5VarO.X) / 2;
                                    ca6Var.X = (b2 <= 0 || i6 != 0) ? nr4.O(i8 * fB) : nr4.O((i8 - (i * 2)) * fB) + i;
                                } else {
                                    iMax = eo5VarO.X + eo5VarO2.X;
                                    iMax2 = Math.max(eo5VarO2.Y, eo5VarO.Y);
                                    i2 = eo5VarO.X / 2;
                                    i3 = (iMax2 - eo5VarO2.Y) / 2;
                                    iO = (b2 <= 0 || i6 != 0) ? nr4.O(eo5VarO2.X * fB) : nr4.O((eo5VarO2.X - (i * 2)) * fB) + i;
                                    ca6Var.X = (iMax2 - eo5VarO.Y) / 2;
                                }
                                final int i9 = i3;
                                final int i10 = i2;
                                final int i11 = iO;
                                wb7Var.i0.m(iMax);
                                wb7Var.j0.m(iMax2);
                                final eo5 eo5Var = eo5VarO2;
                                return zr4Var.g0(iMax, iMax2, e02Var, new gn2() { // from class: tb7
                                    @Override // defpackage.gn2
                                    public final Object B(Object obj) {
                                        do5 do5Var = (do5) obj;
                                        do5.h(do5Var, eo5Var, i10, i9);
                                        do5.h(do5Var, eo5VarO, i11, ca6Var.X);
                                        return dn8.a;
                                    }
                                });
                            }
                        }
                        tb4.b("Collection contains no element matching the predicate.");
                        b61.n();
                        return null;
                    }
                }
                tb4.b("Collection contains no element matching the predicate.");
                b61.n();
                return null;
        }
    }
}
