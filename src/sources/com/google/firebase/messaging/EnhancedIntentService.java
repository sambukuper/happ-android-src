package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.e25;
import defpackage.fb9;
import defpackage.h39;
import defpackage.i21;
import defpackage.j0;
import defpackage.jn0;
import defpackage.nd;
import defpackage.vk1;
import defpackage.z18;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int h0 = 0;
    public final ExecutorService X;
    public h39 Y;
    public final Object Z;
    public int f0;
    public int g0;

    public EnhancedIntentService() {
        e25 e25Var = new e25("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e25Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.X = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.Z = new Object();
        this.g0 = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            i21.p(intent);
        }
        synchronized (this.Z) {
            try {
                int i = this.g0 - 1;
                this.g0 = i;
                if (i == 0) {
                    stopSelfResult(this.f0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        h39 h39Var;
        h39Var = this.Y;
        if (h39Var == null) {
            h39Var = new h39(new vk1(this, (byte) 8));
            this.Y = h39Var;
        }
        return h39Var;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.X.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.Z) {
            this.f0 = i2;
            this.g0++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        z18 z18Var = new z18();
        this.X.execute(new j0((Object) this, (Object) intentB, (Object) z18Var, (byte) 12));
        fb9 fb9Var = z18Var.a;
        if (fb9Var.h()) {
            a(intent);
            return 2;
        }
        fb9Var.b(new nd((byte) 2), new jn0(this, intent, (byte) 3));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
