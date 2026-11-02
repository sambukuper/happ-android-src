package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jb7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public jb7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jb7)) {
            return false;
        }
        jb7 jb7Var = (jb7) obj;
        long j = jb7Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, jb7Var.b) && tk8.a(this.c, jb7Var.c) && tk8.a(this.d, jb7Var.d) && tk8.a(this.e, jb7Var.e) && tk8.a(this.f, jb7Var.f) && tk8.a(this.g, jb7Var.g) && tk8.a(this.h, jb7Var.h) && tk8.a(this.i, jb7Var.i) && tk8.a(this.j, jb7Var.j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.j) + p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }
}
