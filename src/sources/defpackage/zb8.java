package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb8 {
    public static final long a = hi5.G(16.0f, 8.0f);
    public static final float b = 200.0f;
    public static final float c = 320.0f;

    public static gc8 a(lp2 lp2Var, int i, int i2) {
        float f;
        if ((i2 & 2) != 0) {
            ig5 ig5Var = ec8.a;
            f = 4.0f;
        } else {
            f = 16.0f;
        }
        int iX0 = ((fi1) lp2Var.j(y01.h)).x0(f);
        boolean zD = lp2Var.d(iX0);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !lp2Var.d(1)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zD | z;
        Object objK = lp2Var.K();
        if (z2 || objK == zz0.a) {
            objK = new gc8(iX0);
            lp2Var.g0(objK);
        }
        return (gc8) objK;
    }
}
