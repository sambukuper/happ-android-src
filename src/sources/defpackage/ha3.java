package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ha3 implements ja3 {
    public final zo8 a;
    public final boolean b;

    public ha3(zo8 zo8Var, boolean z) {
        this.a = zo8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3)) {
            return false;
        }
        ha3 ha3Var = (ha3) obj;
        return this.a.equals(ha3Var.a) && this.b == ha3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Info(params=" + ("UpdateParamsUiState(value=" + this.a + ")") + ", isForceUpdate=" + this.b + ")";
    }
}
