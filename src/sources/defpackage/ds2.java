package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ds2 implements gn2 {
    public final /* synthetic */ byte X;
    public final gn2 Y;

    public /* synthetic */ ds2(gn2 gn2Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        long j;
        switch (this.X) {
            case 0:
                id7 id7Var = (id7) obj;
                synchronized (kd7.c) {
                    j = kd7.e;
                    kd7.e = 1 + j;
                }
                return new g76(j, id7Var, this.Y);
            case 1:
                gn2 gn2Var = this.Y;
                t14 t14Var = (t14) obj;
                t14Var.getClass();
                return gn2Var.B(t14Var).toString();
            default:
                return this.Y.B(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
