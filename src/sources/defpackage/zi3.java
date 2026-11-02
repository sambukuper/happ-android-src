package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi3 extends ba7 {
    public final dh8 s0;

    public zi3(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr, dh8 dh8Var2, Object obj, Object obj2, boolean z) {
        super(cls, gh8Var, dh8Var, dh8VarArr, Objects.hashCode(dh8Var2), obj, obj2, z);
        this.s0 = dh8Var2;
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final StringBuilder A0(StringBuilder sb) {
        dh8.u0(this.j0, sb, true);
        return sb;
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final StringBuilder B0(StringBuilder sb) {
        dh8.u0(this.j0, sb, false);
        sb.append('<');
        StringBuilder sbB0 = this.s0.B0(sb);
        sbB0.append(">;");
        return sbB0;
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return new zi3(cls, this.q0, dh8Var, dh8VarArr, this.s0, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final dh8 O0(dh8 dh8Var) {
        if (this.s0 == dh8Var) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, dh8Var, this.l0, this.m0, this.n0);
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final dh8 P0(si8 si8Var) {
        dh8 dh8Var = this.s0;
        if (si8Var == dh8Var.m0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, dh8Var.S0(si8Var), this.l0, this.m0, this.n0);
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final dh8 S0(Object obj) {
        if (obj == this.m0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, this.s0, this.l0, obj, this.n0);
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final dh8 T0(Object obj) {
        if (obj == this.l0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, this.s0, obj, this.m0, this.n0);
    }

    @Override // defpackage.ba7
    /* JADX INFO: renamed from: W0 */
    public final ba7 S0(Object obj) {
        if (obj == this.m0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, this.s0, this.l0, obj, this.n0);
    }

    @Override // defpackage.ba7
    /* JADX INFO: renamed from: X0 */
    public final ba7 T0(Object obj) {
        if (obj == this.l0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, this.s0, obj, this.m0, this.n0);
    }

    @Override // defpackage.ba7
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final zi3 R0() {
        if (this.n0) {
            return this;
        }
        return new zi3(this.j0, this.q0, this.o0, this.p0, this.s0.R0(), this.l0, this.m0, true);
    }

    @Override // defpackage.ba7, defpackage.dh8
    public final String w0() {
        StringBuilder sb = new StringBuilder(this.j0.getName());
        dh8 dh8Var = this.s0;
        if (dh8Var != null && v0(1)) {
            sb.append('<');
            sb.append(dh8Var.N0());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // defpackage.dh8
    public final dh8 z0() {
        return this.s0;
    }
}
