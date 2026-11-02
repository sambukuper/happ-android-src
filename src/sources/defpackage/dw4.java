package defpackage;

import android.graphics.PathMeasure;
import com.tencent.mmkv.MMKV;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import okhttp3.OkHttpClient;
import okhttp3.internal.dns.RealDnsCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class dw4 implements dn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        switch (this.X) {
            case 0:
                return w51.c(new uh3((byte) 27));
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return MMKV.t("SERVER_CONFIG", vj8.M());
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return MMKV.t("SERVER_RAW", vj8.M());
            case 3:
                return MMKV.t("SERVER_AFF", vj8.M());
            case 4:
                return MMKV.t("SUB", vj8.M());
            case 5:
                return MMKV.t("SETTING", vj8.M());
            case 6:
                return MMKV.t("SUB_ROUTING_ENABLED", vj8.M());
            case 7:
                return UUID.randomUUID();
            case 8:
                e37[] e37VarArr = new e37[0];
                if (fm7.o0("kotlinx.datetime.MonthBased")) {
                    bt.q("Blank serial names are prohibited");
                    return null;
                }
                dt0 dt0Var = new dt0("kotlinx.datetime.MonthBased");
                nf3 nf3Var = nf3.a;
                dt0Var.a("months", nf3.b);
                return new g37("kotlinx.datetime.MonthBased", pm7.M, dt0Var.b.size(), eu.K0(e37VarArr), dt0Var);
            case 9:
                m51 m51VarC = gv3.c(b02.X);
                gv3.i(m51VarC, (CancellationException) null);
                return m51VarC;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return nc0.a;
            case 11:
                return wl8.a;
            case 12:
                pm7 pm7Var = pm7.P;
                e37[] e37VarArr2 = new e37[0];
                if (fm7.o0("kotlin.Unit")) {
                    bt.q("Blank serial names are prohibited");
                } else {
                    if (!(pm7Var == pm7.M)) {
                        dt0 dt0Var2 = new dt0("kotlin.Unit");
                        return new g37("kotlin.Unit", pm7Var, dt0Var2.b.size(), eu.K0(e37VarArr2), dt0Var2);
                    }
                    bt.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 13:
                return new gd0(new OkHttpClient());
            case 14:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 15:
                return new if5();
            case 16:
                return new mf(new PathMeasure());
            case 17:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().i();
            case 18:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 19:
                return dn8.a;
            case 20:
                int i = PingSettingsActivity.U0;
                return MMKV.t("SETTING", vj8.M());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return null;
            case 22:
                nf1 nf1Var = tp1.a;
                return ye1.Z;
            case 23:
                return null;
            case 24:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().f();
            case 25:
                HappApplication happApplication3 = HappApplication.M0;
                return k32.i().f();
            case 26:
                kw4 kw4Var3 = kw4.a;
                return kw4.l();
            case 27:
                kw4 kw4Var4 = kw4.a;
                return kw4.l();
            case 28:
                kw4 kw4Var5 = kw4.a;
                return (MMKV) kw4.d.getValue();
            default:
                return RealDnsCache.a();
        }
    }
}
