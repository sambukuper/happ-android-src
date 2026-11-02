package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v35 implements w21 {
    public final ConnectivityManager a;

    public v35(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.w21
    public final boolean a(l49 l49Var) {
        if (!c(l49Var)) {
            return false;
        }
        bt.i("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.w21
    public final pd0 b(p31 p31Var) {
        p31Var.getClass();
        return w51.n(new qk4((Object) p31Var, (Object) this, (q51) null, (byte) 9));
    }

    @Override // defpackage.w21
    public final boolean c(l49 l49Var) {
        l49Var.getClass();
        return (l49Var.j.a() == null && l49Var.j.a == b45.X) ? false : true;
    }
}
