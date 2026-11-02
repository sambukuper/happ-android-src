package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c07 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ c07(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        int i = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return Integer.valueOf(((x78) ((xr0) obj).e).b.c(i));
            default:
                ((y48) obj).b1(i);
                return Boolean.TRUE;
        }
    }
}
