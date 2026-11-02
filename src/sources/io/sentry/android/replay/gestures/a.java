package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.p;
import io.sentry.android.replay.util.c;
import io.sentry.android.replay.y;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public final SentryAndroidOptions Y;
    public volatile ReplayIntegration Z;

    public a(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, Window.Callback callback) {
        super(callback);
        this.Y = sentryAndroidOptions;
        this.Z = replayIntegration;
    }

    @Override // io.sentry.android.replay.util.c, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y yVar;
        io.sentry.android.replay.capture.c cVar;
        if (motionEvent != null) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            motionEventObtainNoHistory.getClass();
            try {
                ReplayIntegration replayIntegration = this.Z;
                if (replayIntegration != null) {
                    p pVar = (p) replayIntegration.q0.get();
                    if (replayIntegration.n0.get() && (((yVar = pVar.b) == y.STARTED || yVar == y.RESUMED) && (cVar = pVar.d) != null)) {
                        cVar.i(motionEventObtainNoHistory);
                    }
                }
            } catch (Throwable th) {
                try {
                    this.Y.getLogger().e(s5.ERROR, "Error dispatching touch event", th);
                } finally {
                    motionEventObtainNoHistory.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
