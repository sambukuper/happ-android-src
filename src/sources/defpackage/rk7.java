package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import androidx.databinding.DataBinderMapperImpl;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk7;", "Lqk2;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class rk7 extends qk2 {
    public xl2 d1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        int i = xl2.r0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        q51 q51Var = null;
        xl2 xl2Var = (xl2) kw8.c(t46.fragment_story_page, layoutInflater, (ViewGroup) null);
        xl2Var.getClass();
        this.d1 = xl2Var;
        Bundle bundle = ((qk2) this).h0;
        ld6 ld6Var = bundle != null ? (ld6) c4.l(bundle, yb6.a.b(ld6.class)) : null;
        if (ld6Var == null) {
            bt.q("Required value was null.");
            return null;
        }
        ga1 ga1VarC = ld6Var.Y.c();
        int i2 = M().J0;
        int i3 = M().K0;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, o().getDisplayMetrics());
        xl2 xl2Var2 = this.d1;
        if (xl2Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = xl2Var2.m0;
        xl2 xl2Var3 = this.d1;
        if (xl2Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(xl2Var3.m0.getLayoutParams());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = i2 + iApplyDimension;
        layoutParams.bottomMargin = i3 + iApplyDimension;
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        xl2 xl2Var4 = this.d1;
        if (xl2Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        TextSwitcher textSwitcher = xl2Var4.q0;
        textSwitcher.getClass();
        String str = ga1VarC.X;
        if (str == null) {
            str = "";
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 63);
        spannedFromHtml.getClass();
        textSwitcher.setText(spannedFromHtml);
        xl2 xl2Var5 = this.d1;
        if (xl2Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        TextSwitcher textSwitcher2 = xl2Var5.p0;
        textSwitcher2.getClass();
        String str2 = ga1VarC.Y;
        str2.getClass();
        Spanned spannedFromHtml2 = Html.fromHtml(str2, 63);
        spannedFromHtml2.getClass();
        textSwitcher2.setText(spannedFromHtml2);
        u84 u84VarZ = ys0.z(((qk2) this).S0);
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, dm4.a, new t17(this, ld6Var, q51Var, (byte) 9), 2);
        xl2 xl2Var6 = this.d1;
        if (xl2Var6 != null) {
            return ((kw8) xl2Var6).Z;
        }
        dh3.T("binding");
        throw null;
    }
}
