package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ko1 extends d8 {
    public static final m51 B1;
    public volatile jo1 A1;
    public final jo1 z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        B1 = gv3.c(g33.K(ow7VarB, dm4.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko1(jo1 jo1Var) {
        super(t46.fragment_dialog_subscription_update_progress, 34, 17, Integer.valueOf(p56.WrapContentDialog));
        jo1Var.getClass();
        this.z1 = jo1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        Dialog dialogT = super.T(bundle);
        Window window = dialogT.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -2;
            attributes.width = -2;
            window.setAttributes(attributes);
        }
        b0(this.z1, null);
        return dialogT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(jo1 jo1Var, String str) {
        int i;
        jo1Var.getClass();
        if (this.A1 == jo1Var) {
            return;
        }
        this.A1 = jo1Var;
        ImageView imageView = (ImageView) Y().findViewById(e46.dialog_progress_image);
        TextView textView = (TextView) Y().findViewById(e46.dialog_progress_text);
        if (jo1Var == jo1.X || jo1Var == jo1.Y || jo1Var == jo1.Z) {
            Dialog dialog = ((sn1) this).o1;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            Dialog dialog2 = ((sn1) this).o1;
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(false);
            }
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setRepeatCount(-1);
            imageView.setImageResource(q36.ic_progress_circle);
            imageView.startAnimation(rotateAnimation);
        } else {
            Dialog dialog3 = ((sn1) this).o1;
            if (dialog3 != null) {
                dialog3.setCancelable(true);
            }
            Dialog dialog4 = ((sn1) this).o1;
            if (dialog4 != null) {
                dialog4.setCanceledOnTouchOutside(true);
            }
            Animation animation = imageView.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            imageView.clearAnimation();
            imageView.setImageResource(q36.ic_failed_cross);
        }
        Context contextN = N();
        switch (jo1Var.ordinal()) {
            case 0:
                i = y46.dialog_subscription_update_msg_update;
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                i = y46.dialog_subscription_update_msg_check_update;
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                i = y46.dialog_subscription_update_msg_fallback;
                break;
            case 3:
                i = y46.dialog_subscription_update_msg_time_out;
                break;
            case 4:
                i = y46.dialog_subscription_update_msg_connection_error;
                break;
            case 5:
                i = y46.dialog_subscription_update_msg_certificate;
                break;
            case 6:
                i = y46.dialog_subscription_update_msg_restricted_access;
                break;
            default:
                b61.c();
                return;
        }
        textView.setText(fm7.R0(contextN.getString(i) + (str != null ? "\n\n".concat(str) : "")).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super/*sn1*/.onDismiss(dialogInterface);
        this.A1 = null;
    }
}
