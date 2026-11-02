package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import defpackage.as0;
import defpackage.bt;
import defpackage.cs0;
import defpackage.eu8;
import defpackage.j20;
import defpackage.lb3;
import defpackage.o56;
import defpackage.p36;
import defpackage.pm1;
import defpackage.u26;
import defpackage.v3;
import defpackage.xf6;
import defpackage.yr0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends a {
    public static final int v0 = o56.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, v0);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f0;
        yr0 yr0Var = new yr0(circularProgressIndicatorSpec);
        Context context2 = getContext();
        lb3 lb3Var = new lb3(context2, circularProgressIndicatorSpec, yr0Var, circularProgressIndicatorSpec.q == 1 ? new cs0(context2, circularProgressIndicatorSpec) : new as0(circularProgressIndicatorSpec));
        Resources resources = context2.getResources();
        int i2 = p36.ic_mtrl_arrow_circle;
        eu8 eu8Var = new eu8();
        ThreadLocal threadLocal = xf6.a;
        eu8Var.X = resources.getDrawable(i2, null);
        lb3Var.r0 = eu8Var;
        setIndeterminateDrawable(lb3Var);
        setProgressDrawable(new pm1(getContext(), circularProgressIndicatorSpec, yr0Var));
        this.o0 = true;
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.f0).q;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f0).t;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f0).s;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f0).r;
    }

    public void setIndeterminateAnimationType(int i) {
        j20 j20Var = this.f0;
        if (((CircularProgressIndicatorSpec) j20Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            bt.i("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((CircularProgressIndicatorSpec) j20Var).q = i;
        ((CircularProgressIndicatorSpec) j20Var).d();
        v3 cs0Var = i == 1 ? new cs0(getContext(), (CircularProgressIndicatorSpec) j20Var) : new as0((CircularProgressIndicatorSpec) j20Var);
        lb3 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.q0 = cs0Var;
        cs0Var.a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f0).t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        j20 j20Var = this.f0;
        if (((CircularProgressIndicatorSpec) j20Var).s != i) {
            ((CircularProgressIndicatorSpec) j20Var).s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        j20 j20Var = this.f0;
        if (((CircularProgressIndicatorSpec) j20Var).r != iMax) {
            ((CircularProgressIndicatorSpec) j20Var).r = iMax;
            ((CircularProgressIndicatorSpec) j20Var).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f0).d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.circularProgressIndicatorStyle);
    }
}
