package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.h1;
import io.sentry.android.core.internal.gestures.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {
    public final h1 Y;

    public i(Window.Callback callback, h1 h1Var) {
        super(callback);
        this.Y = h1Var;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.Y.run();
    }
}
