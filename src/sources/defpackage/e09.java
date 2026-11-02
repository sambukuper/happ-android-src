package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import su.happ.proxyutility.ui.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class e09 extends WebChromeClient {
    public final /* synthetic */ WebViewActivity a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e09(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (i >= 100) {
            z47 z47Var = this.a.Q0;
            if (z47Var != null) {
                ((ConstraintLayout) z47Var.Z).setVisibility(8);
            } else {
                dh3.T("binding");
                throw null;
            }
        }
    }
}
