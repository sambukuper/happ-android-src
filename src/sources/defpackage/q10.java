package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q10 implements w21 {
    public final e31 a;

    public q10(e31 e31Var) {
        this.a = e31Var;
    }

    @Override // defpackage.w21
    public final boolean a(l49 l49Var) {
        return c(l49Var) && e(this.a.a());
    }

    @Override // defpackage.w21
    public final pd0 b(p31 p31Var) {
        p31Var.getClass();
        return w51.n(new q0((Object) this, (q51) null, (byte) 6));
    }

    public int d() {
        return 7;
    }

    public boolean e(Object obj) {
        x35 x35Var = (x35) obj;
        x35Var.getClass();
        boolean z = x35Var.e;
        boolean z2 = x35Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && x35Var.c && !z) ? false : true;
        }
        lh4.P0().getClass();
        return !z2 || z;
    }
}
