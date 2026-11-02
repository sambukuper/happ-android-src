package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import su.happ.proxyutility.service.QSTileService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class b26 extends BroadcastReceiver {
    public final /* synthetic */ QSTileService a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b26(QSTileService qSTileService) {
        this.a = qSTileService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        QSTileService qSTileService = this.a;
        if (numValueOf != null && numValueOf.intValue() == 11) {
            qSTileService.a(2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            qSTileService.a(1);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 31) {
            qSTileService.a(2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 32) {
            qSTileService.a(1);
        } else if (numValueOf != null && numValueOf.intValue() == 41) {
            qSTileService.a(1);
        }
    }
}
