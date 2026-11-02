package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.a28;
import defpackage.r56;
import defpackage.s26;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.CheckBoxPreference, i, 0);
        int i2 = r56.CheckBoxPreference_summaryOn;
        int i3 = r56.CheckBoxPreference_android_summaryOn;
        if (typedArrayObtainStyledAttributes.getString(i2) == null) {
            typedArrayObtainStyledAttributes.getString(i3);
        }
        int i4 = r56.CheckBoxPreference_summaryOff;
        int i5 = r56.CheckBoxPreference_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i4) == null) {
            typedArrayObtainStyledAttributes.getString(i5);
        }
        typedArrayObtainStyledAttributes.getBoolean(r56.CheckBoxPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(r56.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }
}
