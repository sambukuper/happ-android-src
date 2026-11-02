package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s43 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public s43(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s43)) {
            return false;
        }
        s43 s43Var = (s43) obj;
        long j = s43Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, s43Var.b) && tk8.a(this.c, s43Var.c) && tk8.a(this.d, s43Var.d);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.d) + p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
