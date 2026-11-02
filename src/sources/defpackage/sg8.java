package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sg8 implements hx1 {
    public final int a;
    public final int b;
    public final xx1 c;

    public sg8(int i, xx1 xx1Var, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? yx1.a : xx1Var);
    }

    @Override // defpackage.pk
    public final ju8 a(ug8 ug8Var) {
        return new cb0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sg8) {
            sg8 sg8Var = (sg8) obj;
            if (sg8Var.a == this.a && sg8Var.b == this.b && dh3.f(sg8Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.hx1, defpackage.pk
    public final lu8 a(ug8 ug8Var) {
        return new cb0(this.a, this.b, this.c);
    }

    public sg8(int i, int i2, xx1 xx1Var) {
        this.a = i;
        this.b = i2;
        this.c = xx1Var;
    }
}
