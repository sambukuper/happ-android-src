package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jv1 {
    public static final iv1 a = new iv1(3, null, (byte) 0);
    public static final iv1 b = new iv1(3, null, (byte) 1);

    public static kx4 a(kx4 kx4Var, lv1 lv1Var, sd5 sd5Var, boolean z, xz4 xz4Var, boolean z2, sn2 sn2Var, boolean z3, int i) {
        if ((i & 8) != 0) {
            xz4Var = null;
        }
        return kx4Var.y(new gv1(lv1Var, sd5Var, z, xz4Var, z2, a, sn2Var, (i & 128) != 0 ? false : z3));
    }

    public static final long b(long j) {
        return a38.a(Float.isNaN(tu8.b(j)) ? 0.0f : tu8.b(j), Float.isNaN(tu8.c(j)) ? 0.0f : tu8.c(j));
    }
}
