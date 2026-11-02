package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 implements kx4 {
    public final kx4 X;
    public final kx4 Y;

    public fx0(kx4 kx4Var, kx4 kx4Var2) {
        this.X = kx4Var;
        this.Y = kx4Var2;
    }

    @Override // defpackage.kx4
    public final Object d(rn2 rn2Var, Object obj) {
        return this.Y.d(rn2Var, this.X.d(rn2Var, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fx0)) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        return this.X.equals(fx0Var.X) && dh3.f(this.Y, fx0Var.Y);
    }

    @Override // defpackage.kx4
    public final boolean g(gn2 gn2Var) {
        return this.X.g(gn2Var) && this.Y.g(gn2Var);
    }

    public final int hashCode() {
        return (this.Y.hashCode() * 31) + this.X.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) d(new dx0((byte) 1), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
