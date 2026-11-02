package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ me6 Y;
    public final /* synthetic */ te6 Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ de g0;

    public /* synthetic */ hx0(me6 me6Var, te6 te6Var, long j, de deVar, byte b) {
        this.X = b;
        this.Y = me6Var;
        this.Z = te6Var;
        this.f0 = j;
        this.g0 = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        de deVar = this.g0;
        long j = this.f0;
        te6 te6Var = this.Z;
        me6 me6Var = this.Y;
        switch (b) {
            case 0:
                me6Var.J(te6Var, j, deVar);
                break;
            default:
                me6Var.Y(te6Var, j, deVar);
                break;
        }
    }
}
