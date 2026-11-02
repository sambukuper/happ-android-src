package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bt;
import defpackage.cw8;
import defpackage.cy8;
import defpackage.d46;
import defpackage.g5;
import defpackage.h66;
import defpackage.ku4;
import defpackage.l5;
import defpackage.nt4;
import defpackage.qx8;
import defpackage.u46;
import defpackage.u70;
import defpackage.w26;
import defpackage.y4;
import defpackage.z;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public final z f0;
    public final Context g0;
    public ActionMenuView h0;
    public a i0;
    public int j0;
    public qx8 k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n0;
    public CharSequence o0;
    public View p0;
    public View q0;
    public View r0;
    public LinearLayout s0;
    public TextView t0;
    public TextView u0;
    public final int v0;
    public final int w0;
    public boolean x0;
    public final int y0;
    public int z0;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f0 = new z(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(w26.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.g0 = context;
        } else {
            this.g0 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.ActionMode, i, 0);
        int i2 = h66.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : u70.O(context, resourceId));
        this.v0 = typedArrayObtainStyledAttributes.getResourceId(h66.ActionMode_titleTextStyle, 0);
        this.w0 = typedArrayObtainStyledAttributes.getResourceId(h66.ActionMode_subtitleTextStyle, 0);
        this.j0 = typedArrayObtainStyledAttributes.getLayoutDimension(h66.ActionMode_height, 0);
        this.y0 = typedArrayObtainStyledAttributes.getResourceId(h66.ActionMode_closeItemLayout, u46.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
        this.C0 = getPaddingLeft();
        this.D0 = getPaddingTop();
        this.E0 = getPaddingRight();
        this.F0 = getPaddingBottom();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(l5 l5Var) {
        View view = this.p0;
        byte b = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.y0, (ViewGroup) this, false);
            this.p0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.p0);
        }
        View viewFindViewById = this.p0.findViewById(d46.action_mode_close_button);
        this.q0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new y4(l5Var, b));
        nt4 nt4VarE = l5Var.e();
        a aVar = this.i0;
        if (aVar != null) {
            aVar.f();
            g5 g5Var = aVar.v0;
            if (g5Var != null && g5Var.b()) {
                g5Var.j.dismiss();
            }
        }
        a aVar2 = new a(getContext());
        this.i0 = aVar2;
        aVar2.n0 = true;
        aVar2.o0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        nt4VarE.b(this.i0, this.g0);
        a aVar3 = this.i0;
        ku4 ku4Var = aVar3.j0;
        if (ku4Var == null) {
            ku4 ku4Var2 = (ku4) aVar3.f0.inflate(aVar3.h0, (ViewGroup) this, false);
            aVar3.j0 = ku4Var2;
            ku4Var2.b(aVar3.Z);
            aVar3.i();
        }
        ku4 ku4Var3 = aVar3.j0;
        if (ku4Var != ku4Var3) {
            ((ActionMenuView) ku4Var3).setPresenter(aVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ku4Var3;
        this.h0 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h0, layoutParams);
    }

    public final void d() {
        if (this.s0 == null) {
            LayoutInflater.from(getContext()).inflate(u46.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s0 = linearLayout;
            this.t0 = (TextView) linearLayout.findViewById(d46.action_bar_title);
            this.u0 = (TextView) this.s0.findViewById(d46.action_bar_subtitle);
            int i = this.v0;
            if (i != 0) {
                this.t0.setTextAppearance(getContext(), i);
            }
            int i2 = this.w0;
            if (i2 != 0) {
                this.u0.setTextAppearance(getContext(), i2);
            }
        }
        this.t0.setText(this.n0);
        this.u0.setText(this.o0);
        boolean zIsEmpty = TextUtils.isEmpty(this.n0);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.o0);
        this.u0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.s0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.s0.getParent() == null) {
            addView(this.s0);
        }
    }

    public final void e() {
        removeAllViews();
        this.r0 = null;
        this.h0 = null;
        this.i0 = null;
        View view = this.q0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h66.ActionBar, w26.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(h66.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        a aVar = this.i0;
        if (aVar != null) {
            Configuration configuration2 = aVar.Y.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            aVar.r0 = i;
            nt4 nt4Var = aVar.Z;
            if (nt4Var != null) {
                nt4Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.k0 != null ? this.f0.b : getVisibility();
    }

    public int getContentHeight() {
        return this.j0;
    }

    public CharSequence getSubtitle() {
        return this.o0;
    }

    public CharSequence getTitle() {
        return this.n0;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            qx8 qx8Var = this.k0;
            if (qx8Var != null) {
                qx8Var.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qx8 j(int i, long j) {
        qx8 qx8Var = this.k0;
        if (qx8Var != null) {
            qx8Var.b();
        }
        z zVar = this.f0;
        if (i != 0) {
            qx8 qx8VarA = cw8.a(this);
            qx8VarA.a(0.0f);
            qx8VarA.c(j);
            zVar.c.k0 = qx8VarA;
            zVar.b = i;
            qx8VarA.d(zVar);
            return qx8VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        qx8 qx8VarA2 = cw8.a(this);
        qx8VarA2.a(1.0f);
        qx8VarA2.c(j);
        zVar.c.k0 = qx8VarA2;
        zVar.b = i;
        qx8VarA2.d(zVar);
        return qx8VarA2;
    }

    public final void k() {
        super.setPadding(this.z0 + this.C0, this.A0 + this.D0, this.B0 + this.E0, this.F0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h66.ActionMode, w26.actionModeStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(h66.ActionMode_height, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i0;
        if (aVar != null) {
            aVar.f();
            g5 g5Var = this.i0.v0;
            if (g5Var == null || !g5Var.b()) {
                return;
            }
            g5Var.j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m0 = false;
        }
        if (!this.m0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.m0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.m0 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = cy8.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p0.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iH = h(this.p0, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iH - i6 : iH + i6;
        }
        LinearLayout linearLayout = this.s0;
        if (linearLayout != null && this.r0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(this.s0, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.r0;
        if (view2 != null) {
            h(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h0;
        if (actionMenuView != null) {
            h(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            bt.i(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            bt.i(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.j0;
        int size2 = i3 > 0 ? i3 + this.A0 : View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.p0;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p0.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h0;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h0, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.s0;
        if (linearLayout != null && this.r0 == null) {
            if (this.x0) {
                this.s0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.s0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.s0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.r0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.r0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.j0 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l0 = false;
        }
        if (!this.l0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.l0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.l0 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.j0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r0;
        if (view2 != null) {
            removeView(view2);
        }
        this.r0 = view;
        if (view != null && (linearLayout = this.s0) != null) {
            removeView(linearLayout);
            this.s0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.C0 = i;
        this.D0 = i2;
        this.E0 = i3;
        this.F0 = i4;
        k();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.C0 = i;
            this.E0 = i3;
        } else {
            this.C0 = i3;
            this.E0 = i;
        }
        this.D0 = i2;
        this.F0 = i4;
        k();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.o0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.n0 = charSequence;
        d();
        cw8.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x0) {
            requestLayout();
        }
        this.x0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.actionModeStyle);
    }
}
