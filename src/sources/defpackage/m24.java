package defpackage;

import android.view.View;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.LanguageData;
import su.happ.proxyutility.dto.PingTypeData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class m24 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m24(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        Object obj = this.f0;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                o24 o24Var = (o24) obj3;
                qi3 qi3Var = (qi3) obj2;
                o24Var.h.invoke();
                o24Var.h = new l24(qi3Var, o24Var, (byte) 1);
                qi3Var.g0.setImageDrawable(o24Var.d);
                o24Var.f.B(((LanguageData) obj).getValue());
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                in5 in5Var = (in5) obj3;
                qi3 qi3Var2 = (qi3) obj2;
                in5Var.h.invoke();
                in5Var.h = new gn5(qi3Var2, in5Var, (byte) 1);
                qi3Var2.g0.setImageDrawable(in5Var.c);
                in5Var.f.B(((PingTypeData) obj).getValue());
                break;
            default:
                pv7 pv7Var = (pv7) obj2;
                String str = (String) obj;
                rn2 rn2Var = ((f47) obj3).e;
                if (rn2Var != null) {
                    rn2Var.K(new SubId(pv7Var.b), new GuId(str));
                }
                break;
        }
    }
}
