package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd7 {
    public static final zx6 a;
    public static final f63 b = new f63((byte) 28);
    public static final Object c = new Object();
    public static id7 d;
    public static long e;
    public static final di f;
    public static final ne g;
    public static List h;
    public static List i;
    public static final es2 j;
    public static final rv k;

    static {
        byte b2 = 8;
        a = new zx6(b2);
        id7 id7Var = id7.g0;
        d = id7Var;
        e = 2L;
        di diVar = new di();
        diVar.d = new long[16];
        diVar.b = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        diVar.e = iArr;
        f = diVar;
        ne neVar = new ne(b2);
        neVar.c = new int[16];
        neVar.d = new c09[16];
        g = neVar;
        d02 d02Var = d02.X;
        h = d02Var;
        i = d02Var;
        long j2 = e;
        e = 1 + j2;
        es2 es2Var = new es2(j2, id7Var, null, new ya2((byte) 11));
        d = d.f(es2Var.b);
        j = es2Var;
        k = new rv(0);
    }

    public static final id7 a(id7 id7Var, long j2, long j3) {
        while (dh3.l(j2, j3) < 0) {
            id7Var = id7Var.f(j2);
            j2++;
        }
        return id7Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(gn2 gn2Var) {
        t05 t05Var;
        Object objU;
        es2 es2Var = j;
        synchronized (c) {
            try {
                t05Var = es2Var.h;
                if (t05Var != null) {
                    k.addAndGet(1);
                }
                objU = u(es2Var, gn2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t05Var != null) {
            try {
                List list = h;
                ww6 ww6Var = new ww6(t05Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((rn2) list.get(i2)).K(ww6Var, es2Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (t05Var != null) {
                Object[] objArr = t05Var.b;
                long[] jArr = t05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((yh7) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        ne neVar = g;
        int i2 = neVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            c09 c09Var = ((c09[]) neVar.d)[i3];
            Object obj = c09Var != null ? c09Var.get() : null;
            if (obj != null && o((yh7) obj)) {
                if (i4 != i3) {
                    ((c09[]) neVar.d)[i4] = c09Var;
                    int[] iArr = (int[]) neVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((c09[]) neVar.d)[i5] = null;
            ((int[]) neVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            neVar.b = i4;
        }
    }

    public static final dd7 e(dd7 dd7Var, gn2 gn2Var, boolean z) {
        boolean z2 = dd7Var instanceof x05;
        if (z2 || dd7Var == null) {
            return new pe8(z2 ? (x05) dd7Var : null, gn2Var, null, false, z);
        }
        return new qe8(dd7Var, gn2Var, false, z);
    }

    public static final bi7 f(bi7 bi7Var) {
        bi7 bi7VarR;
        dd7 dd7VarH = h();
        bi7 bi7VarR2 = r(bi7Var, dd7VarH.g(), dd7VarH.d());
        if (bi7VarR2 != null) {
            return bi7VarR2;
        }
        synchronized (c) {
            dd7 dd7VarH2 = h();
            bi7VarR = r(bi7Var, dd7VarH2.g(), dd7VarH2.d());
        }
        if (bi7VarR != null) {
            return bi7VarR;
        }
        q();
        throw null;
    }

    public static final bi7 g(bi7 bi7Var, dd7 dd7Var) {
        bi7 bi7VarR;
        bi7 bi7VarR2 = r(bi7Var, dd7Var.g(), dd7Var.d());
        if (bi7VarR2 != null) {
            return bi7VarR2;
        }
        synchronized (c) {
            bi7VarR = r(bi7Var, dd7Var.g(), dd7Var.d());
        }
        if (bi7VarR != null) {
            return bi7VarR;
        }
        q();
        throw null;
    }

    public static final dd7 h() {
        dd7 dd7Var = (dd7) b.get();
        return dd7Var == null ? j : dd7Var;
    }

    public static final gn2 i(gn2 gn2Var, gn2 gn2Var2, boolean z) {
        if (!z) {
            gn2Var2 = null;
        }
        if (gn2Var == null || gn2Var2 == null || gn2Var == gn2Var2) {
            return gn2Var == null ? gn2Var2 : gn2Var;
        }
        return new jd7(gn2Var, gn2Var2, (byte) 0);
    }

    public static final gn2 j(gn2 gn2Var, gn2 gn2Var2) {
        if (gn2Var == null || gn2Var2 == null || gn2Var == gn2Var2) {
            return gn2Var == null ? gn2Var2 : gn2Var;
        }
        return new jd7(gn2Var, gn2Var2, (byte) 1);
    }

    public static final bi7 k(bi7 bi7Var, yh7 yh7Var) {
        long j2 = e;
        di diVar = f;
        if (diVar.a > 0) {
            j2 = ((long[]) diVar.d)[0];
        }
        long j3 = j2 - 1;
        bi7 bi7Var2 = null;
        bi7 bi7Var3 = null;
        for (bi7 bi7VarC = yh7Var.c(); bi7VarC != null; bi7VarC = bi7VarC.b) {
            long j4 = bi7VarC.a;
            if (j4 != 0) {
                if (j4 != 0 && dh3.l(j4, j3) <= 0 && !id7.g0.c(j4)) {
                    if (bi7Var3 != null) {
                        if (dh3.l(bi7VarC.a, bi7Var3.a) >= 0) {
                            bi7Var2 = bi7Var3;
                            break;
                        }
                        break;
                    }
                    bi7Var3 = bi7VarC;
                }
            }
            bi7Var2 = bi7VarC;
            break;
        }
        if (bi7Var2 != null) {
            bi7Var2.a = Long.MAX_VALUE;
            return bi7Var2;
        }
        bi7 bi7VarC2 = bi7Var.c(Long.MAX_VALUE);
        bi7VarC2.b = yh7Var.c();
        yh7Var.y(bi7VarC2);
        return bi7VarC2;
    }

    public static final void l(dd7 dd7Var, yh7 yh7Var) {
        dd7Var.t(dd7Var.h() + 1);
        gn2 gn2VarI = dd7Var.i();
        if (gn2VarI != null) {
            gn2VarI.B(yh7Var);
        }
    }

    public static final HashMap m(long j2, x05 x05Var, id7 id7Var) {
        long[] jArr;
        id7 id7Var2;
        long[] jArr2;
        int i2;
        int i3;
        bi7 bi7VarR;
        t05 t05VarX = x05Var.x();
        if (t05VarX != null) {
            long jG = x05Var.g();
            id7 id7VarE = x05Var.d().f(jG).e(x05Var.j);
            Object[] objArr = t05VarX.b;
            long[] jArr3 = t05VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                yh7 yh7Var = (yh7) objArr[(i4 << 3) + i7];
                                bi7 bi7VarC = yh7Var.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                bi7 bi7VarR2 = r(bi7VarC, j2, id7Var);
                                if (bi7VarR2 != null && (bi7VarR = r(bi7VarC, jG, id7VarE)) != null && !bi7VarR2.equals(bi7VarR)) {
                                    bi7 bi7VarR3 = r(bi7VarC, jG, x05Var.d());
                                    if (bi7VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    bi7 bi7VarE = yh7Var.e(bi7VarR, bi7VarR2, bi7VarR3);
                                    if (bi7VarE == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(bi7VarR2, bi7VarE);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            id7VarE = id7VarE;
                        }
                        jArr = jArr3;
                        id7Var2 = id7VarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        id7Var2 = id7VarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    id7VarE = id7Var2;
                }
            }
        }
        return null;
    }

    public static final bi7 n(bi7 bi7Var, zh7 zh7Var, dd7 dd7Var, bi7 bi7Var2) {
        bi7 bi7VarK;
        if (dd7Var.f()) {
            dd7Var.n(zh7Var);
        }
        long jG = dd7Var.g();
        if (bi7Var2.a == jG) {
            return bi7Var2;
        }
        synchronized (c) {
            bi7VarK = k(bi7Var, zh7Var);
        }
        bi7VarK.a = jG;
        dd7Var.n(zh7Var);
        return bi7VarK;
    }

    public static final boolean o(yh7 yh7Var) {
        bi7 bi7Var;
        long j2 = e;
        di diVar = f;
        if (diVar.a > 0) {
            j2 = ((long[]) diVar.d)[0];
        }
        bi7 bi7Var2 = null;
        bi7 bi7VarC = null;
        int i2 = 0;
        for (bi7 bi7VarC2 = yh7Var.c(); bi7VarC2 != null; bi7VarC2 = bi7VarC2.b) {
            long j3 = bi7VarC2.a;
            if (j3 != 0) {
                if (dh3.l(j3, j2) >= 0) {
                    i2++;
                } else if (bi7Var2 == null) {
                    i2++;
                    bi7Var2 = bi7VarC2;
                } else {
                    if (dh3.l(bi7VarC2.a, bi7Var2.a) < 0) {
                        bi7Var = bi7Var2;
                        bi7Var2 = bi7VarC2;
                    } else {
                        bi7Var = bi7VarC2;
                    }
                    if (bi7VarC == null) {
                        bi7VarC = yh7Var.c();
                        bi7 bi7Var3 = bi7VarC;
                        while (true) {
                            if (bi7VarC == null) {
                                bi7VarC = bi7Var3;
                                break;
                            }
                            if (dh3.l(bi7VarC.a, j2) >= 0) {
                                break;
                            }
                            if (dh3.l(bi7Var3.a, bi7VarC.a) < 0) {
                                bi7Var3 = bi7VarC;
                            }
                            bi7VarC = bi7VarC.b;
                        }
                    }
                    bi7Var2.a = 0L;
                    bi7Var2.a(bi7VarC);
                    bi7Var2 = bi7Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(yh7 yh7Var) {
        if (o(yh7Var)) {
            ne neVar = g;
            int i2 = neVar.b;
            int iIdentityHashCode = System.identityHashCode(yh7Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = neVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) neVar.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        c09 c09Var = ((c09[]) neVar.d)[i6];
                        if (yh7Var == (c09Var != null ? c09Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) neVar.c)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = neVar.b;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(neVar.b + 1);
                                        break;
                                    }
                                    if (((int[]) neVar.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    c09 c09Var2 = ((c09[]) neVar.d)[i6];
                                    if ((c09Var2 != null ? c09Var2.get() : null) == yh7Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                c09 c09Var3 = ((c09[]) neVar.d)[i8];
                                if ((c09Var3 != null ? c09Var3.get() : null) == yh7Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            c09[] c09VarArr = (c09[]) neVar.d;
            int length = c09VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                c09[] c09VarArr2 = new c09[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(c09VarArr, i10, c09VarArr2, i12, i2 - i10);
                System.arraycopy((c09[]) neVar.d, 0, c09VarArr2, 0, i10);
                eu.e0(i12, i10, i2, (int[]) neVar.c, iArr);
                eu.h0(0, i10, 6, (int[]) neVar.c, iArr);
                neVar.d = c09VarArr2;
                neVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(c09VarArr, i10, c09VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) neVar.c;
                eu.e0(i13, i10, i2, iArr2, iArr2);
            }
            ((c09[]) neVar.d)[i10] = new c09(yh7Var);
            ((int[]) neVar.c)[i10] = iIdentityHashCode;
            neVar.b++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final bi7 r(bi7 bi7Var, long j2, id7 id7Var) {
        bi7 bi7Var2 = null;
        while (bi7Var != null) {
            long j3 = bi7Var.a;
            if (j3 != 0 && dh3.l(j3, j2) <= 0 && !id7Var.c(j3) && (bi7Var2 == null || dh3.l(bi7Var2.a, bi7Var.a) < 0)) {
                bi7Var2 = bi7Var;
            }
            bi7Var = bi7Var.b;
        }
        if (bi7Var2 != null) {
            return bi7Var2;
        }
        return null;
    }

    public static final bi7 s(bi7 bi7Var, yh7 yh7Var) {
        bi7 bi7VarR;
        dd7 dd7VarH = h();
        gn2 gn2VarE = dd7VarH.e();
        if (gn2VarE != null) {
            gn2VarE.B(yh7Var);
        }
        bi7 bi7VarR2 = r(bi7Var, dd7VarH.g(), dd7VarH.d());
        if (bi7VarR2 != null) {
            return bi7VarR2;
        }
        synchronized (c) {
            dd7 dd7VarH2 = h();
            bi7 bi7VarC = yh7Var.c();
            bi7VarC.getClass();
            bi7VarR = r(bi7VarC, dd7VarH2.g(), dd7VarH2.d());
            if (bi7VarR == null) {
                q();
                throw null;
            }
        }
        return bi7VarR;
    }

    public static final void t(int i2) {
        di diVar = f;
        int i3 = ((int[]) diVar.e)[i2];
        diVar.c(i3, diVar.a - 1);
        diVar.a--;
        long[] jArr = (long[]) diVar.d;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (dh3.l(jArr[i5], j2) <= 0) {
                break;
            }
            diVar.c(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) diVar.d;
        int i6 = diVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < diVar.a && dh3.l(jArr2[i7], jArr2[i8]) < 0) {
                if (dh3.l(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                diVar.c(i7, i3);
                i3 = i7;
            } else {
                if (dh3.l(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                diVar.c(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) diVar.e)[i2] = diVar.c;
        diVar.c = i2;
    }

    public static final Object u(es2 es2Var, gn2 gn2Var) {
        long j2 = es2Var.b;
        Object objB = gn2Var.B(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        id7 id7VarB = d.b(j2);
        d = id7VarB;
        es2Var.b = j3;
        es2Var.a = id7VarB;
        es2Var.g = 0;
        es2Var.h = null;
        es2Var.o();
        d = d.f(j3);
        return objB;
    }

    public static final void v(dd7 dd7Var) {
        Long lValueOf;
        if (d.c(dd7Var.g())) {
            return;
        }
        long jG = dd7Var.g();
        boolean z = dd7Var.c;
        x05 x05Var = dd7Var instanceof x05 ? (x05) dd7Var : null;
        Object objValueOf = x05Var != null ? Boolean.valueOf(x05Var.m) : "read-only";
        synchronized (c) {
            di diVar = f;
            lValueOf = Long.valueOf(diVar.a > 0 ? ((long[]) diVar.d)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final bi7 w(bi7 bi7Var, yh7 yh7Var, dd7 dd7Var) {
        bi7 bi7VarR;
        bi7 bi7VarR2;
        if (dd7Var.f()) {
            dd7Var.n(yh7Var);
        }
        long jG = dd7Var.g();
        bi7 bi7VarR3 = r(bi7Var, jG, dd7Var.d());
        if (bi7VarR3 == null) {
            synchronized (c) {
                dd7 dd7VarH = h();
                bi7 bi7VarC = yh7Var.c();
                bi7VarC.getClass();
                bi7VarR2 = r(bi7VarC, dd7VarH.g(), dd7VarH.d());
                if (bi7VarR2 == null) {
                    q();
                    throw null;
                }
            }
            bi7VarR3 = bi7VarR2;
        }
        if (bi7VarR3.a == dd7Var.g()) {
            return bi7VarR3;
        }
        synchronized (c) {
            bi7VarR = r(yh7Var.c(), jG, dd7Var.d());
            if (bi7VarR == null) {
                q();
                throw null;
            }
            if (bi7VarR.a != jG) {
                bi7 bi7VarK = k(bi7VarR, yh7Var);
                bi7VarK.a(bi7VarR);
                bi7VarK.a = dd7Var.g();
                bi7VarR = bi7VarK;
            }
        }
        dd7Var.n(yh7Var);
        return bi7VarR;
    }
}
