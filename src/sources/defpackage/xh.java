package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xh implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ yh X;

    public xh(yh yhVar) {
        this.X = yhVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.X.f0.removeCallbacks(this);
        this.X.d1();
        yh yhVar = this.X;
        synchronized (yhVar.g0) {
            if (yhVar.l0) {
                yhVar.l0 = false;
                ArrayList arrayList = yhVar.i0;
                yhVar.i0 = yhVar.j0;
                yhVar.j0 = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.d1();
        yh yhVar = this.X;
        synchronized (yhVar.g0) {
            if (yhVar.i0.isEmpty()) {
                yhVar.Z.removeFrameCallback(this);
                yhVar.l0 = false;
            }
        }
    }
}
