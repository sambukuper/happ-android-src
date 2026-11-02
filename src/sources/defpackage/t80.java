package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 extends jx4 implements n80, w24 {
    public o41 q0;
    public boolean r0;

    public static final s86 Y0(t80 t80Var, i55 i55Var, p5 p5Var) {
        s86 s86Var;
        if (t80Var.p0 && t80Var.r0) {
            i55 i55VarY = yn0.Y(t80Var);
            if (!i55Var.V0().p0) {
                i55Var = null;
            }
            if (i55Var != null && (s86Var = (s86) p5Var.invoke()) != null) {
                return s86Var.k(i55VarY.H(i55Var, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.n80
    public final Object T(i55 i55Var, p5 p5Var, s51 s51Var) {
        Object objN = gv3.n(new fo(this, i55Var, p5Var, new g00((Object) this, (Object) i55Var, (Object) p5Var, (byte) 2), null), s51Var);
        return objN == c71.X ? objN : dn8.a;
    }

    @Override // defpackage.w24
    public final void n(y24 y24Var) {
        this.r0 = true;
    }
}
