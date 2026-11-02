package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p77 {
    public final jm6 a;
    public final jm6 b;
    public final jm6 c;
    public final jm6 d;
    public final jm6 e;
    public final jm6 f;
    public final jm6 g;
    public final jm6 h;

    public p77() {
        jm6 jm6Var = c77.a;
        jm6 jm6Var2 = c77.b;
        jm6 jm6Var3 = c77.c;
        jm6 jm6Var4 = c77.d;
        jm6 jm6Var5 = c77.f;
        jm6 jm6Var6 = c77.e;
        jm6 jm6Var7 = c77.g;
        jm6 jm6Var8 = c77.h;
        this.a = jm6Var;
        this.b = jm6Var2;
        this.c = jm6Var3;
        this.d = jm6Var4;
        this.e = jm6Var5;
        this.f = jm6Var6;
        this.g = jm6Var7;
        this.h = jm6Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p77)) {
            return false;
        }
        p77 p77Var = (p77) obj;
        return dh3.f(this.a, p77Var.a) && dh3.f(this.b, p77Var.b) && dh3.f(this.c, p77Var.c) && dh3.f(this.d, p77Var.d) && dh3.f(this.e, p77Var.e) && dh3.f(this.f, p77Var.f) && dh3.f(this.g, p77Var.g) && dh3.f(this.h, p77Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
