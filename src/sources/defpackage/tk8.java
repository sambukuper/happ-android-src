package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tk8 implements Comparable {
    public final long X;

    public /* synthetic */ tk8(long j) {
        this.X = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (j >= 0) {
            km4.q(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        km4.q(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        km4.q(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return dh3.l(this.X ^ Long.MIN_VALUE, ((tk8) obj).X ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tk8) {
            return this.X == ((tk8) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.X);
    }

    public final String toString() {
        return b(this.X);
    }
}
