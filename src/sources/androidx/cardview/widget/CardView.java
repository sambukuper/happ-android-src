package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a36;
import defpackage.fm6;
import defpackage.j56;
import defpackage.mj0;
import defpackage.n26;
import defpackage.z56;
import defpackage.zc1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] k0 = {R.attr.colorBackground};
    public boolean f0;
    public boolean g0;
    public final Rect h0;
    public final Rect i0;
    public final mj0 j0;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.h0 = rect;
        this.i0 = new Rect();
        mj0 mj0Var = new mj0(this);
        this.j0 = mj0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z56.CardView, i, j56.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(z56.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(z56.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(k0);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(a36.cardview_light_background) : getResources().getColor(a36.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(z56.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(z56.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(z56.CardView_cardMaxElevation, 0.0f);
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(z56.CardView_cardUseCompatPadding, false);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(z56.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(z56.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        fm6 fm6Var = new fm6(colorStateListValueOf, dimension);
        mj0Var.Y = fm6Var;
        setBackgroundDrawable(fm6Var);
        setClipToOutline(true);
        setElevation(dimension2);
        zc1.j0(mj0Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((fm6) this.j0.Y).h;
    }

    public float getCardElevation() {
        return ((CardView) this.j0.Z).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.h0.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h0.left;
    }

    public int getContentPaddingRight() {
        return this.h0.right;
    }

    public int getContentPaddingTop() {
        return this.h0.top;
    }

    public float getMaxCardElevation() {
        return ((fm6) this.j0.Y).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g0;
    }

    public float getRadius() {
        return ((fm6) this.j0.Y).a;
    }

    public boolean getUseCompatPadding() {
        return this.f0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        fm6 fm6Var = (fm6) this.j0.Y;
        if (colorStateListValueOf == null) {
            fm6Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        fm6Var.h = colorStateListValueOf;
        fm6Var.b.setColor(colorStateListValueOf.getColorForState(fm6Var.getState(), fm6Var.h.getDefaultColor()));
        fm6Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.j0.Z).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        zc1.j0(this.j0, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.g0) {
            this.g0 = z;
            mj0 mj0Var = this.j0;
            zc1.j0(mj0Var, ((fm6) mj0Var.Y).e);
        }
    }

    public void setRadius(float f) {
        fm6 fm6Var = (fm6) this.j0.Y;
        if (f == fm6Var.a) {
            return;
        }
        fm6Var.a = f;
        fm6Var.b(null);
        fm6Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f0 != z) {
            this.f0 = z;
            mj0 mj0Var = this.j0;
            zc1.j0(mj0Var, ((fm6) mj0Var.Y).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        fm6 fm6Var = (fm6) this.j0.Y;
        if (colorStateList == null) {
            fm6Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        fm6Var.h = colorStateList;
        fm6Var.b.setColor(colorStateList.getColorForState(fm6Var.getState(), fm6Var.h.getDefaultColor()));
        fm6Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n26.cardViewStyle);
    }
}
