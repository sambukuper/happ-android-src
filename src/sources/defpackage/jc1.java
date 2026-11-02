package defpackage;

import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 extends hc1 {
    public static final ic1 Companion = new ic1();
    public final int b;

    public jc1(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        em7.c(ie2.h("Unit duration must be positive, but was ", i, " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jc1) {
            return this.b == ((jc1) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ DnsOverHttps.MAX_RESPONSE_SIZE;
    }

    public final String toString() {
        int i = this.b;
        return i % 7 == 0 ? oc1.a(i / 7, "WEEK") : oc1.a(i, "DAY");
    }
}
