package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b20;
import defpackage.cw8;
import defpackage.g66;
import defpackage.kp5;
import defpackage.lu2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends b20 {
    public boolean U1;
    public boolean V1;
    public final Paint W1;
    public Bitmap X1;
    public LinearGradient Y1;
    public int Z1;
    public int a2;
    public Bitmap b2;
    public LinearGradient c2;
    public int d2;
    public int e2;
    public final Rect f2;

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.W1 = new Paint();
        this.f2 = new Rect();
        this.O1.D1(0);
        u0(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g66.lbHorizontalGridView);
        cw8.m(this, context, g66.lbHorizontalGridView, attributeSet, typedArrayObtainStyledAttributes, 0);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(g66.lbHorizontalGridView_numberOfRows, 1));
        typedArrayObtainStyledAttributes.recycle();
        v0();
        Paint paint = new Paint();
        this.W1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.b2;
        if (bitmap == null || bitmap.getWidth() != this.d2 || this.b2.getHeight() != getHeight()) {
            this.b2 = Bitmap.createBitmap(this.d2, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.b2;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.X1;
        if (bitmap == null || bitmap.getWidth() != this.Z1 || this.X1.getHeight() != getHeight()) {
            this.X1 = Bitmap.createBitmap(this.Z1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.X1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        if (!this.U1) {
            z = false;
            break;
        }
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            this.O1.getClass();
            lu2 lu2Var = (lu2) childAt.getLayoutParams();
            lu2Var.getClass();
            if (childAt.getLeft() + lu2Var.g0 < getPaddingLeft() - this.a2) {
                z = true;
                break;
            }
            i++;
        }
        if (!this.V1) {
            z2 = false;
            break;
        }
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (childCount2 < 0) {
                z2 = false;
                break;
            }
            View childAt2 = getChildAt(childCount2);
            this.O1.getClass();
            lu2 lu2Var2 = (lu2) childAt2.getLayoutParams();
            lu2Var2.getClass();
            if (childAt2.getRight() - lu2Var2.i0 > (getWidth() - getPaddingRight()) + this.e2) {
                break;
            } else {
                childCount2--;
            }
        }
        if (!z) {
            this.X1 = null;
        }
        if (!z2) {
            this.b2 = null;
        }
        if (!z && !z2) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.U1 ? (getPaddingLeft() - this.a2) - this.Z1 : 0;
        int width = this.V1 ? (getWidth() - getPaddingRight()) + this.e2 + this.d2 : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.U1 ? this.Z1 : 0) + paddingLeft, 0, width - (this.V1 ? this.d2 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f2;
        rect.top = 0;
        rect.bottom = getHeight();
        Paint paint = this.W1;
        if (z && this.Z1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.Z1, getHeight());
            float f = -paddingLeft;
            canvas2.translate(f, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            paint.setShader(this.Y1);
            canvas2.drawRect(0.0f, 0.0f, this.Z1, getHeight(), this.W1);
            rect.left = 0;
            rect.right = this.Z1;
            canvas.translate(paddingLeft, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f, 0.0f);
        }
        if (!z2 || this.d2 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.d2, getHeight());
        canvas2.translate(-(width - this.d2), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        paint.setShader(this.c2);
        canvas2.drawRect(0.0f, 0.0f, this.d2, getHeight(), this.W1);
        rect.left = 0;
        int i2 = this.d2;
        rect.right = i2;
        canvas.translate(width - i2, 0.0f);
        canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
        canvas.translate(-(width - this.d2), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.U1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.Z1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.a2;
    }

    public final boolean getFadingRightEdge() {
        return this.V1;
    }

    public final int getFadingRightEdgeLength() {
        return this.d2;
    }

    public final int getFadingRightEdgeOffset() {
        return this.e2;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.U1 != z) {
            this.U1 = z;
            if (!z) {
                this.X1 = null;
            }
            invalidate();
            v0();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.Z1 != i) {
            this.Z1 = i;
            if (i != 0) {
                this.Y1 = new LinearGradient(0.0f, 0.0f, this.Z1, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.Y1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.a2 != i) {
            this.a2 = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.V1 != z) {
            this.V1 = z;
            if (!z) {
                this.b2 = null;
            }
            invalidate();
            v0();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.d2 != i) {
            this.d2 = i;
            if (i != 0) {
                this.c2 = new LinearGradient(0.0f, 0.0f, this.d2, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.c2 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.e2 != i) {
            this.e2 = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if (i >= 0) {
            gridLayoutManager.W0 = i;
            requestLayout();
        } else {
            gridLayoutManager.getClass();
            kp5.e();
        }
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(g66.lbHorizontalGridView_rowHeight) != null) {
            setRowHeight(typedArray.getLayoutDimension(g66.lbHorizontalGridView_rowHeight, 0));
        }
    }

    public final void v0() {
        if (this.U1 || this.V1) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    public void setRowHeight(int i) {
        this.O1.E1(i);
        requestLayout();
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
