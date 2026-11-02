package defpackage;

import okhttp3.internal.http2.Header;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 {
    public static final kb0 d;
    public static final kb0 e;
    public static final kb0 f;
    public static final kb0 g;
    public static final kb0 h;
    public static final kb0 i;
    public final kb0 a;
    public final kb0 b;
    public final int c;

    static {
        kb0 kb0Var = kb0.f0;
        d = ra.g(":");
        e = ra.g(Header.RESPONSE_STATUS_UTF8);
        f = ra.g(Header.TARGET_METHOD_UTF8);
        g = ra.g(Header.TARGET_PATH_UTF8);
        h = ra.g(Header.TARGET_SCHEME_UTF8);
        i = ra.g(Header.TARGET_AUTHORITY_UTF8);
    }

    public kz2(kb0 kb0Var, kb0 kb0Var2) {
        kb0Var.getClass();
        kb0Var2.getClass();
        this.a = kb0Var;
        this.b = kb0Var2;
        this.c = kb0Var2.e() + kb0Var.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz2)) {
            return false;
        }
        kz2 kz2Var = (kz2) obj;
        return dh3.f(this.a, kz2Var.a) && dh3.f(this.b, kz2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.t() + ": " + this.b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kz2(String str, String str2) {
        this(ra.g(str), ra.g(str2));
        str.getClass();
        str2.getClass();
        kb0 kb0Var = kb0.f0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kz2(kb0 kb0Var, String str) {
        this(kb0Var, ra.g(str));
        kb0Var.getClass();
        str.getClass();
        kb0 kb0Var2 = kb0.f0;
    }
}
