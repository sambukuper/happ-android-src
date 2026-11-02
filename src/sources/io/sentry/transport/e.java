package io.sentry.transport;

import defpackage.pc6;
import defpackage.s91;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.p6;
import io.sentry.s5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final io.sentry.internal.debugmeta.c b;
    public final SentryAndroidOptions c;
    public final s91 d;

    public e(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar, s91 s91Var) {
        Proxy proxy;
        this.b = cVar;
        this.c = sentryAndroidOptions;
        this.d = s91Var;
        p6 proxy2 = sentryAndroidOptions.getProxy();
        if (proxy2 != null) {
            String str = proxy2.b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.a, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().d(s5.ERROR, e2, pc6.p("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.a = proxy;
        if (proxy == null || sentryAndroidOptions.getProxy() == null) {
            return;
        }
        String str2 = sentryAndroidOptions.getProxy().c;
        String str3 = sentryAndroidOptions.getProxy().d;
        String str4 = sentryAndroidOptions.getProxy().a;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new l(str2, str3, str4));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        s5 s5Var;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Envelope sent successfully.", new Object[0]);
                return r.c;
            }
            if (responseCode == 413) {
                ILogger logger = sentryAndroidOptions.getLogger();
                s5Var = s5.ERROR;
                logger.h(s5Var, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
            } else {
                ILogger logger2 = sentryAndroidOptions.getLogger();
                s5Var = s5.ERROR;
                logger2.h(s5Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
            }
            if (sentryAndroidOptions.isDebug()) {
                sentryAndroidOptions.getLogger().h(s5Var, "%s", b(httpURLConnection));
            }
            return new q(responseCode);
        } catch (IOException e2) {
            sentryAndroidOptions.getLogger().d(s5.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return new q(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        sentryAndroidOptions.getSocketTagger().f();
        io.sentry.internal.debugmeta.c cVar2 = this.b;
        URL url = (URL) cVar2.Y;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) cVar2.Z).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(sentryAndroidOptions.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(sentryAndroidOptions.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = sentryAndroidOptions.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sentryAndroidOptions.getSerializer().e(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                c(httpURLConnection);
                sentryAndroidOptions.getSocketTagger().b();
            }
        }
        return c(httpURLConnection);
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        long j;
        String[] strArr;
        double d;
        long j2;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        s91 s91Var = this.d;
        io.sentry.time.c cVar = (io.sentry.time.c) s91Var.Y;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) s91Var.Z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        double d2 = 1000.0d;
        if (headerField2 == null) {
            if (i == 429) {
                io.sentry.p pVar = io.sentry.p.All;
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                    }
                } else {
                    j = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                }
                s91Var.g(pVar, io.sentry.time.a.a(cVar, j, timeUnit));
                return;
            }
            return;
        }
        int i2 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String[] strArrSplit2 = strArrSplit[i4].replace(" ", _UrlKt.FRAGMENT_ENCODE_SET).split(":", i2);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[i3];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d2);
                    } catch (NumberFormatException unused2) {
                        j2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                    }
                } else {
                    j2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                }
                io.sentry.time.a aVarA = io.sentry.time.a.a(cVar, j2, timeUnit);
                d = d2;
                if (strArrSplit2.length <= 1) {
                    strArr = strArrSplit;
                } else {
                    String str2 = strArrSplit2[1];
                    if (str2 == null || str2.isEmpty()) {
                        strArr = strArrSplit;
                        s91Var.g(io.sentry.p.All, aVarA);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i2);
                        int length2 = strArrSplit3.length;
                        int i5 = i3;
                        while (i5 < length2) {
                            String str3 = strArrSplit3[i5];
                            io.sentry.p pVarValueOf = io.sentry.p.Unknown;
                            try {
                                Charset charset = io.sentry.util.q.a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = io.sentry.util.q.b.split(str3, i2);
                                    StringBuilder sb = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb.append(io.sentry.util.q.a(str4));
                                    }
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    pVarValueOf = io.sentry.p.valueOf(string);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        sentryAndroidOptions.getLogger().h(s5.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        sentryAndroidOptions.getLogger().d(s5.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                strArr2 = strArrSplit;
                            }
                            if (!io.sentry.p.Unknown.equals(pVarValueOf)) {
                                s91Var.g(pVarValueOf, aVarA);
                            }
                            i5++;
                            strArrSplit = strArr2;
                            i2 = -1;
                        }
                        strArr = strArrSplit;
                    }
                }
            } else {
                strArr = strArrSplit;
                d = d2;
            }
            i4++;
            d2 = d;
            strArrSplit = strArr;
            i2 = -1;
            i3 = 0;
        }
    }
}
