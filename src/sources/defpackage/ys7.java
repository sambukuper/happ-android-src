package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class ys7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(final boolean z, boolean z2, final qs7 qs7Var, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        boolean z3;
        lp2 lp2Var2;
        gn2Var.getClass();
        lp2Var.X(794236464);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= lp2Var.g(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(qs7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 16384 : 8192;
        }
        if (lp2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            final FillElement fillElement = b.a;
            String[] stringArray = ((Resources) lp2Var.j(pc.c)).getStringArray(m26.connect_to);
            boolean zF = lp2Var.f(stringArray);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                qm5 qm5VarC = ec7.Y.c();
                int length = stringArray.length;
                int i3 = 0;
                final int i4 = 0;
                while (i3 < length) {
                    qm5VarC.add(new mw2(stringArray[i3], (g73) null, new dn2() { // from class: lx2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object invoke() {
                            byte b2 = b;
                            dn8 dn8Var = dn8.a;
                            int i5 = i4;
                            gn2 gn2Var2 = gn2Var;
                            switch (b2) {
                                case 0:
                                    gn2Var2.B(Integer.valueOf(i5));
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                    gn2Var2.B(new ro6(i5));
                                    break;
                                default:
                                    gn2Var2.B(new it7(i5));
                                    break;
                            }
                            return dn8Var;
                        }
                    }));
                    i3++;
                    i4++;
                }
                objK = qm5VarC.c();
                lp2Var.g0(objK);
            }
            final j2 j2Var = (j2) objK;
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            FillElement fillElement2 = b.a;
            final boolean z4 = z3;
            lp2Var2 = lp2Var;
            ci8.a(fillElement2, (String) null, jm4.U(955800966, new sn2() { // from class: vs7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object x(Object obj, Object obj2, Object obj3) {
                    lp2 lp2Var3 = (lp2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((uw0) obj).getClass();
                    if (lp2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement3 = b.a;
                        final boolean z5 = z;
                        final qs7 qs7Var2 = qs7Var;
                        final gn2 gn2Var2 = gn2Var;
                        final kx4 kx4Var2 = fillElement;
                        final j2 j2Var2 = j2Var;
                        final boolean z6 = z4;
                        w79.a(fillElement3, (rn2) null, jm4.U(2112940635, new rn2() { // from class: xs7
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object K(Object obj4, Object obj5) {
                                lp2 lp2Var4 = (lp2) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z7 = z5;
                                    qs7 qs7Var3 = qs7Var2;
                                    gn2 gn2Var3 = gn2Var2;
                                    kx4 kx4Var3 = kx4Var2;
                                    Object obj6 = zz0.a;
                                    if (z7) {
                                        lp2Var4.W(-425732921);
                                        lp2Var4.p(false);
                                    } else {
                                        lp2Var4.W(-426156319);
                                        String strJ0 = vj8.j0(y46.sub_properties_general_update_on_open, lp2Var4);
                                        boolean z8 = qs7Var3.b;
                                        boolean zF2 = lp2Var4.f(gn2Var3);
                                        Object objK2 = lp2Var4.K();
                                        if (zF2 || objK2 == obj6) {
                                            objK2 = new pr2(gn2Var3, (byte) 16);
                                            lp2Var4.g0(objK2);
                                        }
                                        g33.a(strJ0, z8, (gn2) objK2, kx4Var3, false, (String) null, (gn2) null, lp2Var4, 3072, 240);
                                        lp2Var4.p(false);
                                    }
                                    String strJ1 = vj8.j0(y46.sub_properties_general_ping_on_open, lp2Var4);
                                    boolean z9 = qs7Var3.c;
                                    fs7 fs7Var = qs7Var3.d;
                                    boolean zF3 = lp2Var4.f(gn2Var3);
                                    Object objK3 = lp2Var4.K();
                                    if (zF3 || objK3 == obj6) {
                                        objK3 = new pr2(gn2Var3, (byte) 17);
                                        lp2Var4.g0(objK3);
                                    }
                                    g33.a(strJ1, z9, (gn2) objK3, kx4Var3, false, (String) null, (gn2) null, lp2Var4, 3072, 240);
                                    String strJ2 = vj8.j0(y46.sub_properties_general_connect_on_open, lp2Var4);
                                    boolean z10 = fs7Var.a;
                                    boolean zF4 = lp2Var4.f(gn2Var3);
                                    Object objK4 = lp2Var4.K();
                                    if (zF4 || objK4 == obj6) {
                                        objK4 = new pr2(gn2Var3, (byte) 18);
                                        lp2Var4.g0(objK4);
                                    }
                                    g33.a(strJ2, z10, (gn2) objK4, kx4Var3, false, (String) null, (gn2) null, lp2Var4, 3072, 240);
                                    ys0.g(vj8.j0(y46.sub_properties_general_connect_to, lp2Var4), j2Var2, kx4Var3, fs7Var.b.ordinal(), (tn2) null, lp2Var4, 384, 48);
                                    String strJ3 = vj8.j0(y46.sub_properties_general_collapse, lp2Var4);
                                    boolean z11 = qs7Var3.e;
                                    boolean zF5 = lp2Var4.f(gn2Var3);
                                    Object objK5 = lp2Var4.K();
                                    if (zF5 || objK5 == obj6) {
                                        objK5 = new pr2(gn2Var3, (byte) 19);
                                        lp2Var4.g0(objK5);
                                    }
                                    g33.a(strJ3, z11, (gn2) objK5, kx4Var3, false, (String) null, (gn2) null, lp2Var4, 3072, 240);
                                    if (z6) {
                                        lp2Var4.W(-424006903);
                                        String strJ4 = vj8.j0(y46.sub_properties_general_filter, lp2Var4);
                                        boolean z12 = qs7Var3.f;
                                        boolean zF6 = lp2Var4.f(gn2Var3);
                                        Object objK6 = lp2Var4.K();
                                        if (zF6 || objK6 == obj6) {
                                            objK6 = new pr2(gn2Var3, (byte) 20);
                                            lp2Var4.g0(objK6);
                                        }
                                        g33.a(strJ4, z12, (gn2) objK6, kx4Var3, false, (String) null, (gn2) null, lp2Var4, 3072, 240);
                                        lp2Var4.p(false);
                                    } else {
                                        lp2Var4.W(-423529689);
                                        lp2Var4.p(false);
                                    }
                                } else {
                                    lp2Var4.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var3), lp2Var3, 390);
                    } else {
                        lp2Var3.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var2, 390, 2);
            ch3.f(lp2Var2, b.b(hx4.X, 8.0f));
            vj8.g(vj8.j0(y46.settings_subscription_on_open_description, lp2Var2), os4.z(fillElement2, 16.0f, 0.0f, 2), lp2Var2, 48);
            lp2Var2.p(true);
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new ws7(z, z2, qs7Var, gn2Var, kx4Var, i, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(long j, s86 s86Var) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = s86Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = s86Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = s86Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = s86Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(y78 y78Var, long j) {
        z85 z85Var;
        y24 y24VarE = y78Var.e();
        if (y24VarE != null) {
            y24 y24VarB = y78Var.b();
            if (y24VarB != null) {
                z85Var = new z85((y24VarE.g() && y24VarB.g()) ? y24VarE.C(y24VarB, j) : j);
            } else {
                z85Var = null;
            }
            if (z85Var != null) {
                return z85Var.a;
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yv6 d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(z36.view_tree_saved_state_registry_owner);
            yv6 yv6Var = tag instanceof yv6 ? (yv6) tag : null;
            if (yv6Var != null) {
                return yv6Var;
            }
            Object objD = ts7.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(byte b) {
        return b > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] i(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
