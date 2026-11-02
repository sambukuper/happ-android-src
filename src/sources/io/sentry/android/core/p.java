package io.sentry.android.core;

import android.content.Context;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Supplier {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SentryAndroidOptions b;

    public /* synthetic */ p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = context;
        this.b = sentryAndroidOptions;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return new m1(this.a, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getExecutorService());
    }
}
