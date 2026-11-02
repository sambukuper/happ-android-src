package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ f63 Y;

    public /* synthetic */ rc4(f63 f63Var, byte b) {
        this.X = b;
        this.Y = f63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        f63 f63Var = this.Y;
        switch (b) {
            case 0:
                bk0 bk0Var = (bk0) f63Var.f0;
                if (bk0Var == null) {
                    bk0Var = new bk0(f63Var);
                    f63Var.f0 = bk0Var;
                }
                ((yz4) f63Var.Y).f(bk0Var);
                break;
            default:
                bk0 bk0Var2 = (bk0) f63Var.f0;
                if (bk0Var2 != null) {
                    ((yz4) f63Var.Y).i(bk0Var2);
                }
                break;
        }
    }
}
