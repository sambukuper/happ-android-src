package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zq4 {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final Rect b;
    public final gr4 c;
    public final gr4 d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public y67 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public gr4 r;
    public boolean s;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public float y;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public zq4(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.t0;
        this.b = new Rect();
        this.e = -1.0f;
        this.s = false;
        this.y = 0.0f;
        this.a = materialCardView;
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, z56.CardView, i, j56.CardView);
        gr4 gr4Var = new gr4(materialCardView.getContext(), attributeSet, i, i2);
        this.c = gr4Var;
        gr4Var.p(materialCardView.getContext());
        gr4Var.v();
        z67 z67VarK = gr4Var.k().k();
        if (typedArrayObtainStyledAttributes.hasValue(z56.CardView_cardCornerRadius)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(z56.CardView_cardCornerRadius, 0.0f);
            this.e = dimension;
            z67VarK.b(dimension);
        }
        this.d = new gr4();
        h(z67VarK.a());
        this.v = z39.D(materialCardView.getContext(), u26.motionEasingLinearInterpolator, rk.a);
        this.w = u70.g0(materialCardView.getContext(), u26.motionDurationShort2, 300);
        this.x = u70.g0(materialCardView.getContext(), u26.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(z91 z91Var, float f) {
        if (z91Var instanceof lm6) {
            return (float) ((1.0d - z) * ((double) f));
        }
        if (z91Var instanceof q81) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float fMax = 0.0f;
        for (a77 a77Var : this.n.c()) {
            if (a77Var != null) {
                z91 z91Var = a77Var.a;
                gr4 gr4Var = this.c;
                float fB = b(z91Var, gr4Var.m());
                z91 z91Var2 = a77Var.b;
                float[] fArr = gr4Var.D0;
                float fMax2 = Math.max(fB, b(z91Var2, fArr != null ? fArr[0] : gr4Var.Y.a.d().f.a(gr4Var.i())));
                z91 z91Var3 = a77Var.c;
                float[] fArr2 = gr4Var.D0;
                float fB2 = b(z91Var3, fArr2 != null ? fArr2[1] : gr4Var.Y.a.d().g.a(gr4Var.i()));
                z91 z91Var4 = a77Var.d;
                float[] fArr3 = gr4Var.D0;
                fMax = Math.max(fMax, Math.max(fMax2, Math.max(fB2, b(z91Var4, fArr3 != null ? fArr3[2] : gr4Var.Y.a.d().h.a(gr4Var.i())))));
            }
        }
        return fMax;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new gr4(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
        FocusRingDrawable.f(this.a.getContext(), layerDrawable2, this.r);
        layerDrawable2.setId(2, c46.mtrl_card_checked_layer_id);
        this.q = layerDrawable2;
        return layerDrawable2;
    }

    public final yq4 d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new yq4(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.q != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.h;
            boolean z2 = (i5 & 8388613) == 8388613;
            int i6 = this.f;
            int i7 = z2 ? ((i - i6) - this.g) - iCeil2 : i6;
            int i8 = (i5 & 80) == 80 ? i6 : ((i2 - i6) - this.g) - iCeil;
            int i9 = (i5 & 8388613) == 8388613 ? i6 : ((i - i6) - this.g) - iCeil2;
            if ((i5 & 80) == 80) {
                i6 = ((i2 - i6) - this.g) - iCeil;
            }
            int i10 = i6;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i9;
                i3 = i7;
            } else {
                i3 = i9;
                i4 = i7;
            }
            this.q.setLayerInset(2, i4, i10, i3, i8);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.y = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new nm1(this, (byte) 2));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.k = drawableMutate;
            drawableMutate.setTintList(this.m);
            f(this.a.n0, false);
        } else {
            this.k = A;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(c46.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(y67 y67Var) {
        this.n = y67Var;
        gr4 gr4Var = this.c;
        gr4Var.x(y67Var);
        this.d.x(y67Var);
        gr4 gr4Var2 = this.r;
        if (gr4Var2 != null) {
            gr4Var2.x(y67Var);
        }
        gr4Var.y0 = !gr4Var.q();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.q() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable drawableC = j() ? c() : this.d;
        this.j = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.q()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - z) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.h0.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        mj0 mj0Var = materialCardView.j0;
        CardView cardView = (CardView) mj0Var.Z;
        if (!cardView.getUseCompatPadding()) {
            mj0Var.X(0, 0, 0, 0);
            return;
        }
        fm6 fm6Var = (fm6) mj0Var.Y;
        float f = fm6Var.e;
        float f2 = fm6Var.a;
        int iCeil = (int) Math.ceil(gm6.a(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(gm6.b(f, f2, cardView.getPreventCornerOverlap()));
        mj0Var.X(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
