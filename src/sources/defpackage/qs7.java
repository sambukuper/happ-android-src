package defpackage;

import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qs7 {
    public static final js7 Companion = new js7();
    public static final g44[] k = {null, null, null, null, null, null, null, null, null, x97.P(w74.X, new mq7((byte) 7))};
    public static final kf3 l = new kf3(1, 730, 1);
    public final is7 a;
    public final boolean b;
    public final boolean c;
    public final fs7 d;
    public final boolean e;
    public final boolean f;
    public final ms7 g;
    public final int h;
    public final ps7 i;
    public final SubscriptionSortType j;

    public /* synthetic */ qs7(int i, is7 is7Var, boolean z, boolean z2, fs7 fs7Var, boolean z3, boolean z4, ms7 ms7Var, int i2, ps7 ps7Var, SubscriptionSortType subscriptionSortType) {
        this.a = (i & 1) == 0 ? new is7() : is7Var;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = new fs7();
        } else {
            this.d = fs7Var;
        }
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i & 64) == 0) {
            this.g = new ms7();
        } else {
            this.g = ms7Var;
        }
        if ((i & 128) == 0) {
            this.h = 7;
        } else {
            this.h = i2;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.i = new ps7();
        } else {
            this.i = ps7Var;
        }
        if ((i & 512) == 0) {
            this.j = SubscriptionSortType.WITHOUT;
        } else {
            this.j = subscriptionSortType;
        }
    }

    public static qs7 a(qs7 qs7Var, is7 is7Var, boolean z, boolean z2, fs7 fs7Var, boolean z3, boolean z4, ms7 ms7Var, int i, ps7 ps7Var, SubscriptionSortType subscriptionSortType, int i2) {
        if ((i2 & 1) != 0) {
            is7Var = qs7Var.a;
        }
        is7 is7Var2 = is7Var;
        if ((i2 & 2) != 0) {
            z = qs7Var.b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = qs7Var.c;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            fs7Var = qs7Var.d;
        }
        fs7 fs7Var2 = fs7Var;
        boolean z7 = (i2 & 16) != 0 ? qs7Var.e : z3;
        boolean z8 = (i2 & 32) != 0 ? qs7Var.f : z4;
        ms7 ms7Var2 = (i2 & 64) != 0 ? qs7Var.g : ms7Var;
        int i3 = (i2 & 128) != 0 ? qs7Var.h : i;
        ps7 ps7Var2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? qs7Var.i : ps7Var;
        SubscriptionSortType subscriptionSortType2 = (i2 & 512) != 0 ? qs7Var.j : subscriptionSortType;
        qs7Var.getClass();
        is7Var2.getClass();
        fs7Var2.getClass();
        ms7Var2.getClass();
        ps7Var2.getClass();
        subscriptionSortType2.getClass();
        return new qs7(is7Var2, z5, z6, fs7Var2, z7, z8, ms7Var2, i3, ps7Var2, subscriptionSortType2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs7)) {
            return false;
        }
        qs7 qs7Var = (qs7) obj;
        return dh3.f(this.a, qs7Var.a) && this.b == qs7Var.b && this.c == qs7Var.c && dh3.f(this.d, qs7Var.d) && this.e == qs7Var.e && this.f == qs7Var.f && dh3.f(this.g, qs7Var.g) && this.h == qs7Var.h && dh3.f(this.i, qs7Var.i) && this.j == qs7Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + oi0.e(this.h, (this.g.hashCode() + pc6.f(pc6.f((this.d.hashCode() + pc6.f(pc6.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "SubscriptionProperties(autoUpdate=" + this.a + ", updateOnOpen=" + this.b + ", pingOnOpen=" + this.c + ", autoConnect=" + this.d + ", isCollapseAllowed=" + this.e + ", dontUseFilter=" + this.f + ", sendingData=" + this.g + ", requestTimeoutSec=" + this.h + ", userAgent=" + this.i + ", sortType=" + this.j + ")";
    }

    public qs7(is7 is7Var, boolean z, boolean z2, fs7 fs7Var, boolean z3, boolean z4, ms7 ms7Var, int i, ps7 ps7Var, SubscriptionSortType subscriptionSortType) {
        subscriptionSortType.getClass();
        this.a = is7Var;
        this.b = z;
        this.c = z2;
        this.d = fs7Var;
        this.e = z3;
        this.f = z4;
        this.g = ms7Var;
        this.h = i;
        this.i = ps7Var;
        this.j = subscriptionSortType;
    }

    public /* synthetic */ qs7() {
        this(new is7(), false, false, new fs7(), true, false, new ms7(), 7, new ps7(), SubscriptionSortType.WITHOUT);
    }
}
