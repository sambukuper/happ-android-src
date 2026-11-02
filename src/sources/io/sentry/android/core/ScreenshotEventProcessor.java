package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import io.sentry.s5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotEventProcessor implements io.sentry.i0 {
    public final SentryAndroidOptions a;
    public final n0 b;
    public final boolean d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final io.sentry.android.core.internal.util.h c = new io.sentry.android.core.internal.util.h(2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, n0 n0Var, boolean z) {
        this.a = sentryAndroidOptions;
        this.b = n0Var;
        this.d = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.b.a("Screenshot");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0136 */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.graphics.Bitmap] */
    @Override // io.sentry.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.j5 b(io.sentry.j5 r14, io.sentry.n0 r15) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.b(io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }

    public final io.sentry.android.replay.viewhierarchy.g d(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.g gVarE = io.sentry.config.a.e(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.android.replay.util.l.b(rootView, gVarE, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return gVarE;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.n0 n0Var) {
        return f0Var;
    }
}
