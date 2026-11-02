package defpackage;

import android.widget.AbsListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qb4 implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListPopupWindow a;

    public qb4(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ListPopupWindow listPopupWindow = this.a;
        pb4 pb4Var = listPopupWindow.t0;
        PopupWindow popupWindow = listPopupWindow.B0;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        listPopupWindow.x0.removeCallbacks(pb4Var);
        pb4Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
