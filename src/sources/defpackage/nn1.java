package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import su.happ.proxyutility.dto.enums.EConfigObservatoryType;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class nn1 extends d8 {
    public HappTextButton A1;
    public HappTextButton B1;
    public String C1;
    public CustomSpinner D1;
    public String E1;
    public EConfigObservatoryType F1;
    public gn2 G1;
    public TextView z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        Context context;
        CustomSpinner customSpinner;
        view.getClass();
        this.z1 = (TextView) view.findViewById(e46.title);
        this.B1 = (HappTextButton) view.findViewById(e46.btn_positive);
        this.A1 = (HappTextButton) view.findViewById(e46.btn_negative);
        this.D1 = (CustomSpinner) view.findViewById(e46.sp_observatory_type);
        String str = this.C1;
        str.getClass();
        this.C1 = str;
        TextView textView = this.z1;
        if (textView != null) {
            textView.setText(str);
        }
        String[] stringArray = o().getStringArray(m26.observatory_type);
        stringArray.getClass();
        Dialog dialog = ((sn1) this).o1;
        final byte b = 0;
        if (dialog != null && (context = dialog.getContext()) != null && (customSpinner = this.D1) != null) {
            LayoutInflater layoutInflaterL = l();
            layoutInflaterL.getClass();
            customSpinner.setAdapter((SpinnerAdapter) new rf7(context, layoutInflaterL, customSpinner, stringArray));
            customSpinner.setOnItemSelectedListener(new mn1(stringArray, this));
            customSpinner.setSelection(0);
        }
        AppCompatButton appCompatButton = this.B1;
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ln1
                public final /* synthetic */ nn1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Code duplicated, block: B:14:0x0034  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Dialog dialog2;
                    Context context2;
                    Context context3;
                    switch (b) {
                        case 0:
                            nn1 nn1Var = this.Y;
                            String str2 = nn1Var.E1;
                            if (str2 != null) {
                                Dialog dialog3 = ((sn1) nn1Var).o1;
                                og7 og7VarG = null;
                                if (dialog3 != null && (context3 = dialog3.getContext()) != null) {
                                    u84 u84VarZ = ys0.z(((qk2) nn1Var).S0);
                                    nf1 nf1Var = tp1.a;
                                    og7VarG = w51.G(u84VarZ, ye1.Z, (e71) null, new co((Object) context3, str2, (Object) nn1Var, (q51) og7VarG, (byte) 1), 2);
                                }
                                if (og7VarG == null) {
                                    dialog2 = ((sn1) nn1Var).o1;
                                    if (dialog2 != null && (context2 = dialog2.getContext()) != null) {
                                        x79.i(context2, "Fail Create Dialog");
                                    }
                                }
                            } else {
                                dialog2 = ((sn1) nn1Var).o1;
                                if (dialog2 != null) {
                                    x79.i(context2, "Fail Create Dialog");
                                }
                            }
                            nn1Var.R(false, false);
                            break;
                        default:
                            this.Y.R(false, false);
                            break;
                    }
                }
            });
        }
        AppCompatButton appCompatButton2 = this.A1;
        if (appCompatButton2 != null) {
            final byte b2 = 1;
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ln1
                public final /* synthetic */ nn1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Code duplicated, block: B:14:0x0034  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Dialog dialog2;
                    Context context2;
                    Context context3;
                    switch (b2) {
                        case 0:
                            nn1 nn1Var = this.Y;
                            String str2 = nn1Var.E1;
                            if (str2 != null) {
                                Dialog dialog3 = ((sn1) nn1Var).o1;
                                og7 og7VarG = null;
                                if (dialog3 != null && (context3 = dialog3.getContext()) != null) {
                                    u84 u84VarZ = ys0.z(((qk2) nn1Var).S0);
                                    nf1 nf1Var = tp1.a;
                                    og7VarG = w51.G(u84VarZ, ye1.Z, (e71) null, new co((Object) context3, str2, (Object) nn1Var, (q51) og7VarG, (byte) 1), 2);
                                }
                                if (og7VarG == null) {
                                    dialog2 = ((sn1) nn1Var).o1;
                                    if (dialog2 != null && (context2 = dialog2.getContext()) != null) {
                                        x79.i(context2, "Fail Create Dialog");
                                    }
                                }
                            } else {
                                dialog2 = ((sn1) nn1Var).o1;
                                if (dialog2 != null) {
                                    x79.i(context2, "Fail Create Dialog");
                                }
                            }
                            nn1Var.R(false, false);
                            break;
                        default:
                            this.Y.R(false, false);
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
