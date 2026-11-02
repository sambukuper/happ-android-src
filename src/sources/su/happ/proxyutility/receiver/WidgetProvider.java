package su.happ.proxyutility.receiver;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import defpackage.e46;
import defpackage.j09;
import defpackage.kw4;
import defpackage.n69;
import defpackage.ss8;
import defpackage.t46;
import defpackage.x79;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/receiver/WidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "dt7", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class WidgetProvider extends AppWidgetProvider {
    public static final q15 a = r15.a();
    public static final m51 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        nf1 nf1Var = tp1.a;
        hv2 hv2Var = dm4.a;
        hv2Var.c1(1);
        b = gv3.c(hv2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, AppWidgetManager appWidgetManager, int[] iArr, boolean z, boolean z2, boolean z3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), t46.widget_switch);
        Intent action = new Intent(context, (Class<?>) WidgetProvider.class).setAction("su.happ.proxyutility.action.widget.click");
        action.getClass();
        remoteViews.setOnClickPendingIntent(e46.layout_switch, PendingIntent.getBroadcast(context, e46.layout_switch, action, 201326592));
        if (z3) {
            remoteViews.setViewVisibility(e46.outline_animated, 0);
            remoteViews.setViewVisibility(e46.outline_static, 8);
            remoteViews.setViewVisibility(e46.bg_switcher, 0);
            remoteViews.setViewVisibility(e46.bg, 8);
            remoteViews.setViewVisibility(e46.bg_active, 8);
            remoteViews.setViewVisibility(e46.bg_error, 8);
            remoteViews.setInt(e46.bg_switcher, "setDisplayedChild", 1);
        } else if (z) {
            remoteViews.setViewVisibility(e46.outline_animated, 8);
            remoteViews.setViewVisibility(e46.outline_static, 0);
            remoteViews.setViewVisibility(e46.bg_active, 0);
            remoteViews.setViewVisibility(e46.bg, 8);
            remoteViews.setViewVisibility(e46.bg_switcher, 8);
            remoteViews.setViewVisibility(e46.bg_error, 8);
        } else if (z2) {
            remoteViews.setViewVisibility(e46.outline_animated, 8);
            remoteViews.setViewVisibility(e46.outline_static, 0);
            remoteViews.setViewVisibility(e46.bg_error, 0);
            remoteViews.setViewVisibility(e46.bg_active, 8);
            remoteViews.setViewVisibility(e46.bg, 8);
            remoteViews.setViewVisibility(e46.bg_switcher, 8);
        } else {
            remoteViews.setViewVisibility(e46.outline_animated, 8);
            remoteViews.setViewVisibility(e46.outline_static, 0);
            remoteViews.setViewVisibility(e46.bg, 0);
            remoteViews.setViewVisibility(e46.bg_active, 8);
            remoteViews.setViewVisibility(e46.bg_switcher, 8);
            remoteViews.setViewVisibility(e46.bg_error, 8);
        }
        for (int i : iArr) {
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(WidgetProvider widgetProvider, Context context, AppWidgetManager appWidgetManager, int[] iArr, boolean z, boolean z2) {
        jm4.Q(b, (u61) null, new j09(widgetProvider, context, appWidgetManager, iArr, z, z2, false, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        super.onReceive(context, intent);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1439194257) {
                if (action.equals("su.happ.proxyutility.action.widget.click")) {
                    boolean isRunning = n69.a.getIsRunning();
                    if (isRunning) {
                        ss8 ss8Var = ss8.a;
                        ss8.I(context);
                    } else {
                        kw4 kw4Var = kw4.a;
                        if (!kw4.n()) {
                            x79.h(context, y46.main_error_no_subscriptions_description);
                            return;
                        } else {
                            ss8 ss8Var2 = ss8.a;
                            ss8.H(context);
                        }
                    }
                    appWidgetManager.getClass();
                    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
                    appWidgetIds.getClass();
                    jm4.Q(b, (u61) null, new j09(this, context, appWidgetManager, appWidgetIds, false, false, !isRunning, null), 3);
                    return;
                }
                return;
            }
            if (iHashCode == 1619576947 && action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                int intExtra = intent.getIntExtra("key", 0);
                if (intExtra != 11) {
                    if (intExtra != 12) {
                        if (intExtra != 31) {
                            if (intExtra == 32) {
                                appWidgetManager.getClass();
                                int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
                                appWidgetIds2.getClass();
                                b(this, context, appWidgetManager, appWidgetIds2, false, true);
                                return;
                            }
                            if (intExtra != 41) {
                                return;
                            }
                        }
                    }
                    appWidgetManager.getClass();
                    int[] appWidgetIds3 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
                    appWidgetIds3.getClass();
                    b(this, context, appWidgetManager, appWidgetIds3, false, false);
                    return;
                }
                appWidgetManager.getClass();
                int[] appWidgetIds4 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
                appWidgetIds4.getClass();
                b(this, context, appWidgetManager, appWidgetIds4, true, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        b(this, context, appWidgetManager, iArr, n69.a.getIsRunning(), false);
    }
}
