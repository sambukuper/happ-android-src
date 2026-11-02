package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.a28;
import defpackage.r56;
import defpackage.s26;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.MultiSelectListPreference, i, 0);
        int i2 = r56.MultiSelectListPreference_entries;
        int i3 = r56.MultiSelectListPreference_android_entries;
        if (typedArrayObtainStyledAttributes.getTextArray(i2) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i3);
        }
        int i4 = r56.MultiSelectListPreference_entryValues;
        int i5 = r56.MultiSelectListPreference_android_entryValues;
        if (typedArrayObtainStyledAttributes.getTextArray(i4) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i5);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
