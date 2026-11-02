package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.b9;
import defpackage.bb9;
import defpackage.bq7;
import defpackage.dp1;
import defpackage.e25;
import defpackage.eb9;
import defpackage.f08;
import defpackage.fb9;
import defpackage.fu6;
import defpackage.g28;
import defpackage.gj4;
import defpackage.jn0;
import defpackage.km4;
import defpackage.mb2;
import defpackage.mf1;
import defpackage.na9;
import defpackage.nb2;
import defpackage.o61;
import defpackage.qb2;
import defpackage.r41;
import defpackage.sa2;
import defpackage.sb2;
import defpackage.sc;
import defpackage.sz7;
import defpackage.u5;
import defpackage.vt;
import defpackage.vy0;
import defpackage.w06;
import defpackage.w45;
import defpackage.wa;
import defpackage.xa2;
import defpackage.xd6;
import defpackage.y45;
import defpackage.y5;
import defpackage.yq6;
import defpackage.z18;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static y45 l;
    public static w06 m = new vy0((byte) 5);
    public static ScheduledThreadPoolExecutor n;
    public final xa2 a;
    public final Context b;
    public final fu6 c;
    public final y5 d;
    public final xd6 e;
    public final sa2 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final r41 i;
    public final nb2 j;
    public boolean k;

    public FirebaseMessaging(final xa2 xa2Var, w06 w06Var, w06 w06Var2, final nb2 nb2Var, w06 w06Var3, bq7 bq7Var) {
        xa2Var.a();
        final r41 r41Var = new r41(xa2Var.a);
        fu6 fu6Var = new fu6(xa2Var, r41Var, w06Var, w06Var2, nb2Var);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new e25("Firebase-Messaging-Task"));
        final byte b = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new e25("Firebase-Messaging-Init"));
        final byte b2 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e25("Firebase-Messaging-File-Io"));
        this.k = false;
        m = w06Var3;
        this.a = xa2Var;
        this.f = new sa2(this, bq7Var);
        xa2Var.a();
        final Context context = xa2Var.a;
        this.b = context;
        u5 u5Var = new u5((byte) 1);
        this.i = r41Var;
        this.c = fu6Var;
        this.j = nb2Var;
        y5 y5Var = new y5(context, xa2Var, nb2Var, fu6Var, r41Var);
        this.d = y5Var;
        this.e = new xd6(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        xa2Var.a();
        Context context2 = xa2Var.a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(u5Var);
        } else {
            Objects.toString(context2);
        }
        if (y5Var.R()) {
            qb2 qb2Var = new qb2(this);
            mb2 mb2Var = (mb2) nb2Var;
            synchronized (mb2Var) {
                mb2Var.j.add(qb2Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: rb2
            public final /* synthetic */ FirebaseMessaging Y;

            {
                this.Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                fb9 fb9VarK;
                int i;
                byte b3 = b2;
                FirebaseMessaging firebaseMessaging = this.Y;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.h() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.h(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        wa.u(context3);
                        fu6 fu6Var2 = firebaseMessaging.c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesN = km4.N(context3);
                            if (!sharedPreferencesN.contains("proxy_retention") || sharedPreferencesN.getBoolean("proxy_retention", false) != zG) {
                                yq6 yq6Var = (yq6) fu6Var2.f0;
                                if (yq6Var.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    eb9 eb9VarN = eb9.n(yq6Var.b);
                                    synchronized (eb9VarN) {
                                        i = eb9VarN.Y;
                                        eb9VarN.Y = i + 1;
                                    }
                                    fb9VarK = eb9VarN.o(new bb9(i, 4, bundle, (byte) 0));
                                } else {
                                    fb9VarK = g28.k(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                fb9VarK.c(new nd((byte) 2), new ab5() { // from class: d16
                                    @Override // defpackage.ab5
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor editorEdit = km4.N(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new e25("Firebase-Messaging-Topics-Io"));
        g28.d(scheduledThreadPoolExecutor2, new Callable() { // from class: pc8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                oc8 oc8Var;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                r41 r41Var2 = r41Var;
                xa2 xa2Var2 = xa2Var;
                FirebaseMessaging firebaseMessaging = this;
                nb2 nb2Var2 = nb2Var;
                synchronized (oc8.class) {
                    try {
                        WeakReference weakReference = oc8.b;
                        oc8Var = weakReference != null ? (oc8) weakReference.get() : null;
                        if (oc8Var == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            oc8 oc8Var2 = new oc8();
                            synchronized (oc8Var2) {
                                oc8Var2.a = f63.n(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            oc8.b = new WeakReference(oc8Var2);
                            oc8Var = oc8Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zv7 zv7Var = new zv7();
                zv7Var.X = nb2Var2;
                zv7Var.Y = xa2Var2;
                zv7Var.Z = firebaseMessaging;
                return new qc8(r41Var2, oc8Var, zv7Var, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new sb2(this, b2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: rb2
            public final /* synthetic */ FirebaseMessaging Y;

            {
                this.Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                fb9 fb9VarK;
                int i;
                byte b3 = b;
                FirebaseMessaging firebaseMessaging = this.Y;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.h() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.k) {
                                    firebaseMessaging.h(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.b;
                        wa.u(context3);
                        fu6 fu6Var2 = firebaseMessaging.c;
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesN = km4.N(context3);
                            if (!sharedPreferencesN.contains("proxy_retention") || sharedPreferencesN.getBoolean("proxy_retention", false) != zG) {
                                yq6 yq6Var = (yq6) fu6Var2.f0;
                                if (yq6Var.c.w() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    eb9 eb9VarN = eb9.n(yq6Var.b);
                                    synchronized (eb9VarN) {
                                        i = eb9VarN.Y;
                                        eb9VarN.Y = i + 1;
                                    }
                                    fb9VarK = eb9VarN.o(new bb9(i, 4, bundle, (byte) 0));
                                } else {
                                    fb9VarK = g28.k(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                fb9VarK.c(new nd((byte) 2), new ab5() { // from class: d16
                                    @Override // defpackage.ab5
                                    public final void b(Object obj) {
                                        SharedPreferences.Editor editorEdit = km4.N(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.f();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new e25("TAG"));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized y45 c(Context context) {
        y45 y45Var;
        y45Var = l;
        if (y45Var == null) {
            y45Var = new y45(context);
            l = y45Var;
        }
        return y45Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(xa2 xa2Var) {
        FirebaseMessaging firebaseMessaging;
        xa2Var.a();
        firebaseMessaging = (FirebaseMessaging) xa2Var.d.a(FirebaseMessaging.class);
        w45.t(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        fb9 fb9VarE;
        gj4 gj4VarE = e();
        if (!i(gj4VarE)) {
            return (String) gj4VarE.Y;
        }
        String strG = r41.g(this.a);
        xd6 xd6Var = this.e;
        synchronized (xd6Var) {
            fb9VarE = (fb9) ((vt) xd6Var.Z).get(strG);
            if (fb9VarE == null) {
                y5 y5Var = this.d;
                fb9 fb9VarE2 = y5Var.Y().e(Executors.newSingleThreadExecutor(new e25("Firebase-Messaging-Task")), new o61(y5Var, (byte) 9));
                ThreadPoolExecutor threadPoolExecutor = this.h;
                mf1 mf1Var = new mf1((Object) this, (Object) strG, (Object) gj4VarE, (byte) 1);
                fb9 fb9Var = new fb9();
                fb9VarE2.b.r(new na9(threadPoolExecutor, mf1Var, fb9Var));
                fb9VarE2.n();
                fb9VarE = fb9Var.e((Executor) xd6Var.Y, new jn0(xd6Var, strG, (byte) 10));
                ((vt) xd6Var.Z).put(strG, fb9VarE);
            }
        }
        try {
            return (String) g28.b(fb9VarE);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final fb9 d() {
        if (this.d.R()) {
            return g28.k(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
        }
        z18 z18Var = new z18();
        this.g.execute(new sc(this, z18Var, (byte) 24));
        return z18Var.a;
    }

    public final gj4 e() {
        gj4 gj4VarG;
        y45 y45VarC = c(this.b);
        xa2 xa2Var = this.a;
        xa2Var.a();
        String strC = "[DEFAULT]".equals(xa2Var.b) ? _UrlKt.FRAGMENT_ENCODE_SET : xa2Var.c();
        String strG = r41.g(this.a);
        synchronized (y45VarC) {
            gj4VarG = gj4.g(((SharedPreferences) y45VarC.X).getString(strC + "|T|" + strG + "|*", null));
        }
        return gj4VarG;
    }

    public final void f() {
        fb9 fb9VarK;
        int i;
        yq6 yq6Var = (yq6) this.c.f0;
        byte b = 1;
        if (yq6Var.c.w() >= 241100000) {
            eb9 eb9VarN = eb9.n(yq6Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (eb9VarN) {
                i = eb9VarN.Y;
                eb9VarN.Y = i + 1;
            }
            fb9VarK = eb9VarN.o(new bb9(i, 5, bundle, (byte) 1)).d(dp1.f0, f08.Z);
        } else {
            fb9VarK = g28.k(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        fb9VarK.c(this.g, new sb2(this, b));
    }

    public final boolean g() {
        Context context = this.b;
        wa.u(context);
        if (!wa.x(context)) {
            return false;
        }
        xa2 xa2Var = this.a;
        xa2Var.a();
        if (xa2Var.d.a(b9.class) != null) {
            return true;
        }
        return km4.w() && m != null;
    }

    public final synchronized void h(long j) {
        b(new sz7(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.k = true;
    }

    public final boolean i(gj4 gj4Var) {
        String str;
        if (gj4Var != null) {
            String str2 = (String) gj4Var.Y;
            String strF = this.i.f();
            if (System.currentTimeMillis() <= gj4Var.X + 604800000 && strF.equals((String) gj4Var.Z)) {
                if (this.d.R()) {
                    try {
                        str = (String) g28.b(((mb2) this.j).c());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                }
                if (str2.length() > 22) {
                    return false;
                }
            }
        }
        return true;
    }
}
