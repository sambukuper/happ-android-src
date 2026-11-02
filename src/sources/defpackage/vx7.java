package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx7 implements Runnable {
    public final /* synthetic */ xx7 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ vx7(xx7 xx7Var, int i, int i2) {
        this.X = xx7Var;
        this.Y = i;
        this.Z = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        xx7 xx7Var = this.X;
        int i = xx7Var.i;
        int i2 = this.Y;
        boolean z2 = true;
        if (i != i2) {
            xx7Var.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = xx7Var.h;
        int i4 = this.Z;
        if (i3 != i4) {
            xx7Var.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            xx7Var.e();
        }
    }
}
