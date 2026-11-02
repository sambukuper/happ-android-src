package defpackage;

import android.content.Context;
import com.tencent.mmkv.MMKV;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tv2 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ tv2(Context context, String str) {
        this.X = (byte) 13;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.X) {
            case 0:
                HappApplication happApplication = HappApplication.M0;
                return new qq0();
            case 1:
                HappApplication happApplication2 = HappApplication.M0;
                return new s24();
            case 2:
                HappApplication happApplication3 = HappApplication.M0;
                return new en7();
            case 3:
                HappApplication happApplication4 = HappApplication.M0;
                return new xj7();
            case 4:
                HappApplication happApplication5 = HappApplication.M0;
                return new xr7();
            case 5:
                HappApplication happApplication6 = HappApplication.M0;
                return new pv0();
            case 6:
                HappApplication happApplication7 = HappApplication.M0;
                return new u42();
            case 7:
                HappApplication happApplication8 = HappApplication.M0;
                return new ig8();
            case 8:
                return MMKV.t("MAIN", vj8.M());
            case 9:
                return MMKV.t("SERVER_RAW", vj8.M());
            case 10:
                return MMKV.t("SETTING", vj8.M());
            case 11:
                HappApplication happApplication9 = HappApplication.M0;
                return k32.i().f();
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new ow2(false);
            case 13:
                return dn8.a;
            case 14:
                return new px2();
            case 15:
                throw null;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new ky2();
            case 17:
                vz7 vz7Var = HappTextView.o0;
                kw4 kw4Var = kw4.a;
                return kw4.l();
            case 18:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 19:
                nf1 nf1Var = tp1.a;
                return dm4.a.h0;
            case 20:
                return (r76) ys8.a.getValue();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new f83();
            case 22:
                return new h83();
            case 23:
                HappApplication happApplication10 = HappApplication.M0;
                return k32.i().i();
            case 24:
                kw4 kw4Var2 = kw4.a;
                return kw4.l();
            case 25:
                HappApplication happApplication11 = HappApplication.M0;
                return k32.i().e();
            case 26:
                HappApplication happApplication12 = HappApplication.M0;
                return (ms) k32.i().I0.getValue();
            case 27:
                ox1 ox1Var = qb3.a;
                return je1.a;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return null;
            default:
                return new kt1(48.0f);
        }
    }

    public /* synthetic */ tv2(byte b) {
        this.X = b;
    }
}
