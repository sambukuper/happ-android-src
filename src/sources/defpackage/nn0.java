package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 {
    public final gh0 a;
    public final xm0 b;
    public final sf0 c;

    public nn0(gh0 gh0Var, xm0 xm0Var, sf0 sf0Var) {
        gh0Var.getClass();
        this.a = gh0Var;
        this.b = xm0Var;
        this.c = sf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nn0) {
            nn0 nn0Var = (nn0) obj;
            return dh3.f(this.a, nn0Var.a) && this.b == nn0Var.b && this.c == nn0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
