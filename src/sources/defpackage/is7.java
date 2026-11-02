package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class is7 {
    public static final hs7 Companion = new hs7();
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;

    public /* synthetic */ is7(int i, boolean z, boolean z2, int i2, int i3, boolean z3) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
    }

    public static is7 a(is7 is7Var, boolean z, boolean z2, int i, int i2, boolean z3, int i3) {
        if ((i3 & 1) != 0) {
            z = is7Var.a;
        }
        boolean z4 = z;
        if ((i3 & 2) != 0) {
            z2 = is7Var.b;
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            i = is7Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = is7Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z3 = is7Var.e;
        }
        is7Var.getClass();
        return new is7(z4, z5, i4, i5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is7)) {
            return false;
        }
        is7 is7Var = (is7) obj;
        return this.a == is7Var.a && this.b == is7Var.b && this.c == is7Var.c && this.d == is7Var.d && this.e == is7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oi0.e(this.d, oi0.e(this.c, pc6.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoUpdateProperties(isEnabled=");
        sb.append(this.a);
        sb.append(", isBlocked=");
        sb.append(this.b);
        sb.append(", updateInterval=");
        oi0.x(sb, this.c, ", initialDelay=", this.d, ", showNotifications=");
        return p61.o(sb, this.e, ")");
    }

    public is7(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
    }

    public /* synthetic */ is7() {
        this(false, false, 1, 1, false);
    }
}
