package defpackage;

import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fz7 implements qd1 {
    public final gn2 a = gz7.d;

    @Override // defpackage.qd1
    public final sd1 a(le7 le7Var, pd5 pd5Var) {
        String str = le7Var.b;
        d73 d73Var = le7Var.a;
        if (!dh3.f(str, "image/svg+xml")) {
            ba0 ba0VarSource = d73Var.source();
            if (!ba0VarSource.q(0L, od1.b) || ba0VarSource.S(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, od1.a) == -1) {
                return null;
            }
        }
        return new gz7(d73Var, pd5Var, this.a);
    }
}
