package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.b;
import defpackage.a4;
import defpackage.a77;
import defpackage.ay8;
import defpackage.bt;
import defpackage.c19;
import defpackage.c82;
import defpackage.cw8;
import defpackage.g70;
import defpackage.ge3;
import defpackage.gr4;
import defpackage.h56;
import defpackage.h70;
import defpackage.i70;
import defpackage.iq4;
import defpackage.iw8;
import defpackage.j00;
import defpackage.j36;
import defpackage.j70;
import defpackage.k70;
import defpackage.l70;
import defpackage.m70;
import defpackage.mq4;
import defpackage.mw8;
import defpackage.o56;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.pq;
import defpackage.rk;
import defpackage.s3;
import defpackage.t3;
import defpackage.u26;
import defpackage.uv8;
import defpackage.v56;
import defpackage.vv8;
import defpackage.w19;
import defpackage.xd6;
import defpackage.ys0;
import defpackage.z4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements iq4 {
    public static final int p0 = o56.Widget_Design_BottomSheet_Modal;
    public boolean A;
    public final m70 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public mw8 Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public WeakReference Z;
    public final int a;
    public WeakReference a0;
    public boolean b;
    public final ArrayList b0;
    public final float c;
    public final ArrayList c0;
    public final int d;
    public VelocityTracker d0;
    public final boolean e;
    public mq4 e0;
    public int f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public WeakReference h0;
    public final int i;
    public boolean i0;
    public final gr4 j;
    public HashMap j0;
    public final ColorStateList k;
    public final SparseIntArray k0;
    public final int l;
    public final SparseIntArray l0;
    public final int m;
    public final SparseIntArray m0;
    public int n;
    public final Rect n0;
    public final boolean o;
    public final i70 o0;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final a77 z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        byte b = 0;
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new m70(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.g0 = -1;
        this.k0 = new SparseIntArray();
        this.l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.n0 = new Rect();
        this.o0 = new i70(this, b);
        this.i = context.getResources().getDimensionPixelSize(j36.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(v56.BottomSheetBehavior_Layout_backgroundTint)) {
            this.k = ys0.x(context, typedArrayObtainStyledAttributes, v56.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.z = a77.g(context, attributeSet, u26.bottomSheetStyle, p0).a();
        }
        a77 a77Var = this.z;
        if (a77Var != null) {
            gr4 gr4Var = new gr4(a77Var);
            this.j = gr4Var;
            gr4Var.p(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new g70(this, b));
        this.I = typedArrayObtainStyledAttributes.getDimension(v56.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(v56.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(v56.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            M(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            M(i);
        }
        L(typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.o = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.b != z) {
            this.b = z;
            if (this.Y != null) {
                w();
            }
            O((this.b && this.P == 6) ? 3 : this.P);
            T(this.P, true);
            R();
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.L = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.M = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true);
        this.a = typedArrayObtainStyledAttributes.getInt(v56.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(v56.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            bt.q("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(v56.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(v56.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset < 0) {
                bt.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            T(this.P, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                bt.q("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i2;
            T(this.P, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(v56.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.e = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_multipleScrollingChildrenSupported, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_behavior_autoExpandOnRequestChildRectangleOffscreen, true);
        this.p = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.v = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.y = typedArrayObtainStyledAttributes.getBoolean(v56.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View C(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewC = C(viewGroup.getChildAt(i));
            if (viewC != null) {
                return viewC;
            }
        }
        return null;
    }

    public static BottomSheetBehavior D(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            bt.q("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((b) layoutParams).a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        bt.q("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int E(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(View view, int i) {
        if (view == null) {
            return;
        }
        cw8.k(view, 1048576);
        cw8.i(view, 0);
        cw8.k(view, 524288);
        cw8.i(view, 0);
        cw8.k(view, 262144);
        cw8.i(view, 0);
        SparseIntArray sparseIntArray = this.l0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            cw8.k(view, i2);
            cw8.i(view, 0);
            sparseIntArray.delete(i);
        }
        SparseIntArray sparseIntArray2 = this.k0;
        int i3 = sparseIntArray2.get(i, -1);
        if (i3 != -1) {
            cw8.k(view, i3);
            cw8.i(view, 0);
            sparseIntArray2.delete(i);
        }
        SparseIntArray sparseIntArray3 = this.m0;
        int i4 = sparseIntArray3.get(i, -1);
        if (i4 != -1) {
            cw8.k(view, i4);
            cw8.i(view, 0);
            sparseIntArray3.delete(i);
        }
    }

    public final void B(int i) {
        View view = (View) this.Y.get();
        if (view != null) {
            ArrayList arrayList = this.c0;
            if (arrayList.isEmpty()) {
                return;
            }
            if (i <= this.H) {
                F();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((k70) arrayList.get(i2)).b(view);
            }
        }
    }

    public final int F() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int G(int i) {
        if (i == 3) {
            return F();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        bt.q(pc6.j(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean H() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(View view) {
        Iterator it = this.b0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void J(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.b0.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                J(viewGroup.getChildAt(i));
            }
        }
    }

    public final void K(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.Z) == null) {
            this.Z = new WeakReference(bottomSheetDragHandleView);
            S(bottomSheetDragHandleView, 1);
        } else {
            A((View) weakReference.get(), 1);
            this.Z = null;
        }
    }

    public final void L(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                N(4);
            }
            R();
        }
    }

    public final void M(int i) {
        boolean z = this.g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!z && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        V();
    }

    public final void N(int i) {
        byte b = 1;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(oi0.p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.J || i != 5) {
            int i2 = (i == 6 && this.b && G(i) <= this.E) ? 3 : i;
            WeakReference weakReference = this.Y;
            if (weakReference == null || weakReference.get() == null) {
                O(i);
                return;
            }
            View view = (View) this.Y.get();
            pq pqVar = new pq(b, i2, this, view);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(pqVar);
            } else {
                pqVar.run();
            }
        }
    }

    public final void O(int i) {
        View view;
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            U(true);
        } else if (i == 6 || i == 5 || i == 4) {
            U(false);
        }
        T(i, true);
        while (true) {
            ArrayList arrayList = this.c0;
            if (i2 >= arrayList.size()) {
                R();
                return;
            } else {
                ((k70) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean P(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) y()) > 0.5f;
    }

    public final void Q(View view, int i, boolean z) {
        int iG = G(i);
        mw8 mw8Var = this.Q;
        if (mw8Var == null || (!z ? mw8Var.r(view, view.getLeft(), iG) : mw8Var.p(view.getLeft(), iG))) {
            O(i);
            return;
        }
        O(2);
        T(i, true);
        this.B.d(i);
    }

    public final void R() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            S((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.Z;
        if (weakReference2 != null) {
            S((View) weakReference2.get(), 1);
        }
    }

    public final void S(View view, int i) {
        if (view == null) {
            return;
        }
        A(view, i);
        if (!this.b && this.P != 6) {
            this.k0.put(i, v(view, h56.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J) {
            int i2 = 5;
            if (this.P != 5) {
                cw8.l(view, a4.m, null, new j70(this, i2));
            }
        }
        int i3 = this.P;
        SparseIntArray sparseIntArray = this.m0;
        if (i3 == 3) {
            if (z()) {
                sparseIntArray.put(i, v(view, h56.bottomsheet_action_collapse, 4));
                return;
            }
            return;
        }
        SparseIntArray sparseIntArray2 = this.l0;
        if (i3 == 4) {
            sparseIntArray2.put(i, v(view, h56.bottomsheet_action_expand, 3));
        } else {
            if (i3 != 6) {
                return;
            }
            if (z()) {
                sparseIntArray.put(i, v(view, h56.bottomsheet_action_collapse, 4));
            }
            sparseIntArray2.put(i, v(view, h56.bottomsheet_action_expand, 3));
        }
    }

    public final void T(int i, boolean z) {
        gr4 gr4Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.y || H());
        if (this.A == z2 || (gr4Var = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gr4Var.u(this.A ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gr4Var.Y.j, z2 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void U(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.j0 != null) {
                    return;
                } else {
                    this.j0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.j0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.j0 = null;
        }
    }

    public final void V() {
        View view;
        if (this.Y != null) {
            w();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.iq4
    public final void a() {
        mq4 mq4Var = this.e0;
        if (mq4Var == null) {
            return;
        }
        int i = mq4Var.d;
        int i2 = mq4Var.c;
        j00 j00Var = mq4Var.f;
        mq4Var.f = null;
        if (j00Var != null) {
            float f = j00Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet animatorSetA = mq4Var.a();
                    animatorSetA.setDuration(rk.c(i2, f, i));
                    animatorSetA.start();
                    N(4);
                    return;
                }
                z4 z4Var = new z4(this, (byte) 2);
                View view = mq4Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new c82((byte) 1));
                objectAnimatorOfFloat.setDuration(rk.c(i2, f, i));
                objectAnimatorOfFloat.addListener(new z4(mq4Var, (byte) 6));
                objectAnimatorOfFloat.addListener(z4Var);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        N(this.J ? 5 : 4);
    }

    @Override // defpackage.iq4
    public final void b(j00 j00Var) {
        mq4 mq4Var = this.e0;
        if (mq4Var == null) {
            return;
        }
        j00 j00Var2 = mq4Var.f;
        mq4Var.f = j00Var;
        if (j00Var2 == null) {
            return;
        }
        mq4Var.b(j00Var.c);
    }

    @Override // defpackage.iq4
    public final void c(j00 j00Var) {
        mq4 mq4Var = this.e0;
        if (mq4Var == null) {
            return;
        }
        mq4Var.f = j00Var;
    }

    @Override // defpackage.iq4
    public final void d() {
        mq4 mq4Var = this.e0;
        if (mq4Var == null) {
            return;
        }
        j00 j00Var = mq4Var.f;
        mq4Var.f = null;
        if (j00Var == null) {
            return;
        }
        AnimatorSet animatorSetA = mq4Var.a();
        animatorSetA.setDuration(mq4Var.e);
        animatorSetA.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(b bVar) {
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i() {
        this.Y = null;
        this.Q = null;
        this.e0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        mw8 mw8Var;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = null;
            VelocityTracker velocityTracker = this.d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.d0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.d0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        ArrayList arrayList = this.b0;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.g0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view2 = null;
                        break;
                    }
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.m(view2, x2, y)) {
                        break;
                    }
                }
            } else {
                view2 = null;
                break;
            }
            WeakReference weakReference = new WeakReference(view2);
            this.h0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                int i2 = this.g0;
                WeakReference weakReference2 = this.a0;
                View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
                if (view3 == null || !coordinatorLayout.m(view3, x, i2)) {
                    this.i0 = true;
                }
            }
            this.R = this.f0 == -1 && !coordinatorLayout.m(view, x, this.g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.i0 = false;
            this.h0 = null;
            this.f0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (mw8Var = this.Q) == null || !mw8Var.q(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (!this.e) {
                                View view4 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view4 != null && coordinatorLayout.m(view4, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.Q == null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference3 = this.h0;
                                if (weakReference3 != null && weakReference3.get() != null) {
                                    break;
                                }
                                if (this.Q == null || (i = this.g0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.b) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        byte b = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        Object[] objArr = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(j36.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                h70 h70Var = new h70((Object) this, z, (byte) (objArr == true ? 1 : 0));
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ay8 ay8Var = new ay8();
                ay8Var.a = paddingStart;
                ay8Var.b = paddingEnd;
                ay8Var.c = paddingBottom;
                xd6 xd6Var = new xd6(h70Var, ay8Var, (byte) 24);
                WeakHashMap weakHashMap = cw8.a;
                uv8.c(view, xd6Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new iw8(b));
                }
            }
            ge3 ge3Var = new ge3(view);
            WeakHashMap weakHashMap2 = cw8.a;
            c19.a(view, ge3Var);
            this.Y = new WeakReference(view);
            this.e0 = new mq4(view);
            gr4 gr4Var = this.j;
            if (gr4Var != null) {
                view.setBackground(gr4Var);
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                gr4Var.s(elevation);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            R();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new mw8(coordinatorLayout.getContext(), coordinatorLayout, this.o0);
        }
        int top = view.getTop();
        coordinatorLayout.o(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i3 = this.X;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            boolean z2 = this.s;
            int i6 = this.m;
            if (z2) {
                height = i6 == -1 ? i3 : Math.min(i3, i6);
                this.V = height;
            } else {
                int i7 = i3 - i5;
                height = i6 == -1 ? i7 : Math.min(i7, i6);
                this.V = height;
            }
        }
        this.E = Math.max(0, this.X - height);
        this.F = (int) ((1.0f - this.G) * this.X);
        w();
        int i8 = this.P;
        if (i8 == 3) {
            int iF = F();
            WeakHashMap weakHashMap3 = cw8.a;
            view.offsetTopAndBottom(iF);
        } else if (i8 == 6) {
            int i9 = this.F;
            WeakHashMap weakHashMap4 = cw8.a;
            view.offsetTopAndBottom(i9);
        } else if (this.J && i8 == 5) {
            int i10 = this.X;
            WeakHashMap weakHashMap5 = cw8.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.H;
            WeakHashMap weakHashMap6 = cw8.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = cw8.a;
            view.offsetTopAndBottom(top2);
        }
        T(this.P, false);
        ArrayList arrayList = this.b0;
        arrayList.clear();
        if (this.e) {
            J(view);
        } else {
            arrayList.add(new WeakReference(C(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.c0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((k70) arrayList2.get(i2)).a(view);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(E(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), E(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(View view) {
        Iterator it = this.b0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                if (!I(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zI;
        if (i3 != 1 && (zI = I(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.L;
            boolean z2 = this.M;
            if (i2 > 0) {
                if (!this.T && !z2 && zI && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < F()) {
                    int iF = top - F();
                    iArr[1] = iF;
                    WeakHashMap weakHashMap = cw8.a;
                    view.offsetTopAndBottom(-iF);
                    O(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = cw8.a;
                    view.offsetTopAndBottom(-i2);
                    O(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z2 && zI && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = cw8.a;
                        view.offsetTopAndBottom(-i6);
                        O(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = cw8.a;
                        view.offsetTopAndBottom(-i2);
                        O(1);
                    }
                }
            }
            B(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.n0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = cw8.a;
            w19 w19VarA = vv8.a(view);
            if (w19VarA != null) {
                rect2.bottom -= w19VarA.a.h(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        N(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(View view, Parcelable parcelable) {
        l70 l70Var = (l70) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = l70Var.f0;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = l70Var.g0;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = l70Var.h0;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = l70Var.i0;
            }
        }
        int i2 = l70Var.Z;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable r(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new l70(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean s(View view, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == F()) {
            O(3);
            return;
        }
        if (I(view2) && this.T) {
            if (this.S > 0) {
                if (!this.b && view.getTop() > this.F) {
                    i3 = 6;
                }
            } else if (this.J) {
                VelocityTracker velocityTracker = this.d0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, this.c);
                    yVelocity = this.d0.getYVelocity(this.f0);
                }
                if (P(view, yVelocity)) {
                    i3 = 5;
                } else if (this.S == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.F;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.H)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.S == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.F;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.H)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.H)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.E) >= Math.abs(top2 - this.H)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.F) < Math.abs(top - this.H)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            Q(view, i3, false);
            this.T = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        mw8 mw8Var = this.Q;
        boolean z = this.L;
        if (mw8Var != null && (z || i == 1)) {
            mw8Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = null;
            VelocityTracker velocityTracker = this.d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.d0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.d0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.Q != null && ((z || this.P == 1) && actionMasked == 2 && !this.R)) {
            float fAbs = Math.abs(this.g0 - motionEvent.getY());
            mw8 mw8Var2 = this.Q;
            if (fAbs > mw8Var2.b) {
                mw8Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int v(View view, int i, int i2) {
        int iA;
        String string = view.getResources().getString(i);
        j70 j70Var = new j70(this, i2);
        ArrayList arrayListG = cw8.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListG.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = cw8.d;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                        z &= ((a4) arrayListG.get(i7)).a() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iA = i5;
                break;
            }
            if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a4) arrayListG.get(i3)).a).getLabel())) {
                iA = ((a4) arrayListG.get(i3)).a();
                break;
            }
            i3++;
        }
        if (iA != -1) {
            a4 a4Var = new a4(null, iA, string, j70Var, null);
            View.AccessibilityDelegate accessibilityDelegateE = cw8.e(view);
            t3 t3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof s3 ? ((s3) accessibilityDelegateE).a : new t3(accessibilityDelegateE);
            if (t3Var == null) {
                t3Var = new t3();
            }
            cw8.n(view, t3Var);
            cw8.k(view, a4Var.a());
            cw8.g(view).add(a4Var);
            cw8.i(view, 0);
        }
        return iA;
    }

    public final void w() {
        int iY = y();
        boolean z = this.b;
        int i = this.X;
        if (z) {
            this.H = Math.max(i - iY, this.E);
        } else {
            this.H = i - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        gr4 gr4Var = this.j;
        if (gr4Var != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (H() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM = gr4Var.m();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fM;
                    }
                } else {
                    f = 0.0f;
                }
                float[] fArr = gr4Var.D0;
                float fA = fArr != null ? fArr[0] : gr4Var.Y.a.d().f.a(gr4Var.i());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f2 = radius2 / fA;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int iMin;
        int i;
        int i2;
        if (this.g) {
            iMin = Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V);
            i = this.w;
        } else {
            if (!this.o && !this.p && (i2 = this.n) > 0) {
                return Math.max(this.f, i2 + this.i);
            }
            iMin = this.f;
            i = this.w;
        }
        return iMin + i;
    }

    public final boolean z() {
        return (this.K && this.J) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new m70(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.g0 = -1;
        this.k0 = new SparseIntArray();
        this.l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.n0 = new Rect();
        this.o0 = new i70(this, (byte) 0);
    }
}
