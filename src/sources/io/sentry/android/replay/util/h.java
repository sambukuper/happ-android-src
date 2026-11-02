package io.sentry.android.replay.util;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    public final String X;
    public final /* synthetic */ Runnable Y;

    public h(Runnable runnable, String str) {
        runnable.getClass();
        this.X = str;
        this.Y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.run();
    }
}
