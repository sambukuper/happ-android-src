package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import defpackage.b61;
import defpackage.eb;
import defpackage.fb;
import defpackage.g60;
import defpackage.nr4;
import defpackage.o7;
import defpackage.og5;
import defpackage.rh5;
import defpackage.sm0;
import defpackage.sv1;
import defpackage.ua7;
import defpackage.vc6;
import defpackage.vz7;
import defpackage.x97;
import defpackage.z24;
import defpackage.z51;
import defpackage.zv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Log5;", "Lvc6;", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawablePainter extends og5 implements vc6 {
    public final Drawable h0;
    public final rh5 j0;
    public final rh5 i0 = z51.H(0);
    public final vz7 k0 = new vz7(new o7((Object) this, (byte) 28));

    public DrawablePainter(Drawable drawable) {
        this.h0 = drawable;
        this.j0 = z51.H(new ua7(zv1.a(drawable)));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.vc6
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc6
    public final void b() {
        Drawable drawable = this.h0;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc6
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.k0.getValue();
        Drawable drawable = this.h0;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.h0.setAlpha(x97.n(nr4.O(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.h0.setColorFilter(g60Var != null ? g60Var.a : null);
        return true;
    }

    @Override // defpackage.og5
    public final void f(z24 z24Var) {
        int i;
        z24Var.getClass();
        int iOrdinal = z24Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
        } else {
            i = 0;
        }
        this.h0.setLayoutDirection(i);
    }

    @Override // defpackage.og5
    /* JADX INFO: renamed from: h */
    public final long getR0() {
        return ((ua7) this.j0.getValue()).a;
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        sm0 sm0VarK = sv1Var.n0().k();
        ((Number) this.i0.getValue()).intValue();
        try {
            sm0VarK.g();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.h0;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, nr4.O(ua7.d(sv1Var.e())), nr4.O(ua7.b(sv1Var.e())));
            } else {
                sm0VarK.a(ua7.d(sv1Var.e()) / ua7.d(getR0()), ua7.b(sv1Var.e()) / ua7.b(getR0()));
            }
            Canvas canvas = fb.a;
            drawable.draw(((eb) sm0VarK).a);
        } finally {
            sm0VarK.p();
        }
    }
}
