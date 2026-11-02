package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends TimerTask {
    public final /* synthetic */ w X;

    public t(w wVar) {
        this.X = wVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Iterator it = this.X.d.iterator();
        while (it.hasNext()) {
            ((e1) it.next()).c();
        }
    }
}
