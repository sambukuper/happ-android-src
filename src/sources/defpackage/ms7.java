package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ms7 {
    public static final ls7 Companion = new ls7();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ ms7(int i, boolean z, boolean z2) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
    }

    public static ms7 a(ms7 ms7Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ms7Var.a;
        }
        if ((i & 2) != 0) {
            z2 = ms7Var.b;
        }
        ms7Var.getClass();
        return new ms7(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms7)) {
            return false;
        }
        ms7 ms7Var = (ms7) obj;
        return this.a == ms7Var.a && this.b == ms7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SendingDataProperties(isSendHwidEnabled=" + this.a + ", isSendHwidAlwaysEnabled=" + this.b + ")";
    }

    public ms7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ ms7() {
        this(true, false);
    }
}
