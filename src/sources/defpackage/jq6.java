package defpackage;

import android.content.Context;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class jq6 extends no2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq6(pv3 pv3Var, dn2 dn2Var, byte b) {
        super(0, ch3.class, "dismiss", "RoutingSubscriptionSelectBottomSheet$dismiss(Lkotlin/reflect/KFunction;Lkotlin/jvm/functions/Function0;)V", 0);
        this.X = b;
        switch (b) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                this.Y = pv3Var;
                this.Z = dn2Var;
                super(0, ch3.class, "dismiss", "RoutingSubscriptionSelectBottomSheet$dismiss(Lkotlin/reflect/KFunction;Lkotlin/jvm/functions/Function0;)V", 0);
                break;
            default:
                this.Y = pv3Var;
                this.Z = dn2Var;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        mq6 mq6Var = mq6.a;
        dn8 dn8Var = dn8.a;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                ((pv3) obj2).B(mq6Var);
                ((dn2) obj).invoke();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ((pv3) obj2).B(mq6Var);
                ((dn2) obj).invoke();
                break;
            default:
                Context context = (Context) obj2;
                ss8.E(context, (String) obj);
                x79.h(context, y46.toast_copied_to_clipboard);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq6(Context context, String str) {
        super(0, ch3.class, "copyToClipboard", "HappInfoField$copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V", 0);
        this.X = (byte) 2;
        this.Y = context;
        this.Z = str;
    }
}
