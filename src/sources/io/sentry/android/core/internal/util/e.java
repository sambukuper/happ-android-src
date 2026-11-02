package io.sentry.android.core.internal.util;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;
import io.sentry.ndk.NativeScope;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ byte X;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                f.b = Process.myTid();
                break;
            case 1:
                NativeScope.nativeClearAttachments();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }

    public /* synthetic */ e(byte b) {
        this.X = b;
    }
}
