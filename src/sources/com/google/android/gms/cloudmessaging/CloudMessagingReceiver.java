package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import defpackage.av0;
import defpackage.e25;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public abstract int a(Context context, av0 av0Var);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new e25("firebase-iid-executor")));
                    a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: ma9
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                CloudMessagingReceiver cloudMessagingReceiver = this.X;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iA = 500;
                    if (intent3 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent3.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent3.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if (Objects.equals(intent3.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                            cloudMessagingReceiver.b(extras);
                            iA = -1;
                        }
                    } else if (intent2.getExtras() != null) {
                        av0 av0Var = new av0(intent2);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (CloudMessagingReceiver.class) {
                            try {
                                SoftReference softReference2 = CloudMessagingReceiver.b;
                                executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e25("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    CloudMessagingReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new gc4(context2, av0Var, countDownLatch));
                        iA = cloudMessagingReceiver.a(context2, av0Var);
                        try {
                            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            "Message ack failed: ".concat(e.toString());
                        }
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
            }
        });
    }

    public void b(Bundle bundle) {
    }
}
