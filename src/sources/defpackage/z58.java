package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z58 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ a68 Y;

    public /* synthetic */ z58(a68 a68Var, byte b) {
        this.X = b;
        this.Y = a68Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        a68 a68Var = this.Y;
        switch (b) {
            case 0:
                return (z85) a68Var.x0.d();
            default:
                fi1 fi1Var = (fi1) hi5.W(a68Var, y01.h);
                ((nt1) obj).getClass();
                a68Var.w0.setValue(new pf3((((long) fi1Var.x0(nt1.b(0L))) << 32) | (((long) fi1Var.x0(nt1.a(0L))) & 4294967295L)));
                return dn8.a;
        }
    }
}
