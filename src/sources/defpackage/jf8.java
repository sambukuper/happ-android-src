package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jf8 {
    public static final jf8 e = new jf8(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final k32 c;
    public Object[] d;

    public jf8(int i, int i2, Object[] objArr, k32 k32Var) {
        this.a = i;
        this.b = i2;
        this.c = k32Var;
        this.d = objArr;
    }

    public static jf8 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, k32 k32Var) {
        if (i3 > 30) {
            return new jf8(0, 0, new Object[]{obj, obj2, obj3, obj4}, k32Var);
        }
        int iE = ys7.e(i, i3);
        int iE2 = ys7.e(i2, i3);
        if (iE != iE2) {
            return new jf8((1 << iE) | (1 << iE2), 0, iE < iE2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, k32Var);
        }
        return new jf8(0, 1 << iE, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, k32Var)}, k32Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, k32 k32Var) {
        Object obj3 = this.d[i];
        jf8 jf8VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, k32Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = jf8VarJ;
        eu.g0(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        if3 if3VarW = x97.W(x97.a0(0, this.d.length), 2);
        int i = if3VarW.X;
        int i2 = if3VarW.Y;
        int i3 = if3VarW.Z;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!dh3.f(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iE = 1 << ys7.e(i, i2);
        if (h(iE)) {
            return dh3.f(obj, this.d[f(iE)]);
        }
        if (!i(iE)) {
            return false;
        }
        jf8 jf8VarS = s(t(iE));
        return i2 == 30 ? jf8VarS.c(obj) : jf8VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(jf8 jf8Var) {
        if (this == jf8Var) {
            return true;
        }
        if (this.b == jf8Var.b && this.a == jf8Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == jf8Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iE = 1 << ys7.e(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (dh3.f(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iE)) {
            return null;
        }
        jf8 jf8VarS = s(t(iE));
        if (i2 != 30) {
            return jf8VarS.g(i, i2 + 5, obj);
        }
        if3 if3VarW = x97.W(x97.a0(0, jf8VarS.d.length), 2);
        int i3 = if3VarW.X;
        int i4 = if3VarW.Y;
        int i5 = if3VarW.Z;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!dh3.f(obj, jf8VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return jf8VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final jf8 k(int i, jl5 jl5Var) {
        jl5Var.j(jl5Var.g0 - 1);
        jl5Var.Z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jl5Var.X) {
            return new jf8(0, 0, ys7.h(i, objArr), jl5Var.X);
        }
        this.d = ys7.h(i, objArr);
        return this;
    }

    public final jf8 l(int i, Object obj, Object obj2, int i2, jl5 jl5Var) {
        jl5 jl5Var2;
        jf8 jf8VarL;
        int iE = 1 << ys7.e(i, i2);
        boolean zH = h(iE);
        k32 k32Var = this.c;
        if (zH) {
            int iF = f(iE);
            if (!dh3.f(obj, this.d[iF])) {
                jl5Var.j(jl5Var.g0 + 1);
                k32 k32Var2 = jl5Var.X;
                if (k32Var != k32Var2) {
                    return new jf8(this.a ^ iE, this.b | iE, a(iF, iE, i, obj, obj2, i2, k32Var2), k32Var2);
                }
                this.d = a(iF, iE, i, obj, obj2, i2, k32Var2);
                this.a ^= iE;
                this.b |= iE;
                return this;
            }
            jl5Var.Z = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (k32Var == jl5Var.X) {
                this.d[iF + 1] = obj2;
                return this;
            }
            jl5Var.f0++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new jf8(this.a, this.b, objArrCopyOf, jl5Var.X);
        }
        if (!i(iE)) {
            jl5Var.j(jl5Var.g0 + 1);
            k32 k32Var3 = jl5Var.X;
            int iF2 = f(iE);
            Object[] objArr2 = this.d;
            if (k32Var != k32Var3) {
                return new jf8(this.a | iE, this.b, ys7.f(objArr2, iF2, obj, obj2), k32Var3);
            }
            this.d = ys7.f(objArr2, iF2, obj, obj2);
            this.a |= iE;
            return this;
        }
        int iT = t(iE);
        jf8 jf8VarS = s(iT);
        if (i2 == 30) {
            if3 if3VarW = x97.W(x97.a0(0, jf8VarS.d.length), 2);
            int i3 = if3VarW.X;
            int i4 = if3VarW.Y;
            int i5 = if3VarW.Z;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!dh3.f(obj, jf8VarS.d[i3])) {
                        if (i3 == i4) {
                            jl5Var.j(jl5Var.g0 + 1);
                            jf8VarL = new jf8(0, 0, ys7.f(jf8VarS.d, 0, obj, obj2), jl5Var.X);
                            break;
                        }
                        i3 += i5;
                    } else {
                        jl5Var.Z = jf8VarS.x(i3);
                        if (jf8VarS.c != jl5Var.X) {
                            jl5Var.f0++;
                            Object[] objArr3 = jf8VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            jf8VarL = new jf8(0, 0, objArrCopyOf2, jl5Var.X);
                            break;
                        }
                        jf8VarS.d[i3 + 1] = obj2;
                        jf8VarL = jf8VarS;
                        break;
                    }
                }
            } else {
                jl5Var.j(jl5Var.g0 + 1);
                jf8VarL = new jf8(0, 0, ys7.f(jf8VarS.d, 0, obj, obj2), jl5Var.X);
                break;
            }
            jl5Var2 = jl5Var;
        } else {
            jl5Var2 = jl5Var;
            jf8VarL = jf8VarS.l(i, obj, obj2, i2 + 5, jl5Var2);
        }
        return jf8VarS == jf8VarL ? this : r(iT, jf8VarL, jl5Var2.X);
    }

    public final jf8 m(jf8 jf8Var, int i, ei1 ei1Var, jl5 jl5Var) {
        jf8 jf8Var2;
        Object[] objArr;
        jf8 jf8VarJ;
        if (this == jf8Var) {
            ei1Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            k32 k32Var = jl5Var.X;
            int i3 = jf8Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + jf8Var.d.length);
            int length = this.d.length;
            if3 if3VarW = x97.W(x97.a0(0, jf8Var.d.length), 2);
            int i4 = if3VarW.X;
            int i5 = if3VarW.Y;
            int i6 = if3VarW.Z;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(jf8Var.d[i4])) {
                        ei1Var.a++;
                    } else {
                        Object[] objArr3 = jf8Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == jf8Var.d.length) {
                    return jf8Var;
                }
                return length == objArrCopyOf.length ? new jf8(0, 0, objArrCopyOf, k32Var) : new jf8(0, 0, Arrays.copyOf(objArrCopyOf, length), k32Var);
            }
        } else {
            int i7 = this.b | jf8Var.b;
            int i8 = this.a;
            int i9 = jf8Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (dh3.f(this.d[f(iLowestOneBit)], jf8Var.d[jf8Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                wr5.b("Check failed.");
            }
            if (dh3.f(this.c, jl5Var.X) && this.a == i12 && this.b == i7) {
                jf8Var2 = this;
            } else {
                jf8Var2 = new jf8(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = jf8Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    jf8VarJ = s(t(iLowestOneBit2));
                    if (jf8Var.i(iLowestOneBit2)) {
                        jf8VarJ = jf8VarJ.m(jf8Var.s(jf8Var.t(iLowestOneBit2)), i + 5, ei1Var, jl5Var);
                        objArr = objArr4;
                    } else if (jf8Var.h(iLowestOneBit2)) {
                        int iF = jf8Var.f(iLowestOneBit2);
                        Object obj = jf8Var.d[iF];
                        Object objX = jf8Var.x(iF);
                        int i15 = jl5Var.g0;
                        objArr = objArr4;
                        jf8VarJ = jf8VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, jl5Var);
                        if (jl5Var.g0 == i15) {
                            ei1Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (jf8Var.i(iLowestOneBit2)) {
                        jf8 jf8VarS = jf8Var.s(jf8Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (jf8VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                ei1Var.a++;
                                jf8VarJ = jf8VarS;
                            } else {
                                jf8VarJ = jf8VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, jl5Var);
                            }
                        } else {
                            jf8VarJ = jf8VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = jf8Var.f(iLowestOneBit2);
                        Object obj4 = jf8Var.d[iF4];
                        jf8VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, jf8Var.x(iF4), i + 5, jl5Var.X);
                    }
                }
                objArr[length2] = jf8VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (jf8Var.h(iLowestOneBit3)) {
                    int iF5 = jf8Var.f(iLowestOneBit3);
                    Object[] objArr5 = jf8Var2.d;
                    objArr5[i18] = jf8Var.d[iF5];
                    objArr5[i18 + 1] = jf8Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        ei1Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = jf8Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(jf8Var2)) {
                return jf8Var.e(jf8Var2) ? jf8Var : jf8Var2;
            }
        }
        return this;
    }

    public final jf8 n(int i, Object obj, int i2, jl5 jl5Var) {
        jf8 jf8VarN;
        int iE = 1 << ys7.e(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (dh3.f(obj, this.d[iF])) {
                return p(iF, iE, jl5Var);
            }
        } else if (i(iE)) {
            int iT = t(iE);
            jf8 jf8VarS = s(iT);
            if (i2 == 30) {
                if3 if3VarW = x97.W(x97.a0(0, jf8VarS.d.length), 2);
                int i3 = if3VarW.X;
                int i4 = if3VarW.Y;
                int i5 = if3VarW.Z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!dh3.f(obj, jf8VarS.d[i3])) {
                            if (i3 == i4) {
                                jf8VarN = jf8VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            jf8VarN = jf8VarS.k(i3, jl5Var);
                            break;
                        }
                    }
                } else {
                    jf8VarN = jf8VarS;
                    break;
                }
            } else {
                jf8VarN = jf8VarS.n(i, obj, i2 + 5, jl5Var);
            }
            return q(jf8VarS, jf8VarN, iT, iE, jl5Var.X);
        }
        return this;
    }

    public final jf8 o(int i, Object obj, Object obj2, int i2, jl5 jl5Var) {
        jl5 jl5Var2;
        jf8 jf8VarO;
        int iE = 1 << ys7.e(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            return (dh3.f(obj, this.d[iF]) && dh3.f(obj2, x(iF))) ? p(iF, iE, jl5Var) : this;
        }
        if (!i(iE)) {
            return this;
        }
        int iT = t(iE);
        jf8 jf8VarS = s(iT);
        if (i2 == 30) {
            if3 if3VarW = x97.W(x97.a0(0, jf8VarS.d.length), 2);
            int i3 = if3VarW.X;
            int i4 = if3VarW.Y;
            int i5 = if3VarW.Z;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!dh3.f(obj, jf8VarS.d[i3]) || !dh3.f(obj2, jf8VarS.x(i3))) {
                        if (i3 == i4) {
                            jf8VarO = jf8VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        jf8VarO = jf8VarS.k(i3, jl5Var);
                        break;
                    }
                }
            } else {
                jf8VarO = jf8VarS;
                break;
            }
            jl5Var2 = jl5Var;
        } else {
            jl5Var2 = jl5Var;
            jf8VarO = jf8VarS.o(i, obj, obj2, i2 + 5, jl5Var2);
        }
        return q(jf8VarS, jf8VarO, iT, iE, jl5Var2.X);
    }

    public final jf8 p(int i, int i2, jl5 jl5Var) {
        jl5Var.j(jl5Var.g0 - 1);
        jl5Var.Z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != jl5Var.X) {
            return new jf8(i2 ^ this.a, this.b, ys7.h(i, objArr), jl5Var.X);
        }
        this.d = ys7.h(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final jf8 q(jf8 jf8Var, jf8 jf8Var2, int i, int i2, k32 k32Var) {
        k32 k32Var2 = this.c;
        if (jf8Var2 != null) {
            return (k32Var2 == k32Var || jf8Var != jf8Var2) ? r(i, jf8Var2, k32Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (k32Var2 != k32Var) {
            return new jf8(this.a, this.b ^ i2, ys7.i(i, objArr), k32Var);
        }
        this.d = ys7.i(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final jf8 r(int i, jf8 jf8Var, k32 k32Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && jf8Var.d.length == 2 && jf8Var.b == 0) {
            jf8Var.a = this.b;
            return jf8Var;
        }
        if (this.c == k32Var) {
            objArr[i] = jf8Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = jf8Var;
        return new jf8(this.a, this.b, objArrCopyOf, k32Var);
    }

    public final jf8 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (jf8) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.Z = w(r7, r2, (defpackage.jf8) r14.Z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h70 u(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf8.u(int, int, java.lang.Object, java.lang.Object):h70");
    }

    public final jf8 v(int i, int i2, Object obj) {
        jf8 jf8VarV;
        int iE = 1 << ys7.e(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (!dh3.f(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new jf8(this.a ^ iE, this.b, ys7.h(iF, objArr), null);
            }
        } else {
            if (!i(iE)) {
                return this;
            }
            int iT = t(iE);
            jf8 jf8VarS = s(iT);
            if (i2 == 30) {
                if3 if3VarW = x97.W(x97.a0(0, jf8VarS.d.length), 2);
                int i3 = if3VarW.X;
                int i4 = if3VarW.Y;
                int i5 = if3VarW.Z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!dh3.f(obj, jf8VarS.d[i3])) {
                            if (i3 == i4) {
                                jf8VarV = jf8VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = jf8VarS.d;
                            if (objArr2.length != 2) {
                                jf8VarV = new jf8(0, 0, ys7.h(i3, objArr2), null);
                                break;
                            }
                            jf8VarV = null;
                            break;
                        }
                    }
                } else {
                    jf8VarV = jf8VarS;
                    break;
                }
            } else {
                jf8VarV = jf8VarS.v(i, i2 + 5, obj);
            }
            if (jf8VarV != null) {
                return jf8VarS != jf8VarV ? w(iT, iE, jf8VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new jf8(this.a, this.b ^ iE, ys7.i(iT, objArr3), null);
            }
        }
        return null;
    }

    public final jf8 w(int i, int i2, jf8 jf8Var) {
        Object[] objArr = jf8Var.d;
        if (objArr.length != 2 || jf8Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = jf8Var;
            return new jf8(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            jf8Var.a = this.b;
            return jf8Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        eu.g0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        eu.g0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new jf8(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
