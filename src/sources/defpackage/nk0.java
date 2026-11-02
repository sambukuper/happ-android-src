package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {
    public final bj0 a;
    public final vx b;

    public nk0(bj0 bj0Var) {
        this.a = bj0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return this.a == nk0Var.a && dh3.f(this.b, nk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vx vxVar = this.b;
        return iHashCode + (vxVar == null ? 0 : vxVar.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }

    public nk0(bj0 bj0Var, vx vxVar) {
        this.a = bj0Var;
        this.b = vxVar;
    }
}
