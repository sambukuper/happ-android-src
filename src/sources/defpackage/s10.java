package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls10;", "Lsn1;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public class s10 extends sn1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        View view;
        Window window;
        super.G();
        Dialog dialog = ((sn1) this).o1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        Dialog dialog2 = ((sn1) this).o1;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            xt7.f(window, true);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        BaseActivity baseActivityI = i();
        if ((baseActivityI instanceof BaseActivity ? baseActivityI : null) == null || (view = ((qk2) this).J0) == null) {
            return;
        }
        bt btVar = new bt();
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(view, btVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources != null ? resources.getConfiguration() : null);
        configuration.fontScale = 1.0f;
        super.x(context.createConfigurationContext(configuration));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(Bundle bundle) {
        super.y(bundle);
        gv3.f(M().b(), this, new y0(this, (byte) 10));
    }
}
