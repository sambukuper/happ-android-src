package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j66 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j66(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j66)) {
            return false;
        }
        j66 j66Var = (j66) obj;
        long j = j66Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, j66Var.b) && tk8.a(this.c, j66Var.c) && tk8.a(this.d, j66Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.d) + p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
