package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class rq7 {
    public static boolean a = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(kr7 kr7Var, dn2 dn2Var, tn2 tn2Var, rn2 rn2Var, o87 o87Var, lp2 lp2Var, int i) {
        kr7Var.getClass();
        dn2Var.getClass();
        tn2Var.getClass();
        rn2Var.getClass();
        lp2Var.X(1223994517);
        y05 y05VarO = i21.o(kr7Var.g, lp2Var);
        boolean z = (((i & 14) ^ 6) > 4 && lp2Var.h(kr7Var)) || (i & 6) == 4;
        Object objK = lp2Var.K();
        if (z || objK == zz0.a) {
            al5 al5Var = new al5(1, kr7Var, kr7.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/subscription_edit/SubscriptionEditUiIntent;)V", 0, (byte) 18);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        int i2 = i >> 9;
        vr3.d(dn2Var, o87Var, false, false, false, false, jm4.U(1417628720, new lv5(kr7Var, tn2Var, rn2Var, (pv3) objK, y05VarO), lp2Var), lp2Var, ((i >> 3) & 14) | 12582912 | (i2 & 112) | (i2 & 896), 120);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new kr4(kr7Var, dn2Var, tn2Var, rn2Var, o87Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:224:0x047b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0482  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d5  */
    public static final void b(zy0 zy0Var, final rn2 rn2Var, sn2 sn2Var, final rn2 rn2Var2, final rn2 rn2Var3, rn2 rn2Var4, final rn2 rn2Var5, final boolean z, final q58 q58Var, o58 o58Var, final zy0 zy0Var2, rn2 rn2Var6, final gg5 gg5Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        rn2 rn2Var7;
        sn2 sn2Var2;
        rn2 rn2Var8;
        o58 o58Var2;
        boolean z2;
        p50 p50Var;
        boolean z3;
        boolean z4;
        Object objK;
        byte b;
        int I;
        final zy0 zy0Var3 = zy0Var;
        p50 p50Var2 = pz2.i0;
        p50 p50Var3 = pz2.Z;
        lp2Var.X(-1086465551);
        int i5 = i & 6;
        hx4 hx4Var = hx4.X;
        if (i5 == 0) {
            i3 = i | (lp2Var.f(hx4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(zy0Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.h(rn2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.h(sn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.h(rn2Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= lp2Var.h(rn2Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= lp2Var.h(rn2Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= lp2Var.h(rn2Var5) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= lp2Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.f(q58Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? lp2Var.f(o58Var) : lp2Var.h(o58Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.h(zy0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= lp2Var.h(rn2Var6) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= lp2Var.f(gg5Var) ? 2048 : 1024;
        }
        int i7 = i4;
        if (lp2Var.N(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            float fK = pn7.k(lp2Var);
            int i8 = i7 & 14;
            boolean zC = ((i7 & 7168) == 2048) | ((i6 & 234881024) == 67108864) | ((i6 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && lp2Var.f(o58Var))) | lp2Var.c(fK);
            Object objK2 = lp2Var.K();
            be beVar = zz0.a;
            if (zC || objK2 == beVar) {
                d68 d68Var = new d68(z, q58Var, o58Var, gg5Var, fK);
                lp2Var.g0(d68Var);
                objK2 = d68Var;
            }
            d68 d68Var2 = (d68) objK2;
            z24 z24Var = (z24) lp2Var.j(y01.n);
            int I2 = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, (kx4) r26);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, d68Var2);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I2))) {
                p61.v(I2, lp2Var, I2, dx0Var3);
            }
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            zy0Var2.K(lp2Var, Integer.valueOf((r17 >> 3) & 14));
            xv4 xv4Var = xv4.X;
            if (rn2Var2 != null) {
                lp2Var.W(-1445181094);
                kx4 kx4VarO = x97.O(hx4Var, "Leading");
                t03 t03Var = yf3.a;
                kx4 kx4VarY = kx4VarO.y(xv4Var);
                xr4 xr4VarC = g80.c(p50Var2, false);
                int I3 = km4.I(lp2Var);
                kl5 kl5VarL2 = lp2Var.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarY);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC);
                pn7.m(dx0Var2, lp2Var, kl5VarL2);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I3))) {
                    p61.v(I3, lp2Var, I3, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ2);
                rn2Var2.K(lp2Var, Integer.valueOf((i6 >> 12) & 14));
                lp2Var.p(true);
                z2 = false;
                lp2Var.p(false);
            } else {
                z2 = false;
                lp2Var.W(-1444935078);
                lp2Var.p(false);
            }
            if (rn2Var3 != null) {
                lp2Var.W(-1444892360);
                kx4 kx4VarO2 = x97.O((kx4) r26, "Trailing");
                t03 t03Var2 = yf3.a;
                kx4 kx4VarY2 = kx4VarO2.y(xv4Var);
                xr4 xr4VarC2 = g80.c((p50) r16, z2);
                int I4 = km4.I(lp2Var);
                kl5 kl5VarL3 = lp2Var.l();
                kx4 kx4VarQ3 = w45.Q(lp2Var, kx4VarY2);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC2);
                pn7.m(dx0Var2, lp2Var, kl5VarL3);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I4))) {
                    p61.v(I4, lp2Var, I4, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ3);
                rn2Var3.K(lp2Var, Integer.valueOf((i6 >> 15) & 14));
                lp2Var.p(true);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1444644422);
                lp2Var.p(z2);
            }
            float fH = os4.h(gg5Var, z24Var);
            float fG = os4.g(gg5Var, z24Var);
            float fN = pn7.n(lp2Var);
            if (rn2Var2 != null) {
                fH -= fN;
                if (fH < 0.0f) {
                    fH = 0.0f;
                }
            }
            float f = fH;
            if (rn2Var3 != null) {
                fG -= fN;
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
            }
            float f2 = fG;
            if (rn2Var4 != null) {
                lp2Var.W(-1443868027);
                kx4 kx4VarA = os4.A(b.m(b.c(x97.O((kx4) r26, "Prefix"), 24.0f, 2)), f, 0.0f, 2.0f, 0.0f, 10);
                p50Var = p50Var3;
                xr4 xr4VarC3 = g80.c(p50Var, false);
                int I5 = km4.I(lp2Var);
                kl5 kl5VarL4 = lp2Var.l();
                kx4 kx4VarQ4 = w45.Q(lp2Var, kx4VarA);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC3);
                pn7.m(dx0Var2, lp2Var, kl5VarL4);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I5))) {
                    p61.v(I5, lp2Var, I5, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ4);
                rn2Var8 = rn2Var4;
                rn2Var8.K(lp2Var, Integer.valueOf((i6 >> 18) & 14));
                lp2Var.p(true);
                lp2Var.p(false);
            } else {
                rn2Var8 = rn2Var4;
                p50Var = r18;
                lp2Var.W(-1443540326);
                lp2Var.p(false);
            }
            if (rn2Var5 != null) {
                lp2Var.W(-1443497081);
                kx4 kx4VarA2 = os4.A(b.m(b.c(x97.O((kx4) r26, "Suffix"), 24.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                xr4 xr4VarC4 = g80.c(p50Var, false);
                int I6 = km4.I(lp2Var);
                kl5 kl5VarL5 = lp2Var.l();
                kx4 kx4VarQ5 = w45.Q(lp2Var, kx4VarA2);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC4);
                pn7.m(dx0Var2, lp2Var, kl5VarL5);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I6))) {
                    p61.v(I6, lp2Var, I6, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ5);
                rn2Var5.K(lp2Var, Integer.valueOf((i6 >> 21) & 14));
                lp2Var.p(true);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1443171302);
                lp2Var.p(false);
            }
            kx4 kx4VarA3 = os4.A((kx4) r26, f, 0.0f, f2, 0.0f, 10);
            if (rn2Var != null) {
                lp2Var.W(-1442671489);
                kx4 kx4VarO3 = x97.O((kx4) r26, "Label");
                if (i8 != 4) {
                    if ((i7 & 8) != 0) {
                        o58Var2 = o58Var;
                        if (lp2Var.h(o58Var2)) {
                        }
                        objK = lp2Var.K();
                        if (!z4 || objK == beVar) {
                            b = 1;
                            objK = new ee5(o58Var2, (byte) 1);
                            lp2Var.g0(objK);
                        } else {
                            b = 1;
                        }
                        kx4 kx4VarY3 = b.m(z68.q0(kx4VarO3, new zt0((dn2) objK, b))).y(kx4VarA3);
                        xr4 xr4VarC5 = g80.c(p50Var, false);
                        I = km4.I(lp2Var);
                        kl5 kl5VarL6 = lp2Var.l();
                        kx4 kx4VarQ6 = w45.Q(lp2Var, kx4VarY3);
                        lp2Var.Z();
                        if (lp2Var.S) {
                            lp2Var.k();
                        } else {
                            lp2Var.j0();
                        }
                        pn7.m(dx0Var, lp2Var, xr4VarC5);
                        pn7.m(dx0Var2, lp2Var, kl5VarL6);
                        if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                            p61.v(I, lp2Var, I, dx0Var3);
                        }
                        pn7.m(dx0Var4, lp2Var, kx4VarQ6);
                        rn2Var.K(lp2Var, Integer.valueOf((i6 >> 6) & 14));
                        lp2Var.p(true);
                        lp2Var.p(false);
                    } else {
                        o58Var2 = o58Var;
                    }
                    z4 = false;
                    objK = lp2Var.K();
                    if (z4) {
                        b = 1;
                        objK = new ee5(o58Var2, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        b = 1;
                        objK = new ee5(o58Var2, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4VarY4 = b.m(z68.q0(kx4VarO3, new zt0((dn2) objK, b))).y(kx4VarA3);
                    xr4 xr4VarC6 = g80.c(p50Var, false);
                    I = km4.I(lp2Var);
                    kl5 kl5VarL7 = lp2Var.l();
                    kx4 kx4VarQ7 = w45.Q(lp2Var, kx4VarY4);
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(dx0Var, lp2Var, xr4VarC6);
                    pn7.m(dx0Var2, lp2Var, kl5VarL7);
                    if (lp2Var.S) {
                        p61.v(I, lp2Var, I, dx0Var3);
                    } else {
                        p61.v(I, lp2Var, I, dx0Var3);
                    }
                    pn7.m(dx0Var4, lp2Var, kx4VarQ7);
                    rn2Var.K(lp2Var, Integer.valueOf((i6 >> 6) & 14));
                    lp2Var.p(true);
                    lp2Var.p(false);
                } else {
                    o58Var2 = o58Var;
                }
                z4 = true;
                objK = lp2Var.K();
                if (z4) {
                    b = 1;
                    objK = new ee5(o58Var2, (byte) 1);
                    lp2Var.g0(objK);
                } else {
                    b = 1;
                    objK = new ee5(o58Var2, (byte) 1);
                    lp2Var.g0(objK);
                }
                kx4 kx4VarY5 = b.m(z68.q0(kx4VarO3, new zt0((dn2) objK, b))).y(kx4VarA3);
                xr4 xr4VarC7 = g80.c(p50Var, false);
                I = km4.I(lp2Var);
                kl5 kl5VarL8 = lp2Var.l();
                kx4 kx4VarQ8 = w45.Q(lp2Var, kx4VarY5);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC7);
                pn7.m(dx0Var2, lp2Var, kl5VarL8);
                if (lp2Var.S) {
                    p61.v(I, lp2Var, I, dx0Var3);
                } else {
                    p61.v(I, lp2Var, I, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ8);
                rn2Var.K(lp2Var, Integer.valueOf((i6 >> 6) & 14));
                lp2Var.p(true);
                lp2Var.p(false);
            } else {
                o58Var2 = o58Var;
                lp2Var.W(-1442276518);
                lp2Var.p(false);
            }
            kx4 kx4VarA4 = os4.A(b.m(b.c((kx4) r26, 24.0f, 2)), rn2Var8 == null ? f : 0.0f, 0.0f, rn2Var5 == null ? f2 : 0.0f, 0.0f, 10);
            if (sn2Var != null) {
                lp2Var.W(-1441906533);
                sn2Var2 = sn2Var;
                sn2Var2.x(x97.O((kx4) r26, "Hint").y(kx4VarA4), lp2Var, Integer.valueOf((i6 >> 6) & 112));
                lp2Var.p(false);
            } else {
                sn2Var2 = sn2Var;
                lp2Var.W(-1441815238);
                lp2Var.p(false);
            }
            kx4 kx4VarY6 = x97.O((kx4) r26, "TextField").y(kx4VarA4);
            xr4 xr4VarC8 = g80.c(p50Var, true);
            int I7 = km4.I(lp2Var);
            kl5 kl5VarL9 = lp2Var.l();
            kx4 kx4VarQ9 = w45.Q(lp2Var, kx4VarY6);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC8);
            pn7.m(dx0Var2, lp2Var, kl5VarL9);
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I7))) {
                p61.v(I7, lp2Var, I7, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var, kx4VarQ9);
            zy0Var3 = zy0Var;
            zy0Var3.K(lp2Var, Integer.valueOf((i6 >> 3) & 14));
            lp2Var.p(true);
            if (rn2Var6 != null) {
                lp2Var.W(-1441566587);
                kx4 kx4VarW = os4.w(b.m(b.c(x97.O((kx4) r26, "Supporting"), 16.0f, 2)), new ig5(16.0f, 4.0f, 16.0f, 0.0f));
                xr4 xr4VarC9 = g80.c(p50Var, false);
                int I8 = km4.I(lp2Var);
                kl5 kl5VarL10 = lp2Var.l();
                kx4 kx4VarQ10 = w45.Q(lp2Var, kx4VarW);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC9);
                pn7.m(dx0Var2, lp2Var, kl5VarL10);
                if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I8))) {
                    p61.v(I8, lp2Var, I8, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var, kx4VarQ10);
                rn2Var7 = rn2Var6;
                rn2Var7.K(lp2Var, Integer.valueOf((r17 >> 6) & 14));
                z3 = true;
                lp2Var.p(true);
                lp2Var.p(false);
            } else {
                rn2Var7 = rn2Var6;
                z3 = true;
                lp2Var.W(-1441177382);
                lp2Var.p(false);
            }
            lp2Var.p(z3);
        } else {
            rn2Var7 = rn2Var6;
            sn2Var2 = sn2Var;
            rn2Var8 = rn2Var4;
            o58Var2 = o58Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            final rn2 rn2Var9 = rn2Var8;
            final o58 o58Var3 = o58Var2;
            final sn2 sn2Var3 = sn2Var2;
            final rn2 rn2Var10 = rn2Var7;
            j86VarR.d = new rn2() { // from class: p58
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i | 1);
                    int iP2 = w79.P(i2);
                    rq7.b(zy0Var3, rn2Var, sn2Var3, rn2Var2, rn2Var3, rn2Var9, rn2Var5, z, q58Var, o58Var3, zy0Var2, rn2Var10, gg5Var, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(sq7 sq7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(1742306364);
        int i2 = i | (lp2Var2.f(sq7Var) ? 4 : 2) | (lp2Var2.h(gn2Var) ? 32 : 16);
        if (lp2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            final y68 y68VarA0 = z68.A0(sq7Var.k0, lp2Var2, 2);
            final y68 y68VarA1 = z68.A0(sq7Var.l0, lp2Var2, 2);
            tw0 tw0VarA = rw0.a(new ft(8.0f, new bt()), pz2.q0, lp2Var2, 6);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, tw0VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            FillElement fillElement = b.a;
            String strJ0 = vj8.j0(y46.dialog_subscription_edit_hint_remarks, lp2Var2);
            o88 o88VarA = o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
            ig5 ig5VarD = os4.d(2);
            long j = ys0.y(lp2Var2).k.a;
            long j2 = ys0.y(lp2Var2).c.a;
            long j3 = ys0.y(lp2Var2).c.c;
            long j4 = ys0.y(lp2Var2).k.c;
            ha2 ha2Var = new ha2(new rr4(25));
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = lp2Var2.K();
            Object obj = zz0.a;
            if (z || objK == obj) {
                objK = new pr2(gn2Var, (byte) 8);
                lp2Var2.g0(objK);
            }
            final byte b = 0;
            final byte b2 = 1;
            final byte b3 = 2;
            z91.f(strJ0, (gn2) objK, fillElement, (kx4) null, 0, y68VarA0, (ay6) null, o88VarA, jm4.U(1015074930, new rn2() { // from class: qq7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj2, Object obj3) {
                    byte b4 = b;
                    hx4 hx4Var = hx4.X;
                    dn8 dn8Var = dn8.a;
                    y68 y68Var = y68VarA0;
                    switch (b4) {
                        case 0:
                            lp2 lp2Var3 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (!lp2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var3.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var3, 48);
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            lp2 lp2Var4 = (lp2) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            if (!lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                lp2Var4.Q();
                            } else {
                                FillElement fillElement2 = b.a;
                                kx4 kx4VarA = os4.A(fillElement2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                wq6 wq6VarA = vq6.a(ht.b, pz2.n0, lp2Var4, 6);
                                int iHashCode2 = Long.hashCode(lp2Var4.T);
                                kl5 kl5VarL2 = lp2Var4.l();
                                kx4 kx4VarQ2 = w45.Q(lp2Var4, kx4VarA);
                                uz0.j.getClass();
                                lp2Var4.Z();
                                if (lp2Var4.S) {
                                    lp2Var4.k();
                                } else {
                                    lp2Var4.j0();
                                }
                                pn7.m(pz2.B0, lp2Var4, wq6VarA);
                                pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                                pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode2));
                                pn7.l(lp2Var4);
                                pn7.m(pz2.z0, lp2Var4, kx4VarQ2);
                                zc1.g(y68Var.c().Z.length() + " / 25", fillElement2, o88.a(((ds) lp2Var4.j(es.a)).d, ((dp) lp2Var4.j(ep.z)).c.c, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 6, 0, 0, 0, false, (gn2) null, lp2Var4, 48, 496);
                                lp2Var4.p(true);
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            lp2 lp2Var5 = (lp2) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            if (!lp2Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                lp2Var5.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var5, 48);
                            }
                            break;
                        default:
                            lp2 lp2Var6 = (lp2) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            if (!lp2Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                lp2Var6.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var6, 48);
                            }
                            break;
                    }
                    return dn8Var;
                }
            }, lp2Var2), jm4.U(-401186972, new rn2() { // from class: qq7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj2, Object obj3) {
                    byte b4 = b2;
                    hx4 hx4Var = hx4.X;
                    dn8 dn8Var = dn8.a;
                    y68 y68Var = y68VarA0;
                    switch (b4) {
                        case 0:
                            lp2 lp2Var3 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (!lp2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var3.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var3, 48);
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            lp2 lp2Var4 = (lp2) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            if (!lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                lp2Var4.Q();
                            } else {
                                FillElement fillElement2 = b.a;
                                kx4 kx4VarA = os4.A(fillElement2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                wq6 wq6VarA = vq6.a(ht.b, pz2.n0, lp2Var4, 6);
                                int iHashCode2 = Long.hashCode(lp2Var4.T);
                                kl5 kl5VarL2 = lp2Var4.l();
                                kx4 kx4VarQ2 = w45.Q(lp2Var4, kx4VarA);
                                uz0.j.getClass();
                                lp2Var4.Z();
                                if (lp2Var4.S) {
                                    lp2Var4.k();
                                } else {
                                    lp2Var4.j0();
                                }
                                pn7.m(pz2.B0, lp2Var4, wq6VarA);
                                pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                                pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode2));
                                pn7.l(lp2Var4);
                                pn7.m(pz2.z0, lp2Var4, kx4VarQ2);
                                zc1.g(y68Var.c().Z.length() + " / 25", fillElement2, o88.a(((ds) lp2Var4.j(es.a)).d, ((dp) lp2Var4.j(ep.z)).c.c, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 6, 0, 0, 0, false, (gn2) null, lp2Var4, 48, 496);
                                lp2Var4.p(true);
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            lp2 lp2Var5 = (lp2) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            if (!lp2Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                lp2Var5.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var5, 48);
                            }
                            break;
                        default:
                            lp2 lp2Var6 = (lp2) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            if (!lp2Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                lp2Var6.Q();
                            } else {
                                z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var6, 48);
                            }
                            break;
                    }
                    return dn8Var;
                }
            }, lp2Var2), false, false, (wx3) null, (w58) null, ha2Var, ig5VarD, j, j2, j3, j4, lp2Var2, 805306752, 1769478, 31064);
            if (sq7Var.m0) {
                lp2Var2.W(-1529650062);
                String strJ1 = vj8.j0(y46.dialog_subscription_edit_hint_url, lp2Var2);
                o88 o88VarA2 = o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                ig5 ig5VarD2 = os4.d(2);
                long j5 = ys0.y(lp2Var2).k.a;
                long j6 = ys0.y(lp2Var2).c.a;
                long j7 = ys0.y(lp2Var2).c.c;
                long j8 = ys0.y(lp2Var2).k.c;
                boolean z2 = sq7Var.o0;
                boolean z3 = i3 == 32;
                Object objK2 = lp2Var2.K();
                if (z3 || objK2 == obj) {
                    objK2 = new pr2(gn2Var, (byte) 9);
                    lp2Var2.g0(objK2);
                }
                z91.f(strJ1, (gn2) objK2, fillElement, (kx4) null, 0, y68VarA1, (ay6) null, o88VarA2, jm4.U(16517133, new rn2() { // from class: qq7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object K(Object obj2, Object obj3) {
                        byte b4 = b3;
                        hx4 hx4Var = hx4.X;
                        dn8 dn8Var = dn8.a;
                        y68 y68Var = y68VarA1;
                        switch (b4) {
                            case 0:
                                lp2 lp2Var3 = (lp2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (!lp2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    lp2Var3.Q();
                                } else {
                                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var3, 48);
                                }
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                lp2 lp2Var4 = (lp2) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                if (!lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    lp2Var4.Q();
                                } else {
                                    FillElement fillElement2 = b.a;
                                    kx4 kx4VarA = os4.A(fillElement2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                    wq6 wq6VarA = vq6.a(ht.b, pz2.n0, lp2Var4, 6);
                                    int iHashCode2 = Long.hashCode(lp2Var4.T);
                                    kl5 kl5VarL2 = lp2Var4.l();
                                    kx4 kx4VarQ2 = w45.Q(lp2Var4, kx4VarA);
                                    uz0.j.getClass();
                                    lp2Var4.Z();
                                    if (lp2Var4.S) {
                                        lp2Var4.k();
                                    } else {
                                        lp2Var4.j0();
                                    }
                                    pn7.m(pz2.B0, lp2Var4, wq6VarA);
                                    pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                                    pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode2));
                                    pn7.l(lp2Var4);
                                    pn7.m(pz2.z0, lp2Var4, kx4VarQ2);
                                    zc1.g(y68Var.c().Z.length() + " / 25", fillElement2, o88.a(((ds) lp2Var4.j(es.a)).d, ((dp) lp2Var4.j(ep.z)).c.c, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 6, 0, 0, 0, false, (gn2) null, lp2Var4, 48, 496);
                                    lp2Var4.p(true);
                                }
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                lp2 lp2Var5 = (lp2) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                if (!lp2Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    lp2Var5.Q();
                                } else {
                                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var5, 48);
                                }
                                break;
                            default:
                                lp2 lp2Var6 = (lp2) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                if (!lp2Var6.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                    lp2Var6.Q();
                                } else {
                                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var6, 48);
                                }
                                break;
                        }
                        return dn8Var;
                    }
                }, lp2Var2), (rn2) null, z2, false, (wx3) null, (w58) null, (de3) null, ig5VarD2, j5, j6, j7, j8, lp2Var2, 805306752, 1572864, 62808);
                lp2Var2 = lp2Var2;
                lp2Var2.p(false);
            } else {
                lp2Var2 = lp2Var2;
                lp2Var2.W(-1528688752);
                lp2Var2.p(false);
            }
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new pq7(sq7Var, gn2Var, kx4Var, i, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(sq7 sq7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(-11005793);
        int i2 = (lp2Var.f(sq7Var) ? 4 : 2) | i | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            w79.a(kx4Var, (rn2) null, jm4.U(-15355798, new pq7(sq7Var, gn2Var, b.a), lp2Var), lp2Var, 390);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new pq7(sq7Var, gn2Var, kx4Var, i, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(ce8 ce8Var, yd8 yd8Var, Object obj, Object obj2, ta2 ta2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(867041821);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(ce8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(yd8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? lp2Var.f(obj) : lp2Var.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? lp2Var.f(obj2) : lp2Var.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? lp2Var.f(ta2Var) : lp2Var.h(ta2Var) ? 16384 : 8192;
        }
        if (!lp2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            lp2Var.Q();
        } else if (ce8Var.g()) {
            yd8Var.f(obj, obj2, ta2Var);
        } else {
            yd8Var.g(obj2, ta2Var, (Object) null, (wk) null);
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new kr4(ce8Var, yd8Var, obj, obj2, ta2Var, i, (byte) 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static dq8 f(String str) {
        String str2 = oi5.Y;
        StringBuilder sb = new StringBuilder();
        sb.append("file:");
        if (str != null) {
            sb.append(str);
        }
        return new dq8(sb.toString(), str2, "file", (String) null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sd8 g(ce8 ce8Var, ug8 ug8Var, String str, lp2 lp2Var, int i, int i2) {
        rd8 rd8Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = lp2Var.f(ce8Var);
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (zF || objK == obj) {
            objK = new sd8(ce8Var, ug8Var, str);
            lp2Var.g0(objK);
        }
        sd8 sd8Var = (sd8) objK;
        boolean zF2 = lp2Var.f(ce8Var) | lp2Var.h(sd8Var);
        Object objK2 = lp2Var.K();
        if (zF2 || objK2 == obj) {
            objK2 = new gq6(ce8Var, sd8Var, (byte) 19);
            lp2Var.g0(objK2);
        }
        u70.a(sd8Var, (gn2) objK2, lp2Var);
        if (ce8Var.g() && (rd8Var = (rd8) sd8Var.b.getValue()) != null) {
            ce8 ce8Var2 = sd8Var.c;
            rd8Var.X.f(rd8Var.Z.B(ce8Var2.f().a()), rd8Var.Z.B(ce8Var2.f().c()), (ta2) rd8Var.Y.B(ce8Var2.f()));
        }
        return sd8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yd8 h(ce8 ce8Var, Object obj, Object obj2, ta2 ta2Var, ug8 ug8Var, lp2 lp2Var, int i) {
        boolean zF = lp2Var.f(ce8Var);
        Object objK = lp2Var.K();
        Object obj3 = zz0.a;
        if (zF || objK == obj3) {
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                wk wkVar = (wk) ug8Var.a.B(obj2);
                wkVar.d();
                objK = new yd8(ce8Var, obj, wkVar, ug8Var);
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                lp2Var.g0(objK);
            } catch (Throwable th) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th;
            }
        }
        yd8 yd8Var = (yd8) objK;
        e(ce8Var, yd8Var, obj, obj2, ta2Var, lp2Var, 0);
        boolean zF2 = lp2Var.f(ce8Var) | lp2Var.f(yd8Var);
        Object objK2 = lp2Var.K();
        if (zF2 || objK2 == obj3) {
            objK2 = new gq6(ce8Var, yd8Var, (byte) 20);
            lp2Var.g0(objK2);
        }
        u70.a(yd8Var, (gn2) objK2, lp2Var);
        return yd8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String i(dq8 dq8Var) {
        List listJ = j(dq8Var);
        String str = dq8Var.b;
        if (listJ.isEmpty()) {
            return null;
        }
        String str2 = dq8Var.e;
        str2.getClass();
        if (!mm7.Z(str2, false, str)) {
            str = "";
        }
        return wv0.y0(listJ, dq8Var.b, str, (String) null, (gn2) null, 60);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List j(dq8 dq8Var) {
        String str = dq8Var.e;
        if (str == null) {
            return d02.X;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iL0 = fm7.l0(str, '/', i2, 4);
            if (iL0 == -1) {
                iL0 = str.length();
            }
            String strSubstring = str.substring(i2, iL0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iL0;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String k(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    wl7.s(0, i2, bArr.length);
                    return new String(bArr, 0, i2, iq0.a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    km4.q(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            qw8.b(viewGroup, z);
        } else if (a) {
            try {
                qw8.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static dq8 m(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = oi5.Y;
        String strW = !dh3.f(str2, "/") ? mm7.W(str, str2, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strW.length()) {
            char cCharAt = strW.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/' && i3 == -1) {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strW.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strW.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strW.substring(0, i6);
            strSubstring = strW.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strW.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strW.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strW.substring(i2, strW.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strK = strSubstring2 != null ? k(strSubstring2, bArr) : null;
        String strK2 = strSubstring != null ? k(strSubstring, bArr) : null;
        String strK3 = strSubstring3 != null ? k(strSubstring3, bArr) : null;
        if (str3 != null) {
            k(str3, bArr);
        }
        if (strSubstring5 != null) {
            k(strSubstring5, bArr);
        }
        return new dq8(strW, str2, strK, strK2, strK3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ce8 n(b15 b15Var, String str, lp2 lp2Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && lp2Var.f(b15Var)) || (i & 6) == 4;
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (z || objK == beVar) {
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                ce8 ce8Var = new ce8(b15Var, (ce8) null, str);
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                lp2Var.g0(ce8Var);
                objK = ce8Var;
            } catch (Throwable th) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th;
            }
        }
        ce8 ce8Var2 = (ce8) objK;
        lp2Var.W(-1356407283);
        ce8Var2.a(b15Var.c.getValue(), lp2Var, 0);
        lp2Var.p(false);
        boolean zF = lp2Var.f(ce8Var2);
        Object objK2 = lp2Var.K();
        if (zF || objK2 == beVar) {
            objK2 = new de8(ce8Var2, (byte) 1);
            lp2Var.g0(objK2);
        }
        u70.a(ce8Var2, (gn2) objK2, lp2Var);
        return ce8Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ce8 o(Object obj, String str, lp2 lp2Var, int i) {
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new ce8(new b15(obj), (ce8) null, str);
            lp2Var.g0(objK);
        }
        ce8 ce8Var = (ce8) objK;
        ce8Var.a(obj, lp2Var, (i & 8) | 48 | (i & 14));
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new de8(ce8Var, (byte) 0);
            lp2Var.g0(objK2);
        }
        u70.a(ce8Var, (gn2) objK2, lp2Var);
        return ce8Var;
    }
}
