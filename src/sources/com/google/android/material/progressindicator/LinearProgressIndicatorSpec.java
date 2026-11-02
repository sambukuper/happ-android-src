package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.bt;
import defpackage.c98;
import defpackage.j20;
import defpackage.u26;
import defpackage.v56;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends j20 {
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = LinearProgressIndicator.v0;
        super(context, attributeSet, i, i2);
        int[] iArr = v56.LinearProgressIndicator;
        int i3 = u26.linearProgressIndicatorStyle;
        c98.a(context, attributeSet, i3, i2);
        c98.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        this.q = typedArrayObtainStyledAttributes.getInt(v56.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.r = typedArrayObtainStyledAttributes.getInt(v56.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.LinearProgressIndicator_trackStopIndicatorSize, 0);
        if (typedArrayObtainStyledAttributes.hasValue(v56.LinearProgressIndicator_trackStopIndicatorPadding)) {
            this.u = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(v56.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                this.v = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.x = false;
                this.y = true;
            } else if (i4 == 6) {
                this.w = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.x = true;
                this.y = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
        this.s = this.r == 1;
    }

    @Override // defpackage.j20
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // defpackage.j20
    public final void d() {
        super.d();
        if (this.t < 0) {
            bt.q("Stop indicator size must be >= 0.");
            return;
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && e() > 0)) && this.i == 0) {
                bt.q("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                bt.q("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        if (this.y) {
            return this.x ? (int) (this.a * this.w) : this.v;
        }
        return a();
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.linearProgressIndicatorStyle);
    }
}
