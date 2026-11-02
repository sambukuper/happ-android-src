package su.happ.proxyutility.feature.subscription_properties;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.pt7;
import defpackage.rs7;
import defpackage.ss7;
import defpackage.yt7;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/subscription_properties/SubscriptionPropertiesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class SubscriptionPropertiesActivity extends ComponentActivity {
    public static final /* synthetic */ int z0 = 0;
    public final y5 y0 = new y5(yb6.a.b(yt7.class), new ss7(this, (byte) 1), new ss7(this, (byte) 0), new ss7(this, (byte) 2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        String stringExtra = intent.getStringExtra("sub_id");
        if (stringExtra == null) {
            stringExtra = null;
        }
        if (stringExtra == null) {
            finish();
        } else {
            ((yt7) this.y0.getValue()).f(new pt7(stringExtra));
            my0.a(this, new zy0(-2073145908, true, new rs7(this, (byte) 0)));
        }
    }
}
