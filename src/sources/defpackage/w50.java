package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w50 implements Cloneable {
    public int X;
    public int Y;
    public int Z;
    public int[] f0;

    public w50(int i, int i2) {
        if (i < 1 || i2 < 1) {
            bt.q("Both dimensions must be greater than 0");
            throw null;
        }
        this.X = i;
        this.Y = i2;
        int i3 = (i + 31) / 32;
        this.Z = i3;
        this.f0 = new int[i3 * i2];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.Z);
        int[] iArr = this.f0;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean b(int i, int i2) {
        return ((this.f0[(i / 32) + (i2 * this.Z)] >>> (i & 31)) & 1) != 0;
    }

    public final void c(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            bt.q("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            bt.q("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.Y || i5 > this.X) {
            bt.q("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.Z * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f0;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final Object clone() {
        int i = this.X;
        int i2 = this.Y;
        int i3 = this.Z;
        int[] iArr = (int[]) this.f0.clone();
        w50 w50Var = new w50();
        w50Var.X = i;
        w50Var.Y = i2;
        w50Var.Z = i3;
        w50Var.f0 = iArr;
        return w50Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return this.X == w50Var.X && this.Y == w50Var.Y && this.Z == w50Var.Z && Arrays.equals(this.f0, w50Var.f0);
    }

    public final int hashCode() {
        int i = this.X;
        return Arrays.hashCode(this.f0) + (((((((i * 31) + i) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final String toString() {
        int i = this.Y;
        int i2 = this.X;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(b(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
