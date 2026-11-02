package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a77;
import defpackage.b77;
import defpackage.gr4;
import defpackage.mr4;
import defpackage.n77;
import defpackage.o56;
import defpackage.o77;
import defpackage.p91;
import defpackage.v56;
import defpackage.w79;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements n77 {
    public static final int A0 = o56.Widget_MaterialComponents_ShapeableImageView;
    public final p91 i0;
    public final RectF j0;
    public final RectF k0;
    public final Paint l0;
    public final Paint m0;
    public final Path n0;
    public ColorStateList o0;
    public gr4 p0;
    public a77 q0;
    public float r0;
    public final Path s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = A0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.i0 = b77.a;
        this.n0 = new Path();
        this.z0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.m0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.s0 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, v56.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.o0 = ys0.x(context2, typedArrayObtainStyledAttributes, v56.ShapeableImageView_strokeColor);
        this.r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPadding, 0);
        this.t0 = dimensionPixelSize;
        this.u0 = dimensionPixelSize;
        this.v0 = dimensionPixelSize;
        this.w0 = dimensionPixelSize;
        this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.l0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.q0 = a77.g(context2, attributeSet, i, i2).a();
        setOutlineProvider(new o77(this));
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.j0;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        a77 a77Var = this.q0;
        p91 p91Var = this.i0;
        Path path = this.n0;
        p91Var.a(a77Var, null, 1.0f, rectF, null, path);
        Path path2 = this.s0;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.k0;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.w0;
    }

    public final int getContentPaddingEnd() {
        int i = this.y0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.t0 : this.v0;
    }

    public int getContentPaddingLeft() {
        int i = this.y0;
        int i2 = this.x0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.t0;
    }

    public int getContentPaddingRight() {
        int i = this.y0;
        int i2 = this.x0;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.v0;
    }

    public final int getContentPaddingStart() {
        int i = this.x0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.v0 : this.t0;
    }

    public int getContentPaddingTop() {
        return this.u0;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public a77 getShapeAppearanceModel() {
        return this.q0;
    }

    public ColorStateList getStrokeColor() {
        return this.o0;
    }

    public float getStrokeWidth() {
        return this.r0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.s0, this.m0);
        if (this.o0 == null) {
            return;
        }
        float f = this.r0;
        Paint paint = this.l0;
        paint.setStrokeWidth(f);
        int colorForState = this.o0.getColorForState(getDrawableState(), this.o0.getDefaultColor());
        if (this.r0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.n0, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.z0 && isLayoutDirectionResolved()) {
            this.z0 = true;
            if (!isPaddingRelative() && this.x0 == Integer.MIN_VALUE && this.y0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.n77
    public void setShapeAppearanceModel(a77 a77Var) {
        this.q0 = a77Var;
        gr4 gr4Var = this.p0;
        if (gr4Var != null) {
            gr4Var.setShapeAppearanceModel(a77Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(w79.v(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
