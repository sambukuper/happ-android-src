package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw6 implements rn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ cw6(byte b) {
        this.X = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        lm lmVar;
        Object objA;
        hv6 hv6Var = (hv6) obj;
        switch (this.X) {
            case 0:
                return obj2;
            case 1:
                ql qlVar = (ql) obj2;
                return i21.f(qlVar.Y, gw6.a(qlVar.X, gw6.a, hv6Var));
            case 2:
                return Integer.valueOf(((x38) obj2).a);
            case 3:
                g78 g78Var = (g78) obj2;
                return i21.f(Float.valueOf(g78Var.a), Float.valueOf(g78Var.b));
            case 4:
                i78 i78Var = (i78) obj2;
                v88 v88Var = new v88(i78Var.a);
                fw6 fw6Var = gw6.v;
                return i21.f(gw6.a(v88Var, fw6Var, hv6Var), gw6.a(new v88(i78Var.b), fw6Var, hv6Var));
            case 5:
                return Integer.valueOf(((dj2) obj2).X);
            case 6:
                oa4 oa4Var = (oa4) obj2;
                return i21.f(oa4Var.a, gw6.a(oa4Var.b, gw6.i, hv6Var));
            case 7:
                return Float.valueOf(((x20) obj2).a);
            case 8:
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(gw6.a((pl) list.get(i), gw6.b, hv6Var));
                }
                return arrayList;
            case 9:
                f88 f88Var = (f88) obj2;
                return i21.f(Integer.valueOf((int) (f88Var.a >> 32)), Integer.valueOf((int) (f88Var.a & 4294967295L)));
            case 10:
                t67 t67Var = (t67) obj2;
                return i21.f(gw6.a(new dw0(t67Var.a), gw6.p, hv6Var), gw6.a(new z85(t67Var.b), gw6.x, hv6Var), Float.valueOf(t67Var.c));
            case 11:
                return Integer.valueOf(((o28) obj2).a);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Integer.valueOf(((b48) obj2).a);
            case 13:
                return Integer.valueOf(((w23) obj2).a);
            case 14:
                return Integer.valueOf(((bj2) obj2).a);
            case 15:
                return Integer.valueOf(((cj2) obj2).a);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                v88 v88Var2 = (v88) obj2;
                return v88Var2 != null ? v88.a(v88Var2.a, v88.c) : false ? Boolean.FALSE : i21.f(Float.valueOf(v88.c(v88Var2.a)), gw6.a(new w88(v88.b(v88Var2.a)), gw6.w, hv6Var));
            case 17:
                na4 na4Var = (na4) obj2;
                return i21.f(na4Var.a, gw6.a(na4Var.b, gw6.i, hv6Var));
            case 18:
                long j = ((w88) obj2).a;
                if (w88.a(j, 8589934592L)) {
                    return 0;
                }
                if (w88.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 19:
                z85 z85Var = (z85) obj2;
                return z85Var != null ? z85.b(z85Var.a, 9205357640488583168L) : false ? Boolean.FALSE : i21.f(Float.valueOf(Float.intBitsToFloat((int) (z85Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (z85Var.a & 4294967295L))));
            case 20:
                pl plVar = (pl) obj2;
                Object obj3 = plVar.a;
                if (obj3 instanceof xg5) {
                    lmVar = lm.X;
                } else if (obj3 instanceof qe7) {
                    lmVar = lm.Y;
                } else if (obj3 instanceof yu8) {
                    lmVar = lm.Z;
                } else if (obj3 instanceof fq8) {
                    lmVar = lm.f0;
                } else if (obj3 instanceof oa4) {
                    lmVar = lm.g0;
                } else if (obj3 instanceof na4) {
                    lmVar = lm.h0;
                } else {
                    if (!(obj3 instanceof ul7)) {
                        throw new UnsupportedOperationException();
                    }
                    lmVar = lm.i0;
                }
                switch (lmVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = gw6.a((xg5) obj3, gw6.g, hv6Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = gw6.a((qe7) obj3, gw6.h, hv6Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = gw6.a((yu8) obj3, gw6.c, hv6Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = gw6.a((fq8) obj3, gw6.d, hv6Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = gw6.a((oa4) obj3, gw6.e, hv6Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = gw6.a((na4) obj3, gw6.f, hv6Var);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((ul7) obj3).a;
                        break;
                    default:
                        b61.c();
                        return null;
                }
                return i21.f(lmVar, objA, Integer.valueOf(plVar.b), Integer.valueOf(plVar.c), plVar.d);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                List list2 = ((ge4) obj2).X;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(gw6.a((ce4) list2.get(i2), gw6.z, hv6Var));
                }
                return arrayList2;
            case 22:
                return ((ce4) obj2).a.toLanguageTag();
            case 23:
                aa4 aa4Var = (aa4) obj2;
                return i21.f(gw6.a(new x94(aa4Var.a), gw6.B, hv6Var), gw6.a(new z94(aa4Var.b), gw6.C, hv6Var), gw6.a(new y94(aa4Var.c), gw6.D, hv6Var));
            case 24:
                return Float.valueOf(((x94) obj2).a);
            case 25:
                return Integer.valueOf(((z94) obj2).a);
            case 26:
                return Integer.valueOf(((y94) obj2).a);
            case 27:
                return ((yu8) obj2).a;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                xg5 xg5Var = (xg5) obj2;
                Object objA2 = gw6.a(new o28(xg5Var.a), gw6.q, hv6Var);
                Object objA3 = gw6.a(new b48(xg5Var.b), gw6.r, hv6Var);
                Object objA4 = gw6.a(new v88(xg5Var.c), gw6.v, hv6Var);
                i78 i78Var2 = xg5Var.d;
                i78 i78Var3 = i78.c;
                Object objA5 = gw6.a(i78Var2, gw6.l, hv6Var);
                Object objA6 = gw6.a(xg5Var.e, zc1.c, hv6Var);
                aa4 aa4Var2 = xg5Var.f;
                aa4 aa4Var3 = aa4.d;
                return i21.f(objA2, objA3, objA4, objA5, objA6, gw6.a(aa4Var2, gw6.A, hv6Var), gw6.a(new v94(xg5Var.g), zc1.e, hv6Var), gw6.a(new w23(xg5Var.h), gw6.s, hv6Var), gw6.a(xg5Var.i, zc1.f, hv6Var));
            default:
                return ((fq8) obj2).a;
        }
    }
}
