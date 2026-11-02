package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 implements vc5, q61 {
    public static final be Y = new be((byte) 13);
    public final lp2 X;

    public p01(lp2 lp2Var) {
        this.X = lp2Var;
    }

    @Override // defpackage.s61
    public final /* bridge */ s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final /* bridge */ q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    @Override // defpackage.s61
    public final /* bridge */ s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    @Override // defpackage.vc5
    public final List b(Integer num) {
        return this.X.D();
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return Y;
    }

    @Override // defpackage.vc5
    public final boolean z() {
        return this.X.C;
    }
}
