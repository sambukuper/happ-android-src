package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx0 implements rn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ dx0(byte b) {
        this.X = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [c15] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [c15] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ex0 ex0Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                q61 q61Var = (q61) obj2;
                str.getClass();
                q61Var.getClass();
                if (str.length() == 0) {
                    return q61Var.toString();
                }
                return str + ", " + q61Var;
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                ix4 ix4Var = (ix4) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(ix4Var);
                return sb;
            case 2:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                }
                return dn8Var;
            case 3:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 4:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g73 g73VarB = vr3.k;
                    if (g73VarB == null) {
                        f73 f73Var = new f73("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i = gu8.a;
                        fe7 fe7Var = new fe7(dw0.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new vi5(20.0f, 11.0f));
                        arrayList.add(new ti5(7.83f));
                        arrayList.add(new cj5(5.59f, -5.59f));
                        arrayList.add(new ui5(12.0f, 4.0f));
                        arrayList.add(new cj5(-8.0f, 8.0f));
                        arrayList.add(new cj5(8.0f, 8.0f));
                        arrayList.add(new cj5(1.41f, -1.41f));
                        arrayList.add(new ui5(7.83f, 13.0f));
                        arrayList.add(new ti5(20.0f));
                        arrayList.add(new hj5(-2.0f));
                        arrayList.add(ri5.c);
                        f73.a(f73Var, arrayList, fe7Var);
                        g73VarB = f73Var.b();
                        vr3.k = g73VarB;
                    }
                    os4.a(g73VarB, null, "Back", ((dp) lp2Var3.j(ep.z)).c.a, lp2Var3, 384, 2);
                } else {
                    lp2Var3.Q();
                }
                return dn8Var;
            case 5:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    vr3.c(os4.z(hx4.X, 0.0f, 16.0f, 1), 0.0f, 0.0f, null, 0L, lp2Var4, 6);
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 6:
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 7:
                lp2 lp2Var6 = (lp2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lp2Var6.Q();
                }
                return dn8Var;
            case 8:
                lp2 lp2Var7 = (lp2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!lp2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lp2Var7.Q();
                }
                return dn8Var;
            case 9:
                lp2 lp2Var8 = (lp2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (lp2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    z39.c(null, lp2Var8, 0, 1);
                } else {
                    lp2Var8.Q();
                }
                return dn8Var;
            case 10:
                lp2 lp2Var9 = (lp2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (lp2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    os4.a(ci8.w(), null, vj8.j0(y46.more, lp2Var9), ((dp) lp2Var9.j(ep.z)).c.a, lp2Var9, 0, 2);
                } else {
                    lp2Var9.Q();
                }
                return dn8Var;
            case 11:
                lp2 lp2Var10 = (lp2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (lp2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zc1.g(vj8.j0(y46.sub_routing_delete_warning, lp2Var10), null, o88.a(((ds) lp2Var10.j(es.a)).c, ((dp) lp2Var10.j(ep.z)).c.b, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var10, 0, 506);
                } else {
                    lp2Var10.Q();
                }
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                lp2 lp2Var11 = (lp2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (lp2Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    zc1.g(vj8.j0(y46.sub_routing_duplicated_name_description, lp2Var11), b.a, o88.a(((ds) lp2Var11.j(es.a)).c, ((dp) lp2Var11.j(ep.z)).c.b, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var11, 48, 504);
                } else {
                    lp2Var11.Q();
                }
                return dn8Var;
            case 13:
                lp2 lp2Var12 = (lp2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (lp2Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    zc1.g(vj8.j0(y46.update_settings_install_from_unknown, lp2Var12), b.a, o88.a(((ds) lp2Var12.j(es.a)).c, ((dp) lp2Var12.j(ep.z)).c.b, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var12, 48, 504);
                } else {
                    lp2Var12.Q();
                }
                return dn8Var;
            case 14:
                lp2 lp2Var13 = (lp2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (lp2Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    os4.a(ci8.w(), null, vj8.j0(y46.settings, lp2Var13), ((dp) lp2Var13.j(ep.z)).c.a, lp2Var13, 0, 2);
                } else {
                    lp2Var13.Q();
                }
                return dn8Var;
            case 15:
                lp2 lp2Var14 = (lp2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (lp2Var14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    os4.a(ci8.w(), null, vj8.j0(y46.settings, lp2Var14), ((dp) lp2Var14.j(ep.z)).c.a, lp2Var14, 0, 2);
                } else {
                    lp2Var14.Q();
                }
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                lp2 lp2Var15 = (lp2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!lp2Var15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    lp2Var15.Q();
                }
                return dn8Var;
            case 17:
                lp2 lp2Var16 = (lp2) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!lp2Var16.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    lp2Var16.Q();
                }
                return dn8Var;
            case 18:
                ((LayoutNode) ((uz0) obj)).g0((kx4) obj2);
                return dn8Var;
            case 19:
                u01 u01Var = (u01) obj2;
                LayoutNode layoutNode = (LayoutNode) ((uz0) obj);
                layoutNode.D0 = u01Var;
                t6 t6Var = layoutNode.H0;
                ox1 ox1Var = y01.h;
                kl5 kl5Var = (kl5) u01Var;
                kl5Var.getClass();
                layoutNode.c0((fi1) x97.S(kl5Var, ox1Var));
                kl5 kl5Var2 = (kl5) u01Var;
                z24 z24Var = (z24) x97.S(kl5Var2, y01.n);
                if (layoutNode.B0 != z24Var) {
                    layoutNode.B0 = z24Var;
                    layoutNode.H();
                    LayoutNode layoutNodeW = layoutNode.w();
                    if (layoutNodeW != null) {
                        layoutNodeW.F();
                    } else {
                        mf5 mf5Var = layoutNode.q0;
                        if (mf5Var != null) {
                            ((AndroidComposeView) mf5Var).invalidate();
                        }
                    }
                    layoutNode.G();
                    for (jx4 jx4Var = (jx4) t6Var.i0; jx4Var != null; jx4Var = jx4Var.h0) {
                        jx4Var.V();
                    }
                }
                layoutNode.h0((fw8) x97.S(kl5Var2, y01.t));
                jx4 jx4Var2 = (jx4) t6Var.i0;
                if ((jx4Var2.f0 & 32768) != 0) {
                    while (jx4Var2 != null) {
                        if ((jx4Var2.Z & 32768) != 0) {
                            ?? T = jx4Var2;
                            ?? c15Var = 0;
                            while (T != 0) {
                                if (T instanceof s01) {
                                    jx4 jx4Var3 = ((jx4) ((s01) T)).X;
                                    if (jx4Var3.p0) {
                                        j55.c(jx4Var3);
                                    } else {
                                        jx4Var3.l0 = true;
                                    }
                                } else if ((T.Z & 32768) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var4 = ((oh1) T).r0;
                                    int i2 = 0;
                                    while (jx4Var4 != null) {
                                        if ((jx4Var4.Z & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                T = T;
                                                c15Var = c15Var;
                                                c15Var = c15Var;
                                                T = jx4Var4;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var4);
                                            }
                                        } else {
                                            T = T;
                                            c15Var = c15Var;
                                        }
                                        jx4Var4 = jx4Var4.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i2 == 1) {
                                        T = T;
                                        c15Var = c15Var;
                                    } else {
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                        if ((jx4Var2.f0 & 32768) != 0) {
                            jx4Var2 = jx4Var2.h0;
                        }
                    }
                }
                return dn8Var;
            case 20:
                ((LayoutNode) ((uz0) obj)).f0((xr4) obj2);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((LayoutNode) ((uz0) obj)).j0 = ((Integer) obj2).intValue();
                return dn8Var;
            case 22:
                s61 s61Var = (s61) obj;
                q61 q61Var2 = (q61) obj2;
                s61Var.getClass();
                q61Var2.getClass();
                s61 s61VarA0 = s61Var.a0(q61Var2.getKey());
                b02 b02Var = b02.X;
                if (s61VarA0 == b02Var) {
                    return q61Var2;
                }
                pz2 pz2Var = pz2.E0;
                u61 u61Var = (u61) s61VarA0.H0(pz2Var);
                if (u61Var == null) {
                    ex0Var = new ex0(q61Var2, s61VarA0);
                } else {
                    s61 s61VarA1 = s61VarA0.a0(pz2Var);
                    if (s61VarA1 == b02Var) {
                        return new ex0(u61Var, q61Var2);
                    }
                    ex0Var = new ex0(u61Var, new ex0(q61Var2, s61VarA1));
                }
                return ex0Var;
            case 23:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 24:
                return ((s61) obj).B0((q61) obj2);
            case 25:
                return ((s61) obj).B0((q61) obj2);
            case 26:
                mu4 mu4Var = (mu4) obj;
                Throwable cancellationException = (Throwable) obj2;
                mu4Var.getClass();
                ux0 ux0Var = mu4Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ux0Var.l0(cancellationException);
                return dn8Var;
            case 27:
                String str2 = (String) obj2;
                str2.getClass();
                return Boolean.valueOf(!dh3.f((String) obj, str2));
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                String str3 = (String) obj2;
                str3.getClass();
                return Boolean.valueOf(dh3.f((String) obj, str3));
            default:
                return Boolean.valueOf(dh3.f(obj, obj2));
        }
    }
}
