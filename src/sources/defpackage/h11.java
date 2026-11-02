package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h11 {
    public static final z31 a = new z31("CLOSED", (byte) 3);

    public static final Object a(nz6 nz6Var, long j, rn2 rn2Var) {
        Unsafe unsafe;
        long j2;
        while (true) {
            nz6 nz6Var2 = nz6Var;
            while (true) {
                if (nz6Var2.f0 >= j && !nz6Var2.d()) {
                    return nz6Var2;
                }
                Object objectVolatile = iu.a.getObjectVolatile(nz6Var2, i11.X);
                z31 z31Var = a;
                if (objectVolatile == z31Var) {
                    return z31Var;
                }
                nz6Var = (nz6) ((i11) objectVolatile);
                if (nz6Var != null) {
                    break;
                }
                nz6 nz6Var3 = (nz6) rn2Var.K(Long.valueOf(nz6Var2.f0 + 1), nz6Var2);
                do {
                    unsafe = iu.a;
                    j2 = i11.X;
                    if (unsafe.compareAndSwapObject(nz6Var2, j2, (Object) null, nz6Var3)) {
                        if (nz6Var2.d()) {
                            nz6Var2.e();
                        }
                        nz6Var2 = nz6Var3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(nz6Var2, j2) == null);
            }
        }
    }
}
