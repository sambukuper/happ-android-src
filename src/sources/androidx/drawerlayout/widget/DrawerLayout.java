package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.a4;
import defpackage.bt;
import defpackage.cw8;
import defpackage.d66;
import defpackage.fe3;
import defpackage.g36;
import defpackage.gw1;
import defpackage.hw1;
import defpackage.iw1;
import defpackage.jw1;
import defpackage.mw8;
import defpackage.oi0;
import defpackage.q26;
import defpackage.r20;
import defpackage.w19;
import defpackage.yr2;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] G0 = {R.attr.colorPrimaryDark};
    public static final int[] H0 = {R.attr.layout_gravity};
    public static final boolean I0;
    public WindowInsets A0;
    public boolean B0;
    public final ArrayList C0;
    public Rect D0;
    public Matrix E0;
    public final yr2 F0;
    public float f0;
    public final int g0;
    public int h0;
    public float i0;
    public final Paint j0;
    public final mw8 k0;
    public final mw8 l0;
    public final a m0;
    public final a n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public ArrayList w0;
    public float x0;
    public float y0;
    public Drawable z0;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.H0);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        I0 = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new hw1((byte) 0);
        this.h0 = -1728053248;
        this.j0 = new Paint();
        this.q0 = true;
        this.r0 = 3;
        this.s0 = 3;
        this.t0 = 3;
        this.u0 = 3;
        this.F0 = new yr2((Object) this, (byte) 29);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.g0 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        a aVar = new a(this, 3);
        this.m0 = aVar;
        a aVar2 = new a(this, 5);
        this.n0 = aVar2;
        mw8 mw8Var = new mw8(getContext(), this, aVar);
        mw8Var.b = (int) (mw8Var.b * 1.0f);
        this.k0 = mw8Var;
        mw8Var.q = (byte) 1;
        mw8Var.n = f2;
        aVar.b = mw8Var;
        mw8 mw8Var2 = new mw8(getContext(), this, aVar2);
        mw8Var2.b = (int) (1.0f * mw8Var2.b);
        this.l0 = mw8Var2;
        mw8Var2.q = (byte) 2;
        mw8Var2.n = f2;
        aVar2.b = mw8Var2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = cw8.a;
        setImportantForAccessibility(1);
        cw8.n(this, new r20(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new gw1());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(G0);
            try {
                this.z0 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d66.DrawerLayout, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(d66.DrawerLayout_elevation)) {
                this.f0 = typedArrayObtainStyledAttributes2.getDimension(d66.DrawerLayout_elevation, 0.0f);
            } else {
                this.f0 = getResources().getDimension(g36.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.C0 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static boolean h(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    public static boolean i(View view) {
        if (j(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        c2.j("View ", view, " is not a drawer");
        return false;
    }

    public static boolean j(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = cw8.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i) {
        return (g(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.C0;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!j(childAt)) {
                arrayList2.add(childAt);
            } else if (i(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || j(view)) {
            WeakHashMap weakHashMap = cw8.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = cw8.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final void b(View view) {
        if (!j(view)) {
            c2.j("View ", view, " is not a sliding drawer");
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.q0) {
            layoutParams.b = 0.0f;
            layoutParams.d = 0;
        } else {
            layoutParams.d |= 4;
            if (a(view, 3)) {
                this.k0.r(view, -view.getWidth(), view.getTop());
            } else {
                this.l0.r(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c(boolean z) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (j(childAt) && (!z || layoutParams.c)) {
                zR |= a(childAt, 3) ? this.k0.r(childAt, -childAt.getWidth(), childAt.getTop()) : this.l0.r(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        a aVar = this.m0;
        aVar.d.removeCallbacks(aVar.c);
        a aVar2 = this.n0;
        aVar2.d.removeCallbacks(aVar2.c);
        if (zR) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.i0 = fMax;
        boolean zG = this.k0.g();
        boolean zG2 = this.l0.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = cw8.a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap weakHashMap = cw8.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.i0 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            Rect rect = this.D0;
            if (rect == null) {
                rect = new Rect();
                this.D0 = rect;
            }
            childAt.getHitRect(rect);
            if (this.D0.contains((int) x, (int) y) && !h(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        Matrix matrix2 = this.E0;
                        if (matrix2 == null) {
                            matrix2 = new Matrix();
                            this.E0 = matrix2;
                        }
                        matrix.invert(matrix2);
                        motionEventObtain.transform(this.E0);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zH = h(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zH) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && j(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.i0;
        if (f > 0.0f && zH) {
            int i4 = this.h0;
            Paint paint = this.j0;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (j(childAt)) {
                if (!j(childAt)) {
                    c2.j("View ", childAt, " is not a drawer");
                    return null;
                }
                if (((LayoutParams) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!j(view)) {
            c2.j("View ", view, " is not a drawer");
            return 0;
        }
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.r0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.t0 : this.u0;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.s0;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.u0 : this.t0;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.t0;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.r0 : this.s0;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.u0;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.s0 : this.r0;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int g(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = cw8.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.a = 0;
            layoutParams3.a = layoutParams2.a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        return this.f0;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.z0;
    }

    public final void k(View view) {
        if (!j(view)) {
            c2.j("View ", view, " is not a sliding drawer");
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.q0) {
            layoutParams.b = 1.0f;
            layoutParams.d = 1;
            o(view, true);
            n(view);
        } else {
            layoutParams.d |= 2;
            if (a(view, 3)) {
                this.k0.r(view, 0, view.getTop());
            } else {
                this.l0.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void l(int i, int i2) {
        View viewD;
        WeakHashMap weakHashMap = cw8.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.r0 = i;
        } else if (i2 == 5) {
            this.s0 = i;
        } else if (i2 == 8388611) {
            this.t0 = i;
        } else if (i2 == 8388613) {
            this.u0 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.k0 : this.l0).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(absoluteGravity)) != null) {
                k(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public final void m(View view, float f) {
        int size;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.b) {
            return;
        }
        layoutParams.b = f;
        ArrayList arrayList = this.w0;
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return;
        }
        this.w0.get(size).getClass();
        c2.m();
    }

    public final void n(View view) {
        a4 a4Var = a4.m;
        cw8.k(view, a4Var.a());
        cw8.i(view, 0);
        if (!i(view) || f(view) == 2) {
            return;
        }
        cw8.l(view, a4Var, null, this.F0);
    }

    public final void o(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || j(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = cw8.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = cw8.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.B0 || this.z0 == null) {
            return;
        }
        WindowInsets windowInsets = this.A0;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.z0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.z0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewH;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        int actionMasked = motionEvent.getActionMasked();
        mw8 mw8Var = this.k0;
        boolean zQ = mw8Var.q(motionEvent) | this.l0.q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(true);
                this.v0 = false;
            } else if (actionMasked == 2) {
                float[] fArr5 = mw8Var.d;
                if (fArr5 != null) {
                    int length = fArr5.length;
                    for (int i = 0; i < length; i++) {
                        if ((mw8Var.k & (1 << i)) != 0 && (fArr = mw8Var.d) != null && (fArr2 = mw8Var.e) != null && (fArr3 = mw8Var.f) != null && (fArr4 = mw8Var.g) != null) {
                            float f = fArr3[i] - fArr[i];
                            float f2 = fArr4[i] - fArr2[i];
                            float f3 = (f2 * f2) + (f * f);
                            int i2 = mw8Var.b;
                            if (f3 > i2 * i2) {
                                a aVar = this.m0;
                                aVar.d.removeCallbacks(aVar.c);
                                a aVar2 = this.n0;
                                aVar2.d.removeCallbacks(aVar2.c);
                                break;
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                c(true);
                this.v0 = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.x0 = x;
            this.y0 = y;
            z = this.i0 > 0.0f && (viewH = mw8Var.h((int) x, (int) y)) != null && h(viewH);
            this.v0 = false;
        }
        if (!zQ && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.v0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || e() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        float f2;
        int i5;
        boolean z2 = true;
        this.p0 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        f = layoutParams.b;
                        i5 = (-measuredWidth) + ((int) (f3 * f));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f = layoutParams.b;
                        int i9 = i6 - ((int) (f4 * f));
                        f2 = (i6 - i9) / f4;
                        i5 = i9;
                    }
                    boolean z3 = f2 != f ? z2 : false;
                    int i10 = layoutParams.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        m(childAt, f2);
                    }
                    int i18 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (I0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            fe3 fe3VarL = w19.g(null, rootWindowInsets).a.l();
            mw8 mw8Var = this.k0;
            mw8Var.o = Math.max(mw8Var.p, fe3VarL.a);
            mw8 mw8Var2 = this.l0;
            mw8Var2.o = Math.max(mw8Var2.p, fe3VarL.c);
        }
        this.p0 = false;
        this.q0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                bt.q("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.A0 != null) {
            WeakHashMap weakHashMap = cw8.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = cw8.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.A0;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!j(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f = this.f0;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int iG = g(childAt);
                    int i4 = iG & 7;
                    boolean z4 = i4 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(oi0.p(new StringBuilder("Child drawer has absolute gravity "), (iG & 3) != 3 ? (iG & 5) == 5 ? "RIGHT" : Integer.toHexString(i4) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.g0 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof jw1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jw1 jw1Var = (jw1) parcelable;
        super.onRestoreInstanceState(jw1Var.X);
        int i = jw1Var.Z;
        if (i != 0 && (viewD = d(i)) != null) {
            k(viewD);
        }
        int i2 = jw1Var.f0;
        if (i2 != 3) {
            l(i2, 3);
        }
        int i3 = jw1Var.g0;
        if (i3 != 3) {
            l(i3, 5);
        }
        int i4 = jw1Var.h0;
        if (i4 != 3) {
            l(i4, 8388611);
        }
        int i5 = jw1Var.i0;
        if (i5 != 3) {
            l(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        jw1 jw1Var = new jw1(super.onSaveInstanceState());
        jw1Var.Z = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                jw1Var.Z = layoutParams.a;
                break;
            }
        }
        jw1Var.f0 = this.r0;
        jw1Var.g0 = this.s0;
        jw1Var.h0 = this.t0;
        jw1Var.i0 = this.u0;
        return jw1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        mw8 mw8Var = this.k0;
        mw8Var.j(motionEvent);
        this.l0.j(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.x0 = x;
            this.y0 = y;
            this.v0 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            c(true);
            this.v0 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewH = mw8Var.h((int) x2, (int) y2);
        if (viewH != null && h(viewH)) {
            float f = x2 - this.x0;
            float f2 = y2 - this.y0;
            int i = mw8Var.b;
            if ((f2 * f2) + (f * f) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || f(childAt) == 2;
            }
        }
        c(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.p0) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f0 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (j(childAt)) {
                float f2 = this.f0;
                WeakHashMap weakHashMap = cw8.a;
                childAt.setElevation(f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(iw1 iw1Var) {
        if (iw1Var != null) {
            ArrayList arrayList = this.w0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.w0 = arrayList;
            }
            arrayList.add(iw1Var);
        }
    }

    public void setDrawerLockMode(int i) {
        l(i, 3);
        l(i, 5);
    }

    public void setScrimColor(int i) {
        this.h0 = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.z0 = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.z0 = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.z0 = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q26.drawerLayoutStyle);
    }
}
