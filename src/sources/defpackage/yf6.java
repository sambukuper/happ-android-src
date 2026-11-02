package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yf6 {
    public y5 a;
    public p06 b;
    public String d;
    public ov2 e;
    public b86 g;
    public zf6 h;
    public zf6 i;
    public zf6 j;
    public long k;
    public long l;
    public wg m;
    public int c = -1;
    public ps f = new ps((byte) 1);

    public static void b(zf6 zf6Var, String str) {
        if (zf6Var != null) {
            if (zf6Var.i0 != null) {
                em7.c(str.concat(".body != null"));
                return;
            }
            if (zf6Var.j0 != null) {
                em7.c(str.concat(".networkResponse != null"));
            } else if (zf6Var.k0 != null) {
                em7.c(str.concat(".cacheResponse != null"));
            } else {
                if (zf6Var.l0 == null) {
                    return;
                }
                em7.c(str.concat(".priorResponse != null"));
            }
        }
    }

    public final zf6 a() {
        int i = this.c;
        if (i < 0) {
            kp5.p(this.c, "code < 0: ");
            return null;
        }
        y5 y5Var = this.a;
        if (y5Var == null) {
            bt.i("request == null");
            return null;
        }
        p06 p06Var = this.b;
        if (p06Var == null) {
            bt.i("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new zf6(y5Var, p06Var, str, i, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        bt.i("message == null");
        return null;
    }
}
