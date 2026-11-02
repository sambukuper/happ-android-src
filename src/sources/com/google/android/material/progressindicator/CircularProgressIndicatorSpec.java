package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.c98;
import defpackage.j20;
import defpackage.j36;
import defpackage.u26;
import defpackage.v56;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends j20 {
    public int q;
    public int r;
    public int s;
    public int t;
    public final boolean u;

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = CircularProgressIndicator.v0;
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j36.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(j36.mtrl_progress_circular_inset_medium);
        int[] iArr = v56.CircularProgressIndicator;
        c98.a(context, attributeSet, i, i2);
        c98.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.q = typedArrayObtainStyledAttributes.getInt(v56.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        this.r = Math.max(ys0.A(context, typedArrayObtainStyledAttributes, v56.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.a * 2);
        this.s = ys0.A(context, typedArrayObtainStyledAttributes, v56.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.t = typedArrayObtainStyledAttributes.getInt(v56.CircularProgressIndicator_indicatorDirectionCircular, 0);
        this.u = typedArrayObtainStyledAttributes.getBoolean(v56.CircularProgressIndicator_indeterminateTrackVisible, true);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.circularProgressIndicatorStyle);
    }
}
