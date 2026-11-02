package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.about_settings.AboutSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class i implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AboutSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(AboutSettingsActivity aboutSettingsActivity, byte b) {
        this.X = b;
        this.Y = aboutSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.feature.about_settings.AboutSettingsActivity] */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ?? r2 = this.Y;
        switch (b) {
            case 0:
                int i = AboutSettingsActivity.T0;
                ss8 ss8Var = ss8.a;
                ss8.B(r2, "https://www.happ.su/main/terms-of-services");
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                int i2 = AboutSettingsActivity.T0;
                ss8 ss8Var2 = ss8.a;
                ss8.B(r2, "https://www.happ.su/main/third-party-libraries");
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                int i3 = AboutSettingsActivity.T0;
                ss8 ss8Var3 = ss8.a;
                ss8.B(r2, "https://www.happ.su/main/privacy-policy");
                return dn8Var;
            default:
                t5 t5Var = r2.Q0;
                if (t5Var != null) {
                    return new s(t5Var);
                }
                dh3.T("binding");
                throw null;
        }
    }
}
