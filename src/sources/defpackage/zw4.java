package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zw4 {
    public static final long a = pn7.h(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:134:0x0220  */
    /* JADX WARN: Code duplicated, block: B:135:0x0223  */
    /* JADX WARN: Code duplicated, block: B:139:0x022d  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b4  */
    public static final void a(final dn2 dn2Var, final o87 o87Var, float f, final boolean z, x67 x67Var, final long j, long j2, long j3, final rn2 rn2Var, rn2 rn2Var2, final ax4 ax4Var, final zy0 zy0Var, lp2 lp2Var, final int i) {
        int i2;
        final float f2;
        final x67 x67Var2;
        final long j4;
        final long j5;
        final rn2 rn2Var3;
        int i3;
        x67 x67Var3;
        long jB;
        long j6;
        float f3;
        rn2 rn2Var4;
        byte b;
        int i4;
        o87 o87Var2;
        dn2 dn2Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objK;
        o87 o87Var3;
        Object objK2;
        lp2Var.X(1904798512);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(dn2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(hx4.X) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(o87Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= lp2Var.g(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i5 |= lp2Var.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = 100663296 | i5;
        if ((805306368 & i) == 0) {
            i6 = 369098752 | i5;
        }
        int i7 = (lp2Var.f(ax4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(rn2Var) ? 4 : 2) | 3088;
        boolean z5 = true;
        if (lp2Var.N(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                float f4 = n70.a;
                float f5 = n70.a;
                x67 x67VarB = q77.b(nr4.J, lp2Var);
                long jA = kw0.a(j, lp2Var);
                i3 = i7 & (-113);
                x67Var3 = x67VarB;
                jB = dw0.b(0.32f, kw0.c(ch3.e, lp2Var));
                j6 = jA;
                f3 = f4;
                rn2Var4 = g0.n0;
                b = 16;
                i4 = i6 & (-1908867073);
            } else {
                lp2Var.Q();
                i3 = i7 & (-113);
                f3 = f;
                x67Var3 = x67Var;
                j6 = j2;
                jB = j3;
                rn2Var4 = rn2Var2;
                i4 = i6 & (-1908867073);
                b = 16;
            }
            lp2Var.q();
            ly4 ly4Var = ly4.X;
            Object objQ0 = w39.q0(ly4Var, lp2Var);
            Object objQ1 = w39.q0(ly4Var, lp2Var);
            Object objQ2 = w39.q0(ly4.f0, lp2Var);
            int i8 = i3;
            int i9 = (i4 & 896) ^ 384;
            boolean zH = ((i9 > 256 && lp2Var.f(o87Var)) || (i4 & 384) == 256) | lp2Var.h(objQ1) | lp2Var.h(objQ2) | lp2Var.h(objQ0);
            Object objK3 = lp2Var.K();
            Object obj = zz0.a;
            if (zH || objK3 == obj) {
                o87Var2 = o87Var;
                Object hdVar = new hd(o87Var2, objQ1, objQ2, objQ0, (byte) 4);
                lp2Var.g0(hdVar);
                objK3 = hdVar;
            } else {
                o87Var2 = o87Var;
            }
            u70.q((dn2) objK3, lp2Var);
            Object objK4 = lp2Var.K();
            if (objK4 == obj) {
                objK4 = u70.D(lp2Var);
                lp2Var.g0(objK4);
            }
            b71 b71Var = (b71) objK4;
            boolean zH2 = ((i9 > 256 && lp2Var.f(o87Var2)) || (i4 & 384) == 256) | lp2Var.h(b71Var);
            int i10 = i4 & 14;
            boolean z6 = zH2 | (i10 == 4);
            Object objK5 = lp2Var.K();
            if (z6 || objK5 == obj) {
                objK5 = new rw4(o87Var2, b71Var, dn2Var);
                lp2Var.g0(objK5);
            }
            dn2 dn2Var3 = (dn2) objK5;
            boolean zH3 = lp2Var.h(b71Var) | ((i9 > 256 && lp2Var.f(o87Var2)) || (i4 & 384) == 256) | (i10 == 4);
            Object objK6 = lp2Var.K();
            if (zH3 || objK6 == obj) {
                objK6 = new sn(b71Var, o87Var2, dn2Var, b);
                lp2Var.g0(objK6);
            }
            gn2 gn2Var = (gn2) objK6;
            Object objK7 = lp2Var.K();
            if (objK7 == obj) {
                objK7 = z51.b(0.0f);
                lp2Var.g0(objK7);
            }
            oi oiVar = (oi) objK7;
            if (i9 <= 256 || !lp2Var.f(o87Var2)) {
                dn2Var2 = dn2Var3;
                if ((i4 & 384) != 256) {
                    z2 = false;
                }
                boolean zH4 = z2 | lp2Var.h(b71Var) | lp2Var.h(oiVar);
                if (i10 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | zH4;
                objK = lp2Var.K();
                if (z4 || objK == obj) {
                    objK = new hd(o87Var2, b71Var, oiVar, dn2Var);
                    lp2Var.g0(objK);
                }
                dn2 dn2Var4 = (dn2) objK;
                o87Var3 = o87Var2;
                int i11 = i4;
                long j7 = jB;
                x97.c(dn2Var4, j6, ax4Var, oiVar, jm4.U(1010026864, new vw4(j7, dn2Var2, o87Var3, ax4Var, oiVar, b71Var, gn2Var, f3, z, x67Var3, j, j6, rn2Var, rn2Var4, zy0Var), lp2Var), lp2Var, (i8 & 896) | 28672);
                if (o87Var3.d.d().a.containsKey(p87.Y)) {
                    lp2Var.W(748459762);
                    if ((i9 > 256 || !lp2Var.f(o87Var3)) && (i11 & 384) != 256) {
                    }
                    objK2 = lp2Var.K();
                    if (z5 || objK2 == obj) {
                        objK2 = new uw4(o87Var3, null, (byte) 2);
                        lp2Var.g0(objK2);
                    }
                    u70.h((rn2) objK2, lp2Var, o87Var3);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(748521266);
                    lp2Var.p(false);
                }
                f2 = f3;
                x67Var2 = x67Var3;
                j5 = j7;
                j4 = j6;
                rn2Var3 = rn2Var4;
            } else {
                dn2Var2 = dn2Var3;
            }
            z2 = true;
            boolean zH5 = z2 | lp2Var.h(b71Var) | lp2Var.h(oiVar);
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | zH5;
            objK = lp2Var.K();
            if (z4) {
                objK = new hd(o87Var2, b71Var, oiVar, dn2Var);
                lp2Var.g0(objK);
            } else {
                objK = new hd(o87Var2, b71Var, oiVar, dn2Var);
                lp2Var.g0(objK);
            }
            dn2 dn2Var5 = (dn2) objK;
            o87Var3 = o87Var2;
            int i12 = i4;
            long j8 = jB;
            x97.c(dn2Var5, j6, ax4Var, oiVar, jm4.U(1010026864, new vw4(j8, dn2Var2, o87Var3, ax4Var, oiVar, b71Var, gn2Var, f3, z, x67Var3, j, j6, rn2Var, rn2Var4, zy0Var), lp2Var), lp2Var, (i8 & 896) | 28672);
            if (o87Var3.d.d().a.containsKey(p87.Y)) {
                lp2Var.W(748459762);
                z5 = i9 > 256 ? false : false;
                objK2 = lp2Var.K();
                if (z5) {
                    objK2 = new uw4(o87Var3, null, (byte) 2);
                    lp2Var.g0(objK2);
                } else {
                    objK2 = new uw4(o87Var3, null, (byte) 2);
                    lp2Var.g0(objK2);
                }
                u70.h((rn2) objK2, lp2Var, o87Var3);
                lp2Var.p(false);
            } else {
                lp2Var.W(748521266);
                lp2Var.p(false);
            }
            f2 = f3;
            x67Var2 = x67Var3;
            j5 = j8;
            j4 = j6;
            rn2Var3 = rn2Var4;
        } else {
            lp2Var.Q();
            f2 = f;
            x67Var2 = x67Var;
            j4 = j2;
            j5 = j3;
            rn2Var3 = rn2Var2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: sw4
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i | 1);
                    zw4.a(dn2Var, o87Var, f2, z, x67Var2, j, j4, j5, rn2Var, rn2Var3, ax4Var, zy0Var, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final oi oiVar, final b71 b71Var, final dn2 dn2Var, final gn2 gn2Var, final kx4 kx4Var, final o87 o87Var, final float f, final boolean z, final x67 x67Var, final long j, final long j2, final float f2, final rn2 rn2Var, final rn2 rn2Var2, final zy0 zy0Var, lp2 lp2Var, final int i) {
        kx4 kx4VarJ;
        lp2Var.X(-37400432);
        int i2 = i | (lp2Var.h(oiVar) ? 32 : 16) | (lp2Var.h(b71Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(dn2Var) ? 2048 : 1024) | (lp2Var.h(gn2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        boolean zF = lp2Var.f(kx4Var);
        int i3 = DnsOverHttps.MAX_RESPONSE_SIZE;
        int i4 = i2 | (zF ? 131072 : 65536) | (lp2Var.f(o87Var) ? 1048576 : 524288) | (lp2Var.c(f) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.g(z) ? 67108864 : 33554432) | (lp2Var.f(x67Var) ? 536870912 : 268435456);
        int i5 = (lp2Var.e(j) ? 4 : 2) | (lp2Var.e(j2) ? 32 : 16) | (lp2Var.c(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(rn2Var) ? 2048 : 1024) | (lp2Var.h(rn2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (lp2Var.h(zy0Var)) {
            i3 = 131072;
        }
        int i6 = i5 | i3;
        if (lp2Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            String strB = w79.B(a56.m3c_bottom_sheet_pane_title, lp2Var);
            kx4 kx4VarY = b.l(l80.a(kx4Var, pz2.f0), f, 1).y(b.a);
            Object obj = zz0.a;
            if (z) {
                lp2Var.W(-1582035383);
                boolean z2 = (((i4 & 3670016) ^ 1572864) > 1048576 && lp2Var.f(o87Var)) || (i4 & 1572864) == 1048576;
                Object objK = lp2Var.K();
                if (z2 || objK == obj) {
                    sg8 sg8Var = m87.a;
                    objK = new l87(o87Var, gn2Var);
                    lp2Var.g0(objK);
                }
                kx4VarJ = z91.J((t25) objK);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1582020872);
                lp2Var.p(false);
                kx4VarJ = hx4.X;
            }
            kx4 kx4VarY2 = kx4VarY.y(kx4VarJ);
            t5 t5Var = o87Var.d;
            t5 t5Var2 = o87Var.d;
            int i7 = (i4 & 3670016) ^ 1572864;
            boolean z3 = (i7 > 1048576 && lp2Var.f(o87Var)) || (i4 & 1572864) == 1048576;
            Object objK2 = lp2Var.K();
            if (z3 || objK2 == obj) {
                objK2 = new b1(o87Var, (byte) 13);
                lp2Var.g0(objK2);
            }
            kx4 kx4VarP = ys0.p(kx4VarY2, t5Var, (rn2) objK2);
            dq dqVar = (dq) t5Var2.h0;
            boolean z4 = z && o87Var.d();
            boolean z5 = ((rh5) t5Var2.m0).getValue() != null;
            boolean z6 = (i4 & 57344) == 16384;
            Object objK3 = lp2Var.K();
            if (z6 || objK3 == obj) {
                objK3 = new ww4(gn2Var, null);
                lp2Var.g0(objK3);
            }
            kx4 kx4VarA = jv1.a(kx4VarP, dqVar, sd5.X, z4, null, z5, (sn2) objK3, false, 168);
            boolean zF2 = lp2Var.f(strB);
            Object objK4 = lp2Var.K();
            if (zF2 || objK4 == obj) {
                objK4 = new m40(strB, (byte) 15);
                lp2Var.g0(objK4);
            }
            kx4 kx4VarA2 = v07.a(kx4VarA, false, (gn2) objK4);
            int iL = (int) ((nh5) t5Var2.k0).l();
            if (iL < 0) {
                iL = 0;
            }
            kx4 kx4VarV = z51.v(kx4VarA2, new wc2(iL));
            boolean z7 = ((i7 > 1048576 && lp2Var.f(o87Var)) || (i4 & 1572864) == 1048576) | ((i4 & 112) == 32 || lp2Var.h(oiVar));
            Object objK5 = lp2Var.K();
            if (z7 || objK5 == obj) {
                objK5 = new zw2(o87Var, oiVar, (byte) 17);
                lp2Var.g0(objK5);
            }
            int i8 = i6 << 6;
            ay7.a(jm4.I(jm4.I(kx4VarV, (gn2) objK5), new t70(o87Var, (byte) 0)), x67Var, j, j2, f2, 0.0f, jm4.U(728743275, new yw4(rn2Var2, oiVar, o87Var, rn2Var, zy0Var, dn2Var, b71Var, z), lp2Var), lp2Var, ((i4 >> 24) & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 96);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(b71Var, dn2Var, gn2Var, kx4Var, o87Var, f, z, x67Var, j, j2, f2, rn2Var, rn2Var2, zy0Var, i) { // from class: qw4
                public final /* synthetic */ b71 Y;
                public final /* synthetic */ dn2 Z;
                public final /* synthetic */ gn2 f0;
                public final /* synthetic */ kx4 g0;
                public final /* synthetic */ o87 h0;
                public final /* synthetic */ float i0;
                public final /* synthetic */ boolean j0;
                public final /* synthetic */ x67 k0;
                public final /* synthetic */ long l0;
                public final /* synthetic */ long m0;
                public final /* synthetic */ float n0;
                public final /* synthetic */ rn2 o0;
                public final /* synthetic */ rn2 p0;
                public final /* synthetic */ zy0 q0;

                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(71);
                    zw4.b(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(final long j, final dn2 dn2Var, final boolean z, final boolean z2, lp2 lp2Var, final int i) {
        lp2Var.X(-391613911);
        byte b = 16;
        int i2 = i | (lp2Var.e(j) ? 4 : 2) | (lp2Var.h(dn2Var) ? 32 : 16) | (lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(z2) ? 2048 : 1024);
        byte b2 = 1;
        if (!lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            lp2Var.Q();
        } else if (j != 16) {
            lp2Var.W(-1438582326);
            lh7 lh7VarB = ri.b(z ? 1.0f : 0.0f, w39.q0(ly4.Z, lp2Var), null, lp2Var, 0, 28);
            Object objB = w79.B(b56.close_sheet, lp2Var);
            kx4 kx4VarA = hx4.X;
            Object obj = zz0.a;
            if (z2) {
                lp2Var.W(-1438283579);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objK = lp2Var.K();
                Object obj2 = objK;
                if (z3 || objK == obj) {
                    Object sdVar = new sd(dn2Var, b2);
                    lp2Var.g0(sdVar);
                    obj2 = sdVar;
                }
                kx4 kx4VarA2 = yy7.a(kx4VarA, dn2Var, (PointerInputEventHandler) obj2);
                boolean zF = (i3 == 32) | lp2Var.f(objB);
                Object objK2 = lp2Var.K();
                Object obj3 = objK2;
                if (zF || objK2 == obj) {
                    Object zw2Var = new zw2(objB, dn2Var, b);
                    lp2Var.g0(zw2Var);
                    obj3 = zw2Var;
                }
                kx4VarA = v07.a(kx4VarA2, true, (gn2) obj3);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1437857391);
                lp2Var.p(false);
            }
            kx4 kx4VarY = b.c.y(kx4VarA);
            int i4 = (lp2Var.f(lh7VarB) ? 1 : 0) | ((i2 & 14) != 4 ? (byte) 0 : (byte) 1);
            Object objK3 = lp2Var.K();
            Object obj4 = objK3;
            if (i4 != 0 || objK3 == obj) {
                Object rc2Var = new rc2(j, lh7VarB);
                lp2Var.g0(rc2Var);
                obj4 = rc2Var;
            }
            yn0.b(0, (gn2) obj4, lp2Var, kx4VarY);
            lp2Var.p(false);
        } else {
            lp2Var.W(-1437676103);
            lp2Var.p(false);
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(j, dn2Var, z, z2, i) { // from class: pw4
                public final /* synthetic */ long X;
                public final /* synthetic */ dn2 Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean f0;

                @Override // defpackage.rn2
                public final Object K(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iP = w79.P(1);
                    zw4.c(this.X, this.Y, this.Z, this.f0, (lp2) obj5, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final float d(pk6 pk6Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pk6Var.t0 >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (w51.H(0.0f, Math.min(pk6Var.v0.getDensity() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(pk6 pk6Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pk6Var.t0 & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (w51.H(0.0f, Math.min(pk6Var.v0.getDensity() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final o87 f(gn2 gn2Var, lp2 lp2Var, int i, int i2) {
        Object obj;
        final byte b = 1;
        final byte b2 = 0;
        final boolean z = (i2 & 1) == 0;
        int i3 = i2 & 2;
        Object obj2 = zz0.a;
        if (i3 != 0) {
            Object objK = lp2Var.K();
            if (objK == obj2) {
                obj = objK;
                Object uh3Var = new uh3((byte) 28);
                lp2Var.g0(uh3Var);
                obj = uh3Var;
            }
            obj = objK;
            gn2Var = (gn2) obj;
        }
        final gn2 gn2Var2 = gn2Var;
        int i4 = (i & 14) | 384 | (i & 112);
        sg8 sg8Var = m87.a;
        final float f = n70.b;
        final float f2 = n70.c;
        final fi1 fi1Var = (fi1) lp2Var.j(y01.h);
        boolean zF = lp2Var.f(fi1Var) | lp2Var.c(f);
        Object objK2 = lp2Var.K();
        Object obj3 = objK2;
        if (zF || objK2 == obj2) {
            Object obj4 = new dn2() { // from class: j87
                @Override // defpackage.dn2
                public final Object invoke() {
                    float fH0;
                    byte b3 = b2;
                    float f3 = f;
                    fi1 fi1Var2 = fi1Var;
                    switch (b3) {
                        case 0:
                            fH0 = fi1Var2.h0(f3);
                            break;
                        default:
                            fH0 = fi1Var2.h0(f3);
                            break;
                    }
                    return Float.valueOf(fH0);
                }
            };
            lp2Var.g0(obj4);
            obj3 = obj4;
        }
        final dn2 dn2Var = (dn2) obj3;
        boolean zF2 = lp2Var.f(fi1Var) | lp2Var.c(f2);
        Object objK3 = lp2Var.K();
        Object obj5 = objK3;
        if (zF2 || objK3 == obj2) {
            Object obj6 = new dn2() { // from class: j87
                @Override // defpackage.dn2
                public final Object invoke() {
                    float fH0;
                    byte b3 = b;
                    float f3 = f2;
                    fi1 fi1Var2 = fi1Var;
                    switch (b3) {
                        case 0:
                            fH0 = fi1Var2.h0(f3);
                            break;
                        default:
                            fH0 = fi1Var2.h0(f3);
                            break;
                    }
                    return Float.valueOf(fH0);
                }
            };
            lp2Var.g0(obj6);
            obj5 = obj6;
        }
        final dn2 dn2Var2 = (dn2) obj5;
        Object[] objArr = {Boolean.valueOf(z), gn2Var2, Boolean.FALSE};
        xd6 xd6Var = new xd6(new ew6((byte) 26), new kg(z, dn2Var, dn2Var2, gn2Var2), (byte) 6);
        int i5 = (((((((i4 & 14) ^ 6) <= 4 || !lp2Var.g(z)) && (i4 & 6) != 4) ? (char) 0 : (char) 1) | (lp2Var.f(dn2Var) ? 1 : 0)) == true ? 1 : 0) | (lp2Var.f(dn2Var2) ? 1 : 0);
        if ((((i4 & 112) ^ 48) <= 32 || !lp2Var.f(gn2Var2)) && (i4 & 48) != 32) {
            b = 0;
        }
        int i6 = i5 | b | (lp2Var.g(false) ? 1 : 0);
        Object objK4 = lp2Var.K();
        if (i6 != 0 || objK4 == obj2) {
            final p87 p87Var = p87.X;
            Object obj7 = new dn2() { // from class: k87
                @Override // defpackage.dn2
                public final Object invoke() {
                    return new o87(z, dn2Var, dn2Var2, p87Var, gn2Var2);
                }
            };
            lp2Var.g0(obj7);
            objK4 = obj7;
        }
        return (o87) jm4.Y(objArr, xd6Var, (dn2) objK4, lp2Var, 0);
    }
}
