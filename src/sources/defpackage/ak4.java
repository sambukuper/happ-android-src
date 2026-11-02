package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.SubscriptionUserInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ak4 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ MainActivity h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak4(MainActivity mainActivity, q51 q51Var) {
        super(2, q51Var);
        this.h0 = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new ak4(this.h0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:5:0x0008, B:10:0x0022, B:12:0x003a, B:14:0x005e, B:16:0x0064, B:18:0x006b, B:20:0x0086, B:23:0x008d, B:25:0x0093, B:27:0x0099, B:28:0x00a2, B:22:0x008a), top: B:40:0x0004 }] */
    public final Object q(Object obj) {
        tn tnVar;
        SubscriptionUserInfo subscriptionUserInfo;
        boolean z = this.g0;
        Long l = null;
        try {
            if (!z) {
                w39.n0(obj);
                MainActivity mainActivity = this.h0;
                int i = MainActivity.y1;
                long jF = mainActivity.H().f(0L, "keyForStatistics");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jF + 86400000 < jCurrentTimeMillis) {
                    mainActivity.H().m(jCurrentTimeMillis, "keyForStatistics");
                    SubscriptionItem subscriptionItem = new SubscriptionItem(null, 268435455, null);
                    ProviderId.Companion companion = ProviderId.INSTANCE;
                    subscriptionItem.t0("I8AmwFEw", "438188ae27605b83f6ba5c5aee91993ce6bf7031c489999c97150b95417a9856");
                    HappApplication happApplication = HappApplication.M0;
                    qo qoVarA = k32.i().a();
                    MetaParams metaParams = subscriptionItem.getMetaParams();
                    if (metaParams == null) {
                        tnVar = tn.Y;
                    } else {
                        Map fragmentBean = metaParams.getFragmentBean();
                        if (!eu.q0(new Object[]{fragmentBean != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty()) {
                            tnVar = tn.Z;
                        } else {
                            tnVar = tn.Y;
                        }
                    }
                    tn tnVar2 = tnVar;
                    MetaParams metaParams2 = subscriptionItem.getMetaParams();
                    if (metaParams2 != null && (subscriptionUserInfo = metaParams2.getSubscriptionUserInfo()) != null) {
                        l = new Long(subscriptionUserInfo.getExpire());
                    }
                    this.g0 = true;
                    Object objF = qoVarA.f("I8AmwFEw", "438188ae27605b83f6ba5c5aee91993ce6bf7031c489999c97150b95417a9856", tnVar2, l, this);
                    c71 c71Var = c71.X;
                    if (objF == c71Var) {
                        return c71Var;
                    }
                }
            } else {
                if (!z) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                Object obj2 = ((sj6) obj).X;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        return dn8.a;
    }
}
