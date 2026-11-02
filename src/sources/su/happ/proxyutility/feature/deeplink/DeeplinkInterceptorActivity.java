package su.happ.proxyutility.feature.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.ae1;
import defpackage.n69;
import defpackage.ss8;
import defpackage.yd1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/deeplink/DeeplinkInterceptorActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class DeeplinkInterceptorActivity extends ComponentActivity {
    public static volatile boolean y0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.feature.deeplink.DeeplinkInterceptorActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1173171990 && action.equals("android.intent.action.VIEW")) {
            try {
                ss8 ss8Var = ss8.a;
                EDeeplinkType eDeeplinkTypeB = ae1.b(ss8.d(String.valueOf(intent.getData())));
                int i = eDeeplinkTypeB == null ? -1 : yd1.a[eDeeplinkTypeB.ordinal()];
                if (i == 1 || i == 2) {
                    ss8.H(this);
                } else if (i == 3 || i == 4) {
                    ss8.I(this);
                } else if (i == 5) {
                    if (n69.a.getIsRunning() || y0) {
                        ss8.I(this);
                        y0 = false;
                    } else {
                        ss8.H(this);
                        y0 = true;
                    }
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
        finishAffinity();
    }
}
