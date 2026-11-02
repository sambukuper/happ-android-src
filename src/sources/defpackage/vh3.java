package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh3;", "Ld8;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class vh3 extends d8 {
    public static final m51 z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        z1 = gv3.c(g33.K(ow7VarB, dm4.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vh3() {
        super(t46.dialog_alert, 26, 17, (Integer) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        view.getClass();
        TextView textView = (TextView) view.findViewById(e46.tv_title);
        TextView textView2 = (TextView) view.findViewById(e46.tv_content);
        TextView textView3 = (TextView) view.findViewById(e46.tv_support_content);
        Button button = (Button) view.findViewById(e46.btn_positive);
        Button button2 = (Button) view.findViewById(e46.btn_negative);
        ImageView imageView = (ImageView) view.findViewById(e46.btn_close);
        Context context = view.getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        textView.setText(p(y46.warning_text));
        textView2.setText(p(y46.dialog_invalid_system_time));
        textView3.getClass();
        textView3.setVisibility(8);
        button.getClass();
        final byte b = 2;
        button.addTextChangedListener(new cn1(button, button2, (byte) 2));
        if (button2 != null) {
            button2.addTextChangedListener(new cn1(button2, button, (byte) 3));
        }
        button.setText(p(R.string.ok));
        button.setFocusableInTouchMode(zY);
        final byte b2 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: th3
            public final /* synthetic */ vh3 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                vh3 vh3Var = this.Y;
                switch (b3) {
                    case 0:
                        m51 m51Var = vh3.z1;
                        vh3Var.R(false, false);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        m51 m51Var2 = vh3.z1;
                        vh3Var.R(false, false);
                        break;
                    default:
                        m51 m51Var3 = vh3.z1;
                        vh3Var.R(false, false);
                        break;
                }
            }
        });
        if (button2 != null) {
            button2.setVisibility(((sn1) this).j1 ? 0 : 8);
        }
        if (button2 != null) {
            button2.setText(p(R.string.cancel));
        }
        if (button2 != null) {
            button2.setFocusableInTouchMode(zY);
        }
        final byte b3 = 1;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: th3
                public final /* synthetic */ vh3 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b3;
                    vh3 vh3Var = this.Y;
                    switch (b4) {
                        case 0:
                            m51 m51Var = vh3.z1;
                            vh3Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            m51 m51Var2 = vh3.z1;
                            vh3Var.R(false, false);
                            break;
                        default:
                            m51 m51Var3 = vh3.z1;
                            vh3Var.R(false, false);
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
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: th3
                public final /* synthetic */ vh3 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b;
                    vh3 vh3Var = this.Y;
                    switch (b4) {
                        case 0:
                            m51 m51Var = vh3.z1;
                            vh3Var.R(false, false);
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            m51 m51Var2 = vh3.z1;
                            vh3Var.R(false, false);
                            break;
                        default:
                            m51 m51Var3 = vh3.z1;
                            vh3Var.R(false, false);
                            break;
                    }
                }
            });
        }
        if (zY) {
            new Handler(Looper.getMainLooper()).post(new bn1(button, (byte) 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        Dialog dialogT = super.T(bundle);
        ((sn1) this).j1 = true;
        Dialog dialog = ((sn1) this).o1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        return dialogT;
    }
}
