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
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.DialogPreference, i, 0);
        int i3 = r56.DialogPreference_dialogTitle;
        int i4 = r56.DialogPreference_android_dialogTitle;
        if (typedArrayObtainStyledAttributes.getString(i3) == null) {
            typedArrayObtainStyledAttributes.getString(i4);
        }
        int i5 = r56.DialogPreference_dialogMessage;
        int i6 = r56.DialogPreference_android_dialogMessage;
        if (typedArrayObtainStyledAttributes.getString(i5) == null) {
            typedArrayObtainStyledAttributes.getString(i6);
        }
        int i7 = r56.DialogPreference_dialogIcon;
        int i8 = r56.DialogPreference_android_dialogIcon;
        if (typedArrayObtainStyledAttributes.getDrawable(i7) == null) {
            typedArrayObtainStyledAttributes.getDrawable(i8);
        }
        int i9 = r56.DialogPreference_positiveButtonText;
        int i10 = r56.DialogPreference_android_positiveButtonText;
        if (typedArrayObtainStyledAttributes.getString(i9) == null) {
            typedArrayObtainStyledAttributes.getString(i10);
        }
        int i11 = r56.DialogPreference_negativeButtonText;
        int i12 = r56.DialogPreference_android_negativeButtonText;
        if (typedArrayObtainStyledAttributes.getString(i11) == null) {
            typedArrayObtainStyledAttributes.getString(i12);
        }
        typedArrayObtainStyledAttributes.getResourceId(r56.DialogPreference_dialogLayout, typedArrayObtainStyledAttributes.getResourceId(r56.DialogPreference_android_dialogLayout, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
