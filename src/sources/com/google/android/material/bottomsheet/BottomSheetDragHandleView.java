package com.google.android.material.bottomsheet;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import defpackage.a4;
import defpackage.cw8;
import defpackage.h56;
import defpackage.mr4;
import defpackage.o56;
import defpackage.o61;
import defpackage.o70;
import defpackage.r20;
import defpackage.s70;
import defpackage.u26;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int s0 = o56.Widget_Material3_BottomSheet_DragHandle;
    public final AccessibilityManager i0;
    public BottomSheetBehavior j0;
    public final GestureDetector k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final String o0;
    public final String p0;
    public final String q0;
    public final o70 r0;

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(mr4.b(context, attributeSet, i, s0), attributeSet, i);
        this.m0 = false;
        this.n0 = false;
        this.o0 = getResources().getString(h56.bottomsheet_action_expand_description);
        this.p0 = getResources().getString(h56.bottomsheet_action_half_expand_description);
        this.q0 = getResources().getString(h56.bottomsheet_action_collapse_description);
        this.r0 = new o70(this, (byte) 1);
        s70 s70Var = new s70(this, (byte) 0);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(getResources().getString(h56.bottomsheet_drag_handle_content_description));
        }
        this.k0 = new GestureDetector(context2, s70Var, new Handler(Looper.getMainLooper()));
        this.i0 = (AccessibilityManager) context2.getSystemService("accessibility");
        cw8.n(this, new r20(this, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002c A[RETURN] */
    private int getNextState() {
        BottomSheetBehavior bottomSheetBehavior = this.j0;
        if (bottomSheetBehavior != null) {
            boolean z = bottomSheetBehavior.b;
            int i = bottomSheetBehavior.P;
            if (i == 3) {
                if (z) {
                    if (bottomSheetBehavior.z()) {
                        return 4;
                    }
                }
                return 6;
            }
            if (i != 4) {
                if (i == 6) {
                    if (!this.l0) {
                        if (bottomSheetBehavior.z()) {
                            return 4;
                        }
                    }
                }
            } else if (!z) {
                return 6;
            }
            return 3;
        }
        return -1;
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.j0;
        o70 o70Var = this.r0;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.c0.remove(o70Var);
            this.j0.K(null);
            this.j0.a0 = null;
        }
        this.j0 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K(this);
            BottomSheetBehavior bottomSheetBehavior3 = this.j0;
            bottomSheetBehavior3.getClass();
            bottomSheetBehavior3.a0 = new WeakReference(this);
            d(this.j0.P);
            ArrayList arrayList = this.j0.c0;
            if (!arrayList.contains(o70Var)) {
                arrayList.add(o70Var);
            }
        }
        setClickable(this.j0 != null);
    }

    public final boolean c() {
        if (this.j0 == null) {
            return false;
        }
        int nextState = getNextState();
        if (nextState == -1) {
            return true;
        }
        this.j0.N(nextState);
        return true;
    }

    public final void d(int i) {
        String str;
        if (i == 4) {
            this.l0 = true;
        } else if (i == 3) {
            this.l0 = false;
        }
        int nextState = getNextState();
        if (nextState == 3) {
            str = this.o0;
        } else if (nextState != 4) {
            str = nextState != 6 ? null : this.p0;
        } else {
            str = this.q0;
        }
        cw8.l(this, a4.g, str, new o61(this, (byte) 3));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof b) {
                CoordinatorLayout.Behavior behavior = ((b) layoutParams).a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.i0;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.i0;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 23 || i == 66) {
            return this.n0 ? performClick() : c();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.n0 || this.m0) ? super.onTouchEvent(motionEvent) : this.k0.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.n0 = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.m0 = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.bottomSheetDragHandleStyle);
    }
}
