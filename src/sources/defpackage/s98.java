package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s98 {
    public final b71 a;
    public final b71 b;
    public final Executor c;
    public final u61 d;
    public final Executor e;
    public final u61 f;
    public final Executor g;
    public final u61 h;
    public final vz7 i;
    public final vz7 j;

    public s98(b71 b71Var, b71 b71Var2, Executor executor, u61 u61Var, Executor executor2, u61 u61Var2, Executor executor3, u61 u61Var3, dn2 dn2Var, f98 f98Var) {
        b71Var.getClass();
        b71Var2.getClass();
        this.a = b71Var;
        this.b = b71Var2;
        this.c = executor;
        this.d = u61Var;
        this.e = executor2;
        this.f = u61Var2;
        this.g = executor3;
        this.h = u61Var3;
        this.i = new vz7(new mv2(dn2Var, (byte) 5));
        this.j = new vz7(new v38((Object) f98Var, (byte) 6));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, gn2 gn2Var) {
        try {
            return z51.R(this.d, new r98(this, gn2Var, j, null));
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
