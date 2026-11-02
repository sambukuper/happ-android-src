package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class li4 implements Iterable, qv3 {
    public final long X;
    public final long Y;
    public final long Z;

    public li4(long j, long j2, long j3) {
        if (j3 == 0) {
            bt.q("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            bt.q("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.X = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                bt.q("Step is zero.");
                throw null;
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.Y = j2;
        this.Z = j3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof li4)) {
            return false;
        }
        if (isEmpty() && ((li4) obj).isEmpty()) {
            return true;
        }
        li4 li4Var = (li4) obj;
        return this.X == li4Var.X && this.Y == li4Var.Y && this.Z == li4Var.Z;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.Z) + p61.g(Long.hashCode(this.X) * 31, this.Y, 31);
    }

    public boolean isEmpty() {
        long j = this.Z;
        long j2 = this.Y;
        long j3 = this.X;
        if (j > 0) {
            return j3 > j2;
        }
        return j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mi4(this.X, this.Y, this.Z);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.Z;
        long j2 = this.Y;
        long j3 = this.X;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
