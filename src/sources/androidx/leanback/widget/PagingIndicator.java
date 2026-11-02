package androidx.leanback.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import defpackage.ap0;
import defpackage.b36;
import defpackage.bt;
import defpackage.cw8;
import defpackage.f66;
import defpackage.h36;
import defpackage.n36;
import defpackage.ng5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class PagingIndicator extends View {
    public static final DecelerateInterpolator B0 = new DecelerateInterpolator();
    public static final ap0 C0;
    public static final ap0 D0;
    public static final ap0 E0;
    public final float A0;
    public boolean f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final int k0;
    public final int l0;
    public final int m0;
    public ng5[] n0;
    public int[] o0;
    public int[] p0;
    public int[] q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final Paint v0;
    public final Paint w0;
    public Bitmap x0;
    public Paint y0;
    public final Rect z0;

    static {
        Class<Float> cls = Float.class;
        C0 = new ap0(cls, "alpha", (byte) 12);
        D0 = new ap0(cls, "diameter", (byte) 13);
        E0 = new ap0(cls, "translation_x", (byte) 14);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.PagingIndicator, i, 0);
        cw8.m(this, context, f66.PagingIndicator, attributeSet, typedArrayObtainStyledAttributes, i);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.PagingIndicator_lbDotRadius, getResources().getDimensionPixelOffset(h36.lb_page_indicator_dot_radius));
        this.h0 = dimensionPixelOffset;
        int i2 = dimensionPixelOffset * 2;
        this.g0 = i2;
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.PagingIndicator_arrowRadius, getResources().getDimensionPixelOffset(h36.lb_page_indicator_arrow_radius));
        this.k0 = dimensionPixelOffset2;
        int i3 = dimensionPixelOffset2 * 2;
        this.j0 = i3;
        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.PagingIndicator_dotToDotGap, getResources().getDimensionPixelOffset(h36.lb_page_indicator_dot_gap));
        this.l0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f66.PagingIndicator_dotToArrowGap, getResources().getDimensionPixelOffset(h36.lb_page_indicator_arrow_gap));
        int color = typedArrayObtainStyledAttributes.getColor(f66.PagingIndicator_dotBgColor, getResources().getColor(b36.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.v0 = paint;
        paint.setColor(color);
        this.u0 = typedArrayObtainStyledAttributes.getColor(f66.PagingIndicator_arrowBgColor, getResources().getColor(b36.lb_page_indicator_arrow_background));
        if (this.y0 == null && typedArrayObtainStyledAttributes.hasValue(f66.PagingIndicator_arrowColor)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(f66.PagingIndicator_arrowColor, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f0 = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(b36.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(h36.lb_page_indicator_arrow_shadow_radius);
        this.m0 = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.w0 = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(h36.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.x0 = d();
        this.z0 = new Rect(0, 0, this.x0.getWidth(), this.x0.getHeight());
        float f = i3;
        this.A0 = this.x0.getWidth() / f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        ap0 ap0Var = C0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, ap0Var, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = B0;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        float f2 = i2;
        ap0 ap0Var2 = D0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, ap0Var2, f2, f);
        objectAnimatorOfFloat2.setDuration(417L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, c());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, ap0Var, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(167L);
        objectAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((Object) null, ap0Var2, f, f2);
        objectAnimatorOfFloat4.setDuration(417L);
        objectAnimatorOfFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, c());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.j0 + this.m0;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.s0 - 3) * this.i0) + (this.l0 * 2) + (this.h0 * 2);
    }

    private void setSelectedPage(int i) {
        if (i == this.t0) {
            return;
        }
        this.t0 = i;
        a();
    }

    public final void a() {
        int i;
        ng5[] ng5VarArr;
        int i2 = 0;
        while (true) {
            i = this.t0;
            ng5VarArr = this.n0;
            float f = -1.0f;
            if (i2 >= i) {
                break;
            }
            ng5VarArr[i2].b();
            ng5 ng5Var = this.n0[i2];
            if (i2 != 0) {
                f = 1.0f;
            }
            ng5Var.h = f;
            ng5Var.d = this.p0[i2];
            i2++;
        }
        ng5 ng5Var2 = ng5VarArr[i];
        ng5Var2.c = 0.0f;
        ng5Var2.d = 0.0f;
        PagingIndicator pagingIndicator = ng5Var2.j;
        ng5Var2.e = pagingIndicator.j0;
        float f2 = pagingIndicator.k0;
        ng5Var2.f = f2;
        ng5Var2.g = f2 * pagingIndicator.A0;
        ng5Var2.a = 1.0f;
        ng5Var2.a();
        ng5[] ng5VarArr2 = this.n0;
        int i3 = this.t0;
        ng5 ng5Var3 = ng5VarArr2[i3];
        ng5Var3.h = i3 <= 0 ? 1.0f : -1.0f;
        ng5Var3.d = this.o0[i3];
        while (true) {
            i3++;
            if (i3 >= this.s0) {
                return;
            }
            this.n0[i3].b();
            ng5 ng5Var4 = this.n0[i3];
            ng5Var4.h = 1.0f;
            ng5Var4.d = this.q0[i3];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.s0;
        int[] iArr = new int[i2];
        this.o0 = iArr;
        int[] iArr2 = new int[i2];
        this.p0 = iArr2;
        int[] iArr3 = new int[i2];
        this.q0 = iArr3;
        boolean z = this.f0;
        int i3 = this.l0;
        int i4 = this.i0;
        int i5 = 1;
        int i6 = this.h0;
        if (z) {
            int i7 = i - (requiredWidth / 2);
            iArr[0] = ((i7 + i6) - i4) + i3;
            iArr2[0] = i7 + i6;
            iArr3[0] = (i3 * 2) + ((i7 + i6) - (i4 * 2));
            while (i5 < this.s0) {
                int[] iArr4 = this.o0;
                int[] iArr5 = this.p0;
                int i8 = i5 - 1;
                iArr4[i5] = iArr5[i8] + i3;
                iArr5[i5] = iArr5[i8] + i4;
                this.q0[i5] = iArr4[i8] + i3;
                i5++;
            }
        } else {
            int i9 = (requiredWidth / 2) + i;
            iArr[0] = ((i9 - i6) + i4) - i3;
            iArr2[0] = i9 - i6;
            iArr3[0] = ((i4 * 2) + (i9 - i6)) - (i3 * 2);
            while (i5 < this.s0) {
                int[] iArr6 = this.o0;
                int[] iArr7 = this.p0;
                int i10 = i5 - 1;
                iArr6[i5] = iArr7[i10] - i3;
                iArr7[i5] = iArr7[i10] - i4;
                this.q0[i5] = iArr6[i10] - i3;
                i5++;
            }
        }
        this.r0 = paddingTop + this.k0;
        a();
    }

    public final ObjectAnimator c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, E0, (-this.l0) + this.i0, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(B0);
        return objectAnimatorOfFloat;
    }

    public final Bitmap d() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), n36.lb_ic_nav_arrow);
        if (this.f0) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.p0;
    }

    public int[] getDotSelectedRightX() {
        return this.q0;
    }

    public int[] getDotSelectedX() {
        return this.o0;
    }

    public int getPageCount() {
        return this.s0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.s0; i++) {
            ng5 ng5Var = this.n0[i];
            float f = ng5Var.d + ng5Var.c;
            PagingIndicator pagingIndicator = ng5Var.j;
            int i2 = pagingIndicator.r0;
            Paint paint = pagingIndicator.w0;
            canvas.drawCircle(f, i2, ng5Var.f, pagingIndicator.v0);
            if (ng5Var.a > 0.0f) {
                paint.setColor(ng5Var.b);
                canvas.drawCircle(f, pagingIndicator.r0, ng5Var.f, paint);
                Bitmap bitmap = pagingIndicator.x0;
                Rect rect = pagingIndicator.z0;
                float f2 = ng5Var.g;
                float f3 = pagingIndicator.r0;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2)), pagingIndicator.y0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.f0 != z) {
            this.f0 = z;
            this.x0 = d();
            ng5[] ng5VarArr = this.n0;
            if (ng5VarArr != null) {
                for (ng5 ng5Var : ng5VarArr) {
                    ng5Var.i = ng5Var.j.f0 ? 1.0f : -1.0f;
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        b();
    }

    public void setArrowBackgroundColor(int i) {
        this.u0 = i;
    }

    public void setArrowColor(int i) {
        Paint paint = this.y0;
        if (paint == null) {
            paint = new Paint();
            this.y0 = paint;
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.v0.setColor(i);
    }

    public void setPageCount(int i) {
        if (i <= 0) {
            bt.q("The page count should be a positive integer");
            return;
        }
        this.s0 = i;
        this.n0 = new ng5[i];
        for (int i2 = 0; i2 < this.s0; i2++) {
            this.n0[i2] = new ng5(this);
        }
        b();
        setSelectedPage(0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
