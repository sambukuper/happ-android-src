package su.happ.proxyutility.feature.routing.profile;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.ep6;
import defpackage.gw5;
import defpackage.nn6;
import defpackage.on6;
import defpackage.qo6;
import defpackage.sq6;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/routing/profile/RoutingProfileActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class RoutingProfileActivity extends ComponentActivity {
    public static final /* synthetic */ int B0 = 0;
    public final y5 A0;
    public final y5 y0;
    public final y5 z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoutingProfileActivity() {
        on6 on6Var = new on6(this, (byte) 0);
        zb6 zb6Var = yb6.a;
        this.y0 = new y5(zb6Var.b(ep6.class), new on6(this, (byte) 1), on6Var, new on6(this, (byte) 2));
        this.z0 = new y5(zb6Var.b(sq6.class), new on6(this, (byte) 4), new on6(this, (byte) 3), new on6(this, (byte) 5));
        this.A0 = new y5(zb6Var.b(gw5.class), new on6(this, (byte) 7), new on6(this, (byte) 6), new on6(this, (byte) 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ep6) this.y0.getValue()).i(qo6.a);
        my0.a(this, new zy0(1117145728, true, new nn6(this, (byte) 0)));
    }
}
