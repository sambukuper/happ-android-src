package defpackage;

import su.happ.proxyutility.domain.routing.entity.GeoFileKey;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class fr2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ GeoFileKey Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fr2(gn2 gn2Var, GeoFileKey geoFileKey, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = geoFileKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        GeoFileKey geoFileKey = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                String strD = geoFileKey.d();
                strD.getClass();
                gn2Var.B(new wq2(strD));
                break;
            default:
                gn2Var.B(new xq2(geoFileKey));
                break;
        }
        return dn8Var;
    }
}
