package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class fk1 extends gk1 implements mw3 {
    public final g44 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(ov3 ov3Var, String str, String str2) {
        super(ov3Var, str, str2, nd0.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        dk1 dk1Var = new dk1(this, (byte) 0);
        w74 w74Var = w74.X;
        this.r0 = x97.P(w74Var, dk1Var);
        x97.P(w74Var, new dk1(this, (byte) 1));
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((ek1) this.r0.getValue()).S(obj, obj2);
    }

    @Override // defpackage.gk1
    public final uj1 Y() {
        return (ek1) this.r0.getValue();
    }

    @Override // defpackage.kb6
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public fk1 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new fk1(ov3Var, V(), yu3Var);
    }

    @Override // defpackage.nw3
    public final ek1 b() {
        return (ek1) this.r0.getValue();
    }

    @Override // defpackage.nw3
    public final hw3 b() {
        return (ek1) this.r0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(ov3 ov3Var, fx5 fx5Var, yu3 yu3Var) {
        super(ov3Var, fx5Var, yu3Var);
        ov3Var.getClass();
        yu3Var.getClass();
        dk1 dk1Var = new dk1(this, (byte) 0);
        w74 w74Var = w74.X;
        this.r0 = x97.P(w74Var, dk1Var);
        x97.P(w74Var, new dk1(this, (byte) 1));
    }
}
