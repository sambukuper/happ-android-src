package defpackage;

import android.app.NotificationChannel;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dn {
    public static /* synthetic */ NotificationChannel a(String str) {
        return new NotificationChannel("log_report_channel", str, 1);
    }

    public static /* synthetic */ OutputConfiguration b(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("subscription_expire_channel", str, 4);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
