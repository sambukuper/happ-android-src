package defpackage;

import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i40 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ i40(zy0 zy0Var, h30 h30Var, Object obj, Object obj2, int i) {
        this.X = (byte) 1;
        this.Y = zy0Var;
        this.f0 = h30Var;
        this.g0 = obj;
        this.h0 = obj2;
        this.Z = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        Object obj5 = this.Y;
        dn8 dn8Var = dn8.a;
        int i = this.Z;
        Object obj6 = this.f0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                z68.c((nr5) obj6, (zy0) obj5, (jc8) obj3, (zy0) obj4, (lp2) obj, w79.P(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP = w79.P(i) | 1;
                ((zy0) obj5).e((h30) obj6, this.g0, this.h0, (lp2) obj, iP);
                break;
            case 2:
                ((Integer) obj2).getClass();
                gr2.a((GeoFileKey) obj6, (StateDownloadFileV2.Error) obj5, (gn2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP2 = w79.P(i | 1);
                yn0.j((Boolean) obj6, this.Y, (d94) obj4, (gn2) obj3, (lp2) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                ch3.e((sq6) obj6, (dn2) obj5, (gn2) obj4, (o87) obj3, (lp2) obj, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ i40(nr5 nr5Var, zy0 zy0Var, jc8 jc8Var, zy0 zy0Var2, int i) {
        this.X = (byte) 0;
        this.f0 = nr5Var;
        this.Y = zy0Var;
        this.h0 = jc8Var;
        this.g0 = zy0Var2;
        this.Z = i;
    }

    public /* synthetic */ i40(sq6 sq6Var, dn2 dn2Var, gn2 gn2Var, o87 o87Var, int i) {
        this.X = (byte) 4;
        this.f0 = sq6Var;
        this.Y = dn2Var;
        this.g0 = gn2Var;
        this.h0 = o87Var;
        this.Z = i;
    }

    public /* synthetic */ i40(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = obj2;
        this.g0 = obj3;
        this.h0 = obj4;
        this.Z = i;
    }
}
