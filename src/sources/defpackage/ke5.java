package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ke5 implements xr4 {
    public final gn2 a;
    public final boolean b;
    public final q58 c;
    public final o58 d;
    public final gg5 e;
    public final float f;

    public ke5(gn2 gn2Var, boolean z, q58 q58Var, o58 o58Var, gg5 gg5Var, float f) {
        this.a = gn2Var;
        this.b = z;
        this.c = q58Var;
        this.d = o58Var;
        this.e = gg5Var;
        this.f = f;
    }

    public static final int j(int i, ke5 ke5Var, int i2, int i3, eo5 eo5Var, eo5 eo5Var2) {
        if (ke5Var.b) {
            i3 = Math.round(((i2 - eo5Var2.Y) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (eo5Var != null ? eo5Var.Y : 0) / 2);
    }

    public final int a(fi1 fi1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, w51.I(i6, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        gg5 gg5Var = this.e;
        float fH0 = fi1Var.h0(gg5Var.d());
        return s31.f(Math.max(i, Math.max(i2, nr4.O(w51.H(fH0, Math.max(fH0, i6 / 2.0f), f) + i5 + fi1Var.h0(gg5Var.a())))) + i8, j);
    }

    public final int b(fi1 fi1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, w51.I(i6, f, 0))) + i + i2;
        gg5 gg5Var = this.e;
        z24 z24Var = z24.X;
        return s31.g(Math.max(iMax, nr4.O((i6 + fi1Var.h0(gg5Var.c(z24Var) + gg5Var.b(z24Var))) * f)), j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.xr4
    public final defpackage.yr4 c(defpackage.zr4 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke5.c(zr4, java.util.List, long):yr4");
    }

    @Override // defpackage.xr4
    public final int d(i55 i55Var, List list, int i) {
        return e(i55Var, list, i, new nw2((byte) 6));
    }

    public final int e(ug3 ug3Var, List list, int i, rn2 rn2Var) {
        Object obj;
        int iQ;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        ke5 ke5Var = this;
        float fInvoke = ke5Var.d.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (dh3.f(u15.v((tr4) obj), "Leading")) {
                break;
            }
            i2++;
        }
        tr4 tr4Var = (tr4) obj;
        if (tr4Var != null) {
            iQ = u15.Q(i, tr4Var.m(Integer.MAX_VALUE));
            iIntValue = ((Number) rn2Var.K(tr4Var, Integer.valueOf(i))).intValue();
        } else {
            iQ = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (dh3.f(u15.v((tr4) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        tr4 tr4Var2 = (tr4) obj2;
        if (tr4Var2 != null) {
            iQ = u15.Q(iQ, tr4Var2.m(Integer.MAX_VALUE));
            iIntValue2 = ((Number) rn2Var.K(tr4Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (dh3.f(u15.v((tr4) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (tr4) obj3;
        int iIntValue5 = obj8 != null ? ((Number) rn2Var.K(obj8, Integer.valueOf(w51.I(iQ, fInvoke, i)))).intValue() : 0;
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
        if (tr4Var3 != null) {
            iIntValue3 = ((Number) rn2Var.K(tr4Var3, Integer.valueOf(iQ))).intValue();
            iQ = u15.Q(iQ, tr4Var3.m(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
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
        if (tr4Var4 != null) {
            iIntValue4 = ((Number) rn2Var.K(tr4Var4, Integer.valueOf(iQ))).intValue();
            iQ = u15.Q(iQ, tr4Var4.m(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (dh3.f(u15.v((tr4) obj9), "TextField")) {
                int iIntValue6 = ((Number) rn2Var.K(obj9, Integer.valueOf(iQ))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (dh3.f(u15.v((tr4) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (tr4) obj6;
                int iIntValue7 = obj10 != null ? ((Number) rn2Var.K(obj10, Integer.valueOf(iQ))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (dh3.f(u15.v((tr4) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (tr4) obj7;
                return ke5Var.a(ug3Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) rn2Var.K(obj11, Integer.valueOf(i))).intValue() : 0, s31.b(0, 0, 0, 0, 15), fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            ke5Var = this;
            iIntValue3 = iIntValue3;
        }
        tb4.b("Collection contains no element matching the predicate.");
        b61.n();
        return 0;
    }

    @Override // defpackage.xr4
    public final int f(i55 i55Var, List list, int i) {
        return h(i55Var, list, i, new nw2((byte) 7));
    }

    @Override // defpackage.xr4
    public final int g(i55 i55Var, List list, int i) {
        return e(i55Var, list, i, new nw2((byte) 4));
    }

    public final int h(ug3 ug3Var, List list, int i, rn2 rn2Var) {
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
                    if (dh3.f(u15.v((tr4) obj4), "Leading")) {
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
                    if (dh3.f(u15.v((tr4) obj5), "Prefix")) {
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
                    if (dh3.f(u15.v((tr4) obj6), "Suffix")) {
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
                return b(ug3Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, tr4Var6 != null ? ((Number) rn2Var.K(tr4Var6, Integer.valueOf(i))).intValue() : 0, s31.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        tb4.b("Collection contains no element matching the predicate.");
        b61.n();
        return 0;
    }

    @Override // defpackage.xr4
    public final int i(i55 i55Var, List list, int i) {
        return h(i55Var, list, i, new nw2((byte) 5));
    }
}
