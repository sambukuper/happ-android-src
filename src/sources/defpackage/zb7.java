package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zb7 implements o01, Iterable, qv3 {
    public final yb7 X;
    public final int Y;
    public final int Z;

    public zb7(yb7 yb7Var, int i, int i2) {
        this.X = yb7Var;
        this.Y = i;
        this.Z = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zb7)) {
            return false;
        }
        zb7 zb7Var = (zb7) obj;
        return zb7Var.Y == this.Y && zb7Var.Z == this.Z && zb7Var.X == this.X;
    }

    public final int hashCode() {
        return (this.X.hashCode() * 31) + this.Y;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        yb7 yb7Var = this.X;
        if (yb7Var.j0 != this.Z) {
            ac7.e();
        }
        int i = this.Y;
        yb7Var.h(i);
        return new qu2(yb7Var, i + 1, yb7Var.X[(i * 5) + 3] + i);
    }
}
