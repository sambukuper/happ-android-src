package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy7 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gy7 Y;
    public final /* synthetic */ mz Z;

    public /* synthetic */ dy7(gy7 gy7Var, mz mzVar, byte b) {
        this.X = b;
        this.Y = gy7Var;
        this.Z = mzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        mz mzVar = this.Z;
        gy7 gy7Var = this.Y;
        switch (b) {
            case 0:
                gy7Var.e(mzVar);
                break;
            default:
                gy7Var.e(mzVar);
                break;
        }
    }
}
