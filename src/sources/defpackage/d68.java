package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d68 implements xr4 {
    public final boolean a;
    public final q58 b;
    public final o58 c;
    public final gg5 d;
    public final float e;

    public d68(boolean z, q58 q58Var, o58 o58Var, gg5 gg5Var, float f) {
        this.a = z;
        this.b = q58Var;
        this.c = o58Var;
        this.d = gg5Var;
        this.e = f;
    }

    public static int e(List list, int i, rn2 rn2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (dh3.f(u15.v((tr4) obj7), "TextField")) {
                int iIntValue = ((Number) rn2Var.K(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (dh3.f(u15.v((tr4) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                tr4 tr4Var = (tr4) obj2;
                int iIntValue2 = tr4Var != null ? ((Number) rn2Var.K(tr4Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (dh3.f(u15.v((tr4) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                tr4 tr4Var2 = (tr4) obj3;
                int iIntValue3 = tr4Var2 != null ? ((Number) rn2Var.K(tr4Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (dh3.f(u15.v((tr4) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                tr4 tr4Var3 = (tr4) obj4;
                int iIntValue4 = tr4Var3 != null ? ((Number) rn2Var.K(tr4Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (dh3.f(u15.v((tr4) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                tr4 tr4Var4 = (tr4) obj5;
                int iIntValue5 = tr4Var4 != null ? ((Number) rn2Var.K(tr4Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (dh3.f(u15.v((tr4) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                tr4 tr4Var5 = (tr4) obj6;
                int iIntValue6 = tr4Var5 != null ? ((Number) rn2Var.K(tr4Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (dh3.f(u15.v((tr4) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                tr4 tr4Var6 = (tr4) obj;
                int i9 = iIntValue4 + iIntValue5;
                return s31.g(Math.max(iIntValue + i9, Math.max((tr4Var6 != null ? ((Number) rn2Var.K(tr4Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, s31.b(0, 0, 0, 0, 15));
            }
        }
        tb4.b("Collection contains no element matching the predicate.");
        b61.n();
        return 0;
    }

    public static final int h(d68 d68Var, int i, int i2, eo5 eo5Var) {
        return d68Var.a ? Math.round(((i - eo5Var.Y) / 2.0f) * 1.0f) : i2;
    }

    public final int a(fi1 fi1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        gg5 gg5Var = this.d;
        int iX0 = fi1Var.x0(gg5Var.a() + gg5Var.d());
        int[] iArr = {i7, i5, i6, w51.I(i2, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return s31.f(Math.max(i3, Math.max(i4, iX0 + (i2 > 0 ? Math.max(fi1Var.x0(this.e * 2.0f), w51.I(0, oy4.a.a(f), i2)) : 0) + i)) + i8, j);
    }

    public final int b(ug3 ug3Var, List list, int i, rn2 rn2Var) {
        Object obj;
        int i2;
        int iIntValue;
        int iQ;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (dh3.f(u15.v((tr4) obj), "Leading")) {
                break;
            }
            i5++;
        }
        tr4 tr4Var = (tr4) obj;
        if (tr4Var != null) {
            i2 = i;
            iQ = u15.Q(i2, tr4Var.m(Integer.MAX_VALUE));
            iIntValue = ((Number) rn2Var.K(tr4Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iQ = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (dh3.f(u15.v((tr4) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        tr4 tr4Var2 = (tr4) obj2;
        if (tr4Var2 != null) {
            iQ = u15.Q(iQ, tr4Var2.m(Integer.MAX_VALUE));
            iIntValue2 = ((Number) rn2Var.K(tr4Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (dh3.f(u15.v((tr4) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (tr4) obj3;
        int iIntValue3 = obj8 != null ? ((Number) rn2Var.K(obj8, Integer.valueOf(iQ))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (dh3.f(u15.v((tr4) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        tr4 tr4Var3 = (tr4) obj4;
        if (tr4Var3 != null) {
            int iIntValue4 = ((Number) rn2Var.K(tr4Var3, Integer.valueOf(iQ))).intValue();
            iQ = u15.Q(iQ, tr4Var3.m(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (dh3.f(u15.v((tr4) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        tr4 tr4Var4 = (tr4) obj5;
        if (tr4Var4 != null) {
            int iIntValue5 = ((Number) rn2Var.K(tr4Var4, Integer.valueOf(iQ))).intValue();
            iQ = u15.Q(iQ, tr4Var4.m(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (dh3.f(u15.v((tr4) obj9), "TextField")) {
                int iIntValue6 = ((Number) rn2Var.K(obj9, Integer.valueOf(iQ))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (dh3.f(u15.v((tr4) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (tr4) obj6;
                int iIntValue7 = obj10 != null ? ((Number) rn2Var.K(obj10, Integer.valueOf(iQ))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (dh3.f(u15.v((tr4) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (tr4) obj7;
                return a(ug3Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) rn2Var.K(obj11, Integer.valueOf(i2))).intValue() : 0, s31.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        tb4.b("Collection contains no element matching the predicate.");
        b61.n();
        return 0;
    }

    @Override // defpackage.xr4
    public final yr4 c(final zr4 zr4Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        eo5 eo5Var;
        int i2;
        eo5 eo5Var2;
        int i3;
        float f;
        int i4;
        int i5;
        float fInvoke = this.c.invoke();
        gg5 gg5Var = this.d;
        final int iX0 = zr4Var.x0(gg5Var.d());
        int iX1 = zr4Var.x0(gg5Var.a());
        long jA = q31.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (dh3.f(x97.z((tr4) obj), "Leading")) {
                break;
            }
            i6++;
        }
        tr4 tr4Var = (tr4) obj;
        eo5 eo5VarO = tr4Var != null ? tr4Var.o(jA) : null;
        int i7 = eo5VarO != null ? eo5VarO.X : 0;
        int iMax = Math.max(0, eo5VarO != null ? eo5VarO.Y : 0);
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (dh3.f(x97.z((tr4) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        tr4 tr4Var2 = (tr4) obj2;
        eo5 eo5VarO2 = tr4Var2 != null ? tr4Var2.o(s31.j(jA, -i7, 0, 2)) : null;
        int i9 = i7 + (eo5VarO2 != null ? eo5VarO2.X : 0);
        int iMax2 = Math.max(iMax, eo5VarO2 != null ? eo5VarO2.Y : 0);
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (dh3.f(x97.z((tr4) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        tr4 tr4Var3 = (tr4) obj3;
        eo5 eo5VarO3 = tr4Var3 != null ? tr4Var3.o(s31.j(jA, -i9, 0, 2)) : null;
        int i11 = (eo5VarO3 != null ? eo5VarO3.X : 0) + i9;
        int iMax3 = Math.max(iMax2, eo5VarO3 != null ? eo5VarO3.Y : 0);
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (dh3.f(x97.z((tr4) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        tr4 tr4Var4 = (tr4) obj4;
        eo5 eo5VarO4 = tr4Var4 != null ? tr4Var4.o(s31.j(jA, -i11, 0, 2)) : null;
        int i13 = i11 + (eo5VarO4 != null ? eo5VarO4.X : 0);
        int iMax4 = Math.max(iMax3, eo5VarO4 != null ? eo5VarO4.Y : 0);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = size5;
            if (dh3.f(x97.z((tr4) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
        }
        tr4 tr4Var5 = (tr4) obj5;
        final ea6 ea6Var = new ea6();
        int i16 = -i13;
        ea6Var.X = tr4Var5 != null ? tr4Var5.o(s31.i(i16, jA, -iX1)) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i = iX1;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i = iX1;
            if (dh3.f(x97.z((tr4) obj6), "Supporting")) {
                break;
            }
            i17++;
            iX1 = i;
        }
        tr4 tr4Var6 = (tr4) obj6;
        int iK = tr4Var6 != null ? tr4Var6.K(q31.j(j)) : 0;
        eo5 eo5Var3 = (eo5) ea6Var.X;
        int i18 = iX0 + (eo5Var3 != null ? eo5Var3.Y : 0);
        long jI = s31.i(i16, q31.a(j, 0, 0, 0, 0, 11), ((-i18) - i) - iK);
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i18;
            tr4 tr4Var7 = (tr4) list.get(i19);
            int i21 = size7;
            float f2 = fInvoke;
            if (dh3.f(x97.z(tr4Var7), "TextField")) {
                final eo5 eo5VarO5 = tr4Var7.o(jI);
                long jA2 = q31.a(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (dh3.f(x97.z((tr4) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                tr4 tr4Var8 = (tr4) obj7;
                eo5 eo5VarO6 = tr4Var8 != null ? tr4Var8.o(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(eo5VarO5.Y, eo5VarO6 != null ? eo5VarO6.Y : 0) + i20 + i);
                int i25 = eo5VarO != null ? eo5VarO.X : 0;
                int i26 = eo5VarO2 != null ? eo5VarO2.X : 0;
                int i27 = eo5VarO3 != null ? eo5VarO3.X : 0;
                int i28 = eo5VarO4 != null ? eo5VarO4.X : 0;
                int i29 = i26;
                int i30 = eo5VarO5.X;
                eo5 eo5Var4 = (eo5) ea6Var.X;
                int i31 = i27 + i28;
                final int iG = s31.g(Math.max(i30 + i31, Math.max((eo5VarO6 != null ? eo5VarO6.X : 0) + i31, eo5Var4 != null ? eo5Var4.X : 0)) + i25 + i29, j);
                eo5 eo5VarO7 = tr4Var6 != null ? tr4Var6.o(q31.a(s31.j(jA, 0, -iMax5, 1), 0, iG, 0, 0, 9)) : null;
                int i32 = eo5VarO7 != null ? eo5VarO7.Y : 0;
                int i33 = eo5VarO5.Y;
                eo5 eo5Var5 = (eo5) ea6Var.X;
                int i34 = eo5Var5 != null ? eo5Var5.Y : 0;
                int i35 = eo5VarO != null ? eo5VarO.Y : 0;
                int i36 = eo5VarO2 != null ? eo5VarO2.Y : 0;
                int i37 = eo5VarO3 != null ? eo5VarO3.Y : 0;
                final eo5 eo5Var6 = eo5VarO2;
                if (eo5VarO4 != null) {
                    eo5 eo5Var7 = eo5VarO3;
                    i2 = eo5VarO4.Y;
                    eo5Var = eo5Var7;
                } else {
                    eo5Var = eo5VarO3;
                    i2 = 0;
                }
                final eo5 eo5Var8 = eo5Var;
                if (eo5VarO6 != null) {
                    i3 = eo5VarO6.Y;
                    eo5Var2 = eo5VarO;
                } else {
                    eo5Var2 = eo5VarO;
                    i3 = 0;
                }
                if (eo5VarO7 != null) {
                    f = f2;
                    i4 = eo5VarO7.Y;
                    i5 = 0;
                } else {
                    f = f2;
                    i4 = 0;
                    i5 = 0;
                }
                final int iA = a(zr4Var, i33, i34, i35, i36, i37, i2, i3, i4, j, f);
                final int i38 = iA - i32;
                int size9 = list.size();
                int i39 = i5;
                while (i39 < size9) {
                    tr4 tr4Var9 = (tr4) list.get(i39);
                    if (dh3.f(x97.z(tr4Var9), "Container")) {
                        final eo5 eo5VarO8 = tr4Var9.o(s31.a(iG != 2147483647 ? iG : i5, iG, i38 != Integer.MAX_VALUE ? i38 : i5, i38));
                        final float f3 = f;
                        final eo5 eo5Var9 = eo5VarO4;
                        final eo5 eo5Var10 = eo5Var2;
                        final eo5 eo5Var11 = eo5VarO6;
                        final eo5 eo5Var12 = eo5VarO7;
                        return zr4Var.g0(iG, iA, e02.X, new gn2() { // from class: b68
                            /* JADX WARN: Code duplicated, block: B:20:0x0099  */
                            @Override // defpackage.gn2
                            public final Object B(Object obj8) {
                                int iX2;
                                int i40;
                                do5 do5Var = (do5) obj8;
                                ea6 ea6Var2 = ea6Var;
                                Object obj9 = ea6Var2.X;
                                d68 d68Var = this;
                                zr4 zr4Var2 = zr4Var;
                                int i41 = iG;
                                int i42 = iA;
                                eo5 eo5Var13 = eo5VarO5;
                                eo5 eo5Var14 = eo5Var11;
                                eo5 eo5Var15 = eo5Var10;
                                eo5 eo5Var16 = eo5Var6;
                                eo5 eo5Var17 = eo5Var8;
                                eo5 eo5Var18 = eo5Var9;
                                eo5 eo5Var19 = eo5VarO8;
                                eo5 eo5Var20 = eo5Var12;
                                if (obj9 != null) {
                                    boolean z = d68Var.a;
                                    int i43 = iX0;
                                    if (z) {
                                        iX2 = Math.round(((i38 - ((eo5) obj9).Y) / 2.0f) * 1.0f);
                                    } else {
                                        iX2 = zr4Var2.x0(d68Var.e) + i43;
                                    }
                                    eo5 eo5Var21 = (eo5) ea6Var2.X;
                                    int i44 = eo5Var21.Y + i43;
                                    z24 layoutDirection = zr4Var2.getLayoutDirection();
                                    q58 q58Var = d68Var.b;
                                    do5.f(do5Var, eo5Var19, 0, 0);
                                    int i45 = i42 - (eo5Var20 != null ? eo5Var20.Y : 0);
                                    if (eo5Var15 != null) {
                                        do5.h(do5Var, eo5Var15, 0, Math.round(((i45 - eo5Var15.Y) / 2.0f) * 1.0f));
                                    }
                                    float f4 = f3;
                                    int I = w51.I(iX2, f4, i43);
                                    z24 z24Var = z24.X;
                                    if (layoutDirection == z24Var) {
                                        if (eo5Var15 != null) {
                                            i40 = eo5Var15.X;
                                        } else {
                                            i40 = 0;
                                        }
                                    } else if (eo5Var16 != null) {
                                        i40 = eo5Var16.X;
                                    } else {
                                        i40 = 0;
                                    }
                                    if (!(q58Var instanceof q58)) {
                                        u52.j(q58Var, "Unknown position: ");
                                        return null;
                                    }
                                    int i46 = i40;
                                    int iRound = Math.round((1.0f + (layoutDirection == z24Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (eo5Var15 != null ? eo5Var15.X : 0)) - (eo5Var16 != null ? eo5Var16.X : 0)) - eo5Var21.X) / 2.0f)) + i46;
                                    pn7.i(q58Var);
                                    do5.f(do5Var, eo5Var21, w51.I(iRound, f4, Math.round((1.0f + (layoutDirection == z24Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (eo5Var15 != null ? eo5Var15.X : 0)) - (eo5Var16 != null ? eo5Var16.X : 0)) - eo5Var21.X) / 2.0f)) + i46), I);
                                    if (eo5Var17 != null) {
                                        do5.h(do5Var, eo5Var17, eo5Var15 != null ? eo5Var15.X : 0, i44);
                                    }
                                    int i47 = (eo5Var15 != null ? eo5Var15.X : 0) + (eo5Var17 != null ? eo5Var17.X : 0);
                                    do5.h(do5Var, eo5Var13, i47, i44);
                                    if (eo5Var14 != null) {
                                        do5.h(do5Var, eo5Var14, i47, i44);
                                    }
                                    if (eo5Var18 != null) {
                                        do5.h(do5Var, eo5Var18, (i41 - (eo5Var16 != null ? eo5Var16.X : 0)) - eo5Var18.X, i44);
                                    }
                                    if (eo5Var16 != null) {
                                        do5.h(do5Var, eo5Var16, i41 - eo5Var16.X, Math.round(((i45 - eo5Var16.Y) / 2.0f) * 1.0f));
                                    }
                                    if (eo5Var20 != null) {
                                        do5.h(do5Var, eo5Var20, 0, i45);
                                    }
                                } else {
                                    float density = zr4Var2.getDensity();
                                    do5.g(do5Var, eo5Var19, 0L);
                                    int i48 = i42 - (eo5Var20 != null ? eo5Var20.Y : 0);
                                    int iO = nr4.O(d68Var.d.d() * density);
                                    if (eo5Var15 != null) {
                                        do5.h(do5Var, eo5Var15, 0, Math.round(((i48 - eo5Var15.Y) / 2.0f) * 1.0f));
                                    }
                                    if (eo5Var17 != null) {
                                        do5.h(do5Var, eo5Var17, eo5Var15 != null ? eo5Var15.X : 0, d68.h(d68Var, i48, iO, eo5Var17));
                                    }
                                    int i49 = (eo5Var15 != null ? eo5Var15.X : 0) + (eo5Var17 != null ? eo5Var17.X : 0);
                                    do5.h(do5Var, eo5Var13, i49, d68.h(d68Var, i48, iO, eo5Var13));
                                    if (eo5Var14 != null) {
                                        do5.h(do5Var, eo5Var14, i49, d68.h(d68Var, i48, iO, eo5Var14));
                                    }
                                    if (eo5Var18 != null) {
                                        do5.h(do5Var, eo5Var18, (i41 - (eo5Var16 != null ? eo5Var16.X : 0)) - eo5Var18.X, d68.h(d68Var, i48, iO, eo5Var18));
                                    }
                                    if (eo5Var16 != null) {
                                        do5.h(do5Var, eo5Var16, i41 - eo5Var16.X, Math.round(((i48 - eo5Var16.Y) / 2.0f) * 1.0f));
                                    }
                                    if (eo5Var20 != null) {
                                        do5.h(do5Var, eo5Var20, 0, i48);
                                    }
                                }
                                return dn8.a;
                            }
                        });
                    }
                    i39++;
                    i38 = i38;
                }
                tb4.b("Collection contains no element matching the predicate.");
                b61.n();
                return null;
            }
            fInvoke = f2;
            i19++;
            size7 = i21;
            i18 = i20;
            eo5VarO = eo5VarO;
        }
        tb4.b("Collection contains no element matching the predicate.");
        b61.n();
        return null;
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        return b(i55Var, list, i, new c68((byte) 0));
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        return e(list, i, new ew6((byte) 27));
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        return b(i55Var, list, i, new ew6((byte) 29));
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        return e(list, i, new ew6((byte) 28));
    }
}
