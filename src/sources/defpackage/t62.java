package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t62 implements se6 {
    public final te6 X;
    public final long Y;

    public t62(te6 te6Var, long j) {
        te6Var.getClass();
        this.X = te6Var;
        this.Y = j;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        return null;
    }

    @Override // defpackage.se6
    public final boolean D() {
        return false;
    }

    @Override // defpackage.se6
    public final int R() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t62) {
            t62 t62Var = (t62) obj;
            return dh3.f(this.X, t62Var.X) && this.Y == t62Var.Y;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + p61.g(pc6.f(this.X.hashCode() * 31, 31, false), this.Y, 31);
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.X + ", wasImageCaptured=false, frameNumber=" + ((Object) mm2.a(this.Y)) + ", reason=0)";
    }
}
