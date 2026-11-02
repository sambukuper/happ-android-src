package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class fx6 extends e1 implements d71 {
    public final q51 g0;

    public fx6(q51 q51Var, s61 s61Var) {
        super(s61Var, true);
        this.g0 = q51Var;
    }

    @Override // defpackage.rm3
    public final boolean T() {
        return true;
    }

    @Override // defpackage.d71
    public final d71 c() {
        q51 q51Var = this.g0;
        if (q51Var instanceof d71) {
            return (d71) q51Var;
        }
        return null;
    }

    @Override // defpackage.rm3
    public void d(Object obj) {
        op1.a(mb6.H(this.g0), gv3.Q(obj));
    }

    @Override // defpackage.rm3
    public void e(Object obj) {
        this.g0.f(gv3.Q(obj));
    }

    public void o0() {
    }
}
