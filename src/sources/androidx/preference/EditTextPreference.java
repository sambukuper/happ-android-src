package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.a28;
import defpackage.r56;
import defpackage.ra;
import defpackage.s26;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.EditTextPreference, i, 0);
        int i2 = r56.EditTextPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i2, typedArrayObtainStyledAttributes.getBoolean(i2, false))) {
            ra raVar = ra.Y;
            if (raVar == null) {
                raVar = new ra((byte) 28, false);
                ra.Y = raVar;
            }
            this.i0 = raVar;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.editTextPreferenceStyle, R.attr.editTextPreferenceStyle));
    }
}
