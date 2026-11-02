package io.sentry.transport;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c5;
import io.sentry.n0;
import io.sentry.s5;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final io.sentry.internal.debugmeta.c X;
    public final n0 Y;
    public final io.sentry.cache.d Z;
    public final q f0 = new q(-1);
    public final /* synthetic */ c g0;

    public b(c cVar, io.sentry.internal.debugmeta.c cVar2, n0 n0Var, io.sentry.cache.d dVar) {
        this.g0 = cVar;
        io.sentry.util.b.s(cVar2, "Envelope is required.");
        this.X = cVar2;
        this.Y = n0Var;
        io.sentry.util.b.s(dVar, "EnvelopeCache is required.");
        this.Z = dVar;
    }

    public final io.sentry.config.a a() {
        io.sentry.internal.debugmeta.c cVar = this.X;
        ((c5) cVar.Y).f0 = null;
        io.sentry.cache.d dVar = this.Z;
        n0 n0Var = this.Y;
        boolean zM = dVar.m(cVar, n0Var);
        Object objB = n0Var.b("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(n0Var.b("sentry:typeCheckHint"));
        c cVar2 = this.g0;
        if (zIsInstance && objB != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objB;
            SentryAndroidOptions sentryAndroidOptions = cVar2.Z;
            if (cVar3.f(((c5) cVar.Y).X)) {
                cVar3.X.countDown();
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = cVar2.Z;
        if (!cVar2.g0.a()) {
            Object objB2 = n0Var.b("sentry:typeCheckHint");
            boolean zIsInstance2 = io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint"));
            q qVar = this.f0;
            if (zIsInstance2 && objB2 != null) {
                ((io.sentry.hints.h) objB2).c(true);
                return qVar;
            }
            if (!zM) {
                io.sentry.util.b.o(io.sentry.hints.h.class, objB2, sentryAndroidOptions2.getLogger());
                sentryAndroidOptions2.getClientReportRecorder().b(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            }
            return qVar;
        }
        io.sentry.internal.debugmeta.c cVarJ = sentryAndroidOptions2.getClientReportRecorder().j(cVar);
        try {
            ((c5) cVarJ.Y).f0 = new Date((long) (sentryAndroidOptions2.getDateProvider().a().d() / 1000000.0d));
            io.sentry.config.a aVarD = cVar2.h0.d(cVarJ);
            if (aVarD.p()) {
                dVar.J(cVar);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.m();
            sentryAndroidOptions2.getLogger().h(s5.ERROR, str, new Object[0]);
            if (aVarD.m() >= 400) {
                dVar.J(cVar);
                if (aVarD.m() != 429) {
                    sentryAndroidOptions2.getClientReportRecorder().b(io.sentry.clientreport.d.SEND_ERROR, cVarJ);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objB3 = n0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                ((io.sentry.hints.h) objB3).c(true);
            } else if (!zM) {
                io.sentry.util.b.o(io.sentry.hints.h.class, objB3, sentryAndroidOptions2.getLogger());
                sentryAndroidOptions2.getClientReportRecorder().b(io.sentry.clientreport.d.NETWORK_ERROR, cVarJ);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    public final /* synthetic */ void b(io.sentry.config.a aVar, io.sentry.hints.k kVar) {
        this.g0.Z.getLogger().h(s5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.p()));
        kVar.b(aVar.p());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g0.i0 = this;
        io.sentry.config.a aVarA = this.f0;
        try {
            aVarA = a();
            this.g0.Z.getLogger().h(s5.DEBUG, "Envelope flushed", new Object[0]);
            n0 n0Var = this.Y;
            Object objB = n0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.k.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB != null) {
                b(aVarA, (io.sentry.hints.k) objB);
            }
            this.g0.i0 = null;
        } catch (Throwable th) {
            try {
                this.g0.Z.getLogger().d(s5.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } catch (Throwable th2) {
                n0 n0Var2 = this.Y;
                Object objB2 = n0Var2.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(n0Var2.b("sentry:typeCheckHint")) && objB2 != null) {
                    b(aVarA, (io.sentry.hints.k) objB2);
                }
                this.g0.i0 = null;
                throw th2;
            }
        }
    }
}
