package defpackage;

import androidx.compose.foundation.layout.b;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec8 {
    public static final ig5 a = new ig5(8.0f, 4.0f, 8.0f, 4.0f);
    public static final float b = 16.0f;

    public static final void a(final hc8 hc8Var, kx4 kx4Var, float f, x67 x67Var, long j, long j2, final zy0 zy0Var, lp2 lp2Var, final int i) {
        int i2;
        kx4 kx4Var2;
        final float f2;
        final x67 x67Var2;
        final long j3;
        final long j4;
        float f3;
        long jC;
        int i3;
        x67 x67Var3;
        long j5;
        lp2Var.X(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? lp2Var.f(hc8Var) : lp2Var.h(hc8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= lp2Var.h(zy0Var) ? 536870912 : 268435456;
        }
        if (lp2Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                f3 = zb8.b;
                x67 x67VarB = q77.b(u15.f, lp2Var);
                long jC2 = kw0.c(u15.g, lp2Var);
                jC = kw0.c(u15.e, lp2Var);
                i3 = i5 & (-4186113);
                x67Var3 = x67VarB;
                j5 = jC2;
                kx4Var2 = hx4.X;
            } else {
                lp2Var.Q();
                i3 = i5 & (-4186113);
                kx4Var2 = kx4Var;
                f3 = f;
                x67Var3 = x67Var;
                j5 = j;
                jC = j2;
            }
            lp2Var.q();
            lp2Var.W(-1719831991);
            lp2Var.p(false);
            int i6 = i3 >> 9;
            ay7.a(kx4Var2, x67Var3, jC, 0L, 0.0f, 0.0f, jm4.U(-1573998995, new dc8(f3, j5, zy0Var), lp2Var), lp2Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f2 = f3;
            j3 = j5;
            x67Var2 = x67Var3;
            j4 = jC;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            f2 = f;
            x67Var2 = x67Var;
            j3 = j;
            j4 = j2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final kx4 kx4Var3 = kx4Var2;
            j86VarR.d = new rn2() { // from class: bc8
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ec8.a(hc8Var, kx4Var3, f2, x67Var2, j3, j4, zy0Var, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(hc8 hc8Var, kx4 kx4Var, x67 x67Var, float f, x67 x67Var2, xk6 xk6Var, float f2, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        float f3;
        x67 x67Var3;
        float f4;
        float f5;
        float f6;
        x67 x67Var4;
        int i3;
        kx4 kx4Var3;
        kx4 kx4VarY;
        x67 x67Var5;
        lp2Var.X(236290785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? lp2Var.f(hc8Var) : lp2Var.h(hc8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 |= lp2Var.f(x67Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        if ((i & 12582912) == 0) {
            i5 |= lp2Var.f(xk6Var) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        int i6 = i5 | 905969664;
        if (lp2Var.N(i6 & 1, (306783379 & i6) != 306783378)) {
            lp2Var.S();
            int i7 = i & 1;
            hx4 hx4Var = hx4.X;
            if (i7 == 0 || lp2Var.x()) {
                f5 = zb8.c;
                x67 x67VarB = q77.b(i21.a0, lp2Var);
                f6 = i21.Z;
                x67Var4 = x67VarB;
                i3 = i6 & (-3670017);
                kx4Var3 = hx4Var;
            } else {
                lp2Var.Q();
                f5 = f;
                x67Var4 = x67Var2;
                f6 = f2;
                i3 = i6 & (-3670017);
                kx4Var3 = kx4Var;
            }
            lp2Var.q();
            if (x67Var != null) {
                lp2Var.W(-111951894);
                Object objK = lp2Var.K();
                be beVar = zz0.a;
                if (objK == beVar) {
                    objK = z51.H(new or4(or4.a()));
                    lp2Var.g0(objK);
                }
                final y05 y05Var = (y05) objK;
                final fi1 fi1Var = (fi1) lp2Var.j(y01.h);
                final long jA = ((y74) ((t09) lp2Var.j(y01.u))).a();
                boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && lp2Var.h(hc8Var));
                Object objK2 = lp2Var.K();
                if (z || objK2 == beVar) {
                    objK2 = new py7(hc8Var, (byte) 8);
                    lp2Var.g0(objK2);
                }
                final gn2 gn2Var = (gn2) objK2;
                final nr5 nr5Var = hc8Var.b;
                kx4VarY = z68.q0(hx4Var, new sn2() { // from class: cc8
                    @Override // defpackage.sn2
                    public final Object x(Object obj, Object obj2, Object obj3) {
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        zr4 zr4Var = (zr4) obj;
                        eo5 eo5VarO = ((tr4) obj2).o(((q31) obj3).a);
                        int i8 = eo5VarO.X;
                        int i9 = eo5VarO.Y;
                        int i10 = (int) (jA >> 32);
                        float f7 = i8;
                        float f8 = i9;
                        y24 y24Var = (y24) gn2Var.B(zr4Var);
                        if (y24Var != null) {
                            int iX0 = fi1Var.x0(4.0f);
                            s86 s86VarR = jm4.r(y24Var, true);
                            float f9 = s86VarR.b;
                            boolean z2 = nr5Var instanceof gc8;
                            if (!z2 ? (f9 - f8) - iX0 < 0.0f : (f9 - f8) - iX0 < 0.0f) {
                                f8 = 0.0f;
                            }
                            if (z2) {
                                jFloatToRawIntBits = Float.floatToRawIntBits(ec8.d(f7, i10, s86VarR));
                                iFloatToRawIntBits = Float.floatToRawIntBits(f8);
                            } else {
                                jFloatToRawIntBits = Float.floatToRawIntBits(ec8.d(f7, i10, s86VarR));
                                iFloatToRawIntBits = Float.floatToRawIntBits(f8);
                            }
                            long j = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                            float[] fArrA = or4.a();
                            or4.g(fArrA, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                            if (z2) {
                                if (f8 == 0.0f) {
                                    or4.e(fArrA);
                                }
                            } else if (f8 == 0.0f) {
                                or4.e(fArrA);
                            }
                            y05Var.setValue(new or4(fArrA));
                        }
                        return zr4Var.g0(i8, i9, e02.X, new d1(eo5VarO, (byte) 18));
                    }
                }).y(kx4Var3);
                boolean zF = lp2Var.f(x67Var4) | ((i3 & 57344) == 16384);
                Object objK3 = lp2Var.K();
                if (zF || objK3 == beVar) {
                    objK3 = new wb8(y05Var, x67Var4, x67Var);
                    lp2Var.g0(objK3);
                }
                x67Var5 = (wb8) objK3;
                lp2Var.p(false);
            } else {
                lp2Var.W(-111306598);
                lp2Var.p(false);
                kx4VarY = kx4Var3;
                x67Var5 = x67Var4;
            }
            kx4 kx4VarJ = b.j(kx4VarY, 40.0f, 24.0f, f5, 8);
            f3 = f5;
            int i8 = i3 >> 12;
            x67Var3 = x67Var4;
            kx4Var2 = kx4Var3;
            ay7.a(kx4VarJ, x67Var5, xk6Var.a, 0L, 0.0f, f6, jm4.U(-1249811482, new n40(xk6Var, zy0Var, (byte) 6), lp2Var), lp2Var, (i8 & 57344) | 12582912 | (i8 & 458752), 72);
            f4 = f6;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            f3 = f;
            x67Var3 = x67Var2;
            f4 = f2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new lb7(hc8Var, kx4Var2, x67Var, f3, x67Var3, xk6Var, f4, zy0Var, i);
        }
    }

    public static final void c(nr5 nr5Var, zy0 zy0Var, jc8 jc8Var, kx4 kx4Var, boolean z, zy0 zy0Var2, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        boolean z2;
        lp2Var.X(-293753984);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(nr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? lp2Var.f(jc8Var) : lp2Var.h(jc8Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= lp2Var.h(zy0Var2) ? 67108864 : 33554432;
        }
        if (lp2Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            ce8 ce8VarN = rq7.n(jc8Var.c, "tooltip transition", lp2Var, 48);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = z51.H(null);
                lp2Var.g0(objK);
            }
            y05 y05Var = (y05) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new hc8(new eh(y05Var, (byte) 8), nr5Var);
                lp2Var.g0(objK2);
            }
            z68.c(nr5Var, jm4.U(-527401546, new zt4(ce8VarN, zy0Var, (hc8) objK2), lp2Var), jc8Var, jm4.U(-23901870, new n40(y05Var, zy0Var2, (byte) 7), lp2Var), lp2Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            kx4Var2 = hx4.X;
            z2 = true;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            z2 = z;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j40(nr5Var, zy0Var, jc8Var, kx4Var2, z2, zy0Var2, i);
        }
    }

    public static final float d(float f, int i, s86 s86Var) {
        float fMin;
        float f2 = s86Var.a;
        float f3 = s86Var.c;
        float f4 = (f2 + f3) / 2.0f;
        float f5 = i;
        if (f >= f5) {
            return f4;
        }
        float f6 = f / 2.0f;
        if (f4 - f6 < 0.0f) {
            fMin = Math.max(f - f5, -f2);
        } else {
            if (f4 + f6 <= f5) {
                return f6;
            }
            fMin = Math.min(f - f3, 0.0f);
        }
        return fMin + f4;
    }

    public static final jc8 e(lp2 lp2Var, int i, int i2) {
        boolean z = true;
        boolean z2 = (i2 & 2) == 0;
        m15 m15Var = h40.a;
        if ((((i & 112) ^ 48) <= 32 || !lp2Var.g(z2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zF = lp2Var.f(m15Var) | z;
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            objK = new jc8(z2, m15Var);
            lp2Var.g0(objK);
        }
        return (jc8) objK;
    }
}
