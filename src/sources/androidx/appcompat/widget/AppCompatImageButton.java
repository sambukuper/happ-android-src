package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import defpackage.d7;
import defpackage.d98;
import defpackage.dw1;
import defpackage.ne;
import defpackage.u70;
import defpackage.w26;
import defpackage.z11;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final d7 f0;
    public final ne g0;
    public boolean h0;

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h0 = false;
        d98.a(this, getContext());
        d7 d7Var = new d7(this);
        this.f0 = d7Var;
        d7Var.z(attributeSet, i);
        ne neVar = new ne(this);
        this.g0 = neVar;
        neVar.h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.b();
        }
        ne neVar = this.g0;
        if (neVar != null) {
            neVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z11 z11Var;
        ne neVar = this.g0;
        if (neVar == null || (z11Var = (z11) neVar.d) == null) {
            return null;
        }
        return (ColorStateList) z11Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z11 z11Var;
        ne neVar = this.g0;
        if (neVar == null || (z11Var = (z11) neVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) z11Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g0.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.C(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ne neVar = this.g0;
        if (neVar != null) {
            neVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ne neVar = this.g0;
        if (neVar != null && drawable != null && !this.h0) {
            neVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (neVar != null) {
            neVar.b();
            if (this.h0) {
                return;
            }
            ImageView imageView = (ImageView) neVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(neVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h0 = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ne neVar = this.g0;
        ImageView imageView = (ImageView) neVar.c;
        if (i != 0) {
            Drawable drawableO = u70.O(imageView.getContext(), i);
            if (drawableO != null) {
                dw1.a(drawableO);
            }
            imageView.setImageDrawable(drawableO);
        } else {
            imageView.setImageDrawable(null);
        }
        neVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ne neVar = this.g0;
        if (neVar != null) {
            neVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.N(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ne neVar = this.g0;
        if (neVar != null) {
            z11 z11Var = (z11) neVar.d;
            if (z11Var == null) {
                z11Var = new z11();
                neVar.d = z11Var;
            }
            z11Var.c = colorStateList;
            z11Var.b = true;
            neVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ne neVar = this.g0;
        if (neVar != null) {
            z11 z11Var = (z11) neVar.d;
            if (z11Var == null) {
                z11Var = new z11();
                neVar.d = z11Var;
            }
            z11Var.d = mode;
            z11Var.a = true;
            neVar.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.imageButtonStyle);
    }
}
