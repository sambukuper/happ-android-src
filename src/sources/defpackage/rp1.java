package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements Executor {
    public final u61 X;

    public rp1(u61 u61Var) {
        this.X = u61Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u61 u61Var = this.X;
        b02 b02Var = b02.X;
        if (op1.c(u61Var, b02Var)) {
            op1.b(u61Var, b02Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.X.toString();
    }
}
