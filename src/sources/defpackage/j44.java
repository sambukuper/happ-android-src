package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j44 extends yg1 {
    public final q51 g0;

    public j44(s61 s61Var, rn2 rn2Var) {
        super(s61Var, false);
        this.g0 = mb6.w(this, this, rn2Var);
    }

    @Override // defpackage.rm3
    public final void e0() throws Throwable {
        try {
            op1.a(mb6.H(this.g0), dn8.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mp1) {
                th = ((mp1) th).X;
            }
            f(new rj6(th));
            throw th;
        }
    }
}
