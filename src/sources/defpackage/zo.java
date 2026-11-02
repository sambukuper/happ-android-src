package defpackage;

import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zo {
    public static final ox1 a = new ox1(new x((byte) 19), (byte) 0);
    public static final float b;
    public static final float c;

    static {
        new x74(new x((byte) 20));
        new b81(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final kx4 kx4Var, final zy0 zy0Var, final o88 o88Var, final o88 o88Var2, final zy0 zy0Var2, final sn2 sn2Var, final float f, final v09 v09Var, final kc8 kc8Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        sn2 sn2Var2;
        float f2;
        int i4;
        n50 n50Var = pz2.q0;
        lp2Var.X(-2033800111);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(o88Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.f(o88Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= lp2Var.f(n50Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= lp2Var.h(zy0Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            sn2Var2 = sn2Var;
            i3 |= lp2Var.h(sn2Var2) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        } else {
            sn2Var2 = sn2Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= lp2Var.c(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= lp2Var.f(v09Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.f(kc8Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.f(null) ? 32 : 16;
        }
        if (lp2Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((vf1) lp2Var.j(a)).a(new ma7(kx4Var, zy0Var, o88Var, o88Var2, zy0Var2, sn2Var2, f2, v09Var, kc8Var), lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: wo
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zo.a(kx4Var, zy0Var, o88Var, o88Var2, zy0Var2, sn2Var, f, v09Var, kc8Var, (lp2) obj, w79.P(i | 1), w79.P(i2));
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final zy0 zy0Var, final kx4 kx4Var, final zy0 zy0Var2, final sn2 sn2Var, float f, v09 v09Var, final kc8 kc8Var, lp2 lp2Var, final int i) {
        int i2;
        final float f2;
        final v09 v09Var2;
        int i3;
        v09 s94Var;
        float f3;
        lp2Var.X(1784421840);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(zy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(zy0Var2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(sn2Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= lp2Var.f(kc8Var) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if (lp2Var.N(i5 & 1, (4793491 & i5) != 4793490)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                WeakHashMap weakHashMap = c29.w;
                i3 = i5 & (-458753);
                s94Var = new s94(new an8(hw7.b(lp2Var).g, hw7.b(lp2Var).b), 15 | 16);
                f3 = 64.0f;
            } else {
                lp2Var.Q();
                i3 = i5 & (-458753);
                f3 = f;
                s94Var = v09Var;
            }
            lp2Var.q();
            int i6 = i3 << 12;
            a(kx4Var, zy0Var, yj8.a(dh3.a, lp2Var), o88.d, zy0Var2, sn2Var, (kt1.b(f3, Float.NaN) || kt1.b(f3, Float.POSITIVE_INFINITY)) ? 64.0f : f3, s94Var, kc8Var, lp2Var, ((i3 >> 3) & 14) | 224256 | ((i3 << 3) & 112) | (3670016 & i6) | (i6 & 29360128), (i3 >> 18) & WebSocketProtocol.PAYLOAD_SHORT);
            v09Var2 = s94Var;
            f2 = f3;
        } else {
            lp2Var.Q();
            f2 = f;
            v09Var2 = v09Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: vo
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zo.b(zy0Var, kx4Var, zy0Var2, sn2Var, f2, v09Var2, kc8Var, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020d  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    public static final void c(final kx4 kx4Var, final re2 re2Var, final long j, final long j2, final long j3, long j4, final zy0 zy0Var, final o88 o88Var, final o88 o88Var2, dn2 dn2Var, final zy0 zy0Var2, zy0 zy0Var3, final float f, lp2 lp2Var, final int i) {
        dn2 dn2Var2;
        zy0 zy0Var4;
        int i2;
        int I;
        Object objK;
        int I2;
        int I3;
        final long j5 = j4;
        n50 n50Var = pz2.q0;
        lp2Var.X(126395868);
        int i3 = i | (lp2Var.f(kx4Var) ? 4 : 2) | (lp2Var.f(re2Var) ? 32 : 16) | (lp2Var.e(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.e(j2) ? 2048 : 1024) | (lp2Var.e(j3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        boolean zE = lp2Var.e(j5);
        int i4 = DnsOverHttps.MAX_RESPONSE_SIZE;
        int i5 = i3 | (zE ? 131072 : 65536) | (lp2Var.h(zy0Var) ? 1048576 : 524288) | (lp2Var.f(o88Var) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.h(null) ? 67108864 : 33554432) | (lp2Var.f(o88Var2) ? 536870912 : 268435456);
        int i6 = 1600566 | (lp2Var.f(n50Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.h(zy0Var2)) {
            i4 = 131072;
        }
        int i7 = i6 | i4 | (lp2Var.c(f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304);
        if (lp2Var.N(i5 & 1, ((i5 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            boolean z = ((i5 & 112) == 32) | ((i7 & 896) == 256) | ((29360128 & i7) == 8388608);
            Object objK2 = lp2Var.K();
            be beVar = zz0.a;
            if (z || objK2 == beVar) {
                objK2 = new mc8(re2Var, f);
                lp2Var.g0(objK2);
            }
            mc8 mc8Var = (mc8) objK2;
            int I4 = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, mc8Var);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var.S) {
                i2 = i7;
            } else {
                i2 = i7;
                if (!dh3.f(lp2Var.K(), Integer.valueOf(I4))) {
                }
                dx0 dx0Var4 = pz2.z0;
                pn7.m(dx0Var4, lp2Var, kx4VarQ);
                hx4 hx4Var = hx4.X;
                kx4 kx4VarO = x97.O(hx4Var, "navigationIcon");
                float f2 = b;
                kx4 kx4VarA = os4.A(kx4VarO, f2, 0.0f, 0.0f, 0.0f, 14);
                p50 p50Var = pz2.Z;
                xr4 xr4VarC = g80.c(p50Var, false);
                I = km4.I(lp2Var);
                kl5 kl5VarL2 = lp2Var.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarA);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC);
                pn7.m(dx0Var2, lp2Var, kl5VarL2);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                    p61.v(I, lp2Var, I, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ2);
                ox1 ox1Var = j41.a;
                mb6.a(ox1Var.a(new dw0(j)), zy0Var2, lp2Var, ((i2 >> 12) & 112) | 8);
                lp2Var.p(true);
                lp2Var.W(-1359701523);
                kx4 kx4VarZ = os4.z(x97.O(hx4Var, "title"), f2, 0.0f, 2);
                lp2Var.W(510340109);
                lp2Var.p(false);
                kx4 kx4VarY = kx4VarZ.y(hx4Var);
                objK = lp2Var.K();
                if (objK == beVar) {
                    dn2Var2 = dn2Var;
                    objK = new xo(dn2Var2, (byte) 0);
                    lp2Var.g0(objK);
                } else {
                    dn2Var2 = dn2Var;
                }
                kx4 kx4VarI = jm4.I(kx4VarY, (gn2) objK);
                xr4 xr4VarC2 = g80.c(p50Var, false);
                I2 = km4.I(lp2Var);
                kl5 kl5VarL3 = lp2Var.l();
                kx4 kx4VarQ3 = w45.Q(lp2Var, kx4VarI);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC2);
                pn7.m(dx0Var2, lp2Var, kl5VarL3);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I2))) {
                    p61.v(I2, lp2Var, I2, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ3);
                jm4.l(j2, o88Var, zy0Var, lp2Var, ((i5 >> 9) & 14) | ((i5 >> 18) & 112) | ((i5 >> 12) & 896));
                lp2Var.p(true);
                lp2Var.p(false);
                kx4 kx4VarA2 = os4.A(x97.O(hx4Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
                xr4 xr4VarC3 = g80.c(p50Var, false);
                I3 = km4.I(lp2Var);
                kl5 kl5VarL4 = lp2Var.l();
                kx4 kx4VarQ4 = w45.Q(lp2Var, kx4VarA2);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC3);
                pn7.m(dx0Var2, lp2Var, kl5VarL4);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I3))) {
                    p61.v(I3, lp2Var, I3, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ4);
                j5 = j4;
                zy0Var4 = zy0Var3;
                mb6.a(ox1Var.a(new dw0(j5)), zy0Var4, lp2Var, 56);
                lp2Var.p(true);
                lp2Var.p(true);
            }
            p61.v(I4, lp2Var, I4, dx0Var3);
            dx0 dx0Var5 = pz2.z0;
            pn7.m(dx0Var5, lp2Var, kx4VarQ);
            hx4 hx4Var2 = hx4.X;
            kx4 kx4VarO2 = x97.O(hx4Var2, "navigationIcon");
            float f3 = b;
            kx4 kx4VarA3 = os4.A(kx4VarO2, f3, 0.0f, 0.0f, 0.0f, 14);
            p50 p50Var2 = pz2.Z;
            xr4 xr4VarC4 = g80.c(p50Var2, false);
            I = km4.I(lp2Var);
            kl5 kl5VarL5 = lp2Var.l();
            kx4 kx4VarQ5 = w45.Q(lp2Var, kx4VarA3);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC4);
            pn7.m(dx0Var2, lp2Var, kl5VarL5);
            if (lp2Var.S) {
                p61.v(I, lp2Var, I, dx0Var3);
            } else {
                p61.v(I, lp2Var, I, dx0Var3);
            }
            pn7.m(dx0Var5, lp2Var, kx4VarQ5);
            ox1 ox1Var2 = j41.a;
            mb6.a(ox1Var2.a(new dw0(j)), zy0Var2, lp2Var, ((i2 >> 12) & 112) | 8);
            lp2Var.p(true);
            lp2Var.W(-1359701523);
            kx4 kx4VarZ2 = os4.z(x97.O(hx4Var2, "title"), f3, 0.0f, 2);
            lp2Var.W(510340109);
            lp2Var.p(false);
            kx4 kx4VarY2 = kx4VarZ2.y(hx4Var2);
            objK = lp2Var.K();
            if (objK == beVar) {
                dn2Var2 = dn2Var;
                objK = new xo(dn2Var2, (byte) 0);
                lp2Var.g0(objK);
            } else {
                dn2Var2 = dn2Var;
            }
            kx4 kx4VarI2 = jm4.I(kx4VarY2, (gn2) objK);
            xr4 xr4VarC5 = g80.c(p50Var2, false);
            I2 = km4.I(lp2Var);
            kl5 kl5VarL6 = lp2Var.l();
            kx4 kx4VarQ6 = w45.Q(lp2Var, kx4VarI2);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC5);
            pn7.m(dx0Var2, lp2Var, kl5VarL6);
            if (lp2Var.S) {
                p61.v(I2, lp2Var, I2, dx0Var3);
            } else {
                p61.v(I2, lp2Var, I2, dx0Var3);
            }
            pn7.m(dx0Var5, lp2Var, kx4VarQ6);
            jm4.l(j2, o88Var, zy0Var, lp2Var, ((i5 >> 9) & 14) | ((i5 >> 18) & 112) | ((i5 >> 12) & 896));
            lp2Var.p(true);
            lp2Var.p(false);
            kx4 kx4VarA4 = os4.A(x97.O(hx4Var2, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            xr4 xr4VarC6 = g80.c(p50Var2, false);
            I3 = km4.I(lp2Var);
            kl5 kl5VarL7 = lp2Var.l();
            kx4 kx4VarQ7 = w45.Q(lp2Var, kx4VarA4);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC6);
            pn7.m(dx0Var2, lp2Var, kl5VarL7);
            if (lp2Var.S) {
                p61.v(I3, lp2Var, I3, dx0Var3);
            } else {
                p61.v(I3, lp2Var, I3, dx0Var3);
            }
            pn7.m(dx0Var5, lp2Var, kx4VarQ7);
            j5 = j4;
            zy0Var4 = zy0Var3;
            mb6.a(ox1Var2.a(new dw0(j5)), zy0Var4, lp2Var, 56);
            lp2Var.p(true);
            lp2Var.p(true);
        } else {
            dn2Var2 = dn2Var;
            zy0Var4 = zy0Var3;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final zy0 zy0Var5 = zy0Var4;
            final dn2 dn2Var3 = dn2Var2;
            j86VarR.d = new rn2(re2Var, j, j2, j3, j5, zy0Var, o88Var, o88Var2, dn2Var3, zy0Var2, zy0Var5, f, i) { // from class: yo
                public final /* synthetic */ re2 Y;
                public final /* synthetic */ long Z;
                public final /* synthetic */ long f0;
                public final /* synthetic */ long g0;
                public final /* synthetic */ long h0;
                public final /* synthetic */ zy0 i0;
                public final /* synthetic */ o88 j0;
                public final /* synthetic */ o88 k0;
                public final /* synthetic */ dn2 l0;
                public final /* synthetic */ zy0 m0;
                public final /* synthetic */ zy0 n0;
                public final /* synthetic */ float o0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    zo.c(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }
}
