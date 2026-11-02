package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mp2 implements o01 {
    public final l01 X;

    public mp2(l01 l01Var) {
        this.X = l01Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp2) {
            return this.X.equals(((mp2) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode() * 31;
    }
}
