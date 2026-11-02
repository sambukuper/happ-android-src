package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.eb9;
import defpackage.lm2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ d Y;
    public final /* synthetic */ Activity Z;

    public /* synthetic */ b(d dVar, Activity activity, byte b) {
        this.X = b;
        this.Y = dVar;
        this.Z = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Activity activity = this.Z;
        d dVar = this.Y;
        switch (b) {
            case 0:
                eb9 eb9Var = ((FrameMetricsAggregator) ((io.sentry.util.g) dVar.a).a()).a;
                eb9Var.getClass();
                if (eb9.i0 == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    eb9.i0 = handlerThread;
                    handlerThread.start();
                    eb9.j0 = new Handler(eb9.i0.getLooper());
                }
                for (int i = 0; i <= 8; i++) {
                    SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) eb9Var.Z;
                    if (sparseIntArrayArr[i] == null && (eb9Var.Y & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                activity.getWindow().addOnFrameMetricsAvailableListener((lm2) eb9Var.g0, eb9.j0);
                ((ArrayList) eb9Var.f0).add(new WeakReference(activity));
                break;
            default:
                eb9 eb9Var2 = ((FrameMetricsAggregator) ((io.sentry.util.g) dVar.a).a()).a;
                ArrayList<WeakReference> arrayList = (ArrayList) eb9Var2.f0;
                for (WeakReference weakReference : arrayList) {
                    if (weakReference.get() == activity) {
                        arrayList.remove(weakReference);
                        activity.getWindow().removeOnFrameMetricsAvailableListener((lm2) eb9Var2.g0);
                        break;
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((lm2) eb9Var2.g0);
                break;
        }
    }
}
