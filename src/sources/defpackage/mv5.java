package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mv5 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ om6 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mv5(gn2 gn2Var, om6 om6Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = om6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        om6 om6Var = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                RouteProfile routeProfile = om6Var.a;
                routeProfile.getClass();
                gn2Var.B(new sv5(routeProfile));
                break;
            default:
                RouteProfile routeProfile2 = om6Var.a;
                routeProfile2.getClass();
                gn2Var.B(new sv5(routeProfile2));
                break;
        }
        return dn8Var;
    }
}
