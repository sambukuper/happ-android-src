package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 implements View.OnTouchListener {
    public final Dialog X;
    public final int Y;
    public final int Z;
    public final int f0;

    public ee3(Dialog dialog, Rect rect) {
        this.X = dialog;
        this.Y = rect.left;
        this.Z = rect.top;
        this.f0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.Y;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.Z;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.f0) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.X.onTouchEvent(motionEventObtain);
    }
}
