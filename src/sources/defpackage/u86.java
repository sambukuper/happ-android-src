package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u86 {
    public final ff3 a;
    public final AndroidComposeView b;
    public final ne c;
    public final u98 d;
    public final j05 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public pb i;
    public long j;
    public final hr5 k;
    public final r05 l;

    public u86(vz4 vz4Var, AndroidComposeView androidComposeView) {
        this.a = vz4Var;
        this.b = androidComposeView;
        ne neVar = new ne((byte) 7);
        neVar.c = new long[192];
        neVar.d = new long[192];
        this.c = neVar;
        this.d = new u98();
        this.e = new j05();
        this.j = -1L;
        this.k = new hr5(this, (byte) 5);
        this.l = new r05();
    }

    public static boolean c(i55 i55Var) {
        lf5 lf5Var = i55Var.V0;
        return (lf5Var == null || ch3.K(((au2) lf5Var).b())) ? false : true;
    }

    public static long f(LayoutNode layoutNode) {
        i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jC = 0;
        for (i55 i55Var = (fd3) layoutNode.H0.f0; i55Var != null && i55Var != outerCoordinator$ui; i55Var = i55Var.y0) {
            if (c(i55Var)) {
                return 9223372034707292159L;
            }
            jC = hf3.c(jC, i55Var.H0);
        }
        return jC;
    }

    public static void i(LayoutNode layoutNode) {
        if (!layoutNode.Z || c(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.Z = false;
        if (layoutNode.g0) {
            layoutNode.f0 = f(layoutNode);
            layoutNode.g0 = false;
        }
        if (hf3.a(layoutNode.f0, 9223372034707292159L)) {
            return;
        }
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            i((LayoutNode) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0240  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249 A[LOOP:11: B:102:0x0247->B:103:0x0249, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0254 A[LOOP:9: B:95:0x0223->B:107:0x0254, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025b A[ADDED_TO_REGION, LOOP:12: B:110:0x025b->B:111:0x025d, LOOP_START, PHI: r1
  0x025b: PHI (r1v8 t98) = (r1v7 t98), (r1v9 t98) binds: [B:109:0x0259, B:111:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025d A[LOOP:12: B:110:0x025b->B:111:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0268  */
    /* JADX WARN: Code duplicated, block: B:135:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0257 A[EDGE_INSN: B:136:0x0257->B:108:0x0257 BREAK  A[LOOP:9: B:95:0x0223->B:107:0x0254], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0257 A[EDGE_INSN: B:137:0x0257->B:108:0x0257 BREAK  A[LOOP:9: B:95:0x0223->B:107:0x0254], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
  0x0189: PHI (r3v6 t98) = (r3v5 t98), (r3v7 t98) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x020f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0217  */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:97:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x023a  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        t98 t98Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        t98 t98Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        t98 t98Var3;
        long[] jArr4;
        long j9;
        long j10;
        pb pbVar = this.i;
        if (pbVar != null) {
            this.b.removeCallbacks(pbVar);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        ne neVar = this.c;
        boolean z4 = true;
        u98 u98Var = this.d;
        if (z2) {
            this.f = false;
            j05 j05Var = this.e;
            Object[] objArr2 = j05Var.a;
            int i9 = j05Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((dn2) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) neVar.c;
            int i11 = neVar.b;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    t98 t98Var4 = (t98) u98Var.a.b(((int) j11) & 33554431);
                    while (t98Var4 != null) {
                        t98 t98Var5 = t98Var4.d;
                        boolean z6 = z3;
                        long j14 = t98Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        t98Var4.e = j12;
                        t98Var4.f = j13;
                        if (z7) {
                            t98Var4.g = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            t98Var4.a(j9, j10, u98Var.d, u98Var.e, u98Var.g);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        t98Var4 = t98Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) neVar.c;
            int i14 = neVar.b;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j15 = u98Var.d;
            long j16 = u98Var.e;
            float[] fArr2 = u98Var.g;
            vz4 vz4Var = u98Var.a;
            j2 = 128;
            Object[] objArr3 = vz4Var.c;
            long[] jArr7 = vz4Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    neVar = neVar;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                t98 t98Var6 = (t98) objArr3[(i17 << 3) + i21];
                                while (t98Var6 != null) {
                                    u98Var.a(t98Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    t98Var6 = t98Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    neVar = neVar;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = u98Var.d;
                j8 = u98Var.e;
                fArr = u98Var.g;
                t98Var3 = u98Var.b;
                if (t98Var3 != null) {
                    while (t98Var3 != null) {
                        LayoutNode layoutNodeZ = yn0.Z(t98Var3.b);
                        long jB = q34.a(layoutNodeZ).getRectManager().b(layoutNodeZ);
                        t98Var3.e = jB;
                        t98Var3.f = (((long) (layoutNodeZ.z() + ((int) (jB >> 32)))) << 32) | (((long) (layoutNodeZ.o() + ((int) (jB & 4294967295L)))) & 4294967295L);
                        u98Var.a(t98Var3, j7, j8, fArr, jCurrentTimeMillis);
                        t98Var3 = t98Var3.d;
                    }
                }
            }
            if (this.h) {
                i2 = 0;
                this.h = false;
                ne neVar2 = neVar;
                jArr2 = (long[]) neVar2.c;
                int i23 = neVar2.b;
                jArr3 = (long[]) neVar2.d;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != t86.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                neVar2.b = i7;
                neVar2.c = jArr3;
                neVar2.d = jArr2;
            } else {
                i2 = 0;
            }
            j4 = u98Var.c;
            if (j4 <= jCurrentTimeMillis) {
                vz4 vz4Var2 = u98Var.a;
                objArr = vz4Var2.c;
                jArr = vz4Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (t98Var2 = (t98) objArr[(i3 << 3) + i5]; t98Var2 != null; t98Var2 = t98Var2.d) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                t98Var = u98Var.b;
                if (t98Var != null) {
                    while (t98Var != null) {
                        t98Var = t98Var.d;
                    }
                }
                j4 = -1;
                u98Var.c = -1L;
            }
            if (j4 > j) {
                j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = u98Var.d;
            j8 = u98Var.e;
            fArr = u98Var.g;
            t98Var3 = u98Var.b;
            if (t98Var3 != null) {
                while (t98Var3 != null) {
                    LayoutNode layoutNodeZ2 = yn0.Z(t98Var3.b);
                    long jB2 = q34.a(layoutNodeZ2).getRectManager().b(layoutNodeZ2);
                    t98Var3.e = jB2;
                    t98Var3.f = (((long) (layoutNodeZ2.z() + ((int) (jB2 >> 32)))) << 32) | (((long) (layoutNodeZ2.o() + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    u98Var.a(t98Var3, j7, j8, fArr, jCurrentTimeMillis);
                    t98Var3 = t98Var3.d;
                }
            }
        }
        if (this.h) {
            i2 = 0;
            this.h = false;
            ne neVar3 = neVar;
            jArr2 = (long[]) neVar3.c;
            int i24 = neVar3.b;
            jArr3 = (long[]) neVar3.d;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != t86.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            neVar3.b = i7;
            neVar3.c = jArr3;
            neVar3.d = jArr2;
        } else {
            i2 = 0;
        }
        j4 = u98Var.c;
        if (j4 <= jCurrentTimeMillis) {
            vz4 vz4Var3 = u98Var.a;
            objArr = vz4Var3.c;
            jArr = vz4Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (t98Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            t98Var = u98Var.b;
            if (t98Var != null) {
                while (t98Var != null) {
                    t98Var = t98Var.d;
                }
            }
            j4 = -1;
            u98Var.c = -1L;
        }
        if (j4 > j) {
            j();
        }
    }

    public final long b(LayoutNode layoutNode) {
        if (layoutNode.i0 == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(layoutNode)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(LayoutNode layoutNode) {
        int i = layoutNode.i0;
        if (i != -4) {
            int i2 = layoutNode.Y;
            ne neVar = this.c;
            long[] jArr = (long[]) neVar.c;
            if (i < 0 || i >= neVar.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = neVar.b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            wc3.a("LayoutNode " + layoutNode.Y + " not found in RectList");
        }
        layoutNode.i0 = i;
        return i;
    }

    public final void e(LayoutNode layoutNode) {
        layoutNode.Z = true;
        t6 t6Var = layoutNode.H0;
        wr4 wr4Var = layoutNode.I0.p;
        int iP = wr4Var.P();
        float fO = wr4Var.O();
        r05 r05Var = this.l;
        r05Var.b = 0.0f;
        r05Var.c = 0.0f;
        r05Var.d = iP;
        r05Var.e = fO;
        for (i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.y0) {
            LayoutNode layoutNode2 = outerCoordinator$ui.w0;
            if (outerCoordinator$ui == layoutNode2.getOuterCoordinator$ui() && !layoutNode2.Z) {
                long jB = b(layoutNode2);
                if (!hf3.a(jB, 9223372034707292159L)) {
                    r05Var.e((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            lf5 lf5Var = outerCoordinator$ui.V0;
            if (lf5Var != null) {
                float[] fArrB = ((au2) lf5Var).b();
                if (!ch3.K(fArrB)) {
                    or4.c(fArrB, r05Var);
                }
            }
            long j = outerCoordinator$ui.H0;
            r05Var.e((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) r05Var.b;
        int i2 = (int) r05Var.c;
        int i3 = (int) r05Var.d;
        int i4 = (int) r05Var.e;
        int i5 = layoutNode.Y;
        int i6 = layoutNode.i0;
        ne neVar = this.c;
        if (i6 != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) neVar.c;
            jArr[iD] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iD + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iD + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            LayoutNode layoutNodeW = layoutNode.w();
            layoutNode.i0 = neVar.f(i5, i, i2, i3, i4, layoutNodeW != null ? layoutNodeW.Y : -1, layoutNodeW != null ? d(layoutNodeW) : -4, t6Var.j(1024), t6Var.j(16), this.d.a.a(i5));
        }
        layoutNode.h0 = false;
        this.f = true;
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i8 = c15VarC.Z;
        for (int i9 = 0; i9 < i8; i9++) {
            LayoutNode layoutNode3 = (LayoutNode) objArr[i9];
            if (layoutNode3.L()) {
                e(layoutNode3);
            }
        }
    }

    public final void g(LayoutNode layoutNode) {
        long j;
        boolean zL = layoutNode.L();
        t6 t6Var = layoutNode.H0;
        if (zL && layoutNode.h0) {
            LayoutNode layoutNodeW = layoutNode.w();
            if (layoutNodeW == null || layoutNodeW.Z) {
                j = layoutNodeW == null ? 0L : 9223372034707292159L;
            } else {
                if (layoutNodeW.g0) {
                    layoutNodeW.g0 = false;
                    layoutNodeW.f0 = f(layoutNodeW);
                }
                j = layoutNodeW.f0;
            }
            i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (hf3.a(j, 9223372034707292159L) || c(outerCoordinator$ui)) {
                e(layoutNode);
            } else if (layoutNode.Z) {
                e(layoutNode);
                i(layoutNode);
            } else {
                long jC = hf3.c(j, outerCoordinator$ui.H0);
                wr4 wr4Var = layoutNode.I0.p;
                int iP = wr4Var.P();
                int iO = wr4Var.O();
                int i = layoutNode.i0;
                ne neVar = this.c;
                if (i != -4) {
                    int iD = d(layoutNode);
                    if (layoutNodeW != null) {
                        int iD2 = d(layoutNodeW);
                        int i2 = (int) (jC >> 32);
                        int i3 = (int) (jC & 4294967295L);
                        long[] jArr = (long[]) neVar.c;
                        long j2 = jArr[iD2];
                        int i4 = ((int) (j2 >> 32)) + i2;
                        int i5 = ((int) j2) + i3;
                        int i6 = iO + i5;
                        long j3 = jArr[iD];
                        int i7 = i4 - ((int) (j3 >> 32));
                        int i8 = i5 - ((int) j3);
                        int i9 = iD + 2;
                        long j4 = jArr[i9];
                        jArr[iD] = (((long) i5) & 4294967295L) | (((long) i4) << 32);
                        jArr[iD + 1] = (((long) (iP + i4)) << 32) | (((long) i6) & 4294967295L);
                        jArr[i9] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i7 != 0 || i8 != 0) {
                            neVar.i(j4, iD, i7, i8);
                        }
                    } else {
                        int iD3 = d(layoutNode);
                        int i10 = (int) (jC >> 32);
                        int i11 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) neVar.c;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
                        jArr2[iD3 + 1] = (((long) (iO + i11)) & 4294967295L) | (((long) (iP + i10)) << 32);
                        int i12 = iD3 + 2;
                        long j6 = jArr2[i12];
                        jArr2[i12] = (((j6 >> 63) & 1) << 60) | j6;
                        int i13 = i10 - ((int) (j5 >> 32));
                        int i14 = i11 - ((int) j5);
                        if (i13 != 0 || i14 != 0) {
                            neVar.i(j6, iD3, i13, i14);
                        }
                    }
                } else {
                    int i15 = layoutNode.Y;
                    boolean zJ = t6Var.j(1024);
                    boolean zJ2 = t6Var.j(16);
                    boolean zA = this.d.a.a(i15);
                    if (layoutNodeW != null) {
                        int i16 = layoutNodeW.Y;
                        int iD4 = d(layoutNodeW);
                        int i17 = (int) (jC >> 32);
                        int i18 = (int) (jC & 4294967295L);
                        int i19 = i15 & 33554431;
                        long[] jArr3 = (long[]) neVar.c;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i16)) {
                            wc3.a("Inserted child " + i19 + " without valid parent index or parent " + i16 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i20 = ((int) (j7 >> 32)) + i17;
                        int i21 = ((int) j7) + i18;
                        layoutNode.i0 = neVar.f(i19, i20, i21, i20 + iP, i21 + iO, i16, iD4, zJ, zJ2, zA);
                    } else {
                        int i22 = (int) (jC >> 32);
                        int i23 = (int) (jC & 4294967295L);
                        layoutNode.i0 = neVar.f(i15, i22, i23, i22 + iP, i23 + iO, -1, -4, zJ, zJ2, zA);
                    }
                }
            }
            layoutNode.h0 = false;
            this.f = true;
            j();
        }
    }

    public final void h(LayoutNode layoutNode) {
        if (layoutNode.i0 != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) this.c.c;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = t86.a;
            layoutNode.i0 = -4;
            layoutNode.h0 = true;
            this.f = true;
            this.h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j() {
        pb pbVar = this.i;
        boolean z = pbVar != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.b;
            if (pbVar != null) {
                androidComposeView.removeCallbacks(pbVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            pb pbVar2 = new pb(this.k, (byte) 1);
            androidComposeView.postDelayed(pbVar2, jMax - jCurrentTimeMillis);
            this.i = pbVar2;
        }
    }
}
