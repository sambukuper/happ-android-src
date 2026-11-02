package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p30 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ r68 Y;

    public /* synthetic */ p30(r68 r68Var, byte b) {
        this.X = b;
        this.Y = r68Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        r68 r68Var = this.Y;
        switch (b) {
            case 0:
                return new jd(r68Var, (byte) 4);
            case 1:
                s88 s88Var = (s88) r68Var.s.getValue();
                s88 s88Var2 = s88.Y;
                if (s88Var == s88Var2) {
                    s88Var2 = s88.X;
                }
                r68Var.y(s88Var2);
                return dn8Var;
            default:
                r68Var.b();
                return dn8Var;
        }
    }
}
