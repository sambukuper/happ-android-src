package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g73 {
    public static int k;
    public static final k42 l = new k42();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final fu8 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public g73(String str, float f, float f2, float f3, float f4, fu8 fu8Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = fu8Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g73)) {
            return false;
        }
        g73 g73Var = (g73) obj;
        if (!dh3.f(this.a, g73Var.a) || !kt1.b(this.b, g73Var.b) || !kt1.b(this.c, g73Var.c) || this.d != g73Var.d || this.e != g73Var.e || !this.f.equals(g73Var.f)) {
            return false;
        }
        long j = g73Var.g;
        int i = dw0.h;
        return tk8.a(this.g, j) && this.h == g73Var.h && this.i == g73Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + pc6.d(pc6.d(pc6.d(pc6.d(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = dw0.h;
        return Boolean.hashCode(this.i) + oi0.e(this.h, p61.g(iHashCode, this.g, 31), 31);
    }
}
