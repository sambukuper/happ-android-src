package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cu4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ du4 X;

    public cu4(du4 du4Var) {
        this.X = du4Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.X.c();
    }
}
