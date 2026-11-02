package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sc8 implements Runnable {
    public static final Object h0 = new Object();
    public static Boolean i0;
    public static Boolean j0;
    public final Context X;
    public final r41 Y;
    public final PowerManager.WakeLock Z;
    public final qc8 f0;
    public final long g0;

    public sc8(qc8 qc8Var, Context context, r41 r41Var, long j) {
        this.f0 = qc8Var;
        this.X = context;
        this.g0 = j;
        this.Y = r41Var;
        this.Z = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (h0) {
            try {
                Boolean bool = j0;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                j0 = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (h0) {
            try {
                Boolean bool = i0;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                i0 = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.X.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        qc8 qc8Var = this.f0;
        Context context = this.X;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.Z;
        if (zB) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    qc8Var.a(true);
                    if (!this.Y.i()) {
                        qc8Var.a(false);
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        if (!a(context) || c()) {
                            if (qc8Var.b()) {
                                qc8Var.a(false);
                            } else {
                                qc8Var.c(this.g0);
                            }
                            if (b(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        rc8 rc8Var = new rc8();
                        rc8Var.a = this;
                        context.registerReceiver(rc8Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.getMessage();
                qc8Var.a(false);
                if (b(context)) {
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused3) {
        }
    }
}
