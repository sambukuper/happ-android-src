package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import su.happ.proxyutility.ui.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class d09 extends WebViewClient {
    public final /* synthetic */ WebViewActivity a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d09(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        z47 z47Var = this.a.Q0;
        if (z47Var != null) {
            ((ConstraintLayout) z47Var.Z).setVisibility(8);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        z47 z47Var = this.a.Q0;
        if (z47Var != null) {
            ((ConstraintLayout) z47Var.Z).setVisibility(0);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        z47 z47Var = this.a.Q0;
        if (z47Var != null) {
            ((ConstraintLayout) z47Var.Z).setVisibility(8);
        } else {
            dh3.T("binding");
            throw null;
        }
    }
}
