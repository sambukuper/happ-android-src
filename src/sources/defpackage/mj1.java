package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends fk1 implements zv3 {
    public final g44 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(ov3 ov3Var, fx5 fx5Var, yu3 yu3Var) {
        super(ov3Var, fx5Var, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        this.s0 = x97.P(w74.X, new f3(this, (byte) 12));
    }

    @Override // defpackage.fk1, defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new mj1(ov3Var, V(), yu3Var);
    }

    @Override // defpackage.fk1
    /* JADX INFO: renamed from: Z */
    public final fk1 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new mj1(ov3Var, V(), yu3Var);
    }

    @Override // defpackage.zv3
    public final uv3 d() {
        return (lj1) this.s0.getValue();
    }
}
