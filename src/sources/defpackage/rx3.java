package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx3 extends oc {
    public static final Pattern t = Pattern.compile("([a-zA-Z]{2}|[0-9]{3})");

    @Override // defpackage.oc
    public final boolean v(String str) {
        return t.matcher(str).matches();
    }
}
