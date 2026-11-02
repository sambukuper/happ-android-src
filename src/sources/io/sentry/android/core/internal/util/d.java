package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.SystemClock;
import io.sentry.android.core.s0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements io.sentry.transport.f {
    public static final d X = new d();

    public void a(s0 s0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 28) {
            return;
        }
        String callingPackage = s0Var.getCallingPackage();
        String packageName = s0Var.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    @Override // io.sentry.transport.f
    public long d() {
        return SystemClock.uptimeMillis();
    }
}
