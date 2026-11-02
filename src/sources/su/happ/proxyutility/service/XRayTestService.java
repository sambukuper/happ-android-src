package su.happ.proxyutility.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.i69;
import defpackage.of7;
import defpackage.t17;
import go.Seq;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.TestPingViaProxyResultData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/service/XRayTestService;", "Landroid/app/Service;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class XRayTestService extends Service {
    public static final vz7 X = new vz7(new i69((byte) 4));
    public static final vz7 Y = new vz7(new i69((byte) 5));
    public static final vz7 Z = new vz7(new i69((byte) 6));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(TestPingViaProxyData testPingViaProxyData) {
        of7 of7Var = of7.a;
        String strH = yw2.b.h(new TestPingViaProxyResultData(of7.e(testPingViaProxyData.getConfig(), testPingViaProxyData.getType()), testPingViaProxyData.getGuid()));
        try {
            Intent intent = new Intent();
            intent.setAction("su.happ.proxyutility.action.activity");
            intent.setPackage("su.happ.proxyutility");
            intent.putExtra("key", 71);
            intent.putExtra("content", (Serializable) strH);
            sendBroadcast(intent);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Seq.setContext(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bm3 bm3VarH0;
        oy1 oy1Var = oy1.E0;
        u15.A(this);
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        vz7 vz7Var = X;
        if (numValueOf != null && numValueOf.intValue() == 7) {
            try {
                w51.G((b71) vz7Var.getValue(), (s61) null, (e71) null, new t17(intent, this, null, (byte) 22), 3);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        } else if (numValueOf != null && numValueOf.intValue() == 72) {
            bm3 bm3VarH1 = ((b71) vz7Var.getValue()).getCoroutineContext().H0(oy1Var);
            if (bm3VarH1 != null) {
                u70.y(bm3VarH1);
            }
        } else {
            vz7 vz7Var2 = Y;
            if (numValueOf != null && numValueOf.intValue() == 8) {
                String stringExtra = intent.getStringExtra("content");
                if (stringExtra != null) {
                    w51.G((b71) vz7Var2.getValue(), (s61) null, (e71) null, new ar6(stringExtra, this, (q51) null, (byte) 10), 3);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 82 && (bm3VarH0 = ((b71) vz7Var2.getValue()).getCoroutineContext().H0(oy1Var)) != null) {
                u70.y(bm3VarH0);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
