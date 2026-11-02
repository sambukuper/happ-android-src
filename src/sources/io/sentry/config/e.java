package io.sentry.config;

import defpackage.oi0;
import io.sentry.util.q;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        io.sentry.util.b.s(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final Map d() {
        String strP = oi0.p(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strP)) {
                    map.put(str.substring(strP.length()), q.c((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return q.c(this.b.getProperty(this.a + str));
    }

    public e(Properties properties) {
        this(_UrlKt.FRAGMENT_ENCODE_SET, properties);
    }
}
