package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 implements AutoCloseable {
    public static final p02 X = new p02();
    public static final AtomicInteger Y = new AtomicInteger(0);

    @Override // java.lang.AutoCloseable
    public final void close() {
        Y.set(0);
    }
}
