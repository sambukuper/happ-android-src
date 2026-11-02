package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jc3 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ m70 a;

    public jc3(m70 m70Var) {
        this.a = m70Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        m70 m70Var = this.a;
        lb lbVar = (lb) m70Var.d;
        if (!m70Var.c) {
            int i2 = m70Var.b;
            if (i2 == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    i = f > 0.0f ? 1 : 2;
                    AndroidComposeView androidComposeView = lbVar.Y;
                    Class cls = AndroidComposeView.J1;
                    ((gh2) androidComposeView.getFocusOwner()).g(i, false);
                    return true;
                }
            } else if (i2 == 2 && Math.abs(f2) > Math.abs(f)) {
                i = f2 > 0.0f ? 1 : 2;
                AndroidComposeView androidComposeView2 = lbVar.Y;
                Class cls2 = AndroidComposeView.J1;
                ((gh2) androidComposeView2.getFocusOwner()).g(i, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
