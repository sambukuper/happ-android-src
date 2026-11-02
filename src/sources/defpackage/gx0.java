package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ me6 Y;
    public final /* synthetic */ te6 Z;

    public /* synthetic */ gx0(me6 me6Var, te6 te6Var, byte b) {
        this.X = b;
        this.Y = me6Var;
        this.Z = te6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                this.Y.u(this.Z);
                break;
            case 1:
                this.Y.m(this.Z);
                break;
            default:
                this.Y.R(this.Z);
                break;
        }
    }
}
