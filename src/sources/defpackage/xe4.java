package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class xe4 {
    public static final /* synthetic */ long a = iu.a.objectFieldOffset(xe4.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ze4(8, false);

    public final boolean a(Runnable runnable) {
        xe4 xe4Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = a;
            ze4 ze4Var = (ze4) unsafe.getObjectVolatile(this, j);
            int iA = ze4Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ze4 ze4VarC = ze4Var.c();
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    xe4Var = this;
                    if (unsafe2.compareAndSwapObject(xe4Var, a, ze4Var, ze4VarC) || unsafe2.getObjectVolatile(xe4Var, j) != ze4Var) {
                        break;
                    }
                    this = xe4Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                xe4Var = this;
            }
            this = xe4Var;
        }
    }

    public final void b() {
        xe4 xe4Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = a;
            ze4 ze4Var = (ze4) unsafe.getObjectVolatile(this, j);
            if (ze4Var.b()) {
                return;
            }
            ze4 ze4VarC = ze4Var.c();
            while (true) {
                xe4Var = this;
                if (iu.a.compareAndSwapObject(xe4Var, a, ze4Var, ze4VarC) || iu.a.getObjectVolatile(xe4Var, j) != ze4Var) {
                    break;
                } else {
                    this = xe4Var;
                }
            }
            this = xe4Var;
        }
    }

    public final int c() {
        ze4 ze4Var = (ze4) iu.a.getObjectVolatile(this, a);
        ze4Var.getClass();
        long longVolatile = iu.a.getLongVolatile(ze4Var, ze4.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        xe4 xe4Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = a;
            ze4 ze4Var = (ze4) unsafe.getObjectVolatile(this, j);
            Object objD = ze4Var.d();
            if (objD != ze4.e) {
                return objD;
            }
            ze4 ze4VarC = ze4Var.c();
            while (true) {
                xe4Var = this;
                if (iu.a.compareAndSwapObject(xe4Var, a, ze4Var, ze4VarC) || iu.a.getObjectVolatile(xe4Var, j) != ze4Var) {
                    break;
                }
                this = xe4Var;
            }
            this = xe4Var;
        }
    }
}
