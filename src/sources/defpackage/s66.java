package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s66 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ t66 Y;
    public final /* synthetic */ qr6 Z;

    public /* synthetic */ s66(t66 t66Var, qr6 qr6Var, byte b) {
        this.X = b;
        this.Y = t66Var;
        this.Z = qr6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        qr6 qr6Var = this.Z;
        t66 t66Var = this.Y;
        vt vtVar = (vt) obj;
        switch (b) {
            case 0:
                vtVar.getClass();
                t66Var.a(qr6Var, vtVar);
                break;
            default:
                vtVar.getClass();
                t66Var.b(qr6Var, vtVar);
                break;
        }
        return dn8Var;
    }
}
