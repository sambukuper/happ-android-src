package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class q65 extends s65 {
    public CharSequence e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(z47 z47Var) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) z47Var.Z).setBigContentTitle((CharSequence) ((s65) this).c).bigText(this.e);
        if (((s65) this).a) {
            bigTextStyleBigText.setSummaryText((CharSequence) ((s65) this).d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
