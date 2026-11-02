package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lq extends ListPopupWindow implements nq {
    public CharSequence E0;
    public iq F0;
    public final Rect G0;
    public int H0;
    public final /* synthetic */ AppCompatSpinner I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I0 = appCompatSpinner;
        this.G0 = new Rect();
        this.q0 = appCompatSpinner;
        this.A0 = true;
        this.B0.setFocusable(true);
        this.r0 = new jq(this, (byte) 0);
    }

    @Override // defpackage.nq
    public final CharSequence e() {
        return this.E0;
    }

    @Override // defpackage.nq
    public final void h(CharSequence charSequence) {
        this.E0 = charSequence;
    }

    @Override // defpackage.nq
    public final void m(int i) {
        this.H0 = i;
    }

    @Override // defpackage.nq
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.B0;
        boolean zIsShowing = popupWindow.isShowing();
        s();
        popupWindow.setInputMethodMode(2);
        f();
        qw1 qw1Var = this.Z;
        qw1Var.setChoiceMode(1);
        qw1Var.setTextDirection(i);
        qw1Var.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.I0;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        qw1 qw1Var2 = this.Z;
        if (popupWindow.isShowing() && qw1Var2 != null) {
            qw1Var2.setListSelectionHidden(false);
            qw1Var2.setSelection(selectedItemPosition);
            if (qw1Var2.getChoiceMode() != 0) {
                qw1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        gq gqVar = new gq(this, (byte) 1);
        viewTreeObserver.addOnGlobalLayoutListener(gqVar);
        popupWindow.setOnDismissListener(new kq(this, gqVar));
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, defpackage.nq
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.F0 = (iq) listAdapter;
    }

    public final void s() {
        int i;
        PopupWindow popupWindow = this.B0;
        Drawable background = popupWindow.getBackground();
        AppCompatSpinner appCompatSpinner = this.I0;
        Rect rect = appCompatSpinner.m0;
        if (background != null) {
            background.getPadding(rect);
            boolean z = cy8.a;
            i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i2 = appCompatSpinner.l0;
        if (i2 == -2) {
            int iA = appCompatSpinner.a(this.F0, popupWindow.getBackground());
            int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = cy8.a;
        this.h0 = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.g0) - this.H0) + i : paddingLeft + this.H0 + i;
    }
}
