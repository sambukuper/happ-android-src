package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements io.sentry.hints.a, io.sentry.hints.l {
    public final boolean X;

    public y(boolean z) {
        this.X = z;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.X ? "anr_background" : "anr_foreground";
    }
}
