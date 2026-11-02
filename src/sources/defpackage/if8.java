package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class if8 {
    public static final if8 e = new if8(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final k42 c;
    public Object[] d;

    public if8(int i, int i2, Object[] objArr, k42 k42Var) {
        this.a = i;
        this.b = i2;
        this.c = k42Var;
        this.d = objArr;
    }

    public static if8 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, k42 k42Var) {
        if (i3 > 30) {
            return new if8(0, 0, new Object[]{obj, obj2, obj3, obj4}, k42Var);
        }
        int iE = us7.e(i, i3);
        int iE2 = us7.e(i2, i3);
        if (iE != iE2) {
            return new if8((1 << iE) | (1 << iE2), 0, iE < iE2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, k42Var);
        }
        return new if8(0, 1 << iE, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, k42Var)}, k42Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, k42 k42Var) {
        Object obj3 = this.d[i];
        if8 if8VarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, y(i), i3, obj, obj2, i4 + 5, k42Var);
        int iU = u(i2);
        int i5 = iU + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 2, i5);
        objArr2[iU - 1] = if8VarK;
        eu.g0(objArr, objArr2, iU, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += t(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        int i = 0;
        int iB = z51.B(0, this.d.length - 1, 2);
        if (iB >= 0) {
            while (!dh3.f(obj, this.d[i])) {
                if (i != iB) {
                    i += 2;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iE = 1 << us7.e(i, i2);
        if (i(iE)) {
            return dh3.f(obj, this.d[f(iE)]);
        }
        if (!j(iE)) {
            return false;
        }
        if8 if8VarT = t(u(iE));
        if (i2 == 30) {
            return if8VarT.c(obj) != -1;
        }
        return if8VarT.d(i, i2 + 5, obj);
    }

    public final boolean e(if8 if8Var) {
        if (this == if8Var) {
            return true;
        }
        if (this.b == if8Var.b && this.a == if8Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == if8Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[LOOP:2: B:44:0x00b7->B:48:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc A[EDGE_INSN: B:61:0x00cc->B:50:0x00cc BREAK  A[LOOP:1: B:35:0x008c->B:42:0x00b2], SYNTHETIC] */
    public final boolean g(if8 if8Var, rn2 rn2Var) {
        int i;
        int length;
        Object objY;
        int iC;
        if8Var.getClass();
        if (this != if8Var) {
            int i2 = this.a;
            if (i2 == if8Var.a && (i = this.b) == if8Var.b) {
                if (i2 == 0 && i == 0) {
                    Object[] objArr = this.d;
                    if (objArr.length == if8Var.d.length) {
                        Iterable iterableW = x97.W(new kf3(0, objArr.length - 1, 1), 2);
                        if (!(iterableW instanceof Collection) || !((Collection) iterableW).isEmpty()) {
                            Iterator it = iterableW.iterator();
                            do {
                                jf3 jf3Var = (jf3) it;
                                if (jf3Var.Z) {
                                    int iNextInt = jf3Var.nextInt();
                                    Object obj = if8Var.d[iNextInt];
                                    objY = if8Var.y(iNextInt);
                                    iC = c(obj);
                                }
                            } while (iC != -1 ? ((Boolean) rn2Var.K(y(iC), objY)).booleanValue() : false);
                        }
                    }
                } else {
                    int iBitCount = Integer.bitCount(i2) * 2;
                    if3 if3VarW = x97.W(x97.a0(0, iBitCount), 2);
                    int i3 = if3VarW.X;
                    int i4 = if3VarW.Y;
                    int i5 = if3VarW.Z;
                    if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                        length = this.d.length;
                        while (iBitCount < length) {
                            if (!t(iBitCount).g(if8Var.t(iBitCount), rn2Var)) {
                                break;
                            }
                            iBitCount++;
                        }
                    } else {
                        while (dh3.f(this.d[i3], if8Var.d[i3]) && ((Boolean) rn2Var.K(y(i3), if8Var.y(i3))).booleanValue()) {
                            if (i3 != i4) {
                                i3 += i5;
                            } else {
                                length = this.d.length;
                                while (iBitCount < length) {
                                    if (!t(iBitCount).g(if8Var.t(iBitCount), rn2Var)) {
                                        break;
                                        break;
                                    }
                                    iBitCount++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Object h(int i, int i2, Object obj) {
        int iE = 1 << us7.e(i, i2);
        if (i(iE)) {
            int iF = f(iE);
            if (dh3.f(obj, this.d[iF])) {
                return y(iF);
            }
            return null;
        }
        if (!j(iE)) {
            return null;
        }
        if8 if8VarT = t(u(iE));
        if (i2 != 30) {
            return if8VarT.h(i, i2 + 5, obj);
        }
        int iC = if8VarT.c(obj);
        if (iC != -1) {
            return if8VarT.y(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final if8 l(Object obj, Object obj2, ol5 ol5Var) {
        int iC = c(obj);
        if (iC == -1) {
            ol5Var.h(ol5Var.i0 + 1);
            return new if8(0, 0, us7.f(this.d, 0, obj, obj2), ol5Var.Y);
        }
        ol5Var.f0 = y(iC);
        if (y(iC) == obj2) {
            return this;
        }
        if (this.c == ol5Var.Y) {
            this.d[iC + 1] = obj2;
            return this;
        }
        ol5Var.g0++;
        Object[] objArr = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iC + 1] = obj2;
        return new if8(0, 0, objArrCopyOf, ol5Var.Y);
    }

    public final if8 m(int i, ol5 ol5Var) {
        ol5Var.h(ol5Var.i0 - 1);
        ol5Var.f0 = y(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ol5Var.Y) {
            return new if8(0, 0, us7.h(i, objArr), ol5Var.Y);
        }
        this.d = us7.h(i, objArr);
        return this;
    }

    public final if8 n(int i, Object obj, Object obj2, int i2, ol5 ol5Var) {
        int iE = 1 << us7.e(i, i2);
        boolean zI = i(iE);
        k42 k42Var = this.c;
        if (zI) {
            int iF = f(iE);
            if (!dh3.f(obj, this.d[iF])) {
                ol5Var.h(ol5Var.i0 + 1);
                k42 k42Var2 = ol5Var.Y;
                if (k42Var != k42Var2) {
                    return new if8(this.a ^ iE, this.b | iE, a(iF, iE, i, obj, obj2, i2, k42Var2), k42Var2);
                }
                this.d = a(iF, iE, i, obj, obj2, i2, k42Var2);
                this.a ^= iE;
                this.b |= iE;
                return this;
            }
            ol5Var.f0 = y(iF);
            if (y(iF) != obj2) {
                if (k42Var == ol5Var.Y) {
                    this.d[iF + 1] = obj2;
                    return this;
                }
                ol5Var.g0++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new if8(this.a, this.b, objArrCopyOf, ol5Var.Y);
            }
        } else {
            if (!j(iE)) {
                ol5Var.h(ol5Var.i0 + 1);
                k42 k42Var3 = ol5Var.Y;
                int iF2 = f(iE);
                Object[] objArr2 = this.d;
                if (k42Var != k42Var3) {
                    return new if8(this.a | iE, this.b, us7.f(objArr2, iF2, obj, obj2), k42Var3);
                }
                this.d = us7.f(objArr2, iF2, obj, obj2);
                this.a |= iE;
                return this;
            }
            int iU = u(iE);
            if8 if8VarT = t(iU);
            if8 if8VarL = i2 == 30 ? if8VarT.l(obj, obj2, ol5Var) : if8VarT.n(i, obj, obj2, i2 + 5, ol5Var);
            if (if8VarT != if8VarL) {
                return x(iU, iE, if8VarL, ol5Var.Y);
            }
        }
        return this;
    }

    public final if8 o(if8 if8Var, int i, di1 di1Var, ol5 ol5Var) {
        if8 if8Var2;
        Object[] objArr;
        int i2;
        byte b;
        if8 if8VarK;
        boolean zD;
        int i3;
        boolean z;
        int i4;
        if8Var.getClass();
        if (this == if8Var) {
            di1Var.a += b();
            return this;
        }
        byte b2 = -1;
        int i5 = 1;
        if (i > 30) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + if8Var.d.length);
            int length = this.d.length;
            int iB = z51.B(0, if8Var.d.length - 1, 2);
            if (iB >= 0) {
                int i6 = 0;
                i3 = 0;
                z = true;
                while (true) {
                    int iC = c(if8Var.d[i6]);
                    if (iC == -1) {
                        Object[] objArr3 = if8Var.d;
                        objArrCopyOf[length] = objArr3[i6];
                        objArrCopyOf[length + 1] = objArr3[i6 + 1];
                        length += 2;
                        i4 = i5;
                    } else {
                        di1Var.a += i5;
                        Object obj = objArrCopyOf[iC];
                        Object[] objArr4 = if8Var.d;
                        i4 = i5;
                        if (obj != objArr4[i6]) {
                            z = false;
                        }
                        int i7 = iC + 1;
                        Object obj2 = objArrCopyOf[i7];
                        Object obj3 = objArr4[i6 + 1];
                        if (obj2 != obj3) {
                            objArrCopyOf[i7] = obj3;
                            i3 = i4;
                        }
                    }
                    if (i6 == iB) {
                        break;
                    }
                    i6 += 2;
                    i5 = i4;
                }
            } else {
                i3 = 0;
                z = true;
            }
            if (i3 != 0) {
                ol5Var.g0++;
            }
            if (length != this.d.length || i3 != 0) {
                if (length != if8Var.d.length || !z) {
                    return length == objArrCopyOf.length ? new if8(0, 0, objArrCopyOf, ol5Var.Y) : new if8(0, 0, Arrays.copyOf(objArrCopyOf, length), ol5Var.Y);
                }
            }
            return this;
        }
        int i8 = this.b | if8Var.b;
        int i9 = this.a;
        int i10 = if8Var.a;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        int i13 = i11;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (dh3.f(this.d[f(iLowestOneBit)], if8Var.d[if8Var.f(iLowestOneBit)])) {
                i13 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        if ((i8 & i13) != 0) {
            bt.i("Check failed.");
            return null;
        }
        if (dh3.f(this.c, ol5Var.Y) && this.a == i13 && this.b == i8) {
            if8Var2 = this;
        } else {
            if8Var2 = new if8(i13, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i13) * 2)], null);
        }
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr5 = if8Var2.d;
            int length2 = (objArr5.length - 1) - i15;
            if (j(iLowestOneBit2)) {
                if8VarK = t(u(iLowestOneBit2));
                if (if8Var.j(iLowestOneBit2)) {
                    if8VarK = if8VarK.o(if8Var.t(if8Var.u(iLowestOneBit2)), i + 5, di1Var, ol5Var);
                    objArr5 = objArr5;
                    b = b2;
                    i2 = iLowestOneBit2;
                } else {
                    if (if8Var.i(iLowestOneBit2)) {
                        int iF = if8Var.f(iLowestOneBit2);
                        Object obj4 = if8Var.d[iF];
                        Object objY = if8Var.y(iF);
                        int i16 = ol5Var.i0;
                        if (i == 30) {
                            if8VarK = if8VarK.l(obj4, objY, ol5Var);
                            i2 = iLowestOneBit2;
                        } else {
                            i2 = iLowestOneBit2;
                            if8VarK = if8VarK.n(obj4 != null ? obj4.hashCode() : 0, obj4, objY, i + 5, ol5Var);
                        }
                        if (ol5Var.i0 == i16) {
                            di1Var.a++;
                        }
                    } else {
                        i2 = iLowestOneBit2;
                        objArr5 = objArr5;
                    }
                    b = -1;
                }
            } else {
                i2 = iLowestOneBit2;
                objArr5 = objArr5;
                if (if8Var.j(i2)) {
                    if8 if8VarT = if8Var.t(if8Var.u(i2));
                    if (i(i2)) {
                        int iF2 = f(i2);
                        Object obj5 = this.d[iF2];
                        if (i == 30) {
                            b = -1;
                            zD = if8VarT.c(obj5) != -1;
                        } else {
                            b = -1;
                            zD = if8VarT.d(obj5 != null ? obj5.hashCode() : 0, i + 5, obj5);
                        }
                        if (zD) {
                            di1Var.a++;
                        } else {
                            Object objY2 = y(iF2);
                            if (i == 30) {
                                if8VarK = if8VarT.l(obj5, objY2, ol5Var);
                            } else {
                                if8VarK = if8VarT.n(obj5 != null ? obj5.hashCode() : 0, obj5, objY2, i + 5, ol5Var);
                            }
                        }
                    } else {
                        b = -1;
                    }
                    if8VarK = if8VarT;
                } else {
                    b = -1;
                    int iF3 = f(i2);
                    Object obj6 = this.d[iF3];
                    Object objY3 = y(iF3);
                    int iF4 = if8Var.f(i2);
                    Object obj7 = if8Var.d[iF4];
                    if8VarK = k(obj6 != null ? obj6.hashCode() : 0, obj6, objY3, obj7 != null ? obj7.hashCode() : 0, obj7, if8Var.y(iF4), i + 5, ol5Var.Y);
                }
            }
            objArr5[length2] = if8VarK;
            i15++;
            i14 ^= i2;
            b2 = b;
        }
        int i17 = 0;
        while (i13 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i13);
            int i18 = i17 * 2;
            if (if8Var.i(iLowestOneBit3)) {
                int iF5 = if8Var.f(iLowestOneBit3);
                Object objY4 = if8Var.y(iF5);
                if (i(iLowestOneBit3)) {
                    int iF6 = f(iLowestOneBit3);
                    di1Var.a++;
                    if (if8Var2 != this && y(iF6) != objY4) {
                        ol5Var.g0++;
                    }
                    objArr = if8Var2.d;
                    objArr[i18] = this.d[iF6];
                } else {
                    objArr = if8Var2.d;
                    objArr[i18] = if8Var.d[iF5];
                }
                objArr[i18 + 1] = objY4;
            } else {
                int iF7 = f(iLowestOneBit3);
                Object[] objArr6 = if8Var2.d;
                objArr6[i18] = this.d[iF7];
                objArr6[i18 + 1] = y(iF7);
            }
            i17++;
            i13 ^= iLowestOneBit3;
        }
        if (!e(if8Var2)) {
            return if8Var.e(if8Var2) ? if8Var : if8Var2;
        }
        return this;
    }

    public final if8 p(int i, Object obj, int i2, ol5 ol5Var) {
        if8 if8VarP;
        int iE = 1 << us7.e(i, i2);
        if (i(iE)) {
            int iF = f(iE);
            if (dh3.f(obj, this.d[iF])) {
                return r(iF, iE, ol5Var);
            }
        } else if (j(iE)) {
            int iU = u(iE);
            if8 if8VarT = t(iU);
            if (i2 == 30) {
                int iC = if8VarT.c(obj);
                if8VarP = iC != -1 ? if8VarT.m(iC, ol5Var) : if8VarT;
            } else {
                if8VarP = if8VarT.p(i, obj, i2 + 5, ol5Var);
            }
            return s(if8VarT, if8VarP, iU, iE, ol5Var.Y);
        }
        return this;
    }

    public final if8 q(int i, Object obj, Object obj2, int i2, ol5 ol5Var) {
        ol5 ol5Var2;
        if8 if8VarQ;
        int iE = 1 << us7.e(i, i2);
        if (i(iE)) {
            int iF = f(iE);
            return (dh3.f(obj, this.d[iF]) && dh3.f(obj2, y(iF))) ? r(iF, iE, ol5Var) : this;
        }
        if (!j(iE)) {
            return this;
        }
        int iU = u(iE);
        if8 if8VarT = t(iU);
        if (i2 == 30) {
            int iC = if8VarT.c(obj);
            if8VarQ = (iC == -1 || !dh3.f(obj2, if8VarT.y(iC))) ? if8VarT : if8VarT.m(iC, ol5Var);
            ol5Var2 = ol5Var;
        } else {
            ol5Var2 = ol5Var;
            if8VarQ = if8VarT.q(i, obj, obj2, i2 + 5, ol5Var2);
        }
        return s(if8VarT, if8VarQ, iU, iE, ol5Var2.Y);
    }

    public final if8 r(int i, int i2, ol5 ol5Var) {
        ol5Var.h(ol5Var.i0 - 1);
        ol5Var.f0 = y(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ol5Var.Y) {
            return new if8(i2 ^ this.a, this.b, us7.h(i, objArr), ol5Var.Y);
        }
        this.d = us7.h(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final if8 s(if8 if8Var, if8 if8Var2, int i, int i2, k42 k42Var) {
        if (if8Var2 != null) {
            return (if8Var2 != if8Var || (if8Var2.d.length == 2 && if8Var2.b == 0)) ? x(i, i2, if8Var2, k42Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != k42Var) {
            return new if8(this.a, this.b ^ i2, us7.i(i, objArr), k42Var);
        }
        this.d = us7.i(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final if8 t(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (if8) obj;
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r4.Z = x(r1, r2, (defpackage.if8) r4.Z, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h70 v(int r13, int r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if8.v(int, int, java.lang.Object, java.lang.Object):h70");
    }

    public final if8 w(int i, int i2, Object obj) {
        if8 if8VarW;
        int iE = 1 << us7.e(i, i2);
        if (i(iE)) {
            int iF = f(iE);
            if (!dh3.f(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length == 2) {
                return null;
            }
            return new if8(this.a ^ iE, this.b, us7.h(iF, objArr), null);
        }
        if (!j(iE)) {
            return this;
        }
        int iU = u(iE);
        if8 if8VarT = t(iU);
        if (i2 == 30) {
            int iC = if8VarT.c(obj);
            if (iC != -1) {
                Object[] objArr2 = if8VarT.d;
                if8VarW = objArr2.length == 2 ? null : new if8(0, 0, us7.h(iC, objArr2), null);
            } else {
                if8VarW = if8VarT;
            }
        } else {
            if8VarW = if8VarT.w(i, i2 + 5, obj);
        }
        if (if8VarW != null) {
            return if8VarT != if8VarW ? x(iU, iE, if8VarW, null) : this;
        }
        Object[] objArr3 = this.d;
        if (objArr3.length == 1) {
            return null;
        }
        return new if8(this.a, this.b ^ iE, us7.i(iU, objArr3), null);
    }

    public final if8 x(int i, int i2, if8 if8Var, k42 k42Var) {
        if (if8Var.d.length != 2 || if8Var.b != 0) {
            if (k42Var != null && this.c == k42Var) {
                this.d[i] = if8Var;
                return this;
            }
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[i] = if8Var;
            return new if8(this.a, this.b, objArrCopyOf, k42Var);
        }
        if (this.d.length == 1) {
            if8Var.a = this.b;
            return if8Var;
        }
        int iF = f(i2);
        Object[] objArr2 = this.d;
        Object[] objArr3 = if8Var.d;
        Object obj = objArr3[0];
        Object obj2 = objArr3[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length + 1);
        eu.g0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr2.length);
        eu.g0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new if8(this.a ^ i2, this.b ^ i2, objArrCopyOf2, k42Var);
    }

    public final Object y(int i) {
        return this.d[i + 1];
    }
}
