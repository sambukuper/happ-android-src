package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.cr0;
import defpackage.cw8;
import defpackage.dr0;
import defpackage.r20;
import defpackage.w26;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] m0 = {R.attr.state_checked};
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public cr0 l0;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j0 = true;
        this.k0 = true;
        cw8.n(this, new r20(this, (byte) 3));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i0 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), m0) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.l0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dr0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dr0 dr0Var = (dr0) parcelable;
        super.onRestoreInstanceState(dr0Var.X);
        setChecked(dr0Var.Z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dr0 dr0Var = new dr0(super.onSaveInstanceState());
        dr0Var.Z = this.i0;
        return dr0Var;
    }

    public void setCheckable(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.j0 || this.i0 == z) {
            return;
        }
        this.i0 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        cr0 cr0Var;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (cr0Var = this.l0) == null) {
            return;
        }
        cr0Var.b();
    }

    public void setOnFocusableChangedListener(cr0 cr0Var) {
        this.l0 = cr0Var;
    }

    public void setPressable(boolean z) {
        this.k0 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.k0) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i0);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.imageButtonStyle);
    }
}
