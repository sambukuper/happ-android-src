package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class so3 extends eq2 {
    public static final int[] q0 = fq0.f;
    public final md0 k0;
    public int[] l0;
    public int m0;
    public r37 n0;
    public boolean o0;
    public boolean p0;

    public so3(int i, k43 k43Var, z75 z75Var) {
        super(i, k43Var, z75Var);
        this.l0 = q0;
        this.n0 = io3.m0;
        this.k0 = k43Var.f0;
        if (qo3.j0.a(i)) {
            this.m0 = 127;
        }
        this.p0 = qo3.o0.a(i);
        this.o0 = !qo3.h0.a(i);
    }

    public final void i1(String str) {
        g(pc6.q("Can not ", str, ", expecting field name (context: ", this.h0.a(), ")"));
        throw null;
    }

    public final so3 j1(qo3 qo3Var) {
        int i = qo3Var.Y;
        this.Z &= ~i;
        if ((i & eq2.j0) != 0) {
            if (qo3Var == qo3.k0) {
                this.g0 = false;
            } else if (qo3Var == qo3.j0) {
                this.m0 = 0;
            } else if (qo3Var == qo3.m0) {
                fs3 fs3Var = this.h0;
                fs3Var.e = null;
                this.h0 = fs3Var;
            }
        }
        if (qo3Var == qo3.h0) {
            this.o0 = true;
            return this;
        }
        if (qo3Var == qo3.o0) {
            this.p0 = false;
        }
        return this;
    }
}
