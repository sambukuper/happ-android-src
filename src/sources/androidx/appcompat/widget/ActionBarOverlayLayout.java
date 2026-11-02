package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.a5;
import defpackage.b5;
import defpackage.bt;
import defpackage.c5;
import defpackage.cw8;
import defpackage.d19;
import defpackage.d35;
import defpackage.d46;
import defpackage.e19;
import defpackage.e35;
import defpackage.f19;
import defpackage.fe3;
import defpackage.g19;
import defpackage.h19;
import defpackage.hu4;
import defpackage.i19;
import defpackage.j19;
import defpackage.k19;
import defpackage.nt4;
import defpackage.rb0;
import defpackage.s09;
import defpackage.sx8;
import defpackage.t19;
import defpackage.u70;
import defpackage.uv8;
import defpackage.vd1;
import defpackage.w19;
import defpackage.w26;
import defpackage.wd1;
import defpackage.z4;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements vd1, d35, e35 {
    public static final int[] K0 = {w26.actionBarSize, R.attr.windowContentOverlay};
    public static final w19 L0;
    public static final Rect M0;
    public w19 A0;
    public w19 B0;
    public b5 C0;
    public OverScroller D0;
    public ViewPropertyAnimator E0;
    public final z4 F0;
    public final a5 G0;
    public final a5 H0;
    public final rb0 I0;
    public final c5 J0;
    public int f0;
    public int g0;
    public ContentFrameLayout h0;
    public ActionBarContainer i0;
    public wd1 j0;
    public Drawable k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final Rect r0;
    public final Rect s0;
    public final Rect t0;
    public final Rect u0;
    public final Rect v0;
    public boolean w0;
    public boolean x0;
    public w19 y0;
    public w19 z0;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        k19 e19Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            e19Var = new j19();
        } else if (i >= 35) {
            e19Var = new i19();
        } else if (i >= 34) {
            e19Var = new h19();
        } else if (i >= 31) {
            e19Var = new g19();
        } else if (i >= 30) {
            e19Var = new f19();
        } else {
            e19Var = i >= 29 ? new e19() : new d19();
        }
        e19Var.h(fe3.c(0, 1, 0, 1));
        L0 = e19Var.b();
        M0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = 0;
        this.r0 = new Rect();
        this.s0 = new Rect();
        this.t0 = new Rect();
        this.u0 = new Rect();
        this.v0 = new Rect();
        this.w0 = true;
        this.x0 = false;
        w19 w19Var = w19.b;
        this.y0 = w19Var;
        this.z0 = w19Var;
        this.A0 = w19Var;
        this.B0 = w19Var;
        this.F0 = new z4(this, (byte) 0);
        this.G0 = new a5(this, (byte) 0);
        this.H0 = new a5(this, (byte) 1);
        h(context);
        this.I0 = new rb0();
        c5 c5Var = new c5(context);
        c5Var.setWillNotDraw(true);
        this.J0 = c5Var;
        addView(c5Var);
    }

    public static boolean k(View view, int i, int i2, int i3, int i4) {
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) layoutParams).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
        return true;
    }

    @Override // defpackage.e35
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.d35
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.d35
    public final boolean c(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.d35
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.k0 != null) {
            if (this.i0.getVisibility() == 0) {
                translationY = (int) (this.i0.getTranslationY() + this.i0.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.k0.setBounds(0, translationY, getWidth(), this.k0.getIntrinsicHeight() + translationY);
            this.k0.draw(canvas);
        }
    }

    @Override // defpackage.d35
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void g() {
        removeCallbacks(this.G0);
        removeCallbacks(this.H0);
        ViewPropertyAnimator viewPropertyAnimator = this.E0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i0;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        rb0 rb0Var = this.I0;
        return rb0Var.b | rb0Var.a;
    }

    public CharSequence getTitle() {
        j();
        return ((i) this.j0).a.getTitle();
    }

    public final void h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K0);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.k0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.D0 = new OverScroller(context);
    }

    public final void i(int i) {
        j();
        if (i == 2) {
            this.j0.getClass();
        } else if (i == 5) {
            this.j0.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void j() {
        wd1 wrapper;
        if (this.h0 == null) {
            this.h0 = (ContentFrameLayout) findViewById(d46.action_bar_activity_content);
            this.i0 = (ActionBarContainer) findViewById(d46.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(d46.action_bar);
            if (callbackFindViewById instanceof wd1) {
                wrapper = (wd1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    bt.i("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.j0 = wrapper;
        }
    }

    public final void l(nt4 nt4Var, hu4 hu4Var) {
        j();
        i iVar = (i) this.j0;
        Toolbar toolbar = iVar.a;
        a aVar = iVar.m;
        if (aVar == null) {
            aVar = new a(toolbar.getContext());
            iVar.m = aVar;
        }
        aVar.g0 = hu4Var;
        if (nt4Var == null && toolbar.f0 == null) {
            return;
        }
        toolbar.f();
        nt4 nt4Var2 = toolbar.f0.u0;
        if (nt4Var2 == nt4Var) {
            return;
        }
        if (nt4Var2 != null) {
            nt4Var2.r(toolbar.Q0);
            nt4Var2.r(toolbar.R0);
        }
        if (toolbar.R0 == null) {
            toolbar.R0 = new h(toolbar);
        }
        aVar.s0 = true;
        Context context = toolbar.o0;
        if (nt4Var != null) {
            nt4Var.b(aVar, context);
            nt4Var.b(toolbar.R0, toolbar.o0);
        } else {
            aVar.k(context, null);
            toolbar.R0.k(toolbar.o0, null);
            aVar.i();
            toolbar.R0.i();
        }
        toolbar.f0.setPopupTheme(toolbar.p0);
        toolbar.f0.setPresenter(aVar);
        toolbar.Q0 = aVar;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = cw8.a;
        c5 c5Var = this.J0;
        w19 w19Var = L0;
        Rect rect = this.v0;
        uv8.b(c5Var, w19Var, rect);
        boolean zEquals = rect.equals(M0);
        this.w0 = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.x0 = z4;
        b5 b5Var = this.C0;
        if (b5Var != null) {
            ((s09) b5Var).u = (z2 || z4) ? false : true;
        }
        w19 w19VarG = w19.g(this, windowInsets);
        t19 t19Var = w19VarG.a;
        fe3 fe3VarM = t19Var.m();
        int i = fe3VarM.a;
        int i2 = fe3VarM.a;
        int i3 = fe3VarM.b;
        int i4 = fe3VarM.c;
        this.u0.set(i, i3, i4, fe3VarM.d);
        if (this.x0) {
            fe3 fe3VarH = t19Var.h(2);
            int i5 = fe3VarH.a;
            int i6 = fe3VarH.c;
            this.i0.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.i0, fe3VarH.a, 0, i6, 0);
        } else {
            this.i0.setPadding(0, 0, 0, 0);
            zK = k(this.i0, i2, i3, i4, 0);
        }
        Rect rect2 = this.r0;
        uv8.b(this, w19VarG, rect2);
        w19 w19VarQ = t19Var.q(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.y0 = w19VarQ;
        if (!this.z0.equals(w19VarQ)) {
            this.z0 = this.y0;
            zK = true;
        }
        Rect rect3 = this.s0;
        if (rect3.equals(rect2)) {
            z = zK;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return t19Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        WeakHashMap weakHashMap = cw8.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k19 e19Var;
        j();
        measureChildWithMargins(this.i0, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.i0.getLayoutParams();
        int iMax = Math.max(0, this.i0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.i0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.i0.getMeasuredState());
        WeakHashMap weakHashMap = cw8.a;
        boolean z = (getWindowSystemUiVisibility() & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z) {
            measuredHeight = this.f0;
            if (this.x0) {
                measuredHeight += this.u0.top;
            }
            if (this.m0 && this.i0.getTabContainer() != null) {
                measuredHeight += this.f0;
            }
        } else {
            measuredHeight = this.i0.getVisibility() != 8 ? this.i0.getMeasuredHeight() : 0;
        }
        Rect rect = this.r0;
        Rect rect2 = this.t0;
        rect2.set(rect);
        w19 w19Var = this.y0;
        this.A0 = w19Var;
        if (this.l0 || z || !this.w0) {
            fe3 fe3VarC = this.x0 ? fe3.c(w19Var.b(), Math.max(this.A0.d(), measuredHeight), this.A0.c(), Math.max(this.A0.a(), 0)) : fe3.c(w19Var.b(), this.A0.d() + measuredHeight, this.A0.c(), this.A0.a());
            w19 w19Var2 = this.A0;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                e19Var = new j19(w19Var2);
            } else if (i3 >= 35) {
                e19Var = new i19(w19Var2);
            } else if (i3 >= 34) {
                e19Var = new h19(w19Var2);
            } else if (i3 >= 31) {
                e19Var = new g19(w19Var2);
            } else if (i3 >= 30) {
                e19Var = new f19(w19Var2);
            } else {
                e19Var = i3 >= 29 ? new e19(w19Var2) : new d19(w19Var2);
            }
            e19Var.h(fe3VarC);
            this.A0 = e19Var.b();
        } else {
            boolean z2 = this.x0;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.A0 = this.A0.a.q(0, measuredHeight, 0, 0);
        }
        k(this.h0, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.B0.equals(this.A0)) {
            w19 w19Var3 = this.A0;
            this.B0 = w19Var3;
            cw8.b(this.h0, w19Var3);
        }
        measureChildWithMargins(this.h0, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.h0.getLayoutParams();
        int iMax3 = Math.max(iMax, this.h0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.h0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.h0.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n0 || !z) {
            return false;
        }
        this.D0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.D0.getFinalY() > this.i0.getHeight()) {
            g();
            this.H0.run();
        } else {
            g();
            this.G0.run();
        }
        this.o0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p0 + i2;
        this.p0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        s09 s09Var;
        sx8 sx8Var;
        this.I0.a = i;
        this.p0 = getActionBarHideOffset();
        g();
        b5 b5Var = this.C0;
        if (b5Var == null || (sx8Var = (s09Var = (s09) b5Var).y) == null) {
            return;
        }
        sx8Var.a();
        s09Var.y = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i0.getVisibility() != 0) {
            return false;
        }
        return this.n0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n0 || this.o0) {
            return;
        }
        if (this.p0 <= this.i0.getHeight()) {
            g();
            postDelayed(this.G0, 600L);
        } else {
            g();
            postDelayed(this.H0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.q0 ^ i;
        this.q0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        b5 b5Var = this.C0;
        if (b5Var != null) {
            s09 s09Var = (s09) b5Var;
            s09Var.u = (z2 || this.x0) ? false : true;
            if (z || !z2) {
                if (s09Var.v) {
                    s09Var.v = false;
                    s09Var.x0(true);
                }
            } else if (!s09Var.v) {
                s09Var.v = true;
                s09Var.x0(true);
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.C0 == null) {
            return;
        }
        WeakHashMap weakHashMap = cw8.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g0 = i;
        b5 b5Var = this.C0;
        if (b5Var != null) {
            ((s09) b5Var).t = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        g();
        this.i0.setTranslationY(-Math.max(0, Math.min(i, this.i0.getHeight())));
    }

    public void setActionBarVisibilityCallback(b5 b5Var) {
        this.C0 = b5Var;
        if (getWindowToken() != null) {
            ((s09) this.C0).t = this.g0;
            int i = this.q0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = cw8.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n0) {
            this.n0 = z;
            if (z) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        i iVar = (i) this.j0;
        iVar.d = i != 0 ? u70.O(iVar.a.getContext(), i) : null;
        iVar.c();
    }

    public void setLogo(int i) {
        j();
        i iVar = (i) this.j0;
        iVar.e = i != 0 ? u70.O(iVar.a.getContext(), i) : null;
        iVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.l0 = z;
    }

    @Override // defpackage.vd1
    public void setWindowCallback(Window.Callback callback) {
        j();
        ((i) this.j0).k = callback;
    }

    @Override // defpackage.vd1
    public void setWindowTitle(CharSequence charSequence) {
        j();
        i iVar = (i) this.j0;
        if (iVar.g) {
            return;
        }
        Toolbar toolbar = iVar.a;
        iVar.h = charSequence;
        if ((iVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (iVar.g) {
                cw8.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(Drawable drawable) {
        j();
        i iVar = (i) this.j0;
        iVar.d = drawable;
        iVar.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.d35
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }
}
