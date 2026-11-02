package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cu extends dh8 {
    public static final /* synthetic */ int u0 = 0;
    public final dh8 s0;
    public final Object t0;

    public cu(dh8 dh8Var, gh8 gh8Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), gh8Var, null, null, dh8Var.hashCode(), obj2, obj3, z);
        this.s0 = dh8Var;
        this.t0 = obj;
    }

    @Override // defpackage.dh8
    public final StringBuilder A0(StringBuilder sb) {
        sb.append('[');
        return this.s0.A0(sb);
    }

    @Override // defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        sb.append('[');
        return this.s0.B0(sb);
    }

    @Override // defpackage.dh8
    public final boolean F0() {
        return this.s0.F0();
    }

    @Override // defpackage.dh8
    public final boolean G0() {
        return super.G0() || this.s0.G0();
    }

    @Override // defpackage.dh8
    public final dh8 P0(si8 si8Var) {
        dh8 dh8Var = this.s0;
        if (si8Var == dh8Var.m0) {
            return this;
        }
        return new cu(dh8Var.S0(si8Var), this.q0, this.t0, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 R0() {
        if (this.n0) {
            return this;
        }
        return new cu(this.s0.R0(), this.q0, this.t0, this.l0, this.m0, true);
    }

    @Override // defpackage.dh8
    public final dh8 S0(Object obj) {
        if (obj == this.m0) {
            return this;
        }
        return new cu(this.s0, this.q0, this.t0, this.l0, obj, this.n0);
    }

    @Override // defpackage.dh8
    public final dh8 T0(Object obj) {
        if (obj == this.l0) {
            return this;
        }
        return new cu(this.s0, this.q0, this.t0, obj, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == cu.class) {
            return this.s0.equals(((cu) obj).s0);
        }
        return false;
    }

    public final String toString() {
        return "[array type, component type: " + this.s0 + "]";
    }

    @Override // defpackage.dh8
    public final dh8 z0() {
        return this.s0;
    }
}
