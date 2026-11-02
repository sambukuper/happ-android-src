package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kc8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public kc8(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kc8)) {
            return false;
        }
        kc8 kc8Var = (kc8) obj;
        long j = kc8Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, kc8Var.b) && tk8.a(this.c, kc8Var.c) && tk8.a(this.d, kc8Var.d) && tk8.a(this.e, kc8Var.e) && tk8.a(this.f, kc8Var.f);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.f) + p61.g(p61.g(p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
