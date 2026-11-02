package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class um6 {
    public final RouteProfile a;
    public final boolean b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public um6(RouteProfile routeProfile, boolean z) {
        routeProfile.getClass();
        this.a = routeProfile;
        this.b = z;
        this.c = routeProfile.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um6)) {
            return false;
        }
        um6 um6Var = (um6) obj;
        return dh3.f(this.a, um6Var.a) && this.b == um6Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RouteProfileUiState(entity=" + this.a + ", isGeoFilesFailed=" + this.b + ")";
    }
}
