package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {
    public final Thread X;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.util.b.s(thread, "Thread must be provided.");
        this.X = thread;
        setStackTrace(thread.getStackTrace());
    }

    public ApplicationNotResponding(String str) {
        super(str);
        this.X = null;
    }
}
