package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sj2 {
    public static final sj2 d = new sj2(_UrlKt.FRAGMENT_ENCODE_SET, false, _UrlKt.FRAGMENT_ENCODE_SET);
    public static final sj2 e = new sj2("\n", true, "  ");
    public final String a;
    public final String b;
    public final boolean c;

    public sj2(String str, boolean z, String str2) {
        if (!str.matches("[\r\n]*")) {
            bt.q("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            bt.q("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
