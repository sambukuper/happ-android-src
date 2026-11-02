package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc8 implements xr4 {
    public final re2 a;
    public final float b;

    public mc8(re2 re2Var, float f) {
        this.a = re2Var;
        this.b = f;
    }

    @Override // defpackage.xr4
    public final yr4 c(final zr4 zr4Var, List list, final long j) {
        int iH;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            tr4 tr4Var = (tr4) list.get(i2);
            if (dh3.f(x97.z(tr4Var), "navigationIcon")) {
                final eo5 eo5VarO = tr4Var.o(q31.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    tr4 tr4Var2 = (tr4) list.get(i3);
                    if (dh3.f(x97.z(tr4Var2), "actionIcons")) {
                        final eo5 eo5VarO2 = tr4Var2.o(q31.a(j, 0, 0, 0, 0, 14));
                        if (q31.h(j) == Integer.MAX_VALUE) {
                            iH = q31.h(j);
                        } else {
                            iH = (q31.h(j) - eo5VarO.X) - eo5VarO2.X;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            tr4 tr4Var3 = (tr4) list.get(i5);
                            if (dh3.f(x97.z(tr4Var3), "title")) {
                                final eo5 eo5VarO3 = tr4Var3.o(q31.a(j, 0, i4, 0, 0, 12));
                                t03 t03Var = u8.b;
                                int iN = eo5VarO3.N(t03Var) != Integer.MIN_VALUE ? eo5VarO3.N(t03Var) : 0;
                                float fInvoke = this.a.invoke();
                                int iO = Float.isNaN(fInvoke) ? 0 : nr4.O(fInvoke);
                                final int iMax = Math.max(zr4Var.x0(this.b), eo5VarO3.Y);
                                if (q31.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iO + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iN;
                                return zr4Var.g0(q31.h(j), i, e02.X, new gn2(i, eo5VarO3, eo5VarO2, j, zr4Var, this, i7, iMax) { // from class: lc8
                                    public final /* synthetic */ int Y;
                                    public final /* synthetic */ eo5 Z;
                                    public final /* synthetic */ eo5 f0;
                                    public final /* synthetic */ long g0;
                                    public final /* synthetic */ zr4 h0;

                                    @Override // defpackage.gn2
                                    public final Object B(Object obj) {
                                        int iH2;
                                        do5 do5Var = (do5) obj;
                                        eo5 eo5Var = this.X;
                                        int i8 = eo5Var.Y;
                                        int i9 = this.Y;
                                        do5.h(do5Var, eo5Var, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.h0.x0(zo.c), eo5Var.X);
                                        eo5 eo5Var2 = this.f0;
                                        int i10 = eo5Var2.X;
                                        eo5 eo5Var3 = this.Z;
                                        int i11 = eo5Var3.X;
                                        long j2 = this.g0;
                                        int iRound = Math.round((1.0f - 1.0f) * ((q31.h(j2) - i11) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (eo5Var3.X + iRound > q31.h(j2) - i10) {
                                                iH2 = (q31.h(j2) - i10) - (eo5Var3.X + iRound);
                                            }
                                            do5.h(do5Var, eo5Var3, iRound, (i9 - eo5Var3.Y) / 2);
                                            do5.h(do5Var, eo5Var2, q31.h(j2) - eo5Var2.X, (i9 - eo5Var2.Y) / 2);
                                            return dn8.a;
                                        }
                                        iH2 = iMax2 - iRound;
                                        iRound += iH2;
                                        do5.h(do5Var, eo5Var3, iRound, (i9 - eo5Var3.Y) / 2);
                                        do5.h(do5Var, eo5Var2, q31.h(j2) - eo5Var2.X, (i9 - eo5Var2.Y) / 2);
                                        return dn8.a;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        tb4.b("Collection contains no element matching the predicate.");
                        b61.n();
                        return null;
                    }
                    i3++;
                    this = this;
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

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        Integer numValueOf;
        int iX0 = i55Var.x0(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iX0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        int size = list.size();
        int iK = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iK += ((tr4) list.get(i2)).k(i);
        }
        return iK;
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        Integer numValueOf;
        int iX0 = i55Var.x0(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((tr4) list.get(0)).K(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((tr4) list.get(i2)).K(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iX0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        int size = list.size();
        int iM = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM += ((tr4) list.get(i2)).m(i);
        }
        return iM;
    }
}
