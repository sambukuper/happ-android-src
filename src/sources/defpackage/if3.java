package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class if3 implements Iterable, qv3 {
    public final int X;
    public final int Y;
    public final int Z;

    public if3(int i, int i2, int i3) {
        if (i3 == 0) {
            bt.q("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            bt.q("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.X = i;
        this.Y = z51.B(i, i2, i3);
        this.Z = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof if3)) {
            return false;
        }
        if (isEmpty() && ((if3) obj).isEmpty()) {
            return true;
        }
        if3 if3Var = (if3) obj;
        return this.X == if3Var.X && this.Y == if3Var.Y && this.Z == if3Var.Z;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.X * 31) + this.Y) * 31) + this.Z;
    }

    public boolean isEmpty() {
        int i = this.Y;
        int i2 = this.Z;
        int i3 = this.X;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jf3(this.X, this.Y, this.Z);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.Y;
        int i2 = this.Z;
        int i3 = this.X;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
