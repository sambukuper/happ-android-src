package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class en1 extends d8 {
    public final String A1;
    public final String B1;
    public final String C1;
    public final String D1;
    public final String E1;
    public final boolean F1;
    public final dn2 G1;
    public final dn2 H1;
    public final boolean z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public en1(boolean z, String str, String str2, String str3, String str4, String str5, Integer num, boolean z2, dn2 dn2Var, dn2 dn2Var2) {
        super(num != null ? num.intValue() : t46.dialog_alert, 26, 17, (Integer) null);
        this.z1 = z;
        this.A1 = str;
        this.B1 = str2;
        this.C1 = str3;
        this.D1 = str4;
        this.E1 = str5;
        this.F1 = z2;
        this.G1 = dn2Var;
        this.H1 = dn2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public final void I(View view) {
        String strP;
        view.getClass();
        AppCompatTextView appCompatTextView = (HappTextView) view.findViewById(e46.tv_title);
        final byte b = 0;
        if (this.F1) {
            appCompatTextView.getViewTreeObserver().addOnGlobalLayoutListener(new zm1(appCompatTextView, (byte) 0));
        }
        TextView textView = (TextView) view.findViewById(e46.tv_content);
        TextView textView2 = (TextView) view.findViewById(e46.tv_support_content);
        Button button = (Button) view.findViewById(e46.btn_positive);
        Button button2 = (Button) view.findViewById(e46.btn_negative);
        ImageView imageView = (ImageView) view.findViewById(e46.btn_close);
        Context context = view.getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        CharSequence charSequence = this.A1;
        if (charSequence != null) {
            appCompatTextView.setText(charSequence);
        } else {
            appCompatTextView.setVisibility(8);
        }
        String str = this.B1;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        if (textView2 != null) {
            String str2 = this.C1;
            if (str2 != null) {
                textView2.setText(str2);
            } else {
                textView2.setVisibility(8);
            }
        }
        button.getClass();
        button.addTextChangedListener(new cn1(button, button2, (byte) 0));
        char c = 1;
        if (button2 != null) {
            button2.addTextChangedListener(new cn1(button2, button, (byte) 1));
        }
        String str3 = this.D1;
        if (str3 != null) {
            strP = str3;
        } else {
            strP = p(R.string.ok);
            strP.getClass();
        }
        button.setText(strP);
        button.setFocusableInTouchMode(zY);
        Drawable[] compoundDrawables = button.getCompoundDrawables();
        compoundDrawables.getClass();
        Iterator it = eu.q0(compoundDrawables).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(new PorterDuffColorFilter(os4.q(N(), d36.button_primary_foreground_on_background), PorterDuff.Mode.SRC_IN));
        }
        if (this.G1 != null) {
            button.setOnClickListener(new View.OnClickListener(this) { // from class: an1
                public final /* synthetic */ en1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    en1 en1Var = this.Y;
                    switch (b2) {
                        case 0:
                            en1Var.G1.invoke();
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            dn2 dn2Var = en1Var.H1;
                            if (dn2Var != null) {
                                dn2Var.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                        default:
                            dn2 dn2Var2 = en1Var.H1;
                            if (dn2Var2 != null) {
                                dn2Var2.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                    }
                }
            });
        } else if (str3 != null) {
            final char c2 = c == true ? 1 : 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: an1
                public final /* synthetic */ en1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = c2;
                    en1 en1Var = this.Y;
                    switch (b2) {
                        case 0:
                            en1Var.G1.invoke();
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            dn2 dn2Var = en1Var.H1;
                            if (dn2Var != null) {
                                dn2Var.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                        default:
                            dn2 dn2Var2 = en1Var.H1;
                            if (dn2Var2 != null) {
                                dn2Var2.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                    }
                }
            });
        } else {
            button.setVisibility(8);
        }
        String strP2 = this.E1;
        if (button2 != null) {
            button2.setVisibility(strP2 == null ? ((sn1) this).j1 : true ? 0 : 8);
        }
        if (button2 != null) {
            if (strP2 == null) {
                strP2 = p(R.string.cancel);
                strP2.getClass();
            }
            button2.setText(strP2);
        }
        if (button2 != null) {
            button2.setFocusableInTouchMode(zY);
        }
        if (button2 != null) {
            final byte b2 = 2;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: an1
                public final /* synthetic */ en1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    en1 en1Var = this.Y;
                    switch (b3) {
                        case 0:
                            en1Var.G1.invoke();
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            dn2 dn2Var = en1Var.H1;
                            if (dn2Var != null) {
                                dn2Var.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                        default:
                            dn2 dn2Var2 = en1Var.H1;
                            if (dn2Var2 != null) {
                                dn2Var2.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                    }
                }
            });
        }
        if (imageView != null) {
            imageView.setVisibility(((sn1) this).j1 ? 0 : 8);
        }
        if (imageView != null) {
            imageView.setFocusableInTouchMode(zY);
        }
        if (imageView != null) {
            final byte b3 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: an1
                public final /* synthetic */ en1 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b3;
                    en1 en1Var = this.Y;
                    switch (b4) {
                        case 0:
                            en1Var.G1.invoke();
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            en1Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            dn2 dn2Var = en1Var.H1;
                            if (dn2Var != null) {
                                dn2Var.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                        default:
                            dn2 dn2Var2 = en1Var.H1;
                            if (dn2Var2 != null) {
                                dn2Var2.invoke();
                            }
                            en1Var.R(false, false);
                            break;
                    }
                }
            });
        }
        if (zY) {
            new Handler(Looper.getMainLooper()).post(new bn1(button, (byte) 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        Dialog dialogT = super.T(bundle);
        boolean z = this.z1;
        ((sn1) this).j1 = z;
        Dialog dialog = ((sn1) this).o1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        return dialogT;
    }
}
