package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w59 extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w47 w47Var;
        SoftReference softReference = x59.c;
        if (softReference == null || (w47Var = (w47) softReference.get()) == null) {
            return;
        }
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        if (numValueOf != null && numValueOf.intValue() == 13) {
            if (x59.a.getIsRunning()) {
                qe4.L0(w47Var.g(), "su.happ.proxyutility.action.activity", 14, Long.valueOf(w47Var.c()));
                return;
            } else {
                qe4.N0(w47Var.g(), 15, "");
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 42) {
            w47Var.b();
        }
    }
}
