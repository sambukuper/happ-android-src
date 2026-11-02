package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eq extends dq {
    public final AppCompatSeekBar j0;
    public Drawable k0;
    public ColorStateList l0;
    public PorterDuff.Mode m0;
    public boolean n0;
    public boolean o0;

    public eq(AppCompatSeekBar appCompatSeekBar) {
        super((Object) appCompatSeekBar, (byte) 0);
        this.l0 = null;
        this.m0 = null;
        this.n0 = false;
        this.o0 = false;
        this.j0 = appCompatSeekBar;
    }

    @Override // defpackage.dq
    public final void A(AttributeSet attributeSet, int i) {
        super.A(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.j0;
        zv7 zv7VarR = zv7.r(i, 0, appCompatSeekBar.getContext(), attributeSet, h66.AppCompatSeekBar);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        cw8.m(appCompatSeekBar, appCompatSeekBar.getContext(), h66.AppCompatSeekBar, attributeSet, (TypedArray) zv7VarR.Y, i);
        Drawable drawableF = zv7VarR.f(h66.AppCompatSeekBar_android_thumb);
        if (drawableF != null) {
            appCompatSeekBar.setThumb(drawableF);
        }
        Drawable drawableE = zv7VarR.e(h66.AppCompatSeekBar_tickMark);
        Drawable drawable = this.k0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k0 = drawableE;
        if (drawableE != null) {
            drawableE.setCallback(appCompatSeekBar);
            drawableE.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableE.isStateful()) {
                drawableE.setState(appCompatSeekBar.getDrawableState());
            }
            P();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(h66.AppCompatSeekBar_tickMarkTintMode)) {
            this.m0 = dw1.c(typedArray.getInt(h66.AppCompatSeekBar_tickMarkTintMode, -1), this.m0);
            this.o0 = true;
        }
        if (typedArray.hasValue(h66.AppCompatSeekBar_tickMarkTint)) {
            this.l0 = zv7VarR.c(h66.AppCompatSeekBar_tickMarkTint);
            this.n0 = true;
        }
        zv7VarR.v();
        P();
    }

    public final void P() {
        Drawable drawable = this.k0;
        if (drawable != null) {
            if (this.n0 || this.o0) {
                Drawable drawableMutate = drawable.mutate();
                this.k0 = drawableMutate;
                if (this.n0) {
                    drawableMutate.setTintList(this.l0);
                }
                if (this.o0) {
                    this.k0.setTintMode(this.m0);
                }
                if (this.k0.isStateful()) {
                    this.k0.setState(this.j0.getDrawableState());
                }
            }
        }
    }

    public final void Q(Canvas canvas) {
        if (this.k0 != null) {
            AppCompatSeekBar appCompatSeekBar = this.j0;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k0.getIntrinsicWidth();
                int intrinsicHeight = this.k0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k0.setBounds(-i, -i2, i, i2);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
