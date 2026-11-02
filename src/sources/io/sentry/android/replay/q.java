package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.ea6;
import defpackage.nw3;
import defpackage.o76;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t2;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ ReplayIntegration X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ io.sentry.protocol.w Z;
    public final /* synthetic */ ea6 f0;
    public final /* synthetic */ Date g0;

    public q(ReplayIntegration replayIntegration, long j, io.sentry.protocol.w wVar, ea6 ea6Var, Date date) {
        this.X = replayIntegration;
        this.Y = j;
        this.Z = wVar;
        this.f0 = ea6Var;
        this.g0 = date;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = (p) this.X.q0.get();
        pVar.getClass();
        io.sentry.protocol.w wVar = this.Z;
        wVar.getClass();
        if (pVar.b() && pVar.a == this.Y && dh3.f(pVar.c, wVar)) {
            io.sentry.android.replay.capture.c cVar = pVar.d;
            ea6 ea6Var = this.f0;
            Object obj = ea6Var.X;
            if (cVar == obj) {
                io.sentry.android.replay.capture.c cVar2 = (io.sentry.android.replay.capture.c) obj;
                cVar2.k(cVar2.e() + 1);
                ((io.sentry.android.replay.capture.c) ea6Var.X).m(this.g0);
                io.sentry.android.replay.capture.a aVar = ((io.sentry.android.replay.capture.c) ea6Var.X).p;
                nw3 nw3Var = io.sentry.android.replay.capture.c.u[6];
                Boolean bool = Boolean.TRUE;
                aVar.getClass();
                nw3Var.getClass();
                Object andSet = aVar.b.getAndSet(bool);
                if (dh3.f(andSet, bool)) {
                    return;
                }
                byte b = 4;
                o76 o76Var = new o76(andSet, bool, aVar.d, b);
                io.sentry.android.replay.capture.c cVar3 = aVar.c;
                s6 s6Var = cVar3.a;
                if (s6Var.getThreadChecker().c()) {
                    cVar3.e.submit(new io.sentry.android.replay.util.h(new t2(o76Var, b), "CaptureStrategy.runInBackground"));
                    return;
                }
                try {
                    o76Var.invoke();
                } catch (Throwable th) {
                    s6Var.getLogger().e(s5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
    }
}
