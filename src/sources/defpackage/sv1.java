package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface sv1 extends fi1 {
    static void D(sv1 sv1Var, je jeVar, long j, long j2, float f, g60 g60Var, int i, int i2) {
        sv1Var.w0(jeVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, g60Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void E0(sv1 sv1Var, d90 d90Var, long j, long j2, float f, tv1 tv1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        sv1Var.Y(d90Var, j3, (i2 & 4) != 0 ? X(sv1Var.e(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? ea2.a : tv1Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void U(sv1 sv1Var, je jeVar, long j, float f, g60 g60Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        sv1Var.v(jeVar, j2, f2, g60Var, i);
    }

    static long X(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void d0(sv1 sv1Var, lf lfVar, d90 d90Var, float f, om7 om7Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        tv1 tv1Var = om7Var;
        if ((i & 8) != 0) {
            tv1Var = ea2.a;
        }
        sv1Var.i(lfVar, d90Var, f2, tv1Var, (i & 32) != 0 ? 3 : 0);
    }

    static void k0(sv1 sv1Var, long j, long j2, long j3, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        sv1Var.H0(j, j4, (i & 4) != 0 ? X(sv1Var.e(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 64) != 0 ? 3 : 0);
    }

    static void o0(sv1 sv1Var, long j, float f, long j2, tv1 tv1Var, int i) {
        if ((i & 4) != 0) {
            j2 = sv1Var.A0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            tv1Var = ea2.a;
        }
        sv1Var.L(j, f, j3, tv1Var);
    }

    static void p0(p34 p34Var, d90 d90Var, long j, long j2, long j3, tv1 tv1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        p34Var.c(d90Var, j4, (i & 4) != 0 ? X(p34Var.X.e(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? ea2.a : tv1Var);
    }

    static void v0(sv1 sv1Var, long j, long j2, long j3, float f, int i, int i2) {
        sv1Var.G(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i);
    }

    default long A0() {
        return vj8.G(n0().p());
    }

    void C0(lf lfVar, long j);

    void G(long j, long j2, long j3, float f, int i);

    void H0(long j, long j2, long j3, float f, int i);

    void L(long j, float f, long j2, tv1 tv1Var);

    void L0(long j, float f, float f2, long j2, long j3, tv1 tv1Var);

    void Y(d90 d90Var, long j, long j2, float f, tv1 tv1Var, int i);

    default long e() {
        return n0().p();
    }

    void f0(long j, long j2, long j3, long j4);

    z24 getLayoutDirection();

    void i(lf lfVar, d90 d90Var, float f, tv1 tv1Var, int i);

    lr n0();

    void v(je jeVar, long j, float f, g60 g60Var, int i);

    void w0(je jeVar, long j, long j2, long j3, float f, g60 g60Var, int i);
}
