package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vo6 {
    public final RouteProfile a;
    public final boolean b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vo6(RouteProfile routeProfile, boolean z) {
        this.a = routeProfile;
        this.b = z;
        this.c = routeProfile.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo6)) {
            return false;
        }
        vo6 vo6Var = (vo6) obj;
        return this.a.equals(vo6Var.a) && this.b == vo6Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RoutingProfileUiState(entity=" + this.a + ", isGeoFilesFailed=" + this.b + ")";
    }
}
