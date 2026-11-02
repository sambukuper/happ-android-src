package defpackage;

import com.tencent.mmkv.MMKV;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.receiver.BootUpReceiver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w60 implements dn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ w60(byte b) {
        this.X = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.X) {
            case 0:
                int i = BootUpReceiver.c;
                return MMKV.t("SETTING", vj8.M());
            case 1:
                int i2 = BootUpReceiver.c;
                return MMKV.t("MAIN", vj8.M());
            case 2:
                return new qc6();
            case 3:
                return new tq0();
            case 4:
                return new ar0();
            case 5:
                HappApplication happApplication = HappApplication.M0;
                return k32.i().a();
            case 6:
                HappApplication happApplication2 = HappApplication.M0;
                return (vr1) k32.i().x0.getValue();
            case 7:
                HappApplication happApplication3 = HappApplication.M0;
                return (p72) k32.i().w0.getValue();
            case 8:
                HappApplication happApplication4 = HappApplication.M0;
                return k32.i().a();
            case 9:
                HappApplication happApplication5 = HappApplication.M0;
                return (vr1) k32.i().x0.getValue();
            case 10:
                HappApplication happApplication6 = HappApplication.M0;
                return k32.i().h();
            case 11:
                long j = ew0.z;
                return new iw0(j, ew0.j, ew0.A, ew0.k, ew0.e, ew0.E, ew0.n, ew0.F, ew0.o, ew0.R, ew0.t, ew0.S, ew0.u, ew0.a, ew0.g, ew0.I, ew0.r, ew0.Q, ew0.s, j, ew0.f, ew0.d, ew0.b, ew0.h, ew0.c, ew0.i, ew0.x, ew0.y, ew0.D, ew0.J, ew0.P, ew0.K, ew0.L, ew0.M, ew0.N, ew0.O, ew0.B, ew0.C, ew0.l, ew0.m, ew0.G, ew0.H, ew0.p, ew0.q, ew0.T, ew0.U, ew0.v, ew0.w);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return Boolean.TRUE;
            case 13:
                return dn8.a;
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return null;
            case 17:
                y01.b("LocalViewConfiguration");
                throw null;
            case 18:
                y01.b("LocalWindowInfo");
                throw null;
            case 19:
                return new x01();
            case 20:
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                y01.b("LocalAutofillTree");
                throw null;
            case 22:
                y01.b("LocalAutofillManager");
                throw null;
            case 23:
                y01.b("LocalClipboardManager");
                throw null;
            case 24:
                y01.b("LocalClipboard");
                throw null;
            case 25:
                y01.b("LocalGraphicsContext");
                throw null;
            case 26:
                y01.b("LocalFontFamilyResolver");
                throw null;
            case 27:
                y01.b("LocalDensity");
                throw null;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                y01.b("LocalFocusManager");
                throw null;
            default:
                y01.b("LocalFontLoader");
                throw null;
        }
    }
}
