package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c55 extends n55 {
    public final jx4 c;
    public final b8 d;
    public final qi4 e;
    public i55 f;
    public aq5 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public c55(jx4 jx4Var) {
        this.c = jx4Var;
        b8 b8Var = new b8((byte) 9);
        b8Var.c = new long[2];
        this.d = b8Var;
        this.e = new qi4(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.n55
    public final boolean a(qi4 qi4Var, y24 y24Var, zz2 zz2Var, boolean z) {
        b8 b8Var;
        qi4 qi4Var2;
        Object obj;
        boolean z2;
        boolean z3;
        aq5 aq5Var;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        boolean zA = super.a(qi4Var, y24Var, zz2Var, z);
        ?? T = this.c;
        boolean z6 = true;
        if (T.p0) {
            ?? c15Var = 0;
            while (T != 0) {
                if (T instanceof kq5) {
                    this.f = yn0.X((kq5) T, 16);
                } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                    jx4 jx4Var = ((oh1) T).r0;
                    int i3 = 0;
                    while (jx4Var != null) {
                        if ((jx4Var.Z & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                T = T;
                                c15Var = c15Var;
                                c15Var = c15Var;
                                T = jx4Var;
                            } else {
                                if (c15Var == 0) {
                                    c15Var = new c15(0, new jx4[16]);
                                }
                                if (T != 0) {
                                    c15Var.b(T);
                                    T = 0;
                                }
                                c15Var.b(jx4Var);
                            }
                        } else {
                            T = T;
                            c15Var = c15Var;
                        }
                        jx4Var = jx4Var.h0;
                        T = T;
                        c15Var = c15Var;
                    }
                    if (i3 == 1) {
                        T = T;
                        c15Var = c15Var;
                    } else {
                        T = T;
                        c15Var = c15Var;
                    }
                }
                T = yn0.T(c15Var);
            }
            if (this.f != null) {
                int iH = qi4Var.h();
                int i4 = 0;
                while (true) {
                    b8Var = this.d;
                    qi4Var2 = this.e;
                    if (i4 >= iH) {
                        break;
                    }
                    long jE = qi4Var.e(i4);
                    hq5 hq5Var = (hq5) qi4Var.i(i4);
                    if (b8Var.c(jE)) {
                        boolean z7 = z6;
                        long j = hq5Var.g;
                        long j2 = hq5Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(hq5Var.b().size());
                            List listB = hq5Var.b();
                            int size = listB.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list = listB;
                                m03 m03Var = (m03) listB.get(i5);
                                qi4 qi4Var3 = qi4Var2;
                                long j3 = jE;
                                long j4 = m03Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = m03Var.a;
                                    i55 i55Var = this.f;
                                    i55Var.getClass();
                                    arrayList.add(new m03(j5, i55Var.F(y24Var, j4), m03Var.c, m03Var.d, m03Var.e));
                                }
                                i5++;
                                size = size;
                                listB = list;
                                qi4Var2 = qi4Var3;
                                jE = j3;
                                hq5Var = hq5Var;
                            }
                            qi4 qi4Var4 = qi4Var2;
                            long j6 = jE;
                            i55 i55Var2 = this.f;
                            i55Var2.getClass();
                            long jF = i55Var2.F(y24Var, j);
                            i55 i55Var3 = this.f;
                            i55Var3.getClass();
                            hq5 hq5Var2 = new hq5(hq5Var.a, hq5Var.b, i55Var3.F(y24Var, j2), hq5Var.d, hq5Var.e, hq5Var.f, jF, hq5Var.h, hq5Var.i, arrayList, hq5Var.j, hq5Var.k, hq5Var.l, hq5Var.n);
                            hq5 hq5Var3 = hq5Var.q;
                            if (hq5Var3 == null) {
                                hq5Var3 = hq5Var;
                            }
                            hq5Var2.q = hq5Var3;
                            hq5 hq5Var4 = hq5Var.q;
                            if (hq5Var4 != null) {
                                hq5Var = hq5Var4;
                            }
                            hq5Var2.q = hq5Var;
                            qi4Var4.f(j6, hq5Var2);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i4++;
                    z6 = z5;
                    iH = iH;
                    zA = zA;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (qi4Var2.d()) {
                    b8Var.b = 0;
                    this.a.g();
                    return z9;
                }
                int i6 = b8Var.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (qi4Var.c(((long[]) b8Var.c)[i6]) < 0 && i6 < (i2 = b8Var.b)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = (long[]) b8Var.c;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        b8Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qi4Var2.h());
                int iH2 = qi4Var2.h();
                for (int i10 = 0; i10 < iH2; i10++) {
                    arrayList2.add(qi4Var2.i(i10));
                }
                aq5 aq5Var2 = new aq5(arrayList2, zz2Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (zz2Var.N(((hq5) obj).a)) {
                        break;
                    }
                    i11++;
                }
                hq5 hq5Var5 = (hq5) obj;
                if (hq5Var5 != null) {
                    boolean z10 = hq5Var5.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z10 || hq5Var5.h)) {
                            i55 i55Var4 = this.f;
                            i55Var4.getClass();
                            long j7 = i55Var4.Z;
                            long j8 = hq5Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            z4 = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat > ((float) i12) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z11 = this.h;
                    if (z4 == z11 || !((i = aq5Var2.f) == 3 || i == 4 || i == 5)) {
                        int i13 = aq5Var2.f;
                        if (i13 == 4 && z11 && !this.j) {
                            aq5Var2.f = 3;
                        } else if (i13 == 5 && z4 && z10) {
                            aq5Var2.f = 3;
                        }
                    } else {
                        aq5Var2.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && aq5Var2.f == 3 && (aq5Var = this.g) != null) {
                    ?? r1 = aq5Var.a;
                    int size3 = r1.size();
                    ?? r5 = aq5Var2.a;
                    if (size3 != r5.size()) {
                        z3 = z9;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!z85.b(((hq5) r1.get(r6)).c, ((hq5) r5.get(r6)).c)) {
                            z3 = z9;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z9;
                    break;
                }
                this.g = aq5Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.n55
    public final void b(zz2 zz2Var) {
        super.b(zz2Var);
        aq5 aq5Var = this.g;
        if (aq5Var == null) {
            return;
        }
        this.h = this.i;
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hq5 hq5Var = (hq5) list.get(i);
            boolean z = hq5Var.d;
            long j = hq5Var.a;
            boolean zN = zz2Var.N(j);
            boolean z2 = this.i;
            if ((!z && !zN) || (!z && !z2)) {
                this.d.l(j);
            }
        }
        this.i = false;
        this.j = aq5Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [c15] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [c15] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        c15 c15Var = this.a;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((c55) objArr[i2]).c();
        }
        ?? T = this.c;
        ?? c15Var2 = 0;
        while (T != 0) {
            if (T instanceof kq5) {
                ((kq5) T).I();
            } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                jx4 jx4Var = ((oh1) T).r0;
                int i3 = 0;
                c15Var2 = c15Var2;
                T = T;
                while (jx4Var != null) {
                    if ((jx4Var.Z & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            c15Var2 = c15Var2;
                            T = jx4Var;
                        } else {
                            if (c15Var2 == 0) {
                                c15Var2 = new c15(0, new jx4[16]);
                            }
                            if (T != 0) {
                                c15Var2.b(T);
                                T = 0;
                            }
                            c15Var2.b(jx4Var);
                        }
                    }
                    jx4Var = jx4Var.h0;
                    c15Var2 = c15Var2;
                    T = T;
                }
                if (i3 == 1) {
                }
            }
            T = yn0.T(c15Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [jx4] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(zz2 zz2Var) {
        LayoutNode layoutNode;
        qi4 qi4Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!qi4Var.d()) {
            jx4 jx4Var = this.c;
            if (jx4Var.p0) {
                i55 i55Var = jx4Var.j0;
                if ((i55Var == null || (layoutNode = i55Var.w0) == null) ? false : layoutNode.L()) {
                    aq5 aq5Var = this.g;
                    aq5Var.getClass();
                    i55 i55Var2 = this.f;
                    i55Var2.getClass();
                    long j = i55Var2.Z;
                    ?? T = jx4Var;
                    ?? c15Var = 0;
                    while (T != 0) {
                        if (T instanceof kq5) {
                            ((kq5) T).z(aq5Var, bq5.Z, j);
                        } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                            jx4 jx4Var2 = ((oh1) T).r0;
                            int i = 0;
                            while (jx4Var2 != null) {
                                if ((jx4Var2.Z & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        T = T;
                                        c15Var = c15Var;
                                        c15Var = c15Var;
                                        T = jx4Var2;
                                    } else {
                                        if (c15Var == 0) {
                                            c15Var = new c15(0, new jx4[16]);
                                        }
                                        if (T != 0) {
                                            c15Var.b(T);
                                            T = 0;
                                        }
                                        c15Var.b(jx4Var2);
                                    }
                                } else {
                                    T = T;
                                    c15Var = c15Var;
                                }
                                jx4Var2 = jx4Var2.h0;
                                T = T;
                                c15Var = c15Var;
                            }
                            if (i == 1) {
                                T = T;
                                c15Var = c15Var;
                            } else {
                                T = T;
                                c15Var = c15Var;
                            }
                        }
                        T = yn0.T(c15Var);
                    }
                    if (jx4Var.p0) {
                        c15 c15Var2 = this.a;
                        Object[] objArr = c15Var2.X;
                        int i2 = c15Var2.Z;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((c55) objArr[i3]).d(zz2Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(zz2Var);
        qi4Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [jx4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [jx4] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [jx4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [c15] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [c15] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r6v10, types: [jx4] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [c15] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [c15] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(zz2 zz2Var, boolean z) {
        LayoutNode layoutNode;
        if (!this.e.d()) {
            ?? T = this.c;
            if (T.p0) {
                i55 i55Var = T.j0;
                if ((i55Var == null || (layoutNode = i55Var.w0) == null) ? false : layoutNode.L()) {
                    aq5 aq5Var = this.g;
                    aq5Var.getClass();
                    i55 i55Var2 = this.f;
                    i55Var2.getClass();
                    long j = i55Var2.Z;
                    ?? T2 = T;
                    ?? c15Var = 0;
                    while (T2 != 0) {
                        if (T2 instanceof kq5) {
                            ((kq5) T2).z(aq5Var, bq5.X, j);
                        } else if ((T2.Z & 16) != 0 && (T2 instanceof oh1)) {
                            jx4 jx4Var = ((oh1) T2).r0;
                            int i = 0;
                            while (jx4Var != null) {
                                if ((jx4Var.Z & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        T2 = T2;
                                        c15Var = c15Var;
                                        c15Var = c15Var;
                                        T2 = jx4Var;
                                    } else {
                                        if (c15Var == 0) {
                                            c15Var = new c15(0, new jx4[16]);
                                        }
                                        if (T2 != 0) {
                                            c15Var.b(T2);
                                            T2 = 0;
                                        }
                                        c15Var.b(jx4Var);
                                    }
                                } else {
                                    T2 = T2;
                                    c15Var = c15Var;
                                }
                                jx4Var = jx4Var.h0;
                                T2 = T2;
                                c15Var = c15Var;
                            }
                            if (i == 1) {
                                T2 = T2;
                                c15Var = c15Var;
                            } else {
                                T2 = T2;
                                c15Var = c15Var;
                            }
                        }
                        T2 = yn0.T(c15Var);
                    }
                    if (T.p0) {
                        c15 c15Var2 = this.a;
                        Object[] objArr = c15Var2.X;
                        int i2 = c15Var2.Z;
                        for (int i3 = 0; i3 < i2; i3++) {
                            c55 c55Var = (c55) objArr[i3];
                            this.f.getClass();
                            c55Var.e(zz2Var, z);
                        }
                    }
                    if (T.p0) {
                        ?? c15Var3 = 0;
                        while (T != 0) {
                            if (T instanceof kq5) {
                                ((kq5) T).z(aq5Var, bq5.Y, j);
                            } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                                jx4 jx4Var2 = ((oh1) T).r0;
                                int i4 = 0;
                                while (jx4Var2 != null) {
                                    if ((jx4Var2.Z & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            T = T;
                                            c15Var3 = c15Var3;
                                            c15Var3 = c15Var3;
                                            T = jx4Var2;
                                        } else {
                                            if (c15Var3 == 0) {
                                                c15Var3 = new c15(0, new jx4[16]);
                                            }
                                            if (T != 0) {
                                                c15Var3.b(T);
                                                T = 0;
                                            }
                                            c15Var3.b(jx4Var2);
                                        }
                                    } else {
                                        T = T;
                                        c15Var3 = c15Var3;
                                    }
                                    jx4Var2 = jx4Var2.h0;
                                    T = T;
                                    c15Var3 = c15Var3;
                                }
                                if (i4 == 1) {
                                    T = T;
                                    c15Var3 = c15Var3;
                                } else {
                                    T = T;
                                    c15Var3 = c15Var3;
                                }
                            }
                            T = yn0.T(c15Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, j05 j05Var) {
        b8 b8Var = this.d;
        if (b8Var.c(j) && !j05Var.e(this)) {
            b8Var.l(j);
            this.e.g(j);
        }
        c15 c15Var = this.a;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            ((c55) objArr[i2]).f(j, j05Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
