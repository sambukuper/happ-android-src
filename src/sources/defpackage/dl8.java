package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl8 implements Comparable {
    public final short X;

    public static String a(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return dh3.k(this.X & 65535, ((dl8) obj).X & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dl8) {
            return this.X == ((dl8) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.X);
    }

    public final String toString() {
        return a(this.X);
    }
}
