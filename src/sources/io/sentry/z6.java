package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b7 Y;

    public /* synthetic */ z6(b7 b7Var, byte b) {
        this.X = b;
        this.Y = b7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        b7 b7Var = this.Y;
        switch (b) {
            case 0:
                j7 j7VarT = b7Var.t();
                if (j7VarT == null) {
                    j7VarT = j7.OK;
                }
                b7Var.v(j7VarT, null);
                b7Var.l.set(false);
                break;
            default:
                j7 j7VarT2 = b7Var.t();
                if (j7VarT2 == null) {
                    j7VarT2 = j7.DEADLINE_EXCEEDED;
                }
                b7Var.f(j7VarT2, b7Var.r.g != null, null);
                b7Var.m.set(false);
                break;
        }
    }
}
