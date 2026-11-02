package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay7 {
    public static final ox1 a = new ox1(new mq7((byte) 18), (byte) 0);

    public static final void a(kx4 kx4Var, x67 x67Var, long j, long j2, float f, float f2, zy0 zy0Var, lp2 lp2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kx4Var = hx4.X;
        }
        kx4 kx4Var2 = kx4Var;
        if ((i2 & 2) != 0) {
            x67Var = u70.e;
        }
        x67 x67Var2 = x67Var;
        long jA = (i2 & 8) != 0 ? kw0.a(j, lp2Var) : j2;
        float f3 = (i2 & 16) != 0 ? 0.0f : f;
        float f4 = (i2 & 32) != 0 ? 0.0f : f2;
        ox1 ox1Var = a;
        float f5 = ((kt1) lp2Var.j(ox1Var)).X + f3;
        mb6.b(new t06[]{j41.a.a(new dw0(jA)), ox1Var.a(new kt1(f5))}, jm4.U(421772006, new zx7(kx4Var2, x67Var2, j, f5, null, f4, zy0Var), lp2Var), lp2Var, 56);
    }
}
