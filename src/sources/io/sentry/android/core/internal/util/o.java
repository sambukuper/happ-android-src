package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ t Y;
    public final /* synthetic */ Window Z;

    public /* synthetic */ o(t tVar, Window window, byte b) {
        this.X = b;
        this.Y = tVar;
        this.Z = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                t tVar = this.Y;
                Window window = this.Z;
                if (tVar.Y.add(window)) {
                    try {
                        d dVar = tVar.k0;
                        p pVar = tVar.l0;
                        Handler handler = tVar.f0;
                        dVar.getClass();
                        if (pVar != null) {
                            window.addOnFrameMetricsAvailableListener(pVar, handler);
                        }
                    } catch (Throwable th) {
                        tVar.Z.e(s5.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                break;
            default:
                t tVar2 = this.Y;
                Window window2 = this.Z;
                try {
                    if (tVar2.Y.remove(window2)) {
                        d dVar2 = tVar2.k0;
                        p pVar2 = tVar2.l0;
                        dVar2.getClass();
                        if (pVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(pVar2);
                        }
                    }
                } catch (Throwable th2) {
                    tVar2.Z.e(s5.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                }
                break;
        }
    }
}
