package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bk8 implements Comparable {
    public final byte X;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return dh3.k(this.X & 255, ((bk8) obj).X & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk8) {
            return this.X == ((bk8) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.X);
    }

    public final String toString() {
        return String.valueOf(this.X & 255);
    }
}
