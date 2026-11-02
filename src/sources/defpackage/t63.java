package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t63 {
    public static final t63 o;
    public final s92 a;
    public final s61 b;
    public final s61 c;
    public final s61 d;
    public final kc0 e;
    public final kc0 f;
    public final kc0 g;
    public final gn2 h;
    public final gn2 i;
    public final gn2 j;
    public final ab7 k;
    public final pw6 l;
    public final tr5 m;
    public final s72 n;

    static {
        ve7 ve7Var = ve7.o0;
        s92 s92Var = s92.SYSTEM;
        nf1 nf1Var = tp1.a;
        ye1 ye1Var = ye1.Z;
        c86 c86Var = ab7.F;
        tr5 tr5Var = tr5.X;
        s72 s72Var = s72.b;
        b02 b02Var = b02.X;
        kc0 kc0Var = kc0.ENABLED;
        o = new t63(s92Var, b02Var, ye1Var, ye1Var, kc0Var, kc0Var, kc0Var, ve7Var, ve7Var, ve7Var, c86Var, pw6.Y, tr5Var, s72Var);
    }

    public t63(s92 s92Var, s61 s61Var, s61 s61Var2, s61 s61Var3, kc0 kc0Var, kc0 kc0Var2, kc0 kc0Var3, gn2 gn2Var, gn2 gn2Var2, gn2 gn2Var3, ab7 ab7Var, pw6 pw6Var, tr5 tr5Var, s72 s72Var) {
        this.a = s92Var;
        this.b = s61Var;
        this.c = s61Var2;
        this.d = s61Var3;
        this.e = kc0Var;
        this.f = kc0Var2;
        this.g = kc0Var3;
        this.h = gn2Var;
        this.i = gn2Var2;
        this.j = gn2Var3;
        this.k = ab7Var;
        this.l = pw6Var;
        this.m = tr5Var;
        this.n = s72Var;
    }

    public static t63 a(t63 t63Var, s72 s72Var, int i) {
        s92 s92Var = t63Var.a;
        s61 s61Var = t63Var.b;
        s61 s61Var2 = t63Var.c;
        s61 s61Var3 = t63Var.d;
        int i2 = i & 16;
        kc0 kc0Var = kc0.ENABLED;
        kc0 kc0Var2 = i2 != 0 ? t63Var.e : kc0Var;
        kc0 kc0Var3 = (i & 32) != 0 ? t63Var.f : kc0Var;
        if ((i & 64) != 0) {
            kc0Var = t63Var.g;
        }
        kc0 kc0Var4 = kc0Var2;
        kc0 kc0Var5 = kc0Var3;
        gn2 gn2Var = t63Var.h;
        gn2 gn2Var2 = t63Var.i;
        gn2 gn2Var3 = t63Var.j;
        ab7 ab7Var = t63Var.k;
        pw6 pw6Var = t63Var.l;
        tr5 tr5Var = t63Var.m;
        s72 s72Var2 = (i & 8192) != 0 ? t63Var.n : s72Var;
        t63Var.getClass();
        return new t63(s92Var, s61Var, s61Var2, s61Var3, kc0Var4, kc0Var5, kc0Var, gn2Var, gn2Var2, gn2Var3, ab7Var, pw6Var, tr5Var, s72Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        return dh3.f(this.a, t63Var.a) && dh3.f(this.b, t63Var.b) && dh3.f(this.c, t63Var.c) && dh3.f(this.d, t63Var.d) && this.e == t63Var.e && this.f == t63Var.f && this.g == t63Var.g && dh3.f(this.h, t63Var.h) && dh3.f(this.i, t63Var.i) && dh3.f(this.j, t63Var.j) && dh3.f(this.k, t63Var.k) && this.l == t63Var.l && this.m == t63Var.m && dh3.f(this.n, t63Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
