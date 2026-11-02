package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u33 {
    public final String a;
    public final String b;

    public u33(String str, String str2) {
        this.a = str;
        this.b = str2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u33)) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return this.a.equals(u33Var.a) && this.b.equals(u33Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
