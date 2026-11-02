package defpackage;

import android.os.StatFs;
import com.tencent.mmkv.MMKV;
import j$.time.format.DateTimeFormatterBuilder;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.ui_settings.UISettingsActivity;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;
import su.happ.proxyutility.service.XRayProxyOnlyService;
import su.happ.proxyutility.service.XRayServiceManager$VpnMessageReceiver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ng8 implements dn2 {
    public final /* synthetic */ byte X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        switch (this.X) {
            case 0:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().i();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new wj8();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                int i = UISettingsActivity.T0;
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 3:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 4:
                return new ot(yl7.a);
            case 5:
                wr8 wr8Var = new wr8(new ps((byte) 0));
                z68.i(wr8Var, new gn2[]{new b58((byte) 15)}, new b58((byte) 16));
                return new xr8(wr8Var.build());
            case 6:
                wr8 wr8Var2 = new wr8(new ps((byte) 0));
                z68.i(wr8Var2, new gn2[]{new b58((byte) 17)}, new b58((byte) 18));
                return new xr8(wr8Var2.build());
            case 7:
                ps psVar = new ps((byte) 0);
                dg5 dg5Var = dg5.Y;
                psVar.a(new i97(new c30(new fs8(dg5Var))));
                psVar.a(new c30(new cs8(dg5Var)));
                return new xr8(new sc0(psVar.b));
            case 8:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 9:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 11:
                return MMKV.t("MAIN", vj8.M());
            case 12:
                kw4 kw4Var3 = kw4.a;
                return kw4.l();
            case 13:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().f();
            case 14:
                zb6 zb6Var = yb6.a;
                return new zu3[]{zb6Var.b(SSLHandshakeException.class), zb6Var.b(SocketTimeoutException.class), zb6Var.b(ConnectException.class), zb6Var.b(InterruptedIOException.class), zb6Var.b(IOException.class)};
            case 15:
                s92 s92Var = s92.SYSTEM;
                oi5 oi5VarF = s92.SYSTEM_TEMPORARY_DIRECTORY.f("coil3_disk_cache");
                long jP = 10485760;
                try {
                    File file = oi5VarF.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jP = x97.p((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new r76(s92Var, oi5VarF, jP);
            case 16:
                return dn8.a;
            case 17:
                int i2 = VpnSettingsActivity.U0;
                kw4 kw4Var4 = kw4.a;
                return kw4.l();
            case 18:
                HappApplication happApplication3 = HappApplication.M0;
                return k32.i().i();
            case 19:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 20:
                kw4 kw4Var5 = kw4.a;
                return kw4.l();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return MMKV.t("SERVER_RAW", vj8.M());
            case 22:
                kw4 kw4Var6 = kw4.a;
                return kw4.l();
            case 23:
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().d();
            case 24:
                HappApplication happApplication5 = HappApplication.M0;
                return k32.i().f();
            case 25:
                return "{\"version\":\"1.1\",\"method\":\"GET\",\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36\",\"Mozilla/5.0 (iPhone; CPU iPhone OS 10_0_2 like Mac OS X) AppleWebKit/601.1 (KHTML, like Gecko) CriOS/53.0.2785.109 Mobile/14A456 Safari/601.1.46\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}";
            case 26:
                int i3 = XRayProxyOnlyService.k0;
                kw4 kw4Var7 = kw4.a;
                return kw4.l();
            case 27:
                int i4 = XRayProxyOnlyService.k0;
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().e();
            case 28:
                int i5 = XRayProxyOnlyService.k0;
                return new XRayServiceManager$VpnMessageReceiver();
            default:
                return MMKV.t("MAIN", vj8.M());
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d69.<clinit>():void, d69.n(android.content.Context, su.happ.proxyutility.dto.XRayConfig$OutboundBean, java.lang.String, boolean, java.lang.String, boolean):b69, n69.<clinit>():void, ss8.<clinit>():void, su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity.<init>():void, su.happ.proxyutility.service.XRayProxyOnlyService.<init>():void, uz8.<init>():void, x59.<clinit>():void] */
    public /* synthetic */ ng8(byte b) {
        this.X = b;
    }
}
