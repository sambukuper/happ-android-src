package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class k14 extends l14 implements lw3 {
    public final g44 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k14(ov3 ov3Var, String str, Object obj, kz3 kz3Var, yu3 yu3Var) {
        super(ov3Var, str, obj, kz3Var, yu3Var);
        ov3Var.getClass();
        str.getClass();
        kz3Var.getClass();
        yu3Var.getClass();
        i14 i14Var = new i14(this, (byte) 0);
        w74 w74Var = w74.X;
        this.n0 = x97.P(w74Var, i14Var);
        x97.P(w74Var, new i14(this, (byte) 1));
    }

    @Override // defpackage.kb6
    public kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new k14(ov3Var, this.Z, nd0.NO_RECEIVER, this.g0, yu3Var);
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return get(obj);
    }

    @Override // defpackage.l14
    public final c14 U() {
        return (j14) this.n0.getValue();
    }

    @Override // defpackage.nw3
    public final hw3 b() {
        return (j14) this.n0.getValue();
    }

    @Override // defpackage.lw3
    public final Object get(Object obj) {
        return ((j14) this.n0.getValue()).S(obj);
    }

    @Override // defpackage.nw3
    public final kw3 b() {
        return (j14) this.n0.getValue();
    }
}
