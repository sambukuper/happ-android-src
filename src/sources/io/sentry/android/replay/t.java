package io.sentry.android.replay;

import defpackage.dh3;
import defpackage.dn2;
import defpackage.g24;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.p0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ ReplayIntegration Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(ReplayIntegration replayIntegration, byte b) {
        super(0);
        this.Y = b;
        this.Z = replayIntegration;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        ReplayIntegration replayIntegration = this.Z;
        switch (b) {
            case 0:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new p0((byte) 3));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
                SentryAndroidOptions sentryAndroidOptions = replayIntegration.f0;
                if (sentryAndroidOptions != null) {
                    return new io.sentry.android.replay.util.g(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryAndroidOptions);
                }
                dh3.T("options");
                throw null;
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor2 = Executors.newSingleThreadScheduledExecutor(new p0((byte) 2));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor2.getClass();
                SentryAndroidOptions sentryAndroidOptions2 = replayIntegration.f0;
                if (sentryAndroidOptions2 != null) {
                    return new io.sentry.android.replay.util.g(scheduledExecutorServiceNewSingleThreadScheduledExecutor2, sentryAndroidOptions2);
                }
                dh3.T("options");
                throw null;
        }
    }
}
