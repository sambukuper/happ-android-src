package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xk6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xk6(long j, long j2, long j3, long j4) {
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
        if (!(obj instanceof xk6)) {
            return false;
        }
        xk6 xk6Var = (xk6) obj;
        long j = xk6Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, xk6Var.b) && tk8.a(this.c, xk6Var.c) && tk8.a(this.d, xk6Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.d) + p61.g(p61.g(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
