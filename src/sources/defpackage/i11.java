package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i11 {
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ int Z = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = iu.a;
        X = unsafe.objectFieldOffset(i11.class.getDeclaredField("_next$volatile"));
        Y = unsafe.objectFieldOffset(i11.class.getDeclaredField("_prev$volatile"));
    }

    public i11(nz6 nz6Var) {
        this._prev$volatile = nz6Var;
    }

    public final void a() {
        iu.a.putObjectVolatile(this, Y, (Object) null);
    }

    public final i11 c() {
        Object objectVolatile = iu.a.getObjectVolatile(this, X);
        if (objectVolatile == h11.a) {
            return null;
        }
        return (i11) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        i11 i11Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = iu.a;
            long j = Y;
            i11 i11Var2 = (i11) unsafe2.getObjectVolatile(this, j);
            while (i11Var2 != null && i11Var2.d()) {
                i11Var2 = (i11) iu.a.getObjectVolatile(i11Var2, j);
            }
            i11 i11VarC = c();
            i11VarC.getClass();
            do {
                i11Var = i11VarC;
                if (!i11Var.d()) {
                    break;
                } else {
                    i11VarC = i11Var.c();
                }
            } while (i11VarC != null);
            while (true) {
                Object objectVolatile = iu.a.getObjectVolatile(i11Var, j);
                i11 i11Var3 = ((i11) objectVolatile) == null ? null : i11Var2;
                while (true) {
                    unsafe = iu.a;
                    if (unsafe.compareAndSwapObject(i11Var, Y, objectVolatile, i11Var3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(i11Var, j) != objectVolatile) {
                    }
                }
            }
            if (i11Var2 != null) {
                unsafe.putObjectVolatile(i11Var2, X, i11Var);
            }
            if (!i11Var.d() || i11Var.c() == null) {
                if (i11Var2 == null || !i11Var2.d()) {
                    return;
                }
            }
        }
    }
}
