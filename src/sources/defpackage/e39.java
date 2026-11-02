package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e39 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ g94 Y;
    public final /* synthetic */ f39 Z;

    public /* synthetic */ e39(g94 g94Var, f39 f39Var, byte b) {
        this.X = b;
        this.Y = g94Var;
        this.Z = f39Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        f39 f39Var = this.Z;
        g94 g94Var = this.Y;
        switch (b) {
            case 0:
                g94Var.a(f39Var);
                break;
            default:
                g94Var.f(f39Var);
                break;
        }
    }
}
