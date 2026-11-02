package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q45 implements p45 {
    public final y14 c = y14.i;
    public final hf5 d = new hf5(hf5.d);

    public final boolean a(t14 t14Var, t14 t14Var2) {
        t14Var.getClass();
        t14Var2.getClass();
        return oy1.v(wl7.w(false, null, this.c, 6), t14Var.q0(), t14Var2.q0());
    }

    public final boolean b(t14 t14Var, t14 t14Var2) {
        t14Var.getClass();
        t14Var2.getClass();
        jh8 jh8VarW = wl7.w(true, null, this.c, 6);
        xi8 xi8Var = jh8VarW.c;
        mo8 mo8VarQ0 = t14Var.q0();
        mo8 mo8VarQ1 = t14Var2.q0();
        if (mo8VarQ0 == mo8VarQ1) {
            return true;
        }
        rn2 rn2VarP = xi8Var.P();
        Boolean bool = rn2VarP != null ? (Boolean) rn2VarP.K(mo8VarQ0, mo8VarQ1) : null;
        return bool != null ? bool.booleanValue() : oy1.Y.u(jh8VarW, xi8Var, mo8VarQ0, mo8VarQ1);
    }
}
