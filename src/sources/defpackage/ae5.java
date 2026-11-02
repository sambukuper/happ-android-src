package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ae5 extends mb6 {
    public final s86 j0;

    public ae5(s86 s86Var) {
        this.j0 = s86Var;
    }

    @Override // defpackage.mb6
    public final s86 D() {
        return this.j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae5) {
            return this.j0.equals(((ae5) obj).j0);
        }
        return false;
    }

    public final int hashCode() {
        return this.j0.hashCode();
    }
}
