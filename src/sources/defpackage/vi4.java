package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vi4 extends eo5 implements zr4, jy4, nf5 {
    public static final uh3 u0 = new uh3((byte) 18);
    public static final uh3 v0 = new uh3((byte) 19);
    public ti4 h0;
    public gn2 i0;
    public rn2 j0;
    public gn2 k0;
    public go5 l0;
    public s05 m0;
    public boolean n0;
    public s05 o0;
    public boolean p0;
    public boolean q0;
    public final wi4 r0 = new wi4(this, 0);
    public d7 s0;
    public s05 t0;

    public static void z0(i55 i55Var) {
        o34 o34Var;
        i55 i55Var2 = i55Var.x0;
        LayoutNode layoutNode = i55Var.w0;
        if (!dh3.f(i55Var2 != null ? i55Var2.w0 : null, layoutNode)) {
            layoutNode.I0.p.A0.f();
            return;
        }
        v8 v8VarF = layoutNode.I0.p.f();
        if (v8VarF == null || (o34Var = ((wr4) v8VarF).A0) == null) {
            return;
        }
        o34Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B0(t05 t05Var) {
        LayoutNode layoutNode;
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
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((b09) objArr[(i << 3) + i3]).get()) != null) {
                        if (c0()) {
                            layoutNode.V(false);
                        } else {
                            layoutNode.X(false);
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

    public abstract void F0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void I0() {
        d7 d7Var = this.s0;
        if (d7Var != null) {
            int i = d7Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((w03[]) d7Var.c)[i2] = null;
                ((float[]) d7Var.d)[i2] = Float.NaN;
                ((byte[]) d7Var.e)[i2] = 0;
            }
            d7Var.b = 0;
        }
        s05 s05Var = this.t0;
        if (s05Var == null) {
            return;
        }
        Object[] objArr = s05Var.c;
        long[] jArr = s05Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            B0((t05) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        s05Var.a();
    }

    @Override // defpackage.eo5
    public final int N(r8 r8Var) {
        int iE0;
        if (!q0() || (iE0 = e0(r8Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = r8Var instanceof iv8;
        long j = this.g0;
        return iE0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(LayoutNode layoutNode, w03 w03Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        s05 s05Var = this.t0;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (s05Var != null) {
            Object[] objArr = s05Var.c;
            long[] jArr3 = s05Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                t05 t05Var = (t05) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = t05Var.b;
                                long[] jArr4 = t05Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((b09) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean zK = layoutNode2.K();
                                                        i4 = i8;
                                                        if (zK) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    t05Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        s05 s05Var2 = this.t0;
        if (s05Var2 != null) {
            long[] jArr5 = s05Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((t05) s05Var2.c[i18]).g()) {
                                    s05Var2.k(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        s05 s05Var3 = this.t0;
        if (s05Var3 == null) {
            s05Var3 = new s05();
            this.t0 = s05Var3;
        }
        Object objG = s05Var3.g(w03Var);
        if (objG == null) {
            objG = new t05();
            s05Var3.l(w03Var, objG);
        }
        ((t05) objG).k(new b09(layoutNode));
    }

    @Override // defpackage.ug3
    public boolean c0() {
        return false;
    }

    public abstract int e0(r8 r8Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(final go5 go5Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        of5 snapshotObserver;
        s05 s05Var = this.t0;
        d7 d7Var = this.s0;
        if (d7Var == null) {
            d7Var = new d7();
            this.s0 = d7Var;
        }
        d7 d7Var2 = d7Var;
        mf5 mf5Var = r0().q0;
        if (mf5Var != null && (snapshotObserver = mf5Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.c(go5Var, u0, new dn2() { // from class: si4
                @Override // defpackage.dn2
                public final Object invoke() {
                    vi4 vi4Var = this.X;
                    vi4Var.y0().X = false;
                    vi4Var.y0().Y = j;
                    vi4Var.y0().Z = j2;
                    gn2 gn2VarG = go5Var.X.g();
                    if (gn2VarG != null) {
                        gn2VarG.B(vi4Var.y0());
                    }
                    return dn8.a;
                }
            });
        }
        boolean zC0 = c0();
        t05 t05Var = (t05) d7Var2.f;
        t05 t05Var2 = (t05) d7Var2.g;
        int i2 = d7Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) d7Var2.e)[i3];
            if (b == 3) {
                w03 w03Var = ((w03[]) d7Var2.c)[i3];
                w03Var.getClass();
                t05Var2.k(w03Var);
            } else if (b != 0 && s05Var != null) {
                w03 w03Var2 = ((w03[]) d7Var2.c)[i3];
                w03Var2.getClass();
                t05 t05Var3 = (t05) s05Var.j(w03Var2);
                if (t05Var3 != null) {
                    t05Var.j(t05Var3);
                }
            }
        }
        int i4 = d7Var2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) d7Var2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                w03[] w03VarArr = (w03[]) d7Var2.c;
                w03VarArr[i6 - i5] = w03VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = d7Var2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((w03[]) d7Var2.c)[i8] = null;
        }
        d7Var2.b -= i5;
        vi4 vi4VarT0 = t0();
        Object[] objArr = t05Var2.b;
        long[] jArr = t05Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            w03 w03Var3 = (w03) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            vi4 vi4Var = vi4VarT0 == null ? this : vi4VarT0;
                            i = i9;
                            vi4 vi4Var2 = vi4Var;
                            while (true) {
                                d7 d7Var3 = vi4Var2.s0;
                                if (d7Var3 != null) {
                                    z2 = zC0;
                                    if (eu.Z(w03Var3, (w03[]) d7Var3.c)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zC0;
                                vi4 vi4VarT1 = vi4Var2.t0();
                                if (vi4VarT1 == null) {
                                    break;
                                }
                                vi4Var2 = vi4VarT1;
                                zC0 = z2;
                            }
                            s05 s05Var2 = vi4Var2.t0;
                            t05 t05Var4 = s05Var2 != null ? (t05) s05Var2.j(w03Var3) : null;
                            if (t05Var4 != null) {
                                vi4Var.B0(t05Var4);
                            }
                        } else {
                            z2 = zC0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zC0 = z2;
                    }
                    z = zC0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zC0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zC0 = z;
                i9 = 8;
            }
        } else {
            z = zC0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        t05Var2.b();
        Object[] objArr2 = t05Var.b;
        long[] jArr2 = t05Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((b09) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.V(false);
                            } else {
                                layoutNode.X(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        t05Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void j0(yr4 yr4Var) {
        long j;
        char c;
        long j2;
        long j3;
        ti4 ti4Var;
        s05 s05Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        d7 d7Var;
        s05 s05Var2;
        t05 t05Var;
        ti4 ti4Var2;
        long j4;
        if (this.q0) {
            return;
        }
        gn2 gn2VarG = yr4Var.g();
        rn2 rn2VarF = yr4Var.f();
        gn2 gn2VarE = yr4Var.e();
        long j5 = 0;
        if (rn2VarF == null) {
            long jM = 9223372034707292159L;
            if (gn2VarG == null) {
                I0();
                this.i0 = null;
                this.j0 = null;
                this.k0 = null;
                ti4 ti4Var3 = this.h0;
                if (ti4Var3 != null) {
                    ti4Var3.X = false;
                }
                if (ti4Var3 != null) {
                    ti4Var3.Y = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.j0 = null;
            this.k0 = null;
            boolean z2 = this.i0 != gn2VarG;
            if (!z2 && y0().X) {
                y24 y24VarM0 = m0();
                jM = nr4.M(y24VarM0.n(0L));
                j5 = y24VarM0.j();
                z2 = (hf3.a(jM, y0().Y) && pf3.a(j5, y0().Z)) ? false : true;
            }
            if (z2) {
                go5 go5Var = this.l0;
                if (go5Var != null) {
                    go5Var.X = yr4Var;
                } else {
                    go5Var = new go5(yr4Var, this, null);
                    this.l0 = go5Var;
                }
                i0(go5Var, jM, j5);
                this.i0 = yr4Var.g();
                return;
            }
            return;
        }
        if (rn2VarF != this.j0 || gn2VarE != this.k0) {
            this.j0 = rn2VarF;
            this.k0 = gn2VarE;
            I0();
            return;
        }
        s05 s05Var3 = this.o0;
        long j6 = -9187201950435737472L;
        int i3 = 8;
        if (s05Var3 != null) {
            Object[] objArr3 = s05Var3.c;
            long[] jArr3 = s05Var3.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                ti4Var2 = null;
                while (true) {
                    long j7 = jArr3[i4];
                    j3 = 255;
                    if ((((~j7) << 7) & j7 & j6) != j6) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j7 & 255) < 128) {
                                j4 = j6;
                                ti4 ti4Var4 = (ti4) objArr3[(i4 << 3) + i6];
                                if (ti4Var4.X) {
                                    ti4Var2 = ti4Var4;
                                }
                            } else {
                                j4 = j6;
                            }
                            j7 >>= 8;
                            i6++;
                            j6 = j4;
                        }
                        j = j6;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j6;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j6 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                ti4Var2 = null;
            }
            ti4Var = ti4Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            ti4Var = null;
        }
        if (ti4Var == null) {
            return;
        }
        y24 y24VarM1 = m0();
        long jM2 = nr4.M(y24VarM1.n(0L));
        long j8 = y24VarM1.j();
        if ((hf3.a(jM2, ti4Var.Y) && pf3.a(j8, ti4Var.Z)) || (s05Var = this.o0) == null) {
            return;
        }
        Object[] objArr4 = s05Var.b;
        Object[] objArr5 = s05Var.c;
        long[] jArr4 = s05Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j9 = jArr4[i7];
            int i8 = length2;
            if ((((~j9) << c) & j9 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j9 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        ti4 ti4Var5 = (ti4) objArr5[i11];
                        i2 = i3;
                        w03 w03Var = (w03) obj;
                        jArr2 = jArr4;
                        if (ti4Var5.X) {
                            objArr2 = objArr4;
                            z = (pf3.a(ti4Var5.Z, j8) && hf3.a(ti4Var5.Y, jM2)) ? false : true;
                            ti4Var5.Z = j8;
                            ti4Var5.Y = jM2;
                            ti4Var5.X = false;
                            if (!z) {
                                d7Var = this.s0;
                                if (d7Var != null) {
                                    d7Var.K(w03Var);
                                }
                                s05Var2 = this.t0;
                                if (s05Var2 != null) {
                                    t05Var = (t05) s05Var2.g(w03Var);
                                } else {
                                    t05Var = null;
                                }
                                if (t05Var != null) {
                                    B0(t05Var);
                                    t05Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        ti4Var5.Z = j8;
                        ti4Var5.Y = jM2;
                        ti4Var5.X = false;
                        if (!z) {
                            d7Var = this.s0;
                            if (d7Var != null) {
                                d7Var.K(w03Var);
                            }
                            s05Var2 = this.t0;
                            if (s05Var2 != null) {
                                t05Var = (t05) s05Var2.g(w03Var);
                            } else {
                                t05Var = null;
                            }
                            if (t05Var != null) {
                                B0(t05Var);
                                t05Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j9 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract vi4 l0();

    public abstract y24 m0();

    public abstract boolean q0();

    public abstract LayoutNode r0();

    public abstract yr4 s0();

    public boolean t() {
        return r0().K();
    }

    public abstract vi4 t0();

    @Override // defpackage.zr4
    public final yr4 u(int i, int i2, Map map, gn2 gn2Var, gn2 gn2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wc3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ui4(i, i2, map, gn2Var, gn2Var2, this);
    }

    public abstract long u0();

    public final ti4 y0() {
        ti4 ti4Var = this.h0;
        if (ti4Var != null) {
            return ti4Var;
        }
        ti4 ti4Var2 = new ti4(this);
        this.h0 = ti4Var2;
        return ti4Var2;
    }

    @Override // defpackage.jy4
    public final void z(boolean z) {
        vi4 vi4VarT0 = t0();
        LayoutNode layoutNodeR0 = vi4VarT0 != null ? vi4VarT0.r0() : null;
        if (dh3.f(layoutNodeR0, r0())) {
            this.n0 = z;
            return;
        }
        if ((layoutNodeR0 != null ? layoutNodeR0.I0.d : null) != k34.Z) {
            if ((layoutNodeR0 != null ? layoutNodeR0.I0.d : null) != k34.f0) {
                return;
            }
        }
        this.n0 = z;
    }
}
