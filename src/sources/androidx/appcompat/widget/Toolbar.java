package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar$LayoutParams;
import defpackage.a38;
import defpackage.c4;
import defpackage.cw8;
import defpackage.cy8;
import defpackage.f63;
import defpackage.fl2;
import defpackage.h66;
import defpackage.h70;
import defpackage.kn;
import defpackage.lr5;
import defpackage.nb8;
import defpackage.nt4;
import defpackage.ob8;
import defpackage.pb8;
import defpackage.rb8;
import defpackage.st4;
import defpackage.u70;
import defpackage.uw7;
import defpackage.w26;
import defpackage.wd1;
import defpackage.xb;
import defpackage.y4;
import defpackage.y45;
import defpackage.zq6;
import defpackage.zv7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A0;
    public final int B0;
    public CharSequence C0;
    public CharSequence D0;
    public ColorStateList E0;
    public ColorStateList F0;
    public boolean G0;
    public boolean H0;
    public final ArrayList I0;
    public final ArrayList J0;
    public final int[] K0;
    public final f63 L0;
    public ArrayList M0;
    public ob8 N0;
    public final lr5 O0;
    public i P0;
    public a Q0;
    public h R0;
    public h70 S0;
    public rb8 T0;
    public boolean U0;
    public kn V0;
    public OnBackInvokedDispatcher W0;
    public boolean X0;
    public final xb Y0;
    public ActionMenuView f0;
    public AppCompatTextView g0;
    public AppCompatTextView h0;
    public AppCompatImageButton i0;
    public AppCompatImageView j0;
    public final Drawable k0;
    public final CharSequence l0;
    public AppCompatImageButton m0;
    public View n0;
    public Context o0;
    public int p0;
    public int q0;
    public int r0;
    public final int s0;
    public final int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public zq6 y0;
    public int z0;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ActionBar$LayoutParams {
        public byte b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = (byte) 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B0 = 8388627;
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new int[2];
        this.L0 = new f63(new nb8(this, (byte) 1));
        this.M0 = new ArrayList();
        byte b = 23;
        this.O0 = new lr5(this, b);
        this.Y0 = new xb(this, b);
        zv7 zv7VarR = zv7.r(i, 0, getContext(), attributeSet, h66.Toolbar);
        cw8.m(this, context, h66.Toolbar, attributeSet, (TypedArray) zv7VarR.Y, i);
        int i2 = h66.Toolbar_titleTextAppearance;
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        this.q0 = typedArray.getResourceId(i2, 0);
        this.r0 = typedArray.getResourceId(h66.Toolbar_subtitleTextAppearance, 0);
        this.B0 = typedArray.getInteger(h66.Toolbar_android_gravity, 8388627);
        this.s0 = typedArray.getInteger(h66.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(h66.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(h66.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(h66.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.x0 = dimensionPixelOffset;
        this.w0 = dimensionPixelOffset;
        this.v0 = dimensionPixelOffset;
        this.u0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(h66.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.u0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(h66.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(h66.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.w0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(h66.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.x0 = dimensionPixelOffset5;
        }
        this.t0 = typedArray.getDimensionPixelSize(h66.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(h66.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(h66.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h66.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(h66.Toolbar_contentInsetRight, 0);
        d();
        zq6 zq6Var = this.y0;
        zq6Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            zq6Var.e = dimensionPixelSize;
            zq6Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            zq6Var.f = dimensionPixelSize2;
            zq6Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            zq6Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z0 = typedArray.getDimensionPixelOffset(h66.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.A0 = typedArray.getDimensionPixelOffset(h66.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.k0 = zv7VarR.e(h66.Toolbar_collapseIcon);
        this.l0 = typedArray.getText(h66.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(h66.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(h66.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.o0 = getContext();
        setPopupTheme(typedArray.getResourceId(h66.Toolbar_popupTheme, 0));
        Drawable drawableE = zv7VarR.e(h66.Toolbar_navigationIcon);
        if (drawableE != null) {
            setNavigationIcon(drawableE);
        }
        CharSequence text3 = typedArray.getText(h66.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableE2 = zv7VarR.e(h66.Toolbar_logo);
        if (drawableE2 != null) {
            setLogo(drawableE2);
        }
        CharSequence text4 = typedArray.getText(h66.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(h66.Toolbar_titleTextColor)) {
            setTitleTextColor(zv7VarR.c(h66.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(h66.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(zv7VarR.c(h66.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(h66.Toolbar_menu)) {
            getMenuInflater().inflate(typedArray.getResourceId(h66.Toolbar_menu, 0), getMenu());
        }
        zv7VarR.v();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new uw7(getContext());
    }

    public static LayoutParams h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.b = (byte) 0;
        layoutParams.a = 8388627;
        return layoutParams;
    }

    public static LayoutParams i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.b = (byte) 0;
            layoutParams3.b = layoutParams2.b;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar$LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar$LayoutParams) layoutParams);
            layoutParams4.b = (byte) 0;
            return layoutParams4;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            LayoutParams layoutParams5 = new LayoutParams(layoutParams);
            layoutParams5.b = (byte) 0;
            return layoutParams5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        LayoutParams layoutParams6 = new LayoutParams(marginLayoutParams);
        layoutParams6.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams6;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && t(childAt)) {
                    int i3 = layoutParams.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && t(childAt2)) {
                int i5 = layoutParams2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        LayoutParams layoutParamsI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsI = h();
        } else {
            layoutParamsI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsI.b = (byte) 1;
        if (!z || this.n0 == null) {
            addView(view, layoutParamsI);
        } else {
            view.setLayoutParams(layoutParamsI);
            this.J0.add(view);
        }
    }

    public final void c() {
        if (this.m0 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, w26.toolbarNavigationButtonStyle);
            this.m0 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.k0);
            this.m0.setContentDescription(this.l0);
            LayoutParams layoutParamsH = h();
            layoutParamsH.a = (this.s0 & 112) | 8388611;
            layoutParamsH.b = (byte) 2;
            this.m0.setLayoutParams(layoutParamsH);
            this.m0.setOnClickListener(new y4(this, (byte) 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void d() {
        if (this.y0 == null) {
            zq6 zq6Var = new zq6();
            zq6Var.a = 0;
            zq6Var.b = 0;
            zq6Var.c = Integer.MIN_VALUE;
            zq6Var.d = Integer.MIN_VALUE;
            zq6Var.e = 0;
            zq6Var.f = 0;
            zq6Var.g = false;
            zq6Var.h = false;
            this.y0 = zq6Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f0;
        if (actionMenuView.u0 == null) {
            nt4 nt4Var = (nt4) actionMenuView.getMenu();
            if (this.R0 == null) {
                this.R0 = new h(this);
            }
            this.f0.setExpandedActionViewsExclusive(true);
            nt4Var.b(this.R0, this.o0);
            v();
        }
    }

    public final void f() {
        if (this.f0 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f0 = actionMenuView;
            actionMenuView.setPopupTheme(this.p0);
            this.f0.setOnMenuItemClickListener(this.O0);
            ActionMenuView actionMenuView2 = this.f0;
            h70 h70Var = this.S0;
            y45 y45Var = new y45(this);
            actionMenuView2.z0 = h70Var;
            actionMenuView2.A0 = y45Var;
            LayoutParams layoutParamsH = h();
            layoutParamsH.a = (this.s0 & 112) | 8388613;
            this.f0.setLayoutParams(layoutParamsH);
            b(this.f0, false);
        }
    }

    public final void g() {
        if (this.i0 == null) {
            this.i0 = new AppCompatImageButton(getContext(), null, w26.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsH = h();
            layoutParamsH.a = (this.s0 & 112) | 8388611;
            this.i0.setLayoutParams(layoutParamsH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.m0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.m0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        zq6 zq6Var = this.y0;
        if (zq6Var != null) {
            return zq6Var.g ? zq6Var.a : zq6Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        zq6 zq6Var = this.y0;
        if (zq6Var != null) {
            return zq6Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        zq6 zq6Var = this.y0;
        if (zq6Var != null) {
            return zq6Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        zq6 zq6Var = this.y0;
        if (zq6Var != null) {
            return zq6Var.g ? zq6Var.b : zq6Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        nt4 nt4Var;
        ActionMenuView actionMenuView = this.f0;
        return (actionMenuView == null || (nt4Var = actionMenuView.u0) == null || !nt4Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.j0;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.j0;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f0.getMenu();
    }

    public View getNavButtonView() {
        return this.i0;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.i0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.i0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public a getOuterActionMenuPresenter() {
        return this.Q0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f0.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o0;
    }

    public int getPopupTheme() {
        return this.p0;
    }

    public CharSequence getSubtitle() {
        return this.D0;
    }

    public final TextView getSubtitleTextView() {
        return this.h0;
    }

    public CharSequence getTitle() {
        return this.C0;
    }

    public int getTitleMarginBottom() {
        return this.x0;
    }

    public int getTitleMarginEnd() {
        return this.v0;
    }

    public int getTitleMarginStart() {
        return this.u0;
    }

    public int getTitleMarginTop() {
        return this.w0;
    }

    public final TextView getTitleTextView() {
        return this.g0;
    }

    public wd1 getWrapper() {
        i iVar = this.P0;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, true);
        this.P0 = iVar2;
        return iVar2;
    }

    public final int j(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.M0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.L0.Z).iterator();
        while (it2.hasNext()) {
            ((fl2) it2.next()).a.l();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J0.contains(view);
    }

    public final boolean o() {
        a aVar;
        ActionMenuView actionMenuView = this.f0;
        return (actionMenuView == null || (aVar = actionMenuView.y0) == null || !aVar.j()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Y0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H0 = false;
        }
        if (!this.H0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.H0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H0 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iP2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.K0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = cw8.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.i0)) {
            AppCompatImageButton appCompatImageButton2 = this.i0;
            if (z3) {
                iQ = q(appCompatImageButton2, i26, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (t(this.m0)) {
                appCompatImageButton = this.m0;
                if (z3) {
                    iQ = q(appCompatImageButton, iQ, iMin2, iArr);
                } else {
                    iP = p(appCompatImageButton, iP, iMin2, iArr);
                }
            }
            if (t(this.f0)) {
                actionMenuView = this.f0;
                if (z3) {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                } else {
                    iQ = q(actionMenuView, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i26 - currentContentInsetRight);
            if (t(this.n0)) {
                view = this.n0;
                if (z3) {
                    iMin = q(view, iMin, iMin2, iArr);
                } else {
                    iMax = p(view, iMax, iMin2, iArr);
                }
            }
            if (t(this.j0)) {
                appCompatImageView = this.j0;
                if (z3) {
                    iMin = q(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = p(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zT = t(this.g0);
            zT2 = t(this.h0);
            if (zT) {
                LayoutParams layoutParams3 = (LayoutParams) this.g0.getLayoutParams();
                measuredHeight = this.g0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                LayoutParams layoutParams4 = (LayoutParams) this.h0.getLayoutParams();
                measuredHeight = this.h0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    appCompatTextView = this.g0;
                } else {
                    appCompatTextView = this.h0;
                }
                if (zT2) {
                    appCompatTextView2 = this.h0;
                } else {
                    appCompatTextView2 = this.g0;
                }
                layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
                layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zT && this.g0.getMeasuredWidth() > 0) || (zT2 && this.h0.getMeasuredWidth() > 0);
                i6 = this.B0 & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i17 = this.x0;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.x0) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.u0;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zT) {
                        LayoutParams layoutParams5 = (LayoutParams) this.g0.getLayoutParams();
                        int measuredWidth2 = iMin - this.g0.getMeasuredWidth();
                        int measuredHeight2 = this.g0.getMeasuredHeight() + paddingTop;
                        this.g0.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.v0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zT2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                        this.h0.layout(iMin - this.h0.getMeasuredWidth(), i28, iMin, this.h0.getMeasuredHeight() + i28);
                        i13 = iMin - this.v0;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.u0;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zT) {
                        LayoutParams layoutParams6 = (LayoutParams) this.g0.getLayoutParams();
                        int measuredWidth3 = this.g0.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.g0.getMeasuredHeight() + paddingTop;
                        this.g0.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.v0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zT2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.h0.getMeasuredWidth() + iMax;
                        this.h0.layout(iMax, i30, measuredWidth4, this.h0.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.v0;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.I0;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                LayoutParams layoutParams7 = (LayoutParams) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iP2) {
                if (i25 > iMin) {
                    iP2 = i24 - (i25 - iMin);
                } else {
                    iP2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i26;
        if (t(this.m0)) {
            appCompatImageButton = this.m0;
            if (z3) {
                iQ = q(appCompatImageButton, iQ, iMin2, iArr);
            } else {
                iP = p(appCompatImageButton, iP, iMin2, iArr);
            }
        }
        if (t(this.f0)) {
            actionMenuView = this.f0;
            if (z3) {
                iP = p(actionMenuView, iP, iMin2, iArr);
            } else {
                iQ = q(actionMenuView, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i26 - currentContentInsetRight2);
        if (t(this.n0)) {
            view = this.n0;
            if (z3) {
                iMin = q(view, iMin, iMin2, iArr);
            } else {
                iMax = p(view, iMax, iMin2, iArr);
            }
        }
        if (t(this.j0)) {
            appCompatImageView = this.j0;
            if (z3) {
                iMin = q(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = p(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zT = t(this.g0);
        zT2 = t(this.h0);
        if (zT) {
            LayoutParams layoutParams8 = (LayoutParams) this.g0.getLayoutParams();
            measuredHeight = this.g0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            LayoutParams layoutParams9 = (LayoutParams) this.h0.getLayoutParams();
            measuredHeight = this.h0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                appCompatTextView = this.g0;
            } else {
                appCompatTextView = this.h0;
            }
            if (zT2) {
                appCompatTextView2 = this.h0;
            } else {
                appCompatTextView2 = this.g0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.B0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i17 = this.x0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.x0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.u0;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zT) {
                    LayoutParams layoutParams10 = (LayoutParams) this.g0.getLayoutParams();
                    int measuredWidth5 = iMin - this.g0.getMeasuredWidth();
                    int measuredHeight4 = this.g0.getMeasuredHeight() + paddingTop;
                    this.g0.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.v0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                    this.h0.layout(iMin - this.h0.getMeasuredWidth(), i211, iMin, this.h0.getMeasuredHeight() + i211);
                    i13 = iMin - this.v0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.u0;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zT) {
                    LayoutParams layoutParams11 = (LayoutParams) this.g0.getLayoutParams();
                    int measuredWidth6 = this.g0.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.g0.getMeasuredHeight() + paddingTop;
                    this.g0.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.v0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.h0.getMeasuredWidth() + iMax;
                    this.h0.layout(iMax, i35, measuredWidth7, this.h0.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.v0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zT) {
                appCompatTextView = this.g0;
            } else {
                appCompatTextView = this.h0;
            }
            if (zT2) {
                appCompatTextView2 = this.h0;
            } else {
                appCompatTextView2 = this.g0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.B0 & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.w0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i17 = this.x0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.x0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.u0;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zT) {
                    LayoutParams layoutParams12 = (LayoutParams) this.g0.getLayoutParams();
                    int measuredWidth8 = iMin - this.g0.getMeasuredWidth();
                    int measuredHeight6 = this.g0.getMeasuredHeight() + paddingTop;
                    this.g0.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.v0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                    this.h0.layout(iMin - this.h0.getMeasuredWidth(), i214, iMin, this.h0.getMeasuredHeight() + i214);
                    i13 = iMin - this.v0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.u0;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zT) {
                    LayoutParams layoutParams13 = (LayoutParams) this.g0.getLayoutParams();
                    int measuredWidth9 = this.g0.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.g0.getMeasuredHeight() + paddingTop;
                    this.g0.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.v0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.h0.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.h0.getMeasuredWidth() + iMax;
                    this.h0.layout(iMax, i36, measuredWidth10, this.h0.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.v0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.I0;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i18 < size) {
            iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            LayoutParams layoutParams14 = (LayoutParams) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iP2) {
            if (i25 > iMin) {
                iP2 = i24 - (i25 - iMin);
            } else {
                iP2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = cy8.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.i0)) {
            s(this.i0, i, 0, i2, this.t0);
            iK = k(this.i0) + this.i0.getMeasuredWidth();
            iMax = Math.max(0, l(this.i0) + this.i0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.i0.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.m0)) {
            s(this.m0, i, 0, i2, this.t0);
            iK = k(this.m0) + this.m0.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.m0) + this.m0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.K0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.f0)) {
            s(this.f0, i, iMax3, i2, this.t0);
            iK2 = k(this.f0) + this.f0.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f0) + this.f0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f0.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.n0)) {
            iMax5 += r(this.n0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.n0) + this.n0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n0.getMeasuredState());
        }
        if (t(this.j0)) {
            iMax5 += r(this.j0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.j0) + this.j0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.w0 + this.x0;
        int i7 = this.u0 + this.v0;
        if (t(this.g0)) {
            r(this.g0, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.g0) + this.g0.getMeasuredWidth();
            iL = l(this.g0) + this.g0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.g0.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.h0)) {
            iMax2 = Math.max(iMax2, r(this.h0, i, i5 + i7, i2, iL + i6, iArr));
            iL += l(this.h0) + this.h0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.h0.getMeasuredState());
        }
        if (t(this.g0) || t(this.h0)) {
            iL += i6;
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.U0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof pb8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pb8 pb8Var = (pb8) parcelable;
        super.onRestoreInstanceState(pb8Var.X);
        ActionMenuView actionMenuView = this.f0;
        nt4 nt4Var = actionMenuView != null ? actionMenuView.u0 : null;
        int i = pb8Var.Z;
        if (i != 0 && this.R0 != null && nt4Var != null && (menuItemFindItem = nt4Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (pb8Var.f0) {
            xb xbVar = this.Y0;
            removeCallbacks(xbVar);
            post(xbVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        zq6 zq6Var = this.y0;
        boolean z = i == 1;
        if (z == zq6Var.g) {
            return;
        }
        zq6Var.g = z;
        if (!zq6Var.h) {
            zq6Var.a = zq6Var.e;
            zq6Var.b = zq6Var.f;
            return;
        }
        if (z) {
            int i2 = zq6Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = zq6Var.e;
            }
            zq6Var.a = i2;
            int i3 = zq6Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = zq6Var.f;
            }
            zq6Var.b = i3;
            return;
        }
        int i4 = zq6Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = zq6Var.e;
        }
        zq6Var.a = i4;
        int i5 = zq6Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = zq6Var.f;
        }
        zq6Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        st4 st4Var;
        pb8 pb8Var = new pb8(super.onSaveInstanceState());
        h hVar = this.R0;
        if (hVar != null && (st4Var = hVar.Y) != null) {
            pb8Var.Z = st4Var.a;
        }
        pb8Var.f0 = o();
        return pb8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G0 = false;
        }
        if (!this.G0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.G0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.X0 != z) {
            this.X0 = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.m0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.m0.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.m0;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.k0);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.U0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0) {
            this.A0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z0) {
            this.z0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.j0;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext(), null);
                this.j0 = appCompatImageView;
            }
            if (!n(appCompatImageView)) {
                b(this.j0, true);
            }
        } else if (appCompatImageView != null && n(appCompatImageView)) {
            removeView(this.j0);
            this.J0.remove(this.j0);
        }
        AppCompatImageView appCompatImageView2 = this.j0;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j0 == null) {
            this.j0 = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.j0;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.i0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            a38.f(this.i0, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i0)) {
                b(this.i0, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.i0;
            if (appCompatImageButton != null && n(appCompatImageButton)) {
                removeView(this.i0);
                this.J0.remove(this.i0);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.i0;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i0.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(ob8 ob8Var) {
        this.N0 = ob8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f0.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            if (i == 0) {
                this.o0 = getContext();
            } else {
                this.o0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.h0;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.h0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.h0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r0;
                if (i != 0) {
                    this.h0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F0;
                if (colorStateList != null) {
                    this.h0.setTextColor(colorStateList);
                }
            }
            if (!n(this.h0)) {
                b(this.h0, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.h0);
            this.J0.remove(this.h0);
        }
        AppCompatTextView appCompatTextView3 = this.h0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.D0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        AppCompatTextView appCompatTextView = this.h0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.g0;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.g0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.g0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q0;
                if (i != 0) {
                    this.g0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E0;
                if (colorStateList != null) {
                    this.g0.setTextColor(colorStateList);
                }
            }
            if (!n(this.g0)) {
                b(this.g0, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.g0);
            this.J0.remove(this.g0);
        }
        AppCompatTextView appCompatTextView3 = this.g0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.C0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.x0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.v0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.u0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.w0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E0 = colorStateList;
        AppCompatTextView appCompatTextView = this.g0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        a aVar;
        ActionMenuView actionMenuView = this.f0;
        return (actionMenuView == null || (aVar = actionMenuView.y0) == null || !aVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c4.a(this);
            h hVar = this.R0;
            byte b = 0;
            boolean z = (hVar == null || hVar.Y == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.X0) ? false : true;
            if (!z || this.W0 != null) {
                if (z || (onBackInvokedDispatcher = this.W0) == null) {
                    return;
                }
                c4.I(onBackInvokedDispatcher, this.V0);
                this.W0 = null;
                return;
            }
            kn knVar = this.V0;
            if (knVar == null) {
                kn knVar2 = new kn(new nb8(this, b), (byte) 4);
                this.V0 = knVar2;
                knVar = knVar2;
            }
            c4.H(onBackInvokedDispatcherA, knVar);
            this.W0 = onBackInvokedDispatcherA;
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(u70.O(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(u70.O(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(u70.O(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.toolbarStyle);
    }
}
