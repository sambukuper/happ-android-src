package defpackage;

import android.net.NetworkRequest;
import com.tencent.mmkv.MMKV;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh4 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ sh4(byte b) {
        this.X = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.X) {
            case 0:
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 1:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().d();
            case 2:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 3:
                int i = MainActivity.y1;
                HappApplication happApplication2 = HappApplication.M0;
                return (pr7) k32.i().G0.getValue();
            case 4:
                int i2 = MainActivity.y1;
                return new NetworkRequest.Builder().addCapability(12).addCapability(13).build();
            case 5:
                int i3 = MainActivity.y1;
                return MMKV.t("MAIN", vj8.M());
            case 6:
                int i4 = MainActivity.y1;
                kw4 kw4Var3 = kw4.a;
                return kw4.l();
            case 7:
                return dn8.a;
            case 8:
                return new yz4();
            case 9:
                kw4 kw4Var4 = kw4.a;
                return kw4.l();
            case 10:
                HappApplication happApplication3 = HappApplication.M0;
                return (qq0) k32.i().j0.getValue();
            case 11:
                HappApplication happApplication4 = HappApplication.M0;
                return (s24) k32.i().k0.getValue();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                HappApplication happApplication5 = HappApplication.M0;
                return k32.i().c();
            case 13:
                HappApplication happApplication6 = HappApplication.M0;
                return (pv0) k32.i().r0.getValue();
            case 14:
                HappApplication happApplication7 = HappApplication.M0;
                return k32.i().i();
            case 15:
                HappApplication happApplication8 = HappApplication.M0;
                return (xj7) k32.i().o0.getValue();
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                HappApplication happApplication9 = HappApplication.M0;
                return (un5) k32.i().D0.getValue();
            case 17:
                HappApplication happApplication10 = HappApplication.M0;
                return k32.i().f();
            case 18:
                return MMKV.t("MAIN", vj8.M());
            case 19:
                HappApplication happApplication11 = HappApplication.M0;
                return (mq0) k32.i().K0.getValue();
            case 20:
                HappApplication happApplication12 = HappApplication.M0;
                return k32.i().h();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new yz4();
            case 22:
                return Boolean.FALSE;
            case 23:
                return ky4.a;
            case 24:
                return MMKV.t("MAIN", vj8.M());
            case 25:
                return MMKV.t("SUB_PROPERTIES", vj8.M());
            case 26:
                HappApplication happApplication13 = HappApplication.M0;
                return k32.i().f();
            case 27:
                HappApplication happApplication14 = HappApplication.M0;
                return k32.i().h();
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                HappApplication happApplication15 = HappApplication.M0;
                return k32.i().g();
            default:
                return yw2.c;
        }
    }
}
