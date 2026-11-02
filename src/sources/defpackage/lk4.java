package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lk4 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ MainActivity h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ SubscriptionItem j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ boolean l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ g83 p0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk4(MainActivity mainActivity, String str, SubscriptionItem subscriptionItem, boolean z, boolean z2, String str2, boolean z3, boolean z4, g83 g83Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = mainActivity;
        this.i0 = str;
        this.j0 = subscriptionItem;
        this.k0 = z;
        this.l0 = z2;
        this.m0 = str2;
        this.n0 = z3;
        this.o0 = z4;
        this.p0 = g83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new lk4(this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            Boolean bool = Boolean.TRUE;
            this.g0 = true;
            Object objP = MainActivity.P(this.h0, this.i0, this.j0, this.k0, this.l0, false, this.m0, this.n0, this.o0, bool, this.p0, this, 16);
            c71 c71Var = c71.X;
            if (objP == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
