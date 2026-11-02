package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c03 {
    public static final c03 a;

    static {
        c03 c03Var = new c03();
        if (!gv3.J(_UrlKt.FRAGMENT_ENCODE_SET)) {
            gv3.J(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        a = c03Var;
    }

    public final void a(StringBuilder sb, String str) {
        oi0.y(sb, str, "prefix = \"", _UrlKt.FRAGMENT_ENCODE_SET, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append(_UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
