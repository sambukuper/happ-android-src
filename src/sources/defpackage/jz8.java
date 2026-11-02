package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jz8 {
    public final pi7 a;
    public final MMKV b;
    public final vz7 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jz8(Context context) {
        HappApplication happApplication = HappApplication.M0;
        pi7 pi7Var = (pi7) k32.i().E0.getValue();
        kw4 kw4Var = kw4.a;
        MMKV mmkvL = kw4.l();
        pi7Var.getClass();
        this.a = pi7Var;
        this.b = mmkvL;
        this.c = new vz7(new xl0(context, (byte) 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r65 c(w47 w47Var, String str, Boolean bool) {
        PendingIntent activity = PendingIntent.getActivity(w47Var.g(), 0, new Intent(w47Var.g(), (Class<?>) MainActivity.class), 201326592);
        Intent intentPutExtra = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 134);
        intentPutExtra.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(w47Var.g(), 3, intentPutExtra, 201326592);
        Intent intentPutExtra2 = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 4);
        intentPutExtra2.getClass();
        PendingIntent broadcast2 = PendingIntent.getBroadcast(w47Var.g(), 4, intentPutExtra2, 201326592);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : n69.a.getIsRunning();
        r65 r65Var = new r65(w47Var.g(), "HAPP_M_CH_ID");
        r65Var.v.icon = q36.ic_stat_name;
        r65Var.e = r65.c(str);
        r65Var.j = -2;
        r65Var.d(2, true);
        r65Var.k = false;
        r65Var.d(8, true);
        r65Var.g = activity;
        ArrayList arrayList = r65Var.b;
        if (zBooleanValue) {
            Service serviceG = w47Var.g();
            int i = q36.icon_ping;
            PorterDuff.Mode mode = IconCompat.k;
            IconCompat iconCompatB = IconCompat.b(serviceG.getResources(), serviceG.getPackageName(), i);
            String string = w47Var.g().getString(y46.title_ping);
            Bundle bundle = new Bundle();
            CharSequence charSequenceC = r65.c(string);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (!arrayList2.isEmpty()) {
            }
            arrayList.add(new n65(iconCompatB, charSequenceC, broadcast, bundle, arrayList3.isEmpty() ? null : (fd6[]) arrayList3.toArray(new fd6[arrayList3.size()]), true, true));
        }
        if (zBooleanValue) {
            Service serviceG2 = w47Var.g();
            int i2 = q36.ic_close_grey_800_24dp;
            PorterDuff.Mode mode2 = IconCompat.k;
            IconCompat iconCompatB2 = IconCompat.b(serviceG2.getResources(), serviceG2.getPackageName(), i2);
            String string2 = w47Var.g().getString(y46.notification_action_stop_xray);
            Bundle bundle2 = new Bundle();
            CharSequence charSequenceC2 = r65.c(string2);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList4.isEmpty()) {
            }
            arrayList.add(new n65(iconCompatB2, charSequenceC2, broadcast2, bundle2, arrayList5.isEmpty() ? null : (fd6[]) arrayList5.toArray(new fd6[arrayList5.size()]), true, true));
        }
        return r65Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(String str) {
        HappApplication happApplication = HappApplication.M0;
        String str2 = (String) ((q72) k32.i().F0.getValue()).a(str).X;
        return fm7.R0(mm7.W(str, str2, " " + str2, false)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(jz8 jz8Var, w47 w47Var, String str, oi7 oi7Var, Boolean bool, int i) {
        String str2;
        Notification notificationB;
        Notification notificationBuild;
        if ((i & 4) != 0) {
            oi7Var = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        pi7 pi7Var = jz8Var.a;
        vz7 vz7Var = jz8Var.c;
        if (ss8.b) {
            String strD = d(str);
            kw4 kw4Var = kw4.a;
            String strI = kw4.h().i("SELECTED_SERVER");
            str2 = strI != null ? strI : null;
            if (str2 == null) {
                return;
            }
            Notification.Builder builderB = jz8Var.b(w47Var, strD, bool);
            NotificationManager notificationManager = (NotificationManager) vz7Var.getValue();
            if (oi7Var == null) {
                notificationBuild = builderB.build();
            } else {
                String strA = pi7Var.a(w47Var.g(), str2, oi7Var);
                notificationBuild = builderB.setStyle(new Notification.BigTextStyle().bigText(strA)).setContentText(strA).build();
                notificationBuild.getClass();
            }
            notificationManager.notify(1, notificationBuild);
            return;
        }
        String strD2 = d(str);
        kw4 kw4Var2 = kw4.a;
        String strI2 = kw4.h().i("SELECTED_SERVER");
        str2 = strI2 != null ? strI2 : null;
        if (str2 == null) {
            return;
        }
        r65 r65VarC = c(w47Var, strD2, bool);
        NotificationManager notificationManager2 = (NotificationManager) vz7Var.getValue();
        if (oi7Var == null) {
            notificationB = r65VarC.b();
        } else {
            Service serviceG = w47Var.g();
            r65 r65VarC2 = c(w47Var, strD2, bool);
            String strA2 = pi7Var.a(serviceG, str2, oi7Var);
            q65 q65Var = new q65();
            q65Var.e = r65.c(strA2);
            r65VarC2.f(q65Var);
            r65VarC2.f = r65.c(strA2);
            notificationB = r65VarC2.b();
            notificationB.getClass();
        }
        notificationManager2.notify(1, notificationB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        dn.e();
        NotificationChannel notificationChannel = new NotificationChannel("HAPP_M_CH_ID", "Happ Background Service", 2);
        notificationChannel.setLightColor(-12303292);
        ((NotificationManager) this.c.getValue()).createNotificationChannel(notificationChannel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Notification.Builder b(w47 w47Var, String str, Boolean bool) {
        PendingIntent activity = PendingIntent.getActivity(w47Var.g(), 0, new Intent(w47Var.g(), (Class<?>) MainActivity.class), 201326592);
        Intent intentPutExtra = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 132);
        intentPutExtra.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(w47Var.g(), 2, intentPutExtra, 201326592);
        Intent intentPutExtra2 = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 133);
        intentPutExtra2.getClass();
        PendingIntent broadcast2 = PendingIntent.getBroadcast(w47Var.g(), 1, intentPutExtra2, 201326592);
        Intent intentPutExtra3 = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 134);
        intentPutExtra3.getClass();
        PendingIntent broadcast3 = PendingIntent.getBroadcast(w47Var.g(), 3, intentPutExtra3, 201326592);
        Intent intentPutExtra4 = new Intent("su.happ.proxyutility.action.service").setPackage("su.happ.proxyutility").putExtra("key", 4);
        intentPutExtra4.getClass();
        PendingIntent broadcast4 = PendingIntent.getBroadcast(w47Var.g(), 4, intentPutExtra4, 201326592);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : n69.a.getIsRunning();
        boolean zC = this.b.c("pref_live_updates", false);
        Notification.Builder contentIntent = new Notification.Builder(w47Var.g(), "HAPP_M_CH_ID").setSmallIcon(q36.ic_stat_name).setContentTitle(str).setOngoing(true).setRequestPromotedOngoing(zC).setShowWhen(false).setOnlyAlertOnce(true).setContentIntent(activity);
        if (zBooleanValue) {
            contentIntent = contentIntent.addAction(new Notification.Action.Builder(Icon.createWithResource(w47Var.g(), q36.icon_ping), w47Var.g().getString(y46.title_ping), broadcast3).build());
        }
        if (zC) {
            contentIntent = contentIntent.addAction((!zBooleanValue || w47Var.getL0()) ? new Notification.Action.Builder(Icon.createWithResource(w47Var.g(), R.drawable.ic_lock_power_off), w47Var.g().getString(y46.notification_action_connect_xray), broadcast).build() : new Notification.Action.Builder(Icon.createWithResource(w47Var.g(), q36.ic_close_grey_800_24dp), w47Var.g().getString(y46.notification_action_disconnect_xray), broadcast2).build());
        }
        if (zBooleanValue) {
            contentIntent = contentIntent.addAction(new Notification.Action.Builder(Icon.createWithResource(w47Var.g(), q36.ic_close_grey_800_24dp), w47Var.g().getString(y46.notification_action_stop_xray), broadcast4).build());
        }
        contentIntent.getClass();
        return contentIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(w47 w47Var, String str) {
        str.getClass();
        boolean z = ss8.b;
        rj6 rj6Var = dn8.a;
        if (z) {
            try {
                w47Var.g().startForeground(1, b(w47Var, d(str), Boolean.TRUE).build());
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            Throwable thA = sj6.a(rj6Var);
            if (thA != null) {
                thA.getMessage();
                return;
            }
            return;
        }
        try {
            w47Var.g().startForeground(1, c(w47Var, d(str), Boolean.TRUE).b());
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
        Throwable thA2 = sj6.a(rj6Var);
        if (thA2 != null) {
            thA2.getMessage();
        }
    }
}
