package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j39 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public h39 e;
    public boolean f;

    public j39(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new e25("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
        L1:
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L6e
            h39 r0 = r8.e     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L24
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L24
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L21
            i39 r0 = (defpackage.i39) r0     // Catch: java.lang.Throwable -> L21
            h39 r1 = r8.e     // Catch: java.lang.Throwable -> L21
            r1.a(r0)     // Catch: java.lang.Throwable -> L21
            goto L1
        L21:
            r0 = move-exception
            r5 = r8
            goto L71
        L24:
            boolean r0 = r8.f     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L2a
            r5 = r8
            goto L63
        L2a:
            r0 = 1
            r8.f = r0     // Catch: java.lang.Throwable -> L65
            d21 r1 = defpackage.d21.a()     // Catch: java.lang.SecurityException -> L4a java.lang.Throwable -> L65
            android.content.Context r2 = r8.a     // Catch: java.lang.SecurityException -> L4a java.lang.Throwable -> L65
            android.content.Intent r4 = r8.b     // Catch: java.lang.SecurityException -> L4a java.lang.Throwable -> L65
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.SecurityException -> L4a java.lang.Throwable -> L65
            java.lang.String r3 = r0.getName()     // Catch: java.lang.SecurityException -> L4a java.lang.Throwable -> L65
            r7 = 0
            r6 = 65
            r5 = r8
            boolean r8 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L48 java.lang.SecurityException -> L4b
            if (r8 == 0) goto L4b
            goto L63
        L48:
            r0 = move-exception
            goto L67
        L4a:
            r5 = r8
        L4b:
            r8 = 0
            r5.f = r8     // Catch: java.lang.Throwable -> L48
            java.util.ArrayDeque r8 = r5.d     // Catch: java.lang.Throwable -> L48
        L50:
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L63
            java.lang.Object r0 = r8.poll()     // Catch: java.lang.Throwable -> L48
            i39 r0 = (defpackage.i39) r0     // Catch: java.lang.Throwable -> L48
            z18 r0 = r0.b     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r0.c(r1)     // Catch: java.lang.Throwable -> L48
            goto L50
        L63:
            monitor-exit(r5)
            return
        L65:
            r0 = move-exception
            r5 = r8
        L67:
            r8 = r0
            r0 = r8
            goto L71
        L6a:
            r0 = move-exception
            r5 = r8
            r8 = r0
            goto L71
        L6e:
            r5 = r8
            monitor-exit(r5)
            return
        L71:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r0
        L73:
            r0 = move-exception
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j39.a():void");
    }

    public final synchronized fb9 b(Intent intent) {
        i39 i39Var;
        i39Var = new i39(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        i39Var.b.a.b(scheduledThreadPoolExecutor, new j78(scheduledThreadPoolExecutor.schedule(new fl6(i39Var, (byte) 16), 20L, TimeUnit.SECONDS), (byte) 5));
        this.d.add(i39Var);
        a();
        return i39Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof h39) {
                this.e = (h39) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((i39) arrayDeque.poll()).b.c(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
