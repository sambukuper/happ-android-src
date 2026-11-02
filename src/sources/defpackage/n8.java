package defpackage;

import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n8 {
    public static final ig5 a = new ig5(24.0f, 24.0f, 24.0f, 24.0f);
    public static final ig5 b;
    public static final ig5 c;
    public static final ox1 d;

    static {
        os4.e(7, 16.0f);
        b = os4.e(7, 16.0f);
        c = os4.e(7, 24.0f);
        d = new ox1(new x((byte) 5), (byte) 0);
    }

    public static final void a(final zy0 zy0Var, kx4 kx4Var, final rn2 rn2Var, final rn2 rn2Var2, final x67 x67Var, final long j, final long j2, final long j3, final long j4, final long j5, lp2 lp2Var, final int i) {
        final kx4 kx4Var2;
        lp2Var.X(1378716401);
        int i2 = i | 48 | (lp2Var.h(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(rn2Var) ? 2048 : 1024) | (lp2Var.h(rn2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(x67Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.e(j) ? 1048576 : 524288) | (lp2Var.c(0.0f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.e(j2) ? 67108864 : 33554432) | (lp2Var.e(j3) ? 536870912 : 268435456);
        if (lp2Var.N(i2 & 1, ((306783379 & i2) == 306783378 && (((lp2Var.e(j5) ? ' ' : (char) 16) | (lp2Var.e(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            zy0 zy0VarU = jm4.U(-652798794, new j8(rn2Var, rn2Var2, j3, j4, j5, j2, zy0Var), lp2Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            hx4 hx4Var = hx4.X;
            ay7.a(hx4Var, x67Var, j, 0L, 0.0f, 0.0f, zy0VarU, lp2Var, i4, 104);
            kx4Var2 = hx4Var;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(kx4Var2, rn2Var, rn2Var2, x67Var, j, j2, j3, j4, j5, i) { // from class: f8
                public final /* synthetic */ kx4 Y;
                public final /* synthetic */ rn2 Z;
                public final /* synthetic */ rn2 f0;
                public final /* synthetic */ x67 g0;
                public final /* synthetic */ long h0;
                public final /* synthetic */ long i0;
                public final /* synthetic */ long j0;
                public final /* synthetic */ long k0;
                public final /* synthetic */ long l0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(7);
                    n8.a(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(-917637668);
        byte b2 = 0;
        if (lp2Var.N(i & 1, (i & 147) != 146)) {
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new ld((byte) 7);
                lp2Var.g0(objK);
            }
            xr4 xr4Var = (xr4) objK;
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, hx4.X);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4Var);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            zy0Var.K(lp2Var, 6);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new h8(zy0Var, i, b2);
        }
    }

    public static final void c(final dn2 dn2Var, final zy0 zy0Var, final rn2 rn2Var, final rn2 rn2Var2, final x67 x67Var, final long j, final long j2, final long j3, final long j4, vn1 vn1Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        rn2 rn2Var3;
        rn2 rn2Var4;
        int i4;
        vn1 vn1Var2;
        lp2Var.X(-867616355);
        if ((i & 6) == 0) {
            i3 = (lp2Var.h(dn2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(hx4.X) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            rn2Var3 = rn2Var;
            i3 |= lp2Var.h(rn2Var3) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        } else {
            rn2Var3 = rn2Var;
        }
        if ((1572864 & i) == 0) {
            rn2Var4 = rn2Var2;
            i3 |= lp2Var.h(rn2Var4) ? 1048576 : 524288;
        } else {
            rn2Var4 = rn2Var2;
        }
        if ((i & 12582912) == 0) {
            i3 |= lp2Var.f(x67Var) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= lp2Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.e(j4) ? 32 : 16;
        }
        int i5 = i3;
        if ((i2 & 384) == 0) {
            i4 |= lp2Var.c(0.0f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            vn1Var2 = vn1Var;
            i4 |= lp2Var.f(vn1Var2) ? 2048 : 1024;
        } else {
            vn1Var2 = vn1Var;
        }
        int i6 = i4;
        if (lp2Var.N(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            d(dn2Var, vn1Var2, jm4.U(527420759, new m8(rn2Var3, rn2Var4, x67Var, j, j2, j3, j4, zy0Var), lp2Var), lp2Var, ((i6 >> 3) & 896) | (i5 & 14) | 3072 | ((i5 >> 3) & 112));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final vn1 vn1Var3 = vn1Var2;
            j86VarR.d = new rn2() { // from class: e8
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i | 1);
                    int iP2 = w79.P(i2);
                    n8.c(dn2Var, zy0Var, rn2Var, rn2Var2, x67Var, j, j2, j3, j4, vn1Var3, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void d(dn2 dn2Var, vn1 vn1Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(24925658);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(dn2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(hx4.X) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(vn1Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 2048 : 1024;
        }
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ((de1) lp2Var.j(d)).a(new lr(dn2Var, vn1Var, zy0Var), lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(dn2Var, vn1Var, zy0Var, i);
        }
    }
}
