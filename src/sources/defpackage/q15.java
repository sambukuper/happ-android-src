package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q15 extends j17 implements o15 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k0 = AtomicReferenceFieldUpdater.newUpdater(q15.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long l0 = iu.a.objectFieldOffset(q15.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public q15(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : r15.a;
    }

    public final boolean d() {
        q15 q15Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = j17.h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.X) {
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    long j2 = j17.h0;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.X;
                    if (intVolatile2 <= i) {
                        q15Var = this;
                        break;
                    }
                    q15 q15Var2 = this;
                    q15Var = q15Var2;
                    if (unsafe2.compareAndSwapInt(q15Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = q15Var;
                }
            } else {
                q15Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(q15Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(q15Var, l0, (Object) null);
                    return true;
                }
            }
            this = q15Var;
        }
    }

    @Override // defpackage.o15
    public final Object g(q51 q51Var) {
        boolean zD = d();
        dn8 dn8Var = dn8.a;
        if (!zD) {
            mm0 mm0VarT = u70.T(mb6.H(q51Var));
            try {
                p15 p15Var = new p15(this, mm0VarT);
                while (true) {
                    int andDecrement = j17.g0.getAndDecrement(this);
                    if (andDecrement <= this.X) {
                        if (andDecrement > 0) {
                            p15Var.y(dn8Var, this.Y);
                            break;
                        }
                        if (b(p15Var)) {
                            break;
                        }
                    }
                }
                Object objQ = mm0VarT.q();
                c71 c71Var = c71.X;
                if (objQ != c71Var) {
                    objQ = dn8Var;
                }
                if (objQ == c71Var) {
                    return objQ;
                }
            } catch (Throwable th) {
                mm0VarT.C();
                throw th;
            }
        }
        return dn8Var;
    }

    @Override // defpackage.o15
    public final boolean k() {
        return Math.max(iu.a.getIntVolatile(this, j17.h0), 0) == 0;
    }

    @Override // defpackage.o15
    public final void m(Object obj) {
        while (this.k()) {
            Unsafe unsafe = iu.a;
            long j = l0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            z31 z31Var = r15.a;
            if (objectVolatile != z31Var) {
                if (objectVolatile != obj && obj != null) {
                    xw3.u("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    q15 q15Var = this;
                    if (iu.a.compareAndSwapObject(q15Var, l0, objectVolatile, z31Var)) {
                        q15Var.c();
                        return;
                    } else {
                        if (iu.a.getObjectVolatile(q15Var, j) != objectVolatile) {
                            this = q15Var;
                            break;
                        }
                        this = q15Var;
                    }
                }
            }
        }
        bt.i("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + zc1.L(this) + "[isLocked=" + k() + ",owner=" + iu.a.getObjectVolatile(this, l0) + ']';
    }
}
