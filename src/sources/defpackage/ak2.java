package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ak2 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float X;
    public final int Y;
    public final int Z;
    public final View f0;
    public zj2 g0;
    public zj2 h0;
    public boolean i0;
    public int j0;
    public final int[] k0 = new int[2];

    public ak2(View view) {
        this.f0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.X = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.Y = tapTimeout;
        this.Z = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        zj2 zj2Var = this.h0;
        View view = this.f0;
        if (zj2Var != null) {
            view.removeCallbacks(zj2Var);
        }
        zj2 zj2Var2 = this.g0;
        if (zj2Var2 != null) {
            view.removeCallbacks(zj2Var2);
        }
    }

    public abstract v87 b();

    public abstract boolean c();

    public boolean d() {
        v87 v87VarB = b();
        if (v87VarB == null || !v87VarB.a()) {
            return true;
        }
        v87VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        qw1 qw1VarJ;
        boolean z2 = this.i0;
        View view2 = this.f0;
        if (z2) {
            v87 v87VarB = b();
            if (v87VarB != null && v87VarB.a() && (qw1VarJ = v87VarB.j()) != null && qw1VarJ.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.k0;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                qw1VarJ.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = qw1VarJ.b(motionEventObtainNoHistory, this.j0);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z3) {
                    z = true;
                } else if (d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.j0 = motionEvent.getPointerId(0);
                    zj2 zj2Var = this.g0;
                    if (zj2Var == null) {
                        zj2Var = new zj2(this, (byte) 0);
                        this.g0 = zj2Var;
                    }
                    view2.postDelayed(zj2Var, this.Y);
                    zj2 zj2Var2 = this.h0;
                    if (zj2Var2 == null) {
                        zj2Var2 = new zj2(this, (byte) 1);
                        this.h0 = zj2Var2;
                    }
                    view2.postDelayed(zj2Var2, this.Z);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.j0);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.X;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.i0 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i0 = false;
        this.j0 = -1;
        zj2 zj2Var = this.g0;
        if (zj2Var != null) {
            this.f0.removeCallbacks(zj2Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
