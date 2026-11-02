package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu6 implements q51, d71 {
    public static final /* synthetic */ long Y = iu.a.objectFieldOffset(tu6.class.getDeclaredField("result"));
    public final q51 X;
    private volatile Object result;

    public tu6(q51 q51Var, Object obj) {
        this.X = q51Var;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        c71 c71Var = c71.Y;
        if (obj == c71Var) {
            c71 c71Var2 = c71.X;
            while (true) {
                tu6 tu6Var = this;
                if (iu.a.compareAndSwapObject(tu6Var, Y, c71Var, c71Var2)) {
                    return c71.X;
                }
                if (iu.a.getObjectVolatile(tu6Var, Y) != c71Var) {
                    obj = tu6Var.result;
                    break;
                }
                this = tu6Var;
            }
        }
        if (obj == c71.Z) {
            return c71.X;
        }
        if (obj instanceof rj6) {
            throw ((rj6) obj).X;
        }
        return obj;
    }

    @Override // defpackage.d71
    public final d71 c() {
        q51 q51Var = this.X;
        if (q51Var instanceof d71) {
            return (d71) q51Var;
        }
        return null;
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        tu6 tu6Var;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj2 = this.result;
            c71 c71Var = c71.Y;
            if (obj2 == c71Var) {
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    long j2 = Y;
                    tu6Var = this;
                    if (unsafe2.compareAndSwapObject(tu6Var, j2, c71Var, obj)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(tu6Var, j2) != c71Var) {
                        break;
                    } else {
                        this = tu6Var;
                    }
                }
            } else {
                tu6Var = this;
                c71 c71Var2 = c71.X;
                if (obj2 != c71Var2) {
                    bt.i("Already resumed");
                    return;
                }
                c71 c71Var3 = c71.Z;
                do {
                    unsafe = iu.a;
                    j = Y;
                    if (unsafe.compareAndSwapObject(tu6Var, j, c71Var2, c71Var3)) {
                        tu6Var.X.f(obj);
                        return;
                    }
                } while (unsafe.getObjectVolatile(tu6Var, j) == c71Var2);
            }
            this = tu6Var;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.X;
    }

    @Override // defpackage.q51
    public final s61 w() {
        return this.X.w();
    }
}
