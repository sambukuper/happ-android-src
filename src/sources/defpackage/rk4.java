package defpackage;

import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rk4 extends uy7 implements rn2 {
    public final /* synthetic */ MainActivity g0;
    public final /* synthetic */ boolean h0;
    public final /* synthetic */ boolean i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk4(MainActivity mainActivity, boolean z, boolean z2, q51 q51Var) {
        super(2, q51Var);
        this.g0 = mainActivity;
        this.h0 = z;
        this.i0 = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new rk4(this.g0, this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        w39.n0(obj);
        MainActivity mainActivity = this.g0;
        mainActivity.k1.getAndSet(true);
        m51 m51Var = ko1.B1;
        km4.x(mainActivity.n());
        return Boolean.valueOf(mainActivity.W(new ImportResult(0, r83.a, null, 5), this.h0, this.i0));
    }
}
