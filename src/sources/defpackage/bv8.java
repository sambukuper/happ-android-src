package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bv8 implements Comparable {
    public static final ConcurrentHashMap Y = new ConcurrentHashMap();
    public int X;

    static {
        a(1, 0, 0, 0);
        a(1, 0, 1, 0);
        a(1, 1, 0, 0);
        a(1, 1, 5, 0);
        a(2, 0, 0, 0);
        a(2, 1, 2, 0);
        a(2, 1, 5, 0);
        a(2, 1, 8, 0);
        a(2, 1, 9, 0);
        a(3, 0, 0, 0);
        a(3, 0, 1, 0);
        a(3, 1, 0, 0);
        a(3, 1, 1, 0);
        a(3, 2, 0, 0);
        a(4, 0, 0, 0);
        a(4, 0, 1, 0);
        a(4, 1, 0, 0);
        a(5, 0, 0, 0);
        a(5, 1, 0, 0);
        a(5, 2, 0, 0);
        a(6, 0, 0, 0);
        a(6, 1, 0, 0);
        a(6, 2, 0, 0);
        a(6, 3, 0, 0);
        a(7, 0, 0, 0);
        a(8, 0, 0, 0);
        a(9, 0, 0, 0);
        a(10, 0, 0, 0);
        a(11, 0, 0, 0);
        a(12, 0, 0, 0);
        a(12, 1, 0, 0);
        a(13, 0, 0, 0);
        a(14, 0, 0, 0);
        a(15, 0, 0, 0);
        a(15, 1, 0, 0);
        a(16, 0, 0, 0);
        a(77, 1, 0, 0);
        a(9, 0, 0, 0);
        a(9, 0, 0, 0);
        a(1, 0, 0, 0);
    }

    public static bv8 a(int i, int i2, int i3, int i4) {
        if (i < 0 || i > 255 || i2 < 0 || i2 > 255 || i3 < 0 || i3 > 255 || i4 < 0 || i4 > 255) {
            bt.q("Invalid version number: Version number may be negative or greater than 255");
            return null;
        }
        int i5 = (i << 24) | (i2 << 16) | (i3 << 8) | i4;
        Integer numValueOf = Integer.valueOf(i5);
        ConcurrentHashMap concurrentHashMap = Y;
        bv8 bv8Var = (bv8) concurrentHashMap.get(numValueOf);
        if (bv8Var == null) {
            bv8Var = new bv8();
            bv8Var.X = i5;
            bv8 bv8Var2 = (bv8) concurrentHashMap.putIfAbsent(numValueOf, bv8Var);
            if (bv8Var2 != null) {
                return bv8Var2;
            }
        }
        return bv8Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.X;
        int i2 = ((bv8) obj).X;
        int i3 = (i >>> 1) - (i2 >>> 1);
        return i3 != 0 ? i3 : (i & 1) - (i2 & 1);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.X;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(7);
        int i = this.X;
        sb.append((i >> 24) & 255);
        sb.append('.');
        sb.append((i >> 16) & 255);
        sb.append('.');
        sb.append((i >> 8) & 255);
        sb.append('.');
        sb.append(i & 255);
        return sb.toString();
    }
}
