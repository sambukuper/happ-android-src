package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl5 implements n61 {
    public final float a;

    public dl5(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            zc3.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.n61
    public final float a(long j, fi1 fi1Var) {
        return (this.a / 100.0f) * ua7.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl5) && Float.compare(this.a, ((dl5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
