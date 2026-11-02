package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dv7 extends s51 {
    public String f0;
    public SubscriptionItem g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ SubscriptionUpdater$UpdateTask j0;
    public int k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv7(SubscriptionUpdater$UpdateTask subscriptionUpdater$UpdateTask, s51 s51Var) {
        super(s51Var);
        this.j0 = subscriptionUpdater$UpdateTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        this.i0 = obj;
        this.k0 |= Integer.MIN_VALUE;
        return this.j0.i(this, null, false);
    }
}
