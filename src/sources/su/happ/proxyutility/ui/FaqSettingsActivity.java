package su.happ.proxyutility.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.e46;
import defpackage.ln7;
import defpackage.t46;
import defpackage.y46;
import java.util.Map;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/ui/FaqSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class FaqSettingsActivity extends BaseActivity {
    public static final Map R0 = zp4.J(new qg5[]{new qg5("ru", "https://www.happ.su/main/ru/faq"), new qg5("zh", "https://www.happ.su/main/zh/faq")});
    public y5 Q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: su.happ.proxyutility.ui.FaqSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        ConstraintLayout constraintLayoutB;
        Toolbar toolbarB;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_faq_settings, (ViewGroup) null, false);
        int i = e46.cl_faq;
        ConstraintLayout constraintLayoutB2 = ln7.b(viewInflate, i);
        if (constraintLayoutB2 != null && (constraintLayoutB = ln7.b(viewInflate, (i = e46.cl_faq_link))) != null) {
            i = e46.cl_main;
            if (ln7.b(viewInflate, i) != null) {
                i = e46.title_category;
                if (((HappTextView) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                    i = e46.tv_faq_link;
                    HappTextView happTextView = (HappTextView) ln7.b(viewInflate, i);
                    if (happTextView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.Q0 = new y5(linearLayout, constraintLayoutB2, constraintLayoutB, toolbarB, happTextView, (byte) 0);
                        setContentView(linearLayout);
                        y5 y5Var = this.Q0;
                        if (y5Var == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        LinearLayout linearLayout2 = (LinearLayout) y5Var.Y;
                        linearLayout2.getClass();
                        setBarsParams(linearLayout2);
                        y5 y5Var2 = this.Q0;
                        if (y5Var2 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        r((Toolbar) y5Var2.f0);
                        setTitle(getString(y46.title_faq));
                        y5 y5Var3 = this.Q0;
                        if (y5Var3 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((ConstraintLayout) y5Var3.Z).setFocusableInTouchMode(ue3.y(this));
                        y5 y5Var4 = this.Q0;
                        if (y5Var4 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((HappTextView) y5Var4.h0).setText("https://www.happ.su/main/faq");
                        y5 y5Var5 = this.Q0;
                        if (y5Var5 != null) {
                            ((ConstraintLayout) y5Var5.g0).setOnClickListener(new st0(this, (byte) 3));
                            return;
                        } else {
                            dh3.T("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        y5 y5Var = this.Q0;
        if (y5Var != null) {
            return (Toolbar) y5Var.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        y5 y5Var = this.Q0;
        if (y5Var != null) {
            return ((ConstraintLayout) y5Var.Z).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}
