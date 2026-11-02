package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class f32 extends DialogFragment {
    public Dialog X;
    public DialogInterface.OnCancelListener Y;
    public AlertDialog Z;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.Y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.X;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.Z;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        w45.s(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.Z = alertDialogCreate;
        return alertDialogCreate;
    }
}
