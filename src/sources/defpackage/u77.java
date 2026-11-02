package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class u77 extends a3 implements w05, xe2, wo2 {
    public final int g0;
    public final int h0;
    public final l90 i0;
    public Object[] j0;
    public long k0;
    public long l0;
    public int m0;
    public int n0;

    public u77(int i, int i2, l90 l90Var) {
        this.g0 = i;
        this.h0 = i2;
        this.i0 = l90Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ze2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [u77] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ze2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [b3] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [w77] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [w77] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x0080
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void n(defpackage.u77 r8, defpackage.ze2 r9, defpackage.q51 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.t77
            if (r0 == 0) goto L13
            r0 = r10
            t77 r0 = (defpackage.t77) r0
            int r1 = r0.l0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l0 = r1
            goto L18
        L13:
            t77 r0 = new t77
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j0
            int r1 = r0.l0
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            bm3 r8 = r0.i0
            w77 r9 = r0.h0
            ze2 r1 = r0.g0
            u77 r4 = r0.f0
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L73
        L36:
            r8 = move-exception
            goto Lb3
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r8)
            return
        L3f:
            bm3 r8 = r0.i0
            w77 r9 = r0.h0
            ze2 r1 = r0.g0
            u77 r4 = r0.f0
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L36
            goto L76
        L4b:
            w77 r9 = r0.h0
            ze2 r8 = r0.g0
            u77 r1 = r0.f0
            defpackage.w39.n0(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb3
        L5a:
            defpackage.w39.n0(r10)
            b3 r10 = r8.d()
            w77 r10 = (defpackage.w77) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            s61 r1 = r0.Y     // Catch: java.lang.Throwable -> Lb0
            r1.getClass()     // Catch: java.lang.Throwable -> Lb0
            oy1 r4 = defpackage.oy1.E0     // Catch: java.lang.Throwable -> Lb0
            q61 r1 = r1.H0(r4)     // Catch: java.lang.Throwable -> Lb0
            bm3 r1 = (defpackage.bm3) r1     // Catch: java.lang.Throwable -> Lb0
        L73:
            r4 = r8
            r8 = r1
            r1 = r10
        L76:
            java.lang.Object r10 = r4.v(r9)     // Catch: java.lang.Throwable -> L36
            z31 r5 = defpackage.v77.a     // Catch: java.lang.Throwable -> L36
            c71 r6 = defpackage.c71.X
            if (r10 != r5) goto L91
            r0.f0 = r4     // Catch: java.lang.Throwable -> L36
            r0.g0 = r1     // Catch: java.lang.Throwable -> L36
            r0.h0 = r9     // Catch: java.lang.Throwable -> L36
            r0.i0 = r8     // Catch: java.lang.Throwable -> L36
            r0.l0 = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.k(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L76
            goto Laf
        L91:
            if (r8 == 0) goto L9f
            boolean r5 = r8.k()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9a
            goto L9f
        L9a:
            java.util.concurrent.CancellationException r8 = r8.R()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9f:
            r0.f0 = r4     // Catch: java.lang.Throwable -> L36
            r0.g0 = r1     // Catch: java.lang.Throwable -> L36
            r0.h0 = r9     // Catch: java.lang.Throwable -> L36
            r0.i0 = r8     // Catch: java.lang.Throwable -> L36
            r0.l0 = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.l(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Laf:
            return
        Lb0:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb3:
            r4.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u77.n(u77, ze2, q51):void");
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) throws Throwable {
        n(this, ze2Var, q51Var);
        return c71.X;
    }

    @Override // defpackage.wo2
    public final xe2 b(s61 s61Var, int i, l90 l90Var) {
        return v77.c(this, s61Var, i, l90Var);
    }

    @Override // defpackage.w05
    public final void e() throws Throwable {
        u77 u77Var;
        synchronized (this) {
            try {
                u77Var = this;
                try {
                    u77Var.w(r() + ((long) this.m0), this.l0, r() + ((long) this.m0), r() + ((long) this.m0) + ((long) this.n0));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                u77Var = this;
            }
        }
    }

    @Override // defpackage.w05
    public final boolean g(Object obj) {
        int i;
        boolean z;
        q51[] q51VarArrQ = yn0.a;
        synchronized (this) {
            if (t(obj)) {
                q51VarArrQ = q(q51VarArrQ);
                z = true;
            } else {
                z = false;
            }
        }
        for (q51 q51Var : q51VarArrQ) {
            if (q51Var != null) {
                q51Var.f(dn8.a);
            }
        }
        return z;
    }

    public final Object k(w77 w77Var, t77 t77Var) {
        mm0 mm0Var = new mm0(1, mb6.H(t77Var));
        mm0Var.s();
        synchronized (this) {
            try {
                if (u(w77Var) < 0) {
                    w77Var.b = mm0Var;
                } else {
                    mm0Var.f(dn8.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objQ = mm0Var.q();
        return objQ == c71.X ? objQ : dn8.a;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) throws Throwable {
        u77 u77Var;
        Throwable th;
        q51[] q51VarArrQ;
        s77 s77Var;
        if (g(obj)) {
            return dn8.a;
        }
        mm0 mm0Var = new mm0(1, mb6.H(q51Var));
        mm0Var.s();
        q51[] q51VarArrQ2 = yn0.a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    try {
                        mm0Var.f(dn8.a);
                        q51VarArrQ = q(q51VarArrQ2);
                        s77Var = null;
                        u77Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        u77Var = this;
                        throw th;
                    }
                } else {
                    try {
                        u77Var = this;
                        try {
                            s77 s77Var2 = new s77(u77Var, r() + ((long) (this.m0 + this.n0)), obj, mm0Var);
                            u77Var.p(s77Var2);
                            u77Var.n0++;
                            if (u77Var.h0 == 0) {
                                q51VarArrQ2 = u77Var.q(q51VarArrQ2);
                            }
                            q51VarArrQ = q51VarArrQ2;
                            s77Var = s77Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        u77Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (s77Var != null) {
                    mm0Var.v(new dm0(s77Var, (byte) 2));
                }
                for (q51 q51Var2 : q51VarArrQ) {
                    if (q51Var2 != null) {
                        q51Var2.f(dn8.a);
                    }
                }
                Object objQ = mm0Var.q();
                c71 c71Var = c71.X;
                if (objQ != c71Var) {
                    objQ = dn8.a;
                }
                return objQ == c71Var ? objQ : dn8.a;
            } catch (Throwable th5) {
                th = th5;
                u77Var = this;
            }
        }
    }

    public final void m() {
        if (this.h0 != 0 || this.n0 > 1) {
            Object[] objArr = this.j0;
            objArr.getClass();
            while (this.n0 > 0) {
                long jR = r();
                int i = this.m0;
                int i2 = this.n0;
                if (objArr[((int) ((jR + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != v77.a) {
                    return;
                }
                this.n0 = i2 - 1;
                v77.d(objArr, r() + ((long) (this.m0 + this.n0)), null);
            }
        }
    }

    public final void o() {
        b3[] b3VarArr;
        Object[] objArr = this.j0;
        objArr.getClass();
        v77.d(objArr, r(), null);
        this.m0--;
        long jR = r() + 1;
        if (this.k0 < jR) {
            this.k0 = jR;
        }
        if (this.l0 < jR) {
            if (this.Y != 0 && (b3VarArr = this.X) != null) {
                for (b3 b3Var : b3VarArr) {
                    if (b3Var != null) {
                        w77 w77Var = (w77) b3Var;
                        long j = w77Var.a;
                        if (0 <= j && j < jR) {
                            w77Var.a = jR;
                        }
                    }
                }
            }
            this.l0 = jR;
        }
    }

    public final void p(Object obj) {
        int i = this.m0 + this.n0;
        Object[] objArrS = this.j0;
        if (objArrS == null) {
            objArrS = s(null, 0, 2);
        } else if (i >= objArrS.length) {
            objArrS = s(objArrS, i, objArrS.length * 2);
        }
        v77.d(objArrS, r() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q51[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final q51[] q(q51[] q51VarArr) {
        b3[] b3VarArr;
        w77 w77Var;
        mm0 mm0Var;
        int length = q51VarArr.length;
        if (this.Y != 0 && (b3VarArr = this.X) != null) {
            int length2 = b3VarArr.length;
            int i = 0;
            while (i < length2) {
                b3 b3Var = b3VarArr[i];
                if (b3Var == null || (mm0Var = (w77Var = (w77) b3Var).b) == null || u(w77Var) < 0) {
                    q51VarArr = q51VarArr;
                } else {
                    if (length >= q51VarArr.length) {
                        q51VarArr = q51VarArr;
                        q51VarArr = q51VarArr;
                        q51VarArr = Arrays.copyOf((Object[]) q51VarArr, Math.max(2, q51VarArr.length * 2));
                    }
                    q51VarArr = q51VarArr;
                    q51VarArr = q51VarArr;
                    ((q51[]) q51VarArr)[length] = mm0Var;
                    w77Var.b = null;
                    length++;
                }
                i++;
                q51VarArr = q51VarArr;
            }
            q51VarArr = q51VarArr;
        }
        return (q51[]) q51VarArr;
    }

    public final long r() {
        return Math.min(this.l0, this.k0);
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            bt.i("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.j0 = objArr2;
        if (objArr != null) {
            long jR = r();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jR;
                v77.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    public final boolean t(Object obj) {
        int i;
        long jR;
        long j;
        int i2 = this.Y;
        int i3 = this.g0;
        if (i2 != 0) {
            int i4 = this.m0;
            int i5 = this.h0;
            if (i4 < i5 || this.l0 > this.k0) {
                p(obj);
                i = this.m0 + 1;
                this.m0 = i;
                if (i > i5) {
                    o();
                }
                jR = r() + ((long) this.m0);
                j = this.k0;
                if (((int) (jR - j)) > i3) {
                    w(1 + j, this.l0, r() + ((long) this.m0), r() + ((long) this.m0) + ((long) this.n0));
                }
            } else {
                int iOrdinal = this.i0.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    p(obj);
                    i = this.m0 + 1;
                    this.m0 = i;
                    if (i > i5) {
                        o();
                    }
                    jR = r() + ((long) this.m0);
                    j = this.k0;
                    if (((int) (jR - j)) > i3) {
                        w(1 + j, this.l0, r() + ((long) this.m0), r() + ((long) this.m0) + ((long) this.n0));
                    }
                } else if (iOrdinal != 2) {
                    b61.c();
                    return false;
                }
            }
        } else if (i3 != 0) {
            p(obj);
            int i6 = this.m0 + 1;
            this.m0 = i6;
            if (i6 > i3) {
                o();
            }
            this.l0 = r() + ((long) this.m0);
            return true;
        }
        return true;
    }

    public final long u(w77 w77Var) {
        long j = w77Var.a;
        if (j >= r() + ((long) this.m0) && (this.h0 > 0 || j > r() || this.n0 == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object v(w77 w77Var) {
        Object obj;
        q51[] q51VarArrX = yn0.a;
        synchronized (this) {
            try {
                long jU = u(w77Var);
                if (jU < 0) {
                    obj = v77.a;
                } else {
                    long j = w77Var.a;
                    Object[] objArr = this.j0;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                    if (obj2 instanceof s77) {
                        obj2 = ((s77) obj2).Z;
                    }
                    w77Var.a = jU + 1;
                    Object obj3 = obj2;
                    q51VarArrX = x(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (q51 q51Var : q51VarArrX) {
            if (q51Var != null) {
                q51Var.f(dn8.a);
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.j0;
            objArr.getClass();
            v77.d(objArr, jR, null);
        }
        this.k0 = j;
        this.l0 = j2;
        this.m0 = (int) (j3 - jMin);
        this.n0 = (int) (j4 - j3);
    }

    public final q51[] x(long j) {
        int i;
        long j2;
        q51[] q51VarArr;
        q51[] q51VarArr2;
        b3[] b3VarArr;
        q51[] q51VarArr3 = yn0.a;
        if (j <= this.l0) {
            long jR = r();
            long j3 = ((long) this.m0) + jR;
            int i2 = this.h0;
            if (i2 == 0 && this.n0 > 0) {
                j3++;
            }
            int i3 = 0;
            if (this.Y != 0 && (b3VarArr = this.X) != null) {
                for (b3 b3Var : b3VarArr) {
                    if (b3Var != null) {
                        long j4 = ((w77) b3Var).a;
                        if (0 <= j4 && j4 < j3) {
                            j3 = j4;
                        }
                    }
                }
            }
            if (j3 > this.l0) {
                long jR2 = r() + ((long) this.m0);
                int i4 = this.Y;
                int iMin = this.n0;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jR2 - j3)));
                }
                long j5 = ((long) this.n0) + jR2;
                z31 z31Var = v77.a;
                if (iMin > 0) {
                    q51[] q51VarArr4 = new q51[iMin];
                    j2 = 1;
                    Object[] objArr = this.j0;
                    objArr.getClass();
                    long j6 = jR2;
                    while (true) {
                        if (jR2 >= j5) {
                            q51VarArr2 = q51VarArr4;
                            i = i2;
                            break;
                        }
                        q51VarArr2 = q51VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jR2)];
                        if (obj != z31Var) {
                            obj.getClass();
                            s77 s77Var = (s77) obj;
                            int i5 = i3 + 1;
                            i = i2;
                            q51VarArr2[i3] = s77Var.f0;
                            v77.d(objArr, jR2, z31Var);
                            v77.d(objArr, j6, s77Var.Z);
                            j6++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                        }
                        jR2++;
                        q51VarArr4 = q51VarArr2;
                        i2 = i;
                    }
                    jR2 = j6;
                    q51VarArr = q51VarArr2;
                } else {
                    i = i2;
                    j2 = 1;
                    q51VarArr = q51VarArr3;
                }
                long jMax = Math.max(this.k0, Math.max(jR, jR2 - ((long) this.g0)));
                if (i == 0 && jMax < j5) {
                    Object[] objArr2 = this.j0;
                    objArr2.getClass();
                    if (dh3.f(objArr2[((int) jMax) & (objArr2.length - 1)], z31Var)) {
                        jR2 += j2;
                        jMax += j2;
                    }
                }
                long j7 = jR2;
                w(jMax, this.Y == 0 ? j7 : j3, j7, j5);
                m();
                return q51VarArr.length == 0 ? q51VarArr : q(q51VarArr);
            }
        }
        return q51VarArr3;
    }
}
