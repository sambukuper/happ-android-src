package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 implements vu0, Iterable, qv3 {
    public final char X;
    public final char Y;

    static {
        new bq0((char) 1, (char) 0);
    }

    public bq0(char c, char c2) {
        this.X = c;
        this.Y = (char) z51.B(c, c2, 1);
    }

    @Override // defpackage.vu0
    public final Comparable a() {
        return Character.valueOf(this.X);
    }

    @Override // defpackage.vu0
    public final Comparable b() {
        return Character.valueOf(this.Y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bq0)) {
            return false;
        }
        if (isEmpty() && ((bq0) obj).isEmpty()) {
            return true;
        }
        bq0 bq0Var = (bq0) obj;
        return this.X == bq0Var.X && this.Y == bq0Var.Y;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.X * 31) + this.Y;
    }

    @Override // defpackage.vu0
    public final boolean isEmpty() {
        return this.X > this.Y;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aq0(this.X, this.Y);
    }

    public final String toString() {
        return this.X + ".." + this.Y;
    }
}
