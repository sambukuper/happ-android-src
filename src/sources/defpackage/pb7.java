package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pb7 {
    public static final pb7 a = new pb7();
    public static final float b;
    public static final float c;
    public static final lf d;

    static {
        float f = u15.v;
        b = f;
        c = f;
        d = nf.a();
    }

    public static void d(sv1 sv1Var, sd5 sd5Var, long j, long j2, long j3, float f, float f2) {
        em6 em6Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (sd5Var == sd5.X) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            s86 s86VarN = u70.n(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            em6Var = new em6(s86VarN.a, s86VarN.b, s86VarN.c, s86VarN.d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            s86 s86VarN2 = u70.n(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            em6Var = new em6(s86VarN2.a, s86VarN2.b, s86VarN2.c, s86VarN2.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        lf lfVar = d;
        lf.c(lfVar, em6Var);
        sv1Var.C0(lfVar, j3);
        lfVar.a.rewind();
    }

    public static jb7 e(iw0 iw0Var) {
        jb7 jb7Var = iw0Var.a0;
        if (jb7Var != null) {
            return jb7Var;
        }
        long jB = kw0.b(iw0Var, u15.p);
        jw0 jw0Var = u15.i;
        long jB2 = kw0.b(iw0Var, jw0Var);
        jw0 jw0Var2 = u15.t;
        long jB3 = kw0.b(iw0Var, jw0Var2);
        long jB4 = kw0.b(iw0Var, jw0Var2);
        long jB5 = kw0.b(iw0Var, jw0Var);
        long jS = z51.s(dw0.b(u15.m, kw0.b(iw0Var, u15.l)), iw0Var.p);
        jw0 jw0Var3 = u15.j;
        long jB6 = kw0.b(iw0Var, jw0Var3);
        float f = u15.k;
        long jB7 = dw0.b(f, jB6);
        jw0 jw0Var4 = u15.n;
        long jB8 = kw0.b(iw0Var, jw0Var4);
        float f2 = u15.o;
        jb7 jb7Var2 = new jb7(jB, jB2, jB3, jB4, jB5, jS, jB7, dw0.b(f2, jB8), dw0.b(f2, kw0.b(iw0Var, jw0Var4)), dw0.b(f, kw0.b(iw0Var, jw0Var3)));
        iw0Var.a0 = jb7Var2;
        return jb7Var2;
    }

    public final void a(final xz4 xz4Var, kx4 kx4Var, final jb7 jb7Var, long j, lp2 lp2Var, final int i) {
        final kx4 kx4Var2;
        final long j2;
        long j3;
        kx4 kx4Var3;
        long jFloatToRawIntBits;
        lp2Var.X(-290277409);
        int i2 = i | (lp2Var.f(xz4Var) ? 4 : 2) | 48 | (lp2Var.f(jb7Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(true) ? 2048 : 1024) | 24576;
        if (lp2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                j3 = vb7.c;
                kx4Var3 = hx4.X;
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var;
                j3 = j;
            }
            lp2Var.q();
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = new vd7();
                lp2Var.g0(objK);
            }
            vd7 vd7Var = (vd7) objK;
            boolean z = (i2 & 14) == 4;
            Object objK2 = lp2Var.K();
            if (z || objK2 == beVar) {
                objK2 = new t17(xz4Var, vd7Var, null, (byte) 5);
                lp2Var.g0(objK2);
            }
            u70.h((rn2) objK2, lp2Var, xz4Var);
            if (vd7Var.isEmpty()) {
                jFloatToRawIntBits = j3;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(nt1.b(j3) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(nt1.a(j3))) & 4294967295L);
            }
            FillElement fillElement = b.a;
            ch3.f(lp2Var, u15.f(u15.z(b.h(kx4Var3, nt1.b(jFloatToRawIntBits), nt1.a(jFloatToRawIntBits)), xz4Var), jb7Var.a, q77.b(u15.r, lp2Var)));
            j2 = j3;
            kx4Var2 = kx4Var3;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            j2 = j;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(xz4Var, kx4Var2, jb7Var, j2, i) { // from class: mb7
                public final /* synthetic */ xz4 Y;
                public final /* synthetic */ kx4 Z;
                public final /* synthetic */ jb7 f0;
                public final /* synthetic */ long g0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(196609);
                    this.X.a(this.Y, this.Z, this.f0, this.g0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public final void b(wb7 wb7Var, kx4 kx4Var, jb7 jb7Var, rn2 rn2Var, sn2 sn2Var, float f, float f2, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        rn2 rn2Var2;
        sn2 sn2Var2;
        float f3;
        float f4;
        int i3;
        float f5;
        sn2 sn2Var3;
        kx4 kx4Var3;
        float f6;
        rn2 rn2Var3;
        lp2Var.X(49984771);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(wb7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= lp2Var.g(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= lp2Var.f(jb7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= lp2Var.f(this) ? 67108864 : 33554432;
        }
        if (lp2Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                boolean z = ((((i5 & 7168) ^ 3072) > 2048 && lp2Var.f(jb7Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objK = lp2Var.K();
                be beVar = zz0.a;
                if (z || objK == beVar) {
                    objK = new b1(jb7Var, (byte) 22);
                    lp2Var.g0(objK);
                }
                rn2 rn2Var4 = (rn2) objK;
                i3 = i5 & (-57345);
                Object objK2 = lp2Var.K();
                if (objK2 == beVar) {
                    objK2 = oe0.g0;
                    lp2Var.g0(objK2);
                }
                float f7 = vb7.d;
                f5 = vb7.e;
                sn2Var3 = (sn2) objK2;
                kx4Var3 = hx4.X;
                f6 = f7;
                rn2Var3 = rn2Var4;
            } else {
                lp2Var.Q();
                i3 = i5 & (-57345);
                kx4Var3 = kx4Var;
                rn2Var3 = rn2Var;
                sn2Var3 = sn2Var;
                f6 = f;
                f5 = f2;
            }
            lp2Var.q();
            int i6 = i3 << 3;
            c(wb7Var, kx4Var3, jb7Var, rn2Var3, sn2Var3, f6, f5, lp2Var, (i6 & 234881024) | 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6), ((i3 >> 21) & 112) | 6);
            kx4Var2 = kx4Var3;
            f4 = f5;
            f3 = f6;
            sn2Var2 = sn2Var3;
            rn2Var2 = rn2Var3;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            rn2Var2 = rn2Var;
            sn2Var2 = sn2Var;
            f3 = f;
            f4 = f2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new lb7(this, wb7Var, kx4Var2, jb7Var, rn2Var2, sn2Var2, f3, f4, i);
        }
    }

    public final void c(final wb7 wb7Var, final kx4 kx4Var, final jb7 jb7Var, final rn2 rn2Var, final sn2 sn2Var, final float f, final float f2, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        lp2 lp2Var2;
        lp2Var.X(133396521);
        if ((i & 6) == 0) {
            i3 = (lp2Var.h(wb7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.g(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.f(jb7Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= lp2Var.h(rn2Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= lp2Var.h(sn2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= lp2Var.c(f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= lp2Var.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.g(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.g(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (lp2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            int i5 = i3;
            final long j = jb7Var.d;
            final long j2 = jb7Var.b;
            final long j3 = jb7Var.e;
            final long j4 = jb7Var.c;
            kx4 kx4VarY = wb7Var.n0 == sd5.X ? b.k(kx4Var, vb7.a).y(b.b) : b.b(kx4Var.y(b.a), vb7.a);
            int i6 = i5 & 112;
            boolean zH = (i6 == 32) | lp2Var.h(wb7Var);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zH || objK == beVar) {
                objK = new m30(wb7Var, (byte) 8);
                lp2Var.g0(objK);
            }
            kx4 kx4VarY2 = kx4VarY.y(z68.q0(hx4.X, (sn2) objK));
            boolean zH2 = (i6 == 32) | lp2Var.h(wb7Var) | lp2Var.e(j) | lp2Var.e(j2) | lp2Var.e(j3) | lp2Var.e(j4) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objK2 = lp2Var.K();
            if (zH2 || objK2 == beVar) {
                lp2Var2 = lp2Var;
                gn2 gn2Var = new gn2() { // from class: nb7
                    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
                    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        float fH0;
                        long j5;
                        long jE;
                        float f3;
                        sd5 sd5Var;
                        float f4;
                        char c2;
                        rn2 rn2Var2;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        sv1 sv1Var;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        sv1 sv1Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fH1;
                        float fH2;
                        sv1 sv1Var3 = (sv1) obj;
                        boolean zB = kt1.b(Float.NaN, Float.NaN);
                        sd5 sd5Var2 = sd5.X;
                        wb7 wb7Var2 = wb7Var;
                        if (zB) {
                            fH0 = (wb7Var2.n0 == sd5Var2 ? Float.intBitsToFloat((int) (sv1Var3.e() >> 32)) : Float.intBitsToFloat((int) (sv1Var3.e() & 4294967295L))) / 2.0f;
                        } else {
                            fH0 = sv1Var3.h0(Float.NaN);
                        }
                        pb7 pb7Var = pb7.a;
                        float[] fArr = wb7Var2.h0;
                        float fB = wb7Var2.b();
                        int i7 = 0;
                        float fR = sv1Var3.R(0);
                        float fR2 = sv1Var3.R(0);
                        float fR3 = sv1Var3.R(wb7Var2.l0.l());
                        float fR4 = sv1Var3.R(wb7Var2.m0.l());
                        float fW = sv1Var3.W(fH0);
                        sd5 sd5Var3 = wb7Var2.n0;
                        boolean z = sd5Var3 == sd5Var2;
                        boolean z2 = sv1Var3.getLayoutDirection() == z24.Y;
                        boolean z3 = z2 && !z;
                        float fH3 = sv1Var3.h0(fW);
                        if (z) {
                            j5 = 4294967295L;
                            jE = sv1Var3.e() & 4294967295L;
                        } else {
                            j5 = 4294967295L;
                            jE = sv1Var3.e() >> 32;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jE);
                        fArr.getClass();
                        if (dh3.e(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || dh3.e(0.0f, eu.A0(fArr))) {
                        }
                        float fE = (fArr.length == 0 || (dh3.e(fB, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || dh3.e(fB, eu.A0(fArr)))) ? p61.e(fIntBitsToFloat, 0.0f, fB, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fH3 * 2.0f)) * fB) + 0.0f + fH3;
                        int length = fArr.length;
                        float fH4 = sv1Var3.h0(f2);
                        float f5 = f;
                        if (kt1.a(f5, 0.0f) > 0) {
                            if (z) {
                                sv1Var3.h0(fR2);
                                sv1Var3.h0(f5);
                                fH1 = sv1Var3.h0(fR4) / 2.0f;
                                fH2 = sv1Var3.h0(f5);
                            } else {
                                sv1Var3.h0(fR);
                                sv1Var3.h0(f5);
                                fH1 = sv1Var3.h0(fR3) / 2.0f;
                                fH2 = sv1Var3.h0(f5);
                            }
                            f3 = fH2 + fH1;
                        } else {
                            f3 = 0.0f;
                        }
                        long jA0 = sv1Var3.A0();
                        Float.intBitsToFloat((int) (z ? jA0 & j5 : jA0 >> 32));
                        float f6 = (fIntBitsToFloat - f3) - fH3;
                        rn2 rn2Var3 = rn2Var;
                        if (fE < f6) {
                            float f7 = z3 ? fH3 : fH4;
                            float f8 = z3 ? fH4 : fH3;
                            float f9 = fE + f3;
                            float f10 = fIntBitsToFloat - f9;
                            if (z) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f9);
                                f4 = 0.0f;
                                c2 = ' ';
                            } else {
                                f4 = 0.0f;
                                c2 = ' ';
                                if (z2) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f9);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j5);
                            if (z) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.e() >> c2)));
                                sv1Var2 = sv1Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f10);
                            } else {
                                sv1Var2 = sv1Var3;
                                if (z2) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv1Var2.e() >> c2)) - f9;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sv1Var2.e() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (sv1Var2.e() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f10);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c2);
                            sd5Var = sd5Var3;
                            sv1Var3 = sv1Var2;
                            rn2Var2 = rn2Var3;
                            pb7.d(sv1Var3, sd5Var, j6, j7, j, f7, f8);
                            if (z) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.A0() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fH3);
                            } else {
                                if (z2) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fH3)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.A0() & j5)))) & j5);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (sv1Var3.A0() & j5));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fH3);
                                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (rn2Var2 != null) {
                                    rn2Var2.K(sv1Var3, new z85(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c2);
                            if (rn2Var2 != null) {
                                rn2Var2.K(sv1Var3, new z85(jFloatToRawIntBits10));
                            }
                        } else {
                            sd5Var = sd5Var3;
                            f4 = 0.0f;
                            c2 = ' ';
                            rn2Var2 = rn2Var3;
                        }
                        float f11 = fE - f3;
                        float f12 = !z3 ? fH3 : fH4;
                        float f13 = z3 ? fH3 : fH4;
                        float f14 = z3 ? f11 : f11 - f4;
                        if (f14 > f12) {
                            if (!z && z2) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.e() >> c2)) - f11);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            }
                            long j8 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j5);
                            if (z) {
                                sv1Var = sv1Var3;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f14)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.e() >> c2)))) << c2);
                            } else {
                                sv1Var = sv1Var3;
                                if (z2) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (sv1Var.e() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f11);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (sv1Var.e() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            sv1Var3 = sv1Var;
                            pb7.d(sv1Var3, sd5Var, j8, j9, j2, f12, f13);
                        }
                        float f15 = f4 + fH3;
                        float f16 = fIntBitsToFloat - fH3;
                        float f17 = fE - f3;
                        float f18 = fE + f3;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f19 = fArr[i7];
                            int i9 = i8 + 1;
                            if (rn2Var2 == null || i8 != fArr.length - 1) {
                                float fH = w51.H(f15, f16, f19);
                                if (fH < f17 || fH > f18) {
                                    if (z) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sv1Var3.A0() >> c2)));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fH);
                                    } else {
                                        if (z2) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (sv1Var3.e() >> c2)) - fH;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (sv1Var3.A0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (sv1Var3.A0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fH);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    sn2Var.x(sv1Var3, new z85((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c2)), new dw0((fH < f4 || fH > f11) ? j3 : j4));
                                } else {
                                    f15 = f15;
                                    f17 = f17;
                                }
                            } else {
                                f15 = f15;
                                f17 = f17;
                            }
                            i7++;
                            i8 = i9;
                            f15 = f15;
                            f17 = f17;
                        }
                        return dn8.a;
                    }
                };
                lp2Var2.g0(gn2Var);
                objK2 = gn2Var;
            } else {
                lp2Var2 = lp2Var;
            }
            yn0.b(0, (gn2) objK2, lp2Var2, kx4VarY2);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: ob7
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.X.c(wb7Var, kx4Var, jb7Var, rn2Var, sn2Var, f, f2, (lp2) obj, w79.P(i | 1), w79.P(i2));
                    return dn8.a;
                }
            };
        }
    }
}
