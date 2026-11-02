package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b66;
import defpackage.bt;
import defpackage.cw8;
import defpackage.d35;
import defpackage.e35;
import defpackage.e61;
import defpackage.f61;
import defpackage.fr5;
import defpackage.g61;
import defpackage.l71;
import defpackage.l97;
import defpackage.m56;
import defpackage.o26;
import defpackage.rb0;
import defpackage.rw8;
import defpackage.uv8;
import defpackage.w19;
import defpackage.yr2;
import defpackage.z47;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements d35, e35 {
    public static final ThreadLocal A0;
    public static final l71 B0;
    public static final fr5 C0;
    public static final String y0;
    public static final Class[] z0;
    public final ArrayList f0;
    public final z47 g0;
    public final ArrayList h0;
    public final ArrayList i0;
    public final int[] j0;
    public final int[] k0;
    public boolean l0;
    public boolean m0;
    public final int[] n0;
    public View o0;
    public View p0;
    public f61 q0;
    public boolean r0;
    public w19 s0;
    public boolean t0;
    public Drawable u0;
    public ViewGroup.OnHierarchyChangeListener v0;
    public yr2 w0;
    public final rb0 x0;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        y0 = r0 != null ? r0.getName() : null;
        B0 = new l71((byte) 12);
        z0 = new Class[]{Context.class, AttributeSet.class};
        A0 = new ThreadLocal();
        C0 = new fr5();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.f0 = new ArrayList();
        this.g0 = new z47((byte) 14);
        this.h0 = new ArrayList();
        this.i0 = new ArrayList();
        this.j0 = new int[2];
        this.k0 = new int[2];
        this.x0 = new rb0();
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, b66.CoordinatorLayout, 0, m56.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, b66.CoordinatorLayout, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, b66.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, m56.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, b66.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b66.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.n0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = coordinatorLayout.n0;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        coordinatorLayout.u0 = typedArrayObtainStyledAttributes.getDrawable(b66.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.u();
        super.setOnHierarchyChangeListener(new e61(coordinatorLayout));
        WeakHashMap weakHashMap = cw8.a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C0.a();
        return rect == null ? new Rect() : rect;
    }

    public static void k(int i, Rect rect, Rect rect2, b bVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = bVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = bVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static b l(View view) {
        b bVar = (b) view.getLayoutParams();
        if (!bVar.b) {
            a aVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                aVar = (a) superclass.getAnnotation(a.class);
                if (aVar != null) {
                    break;
                }
            }
            if (aVar != null) {
                try {
                    Behavior behavior = (Behavior) aVar.value().getDeclaredConstructor(null).newInstance(null);
                    Behavior behavior2 = bVar.a;
                    if (behavior2 != behavior) {
                        if (behavior2 != null) {
                            behavior2.i();
                        }
                        bVar.a = behavior;
                        bVar.b = true;
                        if (behavior != null) {
                            behavior.g(bVar);
                        }
                    }
                } catch (Exception unused) {
                    aVar.value().getClass();
                }
            }
            bVar.b = true;
        }
        return bVar;
    }

    public static void s(View view, int i) {
        b bVar = (b) view.getLayoutParams();
        int i2 = bVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = cw8.a;
            view.offsetLeftAndRight(i - i2);
            bVar.i = i;
        }
    }

    public static void t(View view, int i) {
        b bVar = (b) view.getLayoutParams();
        int i2 = bVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = cw8.a;
            view.offsetTopAndBottom(i - i2);
            bVar.j = i;
        }
    }

    @Override // defpackage.e35
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(i5) && (behavior = bVar.a) != null) {
                    int[] iArr2 = this.j0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.o(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            n(1);
        }
    }

    @Override // defpackage.d35
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.k0);
    }

    @Override // defpackage.d35
    public final boolean c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                Behavior behavior = bVar.a;
                if (behavior != null) {
                    boolean zS = behavior.s(childAt, i, i2);
                    z |= zS;
                    if (i2 == 0) {
                        bVar.m = zS;
                    } else if (i2 == 1) {
                        bVar.n = zS;
                    }
                } else if (i2 == 0) {
                    bVar.m = false;
                } else if (i2 == 1) {
                    bVar.n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.d35
    public final void d(View view, View view2, int i, int i2) {
        rb0 rb0Var = this.x0;
        if (i2 == 1) {
            rb0Var.b = i;
        } else {
            rb0Var.a = i;
        }
        this.p0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((b) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((b) view.getLayoutParams()).a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.d35
    public final void e(View view, int i) {
        rb0 rb0Var = this.x0;
        if (i == 1) {
            rb0Var.b = 0;
        } else {
            rb0Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.a(i)) {
                Behavior behavior = bVar.a;
                if (behavior != null) {
                    behavior.t(childAt, view, i);
                }
                if (i == 0) {
                    bVar.m = false;
                } else if (i == 1) {
                    bVar.n = false;
                }
            }
        }
        this.p0 = null;
    }

    @Override // defpackage.d35
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(i3) && (behavior = bVar.a) != null) {
                    int[] iArr2 = this.j0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.n(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            n(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        q();
        return Collections.unmodifiableList(this.f0);
    }

    public final w19 getLastWindowInsets() {
        return this.s0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        rb0 rb0Var = this.x0;
        return rb0Var.b | rb0Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.u0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(b bVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            rw8.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        l97 l97Var = (l97) this.g0.Z;
        int i = l97Var.Z;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) l97Var.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l97Var.g(i2));
            }
        }
        ArrayList arrayList3 = this.i0;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final boolean m(View view, int i, int i2) {
        fr5 fr5Var = C0;
        Rect rectG = g();
        rw8.a(this, view, rectG);
        try {
            return rectG.contains(i, i2);
        } finally {
            rectG.setEmpty();
            fr5Var.d(rectG);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0258  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    public final void n(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        b bVar;
        int i10;
        View view;
        Behavior behavior;
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f0;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i11 = 0;
        while (true) {
            fr5 fr5Var = C0;
            if (i11 >= size) {
                Rect rect2 = rectG3;
                rectG.setEmpty();
                fr5Var.d(rectG);
                rectG2.setEmpty();
                fr5Var.d(rectG2);
                rect2.setEmpty();
                fr5Var.d(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            b bVar2 = (b) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectG3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (bVar2.l == ((View) arrayList2.get(i12))) {
                        b bVar3 = (b) view2.getLayoutParams();
                        if (bVar3.k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            b bVar4 = bVar2;
                            Rect rectG6 = g();
                            rw8.a(this, bVar3.k, rectG4);
                            i(view2, rectG5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            bVar = bVar4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            k(layoutDirection, rectG4, rectG6, bVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(bVar3, rectG6, measuredWidth, measuredHeight);
                            int i13 = rectG6.left - rectG5.left;
                            int i14 = rectG6.top - rectG5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = cw8.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = cw8.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (behavior = bVar3.a) != null) {
                                behavior.h(this, view, bVar3.k);
                            }
                            rectG4.setEmpty();
                            fr5Var.d(rectG4);
                            rectG5.setEmpty();
                            fr5Var.d(rectG5);
                            rectG6.setEmpty();
                            fr5Var.d(rectG6);
                        } else {
                            bVar = bVar2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        bVar = bVar2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    bVar2 = bVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectG3 = rectG3;
                }
                ArrayList arrayList3 = arrayList2;
                b bVar5 = bVar2;
                int i15 = size;
                Rect rect3 = rectG3;
                i2 = i11;
                View view4 = view2;
                i(view4, rectG2, true);
                if (bVar5.g != 0 && !rectG2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(bVar5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectG.top = Math.max(rectG.top, rectG2.bottom);
                    } else if (i16 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rectG2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectG.left = Math.max(rectG.left, rectG2.right);
                    } else if (i17 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rectG2.left);
                    }
                }
                if (bVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = cw8.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        b bVar6 = (b) view4.getLayoutParams();
                        Behavior behavior2 = bVar6.a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (behavior2 == null || !behavior2.e(view4)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            c2.k("Rect should be within the child's bounds. Rect:", rectG7.toShortString(), " | Bounds:", rectG8.toShortString());
                            return;
                        }
                        rectG8.setEmpty();
                        fr5Var.d(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            fr5Var.d(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(bVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectG7.top - ((ViewGroup.MarginLayoutParams) bVar6).topMargin) - bVar6.j) >= (i9 = rectG.top)) {
                                z = false;
                            } else {
                                t(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin) + bVar6.j) < (i7 = rectG.bottom)) {
                                t(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                t(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectG7.left - ((ViewGroup.MarginLayoutParams) bVar6).leftMargin) - bVar6.i) >= (i6 = rectG.left)) {
                                z2 = false;
                            } else {
                                s(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) bVar6).rightMargin) + bVar6.i) < (i4 = rectG.right)) {
                                s(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                s(view4, 0);
                            }
                            rectG7.setEmpty();
                            fr5Var.d(rectG7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((b) view4.getLayoutParams()).o);
                    if (rect.equals(rectG2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((b) view4.getLayoutParams()).o.set(rectG2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        Behavior behavior3 = ((b) view5.getLayoutParams()).a;
                        if (behavior3 != null) {
                            behavior3.f(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectG3 = rect;
            arrayList2 = arrayList;
        }
    }

    public final void o(View view, int i) {
        int i2;
        b bVar = (b) view.getLayoutParams();
        View view2 = bVar.k;
        if (view2 == null && bVar.f != -1) {
            bt.i("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        fr5 fr5Var = C0;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                rw8.a(this, view2, rectG);
                b bVar2 = (b) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                k(i, rectG, rectG2, bVar2, measuredWidth, measuredHeight);
                h(bVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                fr5Var.d(rectG);
                rectG2.setEmpty();
                fr5Var.d(rectG2);
            }
        }
        int i3 = bVar.e;
        if (i3 < 0) {
            b bVar3 = (b) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
            if (this.s0 != null) {
                WeakHashMap weakHashMap = cw8.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.s0.b() + rectG3.left;
                    rectG3.top = this.s0.d() + rectG3.top;
                    rectG3.right -= this.s0.c();
                    rectG3.bottom -= this.s0.a();
                }
            }
            Rect rectG4 = g();
            int i4 = bVar3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            fr5Var.d(rectG3);
            rectG4.setEmpty();
            fr5Var.d(rectG4);
            return;
        }
        b bVar4 = (b) view.getLayoutParams();
        int i5 = bVar4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.n0;
        if (iArr != null && i3 >= 0 && i3 < iArr.length) {
            i2 = iArr[i3];
        } else {
            toString();
            i2 = 0;
        }
        int i9 = i2 - measuredWidth2;
        if (i6 == 1) {
            i9 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            i9 += measuredWidth2;
        }
        if (i7 == 16) {
            i8 = measuredHeight2 / 2;
        } else if (i7 == 80) {
            i8 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) bVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bVar4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r(false);
        if (this.r0) {
            if (this.q0 == null) {
                this.q0 = new f61(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.q0);
        }
        if (this.s0 == null) {
            WeakHashMap weakHashMap = cw8.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.m0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r(false);
        if (this.r0 && this.q0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.q0);
        }
        View view = this.p0;
        if (view != null) {
            e(view, 0);
        }
        this.m0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.t0 || this.u0 == null) {
            return;
        }
        w19 w19Var = this.s0;
        int iD = w19Var != null ? w19Var.d() : 0;
        if (iD > 0) {
            this.u0.setBounds(0, 0, getWidth(), iD);
            this.u0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r(true);
        }
        boolean zP = p(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zP;
        }
        r(true);
        return zP;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f0;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((b) view.getLayoutParams()).a) == null || !behavior.k(this, view, layoutDirection))) {
                o(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i4;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean zL;
        int i11;
        int i12;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.q();
        int childCount = coordinatorLayout.getChildCount();
        int i13 = 0;
        loop0: while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i13);
            l97 l97Var = (l97) coordinatorLayout.g0.Z;
            int i14 = l97Var.Z;
            for (int i15 = 0; i15 < i14; i15++) {
                ArrayList arrayList2 = (ArrayList) l97Var.j(i15);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i13++;
        }
        if (z != coordinatorLayout.r0) {
            boolean z3 = coordinatorLayout.m0;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.q0 == null) {
                        coordinatorLayout.q0 = new f61(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.q0);
                }
                coordinatorLayout.r0 = true;
            } else {
                if (z3 && coordinatorLayout.q0 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.q0);
                }
                coordinatorLayout.r0 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.s0 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f0;
        int size3 = arrayList3.size();
        int i18 = 0;
        int iCombineMeasuredStates = 0;
        while (i18 < size3) {
            View view2 = (View) arrayList3.get(i18);
            int i19 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i5 = size3;
                i10 = i18;
                i8 = paddingRight;
                suggestedMinimumWidth = i19;
                z2 = false;
                i6 = paddingLeft;
            } else {
                b bVar = (b) view2.getLayoutParams();
                int i20 = bVar.e;
                if (i20 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.n0;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i20 < 0 || i20 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i11 = iArr[i20];
                        }
                        i12 = bVar.c;
                        if (i12 == 0) {
                            i12 = 8388661;
                        }
                        absoluteGravity = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                        if (!(absoluteGravity == 3 || z4) || (absoluteGravity == 5 && z4)) {
                            iMax = Math.max(0, (size - paddingRight) - i11);
                        } else if ((absoluteGravity != 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, i11 - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = coordinatorLayout.s0.c() + coordinatorLayout.s0.b();
                            int iA = coordinatorLayout.s0.a() + coordinatorLayout.s0.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        behavior = bVar.a;
                        if (behavior != null) {
                            int i21 = iMax;
                            int i22 = iMakeMeasureSpec;
                            i5 = size3;
                            i6 = paddingLeft;
                            i7 = i19;
                            int i23 = i3;
                            i8 = paddingRight;
                            i9 = i23;
                            z2 = false;
                            i10 = i18;
                            int i24 = iMakeMeasureSpec2;
                            zL = behavior.l(this, view2, i22, i21, i24);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            iMax = i21;
                            i4 = i24;
                            if (zL) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i25 = size3;
                            i4 = iMakeMeasureSpec2;
                            view = view2;
                            i5 = i25;
                            i6 = paddingLeft;
                            i7 = i19;
                            int i26 = i3;
                            i8 = paddingRight;
                            i9 = i26;
                            i10 = i18;
                            z2 = false;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    }
                    i11 = 0;
                    i12 = bVar.c;
                    if (i12 == 0) {
                        i12 = 8388661;
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity != 5) {
                        }
                    } else if (absoluteGravity != 5) {
                    }
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    behavior = bVar.a;
                    if (behavior != null) {
                        int i27 = iMax;
                        int i28 = iMakeMeasureSpec;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i19;
                        int i29 = i3;
                        i8 = paddingRight;
                        i9 = i29;
                        z2 = false;
                        i10 = i18;
                        int i210 = iMakeMeasureSpec2;
                        zL = behavior.l(this, view2, i28, i27, i210);
                        view = view2;
                        iMakeMeasureSpec = i28;
                        iMax = i27;
                        i4 = i210;
                        if (zL) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i211 = size3;
                        i4 = iMakeMeasureSpec2;
                        view = view2;
                        i5 = i211;
                        i6 = paddingLeft;
                        i7 = i19;
                        int i212 = i3;
                        i8 = paddingRight;
                        i9 = i212;
                        i10 = i18;
                        z2 = false;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                iMax = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                behavior = bVar.a;
                if (behavior != null) {
                    int i213 = iMax;
                    int i214 = iMakeMeasureSpec;
                    i5 = size3;
                    i6 = paddingLeft;
                    i7 = i19;
                    int i215 = i3;
                    i8 = paddingRight;
                    i9 = i215;
                    z2 = false;
                    i10 = i18;
                    int i216 = iMakeMeasureSpec2;
                    zL = behavior.l(this, view2, i214, i213, i216);
                    view = view2;
                    iMakeMeasureSpec = i214;
                    iMax = i213;
                    i4 = i216;
                    if (zL) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i217 = size3;
                    i4 = iMakeMeasureSpec2;
                    view = view2;
                    i5 = i217;
                    i6 = paddingLeft;
                    i7 = i19;
                    int i218 = i3;
                    i8 = paddingRight;
                    i9 = i218;
                    i10 = i18;
                    z2 = false;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i18 = i10 + 1;
            size3 = i5;
            paddingLeft = i6;
            paddingRight = i8;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(0)) {
                    Behavior behavior = bVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zM = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.a(0) && (behavior = bVar.a) != null) {
                    zM |= behavior.m(view);
                }
            }
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g61)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g61 g61Var = (g61) parcelable;
        super.onRestoreInstanceState(g61Var.X);
        SparseArray sparseArray = g61Var.Z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = l(childAt).a;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        g61 g61Var = new g61(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((b) childAt.getLayoutParams()).a;
            if (id != -1 && behavior != null && (parcelableR = behavior.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        g61Var.Z = sparseArray;
        return g61Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zP;
        boolean zU;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.o0 == null) {
            zP = p(motionEvent, 1);
            if (!zP) {
                zU = false;
            }
            motionEventObtain = null;
            if (this.o0 == null) {
                zU |= super.onTouchEvent(motionEvent);
            } else if (zP) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zU;
            }
            r(false);
            return zU;
        }
        zP = false;
        Behavior behavior = ((b) this.o0.getLayoutParams()).a;
        if (behavior != null) {
            zU = behavior.u(this, this.o0, motionEvent);
        } else {
            zU = false;
        }
        motionEventObtain = null;
        if (this.o0 == null) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (zP) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        r(false);
        return zU;
    }

    public final boolean p(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h0;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        l71 l71Var = B0;
        if (l71Var != null) {
            Collections.sort(arrayList, l71Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zJ = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            Behavior behavior = ((b) view.getLayoutParams()).a;
            if (zJ && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        behavior.j(this, view, motionEventObtain);
                    } else if (i == 1) {
                        behavior.u(this, view, motionEventObtain);
                    }
                }
            } else if (!zJ && behavior != null) {
                if (i == 0) {
                    zJ = behavior.j(this, view, motionEvent);
                } else if (i == 1) {
                    zJ = behavior.u(this, view, motionEvent);
                }
                if (zJ) {
                    this.o0 = view;
                }
            }
        }
        arrayList.clear();
        return zJ;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q():void");
    }

    public final void r(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((b) childAt.getLayoutParams()).a;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.j(this, childAt, motionEventObtain);
                } else {
                    behavior.u(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((b) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.o0 = null;
        this.l0 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((b) view.getLayoutParams()).a;
        if (behavior == null || !behavior.p(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.l0) {
            return;
        }
        r(false);
        this.l0 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        u();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.v0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.u0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.u0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.u0.setState(getDrawableState());
                }
                Drawable drawable3 = this.u0;
                WeakHashMap weakHashMap = cw8.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.u0.setVisible(getVisibility() == 0, false);
                this.u0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = cw8.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.u0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.u0.setVisible(z, false);
    }

    public final void u() {
        WeakHashMap weakHashMap = cw8.a;
        if (!getFitsSystemWindows()) {
            uv8.c(this, null);
            return;
        }
        yr2 yr2Var = this.w0;
        if (yr2Var == null) {
            yr2Var = new yr2((Object) this, (byte) 17);
            this.w0 = yr2Var;
        }
        uv8.c(this, yr2Var);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u0;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static abstract class Behavior<V extends View> {
        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean e(View view) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean m(View view) {
            return false;
        }

        public void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public Parcelable r(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean s(View view, int i, int i2) {
            return false;
        }

        public boolean u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public void i() {
        }

        public void f(View view) {
        }

        public void g(b bVar) {
        }

        public void q(View view, Parcelable parcelable) {
        }

        public void t(View view, View view2, int i) {
        }

        public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o26.coordinatorLayoutStyle);
    }
}
