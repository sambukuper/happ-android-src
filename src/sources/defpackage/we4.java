package defpackage;

import io.sentry.c2;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class we4 {
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = iu.a;
        X = unsafe.objectFieldOffset(we4.class.getDeclaredField("_next$volatile"));
        Y = unsafe.objectFieldOffset(we4.class.getDeclaredField("_prev$volatile"));
        Z = unsafe.objectFieldOffset(we4.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(we4 we4Var, int i) {
        we4 we4Var2;
        we4 we4Var3;
        while (true) {
            we4 we4VarH = this.h();
            if (we4VarH instanceof hb4) {
                return (((hb4) we4VarH).f0 & i) == 0 && we4VarH.c(we4Var, i);
            }
            Unsafe unsafe = iu.a;
            unsafe.putObjectVolatile(we4Var, Y, we4VarH);
            long j = X;
            unsafe.putObjectVolatile(we4Var, j, this);
            while (true) {
                Unsafe unsafe2 = iu.a;
                we4Var2 = this;
                we4Var3 = we4Var;
                if (unsafe2.compareAndSwapObject(we4VarH, X, we4Var2, we4Var3)) {
                    we4Var3.e(we4Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(we4VarH, j) != we4Var2) {
                    break;
                }
                this = we4Var2;
                we4Var = we4Var3;
            }
            this = we4Var2;
            we4Var = we4Var3;
        }
    }

    public final we4 d() {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = Y;
            we4 we4Var = (we4) unsafe.getObjectVolatile(this, j);
            we4 we4Var2 = null;
            we4 we4Var3 = we4Var;
            while (true) {
                if (we4Var3 == null) {
                    c2.m();
                    return null;
                }
                Unsafe unsafe2 = iu.a;
                long j2 = X;
                Object objectVolatile = unsafe2.getObjectVolatile(we4Var3, j2);
                if (objectVolatile == this) {
                    if (we4Var != we4Var3) {
                        while (true) {
                            Unsafe unsafe3 = iu.a;
                            we4 we4Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(we4Var4, Y, we4Var, we4Var3);
                            we4 we4Var5 = we4Var;
                            this = we4Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != we4Var5) {
                                    break;
                                }
                                this = this;
                                we4Var = we4Var5;
                            }
                        }
                    }
                    return we4Var3;
                }
                we4Var = we4Var;
                this = this;
                if (this.i()) {
                    return null;
                }
                if (!(objectVolatile instanceof ud6)) {
                    objectVolatile.getClass();
                    we4Var2 = we4Var3;
                    we4Var3 = (we4) objectVolatile;
                } else if (we4Var2 != null) {
                    we4 we4Var6 = ((ud6) objectVolatile).a;
                    while (true) {
                        we4 we4Var7 = we4Var3;
                        Unsafe unsafe4 = iu.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(we4Var2, X, we4Var7, we4Var6);
                        we4Var3 = we4Var7;
                        if (zCompareAndSwapObject2) {
                            we4Var3 = we4Var2;
                            we4Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(we4Var2, j2) != we4Var3) {
                            break;
                        }
                    }
                } else {
                    if (we4Var3 == null) {
                        c2.m();
                        return null;
                    }
                    we4Var3 = (we4) unsafe2.getObjectVolatile(we4Var3, j);
                }
            }
            this = this;
        }
    }

    public final void e(we4 we4Var) {
        we4 we4Var2;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = Y;
            we4 we4Var3 = (we4) unsafe.getObjectVolatile(we4Var, j);
            if (this.f() != we4Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = iu.a;
                we4Var2 = this;
                we4 we4Var4 = we4Var;
                if (unsafe2.compareAndSwapObject(we4Var4, Y, we4Var3, we4Var2)) {
                    if (we4Var2.i()) {
                        we4Var4.d();
                        return;
                    }
                    return;
                } else {
                    we4Var = we4Var4;
                    if (unsafe2.getObjectVolatile(we4Var4, j) != we4Var3) {
                        break;
                    } else {
                        this = we4Var2;
                    }
                }
            }
            this = we4Var2;
        }
    }

    public final Object f() {
        return iu.a.getObjectVolatile(this, X);
    }

    public final we4 g() {
        Object objF = f();
        ud6 ud6Var = objF instanceof ud6 ? (ud6) objF : null;
        if (ud6Var != null) {
            return ud6Var.a;
        }
        objF.getClass();
        return (we4) objF;
    }

    public final we4 h() {
        we4 we4VarD = d();
        if (we4VarD != null) {
            return we4VarD;
        }
        Unsafe unsafe = iu.a;
        long j = Y;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            we4 we4Var = (we4) objectVolatile;
            if (!we4Var.i()) {
                return we4Var;
            }
            objectVolatile = iu.a.getObjectVolatile(we4Var, j);
        }
    }

    public boolean i() {
        return f() instanceof ud6;
    }

    public String toString() {
        return new a74(this, zc1.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 1) + '@' + zc1.L(this);
    }
}
