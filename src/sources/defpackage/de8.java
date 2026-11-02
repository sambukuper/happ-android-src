package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de8 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ce8 Y;

    public /* synthetic */ de8(ce8 ce8Var, byte b) {
        this.X = b;
        this.Y = ce8Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        ce8 ce8Var = this.Y;
        switch (b) {
            case 0:
                return new ee8(ce8Var, (byte) 1);
            default:
                return new ee8(ce8Var, (byte) 0);
        }
    }
}
