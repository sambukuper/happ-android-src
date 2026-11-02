package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xh2 extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public y67 t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;

    public xh2(xh2 xh2Var) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.s0;
        if (xh2Var != null) {
            this.a = xh2Var.a;
            this.b = xh2Var.b;
            this.c = xh2Var.c;
            this.d = xh2Var.d;
            this.e = xh2Var.e;
            this.f = xh2Var.f;
            this.g = xh2Var.g;
            this.h = xh2Var.h;
            this.i = xh2Var.i;
            this.j = xh2Var.j;
            this.k = xh2Var.k;
            this.l = xh2Var.l;
            this.m = xh2Var.m;
            this.n = xh2Var.n;
            this.o = xh2Var.o;
            this.p = xh2Var.p;
            this.q = xh2Var.q;
            this.r = xh2Var.r;
            this.s = xh2Var.s;
            this.u = xh2Var.u;
            this.v = xh2Var.v;
            y67 y67Var = xh2Var.t;
            if (y67Var instanceof a77) {
                this.t = ((a77) y67Var).k().a();
            } else if (y67Var instanceof th7) {
                this.t = ((th7) y67Var).j().c();
            } else {
                this.t = y67Var;
            }
            if (xh2Var.w != null) {
                this.w = new Rect(xh2Var.w);
            }
            int[] iArr = xh2Var.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
