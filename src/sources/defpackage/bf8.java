package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf8 {
    public int a;
    public int b;
    public int c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(bf8.class)) {
            bf8 bf8Var = (bf8) obj;
            if (this.a == bf8Var.a && this.b == bf8Var.b && this.c == bf8Var.c && this.d == bf8Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iC = df8.c(df8.c(df8.c(-2128831035, i & 255), (i >> 8) & 255), i >> 16);
        int i2 = this.b;
        return df8.c(df8.d(df8.c(df8.c(df8.c(iC, i2 & 255), (i2 >> 8) & 255), i2 >> 16), this.c), this.d ? 1 : 0);
    }
}
