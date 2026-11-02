package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx7 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xx7 Y;

    public /* synthetic */ sx7(xx7 xx7Var, byte b) {
        this.X = b;
        this.Y = xx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        xx7 xx7Var = this.Y;
        switch (b) {
            case 0:
                ((lv2) km4.J()).execute(new sx7(xx7Var, (byte) 1));
                break;
            default:
                if (!xx7Var.n) {
                    xx7Var.d();
                }
                break;
        }
    }
}
