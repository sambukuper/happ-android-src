package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tp4 extends dh8 {
    public final dh8 s0;
    public final dh8 t0;

    public tp4(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr, dh8 dh8Var2, dh8 dh8Var3, Object obj, Object obj2, boolean z) {
        super(cls, gh8Var, dh8Var, dh8VarArr, dh8Var3.hashCode() + (dh8Var2.hashCode() * 31), obj, obj2, z);
        this.s0 = dh8Var2;
        this.t0 = dh8Var3;
    }

    @Override // defpackage.dh8
    public final StringBuilder A0(StringBuilder sb) {
        dh8.u0(this.j0, sb, true);
        return sb;
    }

    @Override // defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        dh8.u0(this.j0, sb, false);
        sb.append('<');
        this.s0.B0(sb);
        this.t0.B0(sb);
        sb.append(">;");
        return sb;
    }

    @Override // defpackage.dh8
    public final dh8 C0() {
        return this.s0;
    }

    @Override // defpackage.dh8
    public final boolean G0() {
        return super.G0() || this.t0.G0() || this.s0.G0();
    }

    @Override // defpackage.dh8
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.dh8
    public final dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return new tp4(cls, gh8Var, dh8Var, dh8VarArr, this.s0, this.t0, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 O0(dh8 dh8Var) {
        if (this.t0 == dh8Var) {
            return this;
        }
        return new tp4(this.j0, this.q0, this.o0, this.p0, this.s0, dh8Var, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 P0(si8 si8Var) {
        return new tp4(this.j0, this.q0, this.o0, this.p0, this.s0, this.t0.S0(si8Var), this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 Q0(dh8 dh8Var) {
        dh8 dh8Var2;
        dh8 dh8VarQ0;
        dh8 dh8Var3;
        dh8 dh8VarQ1;
        tp4 tp4Var;
        dh8 dh8VarQ2 = super.Q0(dh8Var);
        dh8 dh8VarC0 = dh8Var.C0();
        boolean z = dh8VarQ2 instanceof tp4;
        dh8 tp4Var2 = dh8VarQ2;
        tp4Var2 = dh8VarQ2;
        if (z && dh8VarC0 != null && (dh8VarQ1 = (dh8Var3 = this.s0).Q0(dh8VarC0)) != dh8Var3) {
            tp4Var = (tp4) dh8VarQ2;
            if (dh8VarQ1 != tp4Var.s0) {
                tp4Var2 = dh8VarQ2;
                tp4Var2 = tp4Var;
                tp4Var2 = new tp4(tp4Var.j0, tp4Var.q0, tp4Var.o0, tp4Var.p0, dh8VarQ1, tp4Var.t0, tp4Var.l0, tp4Var.m0, tp4Var.n0);
            }
        }
        tp4Var2 = dh8VarQ2;
        tp4Var2 = tp4Var;
        tp4Var2 = dh8VarQ2;
        dh8 dh8VarZ0 = dh8Var.z0();
        return (dh8VarZ0 == null || (dh8VarQ0 = (dh8Var2 = this.t0).Q0(dh8VarZ0)) == dh8Var2) ? tp4Var2 : tp4Var2.O0(dh8VarQ0);
    }

    @Override // defpackage.dh8
    public final dh8 R0() {
        if (this.n0) {
            return this;
        }
        return new tp4(this.j0, this.q0, this.o0, this.p0, this.s0.R0(), this.t0.R0(), this.l0, this.m0, true);
    }

    @Override // defpackage.dh8
    public final dh8 S0(Object obj) {
        return new tp4(this.j0, this.q0, this.o0, this.p0, this.s0, this.t0, this.l0, obj, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 T0(Object obj) {
        return new tp4(this.j0, this.q0, this.o0, this.p0, this.s0, this.t0, obj, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != tp4.class) {
            return false;
        }
        tp4 tp4Var = (tp4) obj;
        return this.j0 == tp4Var.j0 && this.s0.equals(tp4Var.s0) && this.t0.equals(tp4Var.t0);
    }

    public final String toString() {
        return "[map type; class " + this.j0.getName() + ", " + this.s0 + " -> " + this.t0 + "]";
    }

    @Override // defpackage.dh8
    public final String w0() {
        StringBuilder sb = new StringBuilder(this.j0.getName());
        dh8 dh8Var = this.s0;
        if (dh8Var != null && v0(2)) {
            sb.append('<');
            sb.append(dh8Var.N0());
            sb.append(',');
            sb.append(this.t0.N0());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.dh8
    public final dh8 z0() {
        return this.t0;
    }
}
