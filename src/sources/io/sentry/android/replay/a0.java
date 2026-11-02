package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Closeable {
    public final AtomicBoolean X = new AtomicBoolean(false);
    public final io.sentry.util.a Y = new io.sentry.util.a();
    public final io.sentry.android.core.e0 Z = new io.sentry.android.core.e0(this, 1);
    public final z f0 = new z(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.set(true);
        this.Z.clear();
    }
}
