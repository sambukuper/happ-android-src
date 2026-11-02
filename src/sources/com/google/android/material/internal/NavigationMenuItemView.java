package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.a38;
import defpackage.c46;
import defpackage.cw8;
import defpackage.j36;
import defpackage.ju4;
import defpackage.p36;
import defpackage.r20;
import defpackage.s46;
import defpackage.st4;
import defpackage.w26;
import defpackage.xf6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements ju4 {
    public static final int[] L0 = {R.attr.state_checked};
    public int A0;
    public boolean B0;
    public boolean C0;
    public final boolean D0;
    public final CheckedTextView E0;
    public FrameLayout F0;
    public st4 G0;
    public ColorStateList H0;
    public boolean I0;
    public Drawable J0;
    public final r20 K0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D0 = true;
        r20 r20Var = new r20(this, (byte) 7);
        this.K0 = r20Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(s46.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(j36.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(c46.design_menu_item_text);
        this.E0 = checkedTextView;
        cw8.n(checkedTextView, r20Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F0 == null) {
                this.F0 = (FrameLayout) ((ViewStub) findViewById(c46.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F0.removeAllViews();
            this.F0.addView(view);
        }
    }

    @Override // defpackage.ju4
    public final void c(st4 st4Var) {
        StateListDrawable stateListDrawable;
        this.G0 = st4Var;
        int i = st4Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(st4Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(w26.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(st4Var.isCheckable());
        setChecked(st4Var.isChecked());
        setEnabled(st4Var.isEnabled());
        setTitle(st4Var.e);
        setIcon(st4Var.getIcon());
        setActionView(st4Var.getActionView());
        setContentDescription(st4Var.q);
        a38.f(this, st4Var.r);
        st4 st4Var2 = this.G0;
        CharSequence charSequence = st4Var2.e;
        CheckedTextView checkedTextView = this.E0;
        if (charSequence == null && st4Var2.getIcon() == null && this.G0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F0;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.F0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.F0.setLayoutParams(layoutParams2);
        }
    }

    @Override // defpackage.ju4
    public st4 getItemData() {
        return this.G0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        st4 st4Var = this.G0;
        if (st4Var != null && st4Var.isCheckable() && this.G0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C0 != z) {
            this.C0 = z;
            this.K0.h(this.E0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.D0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H0);
            }
            int i = this.A0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.B0) {
            if (this.J0 == null) {
                Resources resources = getResources();
                int i2 = p36.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = xf6.a;
                Drawable drawable2 = resources.getDrawable(i2, theme);
                this.J0 = drawable2;
                if (drawable2 != null) {
                    int i3 = this.A0;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.J0;
        }
        this.E0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.E0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.A0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        this.I0 = colorStateList != null;
        st4 st4Var = this.G0;
        if (st4Var != null) {
            setIcon(st4Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.E0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B0 = z;
    }

    public void setTextAppearance(int i) {
        this.E0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
