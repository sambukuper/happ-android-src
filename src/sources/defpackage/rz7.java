package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rz7 extends BroadcastReceiver {
    public sz7 a;
    public Context b;

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        sz7 sz7Var = this.a;
        if (sz7Var != null) {
            Context context = sz7Var.Z.b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        sz7 sz7Var = this.a;
        if (sz7Var != null && sz7Var.a()) {
            sz7 sz7Var2 = this.a;
            FirebaseMessaging firebaseMessaging = sz7Var2.Z;
            FirebaseMessaging.b(sz7Var2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
