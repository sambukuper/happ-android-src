package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yq8 {
    public final int a;
    public final ux0 b;

    public yq8(int i, ux0 ux0Var) {
        ux0Var.getClass();
        this.a = i;
        this.b = ux0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq8)) {
            return false;
        }
        yq8 yq8Var = (yq8) obj;
        return this.a == yq8Var.a && dh3.f(this.b, yq8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
