package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kf3 extends if3 implements vu0 {
    public static final kf3 f0 = new kf3(1, 0, 1);

    @Override // defpackage.vu0
    public final Comparable a() {
        return Integer.valueOf(this.X);
    }

    @Override // defpackage.vu0
    public final Comparable b() {
        return Integer.valueOf(this.Y);
    }

    @Override // defpackage.if3
    public final boolean equals(Object obj) {
        if (!(obj instanceof kf3)) {
            return false;
        }
        if (isEmpty() && ((kf3) obj).isEmpty()) {
            return true;
        }
        kf3 kf3Var = (kf3) obj;
        return this.X == kf3Var.X && this.Y == kf3Var.Y;
    }

    @Override // defpackage.if3
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.X * 31) + this.Y;
    }

    @Override // defpackage.if3, defpackage.vu0
    public final boolean isEmpty() {
        return this.X > this.Y;
    }

    @Override // defpackage.if3
    public final String toString() {
        return this.X + ".." + this.Y;
    }
}
