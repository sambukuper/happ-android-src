package defpackage;

import androidx.compose.foundation.layout.b;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw5 {
    public static final b81 a = oy4.a;
    public static final b81 b = oy4.c;

    public static final void a(final kx4 kx4Var, final long j, float f, long j2, int i, float f2, lp2 lp2Var, final int i2) {
        lp2 lp2Var2;
        final float f3;
        final long j3;
        final int i3;
        final float f4;
        long j4;
        int i4;
        float f5;
        float f6;
        int i5;
        final float f7;
        final float f8;
        long j5;
        lp2Var.X(333154241);
        int i6 = i2 | (lp2Var.f(kx4Var) ? 4 : 2) | (lp2Var.e(j) ? 32 : 16) | 222592;
        if (lp2Var.N(i6 & 1, (74899 & i6) != 74898)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                j4 = dw0.f;
                i4 = i6 & (-7169);
                f5 = 4.0f;
                f6 = 4.0f;
                i5 = 1;
            } else {
                lp2Var.Q();
                j4 = j2;
                i5 = i;
                f6 = f2;
                i4 = i6 & (-7169);
                f5 = f;
            }
            lp2Var.q();
            final om7 om7Var = new om7(((fi1) lp2Var.j(y01.h)).h0(f5), 0.0f, i5, 0, 26);
            nc3 nc3VarH0 = zc1.h0(1, lp2Var);
            final long j6 = j4;
            final lc3 lc3VarL = zc1.l(nc3VarH0, 0.0f, 1080.0f, wl7.N(wl7.i0(6000, 2, yx1.d), 6), lp2Var, 4536, 8);
            dx4 dx4Var = new dx4((byte) 29);
            zx3 zx3Var = new zx3();
            dx4Var.B(zx3Var);
            final lc3 lc3VarL2 = zc1.l(nc3VarH0, 0.0f, 360.0f, wl7.N(new ay3(zx3Var), 6), lp2Var, 4536, 8);
            zx3 zx3Var2 = new zx3();
            zx3Var2.a = (short) 6000;
            zx3Var2.a(Float.valueOf(0.87f), 3000).b = b;
            zx3Var2.a(Float.valueOf(0.1f), 6000);
            final lc3 lc3VarL3 = zc1.l(nc3VarH0, 0.1f, 0.87f, wl7.N(new ay3(zx3Var2), 6), lp2Var, 4536, 8);
            kx4 kx4VarG = b.g(v07.a(kx4Var, true, new zw5((byte) 0)), 40.0f);
            boolean zF = lp2Var.f(lc3VarL3) | lp2Var.f(lc3VarL) | lp2Var.f(lc3VarL2) | lp2Var.e(j6) | lp2Var.h(om7Var) | ((((i4 & 112) ^ 48) > 32 && lp2Var.e(j)) || (i4 & 48) == 32);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                final int i7 = i5;
                f7 = f6;
                f8 = f5;
                lp2Var2 = lp2Var;
                gn2 gn2Var = new gn2() { // from class: rw5
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        long j7 = j6;
                        om7 om7Var2 = om7Var;
                        long j8 = j;
                        sv1 sv1Var = (sv1) obj;
                        float fFloatValue = ((Number) lc3VarL3.getValue()).floatValue() * 360.0f;
                        boolean z = i7;
                        float f9 = f7;
                        if (z && Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) <= Float.intBitsToFloat((int) (sv1Var.e() >> 32))) {
                            f9 += f8;
                        }
                        float fW = (f9 / ((float) (((double) sv1Var.W(Float.intBitsToFloat((int) (sv1Var.e() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) lc3VarL2.getValue()).floatValue() + ((Number) lc3VarL.getValue()).floatValue();
                        long jA0 = sv1Var.A0();
                        lr lrVarN0 = sv1Var.n0();
                        long jP = lrVarN0.p();
                        lrVarN0.k().g();
                        try {
                            ((wl6) lrVarN0.Y).T(fFloatValue2, jA0);
                            xw5.d(sv1Var, Math.min(fFloatValue, fW) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fW) * 2.0f), j7, om7Var2);
                            xw5.d(sv1Var, 0.0f, fFloatValue, j8, om7Var2);
                            return dn8.a;
                        } finally {
                            p61.w(lrVarN0, jP);
                        }
                    }
                };
                j5 = j6;
                lp2Var2.g0(gn2Var);
                objK = gn2Var;
            } else {
                j5 = j6;
                f7 = f6;
                f8 = f5;
                lp2Var2 = lp2Var;
            }
            yn0.b(0, (gn2) objK, lp2Var2, kx4VarG);
            f4 = f7;
            f3 = f8;
            i3 = i5;
            j3 = j5;
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
            f3 = f;
            j3 = j2;
            i3 = i;
            f4 = f2;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(j, f3, j3, i3, f4, i2) { // from class: sw5
                public final /* synthetic */ long Y;
                public final /* synthetic */ float Z;
                public final /* synthetic */ long f0;
                public final /* synthetic */ boolean g0;
                public final /* synthetic */ float h0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    kx4 kx4Var2 = this.X;
                    long j7 = this.Y;
                    float f9 = this.Z;
                    long j8 = this.f0;
                    boolean z = this.g0;
                    float f10 = this.h0;
                    xw5.a(kx4Var2, j7, f9, j8, z ? 1 : 0, f10, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final dn2 dn2Var, final kx4 kx4Var, final long j, final long j2, int i, float f, gn2 gn2Var, lp2 lp2Var, final int i2) {
        int i3;
        final int i4;
        final float f2;
        final gn2 gn2Var2;
        int i5;
        gn2 gn2Var3;
        int i6;
        float f3;
        final int i7;
        Object obj;
        final float f4;
        final gn2 gn2Var4;
        lp2Var.X(-339970038);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = i2 | (lp2Var.h(dn2Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i8 = i3 | (lp2Var.e(j) ? 256 : 128) | (lp2Var.e(j2) ? 2048 : 1024) | 745472;
        if (lp2Var.N(i8 & 1, (599187 & i8) != 599186)) {
            lp2Var.S();
            int i9 = i2 & 1;
            Object obj2 = zz0.a;
            if (i9 == 0 || lp2Var.x()) {
                boolean z = (((i8 & 896) ^ 384) > 256 && lp2Var.e(j)) || (i8 & 384) == 256;
                Object objK = lp2Var.K();
                if (z || objK == obj2) {
                    objK = new bd(j, b2);
                    lp2Var.g0(objK);
                }
                i5 = i8 & (-3670017);
                gn2Var3 = (gn2) objK;
                i6 = 1;
                f3 = 4.0f;
            } else {
                lp2Var.Q();
                f3 = f;
                gn2Var3 = gn2Var;
                i5 = i8 & (-3670017);
                i6 = i;
            }
            lp2Var.q();
            boolean z2 = (i5 & 14) == 4;
            Object objK2 = lp2Var.K();
            if (z2 || objK2 == obj2) {
                objK2 = new mv2(dn2Var, (byte) 4);
                lp2Var.g0(objK2);
            }
            final dn2 dn2Var2 = (dn2) objK2;
            kx4 kx4VarY = kx4Var.y(m4.b);
            boolean zF = lp2Var.f(dn2Var2);
            Object objK3 = lp2Var.K();
            if (zF || objK3 == obj2) {
                objK3 = new xo(dn2Var2, (byte) 4);
                lp2Var.g0(objK3);
            }
            kx4 kx4VarH = b.h(v07.a(kx4VarY, true, (gn2) objK3), 240.0f, 4.0f);
            boolean zF2 = ((((i5 & 7168) ^ 3072) > 2048 && lp2Var.e(j2)) || (i5 & 3072) == 2048) | lp2Var.f(dn2Var2) | ((((i5 & 896) ^ 384) > 256 && lp2Var.e(j)) || (i5 & 384) == 256) | lp2Var.f(gn2Var3);
            Object objK4 = lp2Var.K();
            if (zF2 || objK4 == obj2) {
                i7 = i6;
                f4 = f3;
                gn2Var4 = gn2Var3;
                obj = new gn2() { // from class: tw5
                    @Override // defpackage.gn2
                    public final Object B(Object obj3) {
                        sv1 sv1Var = (sv1) obj3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L));
                        boolean z3 = i7;
                        float fW = f4;
                        if (z3 && Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) <= Float.intBitsToFloat((int) (sv1Var.e() >> 32))) {
                            fW += sv1Var.W(fIntBitsToFloat);
                        }
                        float fW2 = fW / sv1Var.W(Float.intBitsToFloat((int) (sv1Var.e() >> 32)));
                        float fFloatValue = ((Number) dn2Var2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fW2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            xw5.e(sv1Var, fMin, 1.0f, j2, fIntBitsToFloat, z3 ? 1 : 0);
                        }
                        xw5.e(sv1Var, 0.0f, fFloatValue, j, fIntBitsToFloat, z3 ? 1 : 0);
                        gn2Var4.B(sv1Var);
                        return dn8.a;
                    }
                };
                lp2Var.g0(obj);
            } else {
                i7 = i6;
                obj = objK4;
                f4 = f3;
                gn2Var4 = gn2Var3;
            }
            yn0.b(0, (gn2) obj, lp2Var, kx4VarH);
            i4 = i7;
            f2 = f4;
            gn2Var2 = gn2Var4;
        } else {
            lp2Var.Q();
            i4 = i;
            f2 = f;
            gn2Var2 = gn2Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: uw5
                @Override // defpackage.rn2
                public final Object K(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = w79.P(i2 | 1);
                    dn2 dn2Var3 = dn2Var;
                    kx4 kx4Var2 = kx4Var;
                    long j3 = j;
                    long j4 = j2;
                    boolean z3 = i4;
                    float f5 = f2;
                    gn2 gn2Var5 = gn2Var2;
                    xw5.b(dn2Var3, kx4Var2, j3, j4, z3 ? 1 : 0, f5, gn2Var5, (lp2) obj3, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(kx4 kx4Var, final long j, final long j2, int i, float f, lp2 lp2Var, final int i2) {
        int i3;
        kx4 kx4Var2;
        final int i4;
        final float f2;
        int i5;
        float f3;
        final int i6;
        final float f4;
        int i7;
        lp2 lp2Var2 = lp2Var;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        lp2Var2.X(567589233);
        if ((i2 & 48) == 0) {
            i3 = (lp2Var2.e(j) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var2.e(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i8 = i3 | 27648;
        if (lp2Var2.N(i8 & 1, (i8 & 9363) != 9362)) {
            lp2Var2.S();
            if ((i2 & 1) == 0 || lp2Var2.x()) {
                i5 = 1;
                f3 = 4.0f;
            } else {
                lp2Var2.Q();
                i5 = i;
                f3 = f;
            }
            lp2Var2.q();
            nc3 nc3VarH0 = zc1.h0(1, lp2Var2);
            zx3 zx3Var = new zx3();
            zx3Var.a = (short) 1750;
            yx3 yx3VarA = zx3Var.a(fValueOf2, 0);
            b81 b81Var = a;
            yx3VarA.b = b81Var;
            zx3Var.a(fValueOf, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
            final lc3 lc3VarL = zc1.l(nc3VarH0, 0.0f, 1.0f, wl7.N(new ay3(zx3Var), 6), lp2Var2, 4536, 8);
            zx3 zx3Var2 = new zx3();
            zx3Var2.a = (short) 1750;
            zx3Var2.a(fValueOf2, 250).b = b81Var;
            zx3Var2.a(fValueOf, 1250);
            final lc3 lc3VarL2 = zc1.l(nc3VarH0, 0.0f, 1.0f, wl7.N(new ay3(zx3Var2), 6), lp2Var, 4536, 8);
            zx3 zx3Var3 = new zx3();
            zx3Var3.a = (short) 1750;
            zx3Var3.a(fValueOf2, 650).b = b81Var;
            zx3Var3.a(fValueOf, 1500);
            final lc3 lc3VarL3 = zc1.l(nc3VarH0, 0.0f, 1.0f, wl7.N(new ay3(zx3Var3), 6), lp2Var, 4536, 8);
            zx3 zx3Var4 = new zx3();
            zx3Var4.a = (short) 1750;
            zx3Var4.a(fValueOf2, 900).b = b81Var;
            zx3Var4.a(fValueOf, 1750);
            lp2Var2 = lp2Var;
            final lc3 lc3VarL4 = zc1.l(nc3VarH0, 0.0f, 1.0f, wl7.N(new ay3(zx3Var4), 6), lp2Var2, 4536, 8);
            kx4Var2 = kx4Var;
            boolean z = true;
            kx4 kx4VarH = b.h(v07.a(kx4Var2.y(m4.b), true, new zw5((byte) 0)), 240.0f, 4.0f);
            boolean zF = lp2Var2.f(lc3VarL) | ((((i8 & 896) ^ 384) > 256 && lp2Var2.e(j2)) || (i8 & 384) == 256) | lp2Var2.f(lc3VarL2);
            if ((((i8 & 112) ^ 48) <= 32 || !lp2Var2.e(j)) && (i8 & 48) != 32) {
                z = false;
            }
            boolean zF2 = zF | z | lp2Var2.f(lc3VarL3) | lp2Var2.f(lc3VarL4);
            Object objK = lp2Var2.K();
            if (zF2 || objK == zz0.a) {
                i6 = i5;
                f4 = f3;
                i7 = 0;
                gn2 gn2Var = new gn2() { // from class: vw5
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        long j3;
                        sv1 sv1Var = (sv1) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L));
                        boolean z2 = i6;
                        float fW = f4;
                        if (z2 && Float.intBitsToFloat((int) (4294967295L & sv1Var.e())) <= Float.intBitsToFloat((int) (sv1Var.e() >> 32))) {
                            fW += sv1Var.W(fIntBitsToFloat);
                        }
                        float fW2 = fW / sv1Var.W(Float.intBitsToFloat((int) (sv1Var.e() >> 32)));
                        lh7 lh7Var = lc3VarL;
                        float fFloatValue = ((Number) lh7Var.getValue()).floatValue();
                        float f5 = 1.0f - fW2;
                        long j4 = j2;
                        if (fFloatValue < f5) {
                            xw5.e(sv1Var, ((Number) lh7Var.getValue()).floatValue() > 0.0f ? ((Number) lh7Var.getValue()).floatValue() + fW2 : 0.0f, 1.0f, j4, fIntBitsToFloat, z2 ? 1 : 0);
                        }
                        long j5 = j4;
                        float fFloatValue2 = ((Number) lh7Var.getValue()).floatValue();
                        lh7 lh7Var2 = lc3VarL2;
                        float fFloatValue3 = fFloatValue2 - ((Number) lh7Var2.getValue()).floatValue();
                        long j6 = j;
                        if (fFloatValue3 > 0.0f) {
                            xw5.e(sv1Var, ((Number) lh7Var.getValue()).floatValue(), ((Number) lh7Var2.getValue()).floatValue(), j6, fIntBitsToFloat, z2 ? 1 : 0);
                            j3 = j6;
                        } else {
                            j3 = j6;
                        }
                        float fFloatValue4 = ((Number) lh7Var2.getValue()).floatValue();
                        lh7 lh7Var3 = lc3VarL3;
                        if (fFloatValue4 > fW2) {
                            xw5.e(sv1Var, ((Number) lh7Var3.getValue()).floatValue() > 0.0f ? ((Number) lh7Var3.getValue()).floatValue() + fW2 : 0.0f, ((Number) lh7Var2.getValue()).floatValue() < 1.0f ? ((Number) lh7Var2.getValue()).floatValue() - fW2 : 1.0f, j5, fIntBitsToFloat, z2 ? 1 : 0);
                            j5 = j5;
                        }
                        float fFloatValue5 = ((Number) lh7Var3.getValue()).floatValue();
                        lh7 lh7Var4 = lc3VarL4;
                        if (fFloatValue5 - ((Number) lh7Var4.getValue()).floatValue() > 0.0f) {
                            xw5.e(sv1Var, ((Number) lh7Var3.getValue()).floatValue(), ((Number) lh7Var4.getValue()).floatValue(), j3, fIntBitsToFloat, z2 ? 1 : 0);
                            sv1Var = sv1Var;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) lh7Var4.getValue()).floatValue() > fW2) {
                            xw5.e(sv1Var, 0.0f, ((Number) lh7Var4.getValue()).floatValue() < 1.0f ? ((Number) lh7Var4.getValue()).floatValue() - fW2 : 1.0f, j5, fIntBitsToFloat, z2 ? 1 : 0);
                        }
                        return dn8.a;
                    }
                };
                lp2Var2.g0(gn2Var);
                objK = gn2Var;
            } else {
                i6 = i5;
                f4 = f3;
                i7 = 0;
            }
            yn0.b(i7, (gn2) objK, lp2Var2, kx4VarH);
            i4 = i6;
            f2 = f4;
        } else {
            kx4Var2 = kx4Var;
            lp2Var2.Q();
            i4 = i;
            f2 = f;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            final kx4 kx4Var3 = kx4Var2;
            j86VarR.d = new rn2() { // from class: ww5
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i2 | 1);
                    kx4 kx4Var4 = kx4Var3;
                    long j3 = j;
                    long j4 = j2;
                    boolean z2 = i4;
                    float f5 = f2;
                    xw5.c(kx4Var4, j3, j4, z2 ? 1 : 0, f5, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void d(sv1 sv1Var, float f, float f2, long j, om7 om7Var) {
        float f3 = om7Var.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() >> 32)) - (2.0f * f3);
        sv1Var.L0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), om7Var);
    }

    public static final void e(sv1 sv1Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = sv1Var.getLayoutDirection() == z24.X;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            sv1.v0(sv1Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            sv1.v0(sv1Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, 480);
        }
    }
}
