package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zj2 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ak2 Y;

    public /* synthetic */ zj2(ak2 ak2Var, byte b) {
        this.X = b;
        this.Y = ak2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ak2 ak2Var = this.Y;
        switch (b) {
            case 0:
                ViewParent parent = ak2Var.f0.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ak2Var.a();
                View view = ak2Var.f0;
                if (view.isEnabled() && !view.isLongClickable() && ak2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ak2Var.i0 = true;
                    break;
                }
                break;
        }
    }
}
