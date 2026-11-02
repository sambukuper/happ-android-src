package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 implements q61 {
    public final r61 X;

    public f1(r61 r61Var) {
        this.X = r61Var;
    }

    @Override // defpackage.s61
    public final /* bridge */ s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public /* bridge */ q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    @Override // defpackage.s61
    public /* bridge */ s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return this.X;
    }
}
