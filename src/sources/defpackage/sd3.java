package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sd3 extends d8 {
    public final String A1;
    public final gn2 B1;
    public final od3 z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sd3(od3 od3Var, String str, gn2 gn2Var) {
        super(t46.dialog_input_custom, 26, 17, (Integer) null);
        this.z1 = od3Var;
        this.A1 = str;
        this.B1 = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        String strP;
        view.getClass();
        TextView textView = (TextView) view.findViewById(e46.tv_title);
        AppCompatTextView appCompatTextViewFindViewById = view.findViewById(e46.tv_text);
        Button button = (Button) view.findViewById(e46.btn_negative);
        Button button2 = (Button) view.findViewById(e46.btn_neutral);
        Button button3 = (Button) view.findViewById(e46.btn_positive);
        EditText editText = (EditText) view.findViewById(e46.et_text);
        TextView textView2 = (TextView) view.findViewById(e46.tv_symbols_indicator);
        mb6.g(new z47(view));
        od3 od3Var = this.z1;
        int iOrdinal = od3Var.ordinal();
        final byte b = 1;
        if (iOrdinal == 0) {
            strP = p(y46.title_geoip);
        } else if (iOrdinal == 1) {
            strP = p(y46.title_geosite);
        } else if (iOrdinal == 2) {
            strP = p(y46.routing_settings_remote_dns);
        } else if (iOrdinal == 3) {
            strP = p(y46.routing_settings_domestic_dns);
        } else {
            if (iOrdinal != 4) {
                b61.c();
                return;
            }
            strP = p(y46.routing_settings_title_name);
        }
        textView.setText(strP);
        String str = this.A1;
        if (str != null) {
            editText.setText(wl7.e0(str));
        }
        boolean zY = ue3.y(N());
        button3.setFocusableInTouchMode(zY);
        button2.setFocusableInTouchMode(zY);
        button.setFocusableInTouchMode(zY);
        button3.setOnClickListener(new go1(this, editText, (byte) 5));
        final byte b2 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: nd3
            public final /* synthetic */ sd3 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                sd3 sd3Var = this.Y;
                switch (b3) {
                    case 0:
                        sd3Var.B1.B("");
                        sd3Var.R(false, false);
                        break;
                    default:
                        sd3Var.R(false, false);
                        break;
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener(this) { // from class: nd3
            public final /* synthetic */ sd3 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                sd3 sd3Var = this.Y;
                switch (b3) {
                    case 0:
                        sd3Var.B1.B("");
                        sd3Var.R(false, false);
                        break;
                    default:
                        sd3Var.R(false, false);
                        break;
                }
            }
        });
        new Handler(Looper.getMainLooper()).post(new c1(editText, (byte) 23));
        int iOrdinal2 = od3Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            textView2.setVisibility(0);
            textView2.setText(N().getString(y46.dialog_input_url_symbols_indicator, Integer.valueOf(editText.getText().toString().length())));
            editText.addTextChangedListener(new pd3(textView2, this));
            appCompatTextViewFindViewById.setText("URL");
            button2.setVisibility(0);
            editText.setFilters(new rd3[]{new rd3(2048)});
            return;
        }
        if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            textView2.setVisibility(8);
            appCompatTextViewFindViewById.setText("DNS");
            button2.setVisibility(0);
        } else {
            if (iOrdinal2 != 4) {
                b61.c();
                return;
            }
            appCompatTextViewFindViewById.setText("");
            button2.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(editText.getText().toString().length() + " / 128");
            editText.addTextChangedListener(new qd3(textView2, button3, this));
            editText.setFilters(new rd3[]{new rd3(128)});
            button3.setText(N().getString(y46.dialog_subscription_edit_button_create));
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
