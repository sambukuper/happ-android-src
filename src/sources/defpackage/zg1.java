package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 implements s61 {
    public final s61 X;

    public zg1(s61 s61Var) {
        this.X = s61Var;
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        s61 s61VarB0 = this.X.B0(s61Var);
        int i = xs8.b;
        pz2 pz2Var = pz2.E0;
        q61 q61VarH0 = H0(pz2Var);
        u61 u61Var = q61VarH0 instanceof u61 ? (u61) q61VarH0 : null;
        q61 q61VarH1 = s61VarB0.H0(pz2Var);
        u61 u61Var2 = q61VarH1 instanceof u61 ? (u61) q61VarH1 : null;
        if ((u61Var instanceof ah1) && u61Var != u61Var2) {
            ((ah1) u61Var).f0 = 0;
        }
        return new zg1(s61VarB0);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        return this.X.H0(r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return this.X.U(rn2Var, obj);
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        s61 s61VarA0 = this.X.a0(r61Var);
        int i = xs8.b;
        pz2 pz2Var = pz2.E0;
        q61 q61VarH0 = H0(pz2Var);
        u61 u61Var = q61VarH0 instanceof u61 ? (u61) q61VarH0 : null;
        q61 q61VarH1 = s61VarA0.H0(pz2Var);
        u61 u61Var2 = q61VarH1 instanceof u61 ? (u61) q61VarH1 : null;
        if ((u61Var instanceof ah1) && u61Var != u61Var2) {
            ((ah1) u61Var).f0 = 0;
        }
        return new zg1(s61VarA0);
    }

    public final boolean equals(Object obj) {
        return dh3.f(this.X, obj);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.X + ")";
    }
}
