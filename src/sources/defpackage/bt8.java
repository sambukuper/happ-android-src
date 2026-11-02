package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bt8 implements Comparable, Serializable {
    public static final bt8 Z = new bt8(0, 0);
    public final long X;
    public final long Y;

    public bt8(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bt8 bt8Var = (bt8) obj;
        bt8Var.getClass();
        long j = bt8Var.X;
        long j2 = this.X;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.Y ^ Long.MIN_VALUE, bt8Var.Y ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt8)) {
            return false;
        }
        bt8 bt8Var = (bt8) obj;
        return this.X == bt8Var.X && this.Y == bt8Var.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.X ^ this.Y);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        v18.a(this.X, bArr, 0, 0, 4);
        bArr[8] = 45;
        v18.a(this.X, bArr, 9, 4, 6);
        bArr[13] = 45;
        v18.a(this.X, bArr, 14, 6, 8);
        bArr[18] = 45;
        v18.a(this.Y, bArr, 19, 0, 2);
        bArr[23] = 45;
        v18.a(this.Y, bArr, 24, 2, 8);
        return new String(bArr, iq0.a);
    }
}
