package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lk8 implements Comparable {
    public final int X;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return dh3.k(this.X ^ Integer.MIN_VALUE, ((lk8) obj).X ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lk8) {
            return this.X == ((lk8) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X);
    }

    public final String toString() {
        return String.valueOf(((long) this.X) & 4294967295L);
    }
}
