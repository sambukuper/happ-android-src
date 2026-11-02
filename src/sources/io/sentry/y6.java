package io.sentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 {
    public static final Pattern d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public final io.sentry.protocol.w a;
    public final h7 b;
    public final Boolean c;

    public y6(String str) throws io.sentry.exception.b {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw new io.sentry.exception.b("sentry-trace header does not conform to expected format: ".concat(str), null);
        }
        this.a = new io.sentry.protocol.w(matcher.group(1));
        this.b = new h7(matcher.group(2));
        String strGroup = matcher.group(3);
        this.c = strGroup != null ? Boolean.valueOf("1".equals(strGroup.substring(1))) : null;
    }

    public final String a() {
        h7 h7Var = this.b;
        Boolean bool = this.c;
        io.sentry.protocol.w wVar = this.a;
        if (bool == null) {
            return wVar + "-" + h7Var;
        }
        return wVar + "-" + h7Var + "-" + (bool.booleanValue() ? "1" : "0");
    }

    public y6(io.sentry.protocol.w wVar, h7 h7Var, Boolean bool) {
        this.a = wVar;
        this.b = h7Var;
        this.c = bool;
    }
}
