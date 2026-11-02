package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ps7 {
    public static final os7 Companion = new os7();
    public final String a;
    public final boolean b;

    public /* synthetic */ ps7(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public static ps7 a(ps7 ps7Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = ps7Var.a;
        }
        if ((i & 2) != 0) {
            z = ps7Var.b;
        }
        ps7Var.getClass();
        str.getClass();
        return new ps7(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps7)) {
            return false;
        }
        ps7 ps7Var = (ps7) obj;
        return dh3.f(this.a, ps7Var.a) && this.b == ps7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UserAgentProperties(value=" + this.a + ", isBlocked=" + this.b + ")";
    }

    public ps7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ ps7() {
        this(_UrlKt.FRAGMENT_ENCODE_SET, false);
    }
}
