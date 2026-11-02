package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zo6 implements gn2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zo6(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        ni8 ni8VarE;
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String strD = ((SubId) entry.getKey()).d();
                b83 b83Var = (b83) entry.getValue();
                ep6 ep6Var = (ep6) obj2;
                ep6Var.getClass();
                tn6 tn6VarG = ep6.g(strD);
                j2 j2VarF = ep6Var.f(b83Var);
                if (tn6VarG == null || j2VarF == null) {
                    return null;
                }
                return new qg5(tn6VarG, j2VarF);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ld0 ld0Var = (ld0) obj;
                ld0Var.getClass();
                t14 t14VarC = ((ot8) ld0Var.L().get(((ot8) obj2).j0)).c();
                t14VarC.getClass();
                return t14VarC;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                ((qs7) obj).getClass();
                return (qs7) obj2;
            case 3:
                Throwable th = (Throwable) obj;
                bz7 bz7Var = (bz7) obj2;
                mm0 mm0Var = bz7Var.Z;
                if (mm0Var != null) {
                    mm0Var.z(th);
                }
                bz7Var.Z = null;
                return dn8.a;
            case 4:
                xd6 xd6Var = (xd6) obj2;
                mi8 mi8Var = (mi8) obj;
                hi8 hi8Var = mi8Var.a;
                nl3 nl3Var = mi8Var.b;
                Set set = nl3Var.e;
                if (set != null && set.contains(hi8Var.a())) {
                    return xd6Var.p(nl3Var);
                }
                aa7 aa7VarX = hi8Var.X();
                aa7VarX.getClass();
                LinkedHashSet<hi8> linkedHashSet = new LinkedHashSet();
                y08.d(aa7VarX, aa7VarX, linkedHashSet, set);
                int iG = aq4.G(xv0.Z(linkedHashSet, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                for (hi8 hi8Var2 : linkedHashSet) {
                    if (set == null || !set.contains(hi8Var2)) {
                        Set set2 = nl3Var.e;
                        ni8VarE = we5.e(hi8Var2, nl3Var, xd6Var, xd6Var.q(hi8Var2, nl3.a(nl3Var, (ol3) null, false, set2 != null ? q57.a0(set2, hi8Var) : w45.U(hi8Var), (aa7) null, 47)));
                    } else {
                        ni8VarE = cj8.k(hi8Var2, nl3Var);
                    }
                    linkedHashMap.put(hi8Var2.l(), ni8VarE);
                }
                wi8 wi8Var = new wi8(new xg7(linkedHashMap, (byte) 1));
                List upperBounds = hi8Var.getUpperBounds();
                upperBounds.getClass();
                o57 o57VarK = xd6Var.K(wi8Var, upperBounds, nl3Var);
                if (o57VarK.X.isEmpty()) {
                    return xd6Var.p(nl3Var);
                }
                if (o57VarK.X.k0 == 1) {
                    return (t14) wv0.N0(o57VarK);
                }
                bt.q("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            case 5:
                t14 t14Var = (t14) obj2;
                ((vx4) obj).getClass();
                return t14Var;
            default:
                return rp7.c((Uri) obj2, "fm", ((Number) obj).intValue(), 2);
        }
    }
}
