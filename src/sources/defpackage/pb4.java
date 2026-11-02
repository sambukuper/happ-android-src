package defpackage;

import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pb4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ListPopupWindow Y;

    public /* synthetic */ pb4(ListPopupWindow listPopupWindow, byte b) {
        this.X = b;
        this.Y = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ListPopupWindow listPopupWindow = this.Y;
        switch (b) {
            case 0:
                qw1 qw1Var = listPopupWindow.Z;
                if (qw1Var != null) {
                    qw1Var.setListSelectionHidden(true);
                    qw1Var.requestLayout();
                }
                break;
            default:
                qw1 qw1Var2 = listPopupWindow.Z;
                if (qw1Var2 != null && qw1Var2.isAttachedToWindow() && listPopupWindow.Z.getCount() > listPopupWindow.Z.getChildCount() && listPopupWindow.Z.getChildCount() <= listPopupWindow.o0) {
                    listPopupWindow.B0.setInputMethodMode(2);
                    listPopupWindow.f();
                    break;
                }
                break;
        }
    }
}
