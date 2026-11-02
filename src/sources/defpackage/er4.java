package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class er4 extends Drawable.ConstantState {
    public y67 a;
    public sy1 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public byte o;
    public int p;
    public int q;
    public final Paint.Style r;

    public er4(er4 er4Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = (byte) 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = er4Var.a;
        this.b = er4Var.b;
        this.k = er4Var.k;
        this.c = er4Var.c;
        this.d = er4Var.d;
        this.g = er4Var.g;
        this.f = er4Var.f;
        this.l = er4Var.l;
        this.i = er4Var.i;
        this.q = er4Var.q;
        this.o = er4Var.o;
        this.j = er4Var.j;
        this.m = er4Var.m;
        this.n = er4Var.n;
        this.p = er4Var.p;
        this.e = er4Var.e;
        this.r = er4Var.r;
        if (er4Var.h != null) {
            this.h = new Rect(er4Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        gr4 gr4Var = new gr4(this);
        gr4Var.h0 = true;
        gr4Var.i0 = true;
        return gr4Var;
    }

    public er4(y67 y67Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = (byte) 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = y67Var;
        this.b = null;
    }
}
