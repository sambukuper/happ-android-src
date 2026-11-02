package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx7 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wx7 Y;

    public /* synthetic */ tx7(wx7 wx7Var, byte b) {
        this.X = b;
        this.Y = wx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        wx7 wx7Var = this.Y;
        switch (b) {
            case 0:
                wx7Var.a();
                break;
            case 1:
                wx7Var.b();
                break;
            default:
                by7 by7Var = wx7Var.q;
                if (by7Var != null) {
                    by7Var.m();
                }
                if (wx7Var.p == null) {
                    wx7Var.o.c();
                }
                wx7Var.p = null;
                break;
        }
    }
}
