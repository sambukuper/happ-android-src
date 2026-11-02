package io.sentry.android.replay;

import defpackage.s91;
import io.sentry.i1;
import io.sentry.u0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ReplayIntegration Y;

    public /* synthetic */ u(ReplayIntegration replayIntegration, byte b) {
        this.X = b;
        this.Y = replayIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var;
        i1 i1Var2;
        s91 s91VarD;
        s91 s91VarD2;
        byte b = this.X;
        ReplayIntegration replayIntegration = this.Y;
        switch (b) {
            case 0:
                int i = ReplayIntegration.r0;
                replayIntegration.C0();
                break;
            case 1:
                int i2 = ReplayIntegration.r0;
                replayIntegration.Z0(false);
                break;
            case 2:
                int i3 = ReplayIntegration.r0;
                if (((p) replayIntegration.q0.get()).d instanceof io.sentry.android.replay.capture.m) {
                    if (replayIntegration.Z == u0.DISCONNECTED || (((i1Var = replayIntegration.g0) != null && (s91VarD2 = i1Var.d()) != null && s91VarD2.k(io.sentry.p.All)) || ((i1Var2 = replayIntegration.g0) != null && (s91VarD = i1Var2.d()) != null && s91VarD.k(io.sentry.p.Replay)))) {
                        replayIntegration.C0();
                    }
                }
                break;
            default:
                int i4 = ReplayIntegration.r0;
                replayIntegration.Z0(true);
                break;
        }
    }
}
