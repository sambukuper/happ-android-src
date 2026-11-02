package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xi3 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ yi3 b;

    public xi3(yi3 yi3Var) {
        this.b = yi3Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        yi3 yi3Var;
        View viewM;
        l lVarM;
        if (!this.a || (viewM = (yi3Var = this.b).m(motionEvent)) == null || (lVarM = yi3Var.r.M(viewM)) == null) {
            return;
        }
        y42 y42Var = yi3Var.m;
        RecyclerView recyclerView = yi3Var.r;
        byte b = y42Var.b;
        if ((y42.b(b | (b << 8), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = yi3Var.l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                yi3Var.d = x;
                yi3Var.e = y;
                yi3Var.i = 0.0f;
                yi3Var.h = 0.0f;
                yi3Var.q(lVarM, 2);
            }
        }
    }
}
