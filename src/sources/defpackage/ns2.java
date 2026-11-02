package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ns2 extends os2 {
    public static final Object c = new Object();
    public static final ns2 d = new ns2();
    public h99 b;

    public static AlertDialog d(Activity activity, int i, b99 b99Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(u89.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(f56.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(f56.common_google_play_services_enable_button);
        } else {
            string = resources.getString(f56.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, b99Var);
        }
        String strA = u89.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                ml2 ml2VarN = ((FragmentActivity) activity).n();
                rw7 rw7Var = new rw7();
                w45.t(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                rw7Var.t1 = alertDialog;
                if (onCancelListener != null) {
                    rw7Var.u1 = onCancelListener;
                }
                rw7Var.X(ml2VarN, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        f32 f32Var = new f32();
        w45.t(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        f32Var.X = alertDialog;
        if (onCancelListener != null) {
            f32Var.Y = onCancelListener;
        }
        f32Var.show(fragmentManager, str);
    }

    @Override // defpackage.os2
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, new v89(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, b94 b94Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new z89(super.a(i, activity, "d"), b94Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new s89(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i == 6 ? u89.e(context, "common_google_play_services_resolution_required_title") : u89.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(f56.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? u89.d(context, "common_google_play_services_resolution_required_text", u89.c(context)) : u89.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w45.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        r65 r65Var = new r65(context, null);
        r65Var.o = true;
        r65Var.d(16, true);
        r65Var.e = r65.c(strE);
        q65 q65Var = new q65();
        q65Var.e = r65.c(strD);
        r65Var.f(q65Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = jm4.i0;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            jm4.i0 = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            r65Var.v.icon = i3;
            r65Var.j = 2;
            if (jm4.O(context)) {
                r65Var.a(o36.common_full_open_on_phone, pendingIntent, resources.getString(f56.common_open_on_phone));
            } else {
                r65Var.g = pendingIntent;
            }
        } else {
            r65Var.v.icon = R.drawable.stat_sys_warning;
            r65Var.v.tickerText = r65.c(resources.getString(f56.common_google_play_services_notification_ticker));
            r65Var.v.when = System.currentTimeMillis();
            r65Var.g = pendingIntent;
            r65Var.f = r65.c(strD);
        }
        if (zc1.T()) {
            if (!zc1.T()) {
                c2.g();
                return;
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(f56.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            r65Var.t = "com.google.android.gms.availability";
        }
        Notification notificationB = r65Var.b();
        if (i == 1 || i == 2 || i == 3) {
            ss2.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }
}
