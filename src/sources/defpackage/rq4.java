package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 {
    public final MaterialButton a;
    public y67 b;
    public uf7 c;
    public o61 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public gr4 o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public rq4(MaterialButton materialButton, y67 y67Var) {
        this.a = materialButton;
        this.b = y67Var;
    }

    public final gr4 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (gr4) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        gr4 gr4Var = new gr4(this.b);
        uf7 uf7Var = this.c;
        if (uf7Var != null) {
            gr4Var.r(uf7Var);
        }
        o61 o61Var = this.d;
        if (o61Var != null) {
            gr4Var.F0 = o61Var;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        gr4Var.p(context);
        gr4Var.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            gr4Var.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        gr4Var.A(f);
        gr4Var.y(colorStateList);
        gr4 gr4Var2 = new gr4(this.b);
        uf7 uf7Var2 = this.c;
        if (uf7Var2 != null) {
            gr4Var2.r(uf7Var2);
        }
        gr4Var2.setTint(0);
        float f2 = this.j;
        int iB0 = this.p ? yn0.b0(materialButton.getContext(), u70.j0(materialButton, u26.colorSurface)) : 0;
        gr4Var2.A(f2);
        gr4Var2.y(ColorStateList.valueOf(iB0));
        gr4 gr4Var3 = new gr4(this.b);
        this.o = gr4Var3;
        uf7 uf7Var3 = this.c;
        if (uf7Var3 != null) {
            gr4Var3.r(uf7Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(z51.S(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gr4Var2, gr4Var}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable.f(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        gr4 gr4VarA = a(false);
        if (gr4VarA != null) {
            gr4VarA.s(this.v);
            gr4VarA.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(materialButton.getBackground());
        if (focusRingDrawableC != null) {
            focusRingDrawableC.j0 = new WeakReference(gr4VarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void d() {
        n77 n77Var;
        gr4 gr4VarA = a(false);
        if (gr4VarA != null) {
            gr4VarA.x(this.b);
            uf7 uf7Var = this.c;
            if (uf7Var != null) {
                gr4VarA.r(uf7Var);
            }
        }
        gr4 gr4VarA2 = a(true);
        if (gr4VarA2 != null) {
            gr4VarA2.x(this.b);
            uf7 uf7Var2 = this.c;
            if (uf7Var2 != null) {
                gr4VarA2.r(uf7Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof n77) {
                n77Var = (n77) objFindDrawableByLayerId;
            } else {
                n77Var = null;
            }
        } else {
            n77Var = null;
        }
        if (n77Var != null) {
            boolean z = n77Var instanceof gr4;
            y67 y67Var = this.b;
            if (!z) {
                n77Var.setShapeAppearanceModel(y67Var.d());
                return;
            }
            gr4 gr4Var = (gr4) n77Var;
            gr4Var.x(y67Var);
            uf7 uf7Var3 = this.c;
            if (uf7Var3 != null) {
                gr4Var.r(uf7Var3);
            }
        }
    }

    public final void e() {
        int iB0 = 0;
        gr4 gr4VarA = a(false);
        gr4 gr4VarA2 = a(true);
        if (gr4VarA != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            gr4VarA.A(f);
            gr4VarA.y(colorStateList);
            if (gr4VarA2 != null) {
                float f2 = this.j;
                if (this.p) {
                    int i = u26.colorSurface;
                    MaterialButton materialButton = this.a;
                    iB0 = yn0.b0(materialButton.getContext(), u70.j0(materialButton, i));
                }
                gr4VarA2.A(f2);
                gr4VarA2.y(ColorStateList.valueOf(iB0));
            }
        }
    }
}
