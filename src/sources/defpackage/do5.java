package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class do5 implements fi1 {
    public boolean X;

    public static void f(do5 do5Var, eo5 eo5Var, int i, int i2) {
        do5Var.d(eo5Var);
        eo5Var.S(hf3.c((((long) i2) & 4294967295L) | (((long) i) << 32), eo5Var.g0), 0.0f, null);
    }

    public static void g(do5 do5Var, eo5 eo5Var, long j) {
        do5Var.d(eo5Var);
        eo5Var.S(hf3.c(j, eo5Var.g0), 0.0f, null);
    }

    public static void h(do5 do5Var, eo5 eo5Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (do5Var.b() == z24.X || do5Var.c() == 0) {
            do5Var.d(eo5Var);
            eo5Var.S(hf3.c(j, eo5Var.g0), 0.0f, null);
        } else {
            int iC = (do5Var.c() - eo5Var.X) - ((int) (j >> 32));
            do5Var.d(eo5Var);
            eo5Var.S(hf3.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), eo5Var.g0), 0.0f, null);
        }
    }

    public static void j(do5 do5Var, eo5 eo5Var, int i, int i2) {
        dx4 dx4Var = fo5.a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (do5Var.b() == z24.X || do5Var.c() == 0) {
            do5Var.d(eo5Var);
            eo5Var.S(hf3.c(j, eo5Var.g0), 0.0f, dx4Var);
        } else {
            int iC = (do5Var.c() - eo5Var.X) - ((int) (j >> 32));
            do5Var.d(eo5Var);
            eo5Var.S(hf3.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), eo5Var.g0), 0.0f, dx4Var);
        }
    }

    public static void k(do5 do5Var, eo5 eo5Var, int i, int i2, gn2 gn2Var, int i3) {
        if ((i3 & 8) != 0) {
            gn2Var = fo5.a;
        }
        do5Var.d(eo5Var);
        eo5Var.S(hf3.c((((long) i2) & 4294967295L) | (((long) i) << 32), eo5Var.g0), 0.0f, gn2Var);
    }

    public float a(w03 w03Var) {
        return Float.NaN;
    }

    public abstract z24 b();

    public abstract int c();

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(eo5 eo5Var) {
        if (eo5Var instanceof jy4) {
            ((jy4) eo5Var).z(this.X);
        }
    }
}
