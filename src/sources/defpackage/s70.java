package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s70 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDragHandleView) this.b).j0;
                if (bottomSheetBehavior == null || !bottomSheetBehavior.J) {
                    return super.onDoubleTap(motionEvent);
                }
                bottomSheetBehavior.N(5);
                return true;
            default:
                motionEvent.getClass();
                motionEvent.getX();
                motionEvent.getY();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return ((BottomSheetDragHandleView) this.b).isClickable();
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((BottomSheetDragHandleView) this.b).performLongClick(motionEvent.getX(), motionEvent.getY());
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.b;
                int i = BottomSheetDragHandleView.s0;
                return bottomSheetDragHandleView.c();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }
}
