package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hb5 {
    public final db a;
    public final ai0 b;

    public hb5(db dbVar, ai0 ai0Var, int i) {
        dbVar = (i & 1) != 0 ? null : dbVar;
        ai0Var = (i & 2) != 0 ? null : ai0Var;
        this.a = dbVar;
        this.b = ai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb5)) {
            return false;
        }
        hb5 hb5Var = (hb5) obj;
        return dh3.f(this.a, hb5Var.a) && dh3.f(this.b, hb5Var.b);
    }

    public final int hashCode() {
        db dbVar = this.a;
        int iHashCode = (dbVar == null ? 0 : dbVar.hashCode()) * 31;
        ai0 ai0Var = this.b;
        return iHashCode + (ai0Var != null ? Integer.hashCode(ai0Var.a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
