package okhttp3.internal.http2;

import defpackage.dh3;
import defpackage.kb0;
import defpackage.ra;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", _UrlKt.FRAGMENT_ENCODE_SET, "Lkb0;", "name", "value", "<init>", "(Lkb0;Lkb0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;)V", "(Lkb0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lkb0;", "component2", "copy", "(Lkb0;Lkb0;)Lokhttp3/internal/http2/Header;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Lkb0;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Header {
    public static final kb0 PSEUDO_PREFIX;
    public static final kb0 RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final kb0 TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final kb0 TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final kb0 TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final kb0 TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final kb0 name;
    public final kb0 value;

    static {
        kb0 kb0Var = kb0.f0;
        PSEUDO_PREFIX = ra.g(":");
        RESPONSE_STATUS = ra.g(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = ra.g(TARGET_METHOD_UTF8);
        TARGET_PATH = ra.g(TARGET_PATH_UTF8);
        TARGET_SCHEME = ra.g(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = ra.g(TARGET_AUTHORITY_UTF8);
    }

    public Header(kb0 kb0Var, kb0 kb0Var2) {
        kb0Var.getClass();
        kb0Var2.getClass();
        this.name = kb0Var;
        this.value = kb0Var2;
        this.hpackSize = kb0Var2.e() + kb0Var.e() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, kb0 kb0Var, kb0 kb0Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            kb0Var = header.name;
        }
        if ((i & 2) != 0) {
            kb0Var2 = header.value;
        }
        return header.copy(kb0Var, kb0Var2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final kb0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final kb0 getValue() {
        return this.value;
    }

    public final Header copy(kb0 name, kb0 value) {
        name.getClass();
        value.getClass();
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return dh3.f(this.name, header.name) && dh3.f(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.t() + ": " + this.value.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(ra.g(str), ra.g(str2));
        str.getClass();
        str2.getClass();
        kb0 kb0Var = kb0.f0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(kb0 kb0Var, String str) {
        this(kb0Var, ra.g(str));
        kb0Var.getClass();
        str.getClass();
        kb0 kb0Var2 = kb0.f0;
    }
}
