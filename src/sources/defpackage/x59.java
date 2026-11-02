package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import libxray.Libxray;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.StartServiceDataInfo;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class x59 {
    public static final XRayPoint a;
    public static final w59 b;
    public static SoftReference c;
    public static NotificationManager d;
    public static final m51 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        XRayPoint xRayPointNewXRayPoint = Libxray.newXRayPoint(new f08((byte) 15), Build.VERSION.SDK_INT >= 25);
        xRayPointNewXRayPoint.getClass();
        a = xRayPointNewXRayPoint;
        b = new w59();
        new vz7(new ng8((byte) 20));
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        e = gv3.c(g33.K(ow7VarB, dm4.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(LinkedHashMap linkedHashMap, List list, HashMap map) {
        w47 w47Var;
        dn8 rj6Var;
        w47 w47Var2;
        w47 w47Var3;
        w47 w47Var4;
        String message;
        SoftReference softReference = c;
        if (softReference == null || (w47Var = (w47) softReference.get()) == null) {
            return;
        }
        Service serviceG = w47Var.g();
        XRayPoint xRayPoint = a;
        if (xRayPoint.getIsRunning()) {
            return;
        }
        vz7 vz7Var = d69.a;
        b69 b69VarH = d69.h(serviceG, linkedHashMap, list, map);
        if (b69VarH.a) {
            try {
                w59 w59Var = b;
                IntentFilter intentFilter = new IntentFilter("su.happ.proxyutility.action.service");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                ue3.I(serviceG, w59Var, intentFilter, 2);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
            Libxray.disableWrapperLogs();
            xRayPoint.getLogWriter().disable();
            try {
                xRayPoint.coreRunLoop(b69VarH.b);
                rj6Var = dn8.a;
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                rj6Var = new rj6(th2);
            }
            Throwable thA = sj6.a(rj6Var);
            if (thA != null && (message = thA.getMessage()) != null) {
                ss8 ss8Var = ss8.a;
                Context applicationContext = serviceG.getApplicationContext();
                applicationContext.getClass();
                ss8.G(applicationContext, message);
            }
            String str = "";
            if (!xRayPoint.getIsRunning()) {
                qe4.N0(serviceG, 34, "");
                SoftReference softReference2 = c;
                if (softReference2 == null || (w47Var2 = (w47) softReference2.get()) == null) {
                    return;
                }
                w47Var2.g().stopForeground(1);
                return;
            }
            qe4.L0(serviceG, "su.happ.proxyutility.action.activity", 33, new StartServiceDataInfo(w47Var.c(), true));
            SoftReference softReference3 = c;
            if (softReference3 == null || (w47Var3 = (w47) softReference3.get()) == null) {
                return;
            }
            Service serviceG2 = w47Var3.g();
            PendingIntent activity = PendingIntent.getActivity(serviceG2, 0, new Intent(serviceG2, (Class<?>) MainActivity.class), 201326592);
            if (Build.VERSION.SDK_INT >= 26) {
                dn.e();
                NotificationChannel notificationChannel = new NotificationChannel("HAPP_M2_CH_ID", "Happ Background AntiFilter Service", 4);
                notificationChannel.setLightColor(-12303292);
                notificationChannel.setImportance(0);
                notificationChannel.setLockscreenVisibility(0);
                NotificationManager notificationManager = d;
                if (notificationManager == null) {
                    SoftReference softReference4 = c;
                    if (softReference4 == null || (w47Var4 = (w47) softReference4.get()) == null) {
                        notificationManager = null;
                    } else {
                        Object systemService = w47Var4.g().getSystemService("notification");
                        systemService.getClass();
                        notificationManager = (NotificationManager) systemService;
                        d = notificationManager;
                    }
                }
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                str = "HAPP_M2_CH_ID";
            }
            r65 r65Var = new r65(serviceG2, str);
            r65Var.v.icon = q36.ic_stat_name;
            r65Var.e = r65.c(serviceG2.getApplicationContext().getString(y46.notification_antifilter_service_title));
            r65Var.j = -2;
            r65Var.d(2, true);
            r65Var.k = false;
            r65Var.d(8, true);
            r65Var.g = activity;
            serviceG2.startForeground(1, r65Var.b());
        }
    }
}
