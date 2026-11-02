package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kf6 extends y43 {
    public dh8 s0;

    @Override // defpackage.dh8
    public final StringBuilder A0(StringBuilder sb) {
        dh8 dh8Var = this.s0;
        return dh8Var != null ? dh8Var.A0(sb) : sb;
    }

    @Override // defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        dh8 dh8Var = this.s0;
        if (dh8Var != null) {
            return dh8Var.A0(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // defpackage.dh8
    public final dh8 E0() {
        dh8 dh8Var = this.s0;
        return dh8Var != null ? dh8Var.E0() : this.o0;
    }

    @Override // defpackage.dh8
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.dh8
    public final dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        dh8 dh8Var = this.s0;
        if (dh8Var == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(dh8Var.j0.getName());
        }
        return sb.toString();
    }

    @Override // defpackage.dh8
    public final gh8 y0() {
        dh8 dh8Var = this.s0;
        return dh8Var != null ? dh8Var.y0() : this.q0;
    }

    @Override // defpackage.dh8
    public final dh8 R0() {
        return this;
    }

    @Override // defpackage.dh8
    public final dh8 O0(dh8 dh8Var) {
        return this;
    }

    @Override // defpackage.dh8
    public final dh8 P0(si8 si8Var) {
        return this;
    }

    @Override // defpackage.dh8
    public final dh8 S0(Object obj) {
        return this;
    }

    @Override // defpackage.dh8
    public final dh8 T0(Object obj) {
        return this;
    }
}
