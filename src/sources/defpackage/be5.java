package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be5 extends mb6 {
    public final em6 j0;
    public final lf k0;

    public be5(em6 em6Var) {
        lf lfVarA;
        this.j0 = em6Var;
        if (pu.z(em6Var)) {
            lfVarA = null;
        } else {
            lfVarA = nf.a();
            lf.c(lfVarA, em6Var);
        }
        this.k0 = lfVarA;
    }

    @Override // defpackage.mb6
    public final s86 D() {
        em6 em6Var = this.j0;
        return new s86(em6Var.a, em6Var.b, em6Var.c, em6Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be5) {
            return this.j0.equals(((be5) obj).j0);
        }
        return false;
    }

    public final int hashCode() {
        return this.j0.hashCode();
    }
}
