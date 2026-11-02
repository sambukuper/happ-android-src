package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iy6 {
    public static final ey6 a = new ey6();
    public static final gp1 b = new gp1(1);
    public static final fy6 c = new fy6();

    public static kx4 a(kx4 kx4Var, ay6 ay6Var, sd5 sd5Var, boolean z, boolean z2, xz4 xz4Var) {
        return kx4Var.y(new dy6(ay6Var, sd5Var, z, z2, xz4Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(sy6 sy6Var, long j, s51 s51Var) {
        gy6 gy6Var;
        ba6 ba6Var;
        sy6 sy6Var2;
        if (s51Var instanceof gy6) {
            gy6Var = (gy6) s51Var;
            int i = gy6Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy6Var.i0 = i - Integer.MIN_VALUE;
            } else {
                gy6Var = new gy6(s51Var);
            }
        } else {
            gy6Var = new gy6(s51Var);
        }
        Object obj = gy6Var.h0;
        int i2 = gy6Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            ba6Var = new ba6();
            hy6 hy6Var = new hy6(sy6Var, j, ba6Var, null);
            gy6Var.f0 = sy6Var;
            gy6Var.g0 = ba6Var;
            gy6Var.i0 = 1;
            Object objG = sy6Var.g(f15.X, hy6Var, gy6Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            sy6Var2 = sy6Var;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba6 ba6Var2 = gy6Var.g0;
            sy6 sy6Var3 = gy6Var.f0;
            w39.n0(obj);
            ba6Var = ba6Var2;
            sy6Var2 = sy6Var3;
        }
        return new z85(sy6Var2.i(ba6Var.X));
    }
}
