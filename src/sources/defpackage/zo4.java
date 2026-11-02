package defpackage;

import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zo4 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ MainViewModel h0;
    public final /* synthetic */ ConfigGroupCache i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo4(MainViewModel mainViewModel, ConfigGroupCache configGroupCache, q51 q51Var) {
        super(2, q51Var);
        this.h0 = mainViewModel;
        this.i0 = configGroupCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new zo4(this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object value;
        xm4 xm4Var;
        boolean z = this.g0;
        MainViewModel mainViewModel = this.h0;
        if (!z) {
            w39.n0(obj);
            this.g0 = true;
            Object objI = mainViewModel.I(this);
            c71 c71Var = c71.X;
            if (objI == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        for (ServerCache serverCache : this.i0.getConfigs()) {
            XRayConfig.OutboundBean outboundBeanG = serverCache.getConfig().g();
            if (outboundBeanG != null) {
                mainViewModel.getClass();
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f + 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                mainViewModel.e(serverCache.getGuid(), outboundBeanG);
            }
        }
        return dn8.a;
    }
}
