package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.a28;
import defpackage.es5;
import defpackage.k32;
import defpackage.r56;
import defpackage.s26;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] j0;
    public final CharSequence[] k0;
    public String l0;
    public final String m0;
    public boolean n0;

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.ListPreference, i, 0);
        int i3 = r56.ListPreference_entries;
        int i4 = r56.ListPreference_android_entries;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i3);
        this.j0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i4) : textArray;
        int i5 = r56.ListPreference_entryValues;
        int i6 = r56.ListPreference_android_entryValues;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(i5);
        this.k0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(i6) : textArray2;
        int i7 = r56.ListPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i7, typedArrayObtainStyledAttributes.getBoolean(i7, false))) {
            k32 k32Var = k32.Y;
            if (k32Var == null) {
                k32Var = new k32();
                k32.Y = k32Var;
            }
            this.i0 = k32Var;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, r56.Preference, i, 0);
        int i8 = r56.Preference_summary;
        int i9 = r56.Preference_android_summary;
        String string = typedArrayObtainStyledAttributes2.getString(i8);
        this.m0 = string == null ? typedArrayObtainStyledAttributes2.getString(i9) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        es5 es5Var = this.i0;
        if (es5Var != null) {
            return es5Var.d(this);
        }
        CharSequence charSequenceD = d();
        CharSequence charSequenceA = super.a();
        String str = this.m0;
        if (str != null) {
            if (charSequenceD == null) {
                charSequenceD = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            String str2 = String.format(str, charSequenceD);
            if (!TextUtils.equals(str2, charSequenceA)) {
                return str2;
            }
        }
        return charSequenceA;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence d() {
        int length;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        String str = this.l0;
        if (str != null && (charSequenceArr2 = this.k0) != null) {
            length = charSequenceArr2.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (TextUtils.equals(charSequenceArr2[length].toString(), str)) {
                    break;
                }
                length--;
            }
        } else {
            length = -1;
            break;
        }
        if (length < 0 || (charSequenceArr = this.j0) == null) {
            return null;
        }
        return charSequenceArr[length];
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a28.e(context, s26.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
