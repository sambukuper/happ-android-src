package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe7 implements o01, Iterable, qv3 {
    public final yb7 X;
    public final int Y;
    public final sc6 Z;

    public oe7(yb7 yb7Var, int i, np2 np2Var, sc6 sc6Var) {
        this.X = yb7Var;
        this.Y = i;
        this.Z = sc6Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oe7)) {
            return false;
        }
        oe7 oe7Var = (oe7) obj;
        return oe7Var.Y == this.Y && oe7Var.X == this.X && oe7Var.Z.equals(this.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((this.X.hashCode() + (this.Y * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ne7(this.X, this.Y, null, this.Z);
    }
}
