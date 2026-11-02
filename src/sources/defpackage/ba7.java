package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ba7 extends dh8 {
    public ba7(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr, Object obj, Object obj2, boolean z) {
        super(cls, gh8Var, dh8Var, dh8VarArr, (gh8Var == null ? gh8.i0 : gh8Var).f0, obj, obj2, z);
    }

    public static ba7 U0(Class cls) {
        return new ba7(cls, null, null, null, null, null, false);
    }

    @Override // defpackage.dh8
    public StringBuilder A0(StringBuilder sb) {
        dh8.u0(this.j0, sb, true);
        return sb;
    }

    @Override // defpackage.dh8
    public StringBuilder B0(StringBuilder sb) {
        dh8.u0(this.j0, sb, false);
        gh8 gh8Var = this.q0;
        int length = gh8Var.Y.length;
        if (length > 0) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                sb = gh8Var.d(i).B0(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // defpackage.dh8
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.dh8
    public dh8 M0(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        return null;
    }

    @Override // defpackage.dh8
    public dh8 O0(dh8 dh8Var) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // defpackage.dh8
    public dh8 P0(si8 si8Var) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // defpackage.dh8
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public ba7 R0() {
        if (this.n0) {
            return this;
        }
        return new ba7(this.j0, this.q0, this.o0, this.p0, this.l0, this.m0, true);
    }

    @Override // defpackage.dh8
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public ba7 S0(Object obj) {
        if (this.m0 == obj) {
            return this;
        }
        return new ba7(this.j0, this.q0, this.o0, this.p0, this.l0, obj, this.n0);
    }

    @Override // defpackage.dh8
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public ba7 T0(Object obj) {
        if (obj == this.l0) {
            return this;
        }
        return new ba7(this.j0, this.q0, this.o0, this.p0, obj, this.m0, this.n0);
    }

    @Override // defpackage.dh8
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ba7 ba7Var = (ba7) obj;
        if (ba7Var.j0 != this.j0) {
            return false;
        }
        return this.q0.equals(ba7Var.q0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(w0());
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.dh8
    public String w0() {
        StringBuilder sb = new StringBuilder(this.j0.getName());
        gh8 gh8Var = this.q0;
        int length = gh8Var.Y.length;
        if (length > 0 && v0(length)) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                dh8 dh8VarD = gh8Var.d(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(dh8VarD.N0());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public ba7(Class cls) {
        this(cls, gh8.i0, null, null);
    }

    public ba7(Class cls, gh8 gh8Var, dh8 dh8Var, dh8[] dh8VarArr) {
        this(cls, gh8Var, dh8Var, dh8VarArr, null, null, false);
    }
}
