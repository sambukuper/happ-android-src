package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ce2 extends mo8 implements fe2 {
    public final aa7 Y;
    public final aa7 Z;

    public ce2(aa7 aa7Var, aa7 aa7Var2) {
        aa7Var.getClass();
        aa7Var2.getClass();
        this.Y = aa7Var;
        this.Z = aa7Var2;
    }

    @Override // defpackage.t14
    public et4 K() {
        return u0().K();
    }

    @Override // defpackage.t14
    public final List l0() {
        return u0().l0();
    }

    @Override // defpackage.t14
    public final ch8 m0() {
        return u0().m0();
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return u0().n0();
    }

    @Override // defpackage.t14
    public final boolean o0() {
        return u0().o0();
    }

    public String toString() {
        return wk1.e.P(this);
    }

    public aa7 u0() {
        return this.Y;
    }

    public String v0(wk1 wk1Var, wk1 wk1Var2) {
        boolean zP = wk1Var2.a.p();
        aa7 aa7Var = this.Z;
        aa7 aa7Var2 = this.Y;
        if (!zP) {
            return wk1Var.w(wk1Var.P(aa7Var2), wk1Var.P(aa7Var), y08.e(this));
        }
        return "(" + wk1Var.P(aa7Var2) + ".." + wk1Var.P(aa7Var) + ')';
    }
}
