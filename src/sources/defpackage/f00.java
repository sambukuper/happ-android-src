package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 {
    public final yh0 a;
    public final db b;

    public f00(yh0 yh0Var, db dbVar) {
        this.a = yh0Var;
        this.b = dbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return dh3.f(this.a, f00Var.a) && dh3.f(this.b, f00Var.b);
    }

    public final int hashCode() {
        yh0 yh0Var = this.a;
        int iHashCode = (yh0Var == null ? 0 : yh0Var.hashCode()) * 31;
        db dbVar = this.b;
        return iHashCode + (dbVar != null ? dbVar.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.a + ", androidCameraState=" + this.b + ')';
    }
}
