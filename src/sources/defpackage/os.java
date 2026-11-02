package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os implements Comparable {
    public final int X;
    public final String Y;

    public os(int i, String str) {
        str.getClass();
        this.X = i;
        this.Y = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        os osVar = (os) obj;
        osVar.getClass();
        int iK = dh3.k(this.X, osVar.X);
        return iK != 0 ? iK : this.Y.compareTo(osVar.Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os)) {
            return false;
        }
        os osVar = (os) obj;
        return this.X == osVar.X && dh3.f(this.Y, osVar.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + (Integer.hashCode(this.X) * 31);
    }

    public final String toString() {
        return "AppVersionComparable(fileNum=" + this.X + ", version=" + this.Y + ")";
    }
}
