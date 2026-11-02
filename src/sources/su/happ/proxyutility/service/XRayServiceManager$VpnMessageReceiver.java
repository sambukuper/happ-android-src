package su.happ.proxyutility.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.h69;
import defpackage.jz8;
import defpackage.kw4;
import defpackage.n69;
import defpackage.vh;
import java.lang.ref.SoftReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ResolveForPingResultData;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"su/happ/proxyutility/service/XRayServiceManager$VpnMessageReceiver", "Landroid/content/BroadcastReceiver;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class XRayServiceManager$VpnMessageReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h69 h69Var;
        dn8 rj6Var;
        String str;
        String str2;
        String str3;
        context.getClass();
        SoftReference softReference = n69.f;
        if (softReference == null || (h69Var = (h69) softReference.get()) == null) {
            return;
        }
        String remarks = null;
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (n69.a.getIsRunning()) {
                qe4.L0(h69Var.g(), "su.happ.proxyutility.action.activity", 11, Long.valueOf(h69Var.getM0()));
                qe4.P0(h69Var.g(), 11);
                return;
            } else {
                qe4.N0(h69Var.g(), 12, "");
                qe4.P0(h69Var.g(), 12);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 9) {
            qe4.L0(h69Var.g(), "su.happ.proxyutility.action.activity", 35, Long.valueOf(System.currentTimeMillis() - h69Var.getM0()));
            return;
        }
        int i = 2;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            h69Var.b();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 132) {
            h69Var.d();
            jz8 jz8VarE = h69Var.e();
            ServerConfig serverConfig = n69.g;
            remarks = serverConfig != null ? serverConfig.getRemarks() : null;
            jz8.f(jz8VarE, h69Var, remarks == null ? "" : remarks, null, Boolean.TRUE, 4);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 133) {
            h69Var.f();
            jz8 jz8VarE2 = h69Var.e();
            ServerConfig serverConfig2 = n69.g;
            remarks = serverConfig2 != null ? serverConfig2.getRemarks() : null;
            jz8.f(jz8VarE2, h69Var, remarks == null ? "" : remarks, null, Boolean.FALSE, 4);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            jm4.Q(n69.b, tp1.a, new ar6(h69Var, context, (q51) null, (byte) 9), 2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            m51 m51Var = n69.b;
            nf1 nf1Var = tp1.a;
            jm4.Q(m51Var, ye1.Z, new vh(i, remarks, (byte) 7), 2);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 81) {
            if (numValueOf != null && numValueOf.intValue() == 134) {
                kw4 kw4Var = kw4.a;
                String strI = kw4.h().i("SELECTED_SERVER");
                String str4 = strI != null ? strI : null;
                if (str4 != null) {
                    HappApplication happApplication = HappApplication.M0;
                    jm4.Q(HappApplication.N0, (u61) null, new qk4((un5) k32.i().D0.getValue(), str4, h69Var, (q51) null, (byte) 25), 3);
                    return;
                }
                return;
            }
            return;
        }
        n69.j--;
        String stringExtra = intent.getStringExtra("content");
        if (stringExtra == null) {
            if (n69.j > 0 || (str3 = n69.k) == null) {
                return;
            }
            n69.i.K(str3, (Object) null);
            return;
        }
        try {
            com.google.gson.a aVar = yw2.c;
            aVar.getClass();
            ResolveForPingResultData resolveForPingResultData = (ResolveForPingResultData) aVar.c(stringExtra, new yi8(ResolveForPingResultData.class));
            if (resolveForPingResultData.getPing() > 0) {
                qe4.M0(82, h69Var.g(), "");
                n69.i.K(resolveForPingResultData.getConfig(), resolveForPingResultData.getIp());
                n69.j = 0;
            } else if (n69.j <= 0 && (str2 = n69.k) != null) {
                n69.i.K(str2, (Object) null);
            }
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) == null || n69.j > 0 || (str = n69.k) == null) {
            return;
        }
        n69.i.K(str, (Object) null);
    }
}
