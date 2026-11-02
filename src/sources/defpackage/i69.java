package defpackage;

import android.net.NetworkRequest;
import com.tencent.mmkv.MMKV;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.XRayServiceManager$VpnMessageReceiver;
import su.happ.proxyutility.service.XRayTestService;
import su.happ.proxyutility.service.XRayVpnService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class i69 implements dn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n69.<clinit>():void, su.happ.proxyutility.service.XRayVpnService.<init>():void] */
    public /* synthetic */ i69(byte b) {
        this.X = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        switch (this.X) {
            case 0:
                return MMKV.t("SETTING", vj8.M());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().b();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().f();
            case 3:
                HappApplication happApplication3 = HappApplication.M0;
                return k32.i().d();
            case 4:
                vz7 vz7Var = XRayTestService.X;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(10);
                executorServiceNewFixedThreadPool.getClass();
                return gv3.c(new t52(executorServiceNewFixedThreadPool));
            case 5:
                vz7 vz7Var2 = XRayTestService.X;
                ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(10);
                executorServiceNewFixedThreadPool2.getClass();
                return gv3.c(new t52(executorServiceNewFixedThreadPool2));
            case 6:
                vz7 vz7Var3 = XRayTestService.X;
                ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(10);
                executorServiceNewFixedThreadPool3.getClass();
                return gv3.c(new t52(executorServiceNewFixedThreadPool3));
            case 7:
                int i = XRayVpnService.v0;
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 8:
                int i2 = XRayVpnService.v0;
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().e();
            case 9:
                int i3 = XRayVpnService.v0;
                HappApplication happApplication5 = HappApplication.M0;
                return (u42) k32.i().s0.getValue();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                int i4 = XRayVpnService.v0;
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().f();
            case 11:
                int i5 = XRayVpnService.v0;
                return new XRayServiceManager$VpnMessageReceiver();
            case 12:
                int i6 = XRayVpnService.v0;
                return new NetworkRequest.Builder().addCapability(12).addCapability(13).build();
            case 13:
                b79 b79Var = new b79(new ps((byte) 0));
                bc1.j(b79Var);
                z68.t(b79Var, '-');
                bc1.m(b79Var);
                return new c79(b79Var.build());
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }
}
