package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class or5 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public or5(boolean z, kz6 kz6Var, boolean z2, int i) {
        ox1 ox1Var = bg.a;
        int i2 = !z ? 262152 : 262144;
        i2 = kz6Var == kz6.Y ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        boolean z3 = kz6Var == kz6.X;
        this.a = i2;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        or5 or5Var = (or5) obj;
        return this.a == or5Var.a && this.b == or5Var.b && this.c == or5Var.c && this.d == or5Var.d && this.e == or5Var.e && this.f == or5Var.f;
    }

    public final int hashCode() {
        return (pc6.f(pc6.f(pc6.f(pc6.f(pc6.f(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public or5(int i) {
        this((i & 1) == 0, kz6.X, true, 0);
    }

    public or5(boolean z) {
        this(z, kz6.X, true, 0);
    }
}
