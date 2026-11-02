package defpackage;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.ILogger;
import io.sentry.a;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.j0;
import io.sentry.android.core.t0;
import io.sentry.c2;
import io.sentry.c5;
import io.sentry.c7;
import io.sentry.clientreport.d;
import io.sentry.d5;
import io.sentry.d7;
import io.sentry.e5;
import io.sentry.f0;
import io.sentry.f4;
import io.sentry.f6;
import io.sentry.f7;
import io.sentry.g1;
import io.sentry.h5;
import io.sentry.i0;
import io.sentry.i5;
import io.sentry.internal.debugmeta.c;
import io.sentry.j5;
import io.sentry.j7;
import io.sentry.l0;
import io.sentry.l1;
import io.sentry.l7;
import io.sentry.n0;
import io.sentry.n7;
import io.sentry.o1;
import io.sentry.o3;
import io.sentry.p;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.r;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q1;
import io.sentry.q5;
import io.sentry.r5;
import io.sentry.s1;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.transport.g;
import io.sentry.u1;
import io.sentry.u2;
import io.sentry.u6;
import io.sentry.util.b;
import io.sentry.util.l;
import io.sentry.util.m;
import io.sentry.util.n;
import io.sentry.util.o;
import io.sentry.v5;
import io.sentry.w3;
import io.sentry.y4;
import io.sentry.z3;
import io.sentry.z5;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wg implements l1 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public wg(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions;
        this.a = true;
        u1 transportFactory = sentryAndroidOptions.getTransportFactory();
        if (transportFactory instanceof o3) {
            transportFactory = new u2();
            sentryAndroidOptions.setTransportFactory(transportFactory);
        }
        f0 f0VarRetrieveParsedDsn = sentryAndroidOptions.retrieveParsedDsn();
        String sentryClientName = sentryAndroidOptions.getSentryClientName();
        URI uri = f0VarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = f0VarRetrieveParsedDsn.b;
        String str2 = f0VarRetrieveParsedDsn.a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? _UrlKt.FRAGMENT_ENCODE_SET : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.f(sentryAndroidOptions, new c(string, map));
        this.d = sentryAndroidOptions.getLogs().b.a(sentryAndroidOptions, this);
        this.e = sentryAndroidOptions.getMetrics().b.c(sentryAndroidOptions, this);
    }

    public static void k(y4 y4Var, g1 g1Var, boolean z) {
        if (g1Var != null) {
            if (y4Var.f0 == null) {
                y4Var.f0 = g1Var.getRequest();
            }
            if (y4Var.k0 == null) {
                y4Var.k0 = g1Var.H();
            }
            if (y4Var.g0 == null) {
                y4Var.c(g1Var.w());
            } else {
                for (Map.Entry entry : g1Var.w().entrySet()) {
                    if (!y4Var.g0.containsKey(entry.getKey())) {
                        y4Var.g0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = y4Var.o0;
            if (list == null || list.isEmpty()) {
                if (!z) {
                    y4Var.o0 = new ArrayList(new ArrayList(g1Var.q()));
                }
            } else if (!z) {
                Queue queueQ = g1Var.q();
                List list2 = y4Var.o0;
                if (list2 != null && !queueQ.isEmpty()) {
                    list2.addAll(queueQ);
                    Collections.sort(list2);
                }
            }
            if (y4Var.q0 == null) {
                Map extras = g1Var.getExtras();
                y4Var.q0 = extras != null ? new HashMap(extras) : null;
            } else {
                for (Map.Entry entry2 : g1Var.getExtras().entrySet()) {
                    if (!y4Var.q0.containsKey(entry2.getKey())) {
                        y4Var.q0.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            e eVar = y4Var.Y;
            for (Map.Entry entry3 : new e(g1Var.A()).X.entrySet()) {
                if (!eVar.b(entry3.getKey())) {
                    eVar.l(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public static wg p(dh8 dh8Var, jx5 jx5Var, ex5 ex5Var, boolean z) {
        String str = jx5Var == null ? null : jx5Var.X;
        return new wg(dh8Var, str != null ? new r37(str) : null, ex5Var, null, z);
    }

    public static ArrayList q(n0 n0Var) {
        ArrayList arrayList = new ArrayList(n0Var.b);
        a aVar = n0Var.d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = n0Var.e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = n0Var.f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        a aVar4 = n0Var.g;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        return arrayList;
    }

    public void A(IOException iOException) {
        this.a = true;
        ((p42) this.c).b(iOException);
        p76 p76VarC = ((o42) this.d).c();
        m76 m76Var = (m76) this.b;
        synchronized (p76VarC) {
            try {
                if (!(iOException instanceof el7)) {
                    if (!(p76VarC.g != null) || (iOException instanceof y11)) {
                        p76VarC.j = true;
                        if (p76VarC.m == 0) {
                            p76.d(m76Var.X, p76VarC.b, iOException);
                            p76VarC.l++;
                        }
                    }
                } else if (((el7) iOException).X == 8) {
                    int i = p76VarC.n + 1;
                    p76VarC.n = i;
                    if (i > 1) {
                        p76VarC.j = true;
                        p76VarC.l++;
                    }
                } else if (((el7) iOException).X != 9 || !m76Var.o0) {
                    p76VarC.j = true;
                    p76VarC.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(int i, int i2) {
        if (i < 0.0f) {
            zc3.a("Index should be non-negative (" + i + ")");
        }
        ((oh5) this.b).m(i);
        j64 j64Var = (j64) this.e;
        if (i != j64Var.Y) {
            j64Var.Y = i;
            int i3 = (i / 30) * 30;
            j64Var.X.setValue(x97.a0(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((oh5) this.c).m(i2);
    }

    @Override // io.sentry.l1
    public void a(d7 d7Var, n0 n0Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        b.s(d7Var, "Session is required.");
        String str = d7Var.o0;
        if (str == null || str.isEmpty()) {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            o1 serializer = sentryAndroidOptions.getSerializer();
            u sdkVersion = sentryAndroidOptions.getSdkVersion();
            b.s(serializer, "Serializer is required.");
            g(new c((w) null, sdkVersion, h5.e(serializer, d7Var)), n0Var);
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.l1
    public w b(k kVar, n0 n0Var, g1 g1Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (n.b()) {
            return w.Y;
        }
        j5 j5Var = new j5();
        e eVar = j5Var.Y;
        eVar.l(kVar, "feedback");
        if (kVar.h0 == null) {
            kVar.h0 = g1Var.C();
        }
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing feedback: %s", j5Var.X);
        if (y(j5Var, n0Var)) {
            if (j5Var.k0 == null) {
                j5Var.k0 = g1Var.H();
            }
            if (j5Var.g0 == null) {
                j5Var.c(g1Var.w());
            } else {
                for (Map.Entry entry : g1Var.w().entrySet()) {
                    if (!j5Var.g0.containsKey(entry.getKey())) {
                        j5Var.g0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new e(g1Var.A()).X.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            q1 q1VarO = g1Var.o();
            if (eVar.j() == null) {
                if (q1VarO == null) {
                    eVar.x(n7.b(g1Var.s()));
                } else {
                    eVar.x(q1VarO.s());
                }
            }
            j5Var = u(j5Var, n0Var, g1Var.I());
            if (j5Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return w.Y;
            }
        }
        j5 j5VarU = u(j5Var, n0Var, sentryAndroidOptions.getEventProcessors());
        if (j5VarU != null) {
            f6 beforeSendFeedback = sentryAndroidOptions.getBeforeSendFeedback();
            if (beforeSendFeedback != null) {
                try {
                    m mVarA = n.a();
                    try {
                        j5VarU = ((kp5) beforeSendFeedback).b(j5VarU, n0Var);
                        if (mVarA != null) {
                            mVarA.close();
                        }
                    } catch (Throwable th) {
                        if (mVarA == null) {
                            throw th;
                        }
                        try {
                            mVarA.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "The BeforeSendFeedback callback threw an exception.", th3);
                    j5VarU = null;
                }
            }
            if (j5VarU == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                sentryAndroidOptions.getClientReportRecorder().a(d.BEFORE_SEND, p.Feedback);
            }
        }
        j5 j5Var2 = j5VarU;
        if (j5Var2 == null) {
            return w.Y;
        }
        w wVar = w.Y;
        w wVar2 = j5Var2.X;
        if (wVar2 == null) {
            wVar2 = wVar;
        }
        if (kVar.g0 == null) {
            w wVarG = g1Var.g();
            w wVarK = sentryAndroidOptions.getReplayController().k(Boolean.FALSE);
            if (!wVarK.equals(wVar)) {
                wVarG = wVarK;
            }
            if (!wVarG.equals(wVar)) {
                kVar.g0 = wVarG;
            }
        }
        try {
            c cVarL = l(j5Var2, q(n0Var), null, r(g1Var, n0Var, j5Var2, j5Var2.x0), null);
            n0Var.a();
            return cVarL != null ? x(cVarL, n0Var) : wVar2;
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing feedback %s failed.", wVar2);
            return w.Y;
        }
    }

    @Override // io.sentry.l1
    public w c(u6 u6Var, g1 g1Var, n0 n0Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (n.b()) {
            return w.Y;
        }
        if (y(u6Var, n0Var)) {
            r rVar = u6Var.f0;
            e eVar = u6Var.Y;
            if (rVar == null) {
                u6Var.f0 = g1Var.getRequest();
            }
            if (u6Var.k0 == null) {
                u6Var.k0 = g1Var.H();
            }
            if (u6Var.g0 == null) {
                u6Var.c(g1Var.w());
            } else {
                for (Map.Entry entry : g1Var.w().entrySet()) {
                    if (!u6Var.g0.containsKey(entry.getKey())) {
                        u6Var.g0.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new e(g1Var.A()).X.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            q1 q1VarO = g1Var.o();
            if (eVar.j() == null) {
                if (q1VarO == null) {
                    eVar.x(n7.b(g1Var.s()));
                } else {
                    eVar.x(q1VarO.s());
                }
            }
        }
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing session replay: %s", u6Var.X);
        w wVar = w.Y;
        w wVar2 = u6Var.X;
        if (wVar2 != null) {
            wVar = wVar2;
        }
        for (i0 i0Var : sentryAndroidOptions.getEventProcessors()) {
            try {
                u6Var = i0Var.a(u6Var, n0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th, "An exception occurred while processing replay event by processor: %s", i0Var.getClass().getName());
            }
            if (u6Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Replay event was dropped by a processor: %s", i0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Replay);
                break;
            }
        }
        if (u6Var != null) {
            sentryAndroidOptions.getBeforeSendReplay();
        }
        if (u6Var == null) {
            return w.Y;
        }
        try {
            c cVarO = o(u6Var, n0Var.h, r(g1Var, n0Var, u6Var, null), io.sentry.hints.b.class.isInstance(n0Var.b("sentry:typeCheckHint")));
            n0Var.a();
            ((g) this.c).v0(cVarO, n0Var);
            return wVar;
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing event %s failed.", wVar);
            return w.Y;
        }
    }

    @Override // io.sentry.l1
    public void close(boolean z) {
        long shutdownTimeoutMillis;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        sentryAndroidOptions.getLogger().h(s5.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = sentryAndroidOptions.getShutdownTimeoutMillis();
            } catch (IOException e) {
                sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        f(shutdownTimeoutMillis);
        ((io.sentry.logger.b) this.d).a(z);
        ((io.sentry.logger.b) this.e).a(z);
        ((g) this.c).close(z);
        for (i0 i0Var : sentryAndroidOptions.getEventProcessors()) {
            if (i0Var instanceof Closeable) {
                try {
                    ((Closeable) i0Var).close();
                } catch (IOException e2) {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to close the event processor {}.", i0Var, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // io.sentry.l1
    public s91 d() {
        return ((g) this.c).d();
    }

    @Override // io.sentry.l1
    public boolean e() {
        return ((g) this.c).e();
    }

    @Override // io.sentry.l1
    public void f(long j) {
        ((io.sentry.logger.b) this.d).getClass();
        ((io.sentry.logger.b) this.e).getClass();
        ((g) this.c).f(j);
    }

    @Override // io.sentry.l1
    public w g(c cVar, n0 n0Var) {
        try {
            n0Var.a();
            return x(cVar, n0Var);
        } catch (IOException e) {
            ((SentryAndroidOptions) this.b).getLogger().e(s5.ERROR, "Failed to capture envelope.", e);
            return w.Y;
        }
    }

    @Override // io.sentry.l1
    public w h(w3 w3Var) {
        b.s(w3Var, "profileChunk is required.");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing profile chunk: %s", w3Var.Z);
        w wVar = w3Var.Z;
        f fVarA = f.a(w3Var.X, sentryAndroidOptions);
        if (fVarA != null) {
            w3Var.X = fVarA;
        }
        try {
            return x(new c(new c5(wVar, sentryAndroidOptions.getSdkVersion(), null), Collections.singletonList("application/x-perfetto-trace".equals(w3Var.m0) ? h5.c(w3Var, sentryAndroidOptions.getSerializer()) : h5.d(w3Var, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getProfilerConverter()))), null);
        } catch (io.sentry.exception.c e) {
            e = e;
            sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return w.Y;
        } catch (IOException e2) {
            e = e2;
            sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return w.Y;
        }
    }

    @Override // io.sentry.l1
    public w i(io.sentry.protocol.f0 f0Var, l7 l7Var, g1 g1Var, n0 n0Var, z3 z3Var) {
        List listY;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (n.b()) {
            return w.Y;
        }
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (y(f0Var, n0Var) && (listY = g1Var.y()) != null) {
            n0Var.b.addAll(listY);
        }
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Capturing transaction: %s", f0Var.X);
        List<l0> ignoredTransactions = sentryAndroidOptions.getIgnoredTransactions();
        String str = f0Var.r0;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<l0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().a.equalsIgnoreCase(str)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.r0);
                    io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                    d dVar = d.EVENT_PROCESSOR;
                    clientReportRecorder.a(dVar, p.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().f(dVar, p.Span, f0Var.u0.size() + 1);
                    return w.Y;
                }
            }
            Iterator<l0> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                Pattern pattern = it2.next().b;
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.r0);
                    io.sentry.clientreport.f clientReportRecorder2 = sentryAndroidOptions.getClientReportRecorder();
                    d dVar2 = d.EVENT_PROCESSOR;
                    clientReportRecorder2.a(dVar2, p.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().f(dVar2, p.Span, f0Var.u0.size() + 1);
                    return w.Y;
                }
            }
        }
        w wVar = w.Y;
        w wVarX = f0Var.X;
        if (wVarX == null) {
            wVarX = wVar;
        }
        if (y(f0Var, n0Var)) {
            k(f0Var, g1Var, io.sentry.hints.d.class.isInstance(n0Var.b("sentry:typeCheckHint")));
            f0Var = v(f0Var, n0Var, g1Var.I());
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (f0Var != null) {
            f0Var = v(f0Var, n0Var, sentryAndroidOptions.getEventProcessors());
        }
        io.sentry.protocol.f0 f0Var2 = f0Var;
        if (f0Var2 == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return wVar;
        }
        ArrayList arrayList = f0Var2.u0;
        int size = arrayList.size();
        sentryAndroidOptions.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            sentryAndroidOptions.getClientReportRecorder().f(d.BEFORE_SEND, p.Span, i);
        }
        try {
            ArrayList arrayListQ = q(n0Var);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListQ.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).getClass();
            }
            c cVarL = l(f0Var2, arrayList2, null, l7Var, z3Var);
            n0Var.a();
            if (cVarL != null) {
                wVarX = x(cVarL, n0Var);
            }
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing transaction %s failed.", wVarX);
            wVar = w.Y;
            wVarX = wVar;
        }
        if (!wVarX.equals(wVar)) {
            f7 f7VarJ = f0Var2.Y.j();
            if (f7VarJ != null) {
                sentryAndroidOptions.getReplayController().C(f7VarJ.X);
            }
            String str2 = f0Var2.r0;
            if (str2 != null && !str2.isEmpty()) {
                sentryAndroidOptions.getReplayController().X(str2);
            }
        }
        return wVarX;
    }

    @Override // io.sentry.l1
    public boolean isEnabled() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x02ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [io.sentry.protocol.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [io.sentry.protocol.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v15, types: [io.sentry.protocol.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.l1
    public w j(j5 j5Var, g1 g1Var, n0 n0Var) {
        d7 d7VarT;
        boolean z;
        String str;
        ?? r13;
        s1 s1VarJ;
        w wVarX;
        s1 s1VarJ2;
        io.sentry.c cVar;
        w wVar;
        j jVarB;
        List listY;
        j5 j5VarT = j5Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (n.b()) {
            return w.Y;
        }
        n0 n0Var2 = n0Var == null ? new n0() : n0Var;
        if (y(j5VarT, n0Var2) && !io.sentry.hints.d.class.isInstance(n0Var2.b("sentry:typeCheckHint")) && g1Var != null && (listY = g1Var.y()) != null) {
            n0Var2.b.addAll(listY);
        }
        ILogger logger = sentryAndroidOptions.getLogger();
        s5 s5Var = s5.DEBUG;
        logger.h(s5Var, "Capturing event: %s", j5VarT.X);
        Throwable thA = j5VarT.a();
        if (thA != null && sentryAndroidOptions.getIgnoredExceptionsForType().contains(thA.getClass())) {
            sentryAndroidOptions.getLogger().h(s5Var, "Event was dropped as the exception %s is ignored", thA.getClass());
            sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Error);
            return w.Y;
        }
        List<l0> ignoredErrors = sentryAndroidOptions.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            io.sentry.protocol.p pVar = j5VarT.s0;
            if (pVar != null) {
                String str2 = pVar.Y;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = pVar.X;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thA2 = j5VarT.a();
            if (thA2 != null) {
                hashSet.add(thA2.toString());
            }
            Iterator<l0> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a)) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", j5VarT.s0);
                    sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Error);
                    return w.Y;
                }
            }
            for (l0 l0Var : ignoredErrors) {
                for (String str4 : hashSet) {
                    Pattern pattern = l0Var.b;
                    if (pattern == null ? false : pattern.matcher(str4).matches()) {
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", j5VarT.s0);
                        sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Error);
                        return w.Y;
                    }
                }
            }
        }
        if (y(j5VarT, n0Var2)) {
            if (g1Var != null) {
                k(j5VarT, g1Var, io.sentry.hints.d.class.isInstance(n0Var2.b("sentry:typeCheckHint")));
                String str5 = j5VarT.x0;
                e eVar = j5VarT.Y;
                if (str5 == null) {
                    j5VarT.x0 = g1Var.J();
                }
                if (j5VarT.y0 == null) {
                    j5VarT.i(g1Var.G());
                }
                if (g1Var.r() != null) {
                    j5VarT.w0 = g1Var.r();
                }
                q1 q1VarO = g1Var.o();
                if (eVar.j() == null) {
                    if (q1VarO == null) {
                        eVar.x(n7.b(g1Var.s()));
                    } else {
                        eVar.x(q1VarO.s());
                    }
                }
                if (eVar.g() == null && (jVarB = g1Var.b()) != null) {
                    eVar.r(jVarB);
                }
                j5VarT = t(j5VarT, n0Var2, g1Var.I());
            }
            if (j5VarT == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return w.Y;
            }
        }
        j5 j5VarT2 = t(j5VarT, n0Var2, sentryAndroidOptions.getEventProcessors());
        if (j5VarT2 != null) {
            f6 beforeSend = sentryAndroidOptions.getBeforeSend();
            if (beforeSend != null) {
                try {
                    m mVarA = n.a();
                    try {
                        j5VarT2 = ((kp5) beforeSend).b(j5VarT2, n0Var2);
                        if (mVarA != null) {
                            mVarA.close();
                        }
                    } catch (Throwable th) {
                        if (mVarA == null) {
                            throw th;
                        }
                        try {
                            mVarA.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th3);
                    j5VarT2 = null;
                }
            }
            if (j5VarT2 == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                sentryAndroidOptions.getClientReportRecorder().a(d.BEFORE_SEND, p.Error);
            }
        }
        j5 j5Var2 = j5VarT2;
        if (j5Var2 != null) {
            try {
                if (sentryAndroidOptions.isEnableEventSizeLimiting() && !b.m(j5Var2, sentryAndroidOptions)) {
                    sentryAndroidOptions.getLogger().h(s5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", j5Var2.X, Long.valueOf(s6.MAX_EVENT_SIZE_BYTES));
                    sentryAndroidOptions.getOnOversizedEvent();
                    List list = j5Var2.o0;
                    if (list != null && !list.isEmpty()) {
                        j5Var2.o0 = null;
                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Removed breadcrumbs to reduce size of event %s", j5Var2.X);
                    }
                    if (!b.m(j5Var2, sentryAndroidOptions)) {
                        b.w(j5Var2, sentryAndroidOptions);
                        if (!b.m(j5Var2, sentryAndroidOptions)) {
                            sentryAndroidOptions.getLogger().h(s5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", j5Var2.X);
                        }
                    }
                }
            } catch (Throwable th4) {
                sentryAndroidOptions.getLogger().e(s5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th4);
            }
        }
        if (j5Var2 == null) {
            return w.Y;
        }
        d7 d7VarT2 = g1Var != null ? g1Var.t(new c2((byte) 7)) : null;
        if ((d7VarT2 != null && d7VarT2.i0 != c7.Ok) || !b.u(n0Var2)) {
            d7VarT = null;
        } else if (g1Var != null) {
            d7VarT = g1Var.t(new mf1((Object) this, (Object) j5Var2, (Object) n0Var2, (byte) 9));
        } else {
            sentryAndroidOptions.getLogger().h(s5.INFO, "Scope is null on client.captureEvent", new Object[0]);
            d7VarT = null;
        }
        l lVarA = sentryAndroidOptions.getSampleRate() == null ? null : o.a();
        if (sentryAndroidOptions.getSampleRate() != null && lVarA != null && sentryAndroidOptions.getSampleRate().doubleValue() < lVarA.c()) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event %s was dropped due to sampling decision.", j5Var2.X);
            sentryAndroidOptions.getClientReportRecorder().a(d.SAMPLE_RATE, p.Error);
            j5Var2 = null;
        }
        if (d7VarT != null) {
            if (d7VarT2 != null) {
                c7 c7Var = d7VarT.i0;
                c7 c7Var2 = c7.Crashed;
                z = (c7Var == c7Var2 && d7VarT2.i0 != c7Var2) || (d7VarT.Z.get() > 0 && d7VarT2.Z.get() <= 0);
            }
        }
        if (j5Var2 == null && !z) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return w.Y;
        }
        ?? r0 = w.Y;
        ?? r14 = (j5Var2 == null || (wVar = j5Var2.X) == null) ? r0 : wVar;
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(n0Var2.b("sentry:typeCheckHint"));
        boolean z2 = io.sentry.hints.d.class.isInstance(n0Var2.b("sentry:typeCheckHint")) && !t0.class.isInstance(n0Var2.b("sentry:typeCheckHint"));
        if (j5Var2 != null && !zIsInstance && !z2 && (j5Var2.g() || j5Var2.f() != null)) {
            sentryAndroidOptions.getSessionReplay().getClass();
            ?? G = g1Var != null ? g1Var.g() : r0;
            ?? K = sentryAndroidOptions.getReplayController().k(Boolean.valueOf(j5Var2.f() != null));
            ?? r3 = G;
            if (!K.equals(r0)) {
                r3 = K;
            }
            if (g1Var != null && !r3.equals(r0) && (s1VarJ2 = g1Var.j()) != null && (cVar = s1VarJ2.s().o0) != null && !r0.equals(r3)) {
                cVar.a.put("sentry-replay_id", r3.a());
            }
        }
        if (j5Var2 != null) {
            try {
                str = j5Var2.x0;
            } catch (io.sentry.exception.c e) {
                e = e;
                sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing event %s failed.", r14);
                n0Var2.d(Boolean.TRUE, "sentry:captureFailed");
                r13 = w.Y;
            } catch (IOException e2) {
                e = e2;
                sentryAndroidOptions.getLogger().d(s5.WARNING, e, "Capturing event %s failed.", r14);
                n0Var2.d(Boolean.TRUE, "sentry:captureFailed");
                r13 = w.Y;
            }
        } else {
            str = null;
        }
        c cVarL = l(j5Var2, j5Var2 != null ? q(n0Var2) : null, d7VarT, r(g1Var, n0Var2, j5Var2, str), null);
        n0Var2.a();
        r13 = r14;
        if (cVarL != null) {
            wVarX = x(cVarL, n0Var2);
        }
        if (g1Var != null && (s1VarJ = g1Var.j()) != null && io.sentry.hints.l.class.isInstance(n0Var2.b("sentry:typeCheckHint"))) {
            Object objB = n0Var2.b("sentry:typeCheckHint");
            if (objB instanceof io.sentry.hints.c) {
                r13 = wVarX;
                ((io.sentry.hints.c) objB).g(s1VarJ.p());
                s1VarJ.f(j7.ABORTED, false, n0Var2);
            } else {
                r13 = wVarX;
                s1VarJ.f(j7.ABORTED, false, null);
            }
        }
        r13 = wVarX;
        r13 = wVarX;
        r13 = wVarX;
        return r13;
    }

    public c l(y4 y4Var, ArrayList arrayList, d7 d7Var, l7 l7Var, z3 z3Var) {
        w wVar;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        ArrayList arrayList2 = new ArrayList();
        byte b = 4;
        if (y4Var != null) {
            o1 serializer = sentryAndroidOptions.getSerializer();
            Charset charset = h5.d;
            b.s(serializer, "ISerializer is required.");
            c cVar = new c(new i82(serializer, y4Var, b));
            arrayList2.add(new h5(new i5(r5.resolve(y4Var), new d5(cVar, (byte) 9), "application/json", null, null), new d5(cVar, (byte) 10)));
            wVar = y4Var.X;
        } else {
            wVar = null;
        }
        if (d7Var != null) {
            arrayList2.add(h5.e(sentryAndroidOptions.getSerializer(), d7Var));
        }
        if (z3Var != null) {
            long maxTraceFileSize = sentryAndroidOptions.getMaxTraceFileSize();
            o1 serializer2 = sentryAndroidOptions.getSerializer();
            Charset charset2 = h5.d;
            File file = z3Var.X;
            c cVar2 = new c(new e5(file, maxTraceFileSize, z3Var, serializer2));
            arrayList2.add(new h5(new i5(r5.Profile, new d5(cVar2, (byte) 7), "application-json", file.getName(), null), new d5(cVar2, (byte) 8)));
            if (wVar == null) {
                wVar = new w(z3Var.y0);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                o1 serializer3 = sentryAndroidOptions.getSerializer();
                ILogger logger = sentryAndroidOptions.getLogger();
                long maxAttachmentSize = sentryAndroidOptions.getMaxAttachmentSize();
                Charset charset3 = h5.d;
                c cVar3 = new c(new e5(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new h5(new i5(r5.Attachment, new d5(cVar3, b), aVar.e, aVar.d, aVar.f), new d5(cVar3, (byte) 5)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new c(new c5(wVar, sentryAndroidOptions.getSdkVersion(), l7Var), arrayList2);
    }

    public c m(v5 v5Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        o1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = h5.d;
        b.s(serializer, "ISerializer is required.");
        byte b = 3;
        c cVar = new c(new i82(serializer, v5Var, b));
        arrayList.add(new h5(new i5(r5.Log, new d5(cVar, (byte) 2), "application/vnd.sentry.items.log+json", null, null, null, Integer.valueOf(((List) v5Var.Y).size())), new d5(cVar, b)));
        return new c(new c5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public c n(z5 z5Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        o1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = h5.d;
        b.s(serializer, "ISerializer is required.");
        c cVar = new c(new i82(serializer, z5Var, (byte) 1));
        arrayList.add(new h5(new i5(r5.TraceMetric, new d5(cVar, (byte) 6), "application/vnd.sentry.items.trace-metric+json", null, null, null, Integer.valueOf(z5Var.X.size())), new d5(cVar, (byte) 14)));
        return new c(new c5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public c o(final u6 u6Var, final f4 f4Var, l7 l7Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        final o1 serializer = sentryAndroidOptions.getSerializer();
        final ILogger logger = sentryAndroidOptions.getLogger();
        Charset charset = h5.d;
        final File file = u6Var.r0;
        c cVar = new c(new Callable() { // from class: io.sentry.f5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o1 o1Var = serializer;
                u6 u6Var2 = u6Var;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, h5.d), 512);
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            o1Var.a(u6Var2, bufferedWriter);
                            linkedHashMap.put(r5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            f4 f4Var2 = f4Var;
                            if (f4Var2 != null) {
                                o1Var.a(f4Var2, bufferedWriter);
                                linkedHashMap.put(r5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrQ = io.sentry.util.b.q(10485760L, file2.getPath());
                                if (bArrQ.length > 0) {
                                    linkedHashMap.put(r5.ReplayVideo.getItemType(), bArrQ);
                                }
                            }
                            byte[] bArrI = h5.i(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    io.sentry.util.b.g(file2.getParentFile());
                                    return bArrI;
                                }
                                file2.delete();
                            }
                            return bArrI;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        iLogger.e(s5.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.util.b.g(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new h5(new i5(r5.ReplayVideo, new d5(cVar, (byte) 13), null, null, null), new d5(cVar, (byte) 15)));
        return new c(new c5(u6Var.X, sentryAndroidOptions.getSessionReplay().l, l7Var), arrayList);
    }

    public l7 r(g1 g1Var, n0 n0Var, y4 y4Var, String str) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (io.sentry.hints.b.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
            if (y4Var != null) {
                io.sentry.c cVar = new io.sentry.c(sentryAndroidOptions.getLogger());
                e eVar = y4Var.Y;
                f7 f7VarJ = eVar.j();
                cVar.d("sentry-trace_id", f7VarJ != null ? f7VarJ.X.a() : null);
                cVar.d("sentry-public_key", sentryAndroidOptions.retrieveParsedDsn().b);
                cVar.d("sentry-release", y4Var.h0);
                cVar.d("sentry-environment", y4Var.i0);
                cVar.d("sentry-org_id", sentryAndroidOptions.getEffectiveOrgId());
                cVar.d("sentry-transaction", str);
                if (cVar.f) {
                    cVar.c = null;
                }
                cVar.d("sentry-sampled", null);
                if (cVar.f) {
                    cVar.d = null;
                }
                Object objD = eVar.d("replay_id");
                if (objD != null && !objD.toString().equals(w.Y.a())) {
                    cVar.d("sentry-replay_id", objD.toString());
                    eVar.n("replay_id");
                }
                cVar.f = false;
                return cVar.f();
            }
        } else if (g1Var != null) {
            s1 s1VarJ = g1Var.j();
            return s1VarJ != null ? s1VarJ.b() : ((io.sentry.c) g1Var.B(new jn0(g1Var, sentryAndroidOptions, (byte) 26)).e).f();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int s(zz2 zz2Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        n03 n03Var = (n03) this.c;
        q03 q03Var = (q03) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            zz2 zz2VarI = ((y45) this.d).I(zz2Var, androidComposeView);
            qi4 qi4Var = (qi4) zz2VarI.Y;
            int iH = qi4Var.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                hq5 hq5Var = (hq5) qi4Var.i(i);
                i = (hq5Var.d || hq5Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = qi4Var.h();
            for (int i4 = 0; i4 < iH2; i4++) {
                hq5 hq5Var2 = (hq5) qi4Var.i(i4);
                if (objArr != false || vr3.k(hq5Var2)) {
                    ((LayoutNode) this.b).D(hq5Var2.c, q03Var, hq5Var2.i, true);
                    if (!q03Var.X.i()) {
                        n03Var.a(hq5Var2.a, q03Var, vr3.k(hq5Var2));
                        q03Var.clear();
                    }
                }
            }
            boolean zB = n03Var.b(zz2VarI, z);
            int iH3 = qi4Var.h();
            int i5 = 0;
            while (true) {
                if (i5 >= iH3) {
                    i2 = 0;
                    break;
                }
                hq5 hq5Var3 = (hq5) qi4Var.i(i5);
                if (!z85.b(vr3.S(hq5Var3, true), 0L) && hq5Var3.c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iH4 = qi4Var.h();
            for (int i6 = 0; i6 < iH4; i6++) {
                if (((hq5) qi4Var.i(i6)).c()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }

    public j5 t(j5 j5Var, n0 n0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            try {
                boolean z = i0Var instanceof j0;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(n0Var.b("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    ((j0) i0Var).b(j5Var, n0Var);
                } else if (!zIsInstance && !z) {
                    j5Var = i0Var.b(j5Var, n0Var);
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th, "An exception occurred while processing event by processor: %s", i0Var.getClass().getName());
            }
            if (j5Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Event was dropped by a processor: %s", i0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Error);
                break;
            }
        }
        return j5Var;
    }

    public j5 u(j5 j5Var, n0 n0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            try {
                j5Var = i0Var.b(j5Var, n0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th, "An exception occurred while processing feedback event by processor: %s", i0Var.getClass().getName());
            }
            if (j5Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Feedback event was dropped by a processor: %s", i0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(d.EVENT_PROCESSOR, p.Feedback);
                break;
            }
        }
        return j5Var;
    }

    public io.sentry.protocol.f0 v(io.sentry.protocol.f0 f0Var, n0 n0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            int size = f0Var.u0.size();
            try {
                f0Var = i0Var.c(f0Var, n0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th, "An exception occurred while processing transaction by processor: %s", i0Var.getClass().getName());
            }
            int size2 = f0Var == null ? 0 : f0Var.u0.size();
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Transaction was dropped by a processor: %s", i0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                d dVar = d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, p.Transaction);
                sentryAndroidOptions.getClientReportRecorder().f(dVar, p.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), i0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().f(d.EVENT_PROCESSOR, p.Span, i);
            }
        }
        return f0Var;
    }

    public yf6 w(boolean z) throws IOException {
        try {
            yf6 responseHeaders = ((o42) this.d).readResponseHeaders(z);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.m = this;
            return responseHeaders;
        } catch (IOException e) {
            A(e);
            throw e;
        }
    }

    public w x(c cVar, n0 n0Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        if (n.b()) {
            return w.Y;
        }
        sentryAndroidOptions.getBeforeEnvelopeCallback();
        q5.d().c(sentryAndroidOptions.getLogger());
        g gVar = (g) this.c;
        if (n0Var == null) {
            gVar.getClass();
            gVar.v0(cVar, new n0());
        } else {
            gVar.v0(cVar, n0Var);
        }
        w wVar = ((c5) cVar.Y).X;
        return wVar != null ? wVar : w.Y;
    }

    public boolean y(y4 y4Var, n0 n0Var) {
        if (b.u(n0Var)) {
            return true;
        }
        ((SentryAndroidOptions) this.b).getLogger().h(s5.DEBUG, "Event was cached so not applying scope: %s", y4Var.X);
        return false;
    }

    public synchronized void z() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((vg) this.c).b(context);
                context.unregisterComponentCallbacks((fe) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public wg(dh8 dh8Var, r37 r37Var, ex5 ex5Var, ar3 ar3Var, boolean z) {
        this.b = dh8Var;
        this.c = r37Var;
        this.d = ex5Var;
        this.e = ar3Var;
        this.a = z;
    }
}
