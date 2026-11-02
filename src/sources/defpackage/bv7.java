package defpackage;

import java.util.Iterator;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bv7 extends s51 {
    public boolean f0;
    public String g0;
    public qs7 h0;
    public Integer i0;
    public Iterator j0;
    public int k0;
    public /* synthetic */ Object l0;
    public final /* synthetic */ SubscriptionUpdater$UpdateTask m0;
    public int n0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv7(SubscriptionUpdater$UpdateTask subscriptionUpdater$UpdateTask, s51 s51Var) {
        super(s51Var);
        this.m0 = subscriptionUpdater$UpdateTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        this.l0 = obj;
        this.n0 |= Integer.MIN_VALUE;
        return this.m0.e(this);
    }
}
