package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final String a;
    public final Pattern b;

    public l0(String str) {
        Pattern patternCompile;
        this.a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            v4.b().i().getLogger().h(s5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((l0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
