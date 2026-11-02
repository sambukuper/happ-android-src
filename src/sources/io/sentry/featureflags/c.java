package io.sentry.featureflags;

import io.sentry.protocol.j;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public static final c X = new c();

    @Override // io.sentry.featureflags.b
    public final j b() {
        return null;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m13clone() {
        return X;
    }

    @Override // io.sentry.featureflags.b
    public final b clone() {
        return X;
    }

    @Override // io.sentry.featureflags.b
    public final void clear() {
    }
}
