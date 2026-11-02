package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.ea6;
import defpackage.j78;
import defpackage.s91;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i1;
import io.sentry.s5;
import io.sentry.u0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ReplayIntegration Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ s(ReplayIntegration replayIntegration, Object obj, byte b) {
        this.X = b;
        this.Y = replayIntegration;
        this.Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ReplayIntegration replayIntegration = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                p pVar = (p) obj;
                long j = pVar.a;
                io.sentry.protocol.w wVar = pVar.c;
                int i = ReplayIntegration.r0;
                ReplayIntegration replayIntegration2 = this.Y;
                AtomicReference atomicReference = replayIntegration2.q0;
                p pVar2 = (p) atomicReference.get();
                io.sentry.android.replay.capture.c cVar = pVar2.d;
                wVar.getClass();
                if (!pVar2.b() || pVar2.a != j || !dh3.f(pVar2.c, wVar) || cVar == null) {
                    i1 i1Var = replayIntegration2.g0;
                    if (i1Var != null) {
                        i1Var.o(new j78(wVar, (byte) 21));
                    }
                    SentryAndroidOptions sentryAndroidOptions = replayIntegration2.f0;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().h(s5.INFO, "Replay was stopped or restarted before capture could run, not capturing replay", new Object[0]);
                        return;
                    } else {
                        dh3.T("options");
                        throw null;
                    }
                }
                ea6 ea6Var = new ea6();
                ea6Var.X = cVar;
                cVar.a(new r(replayIntegration2, j, wVar, ea6Var), false);
                io.sentry.android.replay.capture.c cVarB = cVar.b();
                ea6Var.X = cVarB;
                io.sentry.protocol.w wVarD = cVarB.d();
                if (wVarD == null) {
                    wVarD = io.sentry.protocol.w.Y;
                }
                wVarD.getClass();
                atomicReference.set(p.a(pVar2, null, wVarD, (io.sentry.android.replay.capture.c) ea6Var.X, 3));
                return;
            case 1:
                u0 u0Var = (u0) obj;
                replayIntegration.Z = u0Var;
                if (((p) replayIntegration.q0.get()).d instanceof io.sentry.android.replay.capture.m) {
                    if (u0Var == u0.DISCONNECTED) {
                        replayIntegration.C0();
                        return;
                    } else {
                        replayIntegration.H0();
                        return;
                    }
                }
                return;
            default:
                s91 s91Var = (s91) obj;
                if (((p) replayIntegration.q0.get()).d instanceof io.sentry.android.replay.capture.m) {
                    if (s91Var.k(io.sentry.p.All) || s91Var.k(io.sentry.p.Replay)) {
                        replayIntegration.C0();
                        return;
                    } else {
                        replayIntegration.H0();
                        return;
                    }
                }
                return;
        }
    }
}
