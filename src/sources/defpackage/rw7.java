package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class rw7 extends sn1 {
    public Dialog t1;
    public DialogInterface.OnCancelListener u1;
    public AlertDialog v1;

    @Override // defpackage.sn1
    public final Dialog T(Bundle bundle) {
        Dialog dialog = this.t1;
        if (dialog != null) {
            return dialog;
        }
        this.k1 = false;
        AlertDialog alertDialog = this.v1;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context contextK = k();
        w45.s(contextK);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(contextK).create();
        this.v1 = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // defpackage.sn1, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
