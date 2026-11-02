package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkn1;", "Ls10;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class kn1 extends s10 {
    public y5 u1;
    public String x1;
    public zl4 y1;
    public final vz7 t1 = new vz7(new w01((byte) 13));
    public String v1 = "";
    public String w1 = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s10
    public final void x(Context context) {
        super.x(context);
        this.y1 = context instanceof zl4 ? (zl4) context : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        Bundle bundle = ((qk2) this).h0;
        if (bundle == null) {
            bt.q("Required value was null.");
            return null;
        }
        String string = bundle.getString("core_routing_file_name", "");
        string.getClass();
        this.v1 = string;
        String string2 = bundle.getString("core_routing_sections_name", "");
        string2.getClass();
        this.w1 = string2;
        this.x1 = bundle.getString("core_routing_message");
        final byte b = 0;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(t46.fragment_dialog_core_routing_error, viewGroup, false);
        int i = e46.btn_close;
        AppCompatImageView appCompatImageViewB = ln7.b(constraintLayoutInflate, i);
        if (appCompatImageViewB != null) {
            i = e46.btn_run;
            HappTextButton happTextButton = (HappTextButton) ln7.b(constraintLayoutInflate, i);
            if (happTextButton != null) {
                i = e46.btn_update;
                HappTextButton happTextButton2 = (HappTextButton) ln7.b(constraintLayoutInflate, i);
                if (happTextButton2 != null) {
                    i = e46.cl_btn;
                    if (ln7.b(constraintLayoutInflate, i) != null) {
                        i = e46.cl_title;
                        if (ln7.b(constraintLayoutInflate, i) != null) {
                            i = e46.fragment_main;
                            if (((LinearLayout) ln7.b(constraintLayoutInflate, i)) != null) {
                                i = e46.tv_content;
                                HappTextView happTextView = (HappTextView) ln7.b(constraintLayoutInflate, i);
                                if (happTextView != null) {
                                    i = e46.tv_title;
                                    if (((HappTextView) ln7.b(constraintLayoutInflate, i)) != null) {
                                        this.u1 = new y5(constraintLayoutInflate, appCompatImageViewB, happTextButton, happTextButton2, happTextView);
                                        RouteProfile routeProfileK = mn6.k((mn6) this.t1.getValue());
                                        y5 y5Var = this.u1;
                                        if (routeProfileK == null) {
                                            if (y5Var == null) {
                                                dh3.T("binding");
                                                throw null;
                                            }
                                            ((HappTextButton) y5Var.f0).setVisibility(8);
                                            y5 y5Var2 = this.u1;
                                            if (y5Var2 == null) {
                                                dh3.T("binding");
                                                throw null;
                                            }
                                            AppCompatTextView appCompatTextView = (HappTextView) y5Var2.h0;
                                            CharSequence string3 = this.x1;
                                            if (string3 == null) {
                                                string3 = o().getString(y46.core_fail_run_section_missing_without_profile, this.w1, this.v1);
                                                string3.getClass();
                                            }
                                            appCompatTextView.setText(string3);
                                        } else {
                                            if (y5Var == null) {
                                                dh3.T("binding");
                                                throw null;
                                            }
                                            AppCompatTextView appCompatTextView2 = (HappTextView) y5Var.h0;
                                            CharSequence string4 = this.x1;
                                            if (string4 == null) {
                                                string4 = o().getString(y46.core_fail_run_section_missing, this.w1, this.v1);
                                                string4.getClass();
                                            }
                                            appCompatTextView2.setText(string4);
                                        }
                                        boolean zY = ue3.y(N());
                                        y5 y5Var3 = this.u1;
                                        if (y5Var3 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((HappTextButton) y5Var3.f0).setFocusableInTouchMode(zY);
                                        y5 y5Var4 = this.u1;
                                        if (y5Var4 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((HappTextButton) y5Var4.g0).setFocusableInTouchMode(zY);
                                        y5 y5Var5 = this.u1;
                                        if (y5Var5 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((AppCompatImageView) y5Var5.Y).setFocusableInTouchMode(zY);
                                        y5 y5Var6 = this.u1;
                                        if (y5Var6 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((HappTextButton) y5Var6.f0).setOnClickListener(new View.OnClickListener(this) { // from class: jn1
                                            public final /* synthetic */ kn1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b2 = b;
                                                kn1 kn1Var = this.Y;
                                                switch (b2) {
                                                    case 0:
                                                        RouteProfile routeProfileK2 = mn6.k((mn6) kn1Var.t1.getValue());
                                                        if (routeProfileK2 != null) {
                                                            jm4.Q(ys0.z(((qk2) kn1Var).S0), (u61) null, new y9(kn1Var, routeProfileK2, (q51) null, (byte) 4), 3);
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                        zl4 zl4Var = kn1Var.y1;
                                                        if (zl4Var != null) {
                                                            MainActivity mainActivity = (MainActivity) zl4Var;
                                                            mainActivity.H().p("pref_run_without_routing", true);
                                                            mainActivity.i0();
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    default:
                                                        kn1Var.R(false, false);
                                                        break;
                                                }
                                            }
                                        });
                                        y5 y5Var7 = this.u1;
                                        if (y5Var7 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b2 = 1;
                                        ((HappTextButton) y5Var7.g0).setOnClickListener(new View.OnClickListener(this) { // from class: jn1
                                            public final /* synthetic */ kn1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b3 = b2;
                                                kn1 kn1Var = this.Y;
                                                switch (b3) {
                                                    case 0:
                                                        RouteProfile routeProfileK2 = mn6.k((mn6) kn1Var.t1.getValue());
                                                        if (routeProfileK2 != null) {
                                                            jm4.Q(ys0.z(((qk2) kn1Var).S0), (u61) null, new y9(kn1Var, routeProfileK2, (q51) null, (byte) 4), 3);
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                        zl4 zl4Var = kn1Var.y1;
                                                        if (zl4Var != null) {
                                                            MainActivity mainActivity = (MainActivity) zl4Var;
                                                            mainActivity.H().p("pref_run_without_routing", true);
                                                            mainActivity.i0();
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    default:
                                                        kn1Var.R(false, false);
                                                        break;
                                                }
                                            }
                                        });
                                        y5 y5Var8 = this.u1;
                                        if (y5Var8 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b3 = 2;
                                        ((AppCompatImageView) y5Var8.Y).setOnClickListener(new View.OnClickListener(this) { // from class: jn1
                                            public final /* synthetic */ kn1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b4 = b3;
                                                kn1 kn1Var = this.Y;
                                                switch (b4) {
                                                    case 0:
                                                        RouteProfile routeProfileK2 = mn6.k((mn6) kn1Var.t1.getValue());
                                                        if (routeProfileK2 != null) {
                                                            jm4.Q(ys0.z(((qk2) kn1Var).S0), (u61) null, new y9(kn1Var, routeProfileK2, (q51) null, (byte) 4), 3);
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                        zl4 zl4Var = kn1Var.y1;
                                                        if (zl4Var != null) {
                                                            MainActivity mainActivity = (MainActivity) zl4Var;
                                                            mainActivity.H().p("pref_run_without_routing", true);
                                                            mainActivity.i0();
                                                        }
                                                        kn1Var.R(false, false);
                                                        break;
                                                    default:
                                                        kn1Var.R(false, false);
                                                        break;
                                                }
                                            }
                                        });
                                        new Handler(Looper.getMainLooper()).post(new c1(this, (byte) 16));
                                        y5 y5Var9 = this.u1;
                                        if (y5Var9 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ConstraintLayout constraintLayout = (ConstraintLayout) y5Var9.Z;
                                        constraintLayout.getClass();
                                        return constraintLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }
}
