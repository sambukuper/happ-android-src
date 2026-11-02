package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.vz7;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s5;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ ReplayIntegration X;
    public final /* synthetic */ boolean Y;

    public v(ReplayIntegration replayIntegration, boolean z) {
        this.X = replayIntegration;
        this.Y = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p pVar;
        y yVar;
        y yVar2;
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.android.replay.capture.c fVar;
        k0 k0Var;
        io.sentry.protocol.w wVarD;
        SentryAndroidOptions sentryAndroidOptions2;
        SentryAndroidOptions sentryAndroidOptions3;
        ReplayIntegration replayIntegration = this.X;
        vz7 vz7Var = replayIntegration.k0;
        vz7 vz7Var2 = replayIntegration.m0;
        vz7 vz7Var3 = replayIntegration.l0;
        AtomicBoolean atomicBoolean = replayIntegration.n0;
        if (atomicBoolean.get()) {
            if (this.Y) {
                replayIntegration.Z0(true);
                SentryAndroidOptions sentryAndroidOptions4 = replayIntegration.f0;
                if (sentryAndroidOptions4 == null) {
                    dh3.T("options");
                    throw null;
                }
                boolean zJ0 = replayIntegration.J0(sentryAndroidOptions4.getSessionReplay().d);
                if (zJ0) {
                    atomicReference = replayIntegration.q0;
                    if (atomicBoolean.get()) {
                        pVar = (p) atomicReference.get();
                        yVar = pVar.b;
                        yVar2 = y.STARTED;
                        if (io.sentry.config.a.o(yVar, yVar2)) {
                            if (zJ0) {
                                sentryAndroidOptions2 = replayIntegration.f0;
                                if (sentryAndroidOptions2 != null) {
                                    dh3.T("options");
                                    throw null;
                                }
                                fVar = new io.sentry.android.replay.capture.m(sentryAndroidOptions2, replayIntegration.g0, replayIntegration.Y, (io.sentry.android.replay.util.g) vz7Var3.getValue(), (io.sentry.android.replay.util.g) vz7Var2.getValue());
                            } else {
                                sentryAndroidOptions = replayIntegration.f0;
                                if (sentryAndroidOptions != null) {
                                    dh3.T("options");
                                    throw null;
                                }
                                fVar = new io.sentry.android.replay.capture.f(sentryAndroidOptions, replayIntegration.g0, replayIntegration.Y, (io.sentry.android.replay.util.g) vz7Var3.getValue(), (io.sentry.android.replay.util.g) vz7Var2.getValue());
                            }
                            k0Var = replayIntegration.h0;
                            if (k0Var != null) {
                                k0Var.h0.getAndSet(true);
                            }
                            fVar.n(0, new io.sentry.protocol.w(), null);
                            wVarD = fVar.d();
                            long j = pVar.a + 1;
                            if (wVarD == null) {
                                wVarD = io.sentry.protocol.w.Y;
                            }
                            io.sentry.protocol.w wVar = wVarD;
                            wVar.getClass();
                            atomicReference.set(new p(j, yVar2, wVar, fVar));
                            if (replayIntegration.h0 != null) {
                                io.sentry.android.core.e0 e0Var = ((a0) vz7Var.getValue()).Z;
                                k0 k0Var2 = replayIntegration.h0;
                                k0Var2.getClass();
                                e0Var.add(k0Var2);
                            }
                            ((a0) vz7Var.getValue()).Z.add(replayIntegration.i0);
                        } else {
                            sentryAndroidOptions3 = replayIntegration.f0;
                            if (sentryAndroidOptions3 != null) {
                                dh3.T("options");
                                throw null;
                            }
                            sentryAndroidOptions3.getLogger().h(s5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                        }
                    }
                } else {
                    SentryAndroidOptions sentryAndroidOptions5 = replayIntegration.f0;
                    if (sentryAndroidOptions5 == null) {
                        dh3.T("options");
                        throw null;
                    }
                    Double d = sentryAndroidOptions5.getSessionReplay().e;
                    if (d == null || d.doubleValue() <= 0.0d) {
                        SentryAndroidOptions sentryAndroidOptions6 = replayIntegration.f0;
                        if (sentryAndroidOptions6 == null) {
                            dh3.T("options");
                            throw null;
                        }
                        sentryAndroidOptions6.getLogger().h(s5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    } else {
                        atomicReference = replayIntegration.q0;
                        if (atomicBoolean.get()) {
                            pVar = (p) atomicReference.get();
                            yVar = pVar.b;
                            yVar2 = y.STARTED;
                            if (io.sentry.config.a.o(yVar, yVar2)) {
                                sentryAndroidOptions3 = replayIntegration.f0;
                                if (sentryAndroidOptions3 != null) {
                                    dh3.T("options");
                                    throw null;
                                }
                                sentryAndroidOptions3.getLogger().h(s5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                            } else {
                                if (zJ0) {
                                    sentryAndroidOptions2 = replayIntegration.f0;
                                    if (sentryAndroidOptions2 != null) {
                                        dh3.T("options");
                                        throw null;
                                    }
                                    fVar = new io.sentry.android.replay.capture.m(sentryAndroidOptions2, replayIntegration.g0, replayIntegration.Y, (io.sentry.android.replay.util.g) vz7Var3.getValue(), (io.sentry.android.replay.util.g) vz7Var2.getValue());
                                } else {
                                    sentryAndroidOptions = replayIntegration.f0;
                                    if (sentryAndroidOptions != null) {
                                        dh3.T("options");
                                        throw null;
                                    }
                                    fVar = new io.sentry.android.replay.capture.f(sentryAndroidOptions, replayIntegration.g0, replayIntegration.Y, (io.sentry.android.replay.util.g) vz7Var3.getValue(), (io.sentry.android.replay.util.g) vz7Var2.getValue());
                                }
                                k0Var = replayIntegration.h0;
                                if (k0Var != null) {
                                    k0Var.h0.getAndSet(true);
                                }
                                fVar.n(0, new io.sentry.protocol.w(), null);
                                wVarD = fVar.d();
                                long j2 = pVar.a + 1;
                                if (wVarD == null) {
                                    wVarD = io.sentry.protocol.w.Y;
                                }
                                io.sentry.protocol.w wVar2 = wVarD;
                                wVar2.getClass();
                                atomicReference.set(new p(j2, yVar2, wVar2, fVar));
                                if (replayIntegration.h0 != null) {
                                    io.sentry.android.core.e0 e0Var2 = ((a0) vz7Var.getValue()).Z;
                                    k0 k0Var3 = replayIntegration.h0;
                                    k0Var3.getClass();
                                    e0Var2.add(k0Var3);
                                }
                                ((a0) vz7Var.getValue()).Z.add(replayIntegration.i0);
                            }
                        }
                    }
                }
            }
            replayIntegration.H0();
        }
    }
}
