package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.f;
import io.sentry.android.core.internal.util.e;
import io.sentry.f7;
import io.sentry.g;
import io.sentry.j4;
import io.sentry.m4;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m4 {
    public final SentryAndroidOptions a;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.m4, io.sentry.h1
    public final void b() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new e(this));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(s5.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.h1
    public final void c(f7 f7Var, j4 j4Var) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (f7Var == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new io.sentry.android.core.internal.modules.a(this, f7Var));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(s5.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.h1
    public final void f(g gVar) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new f(this, gVar, (byte) 2));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(s5.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }
}
