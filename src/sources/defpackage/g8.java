package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ g8(za3 za3Var, dn2 dn2Var, o87 o87Var, int i) {
        this.X = (byte) 9;
        this.g0 = za3Var;
        this.f0 = dn2Var;
        this.Y = o87Var;
        this.Z = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        int i = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj5 = this.f0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                n8.d((dn2) obj5, (vn1) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                w45.a((v30) obj5, (q8) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                x97.d((kx4) obj5, (q06) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                z68.h((jc8) obj5, (y05) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((zy0) obj3).j(obj5, obj4, (lp2) obj, w79.P(i) | 1);
                break;
            case 5:
                ((Integer) obj2).getClass();
                l51.a((h51) obj5, (kx4) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ng1.c((h30) obj4, (h38) obj3, (dn2) obj5, (lp2) obj, w79.P(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pu.a((dr2) obj4, (dn2) obj5, (o87) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                w79.a((kx4) obj5, (rn2) obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                pu.c((za3) obj4, (dn2) obj5, (o87) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iP = w79.P(1);
                wl7.k((z64) obj5, this.g0, this.Z, this.Y, (lp2) obj, iP);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((o74) obj5).b(obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((Integer) obj2).intValue();
                yn0.k((d94) obj5, (l94) obj4, (gn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                w45.e((lg4) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                w51.d((sn6) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((jv6) obj5).b(obj4, (zy0) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((Integer) obj2).getClass();
                mn7.a((qn7) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                sp7.b((vp7) obj5, (kx4) obj4, (rn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                us7.a((is7) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ct7.b((ms7) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                dt7.a((SubscriptionSortType) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((Integer) obj2).getClass();
                xt7.a((ps7) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((b88) obj5).b((Object[]) obj4, (gn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ g8(zy0 zy0Var, Object obj, Object obj2, int i) {
        this.X = (byte) 4;
        this.Y = zy0Var;
        this.f0 = obj;
        this.g0 = obj2;
        this.Z = i;
    }

    public /* synthetic */ g8(dn2 dn2Var, vn1 vn1Var, zy0 zy0Var, int i) {
        this.X = (byte) 0;
        this.f0 = dn2Var;
        this.g0 = vn1Var;
        this.Y = zy0Var;
        this.Z = i;
    }

    public /* synthetic */ g8(dr2 dr2Var, dn2 dn2Var, o87 o87Var, int i) {
        this.X = (byte) 7;
        this.g0 = dr2Var;
        this.f0 = dn2Var;
        this.Y = o87Var;
        this.Z = i;
    }

    public /* synthetic */ g8(h30 h30Var, h38 h38Var, dn2 dn2Var, int i) {
        this.X = (byte) 6;
        this.g0 = h30Var;
        this.Y = h38Var;
        this.f0 = dn2Var;
        this.Z = i;
    }

    public /* synthetic */ g8(z64 z64Var, Object obj, int i, Object obj2, int i2) {
        this.X = (byte) 10;
        this.f0 = z64Var;
        this.g0 = obj;
        this.Z = i;
        this.Y = obj2;
    }

    public /* synthetic */ g8(jc8 jc8Var, y05 y05Var, zy0 zy0Var, int i) {
        this.X = (byte) 3;
        this.f0 = jc8Var;
        this.g0 = y05Var;
        this.Y = zy0Var;
        this.Z = i;
    }

    public /* synthetic */ g8(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.X = b;
        this.f0 = obj;
        this.g0 = obj2;
        this.Y = obj3;
        this.Z = i;
    }
}
