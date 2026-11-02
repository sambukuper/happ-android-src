package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m66 {
    public static final l66 X = new l66();
    public static final l2 Y;

    static {
        Integer num = cj3.a;
        Y = (num == null || num.intValue() >= 34) ? new vp5() : new b82();
    }

    public int a(int i) {
        return Y.a(i);
    }

    public int b() {
        return Y.b();
    }

    public int c(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            em7.c(mb6.j(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }

    public long d() {
        return Y.d();
    }

    public long e(long j) {
        long jD;
        long j2;
        int iB;
        if (j <= 0) {
            em7.c(mb6.j(0L, Long.valueOf(j)));
            return 0L;
        }
        if (j > 0) {
            if (((-j) & j) != j) {
                do {
                    jD = d() >>> 1;
                    j2 = jD % j;
                } while ((j - 1) + (jD - j2) < 0);
                return j2;
            }
            int i = (int) j;
            int i2 = (int) (j >>> 32);
            if (i != 0) {
                iB = a(31 - Integer.numberOfLeadingZeros(i));
            } else {
                if (i2 != 1) {
                    return (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) b()) & 4294967295L);
                }
                iB = b();
            }
            return ((long) iB) & 4294967295L;
        }
        while (true) {
            long jD2 = d();
            if (0 <= jD2 && jD2 < j) {
                return jD2;
            }
        }
    }
}
