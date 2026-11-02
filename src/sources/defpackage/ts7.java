package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class ts7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(int i, final gn2 gn2Var, lp2 lp2Var, kx4 kx4Var) {
        gn2Var.getClass();
        lp2Var.X(-1616166490);
        int i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            String strJ0 = vj8.j0(y46.sub_properties_title, lp2Var);
            boolean z = (i2 & 112) == 32;
            Object objK = lp2Var.K();
            if (z || objK == zz0.a) {
                final byte b = 12;
                objK = new dn2() { // from class: ba3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object invoke() {
                        byte b2 = b;
                        dn8 dn8Var = dn8.a;
                        gn2 gn2Var2 = gn2Var;
                        switch (b2) {
                            case 0:
                                gn2Var2.B(pa3.a);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                gn2Var2.B(ra3.a);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                gn2Var2.B(eg4.a);
                                break;
                            case 3:
                                gn2Var2.B(eh4.a);
                                break;
                            case 4:
                                gn2Var2.B(wg4.a);
                                break;
                            case 5:
                                gn2Var2.B(xg4.a);
                                break;
                            case 6:
                                gn2Var2.B(ho6.a);
                                break;
                            case 7:
                                gn2Var2.B(po6.a);
                                break;
                            case 8:
                                gn2Var2.B(oo7.a);
                                break;
                            case 9:
                                gn2Var2.B(ko7.a);
                                break;
                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                                gn2Var2.B(jo7.a);
                                break;
                            case 11:
                                gn2Var2.B(mo7.a);
                                break;
                            default:
                                gn2Var2.B(mt7.a);
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var.g0(objK);
            }
            dh3.b(strJ0, kx4Var, (dn2) objK, (sn2) null, lp2Var, (i2 << 3) & 112, 8);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new pn6(kx4Var, gn2Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            if (hq8Var != null && f(hq8Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(hb0 hb0Var) {
        StringBuilder sb = new StringBuilder(hb0Var.size());
        for (int i = 0; i < hb0Var.size(); i++) {
            byte bA = hb0Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ViewParent d(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(k46.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lv8 e(ArrayList arrayList, gn2 gn2Var) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iB = ((er8) gn2Var.B((hq8) it.next())).B();
            if (iB != 0) {
                if (i2 != iB && i2 != 0) {
                    hi5.z0("UseCaseUtil");
                }
                i2 = iB;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iT = ((er8) gn2Var.B((hq8) it2.next())).t();
            if (iT != 0) {
                if (i != iT && i != 0) {
                    hi5.z0("UseCaseUtil");
                }
                i = iT;
            }
        }
        lv8.X.getClass();
        if (i2 == 1 || i == 1) {
            return lv8.Z;
        }
        if (i2 == 2) {
            return lv8.g0;
        }
        return i == 2 ? lv8.f0 : lv8.Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(hq8 hq8Var) {
        hq8Var.getClass();
        if (hq8Var.h.h(er8.W)) {
            return hq8Var.h.s() == gr8.f0;
        }
        hq8Var.toString();
        hi5.z0("UseCaseUtil");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(nh1 nh1Var, Object obj, gn2 gn2Var) {
        t6 t6Var;
        if (!((jx4) nh1Var).X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var = ((jx4) nh1Var).X.g0;
        LayoutNode layoutNodeZ = yn0.Z(nh1Var);
        while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 262144) != 0) {
                while (jx4Var != null) {
                    if ((jx4Var.Z & 262144) != 0) {
                        jx4 jx4VarT = jx4Var;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ye8) {
                                ye8 ye8Var = (ye8) jx4VarT;
                                if (!(obj.equals(ye8Var.o()) ? ((Boolean) gn2Var.B(ye8Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                int i = 0;
                                for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                    if ((jx4Var2.Z & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            jx4VarT = jx4Var2;
                                        } else {
                                            if (c15Var == null) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var.b(jx4Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var);
                        }
                    }
                    jx4Var = jx4Var.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(ye8 ye8Var, gn2 gn2Var) {
        t6 t6Var;
        jx4 jx4Var = (jx4) ye8Var;
        if (!jx4Var.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var2 = jx4Var.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(ye8Var);
        while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 262144) != 0) {
                while (jx4Var2 != null) {
                    if ((jx4Var2.Z & 262144) != 0) {
                        jx4 jx4VarT = jx4Var2;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            boolean zBooleanValue = true;
                            if (jx4VarT instanceof ye8) {
                                ye8 ye8Var2 = (ye8) jx4VarT;
                                if (dh3.f(ye8Var.o(), ye8Var2.o()) && ye8Var.getClass() == ye8Var2.getClass()) {
                                    zBooleanValue = ((Boolean) gn2Var.B(ye8Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                int i = 0;
                                for (jx4 jx4Var3 = ((oh1) jx4VarT).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if ((jx4Var3.Z & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            jx4VarT = jx4Var3;
                                        } else {
                                            if (c15Var == null) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (jx4VarT != null) {
                                                c15Var.b(jx4VarT);
                                                jx4VarT = null;
                                            }
                                            c15Var.b(jx4Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            jx4VarT = yn0.T(c15Var);
                        }
                    }
                    jx4Var2 = jx4Var2.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(jx4 jx4Var, String str, gn2 gn2Var) {
        if (!jx4Var.X.p0) {
            wc3.b("visitSubtreeIf called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var2 = jx4Var.X;
        jx4 jx4Var3 = jx4Var2.h0;
        if (jx4Var3 == null) {
            yn0.n(c15Var, jx4Var2);
        } else {
            c15Var.b(jx4Var3);
        }
        while (true) {
            int i = c15Var.Z;
            if (i == 0) {
                return;
            }
            jx4 jx4Var4 = (jx4) c15Var.k(i - 1);
            if ((jx4Var4.f0 & 262144) != 0) {
                jx4 jx4Var5 = jx4Var4;
                while (true) {
                    if (jx4Var5 != null && jx4Var5.p0) {
                        if ((jx4Var5.Z & 262144) != 0) {
                            jx4 jx4VarT = jx4Var5;
                            c15 c15Var2 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ye8) {
                                    ye8 ye8Var = (ye8) jx4VarT;
                                    xe8 xe8Var = str.equals(ye8Var.o()) ? (xe8) gn2Var.B(ye8Var) : xe8.X;
                                    if (xe8Var == xe8.Z) {
                                        return;
                                    }
                                    if (xe8Var == xe8.Y) {
                                        break;
                                    }
                                } else if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                    int i2 = 0;
                                    for (jx4 jx4Var6 = ((oh1) jx4VarT).r0; jx4Var6 != null; jx4Var6 = jx4Var6.h0) {
                                        if ((jx4Var6.Z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                jx4VarT = jx4Var6;
                                            } else {
                                                if (c15Var2 == null) {
                                                    c15Var2 = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var2.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var2.b(jx4Var6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var2);
                            }
                        }
                        jx4Var5 = jx4Var5.h0;
                    }
                }
            }
            yn0.n(c15Var, jx4Var4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(ye8 ye8Var, gn2 gn2Var) {
        jx4 jx4Var = (jx4) ye8Var;
        if (!jx4Var.X.p0) {
            wc3.b("visitSubtreeIf called on an unattached node");
        }
        c15 c15Var = new c15(0, new jx4[16]);
        jx4 jx4Var2 = jx4Var.X;
        jx4 jx4Var3 = jx4Var2.h0;
        if (jx4Var3 == null) {
            yn0.n(c15Var, jx4Var2);
        } else {
            c15Var.b(jx4Var3);
        }
        while (true) {
            int i = c15Var.Z;
            if (i == 0) {
                return;
            }
            jx4 jx4Var4 = (jx4) c15Var.k(i - 1);
            if ((jx4Var4.f0 & 262144) != 0) {
                jx4 jx4Var5 = jx4Var4;
                while (true) {
                    if (jx4Var5 != null && jx4Var5.p0) {
                        if ((jx4Var5.Z & 262144) != 0) {
                            jx4 jx4VarT = jx4Var5;
                            c15 c15Var2 = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ye8) {
                                    ye8 ye8Var2 = (ye8) jx4VarT;
                                    xe8 xe8Var = (dh3.f(ye8Var.o(), ye8Var2.o()) && ye8Var.getClass() == ye8Var2.getClass()) ? (xe8) gn2Var.B(ye8Var2) : xe8.X;
                                    if (xe8Var == xe8.Z) {
                                        return;
                                    }
                                    if (xe8Var == xe8.Y) {
                                        break;
                                    }
                                } else if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                    int i2 = 0;
                                    for (jx4 jx4Var6 = ((oh1) jx4VarT).r0; jx4Var6 != null; jx4Var6 = jx4Var6.h0) {
                                        if ((jx4Var6.Z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                jx4VarT = jx4Var6;
                                            } else {
                                                if (c15Var2 == null) {
                                                    c15Var2 = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var2.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var2.b(jx4Var6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var2);
                            }
                        }
                        jx4Var5 = jx4Var5.h0;
                    }
                }
            }
            yn0.n(c15Var, jx4Var4);
        }
    }
}
