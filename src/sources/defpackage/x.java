package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.UUID;
import javax.crypto.Cipher;
import okhttp3.android.AndroidDns;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements dn2 {
    public final /* synthetic */ byte X;

    @Override // defpackage.dn2
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Choreographer choreographer;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        q51 q51Var = null;
        switch (b) {
            case 0:
                HappApplication happApplication = HappApplication.M0;
                return (s24) k32.i().k0.getValue();
            case 1:
                return Integer.valueOf(m66.Y.g(2147418112) + DnsOverHttps.MAX_RESPONSE_SIZE);
            case 2:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 3:
                HappApplication happApplication2 = HappApplication.M0;
                return k32.i().i();
            case 4:
                return dn8Var;
            case 5:
                ig5 ig5Var = n8.a;
                return de1.a;
            case 6:
                return dn8Var;
            case 7:
                pc.a("LocalConfiguration");
                throw null;
            case 8:
                pc.a("LocalContext");
                throw null;
            case 9:
                pc.a("LocalImageVectorCache");
                throw null;
            case 10:
                pc.a("LocalResourceIdCache");
                throw null;
            case 11:
                pc.a("LocalView");
                throw null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return UUID.randomUUID();
            case 13:
                return AndroidDns._init_$lambda$1();
            case 14:
                return Cipher.getInstance("AES/GCM/NoPadding");
            case 15:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return "DEFAULT_TEST_TAG";
            case 17:
                return UUID.randomUUID();
            case 18:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    nf1 nf1Var = tp1.a;
                    choreographer = (Choreographer) z51.R(dm4.a, new vh(2, q51Var, (byte) 0));
                }
                yh yhVar = new yh(choreographer, z91.p(Looper.getMainLooper()));
                return g33.K(yhVar, yhVar.n0);
            case 19:
                ox1 ox1Var = zo.a;
                return vf1.a;
            case 20:
                ox1 ox1Var2 = zo.a;
                return oy1.q0;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return oc.j(true);
            case 22:
                return new gr(sr.e);
            case 23:
                return new tr(nr.b, fr.b, cp.b);
            case 24:
                return w51.q();
            case 25:
                return new fe7(z51.d(1308617531));
            case 26:
                vz7 vz7Var = BackportedFixQuirk.a;
                return new a10();
            case 27:
                int i = BaseActivity.P0;
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            default:
                return null;
        }
    }

    public /* synthetic */ x(byte b) {
        this.X = b;
    }
}
