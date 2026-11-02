package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.a77;
import defpackage.c98;
import defpackage.gr4;
import defpackage.i21;
import defpackage.mr4;
import defpackage.mv4;
import defpackage.o56;
import defpackage.v56;
import defpackage.w26;
import defpackage.wa;
import defpackage.yn0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int e1 = o56.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] f1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer Z0;
    public boolean a1;
    public boolean b1;
    public ImageView.ScaleType c1;
    public Boolean d1;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = e1;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayD.hasValue(v56.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(v56.MaterialToolbar_navigationIconTint, -1));
        }
        this.a1 = typedArrayD.getBoolean(v56.MaterialToolbar_titleCentered, false);
        this.b1 = typedArrayD.getBoolean(v56.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayD.getInt(v56.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1;
            if (i3 < scaleTypeArr.length) {
                this.c1 = scaleTypeArr[i3];
            }
        }
        if (typedArrayD.hasValue(v56.MaterialToolbar_logoAdjustViewBounds)) {
            this.d1 = Boolean.valueOf(typedArrayD.getBoolean(v56.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        a77 a77VarA = a77.g(context2, attributeSet, i, i2).a();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : wa.o(background);
        if (colorStateListValueOf != null) {
            gr4 gr4Var = new gr4(a77VarA);
            gr4Var.t(colorStateListValueOf);
            gr4Var.p(context2);
            gr4Var.s(getElevation());
            setBackground(gr4Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.c1;
    }

    public Integer getNavigationIconTint() {
        return this.Z0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof gr4) {
            i21.T(this, (gr4) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        mv4 mv4Var = yn0.h;
        ImageView imageView2 = null;
        if (this.a1 || this.b1) {
            ArrayList arrayListJ = yn0.J(this, getTitle());
            TextView textView = arrayListJ.isEmpty() ? null : (TextView) Collections.min(arrayListJ, mv4Var);
            ArrayList arrayListJ2 = yn0.J(this, getSubtitle());
            TextView textView2 = arrayListJ2.isEmpty() ? null : (TextView) Collections.max(arrayListJ2, mv4Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.a1 && textView != null) {
                    w(textView, pair);
                }
                if (this.b1 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.d1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.c1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof gr4) {
            ((gr4) background).s(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.d1;
        if (bool == null || bool.booleanValue() != z) {
            this.d1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.c1 != scaleType) {
            this.c1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.Z0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.Z0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.Z0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.b1 != z) {
            this.b1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.a1 != z) {
            this.a1 = z;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.toolbarStyle);
    }
}
