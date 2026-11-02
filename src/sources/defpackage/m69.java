package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.gson.a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import libxray.XRayPoint;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.LogFileInfo;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.StartServiceDataInfo;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class m69 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ ServerConfig j0;
    public final /* synthetic */ h69 k0;
    public final /* synthetic */ boolean l0;
    public final /* synthetic */ ParcelFileDescriptor m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m69(String str, String str2, ServerConfig serverConfig, h69 h69Var, boolean z, ParcelFileDescriptor parcelFileDescriptor, q51 q51Var) {
        super(2, q51Var);
        this.h0 = str;
        this.i0 = str2;
        this.j0 = serverConfig;
        this.k0 = h69Var;
        this.l0 = z;
        this.m0 = parcelFileDescriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        m69 m69VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        m69VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        m69 m69Var = new m69(this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, q51Var);
        m69Var.g0 = obj;
        return m69Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: android.app.Service */
    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object q(Object obj) {
        ?? r7;
        rj6 rj6Var;
        rj6 rj6Var2;
        w39.n0(obj);
        rj6 rj6Var3 = dn8.a;
        ServerConfig serverConfig = this.j0;
        String strH = this.h0;
        String str = this.i0;
        if (str != null) {
            XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
            if (outboundBeanG != null) {
                outboundBeanG.n(str);
                rj6Var2 = rj6Var3;
            } else {
                rj6Var2 = null;
            }
            if (rj6Var2 == null) {
                if (serverConfig.getConfigType() != EConfigType.CUSTOM) {
                    a aVar = yw2.c;
                    aVar.getClass();
                    XRayConfig xRayConfig = (XRayConfig) aVar.c(strH, new yi8(XRayConfig.class));
                    vz7 vz7Var = d69.a;
                    xRayConfig.getClass();
                    d69.t(xRayConfig);
                    strH = yw2.d.h(xRayConfig);
                }
            }
        } else if (serverConfig.getConfigType() != EConfigType.CUSTOM) {
            a aVar2 = yw2.c;
            aVar2.getClass();
            XRayConfig xRayConfig2 = (XRayConfig) aVar2.c(strH, new yi8(XRayConfig.class));
            vz7 vz7Var2 = d69.a;
            xRayConfig2.getClass();
            d69.t(xRayConfig2);
            strH = yw2.d.h(xRayConfig2);
        }
        n69.g = serverConfig;
        kf4 kf4Var = (kf4) n69.l.getValue();
        ArrayList arrayList = kf4Var.c;
        kf4Var.f();
        String str2 = kf4Var.e;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            GuId.Companion.getClass();
            String strA = GuId.a();
            SubId.Companion.getClass();
            String strC = SubId.c();
            String str3 = kf4Var.d;
            if (str3 != null) {
                GuId guId = new GuId(str3);
                if (fm7.o0(guId.b())) {
                    guId = null;
                }
                String strB = guId != null ? guId.b() : null;
                if (strB != null) {
                    try {
                        kw4 kw4Var = kw4.a;
                        ServerConfig serverConfigB = kw4.b(strB);
                        if (serverConfigB != null) {
                            sb.append(serverConfigB.getRemarks());
                            sb.append("_");
                            SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
                            if (subscriptionItemF != null) {
                                strC = serverConfigB.getSubscriptionId();
                                sb.append(subscriptionItemF.getRemarks());
                                sb.append("_");
                            }
                        }
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                    }
                    strA = strB;
                }
            }
            sb.append(fm7.f0(fm7.q0(str2, '/', 0, 6) + 1, str2));
            r7 = 1;
            arrayList.add(new LogFileInfo(str2, sb.toString(), strA, strC, System.currentTimeMillis()));
            if (arrayList.size() > 1) {
                aw0.c0(arrayList, new l71((byte) 27));
            }
            if (arrayList.size() > 15) {
                LogFileInfo logFileInfo = (LogFileInfo) wv0.A0(arrayList);
                logFileInfo.getClass();
                kf4Var.j(logFileInfo.getPath());
            }
            kf4.b(str2, true);
        } else {
            r7 = 1;
        }
        String str4 = kf4Var.f;
        if (str4 != null) {
            kf4.b(str4, r7);
        }
        kf4Var.k();
        ss8 ss8Var = ss8.a;
        if (ss8.t()) {
            try {
                a aVar3 = yw2.c;
                aVar3.getClass();
                Object objC = aVar3.c(strH, new yi8(bq3.class));
                objC.getClass();
                new Integer(Log.d("HAPP", "xRayConfigResult:".concat(x79.e(objC))));
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
            }
        }
        try {
            if (n67.f()) {
                ParcelFileDescriptor parcelFileDescriptor = this.m0;
                n69.a.coreRunLoopWithTun(strH, parcelFileDescriptor != null ? parcelFileDescriptor.getFd() : 0);
            } else {
                n69.a.coreRunLoop(strH);
            }
            rj6Var = rj6Var3;
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
            rj6Var = new rj6(th3);
        }
        Throwable thA = sj6.a(rj6Var);
        h69 h69Var = this.k0;
        if (thA != null) {
            String message = thA.getMessage();
            if (message != null) {
                ss8 ss8Var2 = ss8.a;
                Context applicationContext = h69Var.g().getApplicationContext();
                applicationContext.getClass();
                ss8.G(applicationContext, message);
            }
            h69Var.b();
        }
        XRayPoint xRayPoint = n69.a;
        if (n69.a.getIsRunning()) {
            qe4.L0(h69Var.g(), "su.happ.proxyutility.action.activity", 31, new StartServiceDataInfo(h69Var.getX(), this.l0));
            qe4.P0(h69Var.g(), 31);
            h69Var.e().e(h69Var, serverConfig.getRemarks());
            k61 k61Var = (k61) n69.e.getValue();
            j61 j61VarH = h69Var.h();
            k61Var.getClass();
            j61VarH.getClass();
            ArrayList arrayList2 = k61Var.b;
            if (!arrayList2.contains(j61VarH)) {
                arrayList2.add(j61VarH);
            }
            ri7 ri7VarA = h69Var.a();
            ri7VarA.b = Long.MAX_VALUE;
            ri7VarA.start();
        } else {
            qe4.N0(h69Var.g(), 32, "");
            qe4.P0(h69Var.g(), 32);
            h69Var.e().getClass();
            h69Var.g().stopForeground((int) r7);
        }
        return rj6Var3;
    }
}
