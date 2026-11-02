package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ik1 extends gk1 {
    public final g44 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(ov3 ov3Var, fx5 fx5Var, yu3 yu3Var) {
        super(ov3Var, fx5Var, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        this.r0 = x97.P(w74.X, new f3(this, (byte) 14));
    }

    @Override // defpackage.gk1
    public final uj1 Y() {
        return (hk1) this.r0.getValue();
    }

    @Override // defpackage.kb6
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public ik1 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new ik1(ov3Var, V(), yu3Var);
    }

    @Override // defpackage.nw3
    public final hw3 b() {
        return (hk1) this.r0.getValue();
    }
}
