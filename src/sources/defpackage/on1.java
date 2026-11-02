package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class on1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ sn1 X;

    public on1(sn1 sn1Var) {
        this.X = sn1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        sn1 sn1Var = this.X;
        Dialog dialog = sn1Var.o1;
        if (dialog != null) {
            sn1Var.onCancel(dialog);
        }
    }
}
