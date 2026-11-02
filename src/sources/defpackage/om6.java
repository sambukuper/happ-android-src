package defpackage;

import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class om6 {
    public final RouteProfile a;
    public final SubscriptionItem b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public om6(RouteProfile routeProfile, SubscriptionItem subscriptionItem, boolean z) {
        routeProfile.getClass();
        this.a = routeProfile;
        this.b = subscriptionItem;
        this.c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om6)) {
            return false;
        }
        om6 om6Var = (om6) obj;
        return dh3.f(this.a, om6Var.a) && dh3.f(this.b, om6Var.b) && this.c == om6Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        SubscriptionItem subscriptionItem = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (subscriptionItem == null ? 0 : subscriptionItem.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteProfileCopyUiState(profile=");
        sb.append(this.a);
        sb.append(", subItem=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return p61.o(sb, this.c, ")");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 su.happ.proxyutility.domain.routing.entity.RouteProfile)
  (wrap su.happ.proxyutility.dto.SubscriptionItem:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null su.happ.proxyutility.dto.SubscriptionItem) : (r2v0 su.happ.proxyutility.dto.SubscriptionItem))
  false
 A[MD:(su.happ.proxyutility.domain.routing.entity.RouteProfile, su.happ.proxyutility.dto.SubscriptionItem, boolean):void (m)] (LINE:14) call: om6.<init>(su.happ.proxyutility.domain.routing.entity.RouteProfile, su.happ.proxyutility.dto.SubscriptionItem, boolean):void type: THIS */
    public /* synthetic */ om6(RouteProfile routeProfile, SubscriptionItem subscriptionItem, int i) {
        this(routeProfile, (i & 2) != 0 ? null : subscriptionItem, false);
    }
}
