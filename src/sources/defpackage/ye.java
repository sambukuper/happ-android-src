package defpackage;

import okhttp3.dnsoverhttps.DnsOverHttps;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye {
    static {
        new or5(true);
    }

    public static final void a(final boolean z, final dn2 dn2Var, final kx4 kx4Var, long j, ay6 ay6Var, final or5 or5Var, final x67 x67Var, final long j2, float f, final zy0 zy0Var, lp2 lp2Var, final int i) {
        int i2;
        dn2 dn2Var2;
        long jFloatToRawIntBits;
        final ay6 ay6Var2;
        final float f2;
        int i3;
        ay6 ay6VarG;
        float f3;
        lp2Var.X(1725609375);
        if ((i & 6) == 0) {
            i2 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dn2Var2 = dn2Var;
            i2 |= lp2Var.h(dn2Var2) ? 32 : 16;
        } else {
            dn2Var2 = dn2Var;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i4 |= lp2Var.f(or5Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= lp2Var.f(x67Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= lp2Var.e(j2) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        int i5 = i4 | 905969664;
        if (lp2Var.N(i5 & 1, (306783379 & i5) != 306783378)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                i3 = i5 & (-57345);
                ay6VarG = dh3.G(lp2Var);
                f3 = ot4.a;
            } else {
                lp2Var.Q();
                ay6VarG = ay6Var;
                f3 = f;
                i3 = i5 & (-57345);
                jFloatToRawIntBits = j;
            }
            lp2Var.q();
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = new b15(Boolean.FALSE);
                lp2Var.g0(objK);
            }
            b15 b15Var = (b15) objK;
            b15Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) b15Var.b.getValue()).booleanValue() || ((Boolean) b15Var.c.getValue()).booleanValue()) {
                lp2Var.W(1165905588);
                Object objK2 = lp2Var.K();
                if (objK2 == obj) {
                    objK2 = z51.H(new gd8(gd8.b));
                    lp2Var.g0(objK2);
                }
                y05 y05Var = (y05) objK2;
                fi1 fi1Var = (fi1) lp2Var.j(y01.h);
                boolean zF = ((i3 & 7168) == 2048) | lp2Var.f(fi1Var);
                Object objK3 = lp2Var.K();
                if (zF || objK3 == obj) {
                    objK3 = new zw1(jFloatToRawIntBits, fi1Var, new fd(y05Var, (byte) 1));
                    lp2Var.g0(objK3);
                }
                bg.a((zw1) objK3, dn2Var2, or5Var, jm4.U(-917492520, new xe(kx4Var, b15Var, y05Var, ay6VarG, x67Var, j2, f3, zy0Var), lp2Var), lp2Var, ((i3 >> 9) & 896) | (i3 & 112) | 3072, 0);
                lp2Var.p(false);
            } else {
                lp2Var.W(1166965571);
                lp2Var.p(false);
            }
            ay6Var2 = ay6VarG;
            f2 = f3;
        } else {
            lp2Var.Q();
            jFloatToRawIntBits = j;
            ay6Var2 = ay6Var;
            f2 = f;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final long j3 = jFloatToRawIntBits;
            j86VarR.d = new rn2() { // from class: ve
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i | 1);
                    ye.a(z, dn2Var, kx4Var, j3, ay6Var2, or5Var, x67Var, j2, f2, zy0Var, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final zy0 zy0Var, final dn2 dn2Var, kx4 kx4Var, final rn2 rn2Var, boolean z, final qt4 qt4Var, final gg5 gg5Var, lp2 lp2Var, final int i) {
        final kx4 kx4Var2;
        final boolean z2;
        kx4 kx4Var3;
        boolean z3;
        lp2Var.X(-532959117);
        int i2 = i | (lp2Var.h(dn2Var) ? 32 : 16) | 384 | (lp2Var.h(rn2Var) ? 2048 : 1024) | 221184 | (lp2Var.f(qt4Var) ? 1048576 : 524288) | 100663296;
        if (lp2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                kx4Var3 = hx4.X;
                z3 = true;
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var;
                z3 = z;
            }
            lp2Var.q();
            jm4.h(zy0Var, dn2Var, kx4Var3, rn2Var, z3, qt4Var, gg5Var, lp2Var, i2 & 268435454);
            z2 = z3;
            kx4Var2 = kx4Var3;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            z2 = z;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(dn2Var, kx4Var2, rn2Var, z2, qt4Var, gg5Var, i) { // from class: we
                public final /* synthetic */ dn2 Y;
                public final /* synthetic */ kx4 Z;
                public final /* synthetic */ rn2 f0;
                public final /* synthetic */ boolean g0;
                public final /* synthetic */ qt4 h0;
                public final /* synthetic */ gg5 i0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(12582919);
                    ye.b(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }
}
