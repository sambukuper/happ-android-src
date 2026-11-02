package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.lh4;
import defpackage.x39;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        lh4.a1("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lh4 lh4VarP0 = lh4.P0();
        Objects.toString(intent);
        lh4VarP0.getClass();
        try {
            x39 x39VarV0 = x39.v0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            x39VarV0.getClass();
            synchronized (x39.v0) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = x39VarV0.q0;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    x39VarV0.q0 = pendingResultGoAsync;
                    if (x39VarV0.p0) {
                        pendingResultGoAsync.finish();
                        x39VarV0.q0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException unused) {
            lh4.P0().getClass();
        }
    }
}
