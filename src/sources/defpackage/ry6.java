package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ry6 {
    public final /* synthetic */ sy6 a;

    public ry6(sy6 sy6Var) {
        this.a = sy6Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x0324  */
    /* JADX WARN: Code duplicated, block: B:177:0x0335  */
    /* JADX WARN: Code duplicated, block: B:178:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x0349  */
    /* JADX WARN: Code duplicated, block: B:189:0x0351  */
    /* JADX WARN: Code duplicated, block: B:192:0x0355  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[PHI: r8
  0x013c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x016a, B:65:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fH;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jE;
        long jE2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        gs2 gs2Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        gs2 gs2Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        gs2 gs2Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        sy6 sy6Var = this.a;
        sy6Var.j = i;
        td tdVar = sy6Var.b;
        if (tdVar == null || !sy6Var.b()) {
            return sy6Var.d(sy6Var.k, j, i);
        }
        byte b = sy6Var.j;
        t16 t16Var = sy6Var.m;
        dy1 dy1Var = tdVar.c;
        if (ua7.e(tdVar.g)) {
            return ((z85) t16Var.B(new z85(j))).a;
        }
        if (!tdVar.f) {
            if (dy1.g(dy1Var.f)) {
                tdVar.g(0L);
            }
            if (dy1.g(dy1Var.g)) {
                tdVar.h(0L);
            }
            if (dy1.g(dy1Var.d)) {
                tdVar.i(0L);
            }
            if (dy1.g(dy1Var.e)) {
                tdVar.f(0L);
            }
            tdVar.f = true;
        }
        int i5 = bf.a;
        float f4 = b == 2 ? 4.0f : 1.0f;
        long jG = z85.g(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!dy1.g(dy1Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (dy1.g(dy1Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f5 = tdVar.f(jG);
                    if (!dy1.g(dy1Var.e)) {
                        dy1Var.b().finish();
                    }
                    fIntBitsToFloat = f5 == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : f5 / f4;
                }
            } else {
                float fI = tdVar.i(jG);
                j2 = 4294967295L;
                if (!dy1.g(dy1Var.d)) {
                    dy1Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i6) : fI / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!dy1.g(dy1Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fH = tdVar.g(jG);
                if (!dy1.g(dy1Var.f)) {
                    dy1Var.c().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            } else if (dy1.g(dy1Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fH = tdVar.h(jG);
                if (!dy1.g(dy1Var.g)) {
                    dy1Var.d().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!z85.b(jFloatToRawIntBits, 0L)) {
                tdVar.d();
            }
            jE = z85.e(j, jFloatToRawIntBits);
            long j3 = ((z85) t16Var.B(new z85(jE))).a;
            jE2 = z85.e(jE, j3);
            if ((Float.intBitsToFloat((int) (jE >> 32)) == 0.0f || Float.intBitsToFloat((int) (jE & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (dy1.g(dy1Var.f) || dy1.g(dy1Var.d) || dy1.g(dy1Var.g) || dy1.g(dy1Var.e)))) {
                tdVar.a();
            }
            if (b == 1) {
                i3 = (int) (jE2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    tdVar.g(jE2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        tdVar.h(jE2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jE2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        tdVar.i(jE2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            tdVar.f(jE2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jE2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tdVar.i(jE2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tdVar.f(jE2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!z85.b(jE, 0L)) {
                if (dy1.f(dy1Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = dy1Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof gs2) {
                        gs2 gs2Var4 = (gs2) edgeEffectC;
                        float f6 = gs2Var4.b + fIntBitsToFloat6;
                        gs2Var4.b = f6;
                        if (Math.abs(f6) > gs2Var4.a) {
                            gs2Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = dy1.f(dy1Var.f);
                }
                if (dy1.f(dy1Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = dy1Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof gs2) {
                        gs2Var3 = (gs2) edgeEffectD;
                        f3 = gs2Var3.b + fIntBitsToFloat5;
                        gs2Var3.b = f3;
                        if (Math.abs(f3) > gs2Var3.a) {
                            gs2Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || dy1.f(dy1Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (dy1.f(dy1Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = dy1Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof gs2) {
                        gs2Var2 = (gs2) edgeEffectE;
                        f2 = gs2Var2.b + fIntBitsToFloat4;
                        gs2Var2.b = f2;
                        if (Math.abs(f2) > gs2Var2.a) {
                            gs2Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || dy1.f(dy1Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (dy1.f(dy1Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = dy1Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof gs2) {
                        gs2Var = (gs2) edgeEffectB;
                        f = gs2Var.b + fIntBitsToFloat3;
                        gs2Var.b = f;
                        if (Math.abs(f) > gs2Var.a) {
                            gs2Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || dy1.f(dy1Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                tdVar.d();
            }
            return z85.f(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!dy1.g(dy1Var.f)) {
            if (dy1.g(dy1Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (dy1.g(dy1Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!z85.b(jFloatToRawIntBits, 0L)) {
            tdVar.d();
        }
        jE = z85.e(j, jFloatToRawIntBits);
        long j4 = ((z85) t16Var.B(new z85(jE))).a;
        jE2 = z85.e(jE, j4);
        if (Float.intBitsToFloat((int) (jE >> 32)) == 0.0f) {
            tdVar.a();
        } else {
            tdVar.a();
        }
        if (b == 1) {
            i3 = (int) (jE2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                tdVar.g(jE2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    tdVar.h(jE2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jE2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tdVar.i(jE2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tdVar.f(jE2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jE2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                tdVar.i(jE2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    tdVar.f(jE2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!z85.b(jE, 0L)) {
            if (dy1.f(dy1Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (dy1.f(dy1Var.g)) {
                edgeEffectD = dy1Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof gs2) {
                    gs2Var3 = (gs2) edgeEffectD;
                    f3 = gs2Var3.b + fIntBitsToFloat5;
                    gs2Var3.b = f3;
                    if (Math.abs(f3) > gs2Var3.a) {
                        gs2Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (dy1.f(dy1Var.d)) {
                edgeEffectE = dy1Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof gs2) {
                    gs2Var2 = (gs2) edgeEffectE;
                    f2 = gs2Var2.b + fIntBitsToFloat4;
                    gs2Var2.b = f2;
                    if (Math.abs(f2) > gs2Var2.a) {
                        gs2Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (dy1.f(dy1Var.e)) {
                edgeEffectB = dy1Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof gs2) {
                    gs2Var = (gs2) edgeEffectB;
                    f = gs2Var.b + fIntBitsToFloat3;
                    gs2Var.b = f;
                    if (Math.abs(f) > gs2Var.a) {
                        gs2Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            tdVar.d();
        }
        return z85.f(jFloatToRawIntBits, j4);
    }
}
