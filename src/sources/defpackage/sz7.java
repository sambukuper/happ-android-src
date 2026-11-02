package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sz7 implements Runnable {
    public final long X;
    public final PowerManager.WakeLock Y;
    public final FirebaseMessaging Z;
    public final ThreadPoolExecutor f0 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e25("firebase-iid-executor"));

    public sz7(FirebaseMessaging firebaseMessaging, long j) {
        this.Z = firebaseMessaging;
        this.X = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.Y = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.Z.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            return this.Z.a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
        } catch (SecurityException unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.Y;
        z47 z47VarH = z47.H();
        FirebaseMessaging firebaseMessaging = this.Z;
        if (z47VarH.L(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.k = true;
                }
                if (!firebaseMessaging.i.i()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.k = false;
                    }
                    if (z47.H().L(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (z47.H().K(firebaseMessaging.b) && !a()) {
                    rz7 rz7Var = new rz7();
                    rz7Var.a = this;
                    rz7Var.a();
                    if (z47.H().L(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.k = false;
                    }
                } else {
                    firebaseMessaging.h(this.X);
                }
                if (z47.H().L(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.k = false;
                    if (z47.H().L(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (z47.H().L(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
