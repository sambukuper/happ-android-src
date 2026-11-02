package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sx2 {
    public static final ox1 a = new ox1(new tv2((byte) 14), (byte) 1);

    public static final void a(kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        lp2Var.X(-589861158);
        byte b = 2;
        if (lp2Var.N(i & 1, (i & 3) != 2)) {
            px2 px2Var = (px2) lp2Var.j(a);
            lp2Var2 = lp2Var;
            lh7 lh7VarB = ri.b(((Boolean) px2Var.a.getValue()).booleanValue() ? 0.5f : 0.0f, null, "BackgroundAlpha", lp2Var2, 3072, 22);
            if (((Number) lh7VarB.getValue()).floatValue() > 0.0f) {
                lp2Var2.W(-1842276124);
                s86 s86Var = (s86) px2Var.b.getValue();
                boolean zF = lp2Var2.f(lh7VarB) | lp2Var2.f(s86Var);
                Object objK = lp2Var2.K();
                if (zF || objK == zz0.a) {
                    objK = new zw2(s86Var, lh7VarB, b);
                    lp2Var2.g0(objK);
                }
                yn0.b(6, (gn2) objK, lp2Var2, kx4Var);
                lp2Var2.p(false);
            } else {
                lp2Var2.W(-1841718744);
                lp2Var2.p(false);
            }
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var, i, b);
        }
    }

    public static final void b(final kx4 kx4Var, final zy0 zy0Var, rn2 rn2Var, rn2 rn2Var2, int i, long j, v09 v09Var, final zy0 zy0Var2, lp2 lp2Var, final int i2) {
        int i3;
        final rn2 rn2Var3;
        final rn2 rn2Var4;
        final int i4;
        final long j2;
        final v09 v09Var2;
        final rn2 rn2Var5;
        final int i5;
        final rn2 rn2Var6;
        final long j3;
        final v09 an8Var;
        lp2Var.X(862283297);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        int i6 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i6 = i3 | 11648;
        }
        if ((196608 & i2) == 0) {
            i6 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i6 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= lp2Var.h(zy0Var2) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if (lp2Var.N(i6 & 1, (4793491 & i6) != 4793490)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                zy0 zy0Var3 = pu.e;
                zy0 zy0Var4 = pu.f;
                long j4 = ((dp) lp2Var.j(ep.z)).b.a;
                WeakHashMap weakHashMap = c29.w;
                rn2Var5 = zy0Var3;
                i5 = 2;
                rn2Var6 = zy0Var4;
                j3 = j4;
                an8Var = new an8(hw7.b(lp2Var).g, hw7.b(lp2Var).b);
            } else {
                lp2Var.Q();
                rn2Var5 = rn2Var;
                rn2Var6 = rn2Var2;
                i5 = i;
                j3 = j;
                an8Var = v09Var;
            }
            lp2Var.q();
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = new px2();
                lp2Var.g0(objK);
            }
            final px2 px2Var = (px2) objK;
            final lh7 lh7VarB = ri.b(((Boolean) px2Var.a.getValue()).booleanValue() ? 4.0f : 0.0f, null, "BlurRadius", lp2Var, 3072, 22);
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new ky2();
                lp2Var.g0(objK2);
            }
            final ky2 ky2Var = (ky2) objK2;
            mb6.b(new t06[]{a.a(px2Var), ly2.a.a(ky2Var)}, jm4.U(1848515297, new rn2() { // from class: qx2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        FillElement fillElement = b.c;
                        Object objK3 = lp2Var2.K();
                        be beVar2 = zz0.a;
                        if (objK3 == beVar2) {
                            d0 d0Var = new d0(1, px2Var, px2.class, "updateRootCoordinates", "updateRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V", 0, (byte) 12);
                            lp2Var2.g0(d0Var);
                            objK3 = d0Var;
                        }
                        kx4 kx4VarQ = vr3.Q(fillElement, (gn2) ((pv3) objK3));
                        xr4 xr4VarC = g80.c(pz2.Z, false);
                        int iHashCode = Long.hashCode(lp2Var2.T);
                        kl5 kl5VarL = lp2Var2.l();
                        kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarQ);
                        uz0.j.getClass();
                        lp2Var2.Z();
                        if (lp2Var2.S) {
                            lp2Var2.k();
                        } else {
                            lp2Var2.j0();
                        }
                        pn7.m(pz2.B0, lp2Var2, xr4VarC);
                        pn7.m(pz2.A0, lp2Var2, kl5VarL);
                        pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
                        pn7.l(lp2Var2);
                        pn7.m(pz2.z0, lp2Var2, kx4VarQ2);
                        float fFloatValue = ((Number) lh7VarB.getValue()).floatValue();
                        lp2Var2.W(-527085418);
                        kx4 kx4VarT = kx4Var;
                        if (fFloatValue > 0.0f) {
                            px2 px2Var2 = (px2) lp2Var2.j(sx2.a);
                            int i7 = bu2.b;
                            vt2 vt2Var = (vt2) lp2Var2.j(y01.g);
                            Object objK4 = lp2Var2.K();
                            if (objK4 == beVar2) {
                                objK4 = new wt2(vt2Var);
                                lp2Var2.g0(objK4);
                            }
                            xt2 xt2Var = ((wt2) objK4).Y;
                            s86 s86Var = (s86) px2Var2.b.getValue();
                            Object objK5 = lp2Var2.K();
                            Object obj3 = objK5;
                            if (objK5 == beVar2) {
                                df dfVarC = u15.c();
                                dfVarC.e(0);
                                lp2Var2.g0(dfVarC);
                                obj3 = dfVarC;
                            }
                            df dfVar = (df) obj3;
                            boolean zH = lp2Var2.h(xt2Var) | lp2Var2.c(fFloatValue) | lp2Var2.f(s86Var) | lp2Var2.h(dfVar);
                            Object objK6 = lp2Var2.K();
                            if (zH || objK6 == beVar2) {
                                objK6 = new yc7(xt2Var, fFloatValue, s86Var, dfVar);
                                lp2Var2.g0(objK6);
                            }
                            kx4VarT = w79.t(kx4VarT, (gn2) objK6);
                        }
                        lp2Var2.p(false);
                        wl7.i(kx4VarT, zy0Var, rn2Var5, null, rn2Var6, i5, j3, 0L, an8Var, zy0Var2, lp2Var2, 0);
                        yn0.g(ky2Var, z91.T(l80.a(hx4.X, pz2.f0), z91.d), lp2Var2, 6);
                        sx2.a(fillElement, lp2Var2, 6);
                        lp2Var2.p(true);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, 48);
            rn2Var3 = rn2Var5;
            rn2Var4 = rn2Var6;
            i4 = i5;
            j2 = j3;
            v09Var2 = an8Var;
        } else {
            lp2Var.Q();
            rn2Var3 = rn2Var;
            rn2Var4 = rn2Var2;
            i4 = i;
            j2 = j;
            v09Var2 = v09Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: rx2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sx2.b(kx4Var, zy0Var, rn2Var3, rn2Var4, i4, j2, v09Var2, zy0Var2, (lp2) obj, w79.P(i2 | 1));
                    return dn8.a;
                }
            };
        }
    }
}
