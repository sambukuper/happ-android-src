package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv5 extends e1 implements jp0, n17 {
    public final x90 g0;

    public kv5(s61 s61Var, x90 x90Var) {
        super(s61Var, true);
        this.g0 = x90Var;
    }

    @Override // defpackage.n17
    public final Object a(q51 q51Var, Object obj) {
        return this.g0.a(q51Var, obj);
    }

    @Override // defpackage.n17
    public final Object b(Object obj) {
        return this.g0.b(obj);
    }

    @Override // defpackage.jp0
    public final q90 iterator() {
        x90 x90Var = this.g0;
        x90Var.getClass();
        return new q90(x90Var);
    }

    @Override // defpackage.rm3
    public final void l(Throwable th) {
        CancellationException cancellationException = (CancellationException) th;
        this.g0.e(cancellationException, true);
        i(cancellationException);
    }

    @Override // defpackage.e1
    public final void l0(Throwable th, boolean z) {
        if (this.g0.e(th, false) || z) {
            return;
        }
        vr3.F(this.f0, th);
    }

    @Override // defpackage.rm3, defpackage.bm3, defpackage.jp0
    public final void m(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new cm3(v(), null, this);
        }
        l(cancellationException);
    }

    @Override // defpackage.e1
    public final void m0(Object obj) {
        this.g0.d(null);
    }

    @Override // defpackage.jp0
    public final yr6 n() {
        return this.g0.n();
    }

    @Override // defpackage.jp0
    public final yr6 o() {
        return this.g0.o();
    }

    public final void o0(f0 f0Var) throws InvocationTargetException {
        Unsafe unsafe;
        Unsafe unsafe2;
        x90 x90Var = this.g0;
        x90Var.getClass();
        long j = x90.o0;
        do {
            unsafe = iu.a;
            if (unsafe.compareAndSwapObject(x90Var, x90.o0, (Object) null, f0Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(x90Var, j) == null);
        while (true) {
            Object objectVolatile = iu.a.getObjectVolatile(x90Var, j);
            z31 z31Var = z90.q;
            if (objectVolatile != z31Var) {
                if (objectVolatile == z90.r) {
                    bt.i("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    b61.o(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            z31 z31Var2 = z90.r;
            do {
                unsafe2 = iu.a;
                if (unsafe2.compareAndSwapObject(x90Var, x90.o0, z31Var, z31Var2)) {
                    f0Var.B(x90Var.l());
                    return;
                }
            } while (unsafe2.getObjectVolatile(x90Var, j) == z31Var);
        }
    }

    @Override // defpackage.jp0
    public final Object q() {
        return this.g0.q();
    }

    @Override // defpackage.jp0
    public final Object r(q51 q51Var) {
        return this.g0.r(q51Var);
    }

    @Override // defpackage.jp0
    public final Object s(yw0 yw0Var) {
        x90 x90Var = this.g0;
        x90Var.getClass();
        return x90.G(x90Var, yw0Var);
    }
}
