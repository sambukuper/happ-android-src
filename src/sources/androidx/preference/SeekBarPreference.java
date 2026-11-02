package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.r56;
import defpackage.s26;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int j0;
    public final int k0;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.SeekBarPreference, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(r56.SeekBarPreference_min, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(r56.SeekBarPreference_android_max, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.j0) {
            this.j0 = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(r56.SeekBarPreference_seekBarIncrement, 0);
        if (i4 != this.k0) {
            this.k0 = Math.min(this.j0 - i2, Math.abs(i4));
        }
        typedArrayObtainStyledAttributes.getBoolean(r56.SeekBarPreference_adjustable, true);
        typedArrayObtainStyledAttributes.getBoolean(r56.SeekBarPreference_showSeekBarValue, false);
        typedArrayObtainStyledAttributes.getBoolean(r56.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s26.seekBarPreferenceStyle);
    }
}
