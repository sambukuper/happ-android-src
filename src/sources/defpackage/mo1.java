package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mo1 extends d8 {
    public HappTextButton A1;
    public HappTextButton B1;
    public String C1;
    public TextView D1;
    public dn2 E1;
    public dn2 F1;
    public TextView z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mo1() {
        super(t46.dialog_test, 26, 17, (Integer) null);
        this.C1 = "";
        this.E1 = new w01((byte) 15);
        this.F1 = new w01((byte) 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        view.getClass();
        this.z1 = (TextView) view.findViewById(e46.title);
        this.A1 = (HappTextButton) view.findViewById(e46.btn_negative);
        this.B1 = (HappTextButton) view.findViewById(e46.btn_reset);
        this.D1 = (TextView) view.findViewById(e46.tv_dns_tunnel);
        String str = this.C1;
        str.getClass();
        this.C1 = str;
        TextView textView = this.z1;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.D1;
        if (textView2 != null) {
            textView2.setText("");
        }
        AppCompatButton appCompatButton = this.A1;
        if (appCompatButton != null) {
            final byte b = 0;
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: lo1
                public final /* synthetic */ mo1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    mo1 mo1Var = this.Y;
                    switch (b2) {
                        case 0:
                            mo1Var.E1.invoke();
                            mo1Var.R(false, false);
                            break;
                        default:
                            mo1Var.F1.invoke();
                            break;
                    }
                }
            });
        }
        AppCompatButton appCompatButton2 = this.B1;
        if (appCompatButton2 != null) {
            final byte b2 = 1;
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: lo1
                public final /* synthetic */ mo1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    mo1 mo1Var = this.Y;
                    switch (b3) {
                        case 0:
                            mo1Var.E1.invoke();
                            mo1Var.R(false, false);
                            break;
                        default:
                            mo1Var.F1.invoke();
                            break;
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        Dialog dialogT = super.T(bundle);
        ((sn1) this).j1 = false;
        Dialog dialog = ((sn1) this).o1;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        return dialogT;
    }
}
