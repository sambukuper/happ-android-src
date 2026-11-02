package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 implements n61 {
    public final float a;

    public lt1(float f) {
        this.a = f;
    }

    @Override // defpackage.n61
    public final float a(long j, fi1 fi1Var) {
        return fi1Var.h0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt1) && kt1.b(this.a, ((lt1) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
