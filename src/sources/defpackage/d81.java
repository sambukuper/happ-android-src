package defpackage;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lw7 lw7Var = (lw7) obj;
                lw7Var.X = true;
                lw7Var.notifyDataSetChanged();
                break;
            default:
                ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                if (listPopupWindow.B0.isShowing()) {
                    listPopupWindow.f();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                lw7 lw7Var = (lw7) obj;
                lw7Var.X = false;
                lw7Var.notifyDataSetInvalidated();
                break;
            default:
                ((ListPopupWindow) obj).dismiss();
                break;
        }
    }
}
