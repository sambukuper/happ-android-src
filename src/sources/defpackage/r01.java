package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 implements l01 {
    public final m01 X;
    public final ml8 Y;
    public final AtomicReference Z = new AtomicReference(null);
    public final Object f0 = new Object();
    public final v05 g0;
    public final yb7 h0;
    public final s05 i0;
    public final t05 j0;
    public final t05 k0;
    public final s05 l0;
    public final ep0 m0;
    public final ep0 n0;
    public final s05 o0;
    public s05 p0;
    public boolean q0;
    public u87 r0;
    public mj5 s0;
    public r01 t0;
    public int u0;
    public final yr2 v0;
    public final p91 w0;
    public final lp2 x0;
    public byte y0;

    public r01(m01 m01Var, ml8 ml8Var) {
        this.X = m01Var;
        this.Y = ml8Var;
        t05 t05Var = new t05();
        v05 v05Var = t05Var.e;
        if (v05Var == null) {
            v05Var = new v05(t05Var);
            t05Var.e = v05Var;
        }
        v05 v05Var2 = v05Var;
        this.g0 = v05Var2;
        yb7 yb7Var = new yb7();
        if (m01Var.d()) {
            yb7Var.m0 = new vz4();
        }
        if (m01Var.f()) {
            yb7Var.b();
        }
        this.h0 = yb7Var;
        this.i0 = w39.n();
        this.j0 = new t05();
        this.k0 = new t05();
        this.l0 = w39.n();
        ep0 ep0Var = new ep0();
        this.m0 = ep0Var;
        ep0 ep0Var2 = new ep0();
        this.n0 = ep0Var2;
        this.o0 = w39.n();
        this.p0 = w39.n();
        yr2 yr2Var = new yr2((Object) m01Var, (byte) 16);
        this.v0 = yr2Var;
        this.w0 = new p91((byte) 2);
        lp2 lp2Var = new lp2(ml8Var, m01Var, ac7.a(yb7Var), v05Var2, ep0Var, ep0Var2, yr2Var, this);
        m01Var.p(lp2Var);
        this.x0 = lp2Var;
    }

    public final void A(rn2 rn2Var) {
        boolean zI = i();
        q();
        m01 m01Var = this.X;
        if (!zI) {
            m01Var.a(this, rn2Var);
            return;
        }
        lp2 lp2Var = this.x0;
        lp2Var.z = 0;
        lp2Var.y = true;
        m01Var.a(this, rn2Var);
        if (lp2Var.F || lp2Var.z != 0) {
            wr5.a("Cannot disable reuse from root if it was caused by other groups");
        }
        lp2Var.z = -1;
        lp2Var.y = false;
    }

    public final void a() {
        this.Z.set(null);
        this.m0.i0.Y();
        this.n0.i0.Y();
        v05 v05Var = this.g0;
        if (v05Var.X.g()) {
            return;
        }
        p91 p91Var = this.w0;
        try {
            p91Var.l(v05Var, this.x0.y());
            p91Var.c();
        } finally {
            p91Var.b();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.i0.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof t05;
        di3 di3Var = di3.X;
        t05 t05Var = this.j0;
        t05 t05Var2 = this.k0;
        s05 s05Var = this.o0;
        if (!z2) {
            j86 j86Var = (j86) objG;
            if (w39.i0(s05Var, obj, j86Var) || j86Var.b(obj) == di3Var) {
                return;
            }
            if (j86Var.g == null || z) {
                t05Var.a(j86Var);
                return;
            } else {
                t05Var2.a(j86Var);
                return;
            }
        }
        t05 t05Var3 = (t05) objG;
        Object[] objArr = t05Var3.b;
        long[] jArr = t05Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        j86 j86Var2 = (j86) objArr[(i << 3) + i3];
                        if (!w39.i0(s05Var, obj, j86Var2) && j86Var2.b(obj) != di3Var) {
                            if (j86Var2.g == null || z) {
                                t05Var.a(j86Var2);
                            } else {
                                t05Var2.a(j86Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof ww6;
        s05 s05Var = this.l0;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            t05 t05Var = ((ww6) set).X;
            Object[] objArr = t05Var.b;
            long[] jArr9 = t05Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof j86) {
                                    ((j86) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = s05Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof t05) {
                                            t05 t05Var2 = (t05) objG;
                                            Object[] objArr2 = t05Var2.b;
                                            long[] jArr10 = t05Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                b((zi1) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            b((zi1) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof j86) {
                    ((j86) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = s05Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof t05) {
                            t05 t05Var3 = (t05) objG2;
                            Object[] objArr3 = t05Var3.b;
                            long[] jArr12 = t05Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((zi1) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((zi1) objG2, z);
                        }
                    }
                }
            }
        }
        s05 s05Var2 = this.i0;
        t05 t05Var4 = this.j0;
        if (z) {
            t05 t05Var5 = this.k0;
            if (t05Var5.h()) {
                long[] jArr13 = s05Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = s05Var2.b[i18];
                                    Object obj5 = s05Var2.c[i18];
                                    if (obj5 instanceof t05) {
                                        t05 t05Var6 = (t05) obj5;
                                        Object[] objArr4 = t05Var6.b;
                                        long[] jArr14 = t05Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            j86 j86Var = (j86) objArr5[i22];
                                                            if (t05Var5.c(j86Var) || t05Var4.c(j86Var)) {
                                                                t05Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = t05Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        j86 j86Var2 = (j86) obj5;
                                        zG = t05Var5.c(j86Var2) || t05Var4.c(j86Var2);
                                    }
                                    if (zG) {
                                        s05Var2.k(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                t05Var5.b();
                h();
                return;
            }
        }
        if (t05Var4.h()) {
            long[] jArr16 = s05Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = s05Var2.b[i26];
                                Object obj7 = s05Var2.c[i26];
                                if (obj7 instanceof t05) {
                                    t05 t05Var7 = (t05) obj7;
                                    Object[] objArr6 = t05Var7.b;
                                    long[] jArr17 = t05Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (t05Var4.c((j86) objArr7[i30])) {
                                                            t05Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = t05Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = t05Var4.c((j86) obj7);
                                }
                                if (zC) {
                                    s05Var2.k(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            h();
            t05Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f0) {
            try {
                e(this.m0);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.g0.X.g()) {
                        p91 p91Var = this.w0;
                        try {
                            p91Var.l(this.g0, this.x0.y());
                            p91Var.c();
                        } finally {
                            p91Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void e(ep0 ep0Var) throws Throwable {
        p91 p91Var;
        long[] jArr;
        int i;
        long[] jArr2;
        p91 p91Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        ep0 ep0Var2 = this.n0;
        lp2 lp2Var = this.x0;
        p01 p01VarY = lp2Var.y();
        p91 p91Var3 = this.w0;
        p91Var3.l(this.g0, p01VarY);
        try {
            if (ep0Var.i0.a0()) {
                try {
                    if (ep0Var2.i0.a0() && this.s0 == null) {
                        p91Var3.c();
                    }
                    return;
                } finally {
                    p91Var3.b();
                }
            }
            mj5 mj5Var = this.s0;
            rs rsVar = mj5Var != null ? mj5Var.l : this.Y;
            try {
                Trace.beginSection(rsVar.equals(mj5Var != null ? mj5Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    mj5 mj5Var2 = this.s0;
                    p91 p91Var4 = mj5Var2 != null ? mj5Var2.k : p91Var3;
                    yb7 yb7Var = this.h0;
                    p01 p01VarY2 = lp2Var.y();
                    bc7 bc7VarE = ac7.a(yb7Var).e();
                    int i3 = 0;
                    try {
                        ep0Var.v0(rsVar, bc7VarE, p91Var4, p01VarY2);
                        bc7VarE.e(true);
                        rsVar.o();
                        Trace.endSection();
                        p91Var3.d();
                        p91Var3.e();
                        if (this.q0) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.q0 = false;
                                s05 s05Var = this.i0;
                                long[] jArr3 = s05Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = s05Var.b[i8];
                                                    Object obj2 = s05Var.c[i8];
                                                    if (obj2 instanceof t05) {
                                                        t05 t05Var = (t05) obj2;
                                                        Object[] objArr = t05Var.b;
                                                        long[] jArr4 = t05Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        p91Var2 = p91Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((j86) objArr[i13]).a()) {
                                                                                    t05Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = t05Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        p91Var2 = p91Var3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((j86) obj2).a();
                                                    }
                                                    if (zG) {
                                                        s05Var.k(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    p91Var2 = p91Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                p91Var3 = p91Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            p91Var = p91Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            p91Var = p91Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        p91Var3 = p91Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    p91Var = p91Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            p91Var = p91Var3;
                        }
                        try {
                            if (ep0Var2.i0.a0() && this.s0 == null) {
                                p91Var.c();
                            }
                            return;
                        } finally {
                            p91Var.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            bc7VarE.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (ep0Var2.i0.a0() && this.s0 == null) {
                p91Var3.c();
            }
            throw th;
        } finally {
            p91Var3.b();
        }
    }

    public final void f() {
        synchronized (this.f0) {
            try {
                ep0 ep0Var = this.n0;
                ep0Var.getClass();
                if (!ep0Var.i0.a0()) {
                    e(this.n0);
                }
            } catch (Throwable th) {
                try {
                    if (!this.g0.X.g()) {
                        p91 p91Var = this.w0;
                        try {
                            p91Var.l(this.g0, this.x0.y());
                            p91Var.c();
                        } finally {
                            p91Var.b();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f0) {
            try {
                this.x0.v = null;
                if (!this.g0.X.g()) {
                    p91 p91Var = this.w0;
                    try {
                        p91Var.l(this.g0, this.x0.y());
                        p91Var.c();
                        p91Var.b();
                    } catch (Throwable th) {
                        p91Var.b();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.g0.X.g()) {
                        p91 p91Var2 = this.w0;
                        try {
                            p91Var2.l(this.g0, this.x0.y());
                            p91Var2.c();
                        } finally {
                            p91Var2.b();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        s05 s05Var = this.l0;
        long[] jArr3 = s05Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = s05Var.b[i10];
                            Object obj2 = s05Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof t05;
                            j5 = j8;
                            s05 s05Var2 = this.i0;
                            if (z) {
                                t05 t05Var = (t05) obj2;
                                Object[] objArr = t05Var.b;
                                long[] jArr4 = t05Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!s05Var2.c((zi1) objArr[i15])) {
                                                        t05Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = t05Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !s05Var2.c((zi1) obj2);
                            }
                            if (zG) {
                                s05Var.k(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        t05 t05Var2 = this.k0;
        if (!t05Var2.h()) {
            return;
        }
        Object[] objArr2 = t05Var2.b;
        long[] jArr5 = t05Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((j86) objArr2[i20]).g == null) {
                            t05Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.f0) {
            z = true;
            if (this.y0 != 1) {
                z = false;
            }
            if (z) {
                this.y0 = (byte) 0;
            }
        }
        return z;
    }

    public final void j(rn2 rn2Var) {
        try {
            synchronized (this.f0) {
                n();
                s05 s05Var = this.p0;
                this.p0 = w39.n();
                try {
                    lp2 lp2Var = this.x0;
                    u87 u87Var = this.r0;
                    if (!lp2Var.e.i0.a0()) {
                        d01.a("Expected applyChanges() to have been called");
                    }
                    lp2Var.P = u87Var;
                    try {
                        lp2Var.n(s05Var, rn2Var);
                        lp2Var.P = null;
                    } catch (Throwable th) {
                        lp2Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.p0 = s05Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.g0.X.g()) {
                    p91 p91Var = this.w0;
                    try {
                        p91Var.l(this.g0, this.x0.y());
                        p91Var.c();
                    } finally {
                        p91Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final mj5 k(boolean z, rn2 rn2Var) {
        if (this.s0 != null) {
            wr5.b("A pausable composition is in progress");
        }
        mj5 mj5Var = new mj5(this, this.X, this.x0, this.g0, rn2Var, z, this.Y, this.f0);
        this.s0 = mj5Var;
        return mj5Var;
    }

    public final void l() {
        synchronized (this.f0) {
            try {
                if (this.s0 != null) {
                    wr5.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.h0.Y == 0;
                if (!z || !this.g0.X.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        p91 p91Var = this.w0;
                        try {
                            p91Var.l(this.g0, this.x0.y());
                            if (!z) {
                                yb7 yb7Var = this.h0;
                                p91 p91Var2 = this.w0;
                                bc7 bc7VarE = yb7Var.e();
                                try {
                                    bc7VarE.m(bc7VarE.t, new i9(p91Var2, bc7VarE, (byte) 9));
                                    bc7VarE.e(true);
                                    this.Y.o();
                                    p91Var.d();
                                } catch (Throwable th) {
                                    bc7VarE.e(false);
                                    throw th;
                                }
                            }
                            p91Var.c();
                            p91Var.b();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            p91Var.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.i0.a();
                this.l0.a();
                this.p0.a();
                this.m0.i0.Y();
                this.n0.i0.Y();
                lp2 lp2Var = this.x0;
                lp2Var.E.clear();
                lp2Var.s.clear();
                lp2Var.e.i0.Y();
                lp2Var.v = null;
                this.y0 = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.f0) {
            try {
                if (this.x0.F) {
                    wr5.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.y0 != 3) {
                    this.y0 = (byte) 3;
                    ep0 ep0Var = this.x0.L;
                    if (ep0Var != null) {
                        e(ep0Var);
                    }
                    boolean z = this.h0.Y == 0;
                    if (!z || !this.g0.X.g()) {
                        p91 p91Var = this.w0;
                        try {
                            p91Var.l(this.g0, this.x0.y());
                            if (!z) {
                                yb7 yb7Var = this.h0;
                                p91 p91Var2 = this.w0;
                                bc7 bc7VarE = yb7Var.e();
                                try {
                                    bc7VarE.m(bc7VarE.t, new b1(p91Var2, (byte) 5));
                                    bc7VarE.G();
                                    bc7VarE.e(true);
                                    this.Y.a();
                                    this.Y.o();
                                    p91Var.d();
                                } catch (Throwable th) {
                                    bc7VarE.e(false);
                                    throw th;
                                }
                            }
                            p91Var.c();
                            p91Var.b();
                        } catch (Throwable th2) {
                            p91Var.b();
                            throw th2;
                        }
                    }
                    this.o0.a();
                    lp2 lp2Var = this.x0;
                    lp2Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        lp2Var.b.u(lp2Var);
                        lp2Var.E.clear();
                        lp2Var.s.clear();
                        lp2Var.e.i0.Y();
                        lp2Var.v = null;
                        lp2Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.X.v(this);
    }

    public final void n() {
        Object obj = os4.Y;
        AtomicReference atomicReference = this.Z;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                d01.b("pending composition has not been applied");
                b61.n();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                d01.b("corrupt pendingModifications drain: " + atomicReference);
                b61.n();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.Z;
        Object andSet = atomicReference.getAndSet(null);
        if (dh3.f(andSet, os4.Y)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.s0 == null) {
                d01.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            d01.b("corrupt pendingModifications drain: " + atomicReference);
            b61.n();
        }
    }

    public final void p() {
        m02 m02Var = m02.X;
        AtomicReference atomicReference = this.Z;
        Object andSet = atomicReference.getAndSet(m02Var);
        if (dh3.f(andSet, os4.Y) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            d01.b("corrupt pendingModifications drain: " + atomicReference);
            b61.n();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        byte b = this.y0;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? _UrlKt.FRAGMENT_ENCODE_SET : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            wr5.b(str);
        }
        if (this.s0 == null) {
            return;
        }
        wr5.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        v05 v05Var = this.g0;
        lp2 lp2Var = this.x0;
        if (arrayList.size() > 0) {
            ((wy4) ((qg5) arrayList.get(0)).X).getClass();
            d01.a("Check failed");
        }
        try {
            lp2Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    lp2Var.A(arrayList);
                    lp2Var.i();
                    Trace.endSection();
                } catch (Throwable th) {
                    lp2Var.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!v05Var.X.g()) {
                    p91 p91Var = this.w0;
                    try {
                        p91Var.l(v05Var, lp2Var.y());
                        p91Var.c();
                    } finally {
                        p91Var.b();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final di3 s(j86 j86Var, Object obj) {
        r01 r01Var;
        int i = j86Var.b;
        if ((i & 2) != 0) {
            j86Var.b = i | 4;
        }
        gp2 gp2Var = j86Var.c;
        if (gp2Var == null || !gp2Var.a()) {
            return di3.X;
        }
        yb7 yb7Var = this.h0;
        yb7Var.getClass();
        gp2 gp2Var2 = j86Var.c;
        if (gp2Var2 != null && yb7Var.f(oc.e(gp2Var2))) {
            if (j86Var.d == null) {
                return di3.X;
            }
            di3 di3VarT = t(j86Var, gp2Var, obj);
            if (di3VarT != di3.X) {
                this.v0.l();
            }
            return di3VarT;
        }
        synchronized (this.f0) {
            r01Var = this.t0;
        }
        if (r01Var != null) {
            lp2 lp2Var = r01Var.x0;
            if (lp2Var.F && lp2Var.b0(j86Var, obj)) {
                return di3.f0;
            }
        }
        return di3.X;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final di3 t(j86 j86Var, gp2 gp2Var, Object obj) {
        synchronized (this.f0) {
            try {
                r01 r01Var = this.t0;
                r01 r01Var2 = null;
                if (r01Var != null) {
                    yb7 yb7Var = this.h0;
                    int i = this.u0;
                    if (yb7Var.i0) {
                        d01.a("Writer is active");
                    }
                    if (i < 0 || i >= yb7Var.Y) {
                        d01.a("Invalid group index");
                    }
                    gp2 gp2VarE = oc.e(gp2Var);
                    if (yb7Var.f(gp2VarE)) {
                        int i2 = yb7Var.X[(i * 5) + 3] + i;
                        int i3 = gp2VarE.a;
                        if (i > i3 || i3 >= i2) {
                            r01Var = null;
                        }
                    } else {
                        r01Var = null;
                    }
                    r01Var2 = r01Var;
                }
                if (r01Var2 == null) {
                    lp2 lp2Var = this.x0;
                    if (lp2Var.F && lp2Var.b0(j86Var, obj)) {
                        return di3.f0;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof zi1;
                        s05 s05Var = this.p0;
                        if (z) {
                            Object objG = s05Var.g(j86Var);
                            if (objG == null) {
                                w39.g(this.p0, j86Var, obj);
                                break;
                            }
                            if (objG instanceof t05) {
                                t05 t05Var = (t05) objG;
                                Object[] objArr = t05Var.b;
                                long[] jArr = t05Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    w39.g(this.p0, j86Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == qe4.s0) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        w39.g(this.p0, j86Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        w39.g(this.p0, j86Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != qe4.s0) {
                                    w39.g(this.p0, j86Var, obj);
                                    break;
                                }
                            }
                        } else {
                            s05Var.l(j86Var, qe4.s0);
                        }
                    } else {
                        this.p0.l(j86Var, qe4.s0);
                    }
                }
                if (r01Var2 != null) {
                    return r01Var2.t(j86Var, gp2Var, obj);
                }
                this.X.l(this);
                return this.x0.F ? di3.Z : di3.Y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.i0.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof t05;
        di3 di3Var = di3.f0;
        s05 s05Var = this.o0;
        if (!z) {
            j86 j86Var = (j86) objG;
            if (j86Var.b(obj) != di3Var || (obj instanceof zi1)) {
                return;
            }
            w39.g(s05Var, obj, j86Var);
            return;
        }
        t05 t05Var = (t05) objG;
        Object[] objArr = t05Var.b;
        long[] jArr = t05Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        j86 j86Var2 = (j86) objArr[(i << 3) + i3];
                        if (j86Var2.b(obj) == di3Var && !(obj instanceof zi1)) {
                            w39.g(s05Var, obj, j86Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof ww6;
        s05 s05Var = this.l0;
        s05 s05Var2 = this.i0;
        if (z) {
            t05 t05Var = ((ww6) set).X;
            Object[] objArr = t05Var.b;
            long[] jArr = t05Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (s05Var2.c(obj) || s05Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (s05Var2.c(obj2) || s05Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.f0) {
            mj5 mj5Var = this.s0;
            boolean z = false;
            if (mj5Var != null && (mj5Var.h.get() != oj5.g0 || mj5Var.i != ry7.f())) {
                AtomicReference atomicReference = mj5Var.h;
                oj5 oj5Var = oj5.h0;
                oj5 oj5Var2 = oj5.f0;
                while (!atomicReference.compareAndSet(oj5Var, oj5Var2) && atomicReference.get() == oj5Var) {
                }
                mj5Var.l.X.a(9);
                return false;
            }
            n();
            try {
                s05 s05Var = this.p0;
                this.p0 = w39.n();
                try {
                    lp2 lp2Var = this.x0;
                    u87 u87Var = this.r0;
                    wc5 wc5Var = lp2Var.e.i0;
                    if (!wc5Var.a0()) {
                        d01.a("Expected applyChanges() to have been called");
                    }
                    if (s05Var.e > 0 || !lp2Var.s.isEmpty()) {
                        lp2Var.P = u87Var;
                        try {
                            lp2Var.n(s05Var, null);
                            lp2Var.P = null;
                            z = !wc5Var.a0();
                        } catch (Throwable th) {
                            lp2Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.p0 = s05Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.g0.X.g()) {
                        p91 p91Var = this.w0;
                        try {
                            p91Var.l(this.g0, this.x0.y());
                            p91Var.c();
                        } finally {
                            p91Var.b();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(ww6 ww6Var) {
        Object obj;
        while (true) {
            Object obj2 = this.Z.get();
            if (obj2 == null || obj2.equals(os4.Y)) {
                obj = ww6Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, ww6Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    kp5.q(this.Z, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = ww6Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.Z;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f0) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        j86 j86VarW;
        int i;
        boolean z;
        lp2 lp2Var = this.x0;
        if (lp2Var.A <= 0 && (j86VarW = lp2Var.w()) != null) {
            int i2 = j86VarW.b | 1;
            j86VarW.b = i2;
            if ((i2 & 32) == 0) {
                f05 f05Var = j86VarW.f;
                if (f05Var == null) {
                    f05Var = new f05();
                    j86VarW.f = f05Var;
                }
                int i3 = j86VarW.e;
                int iC = f05Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = f05Var.c[iC];
                }
                f05Var.b[iC] = obj;
                f05Var.c[iC] = i3;
                if (i == j86VarW.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.v0.l();
            if (z) {
                return;
            }
            if (obj instanceof zh7) {
                ((zh7) obj).k(1);
            }
            w39.g(this.i0, obj, j86VarW);
            if (obj instanceof zi1) {
                zi1 zi1Var = (zi1) obj;
                yi1 yi1VarM = zi1Var.m();
                s05 s05Var = this.l0;
                w39.j0(s05Var, obj);
                f05 f05Var2 = yi1VarM.e;
                Object[] objArr = f05Var2.b;
                long[] jArr = f05Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    yh7 yh7Var = (yh7) objArr[(i4 << 3) + i7];
                                    if (yh7Var instanceof zh7) {
                                        ((zh7) yh7Var).k(1);
                                    }
                                    w39.g(s05Var, yh7Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = yi1VarM.f;
                s05 s05Var2 = j86VarW.g;
                if (s05Var2 == null) {
                    s05Var2 = new s05();
                    j86VarW.g = s05Var2;
                }
                s05Var2.l(zi1Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.f0) {
            try {
                u(obj);
                Object objG = this.l0.g(obj);
                if (objG != null) {
                    if (objG instanceof t05) {
                        t05 t05Var = (t05) objG;
                        Object[] objArr = t05Var.b;
                        long[] jArr = t05Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((zi1) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((zi1) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
