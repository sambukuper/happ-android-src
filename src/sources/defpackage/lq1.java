package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lq1 implements xe2 {
    public final xe2 X;
    public final gn2 Y;
    public final rn2 Z;

    public lq1(xe2 xe2Var, gn2 gn2Var, rn2 rn2Var) {
        this.X = xe2Var;
        this.Y = gn2Var;
        this.Z = rn2Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        ea6 ea6Var = new ea6();
        ea6Var.X = d75.a;
        Object objA = this.X.a(new zj(this, ea6Var, ze2Var, (byte) 1), q51Var);
        return objA == c71.X ? objA : dn8.a;
    }
}
