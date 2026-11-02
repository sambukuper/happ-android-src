package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ hy7 Y;

    public /* synthetic */ ig1(hy7 hy7Var, byte b) {
        this.X = b;
        this.Y = hy7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        hy7 hy7Var = this.Y;
        switch (b) {
            case 0:
                hy7Var.c();
                break;
            default:
                hy7Var.f.cancel(true);
                break;
        }
    }
}
