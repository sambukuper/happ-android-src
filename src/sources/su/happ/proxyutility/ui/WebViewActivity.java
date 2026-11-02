package su.happ.proxyutility.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.d09;
import defpackage.e09;
import defpackage.e46;
import defpackage.ln7;
import defpackage.t46;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/ui/WebViewActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class WebViewActivity extends BaseActivity {
    public z47 Q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: su.happ.proxyutility.ui.WebViewActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_web_view, (ViewGroup) null, false);
        int i = e46.cl_loading;
        ConstraintLayout constraintLayoutB = ln7.b(viewInflate, i);
        if (constraintLayoutB != null) {
            i = e46.cl_main;
            if (ln7.b(viewInflate, i) != null) {
                i = e46.pb_loading;
                if (((ProgressBar) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                    i = e46.wv_main;
                    WebView webView = (WebView) ln7.b(viewInflate, i);
                    if (webView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.Q0 = new z47(linearLayout, constraintLayoutB, toolbarB, webView, (byte) 4);
                        setContentView(linearLayout);
                        z47 z47Var = this.Q0;
                        if (z47Var == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        LinearLayout linearLayout2 = (LinearLayout) z47Var.Y;
                        linearLayout2.getClass();
                        setBarsParams(linearLayout2);
                        z47 z47Var2 = this.Q0;
                        if (z47Var2 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        r((Toolbar) z47Var2.f0);
                        setTitle(getString(y46.title_web_view));
                        String stringExtra = getIntent().getStringExtra("urlInIntent");
                        if (stringExtra == null) {
                            finish();
                            return;
                        }
                        z47 z47Var3 = this.Q0;
                        if (z47Var3 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var3.g0).setWebViewClient(new d09(this));
                        z47 z47Var4 = this.Q0;
                        if (z47Var4 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var4.g0).setWebChromeClient(new e09(this));
                        z47 z47Var5 = this.Q0;
                        if (z47Var5 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var5.g0).getSettings().setJavaScriptEnabled(true);
                        z47 z47Var6 = this.Q0;
                        if (z47Var6 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var6.g0).getSettings().setDomStorageEnabled(true);
                        z47 z47Var7 = this.Q0;
                        if (z47Var7 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var7.g0).setVerticalScrollBarEnabled(true);
                        z47 z47Var8 = this.Q0;
                        if (z47Var8 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((WebView) z47Var8.g0).setHorizontalScrollBarEnabled(true);
                        z47 z47Var9 = this.Q0;
                        if (z47Var9 != null) {
                            ((WebView) z47Var9.g0).loadUrl(stringExtra);
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
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: su.happ.proxyutility.ui.WebViewActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("urlInIntent");
        if (stringExtra != null) {
            z47 z47Var = this.Q0;
            if (z47Var != null) {
                ((WebView) z47Var.g0).loadUrl(stringExtra);
            } else {
                dh3.T("binding");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        z47 z47Var = this.Q0;
        if (z47Var != null) {
            return (Toolbar) z47Var.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        z47 z47Var = this.Q0;
        if (z47Var != null) {
            return ((WebView) z47Var.g0).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}
