package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.a28;
import defpackage.es5;
import defpackage.r46;
import defpackage.r56;
import defpackage.s26;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final Context X;
    public final int Y;
    public final CharSequence Z;
    public final CharSequence f0;
    public final String g0;
    public final Object h0;
    public es5 i0;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.Y = Integer.MAX_VALUE;
        this.X = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.Preference, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(r56.Preference_icon, typedArrayObtainStyledAttributes.getResourceId(r56.Preference_android_icon, 0));
        int i3 = r56.Preference_key;
        int i4 = r56.Preference_android_key;
        String string = typedArrayObtainStyledAttributes.getString(i3);
        this.g0 = string == null ? typedArrayObtainStyledAttributes.getString(i4) : string;
        int i5 = r56.Preference_title;
        int i6 = r56.Preference_android_title;
        CharSequence text = typedArrayObtainStyledAttributes.getText(i5);
        this.Z = text == null ? typedArrayObtainStyledAttributes.getText(i6) : text;
        int i7 = r56.Preference_summary;
        int i8 = r56.Preference_android_summary;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(i7);
        this.f0 = text2 == null ? typedArrayObtainStyledAttributes.getText(i8) : text2;
        this.Y = typedArrayObtainStyledAttributes.getInt(r56.Preference_order, typedArrayObtainStyledAttributes.getInt(r56.Preference_android_order, Integer.MAX_VALUE));
        int i9 = r56.Preference_fragment;
        int i10 = r56.Preference_android_fragment;
        if (typedArrayObtainStyledAttributes.getString(i9) == null) {
            typedArrayObtainStyledAttributes.getString(i10);
        }
        typedArrayObtainStyledAttributes.getResourceId(r56.Preference_layout, typedArrayObtainStyledAttributes.getResourceId(r56.Preference_android_layout, r46.preference));
        typedArrayObtainStyledAttributes.getResourceId(r56.Preference_widgetLayout, typedArrayObtainStyledAttributes.getResourceId(r56.Preference_android_widgetLayout, 0));
        typedArrayObtainStyledAttributes.getBoolean(r56.Preference_enabled, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_enabled, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(r56.Preference_selectable, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_selectable, true));
        typedArrayObtainStyledAttributes.getBoolean(r56.Preference_persistent, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_persistent, true));
        int i11 = r56.Preference_dependency;
        int i12 = r56.Preference_android_dependency;
        if (typedArrayObtainStyledAttributes.getString(i11) == null) {
            typedArrayObtainStyledAttributes.getString(i12);
        }
        int i13 = r56.Preference_allowDividerAbove;
        typedArrayObtainStyledAttributes.getBoolean(i13, typedArrayObtainStyledAttributes.getBoolean(i13, z));
        int i14 = r56.Preference_allowDividerBelow;
        typedArrayObtainStyledAttributes.getBoolean(i14, typedArrayObtainStyledAttributes.getBoolean(i14, z));
        if (typedArrayObtainStyledAttributes.hasValue(r56.Preference_defaultValue)) {
            this.h0 = c(typedArrayObtainStyledAttributes, r56.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(r56.Preference_android_defaultValue)) {
            this.h0 = c(typedArrayObtainStyledAttributes, r56.Preference_android_defaultValue);
        }
        typedArrayObtainStyledAttributes.getBoolean(r56.Preference_shouldDisableView, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_shouldDisableView, true));
        if (typedArrayObtainStyledAttributes.hasValue(r56.Preference_singleLineTitle)) {
            typedArrayObtainStyledAttributes.getBoolean(r56.Preference_singleLineTitle, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_singleLineTitle, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(r56.Preference_iconSpaceReserved, typedArrayObtainStyledAttributes.getBoolean(r56.Preference_android_iconSpaceReserved, false));
        int i15 = r56.Preference_isPreferenceVisible;
        typedArrayObtainStyledAttributes.getBoolean(i15, typedArrayObtainStyledAttributes.getBoolean(i15, true));
        int i16 = r56.Preference_enableCopying;
        typedArrayObtainStyledAttributes.getBoolean(i16, typedArrayObtainStyledAttributes.getBoolean(i16, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        es5 es5Var = this.i0;
        return es5Var != null ? es5Var.d(this) : this.f0;
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.Y;
        CharSequence charSequence = preference2.Z;
        int i2 = this.Y;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence2 = this.Z;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.Z;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb.append(charSequenceA);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void b() {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.preferenceStyle, R.attr.preferenceStyle));
    }
}
