package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ag5 implements fs0 {
    public final Class X;

    public ag5(Class cls) {
        cls.getClass();
        this.X = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ag5) {
            return dh3.f(this.X, ((ag5) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // defpackage.fs0
    public final Class t() {
        return this.X;
    }

    public final String toString() {
        return this.X.toString() + " (Kotlin reflection is not available)";
    }
}
