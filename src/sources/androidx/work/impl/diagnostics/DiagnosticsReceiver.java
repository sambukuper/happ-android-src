package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.eb5;
import defpackage.fb5;
import defpackage.g62;
import defpackage.i21;
import defpackage.l39;
import defpackage.lh4;
import defpackage.x39;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        lh4.a1("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        lh4.P0().getClass();
        try {
            context.getClass();
            x39 x39VarV0 = x39.v0(context);
            x39VarV0.getClass();
            List listK = i21.K((fb5) new eb5(DiagnosticsWorker.class).a());
            if (listK.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new l39(x39VarV0, null, g62.Y, listK, null).a();
        } catch (IllegalStateException unused) {
            lh4.P0().getClass();
        }
    }
}
