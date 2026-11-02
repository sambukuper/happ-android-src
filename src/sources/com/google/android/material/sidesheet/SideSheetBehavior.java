package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.a4;
import defpackage.a77;
import defpackage.b84;
import defpackage.bt;
import defpackage.c0;
import defpackage.c82;
import defpackage.cw8;
import defpackage.gr4;
import defpackage.h56;
import defpackage.hr4;
import defpackage.i70;
import defpackage.ie2;
import defpackage.iq4;
import defpackage.ir4;
import defpackage.j00;
import defpackage.m70;
import defpackage.mw8;
import defpackage.o56;
import defpackage.oi0;
import defpackage.om0;
import defpackage.p61;
import defpackage.pc6;
import defpackage.rk;
import defpackage.u4;
import defpackage.v56;
import defpackage.wf6;
import defpackage.wl7;
import defpackage.y87;
import defpackage.ys0;
import defpackage.z4;
import defpackage.z67;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements iq4 {
    public static final int x = h56.side_sheet_accessibility_pane_title;
    public static final int y = o56.Widget_Material3_SideSheet;
    public wl7 a;
    public final gr4 b;
    public final ColorStateList c;
    public final a77 d;
    public final m70 e;
    public final float f;
    public final boolean g;
    public int h;
    public mw8 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public ir4 t;
    public int u;
    public final LinkedHashSet v;
    public final i70 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new m70(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new i70(this, (byte) 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(v56.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = ys0.x(context, typedArrayObtainStyledAttributes, v56.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = a77.g(context, attributeSet, 0, y).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(v56.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        a77 a77Var = this.d;
        if (a77Var != null) {
            gr4 gr4Var = new gr4(a77Var);
            this.b = gr4Var;
            gr4Var.p(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(v56.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(v56.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.iq4
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        ir4 ir4Var = this.t;
        if (ir4Var == null) {
            return;
        }
        j00 j00Var = ir4Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        ir4Var.f = null;
        int i2 = 5;
        if (j00Var == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        wl7 wl7Var = this.a;
        if (wl7Var != null && wl7Var.M() != 0) {
            i2 = 3;
        }
        z4 z4Var = new z4(this, (byte) 7);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iD = this.a.D(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: x87
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = SideSheetBehavior.x;
                    this.a.a.j0(marginLayoutParams, rk.c(iD, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = ir4Var.b;
        boolean z = j00Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new c82((byte) 1));
        objectAnimatorOfFloat.setDuration(rk.c(ir4Var.c, j00Var.c, ir4Var.d));
        objectAnimatorOfFloat.addListener(new hr4(ir4Var, z, i2));
        objectAnimatorOfFloat.addListener(z4Var);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.iq4
    public final void b(j00 j00Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ir4 ir4Var = this.t;
        if (ir4Var == null) {
            return;
        }
        wl7 wl7Var = this.a;
        int i = (wl7Var == null || wl7Var.M() == 0) ? 5 : 3;
        j00 j00Var2 = ir4Var.f;
        ir4Var.f = j00Var;
        if (j00Var2 != null) {
            ir4Var.a(j00Var.c, j00Var.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.j0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.iq4
    public final void c(j00 j00Var) {
        ir4 ir4Var = this.t;
        if (ir4Var == null) {
            return;
        }
        ir4Var.f = j00Var;
    }

    @Override // defpackage.iq4
    public final void d() {
        ir4 ir4Var = this.t;
        if (ir4Var == null) {
            return;
        }
        View view = ir4Var.b;
        j00 j00Var = ir4Var.f;
        ir4Var.f = null;
        if (j00Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(ir4Var.e);
        animatorSet.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(b bVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        mw8 mw8Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && cw8.f(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTrackerObtain = this.s;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.s = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (mw8Var = this.i) == null || !mw8Var.q(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iK;
        int i2;
        View viewFindViewById;
        byte b = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        gr4 gr4Var = this.b;
        byte b2 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new ir4(view);
            if (gr4Var != null) {
                view.setBackground(gr4Var);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                gr4Var.s(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = cw8.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i3 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i3) {
                view.setVisibility(i3);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (cw8.f(view) == null) {
                cw8.o(view, view.getResources().getString(x));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((b) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        wl7 wl7Var = this.a;
        if (wl7Var == null || wl7Var.M() != i4) {
            b bVar = null;
            a77 a77Var = this.d;
            if (i4 == 0) {
                this.a = new b84(this, b);
                if (a77Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof b)) {
                        bVar = (b) view3.getLayoutParams();
                    }
                    if (bVar == null || ((ViewGroup.MarginLayoutParams) bVar).rightMargin <= 0) {
                        z67 z67VarK = a77Var.k();
                        z67VarK.f = new c0(0.0f);
                        z67VarK.g = new c0(0.0f);
                        a77 a77VarA = z67VarK.a();
                        if (gr4Var != null) {
                            gr4Var.setShapeAppearanceModel(a77VarA);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    bt.q(ie2.h("Invalid sheet edge position value: ", i4, ". Must be 0 or 1."));
                    return false;
                }
                this.a = new b84(this, b2);
                if (a77Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof b)) {
                        bVar = (b) view2.getLayoutParams();
                    }
                    if (bVar == null || ((ViewGroup.MarginLayoutParams) bVar).leftMargin <= 0) {
                        z67 z67VarK2 = a77Var.k();
                        z67VarK2.e = new c0(0.0f);
                        z67VarK2.h = new c0(0.0f);
                        a77 a77VarA2 = z67VarK2.a();
                        if (gr4Var != null) {
                            gr4Var.setShapeAppearanceModel(a77VarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new mw8(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iK2 = this.a.K(view);
        coordinatorLayout.o(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.L(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.p(marginLayoutParams) : 0;
        int i5 = this.h;
        if (i5 == 1 || i5 == 2) {
            iK = iK2 - this.a.K(view);
        } else if (i5 == 3) {
            iK = 0;
        } else {
            if (i5 != 5) {
                om0.e(this.h, "Unexpected value: ");
                return false;
            }
            iK = this.a.H();
        }
        WeakHashMap weakHashMap2 = cw8.a;
        view.offsetLeftAndRight(iK);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                c2.m();
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(View view, Parcelable parcelable) {
        int i = ((y87) parcelable).Z;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new y87(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        VelocityTracker velocityTrackerObtain = this.s;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.s = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.j && x()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            mw8 mw8Var = this.i;
            if (fAbs > mw8Var.b) {
                mw8Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(oi0.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.p.get();
        wf6 wf6Var = new wf6(this, i, (byte) 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(wf6Var);
        } else {
            wf6Var.run();
        }
    }

    public final void w(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        z();
    }

    public final boolean x() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void y(View view, int i, boolean z) {
        int iG;
        if (i == 3) {
            iG = this.a.G();
        } else {
            if (i != 5) {
                bt.q(pc6.j(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iG = this.a.H();
        }
        mw8 mw8Var = this.i;
        if (mw8Var == null || (!z ? mw8Var.r(view, iG, view.getTop()) : mw8Var.p(iG, view.getTop()))) {
            w(i);
        } else {
            w(2);
            this.e.d(i);
        }
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        cw8.k(view, 262144);
        cw8.i(view, 0);
        cw8.k(view, 1048576);
        cw8.i(view, 0);
        final int i = 5;
        if (this.h != 5) {
            cw8.l(view, a4.m, null, new u4() { // from class: w87
                @Override // defpackage.u4
                public final boolean f(View view2) {
                    int i2 = SideSheetBehavior.x;
                    this.X.v(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            cw8.l(view, a4.l, null, new u4() { // from class: w87
                @Override // defpackage.u4
                public final boolean f(View view2) {
                    int i3 = SideSheetBehavior.x;
                    this.X.v(i2);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior() {
        this.e = new m70(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new i70(this, (byte) 1);
    }
}
