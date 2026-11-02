package defpackage;

import android.app.Service;
import android.content.Intent;
import android.view.Choreographer;
import com.tencent.mmkv.MMKV;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.Set;
import java.util.concurrent.CancellationException;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.GoPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vh extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh(int i, q51 q51Var, byte b) {
        super(i, q51Var);
        this.g0 = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 3:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 4:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 5:
                n((q51) obj2, (ze2) obj).q(dn8Var);
                return dn8Var;
            case 6:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            case 7:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
            default:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return dn8Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new vh(2, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new vh(2, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new vh(2, q51Var, (byte) 2);
            case 3:
                return new vh(2, q51Var, (byte) 3);
            case 4:
                return new vh(2, q51Var, (byte) 4);
            case 5:
                return new vh(2, q51Var, (byte) 5);
            case 6:
                return new vh(2, q51Var, (byte) 6);
            case 7:
                return new vh(2, q51Var, (byte) 7);
            default:
                return new vh(2, q51Var, (byte) 8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        h69 h69Var;
        rj6 rj6Var;
        long jMeasureDelay;
        byte b = this.g0;
        rj6 rj6Var2 = dn8.a;
        switch (b) {
            case 0:
                w39.n0(obj);
                return Choreographer.getInstance();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                kw4 kw4Var = kw4.a;
                return kw4.d();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                kw4 kw4Var2 = kw4.a;
                return zp4.P(kw4.d());
            case 3:
                w39.n0(obj);
                Set setK = ((MMKV) x06.a.getValue()).k("pref_per_app_proxy_set", (Set) null);
                return setK == null ? m02.X : setK;
            case 4:
                w39.n0(obj);
                int iD = ((MMKV) x06.a.getValue()).d();
                jk5.X.getClass();
                jk5 jk5Var = (jk5) wv0.u0(iD, jk5.h0);
                return jk5Var == null ? jk5.Y : jk5Var;
            case 5:
                w39.n0(obj);
                return rj6Var2;
            case 6:
                w39.n0(obj);
                try {
                    XRayPoint xRayPoint = x59.a;
                    x59.a.coreStopLoop();
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                return rj6Var2;
            case 7:
                w39.n0(obj);
                SoftReference softReference = n69.f;
                if (softReference != null && (h69Var = (h69) softReference.get()) != null) {
                    Service serviceG = h69Var.g();
                    XRayPoint xRayPoint2 = n69.a;
                    String strJ0 = "";
                    if (xRayPoint2.getIsRunning()) {
                        try {
                            ss8 ss8Var = ss8.a;
                            String strH = ss8.h();
                            vz7 vz7Var = n67.a;
                            GoPingType goPingType = (GoPingType) wv0.u0(n67.c().e(0, "pref_ping_mode"), GoPingType.a());
                            if (goPingType == null) {
                                goPingType = GoPingType.DEFAULT;
                            }
                            jMeasureDelay = xRayPoint2.measureDelay(strH, goPingType.getGoValue(), n67.c().e(7, "pref_proxy_ping_timeout"));
                            rj6Var = rj6Var2;
                        } catch (Throwable th2) {
                            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                                throw th2;
                            }
                            rj6Var = new rj6(th2);
                            jMeasureDelay = -1;
                        }
                        Throwable thA = sj6.a(rj6Var);
                        if (thA != null) {
                            String message = thA.getMessage();
                            strJ0 = message != null ? fm7.J0(message, "\":") : "empty message";
                        }
                    } else {
                        jMeasureDelay = -1;
                    }
                    Serializable j69Var = jMeasureDelay == -1 ? new j69(strJ0) : new k69(jMeasureDelay);
                    try {
                        Intent intent = new Intent();
                        intent.setAction("su.happ.proxyutility.action.activity");
                        intent.setPackage("su.happ.proxyutility");
                        intent.putExtra("key", 61);
                        intent.putExtra("content", j69Var);
                        serviceG.sendBroadcast(intent);
                    } catch (Throwable th3) {
                        if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                            throw th3;
                        }
                    }
                    break;
                }
                return rj6Var2;
            default:
                w39.n0(obj);
                try {
                    XRayPoint xRayPoint3 = n69.a;
                    n69.a.coreStopLoop();
                    break;
                } catch (Throwable th4) {
                    if ((th4 instanceof InterruptedException) || (th4 instanceof CancellationException)) {
                        throw th4;
                    }
                }
                return rj6Var2;
        }
    }
}
