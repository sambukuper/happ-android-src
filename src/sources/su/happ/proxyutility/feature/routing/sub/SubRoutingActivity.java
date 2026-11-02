package su.happ.proxyutility.feature.routing.sub;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.gw5;
import defpackage.hn7;
import defpackage.in7;
import defpackage.np7;
import defpackage.po7;
import defpackage.rv5;
import defpackage.vv5;
import defpackage.zo7;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class SubRoutingActivity extends ComponentActivity {
    public static final /* synthetic */ int C0 = 0;
    public final y5 A0;
    public final fn6 B0;
    public final y5 y0;
    public final y5 z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubRoutingActivity() {
        in7 in7Var = new in7(this, (byte) 0);
        zb6 zb6Var = yb6.a;
        this.y0 = new y5(zb6Var.b(np7.class), new in7(this, (byte) 1), in7Var, new in7(this, (byte) 2));
        this.z0 = new y5(zb6Var.b(vv5.class), new in7(this, (byte) 4), new in7(this, (byte) 3), new in7(this, (byte) 5));
        this.A0 = new y5(zb6Var.b(gw5.class), new in7(this, (byte) 7), new in7(this, (byte) 6), new in7(this, (byte) 8));
        this.B0 = new fn6(this, (byte) 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.feature.routing.sub.SubRoutingActivity */
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
            return;
        }
        ((np7) this.y0.getValue()).g(new po7(stringExtra));
        ((vv5) this.z0.getValue()).f(new rv5(stringExtra, this.B0));
        my0.a(this, new zy0(-551533399, true, new hn7(this, (byte) 0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: su.happ.proxyutility.feature.routing.sub.SubRoutingActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super/*android.app.Activity*/.onStart();
        ((np7) this.y0.getValue()).g(zo7.a);
    }
}
