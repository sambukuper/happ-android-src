package io.sentry.android.core.performance;

import android.os.MessageQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements MessageQueue.IdleHandler {
    public final /* synthetic */ g a;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.a.d();
        return false;
    }
}
