package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.mr4;
import defpackage.u26;
import defpackage.u70;
import defpackage.v56;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(mr4.b(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (u70.f0(context2.getTheme(), u26.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, v56.MaterialTextView, i, 0);
            int[] iArr = {v56.MaterialTextView_android_lineHeight, v56.MaterialTextView_lineHeight};
            int iA = -1;
            for (int i2 = 0; i2 < 2 && iA < 0; i2++) {
                iA = ys0.A(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, v56.MaterialTextView, i, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(v56.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, v56.MaterialTextAppearance);
                Context context3 = getContext();
                int[] iArr2 = {v56.MaterialTextAppearance_android_lineHeight, v56.MaterialTextAppearance_lineHeight};
                int iA2 = -1;
                for (int i3 = 0; i3 < 2 && iA2 < 0; i3++) {
                    iA2 = ys0.A(context3, typedArrayObtainStyledAttributes3, iArr2[i3], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iA2 >= 0) {
                    setLineHeight(iA2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (u70.f0(context.getTheme(), u26.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, v56.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {v56.MaterialTextAppearance_android_lineHeight, v56.MaterialTextAppearance_lineHeight};
            int iA = -1;
            for (int i2 = 0; i2 < 2 && iA < 0; i2++) {
                iA = ys0.A(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iA >= 0) {
                setLineHeight(iA);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
