package io.sentry.android.core;

import android.os.Debug;
import io.sentry.t3;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements io.sentry.e1 {
    @Override // io.sentry.e1
    public final void a(t3 t3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        t3Var.c = jFreeMemory;
        t3Var.d = true;
        t3Var.e = nativeHeapSize;
        t3Var.f = true;
    }

    @Override // io.sentry.e1
    public final void c() {
    }
}
