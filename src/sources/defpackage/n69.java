package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import go.Seq;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import libxray.Libxray;
import libxray.XRayPoint;
import okhttp3.dnsoverhttps.DnsOverHttps;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ResolveForPingResultData;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.XRayProxyOnlyService;
import su.happ.proxyutility.service.XRayVpnService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class n69 {
    public static final XRayPoint a;
    public static final m51 b;
    public static final vz7 c;
    public static final vz7 d;
    public static final vz7 e;
    public static SoftReference f;
    public static ServerConfig g;
    public static d21 h;
    public static rn2 i;
    public static int j;
    public static String k;
    public static final vz7 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte b2 = 0;
        byte b3 = 1;
        XRayPoint xRayPointNewXRayPoint = Libxray.newXRayPoint(new s18((byte) 16), Build.VERSION.SDK_INT >= 25);
        xRayPointNewXRayPoint.getClass();
        a = xRayPointNewXRayPoint;
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        b = gv3.c(g33.K(ow7VarB, dm4.a));
        c = new vz7(new ng8((byte) 29));
        d = new vz7(new i69(b2));
        e = new vz7(new i69(b3));
        new vz7(new i69((byte) 2));
        i = new c68((byte) 5);
        l = new vz7(new i69((byte) 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(SoftReference softReference) {
        f = softReference;
        h69 h69Var = (h69) softReference.get();
        Service serviceG = h69Var != null ? h69Var.g() : null;
        Seq.setContext(serviceG != null ? serviceG.getApplicationContext() : null);
        if (serviceG == null || h != null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        d21 d21Var = new d21(serviceG);
        h = d21Var;
        a.registerProcessFinder(d21Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Context context, boolean z) {
        vz7 vz7Var = d;
        if (!z) {
            if (((MMKV) vz7Var.getValue()).b("pref_proxy_sharing_enabled")) {
                x79.h(context, y46.toast_warning_pref_proxysharing_short);
            } else {
                x79.h(context, y46.toast_services_start);
            }
        }
        String strI = ((MMKV) c.getValue()).i("SELECTED_SERVER");
        if (strI != null) {
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(strI);
            if (serverConfigB == null) {
                return;
            }
            i = new c68((byte) 6);
            boolean z2 = false;
            j = 0;
            g = serverConfigB;
            SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
            MMKV mmkv = (MMKV) vz7Var.getValue();
            if (subscriptionItemF != null && subscriptionItemF.G()) {
                z2 = true;
            }
            mmkv.p("pref_logs_hidden", z2);
            String strI2 = ((MMKV) vz7Var.getValue()).i("pref_mode");
            if (strI2 == null) {
                strI2 = "VPN";
            }
            Intent intent = strI2.equals("VPN") ? new Intent(context.getApplicationContext(), (Class<?>) XRayVpnService.class) : new Intent(context.getApplicationContext(), (Class<?>) XRayProxyOnlyService.class);
            intent.putExtra("silent", z).putExtra("guid", strI);
            if (Build.VERSION.SDK_INT > 25) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(h69 h69Var, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        String strG;
        Integer rj6Var;
        String hostAddress;
        String strI = ((MMKV) c.getValue()).i("SELECTED_SERVER");
        if (strI != null) {
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(strI);
            if (serverConfigB == null) {
                return;
            }
            h69Var.e().e(h69Var, serverConfigB.getRemarks());
            SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
            vz7 vz7Var = d69.a;
            int iIntValue = 0;
            int iE0 = 1;
            b69 b69VarL = d69.l(h69Var.g(), strI, n67.e() || serverConfigB.getAdvancedFragment() != null, 8);
            if (!b69VarL.a) {
                b69VarL = null;
            }
            if (b69VarL == null) {
                return;
            }
            i = new mx2(subscriptionItemF, serverConfigB, h69Var, z, parcelFileDescriptor);
            if (!d69.s(strI) || subscriptionItemF == null || !subscriptionItemF.b0()) {
                i.K(b69VarL.b, (Object) null);
                return;
            }
            k = b69VarL.b;
            XRayConfig.OutboundBean outboundBeanG = serverConfigB.g();
            if (outboundBeanG == null || (strG = outboundBeanG.g()) == null) {
                return;
            }
            Service serviceG = h69Var.g();
            String str = b69VarL.b;
            try {
                DnsOverHttps dnsOverHttpsA = fr1.a();
                if (dnsOverHttpsA != null) {
                    qe4.M0(82, serviceG, "");
                    List listLookup = dnsOverHttpsA.lookup(strG);
                    ss8 ss8Var = ss8.a;
                    if (ss8.t()) {
                        ArrayList arrayList = new ArrayList(xv0.Z(listLookup, 10));
                        Iterator it = listLookup.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InetAddress) it.next()).getHostAddress());
                        }
                        wv0.Y0(arrayList).toString();
                    }
                    if (listLookup.size() < 2) {
                        InetAddress inetAddress = (InetAddress) wv0.t0(listLookup);
                        if (inetAddress != null && (hostAddress = inetAddress.getHostAddress()) != null) {
                            a aVar = yw2.b;
                            aVar.getClass();
                            XRayConfig xRayConfig = (XRayConfig) aVar.c(str, new yi8(XRayConfig.class));
                            for (XRayConfig.OutboundBean outboundBean : xRayConfig.getOutbounds()) {
                                if (dh3.f(outboundBean.getTag(), "proxy")) {
                                    outboundBean.n(hostAddress);
                                }
                            }
                            String strH = new a().h(new ResolveForPingResultData(10L, hostAddress, yw2.d.h(xRayConfig)));
                            try {
                                Intent intent = new Intent();
                                intent.setAction("su.happ.proxyutility.action.service");
                                intent.setPackage("su.happ.proxyutility");
                                intent.putExtra("key", 81);
                                intent.putExtra("content", (Serializable) strH);
                                serviceG.sendBroadcast(intent);
                            } catch (Throwable th) {
                                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        iE0 = w27.e0(w27.m0(w27.m0(new hu(listLookup, (byte) 1), new h80((byte) 18)), new p0(str, serviceG, (byte) 17)));
                    }
                    rj6Var = Integer.valueOf(iE0);
                    if (rj6Var instanceof rj6) {
                        rj6Var = 0;
                    }
                    iIntValue = rj6Var.intValue();
                }
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                rj6Var = new rj6(th2);
            }
            j = iIntValue;
            if (iIntValue <= 0) {
                i.K(b69VarL.b, (Object) null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(h69 h69Var, boolean z, xl0 xl0Var) {
        h69Var.a().cancel();
        HappApplication happApplication = HappApplication.M0;
        k61 k61VarB = k32.i().b();
        k61VarB.getClass();
        k61VarB.d = w51.M();
        k61 k61VarB2 = k32.i().b();
        j61 j61VarH = h69Var.h();
        k61VarB2.getClass();
        j61VarH.getClass();
        k61VarB2.b.remove(j61VarH);
        if (a.getIsRunning()) {
            jm4.Q(b, tp1.a, new vh(2, null, (byte) 8), 2);
        }
        qe4.N0(h69Var.g(), 41, "");
        qe4.P0(h69Var.g(), 41);
        if (z) {
            h69Var.e().getClass();
            h69Var.g().stopForeground(1);
        }
        if (xl0Var != null) {
            xl0Var.invoke();
        }
    }
}
