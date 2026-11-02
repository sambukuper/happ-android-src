package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ a8 X;
    public final /* synthetic */ x7 Y;

    public w7(x7 x7Var, a8 a8Var) {
        this.Y = x7Var;
        this.X = a8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        x7 x7Var = this.Y;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) x7Var.k;
        a8 a8Var = this.X;
        onClickListener.onClick(a8Var.b, i);
        if (x7Var.b) {
            return;
        }
        a8Var.b.dismiss();
    }
}
