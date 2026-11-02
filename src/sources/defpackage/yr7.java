package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yr7 {
    public final String a;
    public final SubscriptionItem b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yr7(String str, SubscriptionItem subscriptionItem, boolean z) {
        str.getClass();
        subscriptionItem.getClass();
        this.a = str;
        this.b = subscriptionItem;
        this.c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr7)) {
            return false;
        }
        yr7 yr7Var = (yr7) obj;
        return dh3.f(this.a, yr7Var.a) && dh3.f(this.b, yr7Var.b) && this.c == yr7Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionItemUiState(id=");
        sb.append(this.a);
        sb.append(", subscription=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return p61.o(sb, this.c, ")");
    }
}
