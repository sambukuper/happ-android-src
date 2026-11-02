package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wd2 implements Comparable {
    public int X;
    public int Y;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wd2 wd2Var = (wd2) obj;
        int i = this.Y;
        int i2 = wd2Var.Y;
        return i != i2 ? i - i2 : this.X - wd2Var.X;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.Y);
        sb.append(", index=");
        return pc6.r(sb, this.X, '}');
    }
}
