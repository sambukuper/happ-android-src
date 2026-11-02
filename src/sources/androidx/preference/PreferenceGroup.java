package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.r56;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        new Handler(Looper.getMainLooper());
        new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r56.PreferenceGroup, i, 0);
        int i3 = r56.PreferenceGroup_orderingFromXml;
        typedArrayObtainStyledAttributes.getBoolean(i3, typedArrayObtainStyledAttributes.getBoolean(i3, true));
        if (typedArrayObtainStyledAttributes.hasValue(r56.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = r56.PreferenceGroup_initialExpandedChildrenCount;
            if (typedArrayObtainStyledAttributes.getInt(i4, typedArrayObtainStyledAttributes.getInt(i4, Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.g0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
