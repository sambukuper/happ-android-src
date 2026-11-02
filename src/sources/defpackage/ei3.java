package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.language.LanguageActivitySettings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei3 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ ei3(byte b) {
        this.X = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
            case 1:
                return dn8Var;
            case 2:
                return kq3.b;
            case 3:
                return yp3.b;
            case 4:
                return lp3.b;
            case 5:
                return dq3.b;
            case 6:
                return gn3.b;
            case 7:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 8:
                int i = LanguageActivitySettings.V0;
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 9:
                return dn8Var;
            case 10:
                return new vc4();
            case 11:
                return new gv6();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new LayoutNode(3);
            case 13:
                return new j74(0, 0);
            case 14:
                CookieManager cookieManager = new CookieManager();
                cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
                return cookieManager;
            case 15:
                zb6 zb6Var = yb6.a;
                return new zu3[]{zb6Var.b(SSLHandshakeException.class), zb6Var.b(SocketTimeoutException.class), zb6Var.b(ConnectException.class), zb6Var.b(InterruptedIOException.class), zb6Var.b(IOException.class)};
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().h();
            case 17:
                HappApplication happApplication2 = HappApplication.M0;
                Context applicationContext = k32.i().getApplicationContext();
                applicationContext.getClass();
                return new ak7(applicationContext);
            case 18:
                return xu.a;
            case 19:
                return ev.a;
            case 20:
                ed4 ed4Var = new ed4(new ps((byte) 0));
                ed4Var.d(dg5.Y);
                z68.t(ed4Var, '-');
                ed4Var.e(dg5.Y);
                z68.t(ed4Var, '-');
                ed4Var.g(dg5.Y);
                return new fd4(ed4Var.build());
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ed4 ed4Var2 = new ed4(new ps((byte) 0));
                ed4Var2.d(dg5.Y);
                ed4Var2.e(dg5.Y);
                ed4Var2.g(dg5.Y);
                return new fd4(ed4Var2.build());
            case 22:
                md4 md4Var = new md4(new ps((byte) 0));
                g1 g1Var = (g1) gd4.a.getValue();
                g1Var.getClass();
                md4Var.l(((fd4) g1Var).a);
                z68.i(md4Var, new gn2[]{new uh3((byte) 9)}, new uh3((byte) 10));
                zd4 zd4Var = (zd4) ae4.a.getValue();
                zd4Var.getClass();
                md4Var.k(zd4Var.a);
                return new nd4(md4Var.build());
            case 23:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 24:
            case 25:
                return null;
            case 26:
                ox1 ox1Var = ud4.a;
                return pz2.S0;
            case 27:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                yd4 yd4Var = new yd4(new ps((byte) 0));
                dg5 dg5Var = dg5.Y;
                yd4Var.b(dg5Var);
                z68.t(yd4Var, ':');
                yd4Var.f(dg5Var);
                z68.i(yd4Var, new gn2[]{new uh3((byte) 11)}, new uh3((byte) 12));
                return new zd4(yd4Var.build());
            default:
                return MMKV.t("SETTING", vj8.M());
        }
    }

    public /* synthetic */ ei3(fi3 fi3Var, byte b) {
        this.X = b;
    }
}
