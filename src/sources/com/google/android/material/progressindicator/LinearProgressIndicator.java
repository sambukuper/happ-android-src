package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import defpackage.bt;
import defpackage.ca4;
import defpackage.fa4;
import defpackage.ha4;
import defpackage.j20;
import defpackage.lb3;
import defpackage.lw1;
import defpackage.o56;
import defpackage.pm1;
import defpackage.u26;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends a {
    public static final int v0 = o56.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, v0);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f0;
        ca4 ca4Var = new ca4(linearProgressIndicatorSpec);
        ca4Var.f = 300.0f;
        ca4Var.o = new Pair(new lw1(), new lw1());
        Context context2 = getContext();
        setIndeterminateDrawable(new lb3(context2, linearProgressIndicatorSpec, ca4Var, linearProgressIndicatorSpec.q == 0 ? new fa4(linearProgressIndicatorSpec) : new ha4(context2, linearProgressIndicatorSpec)));
        setProgressDrawable(new pm1(getContext(), linearProgressIndicatorSpec, ca4Var));
        this.o0 = true;
    }

    @Override // com.google.android.material.progressindicator.a
    public final j20 a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.a
    public final void c(int i, boolean z) {
        j20 j20Var = this.f0;
        if (j20Var != null && ((LinearProgressIndicatorSpec) j20Var).q == 0 && isIndeterminate()) {
            return;
        }
        super.c(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f0).q;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f0).r;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.f0).v;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.f0).u;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f0).t;
    }

    @Override // com.google.android.material.progressindicator.a, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j20 j20Var = this.f0;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) j20Var;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) j20Var).r != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) j20Var).r != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) j20Var).r != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        lb3 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        pm1 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        j20 j20Var = this.f0;
        if (((LinearProgressIndicatorSpec) j20Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            bt.i("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((LinearProgressIndicatorSpec) j20Var).q = i;
        ((LinearProgressIndicatorSpec) j20Var).d();
        if (i == 0) {
            lb3 indeterminateDrawable = getIndeterminateDrawable();
            fa4 fa4Var = new fa4((LinearProgressIndicatorSpec) j20Var);
            indeterminateDrawable.q0 = fa4Var;
            fa4Var.a = indeterminateDrawable;
        } else {
            lb3 indeterminateDrawable2 = getIndeterminateDrawable();
            ha4 ha4Var = new ha4(getContext(), (LinearProgressIndicatorSpec) j20Var);
            indeterminateDrawable2.q0 = ha4Var;
            ha4Var.a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f0).d();
    }

    public void setIndicatorDirection(int i) {
        j20 j20Var = this.f0;
        ((LinearProgressIndicatorSpec) j20Var).r = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) j20Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) j20Var).r != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.s = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f0).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        j20 j20Var = this.f0;
        if (((LinearProgressIndicatorSpec) j20Var).v != i) {
            ((LinearProgressIndicatorSpec) j20Var).v = Math.round(Math.min(i, ((LinearProgressIndicatorSpec) j20Var).a / 2.0f));
            ((LinearProgressIndicatorSpec) j20Var).x = false;
            ((LinearProgressIndicatorSpec) j20Var).y = true;
            ((LinearProgressIndicatorSpec) j20Var).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        j20 j20Var = this.f0;
        if (((LinearProgressIndicatorSpec) j20Var).w != f) {
            ((LinearProgressIndicatorSpec) j20Var).w = Math.min(f, 0.5f);
            ((LinearProgressIndicatorSpec) j20Var).x = true;
            ((LinearProgressIndicatorSpec) j20Var).y = true;
            ((LinearProgressIndicatorSpec) j20Var).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        j20 j20Var = this.f0;
        if (Objects.equals(((LinearProgressIndicatorSpec) j20Var).u, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) j20Var).u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        j20 j20Var = this.f0;
        if (((LinearProgressIndicatorSpec) j20Var).t != i) {
            ((LinearProgressIndicatorSpec) j20Var).t = i;
            ((LinearProgressIndicatorSpec) j20Var).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.linearProgressIndicatorStyle);
    }
}
