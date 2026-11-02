package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cd1 implements Comparable {
    public final int X;
    public final int Y;

    public cd1(int i, int i2) {
        this.X = i;
        this.Y = i2;
        if (i2 >= 0) {
            return;
        }
        em7.c(pc6.j(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = yn0.d;
        int i2 = this.X;
        int i3 = this.Y;
        if (i == i3) {
            return i2;
        }
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cd1 cd1Var = (cd1) obj;
        cd1Var.getClass();
        int iMax = Math.max(this.Y, cd1Var.Y);
        return dh3.k(a(iMax), cd1Var.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        int iMax = Math.max(this.Y, cd1Var.Y);
        return dh3.k(a(iMax), cd1Var.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = yn0.d[this.Y];
        int i2 = this.X;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(fm7.x0("1", String.valueOf((i2 % i) + i)));
        return sb.toString();
    }
}
