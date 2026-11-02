package defpackage;

import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew6 implements rn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ ew6(byte b) {
        this.X = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                hv6 hv6Var = (hv6) obj;
                qe7 qe7Var = (qe7) obj2;
                dw0 dw0Var = new dw0(qe7Var.a.b());
                fw6 fw6Var = gw6.p;
                Object objA = gw6.a(dw0Var, fw6Var, hv6Var);
                v88 v88Var = new v88(qe7Var.b);
                fw6 fw6Var2 = gw6.v;
                Object objA2 = gw6.a(v88Var, fw6Var2, hv6Var);
                dj2 dj2Var = qe7Var.c;
                dj2 dj2Var2 = dj2.Y;
                Object objA3 = gw6.a(dj2Var, gw6.m, hv6Var);
                Object objA4 = gw6.a(qe7Var.d, gw6.t, hv6Var);
                Object objA5 = gw6.a(qe7Var.e, gw6.u, hv6Var);
                String str = qe7Var.g;
                Object objA6 = gw6.a(new v88(qe7Var.h), fw6Var2, hv6Var);
                Object objA7 = gw6.a(qe7Var.i, gw6.n, hv6Var);
                Object objA8 = gw6.a(qe7Var.j, gw6.k, hv6Var);
                ge4 ge4Var = qe7Var.k;
                ge4 ge4Var2 = ge4.Z;
                Object objA9 = gw6.a(ge4Var, gw6.y, hv6Var);
                Object objA10 = gw6.a(new dw0(qe7Var.l), fw6Var, hv6Var);
                Object objA11 = gw6.a(qe7Var.m, gw6.j, hv6Var);
                t67 t67Var = qe7Var.n;
                t67 t67Var2 = t67.d;
                return i21.f(objA, objA2, objA3, objA4, objA5, -1, str, objA6, objA7, objA8, objA9, objA10, objA11, gw6.a(t67Var, gw6.o, hv6Var));
            case 1:
                hv6 hv6Var2 = (hv6) obj;
                c88 c88Var = (c88) obj2;
                qe7 qe7Var2 = c88Var.a;
                xd6 xd6Var = gw6.h;
                return i21.f(gw6.a(qe7Var2, xd6Var, hv6Var2), gw6.a(c88Var.b, xd6Var, hv6Var2), gw6.a(c88Var.c, xd6Var, hv6Var2), gw6.a(c88Var.d, xd6Var, hv6Var2));
            case 2:
                fp5 fp5Var = (fp5) obj2;
                Boolean boolValueOf = Boolean.valueOf(fp5Var.a);
                xd6 xd6Var2 = gw6.a;
                return i21.f(boolValueOf, gw6.a(new nz1(fp5Var.b), zc1.d, (hv6) obj));
            case 3:
                return Integer.valueOf(((nz1) obj2).a);
            case 4:
                return Integer.valueOf(((v94) obj2).a);
            case 5:
                e88 e88Var = (e88) obj2;
                return i21.f(gw6.a(new d88(e88Var.a), zc1.g, (hv6) obj), Boolean.valueOf(e88Var.b));
            case 6:
                return Integer.valueOf(((d88) obj2).a);
            case 7:
                return Integer.valueOf(((ay6) obj2).X.l());
            case 8:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = d02.X;
                }
                return wv0.H0(collection, list);
            case 9:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 10:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 11:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 13:
                return (kl6) obj;
            case 14:
                return (String) obj;
            case 15:
                return (dn8) obj;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 17:
                return (x67) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 19:
                return (c51) obj;
            case 20:
                return (wc) obj;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return (ga2) obj;
            case 22:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 23:
                if (obj == null && obj2 == null) {
                    return null;
                }
                c2.m();
                return null;
            case 24:
                return obj == null ? obj2 : obj;
            case 25:
                y07 y07Var = (y07) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                t07 t07Var = ((y07) obj).d;
                e17 e17Var = c17.u;
                Object objG = t07Var.X.g(e17Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = y07Var.d.X.g(e17Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 26:
                return (p87) ((rh5) ((o87) obj2).d.i0).getValue();
            case 27:
                return Integer.valueOf(((tr4) obj).k(((Integer) obj2).intValue()));
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return Integer.valueOf(((tr4) obj).m(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((tr4) obj).K(((Integer) obj2).intValue()));
        }
    }
}
