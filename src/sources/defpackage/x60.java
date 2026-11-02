package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x60 {
    public je a = null;
    public eb b = null;
    public um0 c = null;
    public lf d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        return dh3.f(this.a, x60Var.a) && dh3.f(this.b, x60Var.b) && dh3.f(this.c, x60Var.c) && dh3.f(this.d, x60Var.d);
    }

    public final int hashCode() {
        je jeVar = this.a;
        int iHashCode = (jeVar == null ? 0 : jeVar.hashCode()) * 31;
        eb ebVar = this.b;
        int iHashCode2 = (iHashCode + (ebVar == null ? 0 : ebVar.hashCode())) * 31;
        um0 um0Var = this.c;
        int iHashCode3 = (iHashCode2 + (um0Var == null ? 0 : um0Var.hashCode())) * 31;
        lf lfVar = this.d;
        return iHashCode3 + (lfVar != null ? lfVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
