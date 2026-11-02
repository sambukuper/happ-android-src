package su.happ.proxyutility.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mmkv.MMKV;
import defpackage.n69;
import kotlin.Metadata;
import libxray.XRayPoint;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.receiver.BootUpReceiver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/receiver/BootUpReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class BootUpReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;
    public final vz7 a;
    public final vz7 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BootUpReceiver() {
        final byte b = 0;
        this.a = new vz7(new dn2() { // from class: w60
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b) {
                    case 0:
                        int i = BootUpReceiver.c;
                        return MMKV.t("SETTING", vj8.M());
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = BootUpReceiver.c;
                        return MMKV.t("MAIN", vj8.M());
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
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
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        HappApplication happApplication6 = HappApplication.M0;
                        return k32.i().h();
                    case 11:
                        long j = ew0.z;
                        return new iw0(j, ew0.j, ew0.A, ew0.k, ew0.e, ew0.E, ew0.n, ew0.F, ew0.o, ew0.R, ew0.t, ew0.S, ew0.u, ew0.a, ew0.g, ew0.I, ew0.r, ew0.Q, ew0.s, j, ew0.f, ew0.d, ew0.b, ew0.h, ew0.c, ew0.i, ew0.x, ew0.y, ew0.D, ew0.J, ew0.P, ew0.K, ew0.L, ew0.M, ew0.N, ew0.O, ew0.B, ew0.C, ew0.l, ew0.m, ew0.G, ew0.H, ew0.p, ew0.q, ew0.T, ew0.U, ew0.v, ew0.w);
                    case 12:
                        return Boolean.TRUE;
                    case 13:
                        return dn8.a;
                    case 14:
                    case 15:
                    case 16:
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
                    case 28:
                        y01.b("LocalFocusManager");
                        throw null;
                    default:
                        y01.b("LocalFontLoader");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.b = new vz7(new dn2() { // from class: w60
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        int i = BootUpReceiver.c;
                        return MMKV.t("SETTING", vj8.M());
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = BootUpReceiver.c;
                        return MMKV.t("MAIN", vj8.M());
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
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
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        HappApplication happApplication6 = HappApplication.M0;
                        return k32.i().h();
                    case 11:
                        long j = ew0.z;
                        return new iw0(j, ew0.j, ew0.A, ew0.k, ew0.e, ew0.E, ew0.n, ew0.F, ew0.o, ew0.R, ew0.t, ew0.S, ew0.u, ew0.a, ew0.g, ew0.I, ew0.r, ew0.Q, ew0.s, j, ew0.f, ew0.d, ew0.b, ew0.h, ew0.c, ew0.i, ew0.x, ew0.y, ew0.D, ew0.J, ew0.P, ew0.K, ew0.L, ew0.M, ew0.N, ew0.O, ew0.B, ew0.C, ew0.l, ew0.m, ew0.G, ew0.H, ew0.p, ew0.q, ew0.T, ew0.U, ew0.v, ew0.w);
                    case 12:
                        return Boolean.TRUE;
                    case 13:
                        return dn8.a;
                    case 14:
                    case 15:
                    case 16:
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
                    case 28:
                        y01.b("LocalFocusManager");
                        throw null;
                    default:
                        y01.b("LocalFontLoader");
                        throw null;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action.hashCode()) {
                case -1787487905:
                    if (!action.equals("android.intent.action.QUICKBOOT_POWERON")) {
                        return;
                    }
                    break;
                case -1417835046:
                    if (!action.equals("com.htc.intent.action.QUICKBOOT_POWERON")) {
                        return;
                    }
                    break;
                case 798292259:
                    if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                        return;
                    }
                    break;
                case 1737074039:
                    if (!action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (context == null || !((MMKV) this.a.getValue()).b("pref_auto_start_vpn") || ((MMKV) this.b.getValue()).i("SELECTED_SERVER") == null) {
                return;
            }
            XRayPoint xRayPoint = n69.a;
            n69.b(context, false);
        }
    }
}
