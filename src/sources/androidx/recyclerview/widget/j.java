package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import defpackage.bt;
import defpackage.cw8;
import defpackage.d96;
import defpackage.e96;
import defpackage.f4;
import defpackage.g4;
import defpackage.h4;
import defpackage.l97;
import defpackage.lr0;
import defpackage.lu2;
import defpackage.pv8;
import defpackage.q96;
import defpackage.s56;
import defpackage.sw8;
import defpackage.t96;
import defpackage.w86;
import defpackage.xd6;
import defpackage.xr0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public lr0 X;
    public RecyclerView Y;
    public final xd6 Z;
    public final xd6 f0;
    public c g0;
    public boolean h0;
    public boolean i0;
    public final boolean j0;
    public boolean k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;

    public j() {
        h hVar = new h(this);
        i iVar = new i(this);
        this.Z = new xd6((pv8) hVar);
        this.f0 = new xd6((pv8) iVar);
        this.h0 = false;
        this.i0 = false;
        this.j0 = true;
        this.k0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int J(int i, boolean z, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int O(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int P(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int T(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).X.c();
    }

    public static e96 U(Context context, AttributeSet attributeSet, int i, int i2) {
        e96 e96Var = new e96();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s56.RecyclerView, i, i2);
        e96Var.a = typedArrayObtainStyledAttributes.getInt(s56.RecyclerView_android_orientation, 1);
        e96Var.b = typedArrayObtainStyledAttributes.getInt(s56.RecyclerView_spanCount, 1);
        e96Var.c = typedArrayObtainStyledAttributes.getBoolean(s56.RecyclerView_reverseLayout, false);
        e96Var.d = typedArrayObtainStyledAttributes.getBoolean(s56.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return e96Var;
    }

    public static boolean a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void b0(View view, int i, int i2, int i3, int i4) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.Y;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static int s(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public int A(q96 q96Var) {
        return 0;
    }

    public final void B(k kVar) {
        for (int I = I() - 1; I >= 0; I--) {
            L0(kVar, I, H(I));
        }
    }

    public boolean B0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.Y;
        return C0(recyclerView.h0, recyclerView.k1, i, bundle);
    }

    public final View C(View view) {
        View viewE;
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null || (viewE = recyclerView.E(view)) == null || this.X.c.contains(viewE)) {
            return null;
        }
        return viewE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
  0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean C0(k kVar, q96 q96Var, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        if (this.Y != null) {
            int iHeight = this.q0;
            int iWidth = this.p0;
            Rect rect = new Rect();
            if (this.Y.getMatrix().isIdentity() && this.Y.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.Y.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.Y.canScrollHorizontally(1)) {
                    paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                } else {
                    paddingLeft = 0;
                }
            } else if (i != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.Y.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.Y.canScrollHorizontally(-1)) {
                    paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                } else {
                    paddingLeft = 0;
                }
            }
            if (paddingTop != 0 || paddingLeft != 0) {
                if (bundle != null) {
                    f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                    if (f < 0.0f) {
                        if (RecyclerView.F1) {
                            throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                        }
                    }
                } else {
                    f = 1.0f;
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                        paddingLeft = (int) (paddingLeft * f);
                        paddingTop = (int) (paddingTop * f);
                    }
                    this.Y.n0(paddingLeft, paddingTop, true);
                    return true;
                }
                RecyclerView recyclerView = this.Y;
                f fVar = recyclerView.r0;
                if (fVar != null) {
                    if (i == 4096) {
                        recyclerView.o0(fVar.a() - 1);
                        return true;
                    }
                    if (i != 8192) {
                        return true;
                    }
                    recyclerView.o0(0);
                    return true;
                }
            }
        }
        return false;
    }

    public View D(int i) {
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            l lVarN = RecyclerView.N(viewH);
            if (lVarN != null && lVarN.c() == i && !lVarN.p() && (this.Y.k1.g || !lVarN.i())) {
                return viewH;
            }
        }
        return null;
    }

    public final void D0() {
        for (int I = I() - 1; I >= 0; I--) {
            this.X.k(I);
        }
    }

    public RecyclerView.LayoutParams E() {
        return new lu2(-2, -2);
    }

    public void E0(k kVar) {
        for (int I = I() - 1; I >= 0; I--) {
            if (!RecyclerView.N(H(I)).p()) {
                H0(I, kVar);
            }
        }
    }

    public RecyclerView.LayoutParams F(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    public final void F0(k kVar) {
        ArrayList arrayList;
        int size = kVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = kVar.a;
            if (i < 0) {
                break;
            }
            View view = ((l) arrayList.get(i)).a;
            l lVarN = RecyclerView.N(view);
            if (!lVarN.p()) {
                lVarN.o(false);
                if (lVarN.k()) {
                    this.Y.removeDetachedView(view, false);
                }
                d96 d96Var = this.Y.S0;
                if (d96Var != null) {
                    d96Var.d(lVarN);
                }
                lVarN.o(true);
                l lVarN2 = RecyclerView.N(view);
                lVarN2.n = null;
                lVarN2.o = false;
                lVarN2.j &= -33;
                kVar.j(lVarN2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = kVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.Y.invalidate();
        }
    }

    public RecyclerView.LayoutParams G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new RecyclerView.LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new RecyclerView.LayoutParams(layoutParams);
    }

    public final void G0(View view, k kVar) {
        lr0 lr0Var = this.X;
        w86 w86Var = lr0Var.a;
        byte b = lr0Var.d;
        if (b == 1) {
            bt.i("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            bt.i("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            lr0Var.d = (byte) 1;
            lr0Var.e = view;
            int iIndexOfChild = w86Var.a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (lr0Var.b.i(iIndexOfChild)) {
                    lr0Var.l(view);
                }
                w86Var.c(iIndexOfChild);
            }
            lr0Var.d = (byte) 0;
            lr0Var.e = null;
            kVar.i(view);
        } catch (Throwable th) {
            lr0Var.d = (byte) 0;
            lr0Var.e = null;
            throw th;
        }
    }

    public final View H(int i) {
        lr0 lr0Var = this.X;
        if (lr0Var != null) {
            return lr0Var.d(i);
        }
        return null;
    }

    public final void H0(int i, k kVar) {
        View viewH = H(i);
        if (H(i) != null) {
            this.X.k(i);
        }
        kVar.i(viewH);
    }

    public final int I() {
        lr0 lr0Var = this.X;
        if (lr0Var != null) {
            return lr0Var.e();
        }
        return 0;
    }

    public boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return J0(recyclerView, view, rect, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean J0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.p0 - getPaddingRight();
        int paddingBottom = this.q0 - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - paddingRight;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - paddingBottom);
        if (this.Y.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int paddingRight2 = this.p0 - getPaddingRight();
                int paddingBottom2 = this.q0 - getPaddingBottom();
                Rect rect2 = this.Y.o0;
                M(focusedChild, rect2);
                if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.l0(i4, i5);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.l0(i4, i5);
            return true;
        }
        return false;
    }

    public int K(k kVar, q96 q96Var) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null || recyclerView.r0 == null || !p()) {
            return 1;
        }
        return this.Y.r0.a();
    }

    public final void K0() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int L(View view) {
        return view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.bottom;
    }

    public final void L0(k kVar, int i, View view) {
        l lVarN = RecyclerView.N(view);
        if (lVarN.p()) {
            if (RecyclerView.G1) {
                lVarN.toString();
            }
        } else if (lVarN.g() && !lVarN.i() && !this.Y.r0.b) {
            if (H(i) != null) {
                this.X.k(i);
            }
            kVar.j(lVarN);
        } else {
            H(i);
            this.X.c(i);
            kVar.k(view);
            this.Y.l0.F(lVarN);
        }
    }

    public void M(View view, Rect rect) {
        boolean z = RecyclerView.F1;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.Y;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public abstract int M0(int i, q96 q96Var, k kVar);

    public int N(View view) {
        return view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.left;
    }

    public abstract int O0(int i, q96 q96Var, k kVar);

    public final void P0(RecyclerView recyclerView) {
        Q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public int Q(View view) {
        return view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.right;
    }

    public final void Q0(int i, int i2) {
        this.p0 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.n0 = mode;
        if (mode == 0 && !RecyclerView.J1) {
            this.p0 = 0;
        }
        this.q0 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.o0 = mode2;
        if (mode2 != 0 || RecyclerView.J1) {
            return;
        }
        this.q0 = 0;
    }

    public int R(View view) {
        return view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).Y.top;
    }

    public void R0(Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView recyclerView = this.Y;
        WeakHashMap weakHashMap = cw8.a;
        this.Y.setMeasuredDimension(s(i, paddingRight, recyclerView.getMinimumWidth()), s(i2, paddingBottom, this.Y.getMinimumHeight()));
    }

    public final int S() {
        RecyclerView recyclerView = this.Y;
        f adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void S0(int i, int i2) {
        int I = I();
        if (I == 0) {
            this.Y.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < I; i7++) {
            View viewH = H(i7);
            Rect rect = this.Y.o0;
            M(viewH, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.Y.o0.set(i6, i4, i3, i5);
        R0(this.Y.o0, i, i2);
    }

    public final void T0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.Y = null;
            this.X = null;
            this.p0 = 0;
            this.q0 = 0;
        } else {
            this.Y = recyclerView;
            this.X = recyclerView.k0;
            this.p0 = recyclerView.getWidth();
            this.q0 = recyclerView.getHeight();
        }
        this.n0 = 1073741824;
        this.o0 = 1073741824;
    }

    final boolean U0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.j0 && a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public int V(k kVar, q96 q96Var) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null || recyclerView.r0 == null || !q()) {
            return 1;
        }
        return this.Y.r0.a();
    }

    public boolean V0() {
        return false;
    }

    public final void W(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).Y;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.Y != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.Y.q0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean W0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (this.j0 && a0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && a0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final boolean X() {
        RecyclerView recyclerView = this.Y;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void X0(RecyclerView recyclerView, int i) {
        c cVar = new c(recyclerView.getContext());
        cVar.a = i;
        Y0(cVar);
    }

    public boolean Y() {
        return false;
    }

    public void Y0(c cVar) {
        c cVar2 = this.g0;
        if (cVar2 != null && cVar != cVar2 && cVar2.e) {
            cVar2.e();
        }
        this.g0 = cVar;
        RecyclerView recyclerView = this.Y;
        t96 t96Var = recyclerView.h1;
        t96Var.i0.removeCallbacks(t96Var);
        t96Var.Z.abortAnimation();
        cVar.b = recyclerView;
        cVar.c = this;
        int i = cVar.a;
        if (i == -1) {
            bt.q("Invalid target position");
            return;
        }
        recyclerView.k1.a = i;
        cVar.e = true;
        cVar.d = true;
        cVar.f = recyclerView.s0.D(i);
        cVar.b.h1.b();
    }

    public boolean Z() {
        return false;
    }

    public boolean Z0() {
        return this instanceof androidx.leanback.widget.GridLayoutManager;
    }

    public void c0(int i) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            int iE = recyclerView.k0.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.k0.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void d0(int i) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            int iE = recyclerView.k0.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.k0.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public boolean f0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = cw8.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = cw8.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View i0(View view, int i, k kVar, q96 q96Var) {
        return null;
    }

    public void j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.Y;
        k kVar = recyclerView.h0;
        q96 q96Var = recyclerView.k1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.Y.canScrollVertically(-1) && !this.Y.canScrollHorizontally(-1) && !this.Y.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        f fVar = this.Y.r0;
        if (fVar != null) {
            accessibilityEvent.setItemCount(fVar.a());
        }
    }

    public void k0(k kVar, q96 q96Var, h4 h4Var) {
        if (this.Y.canScrollVertically(-1) || this.Y.canScrollHorizontally(-1)) {
            h4Var.a(8192);
            h4Var.u(true);
            h4Var.j(67108864, true);
        }
        if (this.Y.canScrollVertically(1) || this.Y.canScrollHorizontally(1)) {
            h4Var.a(4096);
            h4Var.u(true);
            h4Var.j(67108864, true);
        }
        h4Var.n(f4.a(V(kVar, q96Var), K(kVar, q96Var), 0));
    }

    public final void l(View view) {
        m(view, -1, false);
    }

    public final void l0(View view, h4 h4Var) {
        l lVarN = RecyclerView.N(view);
        if (lVarN == null || lVarN.i()) {
            return;
        }
        lr0 lr0Var = this.X;
        if (lr0Var.c.contains(lVarN.a)) {
            return;
        }
        RecyclerView recyclerView = this.Y;
        m0(recyclerView.h0, recyclerView.k1, view, h4Var);
    }

    public final void m(View view, int i, boolean z) {
        l lVarN = RecyclerView.N(view);
        if (z || lVarN.i()) {
            l97 l97Var = (l97) this.Y.l0.Y;
            sw8 sw8VarA = (sw8) l97Var.get(lVarN);
            if (sw8VarA == null) {
                sw8VarA = sw8.a();
                l97Var.put(lVarN, sw8VarA);
            }
            sw8VarA.a |= 1;
        } else {
            this.Y.l0.F(lVarN);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (lVarN.q() || lVarN.j()) {
            if (lVarN.j()) {
                lVarN.n.m(lVarN);
            } else {
                lVarN.j &= -33;
            }
            this.X.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.Y;
            lr0 lr0Var = this.X;
            if (parent == recyclerView) {
                int iJ = lr0Var.j(view);
                if (i == -1) {
                    i = this.X.e();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.Y.indexOfChild(view) + this.Y.C());
                }
                if (iJ != i) {
                    j jVar = this.Y.s0;
                    View viewH = jVar.H(iJ);
                    if (viewH == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iJ + jVar.Y.toString());
                    }
                    jVar.H(iJ);
                    jVar.X.c(iJ);
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewH.getLayoutParams();
                    l lVarN2 = RecyclerView.N(viewH);
                    boolean zI = lVarN2.i();
                    RecyclerView recyclerView2 = jVar.Y;
                    if (zI) {
                        l97 l97Var2 = (l97) recyclerView2.l0.Y;
                        sw8 sw8VarA2 = (sw8) l97Var2.get(lVarN2);
                        if (sw8VarA2 == null) {
                            sw8VarA2 = sw8.a();
                            l97Var2.put(lVarN2, sw8VarA2);
                        }
                        sw8VarA2.a = 1 | sw8VarA2.a;
                    } else {
                        recyclerView2.l0.F(lVarN2);
                    }
                    jVar.X.b(viewH, i, layoutParams2, lVarN2.i());
                }
            } else {
                lr0Var.a(view, i, false);
                layoutParams.Z = true;
                c cVar = this.g0;
                if (cVar != null && cVar.e) {
                    cVar.b.getClass();
                    l lVarN3 = RecyclerView.N(view);
                    if ((lVarN3 != null ? lVarN3.c() : -1) == cVar.a) {
                        cVar.f = view;
                    }
                }
            }
        }
        if (layoutParams.f0) {
            if (RecyclerView.G1) {
                Objects.toString(layoutParams.X);
            }
            lVarN.a.invalidate();
            layoutParams.f0 = false;
        }
    }

    public void m0(k kVar, q96 q96Var, View view, h4 h4Var) {
        h4Var.o(g4.a(q() ? T(view) : 0, false, 1, p() ? T(view) : 0, 1));
    }

    public void n(String str) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public View n0(View view, int i) {
        return null;
    }

    public final void o(View view, Rect rect) {
        RecyclerView recyclerView = this.Y;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
    }

    public abstract boolean p();

    public abstract boolean q();

    public boolean r(RecyclerView.LayoutParams layoutParams) {
        return true;
    }

    public void t0(RecyclerView recyclerView, int i, int i2) {
        s0(i, i2);
    }

    public abstract void u0(k kVar, q96 q96Var);

    public int v(q96 q96Var) {
        return 0;
    }

    public int w(q96 q96Var) {
        return 0;
    }

    public void w0(k kVar, q96 q96Var, int i, int i2) {
        this.Y.q(i, i2);
    }

    public int x(q96 q96Var) {
        return 0;
    }

    public boolean x0(RecyclerView recyclerView, View view, View view2) {
        c cVar = this.g0;
        return (cVar != null && cVar.e) || recyclerView.R();
    }

    public int y(q96 q96Var) {
        return 0;
    }

    public int z(q96 q96Var) {
        return 0;
    }

    public Parcelable z0() {
        return null;
    }

    public void p0() {
    }

    public void A0(int i) {
    }

    public void N0(int i) {
    }

    public void e0(f fVar) {
    }

    public void g0(RecyclerView recyclerView) {
    }

    public void h0(RecyclerView recyclerView) {
    }

    public void v0(q96 q96Var) {
    }

    public void y0(Parcelable parcelable) {
    }

    public void o0(int i, int i2) {
    }

    public void q0(int i, int i2) {
    }

    public void r0(int i, int i2) {
    }

    public void s0(int i, int i2) {
    }

    public void u(int i, xr0 xr0Var) {
    }

    public void t(int i, int i2, q96 q96Var, xr0 xr0Var) {
    }
}
