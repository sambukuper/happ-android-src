package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p25 extends i21 {
    public final i25 i0;

    public p25(i25 i25Var) {
        i25Var.getClass();
        this.i0 = i25Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p25.class == obj.getClass() && dh3.f(this.i0, ((p25) obj).i0);
    }

    public final int hashCode() {
        return this.i0.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.i0 + ", direction=-1)";
    }
}
