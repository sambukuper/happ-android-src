package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c46;
import defpackage.j36;
import defpackage.rk;
import defpackage.u26;
import defpackage.z39;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView f0;
    public Button g0;
    public Button h0;
    public int i0;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z39.D(context, u26.motionEasingEmphasizedInterpolator, rk.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f0.getPaddingTop() == i2 && this.f0.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f0;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.g0;
    }

    public Button getCloseView() {
        return this.h0;
    }

    public TextView getMessageView() {
        return this.f0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f0 = (TextView) findViewById(c46.snackbar_text);
        this.g0 = (Button) findViewById(c46.snackbar_action);
        this.h0 = (Button) findViewById(c46.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(j36.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(j36.design_snackbar_padding_vertical);
        Layout layout = this.f0.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.i0 <= 0 || this.g0.getMeasuredWidth() <= this.i0) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.i0 = i;
    }
}
