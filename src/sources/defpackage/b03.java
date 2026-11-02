package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b03 {
    public static final b03 c = new b03();
    public final boolean a = true;
    public final boolean b = true;

    public b03() {
        if (gv3.J("  ") || gv3.J(_UrlKt.FRAGMENT_ENCODE_SET) || gv3.J(_UrlKt.FRAGMENT_ENCODE_SET)) {
            return;
        }
        gv3.J(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append(_UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("\",");
        sb.append('\n');
        oi0.y(sb, str, "bytePrefix = \"", _UrlKt.FRAGMENT_ENCODE_SET, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append(_UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
