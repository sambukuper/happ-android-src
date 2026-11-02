package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class x05 extends dd7 {
    public static final int[] n = new int[0];
    public final gn2 e;
    public final gn2 f;
    public int g;
    public t05 h;
    public ArrayList i;
    public id7 j;
    public int[] k;
    public int l;
    public boolean m;

    public x05(long j, id7 id7Var, gn2 gn2Var, gn2 gn2Var2) {
        super(j, id7Var);
        this.e = gn2Var;
        this.f = gn2Var2;
        this.j = id7.g0;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (kd7.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(t05 t05Var) {
        this.h = t05Var;
    }

    public x05 C(gn2 gn2Var, gn2 gn2Var2) {
        r25 r25Var;
        if (this.c) {
            wr5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            wr5.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = kd7.c;
        synchronized (obj) {
            long j = kd7.e;
            kd7.e = j + 1;
            kd7.d = kd7.d.f(j);
            id7 id7VarD = d();
            r(id7VarD.f(j));
            r25Var = new r25(j, kd7.a(id7VarD, g() + 1, j), kd7.i(gn2Var, e(), true), kd7.j(gn2Var2, i()), this);
        }
        if (this.m || this.c) {
            return r25Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = kd7.e;
            kd7.e = j2 + 1;
            s(j2);
            kd7.d = kd7.d.f(g());
        }
        r(kd7.a(d(), jG + 1, g()));
        return r25Var;
    }

    @Override // defpackage.dd7
    public final void b() {
        kd7.d = kd7.d.b(g()).a(this.j);
    }

    @Override // defpackage.dd7
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (kd7.c) {
            o();
        }
        l();
    }

    @Override // defpackage.dd7
    public int h() {
        return this.g;
    }

    @Override // defpackage.dd7
    public gn2 i() {
        return this.f;
    }

    @Override // defpackage.dd7
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.dd7
    public void l() {
        if (this.l <= 0) {
            wr5.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        t05 t05VarX = x();
        if (t05VarX != null) {
            if (this.m) {
                wr5.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = t05VarX.b;
            long[] jArr = t05VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (bi7 bi7VarC = ((yh7) objArr[(i2 << 3) + i4]).c(); bi7VarC != null; bi7VarC = bi7VarC.b) {
                                    long j2 = bi7VarC.a;
                                    if (j2 == jG || wv0.m0(this.j, Long.valueOf(j2))) {
                                        zx6 zx6Var = kd7.a;
                                        bi7VarC.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.dd7
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.dd7
    public void n(yh7 yh7Var) {
        t05 t05VarX = x();
        if (t05VarX == null) {
            t05 t05Var = vw6.a;
            t05VarX = new t05();
            B(t05VarX);
        }
        t05VarX.a(yh7Var);
    }

    @Override // defpackage.dd7
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            kd7.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.dd7
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.dd7
    public dd7 u(gn2 gn2Var) {
        s25 s25Var;
        if (this.c) {
            wr5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            wr5.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = kd7.c;
        synchronized (obj) {
            long j = kd7.e;
            kd7.e = j + 1;
            kd7.d = kd7.d.f(j);
            s25Var = new s25(j, kd7.a(d(), jG + 1, j), kd7.i(gn2Var, e(), true), this);
        }
        if (this.m || this.c) {
            return s25Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = kd7.e;
            kd7.e = j2 + 1;
            s(j2);
            kd7.d = kd7.d.f(g());
        }
        r(kd7.a(d(), jG2 + 1, g()));
        return s25Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (kd7.c) {
            long j = kd7.e;
            kd7.e = j + 1;
            s(j);
            kd7.d = kd7.d.f(g());
        }
        r(kd7.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public ys0 w() {
        HashMap mapM;
        List list;
        t05 t05Var;
        long j;
        long j2;
        t05 t05VarX = x();
        if (t05VarX != null) {
            long j3 = kd7.j.b;
            mapM = kd7.m(j3, this, kd7.d.b(j3));
        } else {
            mapM = null;
        }
        d02 d02Var = d02.X;
        synchronized (kd7.c) {
            try {
                kd7.v(this);
                if (t05VarX == null || t05VarX.d == 0) {
                    b();
                    es2 es2Var = kd7.j;
                    t05 t05Var2 = es2Var.h;
                    kd7.u(es2Var, kd7.a);
                    if (t05Var2 == null || !t05Var2.h()) {
                        list = d02Var;
                        t05Var = null;
                    } else {
                        list = kd7.h;
                        t05Var = t05Var2;
                    }
                } else {
                    es2 es2Var2 = kd7.j;
                    ys0 ys0VarZ = z(kd7.e, t05VarX, mapM, kd7.d.b(es2Var2.b));
                    if (!ys0VarZ.equals(gd7.w0)) {
                        return ys0VarZ;
                    }
                    b();
                    t05Var = es2Var2.h;
                    kd7.u(es2Var2, kd7.a);
                    B(null);
                    es2Var2.h = null;
                    list = kd7.h;
                }
                this.m = true;
                if (t05Var != null) {
                    ww6 ww6Var = new ww6(t05Var);
                    if (!t05Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((rn2) list.get(i)).K(ww6Var, this);
                        }
                    }
                }
                if (t05VarX != null && t05VarX.h()) {
                    ww6 ww6Var2 = new ww6(t05VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((rn2) list.get(i2)).K(ww6Var2, this);
                    }
                }
                synchronized (kd7.c) {
                    try {
                        p();
                        kd7.d();
                        if (t05Var != null) {
                            Object[] objArr = t05Var.b;
                            long[] jArr = t05Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                kd7.p((yh7) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (t05VarX != null) {
                            Object[] objArr2 = t05VarX.b;
                            long[] jArr2 = t05VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                kd7.p((yh7) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                kd7.p((yh7) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gd7.w0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t05 x() {
        return this.h;
    }

    @Override // defpackage.dd7
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public gn2 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final ys0 z(long j, t05 t05Var, HashMap map, id7 id7Var) {
        ArrayList arrayList;
        ArrayList arrayListH0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        yh7 yh7Var;
        bi7 bi7Var;
        id7 id7Var2;
        Object[] objArr;
        long[] jArr;
        id7 id7Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        bi7 bi7VarE;
        id7 id7VarE = d().f(g()).e(this.j);
        Object[] objArr3 = t05Var.b;
        long[] jArr3 = t05Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListH0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            yh7 yh7Var2 = (yh7) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            bi7 bi7VarC = yh7Var2.c();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            bi7 bi7VarR = kd7.r(bi7VarC, j, id7Var);
                            if (bi7VarR == null) {
                                arrayList4 = arrayListH0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListH0;
                                j2 = j3;
                                bi7 bi7VarR2 = kd7.r(bi7VarC, g(), id7VarE);
                                if (bi7VarR2 != null && bi7VarR2.a != 1 && !bi7VarR.equals(bi7VarR2)) {
                                    id7Var3 = id7VarE;
                                    bi7 bi7VarR3 = kd7.r(bi7VarC, g(), d());
                                    if (bi7VarR3 == null) {
                                        kd7.q();
                                        throw null;
                                    }
                                    if (map == null || (bi7VarE = (bi7) map.get(bi7VarR)) == null) {
                                        bi7VarE = yh7Var2.e(bi7VarR2, bi7VarR, bi7VarR3);
                                    }
                                    if (bi7VarE == null) {
                                        return new fd7(this);
                                    }
                                    if (!bi7VarE.equals(bi7VarR3)) {
                                        if (bi7VarE.equals(bi7VarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new qg5(yh7Var2, bi7VarR.c(g())));
                                            arrayListH0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListH0.add(yh7Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!bi7VarE.equals(bi7VarR2) ? new qg5(yh7Var2, bi7VarE) : new qg5(yh7Var2, bi7VarR2.c(g())));
                                        }
                                    }
                                    arrayListH0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListH0 = arrayList4;
                            }
                            id7Var3 = id7VarE;
                            arrayList2 = arrayList5;
                            arrayListH0 = arrayList4;
                        } else {
                            id7Var3 = id7VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        id7VarE = id7Var3;
                    }
                    id7Var2 = id7VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    id7Var2 = id7VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    id7VarE = id7Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    qg5 qg5Var = (qg5) arrayList2.get(i2);
                    yh7Var = (yh7) qg5Var.X;
                    bi7Var = (bi7) qg5Var.Y;
                    bi7Var.a = j;
                    synchronized (kd7.c) {
                        bi7Var.b = yh7Var.c();
                        yh7Var.y(bi7Var);
                    }
                }
            }
            if (arrayListH0 != null) {
                size = arrayListH0.size();
                for (i = 0; i < size; i++) {
                    t05Var.l((yh7) arrayListH0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListH0 = wv0.H0(arrayList3, arrayListH0);
                }
                this.i = arrayListH0;
            }
            return gd7.w0;
        }
        arrayList = null;
        arrayListH0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                qg5 qg5Var2 = (qg5) arrayList2.get(i2);
                yh7Var = (yh7) qg5Var2.X;
                bi7Var = (bi7) qg5Var2.Y;
                bi7Var.a = j;
                synchronized (kd7.c) {
                    bi7Var.b = yh7Var.c();
                    yh7Var.y(bi7Var);
                }
            }
        }
        if (arrayListH0 != null) {
            size = arrayListH0.size();
            while (i < size) {
                t05Var.l((yh7) arrayListH0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListH0 = wv0.H0(arrayList3, arrayListH0);
            }
            this.i = arrayListH0;
        }
        return gd7.w0;
    }
}
