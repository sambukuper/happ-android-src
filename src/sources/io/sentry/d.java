package io.sentry;

import android.os.Handler;
import android.os.Looper;
import defpackage.dh3;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a1, v1, d6, io.sentry.cache.tape.f, io.sentry.featureflags.b {
    public final /* synthetic */ byte X;
    public Object Y;

    public d(byte b) {
        this.X = b;
        switch (b) {
            case 7:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                this.Y = new Handler(mainLooper);
                break;
            case 9:
                this.Y = new io.sentry.util.g(new c2((byte) 28));
                break;
            case 10:
                this.Y = new io.sentry.util.a();
                break;
            case 11:
                this.Y = new io.sentry.transport.p();
                break;
        }
    }

    public static Long h(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.endsWith("GB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
            }
            if (strTrim.endsWith("MB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * s6.MAX_EVENT_SIZE_BYTES);
            }
            if (strTrim.endsWith("KB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            }
            if (strTrim.endsWith("B")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double i(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.equals("0")) {
                return Double.valueOf(0.0d);
            }
            if (strTrim.endsWith("ms")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
            }
            if (strTrim.endsWith("ns")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
            }
            if (strTrim.endsWith("us")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
            }
            if (strTrim.endsWith("s")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // io.sentry.v1
    public boolean a() {
        if (io.sentry.internal.a.c == null) {
            io.sentry.util.a aVar = io.sentry.internal.a.d;
            aVar.g();
            try {
                if (io.sentry.internal.a.c == null) {
                    io.sentry.internal.a.c = new io.sentry.internal.a();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        io.sentry.internal.a aVar2 = io.sentry.internal.a.c;
        if (!aVar2.a) {
            try {
                io.sentry.util.a aVar3 = aVar2.b;
                aVar3.g();
                try {
                    if (!aVar2.a) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                URLConnection uRLConnectionOpenConnection = resources.nextElement().openConnection();
                                uRLConnectionOpenConnection.setUseCaches(false);
                                InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                                try {
                                    Attributes mainAttributes = new Manifest(inputStream).getMainAttributes();
                                    if (mainAttributes != null) {
                                        String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                        String value2 = mainAttributes.getValue("Implementation-Version");
                                        String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                        String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                        if (value != null && value2 != null) {
                                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                            if (value5 != null) {
                                                q5.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                q5.d().a("OpenTelemetry");
                                            }
                                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                            if (value6 != null) {
                                                q5.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                q5.d().a("OpenTelemetry-Agent");
                                            }
                                            if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                q5.d().a("OpenTelemetry-Agentless");
                                            }
                                            if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                q5.d().a("OpenTelemetry-Agentless-Spring");
                                            }
                                        }
                                        if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                            q5.d().b(value4, value2);
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (Throwable th3) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    aVar3.close();
                } catch (Throwable th5) {
                    try {
                        aVar3.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException unused2) {
            } catch (Throwable th7) {
                aVar2.a = true;
                throw th7;
            }
            aVar2.a = true;
        }
        return q5.d().c(((SentryAndroidOptions) this.Y).getFatalLogger());
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.j b() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.Y;
        aVar.g();
        aVar.close();
        return null;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.w c(io.sentry.protocol.k kVar, n0 n0Var) {
        o4 o4Var = (o4) this.Y;
        g1 g1Var = o4Var.f;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.Y;
        if (!o4Var.isEnabled()) {
            o4Var.i().getLogger().h(s5.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (kVar.X.isEmpty()) {
            o4Var.i().getLogger().h(s5.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return wVar;
        }
        try {
            return g1Var.v().b(kVar, n0Var, g1Var);
        } catch (Throwable th) {
            o4Var.i().getLogger().e(s5.ERROR, "Error while capturing feedback: " + kVar.X, th);
            return wVar;
        }
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.Y;
        aVar.g();
        aVar.close();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m9clone() {
        switch (this.X) {
            case 10:
                return new d((byte) 10);
            default:
                return super.clone();
        }
    }

    @Override // io.sentry.cache.tape.f
    public Object d(byte[] bArr) {
        s6 s6Var = ((io.sentry.cache.g) this.Y).a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.f));
            try {
                g gVar = (g) s6Var.getSerializer().b(bufferedReader, g.class);
                bufferedReader.close();
                return gVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            s6Var.getLogger().d(s5.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    @Override // io.sentry.cache.tape.f
    public void e(Comparable comparable, OutputStream outputStream) throws IOException {
        g gVar = (g) comparable;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, io.sentry.cache.g.f));
        try {
            ((io.sentry.cache.g) this.Y).a.getSerializer().a(gVar, bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public g f(g gVar, n0 n0Var) {
        gVar.getClass();
        d6 d6Var = (d6) this.Y;
        if (d6Var != null) {
            gVar = ((d) d6Var).f(gVar, n0Var);
        }
        if (gVar == null || !(dh3.f(gVar.g0, "http") || dh3.f(gVar.i0, "http"))) {
            return gVar;
        }
        n0Var.b("sentry:replayNetworkDetails");
        return gVar;
    }

    public io.sentry.protocol.c g() {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) this.Y;
        if (cVar != null) {
            return cVar;
        }
        io.sentry.protocol.c cVar2 = new io.sentry.protocol.c();
        this.Y = cVar2;
        return cVar2;
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone */
    public io.sentry.featureflags.b m12clone() {
        return new d((byte) 10);
    }

    public d(String str) {
        this.X = (byte) 12;
        this.Y = new File(str);
    }

    public d(io.sentry.android.replay.d dVar, d6 d6Var) {
        this.X = (byte) 4;
        this.Y = d6Var;
    }

    public /* synthetic */ d(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
