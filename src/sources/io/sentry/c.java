package io.sentry;

import defpackage.wh;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final wh i = new wh(4);
    public final ConcurrentHashMap a;
    public final io.sentry.util.a b;
    public Double c;
    public Double d;
    public final String e;
    public boolean f;
    public final boolean g;
    public final ILogger h;

    public c(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, ILogger iLogger) {
        this.b = new io.sentry.util.a();
        this.a = concurrentHashMap;
        this.c = d;
        this.d = d2;
        this.h = iLogger;
        this.e = str;
        this.f = true;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    public static c a(ILogger iLogger, String str, boolean z) {
        Double d;
        Double dValueOf;
        String strB;
        Double dValueOf2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        if (str != null) {
            try {
                boolean z3 = false;
                dValueOf2 = null;
                dValueOf = null;
                for (String str2 : str.split(",", -1)) {
                    try {
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i2, iIndexOf).trim();
                                String strDecode = URLDecoder.decode(strTrim, "UTF-8");
                                String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1).trim(), "UTF-8");
                                try {
                                    if ("sentry-sample_rate".equals(strDecode)) {
                                        if (strDecode2 != null) {
                                            try {
                                                double d2 = Double.parseDouble(strDecode2);
                                                if (io.sentry.util.b.n(Double.valueOf(d2), false)) {
                                                    dValueOf2 = Double.valueOf(d2);
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        i2 = 0;
                                    } else if (!"sentry-sample_rand".equals(strDecode)) {
                                        i2 = 0;
                                        concurrentHashMap.put(strDecode, strDecode2);
                                    } else if (strDecode2 != null) {
                                        try {
                                            double d3 = Double.parseDouble(strDecode2);
                                            i2 = 0;
                                            i2 = 0;
                                            i2 = 0;
                                            try {
                                                dValueOf = io.sentry.util.b.n(Double.valueOf(d3), false) ? Double.valueOf(d3) : null;
                                            } catch (NumberFormatException unused2) {
                                            }
                                        } catch (NumberFormatException unused3) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                        z3 = true;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    i2 = 0;
                                    iLogger.d(s5.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else if (z) {
                            arrayList.add(str2.trim());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = z3;
                        iLogger.d(s5.ERROR, th, "Unable to decode baggage header %s", str);
                        d = dValueOf2;
                        if (arrayList.isEmpty()) {
                            strB = null;
                        } else {
                            strB = io.sentry.util.q.b(arrayList);
                        }
                        return new c(concurrentHashMap, d, dValueOf, strB, z2, iLogger);
                    }
                }
                z2 = z3;
            } catch (Throwable th4) {
                th = th4;
                dValueOf2 = null;
                dValueOf = null;
            }
            d = dValueOf2;
        } else {
            d = null;
            dValueOf = null;
        }
        if (arrayList.isEmpty()) {
            strB = null;
        } else {
            strB = io.sentry.util.q.b(arrayList);
        }
        return new c(concurrentHashMap, d, dValueOf, strB, z2, iLogger);
    }

    public static String c(Double d) {
        if (io.sentry.util.b.n(d, false)) {
            return ((DecimalFormat) i.get()).format(d);
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.f) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void e(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, s6 s6Var, b4 b4Var, String str, io.sentry.protocol.h0 h0Var) {
        d("sentry-trace_id", wVar.a());
        d("sentry-public_key", s6Var.retrieveParsedDsn().b);
        d("sentry-release", s6Var.getRelease());
        d("sentry-environment", s6Var.getEnvironment());
        if (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) {
            str = null;
        }
        d("sentry-transaction", str);
        if (wVar2 != null && !io.sentry.protocol.w.Y.equals(wVar2)) {
            d("sentry-replay_id", wVar2.a());
        }
        d("sentry-org_id", s6Var.getEffectiveOrgId());
        Double d = b4Var == null ? null : (Double) b4Var.b;
        if (this.f) {
            this.c = d;
        }
        Boolean bool = b4Var == null ? null : (Boolean) b4Var.a;
        d("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = b4Var != null ? (Double) b4Var.c : null;
        if (this.f) {
            this.d = d2;
        }
    }

    public final l7 f() {
        String strB = b("sentry-trace_id");
        String strB2 = b("sentry-replay_id");
        String strB3 = b("sentry-public_key");
        if (strB == null || strB3 == null) {
            return null;
        }
        l7 l7Var = new l7(new io.sentry.protocol.w(strB), strB3, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-transaction"), c(this.c), b("sentry-sampled"), strB2 != null ? new io.sentry.protocol.w(strB2) : null, c(this.d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        io.sentry.util.a aVar = this.b;
        aVar.g();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", _UrlKt.FRAGMENT_ENCODE_SET), str2);
                }
            }
            aVar.close();
            l7Var.m0 = concurrentHashMap;
            return l7Var;
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public c(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, false, iLogger);
    }
}
