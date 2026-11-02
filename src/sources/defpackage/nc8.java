package defpackage;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nc8 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public nc8(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            bt.q(pc6.p("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = strSubstring;
        this.b = str;
        this.c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nc8)) {
            return false;
        }
        nc8 nc8Var = (nc8) obj;
        return this.a.equals(nc8Var.a) && this.b.equals(nc8Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
