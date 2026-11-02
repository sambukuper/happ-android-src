package io.sentry.internal.debugmeta;

import android.content.Context;
import defpackage.b61;
import defpackage.b8;
import defpackage.bt;
import defpackage.u52;
import io.sentry.ILogger;
import io.sentry.c2;
import io.sentry.c5;
import io.sentry.clientreport.d;
import io.sentry.clientreport.e;
import io.sentry.clientreport.f;
import io.sentry.h5;
import io.sentry.i5;
import io.sentry.n7;
import io.sentry.p;
import io.sentry.protocol.f0;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.r3;
import io.sentry.r5;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t0;
import io.sentry.util.g;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a, ILogger, r3, t0, f {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;

    public c(String str, HashMap map) {
        this.X = (byte) 5;
        io.sentry.util.b.s(str, "url is required");
        try {
            this.Y = URI.create(str).toURL();
            this.Z = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public static p l(r5 r5Var) {
        if (r5.Event.equals(r5Var)) {
            return p.Error;
        }
        if (r5.Session.equals(r5Var)) {
            return p.Session;
        }
        if (r5.Transaction.equals(r5Var)) {
            return p.Transaction;
        }
        if (r5.UserFeedback.equals(r5Var)) {
            return p.UserReport;
        }
        if (r5.Feedback.equals(r5Var)) {
            return p.Feedback;
        }
        if (r5.Profile.equals(r5Var)) {
            return p.Profile;
        }
        if (r5.ProfileChunk.equals(r5Var)) {
            return p.ProfileChunkUi;
        }
        if (r5.Attachment.equals(r5Var)) {
            return p.Attachment;
        }
        if (r5.CheckIn.equals(r5Var)) {
            return p.Monitor;
        }
        if (r5.ReplayVideo.equals(r5Var)) {
            return p.Replay;
        }
        if (r5.Log.equals(r5Var)) {
            return p.LogItem;
        }
        if (r5.Span.equals(r5Var)) {
            return p.Span;
        }
        return r5.TraceMetric.equals(r5Var) ? p.TraceMetric : p.Default;
    }

    @Override // io.sentry.clientreport.f
    public void a(d dVar, p pVar) {
        f(dVar, pVar, 1L);
    }

    @Override // io.sentry.clientreport.f
    public void b(d dVar, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) cVar.Z).iterator();
            while (it.hasNext()) {
                g(dVar, (h5) it.next());
            }
        } catch (Throwable th) {
            ((s6) this.Z).getLogger().d(s5.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List c() {
        switch (this.X) {
            case 0:
                ILogger iLogger = (ILogger) this.Y;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) this.Z).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                iLogger.h(s5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            iLogger.d(s5.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                    }
                } catch (IOException e2) {
                    iLogger.d(s5.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                iLogger.h(s5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                ILogger iLogger2 = (ILogger) this.Y;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.Z).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    iLogger2.h(s5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e3) {
                    iLogger2.e(s5.ERROR, "Error getting Proguard UUIDs.", e3);
                    return null;
                } catch (RuntimeException e4) {
                    iLogger2.d(s5.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    @Override // io.sentry.ILogger
    public void d(s5 s5Var, Throwable th, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.Y;
        if (i(s5Var)) {
            iLogger.d(s5Var, th, str, objArr);
        }
    }

    @Override // io.sentry.ILogger
    public void e(s5 s5Var, String str, Throwable th) {
        ILogger iLogger = (ILogger) this.Y;
        if (i(s5Var)) {
            iLogger.e(s5Var, str, th);
        }
    }

    @Override // io.sentry.clientreport.f
    public void f(d dVar, p pVar, long j) {
        try {
            q(dVar.getReason(), pVar.getCategory(), Long.valueOf(j));
            n();
        } catch (Throwable th) {
            ((s6) this.Z).getLogger().d(s5.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void g(d dVar, h5 h5Var) {
        s6 s6Var = (s6) this.Z;
        if (h5Var == null) {
            return;
        }
        try {
            i5 i5Var = h5Var.a;
            r5 r5Var = i5Var.g0;
            if (r5.ClientReport.equals(r5Var)) {
                try {
                    r(h5Var.f(s6Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    s6Var.getLogger().h(s5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            p pVarL = l(r5Var);
            if (pVarL.equals(p.Transaction)) {
                f0 f0VarH = h5Var.h(s6Var.getSerializer());
                if (f0VarH != null) {
                    ArrayList arrayList = f0VarH.u0;
                    q(dVar.getReason(), p.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    n();
                }
                q(dVar.getReason(), pVarL.getCategory(), 1L);
                n();
                return;
            }
            if (pVarL.equals(p.LogItem)) {
                Integer num = i5Var.Y;
                q(dVar.getReason(), pVarL.getCategory(), Long.valueOf(num != null ? num.intValue() : 1L));
                q(dVar.getReason(), p.LogByte.getCategory(), Long.valueOf(h5Var.g().length));
                n();
                return;
            }
            if (!pVarL.equals(p.TraceMetric)) {
                q(dVar.getReason(), pVarL.getCategory(), 1L);
                n();
            } else {
                Integer num2 = i5Var.Y;
                q(dVar.getReason(), pVarL.getCategory(), Long.valueOf(num2 != null ? num2.intValue() : 1L));
                q(dVar.getReason(), p.TraceMetricByte.getCategory(), Long.valueOf(h5Var.g().length));
                n();
            }
        } catch (Throwable th) {
            s6Var.getLogger().d(s5.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.ILogger
    public void h(s5 s5Var, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.Y;
        if (i(s5Var)) {
            iLogger.h(s5Var, str, objArr);
        }
    }

    @Override // io.sentry.ILogger
    public boolean i(s5 s5Var) {
        s6 s6Var = (s6) this.Z;
        return s5Var != null && s6Var.isDebug() && s5Var.ordinal() >= s6Var.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.clientreport.f
    public c j(c cVar) {
        s6 s6Var = (s6) this.Z;
        Date date = new Date();
        io.sentry.d dVar = (io.sentry.d) this.Y;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((g) dVar.Y).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new e(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(date, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            s6Var.getLogger().h(s5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) cVar.Z).iterator();
            while (it.hasNext()) {
                arrayList2.add((h5) it.next());
            }
            arrayList2.add(h5.b(s6Var.getSerializer(), bVar));
            return new c((c5) cVar.Y, arrayList2);
        } catch (Throwable th) {
            s6Var.getLogger().d(s5.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    public c k() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        cVar.D();
        cVar.g();
        int i = cVar.Z;
        int[] iArrCopyOf = cVar.Y;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar.Y = iArrCopyOf;
        }
        int i2 = cVar.Z;
        cVar.Z = i2 + 1;
        iArrCopyOf[i2] = 3;
        cVar.X.write(123);
        return this;
    }

    public c m() {
        ((io.sentry.vendor.gson.stream.c) this.Y).k(3, 5, '}');
        return this;
    }

    public void n() {
        ((s6) this.Z).getOnDiscard();
    }

    public byte[] o() {
        byte[] bArr = (byte[]) this.Y;
        if (bArr == null) {
            bArr = (byte[]) ((Callable) this.Z).call();
            this.Y = bArr;
        }
        return bArr != null ? bArr : new byte[0];
    }

    public c p(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        if (str == null) {
            b61.i("name == null");
            return null;
        }
        if (cVar.i0 != null) {
            c2.g();
            return null;
        }
        if (cVar.Z != 0) {
            cVar.i0 = str;
            return this;
        }
        bt.i("JsonWriter is closed.");
        return null;
    }

    public void q(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((g) ((io.sentry.d) this.Y).Y).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void r(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (e eVar : bVar.Y) {
            q(eVar.X, eVar.Y, eVar.Z);
        }
    }

    public void s(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        if (str == null || str.length() == 0) {
            cVar.f0 = null;
            cVar.g0 = ":";
        } else {
            cVar.f0 = str;
            cVar.g0 = ": ";
        }
    }

    public c t(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        cVar.D();
        if (!cVar.h0 && (Double.isNaN(d) || Double.isInfinite(d))) {
            c2.i("Numeric values must be finite, but was ", d);
            return null;
        }
        cVar.g();
        cVar.X.append((CharSequence) Double.toString(d));
        return this;
    }

    public c u(long j) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        cVar.D();
        cVar.g();
        cVar.X.write(Long.toString(j));
        return this;
    }

    public c v(ILogger iLogger, Object obj) throws IOException {
        ((b8) this.Z).n(this, iLogger, obj);
        return this;
    }

    public c w(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        if (bool == null) {
            cVar.p();
            return this;
        }
        cVar.D();
        cVar.g();
        cVar.X.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c x(Number number) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        if (number == null) {
            cVar.p();
            return this;
        }
        cVar.D();
        String string = number.toString();
        if (!cVar.h0 && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            u52.j(number, "Numeric values must be finite, but was ");
            return null;
        }
        cVar.g();
        cVar.X.append((CharSequence) string);
        return this;
    }

    public c y(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        if (str == null) {
            cVar.p();
            return this;
        }
        cVar.D();
        cVar.g();
        cVar.C(str);
        return this;
    }

    public c z(boolean z) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.Y;
        cVar.D();
        cVar.g();
        cVar.X.write(z ? "true" : "false");
        return this;
    }

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    public c(Writer writer, int i) {
        this.X = (byte) 4;
        this.Y = new io.sentry.vendor.gson.stream.c(writer);
        this.Z = new b8((byte) 14, i);
    }

    public /* synthetic */ c(byte b) {
        this.X = b;
    }

    public c(s6 s6Var) {
        this.X = (byte) 13;
        this.Z = s6Var;
        this.Y = new io.sentry.d((byte) 9);
    }

    public c(ILogger iLogger) {
        this.X = (byte) 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.Y = iLogger;
        this.Z = io.sentry.util.b.d(classLoader);
    }

    public c(Context context, ILogger iLogger) {
        this.X = (byte) 11;
        Context applicationContext = context.getApplicationContext();
        this.Z = applicationContext != null ? applicationContext : context;
        this.Y = iLogger;
    }

    public c(Method method, Method method2) {
        this.X = (byte) 12;
        this.Y = method;
        this.Z = method2;
    }

    public c(c5 c5Var, List list) {
        this.X = (byte) 8;
        this.Y = c5Var;
        io.sentry.util.b.s(list, "SentryEnvelope items are required.");
        this.Z = list;
    }

    public c(n7 n7Var, Double d) {
        this.X = (byte) 6;
        this.Y = n7Var;
        this.Z = d;
        Map map = Collections.EMPTY_MAP;
    }

    public c(w wVar, u uVar, h5 h5Var) {
        this.X = (byte) 8;
        this.Y = new c5(wVar, uVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(h5Var);
        this.Z = arrayList;
    }

    public c() {
        this.X = (byte) 10;
        this.Y = new io.sentry.util.a();
        this.Z = new io.sentry.util.a();
    }

    public c(Callable callable) {
        this.X = (byte) 9;
        this.Z = callable;
    }
}
