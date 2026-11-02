package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r45 {
    public static k45 a(SubscriptionItem subscriptionItem, String str) {
        if (str.length() == 0) {
            return e45.a;
        }
        if (!subscriptionItem.b0()) {
            return i45.a;
        }
        if (dh3.f(subscriptionItem.getUrl(), str)) {
            return h45.a;
        }
        subscriptionItem.w0(str);
        if (subscriptionItem.getEncryptedUrl()) {
            subscriptionItem.j0(false);
            subscriptionItem.k0(null);
            subscriptionItem.n0(true);
        }
        return j45.a;
    }
}
