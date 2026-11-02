package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ z76 Y;

    public /* synthetic */ cn0(z76 z76Var, byte b) {
        this.X = b;
        this.Y = z76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        z76 z76Var = this.Y;
        switch (b) {
            case 0:
                z76Var.f();
                break;
            case 1:
                if (z76Var != null) {
                    z76Var.f();
                }
                break;
            case 2:
                if (z76Var != null) {
                    z76Var.f();
                }
                break;
            case 3:
                z76Var.f();
                break;
            default:
                z76Var.f();
                break;
        }
    }
}
