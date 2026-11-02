package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nj implements qd1 {
    public final boolean a;

    public nj() {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.qd1
    public final sd1 a(le7 le7Var, pd5 pd5Var) {
        ba0 ba0VarSource = le7Var.a.source();
        if (!ba0VarSource.q(0L, pd1.b) && !ba0VarSource.q(0L, pd1.a) && (!ba0VarSource.q(0L, pd1.c) || !ba0VarSource.q(8L, pd1.d) || !ba0VarSource.q(12L, pd1.e) || !ba0VarSource.request(21L) || ((byte) (ba0VarSource.c().u(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !ba0VarSource.q(4L, pd1.f)) {
                return null;
            }
            if (!ba0VarSource.q(8L, pd1.g) && !ba0VarSource.q(8L, pd1.h) && !ba0VarSource.q(8L, pd1.i)) {
                return null;
            }
        }
        return new sj(le7Var.a, pd5Var, this.a);
    }
}
