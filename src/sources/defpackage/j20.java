package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j20 {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;

    public j20(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j36.mtrl_progress_track_thickness);
        int[] iArr = v56.BaseProgressIndicator;
        c98.a(context, attributeSet, i, i2);
        c98.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = ys0.A(context, typedArrayObtainStyledAttributes, v56.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(v56.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = typedArrayObtainStyledAttributes.getInt(v56.BaseProgressIndicator_showAnimationBehavior, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(v56.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_wavelength, 0));
        this.j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_waveAmplitude, 0));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.BaseProgressIndicator_waveSpeed, 0);
        this.n = typedArrayObtainStyledAttributes.getFloat(v56.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        this.o = typedArrayObtainStyledAttributes.getFloat(v56.BaseProgressIndicator_waveAmplitudeRampProgressMin, 0.1f);
        this.p = typedArrayObtainStyledAttributes.getFloat(v56.BaseProgressIndicator_waveAmplitudeRampProgressMax, 0.9f);
        if (!typedArrayObtainStyledAttributes.hasValue(v56.BaseProgressIndicator_indicatorColor)) {
            this.e = new int[]{yn0.C(context, w26.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(v56.BaseProgressIndicator_indicatorColor).type != 1) {
            this.e = new int[]{typedArrayObtainStyledAttributes.getColor(v56.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(v56.BaseProgressIndicator_indicatorColor, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                bt.q("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(v56.BaseProgressIndicator_trackColor)) {
            this.f = typedArrayObtainStyledAttributes.getColor(v56.BaseProgressIndicator_trackColor, -1);
        } else {
            this.f = this.e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f = yn0.v(this.f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.d ? (int) (this.a * this.c) : this.b;
    }

    public final boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.d && this.c == 0.5f;
    }

    public void d() {
        if (this.i >= 0) {
            return;
        }
        bt.q("indicatorTrackGapSize must be >= 0.");
    }
}
