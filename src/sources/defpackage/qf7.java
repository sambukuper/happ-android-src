package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qf7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewGroup X;
    public final /* synthetic */ rf7 Y;
    public final /* synthetic */ View Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qf7(ViewGroup viewGroup, rf7 rf7Var, View view) {
        this.X = viewGroup;
        this.Y = rf7Var;
        this.Z = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.X;
        int measuredHeight = viewGroup.getMeasuredHeight();
        rf7 rf7Var = this.Y;
        CustomSpinner customSpinner = rf7Var.Y;
        int length = measuredHeight / rf7Var.Z.length;
        DisplayMetrics displayMetrics = rf7Var.getContext().getResources().getDisplayMetrics();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        viewGroup.getGlobalVisibleRect(new Rect());
        View view = this.Z;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (displayMetrics.heightPixels - iArr[1] <= viewGroup.getMeasuredHeight() + length) {
            int i = length / 2;
            length = iArr[1] > viewGroup.getMeasuredHeight() + i ? (-viewGroup.getMeasuredHeight()) - i : (-viewGroup.getMeasuredHeight()) / 2;
        }
        rf7Var.f0 = length;
        rf7Var.g0 = ((displayMetrics.widthPixels - view.getMeasuredWidth()) - ((int) TypedValue.applyDimension(1, 16.0f, rf7Var.getContext().getResources().getDisplayMetrics()))) - iArr[0];
        customSpinner.requestLayout();
        customSpinner.invalidate();
    }
}
