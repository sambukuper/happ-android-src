package su.happ.proxyutility.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import defpackage.b26;
import defpackage.n69;
import defpackage.ss8;
import defpackage.y46;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsu/happ/proxyutility/service/QSTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "b26", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class QSTileService extends TileService {
    public static final /* synthetic */ int Y = 0;
    public final vz7 X = new vz7(new hr5(this, (byte) 2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        if (i == 1) {
            Tile qsTile = getQsTile();
            if (qsTile != null) {
                qsTile.setState(1);
            }
            Tile qsTile2 = getQsTile();
            if (qsTile2 != null) {
                qsTile2.setLabel(getString(y46.app_name));
            }
            Tile qsTile3 = getQsTile();
            if (qsTile3 != null) {
                qsTile3.setIcon(Icon.createWithResource(getApplicationContext(), q36.ic_stat_name));
            }
        } else if (i == 2) {
            Tile qsTile4 = getQsTile();
            if (qsTile4 != null) {
                qsTile4.setState(2);
            }
            Tile qsTile5 = getQsTile();
            if (qsTile5 != null) {
                ServerConfig serverConfig = n69.g;
                qsTile5.setLabel(serverConfig != null ? serverConfig.getRemarks() : null);
            }
            Tile qsTile6 = getQsTile();
            if (qsTile6 != null) {
                qsTile6.setIcon(Icon.createWithResource(getApplicationContext(), q36.ic_stat_name));
            }
        }
        Tile qsTile7 = getQsTile();
        if (qsTile7 != null) {
            qsTile7.updateTile();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        super.onClick();
        int state = getQsTile().getState();
        if (state == 1) {
            ss8 ss8Var = ss8.a;
            ss8.H(this);
        } else {
            if (state != 2) {
                return;
            }
            ss8 ss8Var2 = ss8.a;
            ss8.I(this);
            a(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        a(1);
        ue3.I(this, (b26) this.X.getValue(), new IntentFilter("su.happ.proxyutility.action.activity"), 2);
        try {
            Intent intent = new Intent();
            intent.setAction("su.happ.proxyutility.action.service");
            intent.setPackage("su.happ.proxyutility");
            intent.putExtra("key", 1);
            intent.putExtra("content", "");
            sendBroadcast(intent);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.service.quicksettings.TileService
    public final void onStopListening() {
        super.onStopListening();
        a(1);
        unregisterReceiver((b26) this.X.getValue());
    }
}
