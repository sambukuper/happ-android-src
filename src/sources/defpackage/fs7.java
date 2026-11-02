package defpackage;

import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fs7 {
    public static final es7 Companion = new es7();
    public static final g44[] c = {null, x97.P(w74.X, new mq7((byte) 8))};
    public final boolean a;
    public final SubscriptionAutoConnectType b;

    public /* synthetic */ fs7(int i, boolean z, SubscriptionAutoConnectType subscriptionAutoConnectType) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = SubscriptionAutoConnectType.LAST_USED;
        } else {
            this.b = subscriptionAutoConnectType;
        }
    }

    public static fs7 a(fs7 fs7Var, boolean z, SubscriptionAutoConnectType subscriptionAutoConnectType, int i) {
        if ((i & 1) != 0) {
            z = fs7Var.a;
        }
        if ((i & 2) != 0) {
            subscriptionAutoConnectType = fs7Var.b;
        }
        fs7Var.getClass();
        subscriptionAutoConnectType.getClass();
        return new fs7(z, subscriptionAutoConnectType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs7)) {
            return false;
        }
        fs7 fs7Var = (fs7) obj;
        return this.a == fs7Var.a && this.b == fs7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AutoConnectProperties(isEnabled=" + this.a + ", connectType=" + this.b + ")";
    }

    public fs7(boolean z, SubscriptionAutoConnectType subscriptionAutoConnectType) {
        subscriptionAutoConnectType.getClass();
        this.a = z;
        this.b = subscriptionAutoConnectType;
    }

    public /* synthetic */ fs7() {
        this(false, SubscriptionAutoConnectType.LAST_USED);
    }
}
