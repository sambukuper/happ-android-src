package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ni4 extends li4 implements vu0 {
    public static final ni4 f0 = new ni4(1, 0);

    public ni4(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.vu0
    public final Comparable a() {
        return Long.valueOf(this.X);
    }

    @Override // defpackage.vu0
    public final Comparable b() {
        return Long.valueOf(this.Y);
    }

    @Override // defpackage.li4
    public final boolean equals(Object obj) {
        if (!(obj instanceof ni4)) {
            return false;
        }
        if (isEmpty() && ((ni4) obj).isEmpty()) {
            return true;
        }
        ni4 ni4Var = (ni4) obj;
        return this.X == ni4Var.X && this.Y == ni4Var.Y;
    }

    @Override // defpackage.li4
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.Y) + (Long.hashCode(this.X) * 31);
    }

    @Override // defpackage.li4, defpackage.vu0
    public final boolean isEmpty() {
        return this.X > this.Y;
    }

    @Override // defpackage.li4
    public final String toString() {
        return this.X + ".." + this.Y;
    }
}
