package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;

    public /* synthetic */ th2(byte b, int i) {
        this.X = b;
        this.Y = i;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        int i = this.Y;
        switch (b) {
            case 0:
                return Integer.valueOf(i);
            default:
                return Float.valueOf(i / 100.0f);
        }
    }
}
