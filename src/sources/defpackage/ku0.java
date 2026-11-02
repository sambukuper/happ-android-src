package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lku0;", "Ls10;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ku0 extends s10 {
    public lr t1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        final byte b = 0;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(t46.fragment_dialog_clipboard_content, viewGroup, false);
        int i = e46.btn_close;
        AppCompatImageView appCompatImageViewB = ln7.b(constraintLayoutInflate, i);
        if (appCompatImageViewB != null) {
            i = e46.cl_title;
            if (ln7.b(constraintLayoutInflate, i) != null) {
                i = e46.fragment_main;
                if (ln7.b(constraintLayoutInflate, i) != null) {
                    i = e46.tv_clipboard_content;
                    HappTextView happTextView = (HappTextView) ln7.b(constraintLayoutInflate, i);
                    if (happTextView != null) {
                        i = e46.tv_title;
                        if (((HappTextView) ln7.b(constraintLayoutInflate, i)) != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            this.t1 = new lr(constraintLayout, appCompatImageViewB, happTextView, (byte) 28);
                            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ju0
                                public final /* synthetic */ ku0 Y;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                {
                                    this.Y = this;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b2 = b;
                                    ku0 ku0Var = this.Y;
                                    switch (b2) {
                                        case 0:
                                            ku0Var.R(false, false);
                                            break;
                                        default:
                                            ku0Var.R(false, false);
                                            break;
                                    }
                                }
                            });
                            lr lrVar = this.t1;
                            if (lrVar == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            final byte b2 = 1;
                            ((AppCompatImageView) lrVar.Z).setOnClickListener(new View.OnClickListener(this) { // from class: ju0
                                public final /* synthetic */ ku0 Y;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                {
                                    this.Y = this;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b3 = b2;
                                    ku0 ku0Var = this.Y;
                                    switch (b3) {
                                        case 0:
                                            ku0Var.R(false, false);
                                            break;
                                        default:
                                            ku0Var.R(false, false);
                                            break;
                                    }
                                }
                            });
                            lr lrVar2 = this.t1;
                            if (lrVar2 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            AppCompatTextView appCompatTextView = (HappTextView) lrVar2.f0;
                            ss8 ss8Var = ss8.a;
                            appCompatTextView.setText(ss8.g(N()));
                            lr lrVar3 = this.t1;
                            if (lrVar3 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) lrVar3.Y;
                            constraintLayout2.getClass();
                            return constraintLayout2;
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }
}
