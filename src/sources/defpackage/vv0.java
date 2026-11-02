package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vv0 extends dh8 {
    public final dh8 s0;

    public vv0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr, dh8 dh8Var2, Object obj, Object obj2, boolean z) {
        super(cls, gh8Var, dh8Var, dh8VarArr, dh8Var2.hashCode(), obj, obj2, z);
        this.s0 = dh8Var2;
    }

    @Override // defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        dh8.u0(this.j0, sb, false);
        sb.append('<');
        this.s0.B0(sb);
        sb.append(">;");
        return sb;
    }

    @Override // defpackage.dh8
    public final boolean G0() {
        return super.G0() || this.s0.G0();
    }

    @Override // defpackage.dh8
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.dh8
    public final dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return new vv0(cls, gh8Var, dh8Var, dh8VarArr, this.s0, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 O0(dh8 dh8Var) {
        if (this.s0 == dh8Var) {
            return this;
        }
        return new vv0(this.j0, this.q0, this.o0, this.p0, dh8Var, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 P0(si8 si8Var) {
        return new vv0(this.j0, this.q0, this.o0, this.p0, this.s0.S0(si8Var), this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 Q0(dh8 dh8Var) {
        dh8 dh8Var2;
        dh8 dh8VarQ0;
        dh8 dh8VarQ1 = super.Q0(dh8Var);
        dh8 dh8VarZ0 = dh8Var.z0();
        return (dh8VarZ0 == null || (dh8VarQ0 = (dh8Var2 = this.s0).Q0(dh8VarZ0)) == dh8Var2) ? dh8VarQ1 : dh8VarQ1.O0(dh8VarQ0);
    }

    @Override // defpackage.dh8
    public final dh8 R0() {
        if (this.n0) {
            return this;
        }
        return new vv0(this.j0, this.q0, this.o0, this.p0, this.s0.R0(), this.l0, this.m0, true);
    }

    @Override // defpackage.dh8
    public final dh8 S0(Object obj) {
        return new vv0(this.j0, this.q0, this.o0, this.p0, this.s0, this.l0, obj, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 T0(Object obj) {
        return new vv0(this.j0, this.q0, this.o0, this.p0, this.s0, obj, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != vv0.class) {
            return false;
        }
        vv0 vv0Var = (vv0) obj;
        return this.j0 == vv0Var.j0 && this.s0.equals(vv0Var.s0);
    }

    public final String toString() {
        return "[collection type; class " + this.j0.getName() + ", contains " + this.s0 + "]";
    }

    @Override // defpackage.dh8
    public final String w0() {
        StringBuilder sb = new StringBuilder(this.j0.getName());
        dh8 dh8Var = this.s0;
        if (dh8Var != null && v0(1)) {
            sb.append('<');
            sb.append(dh8Var.w0());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.dh8
    public final dh8 z0() {
        return this.s0;
    }
}
