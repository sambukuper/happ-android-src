package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fe3 {
    public static final fe3 e = new fe3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fe3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static fe3 a(fe3 fe3Var, fe3 fe3Var2) {
        return c(Math.max(fe3Var.a, fe3Var2.a), Math.max(fe3Var.b, fe3Var2.b), Math.max(fe3Var.c, fe3Var2.c), Math.max(fe3Var.d, fe3Var2.d));
    }

    public static fe3 b(fe3 fe3Var, fe3 fe3Var2) {
        return c(Math.min(fe3Var.a, fe3Var2.a), Math.min(fe3Var.b, fe3Var2.b), Math.min(fe3Var.c, fe3Var2.c), Math.min(fe3Var.d, fe3Var2.d));
    }

    public static fe3 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new fe3(i, i2, i3, i4);
    }

    public static fe3 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return wa.y(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fe3.class != obj.getClass()) {
            return false;
        }
        fe3 fe3Var = (fe3) obj;
        return this.d == fe3Var.d && this.a == fe3Var.a && this.c == fe3Var.c && this.b == fe3Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return pc6.r(sb, this.d, '}');
    }
}
