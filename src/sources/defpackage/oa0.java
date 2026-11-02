package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 extends uf5 implements tf5 {
    public final s50 k0;
    public final x15 l0;
    public final z47 m0;
    public az5 n0;
    public hm1 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(fk2 fk2Var, ve4 ve4Var, vx4 vx4Var, az5 az5Var, ka0 ka0Var) {
        super(vx4Var, fk2Var);
        fk2Var.getClass();
        vx4Var.getClass();
        ka0Var.getClass();
        this.k0 = ka0Var;
        iz5 iz5Var = az5Var.f0;
        iz5Var.getClass();
        gz5 gz5Var = az5Var.g0;
        gz5Var.getClass();
        x15 x15Var = new x15(iz5Var, gz5Var);
        this.l0 = x15Var;
        this.m0 = new z47(az5Var, x15Var, ka0Var, new ve7(this, (byte) 13));
        this.n0 = az5Var;
    }

    public final void I0(hl1 hl1Var) {
        hl1Var.getClass();
        az5 az5Var = this.n0;
        if (az5Var == null) {
            bt.i("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.n0 = null;
        zy5 zy5Var = az5Var.h0;
        zy5Var.getClass();
        this.o0 = new hm1(this, zy5Var, this.l0, this.k0, null, hl1Var, "scope of " + this, new f3(this, (byte) 19));
    }

    @Override // defpackage.tf5
    public final et4 K() {
        hm1 hm1Var = this.o0;
        if (hm1Var != null) {
            return hm1Var;
        }
        dh3.T("_memberScope");
        throw null;
    }

    @Override // defpackage.uf5, defpackage.fd1
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.i0);
        sb.append(" from ");
        int i = el1.a;
        vx4 vx4VarC = bl1.c(this);
        vx4VarC.getClass();
        sb.append(vx4VarC);
        return sb.toString();
    }
}
