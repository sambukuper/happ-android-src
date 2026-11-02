package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.feature.statistics.StatisticsSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class r47 implements dn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        switch (this.X) {
            case 0:
                int i = ServerCustomConfigActivity.X0;
                return MMKV.t("MAIN", vj8.M());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                int i2 = ServerCustomConfigActivity.X0;
                return MMKV.t("SERVER_RAW", vj8.M());
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                try {
                    Iterator it = Arrays.asList(new m95()).iterator();
                    it.getClass();
                    return w51.O(w27.n0(new t21(new hu(it, (byte) 4))));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 3:
                try {
                    Iterator it2 = Arrays.asList(new vr2(), new hz7()).iterator();
                    it2.getClass();
                    return w51.O(w27.n0(new t21(new hu(it2, (byte) 4))));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 4:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 5:
                HappApplication happApplication = HappApplication.M0;
                return (mq0) k32.i().K0.getValue();
            case 6:
                return new p77();
            case 7:
                return dn8.a;
            case 8:
                int i3 = StatisticsSettingsActivity.W0;
                yz4 yz4Var = new yz4();
                yz4Var.j(new oi7(0L, 0L, w51.M(), w51.M()));
                return yz4Var;
            case 9:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().c();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                HappApplication happApplication3 = HappApplication.M0;
                return k32.i().f();
            case 11:
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().d();
            case 12:
                HappApplication happApplication5 = HappApplication.M0;
                return new File(k32.i().getCacheDir(), "qr_codes");
            case 13:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 14:
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().f();
            case 15:
                HappApplication happApplication7 = HappApplication.M0;
                return k32.i().h();
            case 16:
                kw4 kw4Var3 = kw4.a;
                return kw4.l();
            case 17:
                HappApplication happApplication8 = HappApplication.M0;
                return (u42) k32.i().s0.getValue();
            case 18:
                HappApplication happApplication9 = HappApplication.M0;
                return k32.i().h();
            case 19:
                HappApplication happApplication10 = HappApplication.M0;
                return (pv0) k32.i().r0.getValue();
            case 20:
                HappApplication happApplication11 = HappApplication.M0;
                return new ak7(k32.i());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new bk7();
            case 22:
                return new ek7();
            case 23:
                return new fk7();
            case 24:
                HappApplication happApplication12 = HappApplication.M0;
                return k32.i().c();
            case 25:
                kw4 kw4Var4 = kw4.a;
                return kw4.l();
            case 26:
                return new l45();
            case 27:
                return new r45();
            case 28:
                HappApplication happApplication13 = HappApplication.M0;
                return k32.i().f();
            default:
                HappApplication happApplication14 = HappApplication.M0;
                return k32.i().i();
        }
    }
}
