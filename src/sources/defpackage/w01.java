package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.OkHttpClient;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w01 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ w01(byte b) {
        this.X = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                y01.b("LocalHapticFeedback");
                throw null;
            case 1:
                y01.b("LocalInputManager");
                throw null;
            case 2:
                y01.b("LocalLayoutDirection");
                throw null;
            case 3:
                y01.b("LocalProvidableLocaleList");
                throw null;
            case 4:
            case 5:
                return null;
            case 6:
                y01.b("LocalTextToolbar");
                throw null;
            case 7:
                y01.b("LocalUriHandler");
                throw null;
            case 8:
                d01.b("Unexpected call to default provider");
                throw new o14();
            case 9:
                zb6 zb6Var = yb6.a;
                return new uy6("kotlinx.datetime.DateTimeUnit.DateBased", zb6Var.b(hc1.class), new zu3[]{zb6Var.b(jc1.class), zb6Var.b(lc1.class)}, new ow3[]{sc1.a, cy4.a});
            case 10:
                zb6 zb6Var2 = yb6.a;
                return new uy6("kotlinx.datetime.DateTimeUnit", zb6Var2.b(oc1.class), new zu3[]{zb6Var2.b(jc1.class), zb6Var2.b(lc1.class), zb6Var2.b(nc1.class)}, new ow3[]{sc1.a, cy4.a, ba8.a});
            case 11:
                e37[] e37VarArr = new e37[0];
                if (fm7.o0("kotlinx.datetime.DayBased")) {
                    bt.q("Blank serial names are prohibited");
                    return null;
                }
                dt0 dt0Var = new dt0("kotlinx.datetime.DayBased");
                nf3 nf3Var = nf3.a;
                dt0Var.a("days", nf3.b);
                return new g37("kotlinx.datetime.DayBased", pm7.M, dt0Var.b.size(), eu.K0(e37VarArr), dt0Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Float.valueOf(1.0f);
            case 13:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().f();
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return dn8Var;
            case 17:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 18:
                DownloadFilesInfo.Companion companion = DownloadFilesInfo.INSTANCE;
                StateDownloadFile[] stateDownloadFileArrValues = StateDownloadFile.values();
                stateDownloadFileArrValues.getClass();
                return new u22("su.happ.proxyutility.domain.routing.entity.StateDownloadFile", stateDownloadFileArrValues);
            case 19:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 20:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().f();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                kw4 kw4Var3 = kw4.a;
                return kw4.l();
            case 22:
                return Boolean.TRUE;
            case 23:
                return new Handler(Looper.getMainLooper());
            case 24:
                kw4 kw4Var4 = kw4.a;
                return kw4.l();
            case 25:
                HappApplication happApplication3 = HappApplication.M0;
                return (u42) k32.i().s0.getValue();
            case 26:
                CookieManager cookieManager = new CookieManager();
                cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
                return cookieManager;
            case 27:
                zb6 zb6Var3 = yb6.a;
                return new zu3[]{zb6Var3.b(SSLHandshakeException.class), zb6Var3.b(SocketTimeoutException.class), zb6Var3.b(ConnectException.class), zb6Var3.b(InterruptedIOException.class), zb6Var3.b(IOException.class)};
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.callTimeout(20L, timeUnit).readTimeout(20L, timeUnit).writeTimeout(20L, timeUnit).connectTimeout(20L, timeUnit).addInterceptor(new sr8(new w01((byte) 29))).dns(new g72());
            default:
                return "Mozilla/5.0 (Linux; Android 16; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.7680.177 Mobile Safari/537.36";
        }
    }
}
