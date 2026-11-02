package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class mm0 extends qp1 implements lm0, d71, vz8 {
    public static final /* synthetic */ long h0;
    public static final /* synthetic */ long i0;
    public static final /* synthetic */ long j0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final q51 f0;
    public final s61 g0;

    static {
        Unsafe unsafe = iu.a;
        h0 = unsafe.objectFieldOffset(mm0.class.getDeclaredField("_decisionAndIndex$volatile"));
        j0 = unsafe.objectFieldOffset(mm0.class.getDeclaredField("_state$volatile"));
        i0 = unsafe.objectFieldOffset(mm0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public mm0(int i, q51 q51Var) {
        super(i);
        this.f0 = q51Var;
        this.g0 = q51Var.w();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = o5.X;
    }

    public static void A(b65 b65Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + b65Var + ", already has " + obj).toString());
    }

    public static Object G(b65 b65Var, Object obj, int i, sn2 sn2Var) {
        if (obj instanceof xx0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (sn2Var != null || (b65Var instanceof em0)) {
            return new vx0(obj, b65Var instanceof em0 ? (em0) b65Var : null, sn2Var, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        mm0 mm0Var;
        q51 q51Var = this.f0;
        Throwable th = null;
        np1 np1Var = q51Var instanceof np1 ? (np1) q51Var : null;
        if (np1Var != null) {
            long j = np1.j0;
            loop0: while (true) {
                Object objectVolatile = iu.a.getObjectVolatile(np1Var, j);
                z31 z31Var = op1.b;
                if (objectVolatile == z31Var) {
                    while (true) {
                        Unsafe unsafe = iu.a;
                        mm0 mm0Var2 = this;
                        mm0Var = mm0Var2;
                        if (unsafe.compareAndSwapObject(np1Var, np1.j0, z31Var, mm0Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(np1Var, j) != z31Var) {
                            break;
                        } else {
                            this = mm0Var;
                        }
                    }
                    this = mm0Var;
                } else {
                    mm0Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        b61.o(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = iu.a;
                        if (unsafe2.compareAndSwapObject(np1Var, np1.j0, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(np1Var, j) != objectVolatile) {
                            bt.q("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            mm0Var.n();
            mm0Var.z(th);
        }
    }

    public final void D(Object obj, int i, sn2 sn2Var) {
        mm0 mm0Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = j0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b65)) {
                mm0 mm0Var2 = this;
                if (objectVolatile instanceof qm0) {
                    qm0 qm0Var = (qm0) objectVolatile;
                    if (unsafe.compareAndSwapInt(qm0Var, qm0.c, 0, 1)) {
                        if (sn2Var != null) {
                            mm0Var2.l(sn2Var, qm0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                b61.o(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objG = G((b65) objectVolatile, obj, i, sn2Var);
            while (true) {
                Unsafe unsafe2 = iu.a;
                mm0Var = this;
                if (unsafe2.compareAndSwapObject(mm0Var, j0, objectVolatile, objG)) {
                    if (!mm0Var.x()) {
                        mm0Var.n();
                    }
                    mm0Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(mm0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = mm0Var;
                }
            }
            this = mm0Var;
        }
    }

    @Override // defpackage.lm0
    public final void E(Object obj) {
        o(this.Z);
    }

    public final void F(u61 u61Var) {
        q51 q51Var = this.f0;
        np1 np1Var = q51Var instanceof np1 ? (np1) q51Var : null;
        D(dn8.a, (np1Var != null ? np1Var.f0 : null) == u61Var ? 4 : this.Z, null);
    }

    public final z31 H(Object obj, sn2 sn2Var) {
        mm0 mm0Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = j0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b65)) {
                return null;
            }
            Object objG = G((b65) objectVolatile, obj, this.Z, sn2Var);
            while (true) {
                Unsafe unsafe2 = iu.a;
                mm0Var = this;
                if (unsafe2.compareAndSwapObject(mm0Var, j0, objectVolatile, objG)) {
                    boolean zX = mm0Var.x();
                    z31 z31Var = nm0.a;
                    if (!zX) {
                        mm0Var.n();
                    }
                    return z31Var;
                }
                if (unsafe2.getObjectVolatile(mm0Var, j) != objectVolatile) {
                    break;
                }
                this = mm0Var;
            }
            this = mm0Var;
        }
    }

    @Override // defpackage.vz8
    public final void a(nz6 nz6Var, int i) {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                bt.i("invokeOnCancellation should be called at most once");
                return;
            }
            mm0 mm0Var = this;
            if (unsafe.compareAndSwapInt(mm0Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                mm0Var.v(nz6Var);
                return;
            }
            this = mm0Var;
        }
    }

    @Override // defpackage.qp1
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        mm0 mm0Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = j0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof b65) {
                bt.i("Not completed");
                return;
            }
            if (objectVolatile instanceof xx0) {
                return;
            }
            if (objectVolatile instanceof vx0) {
                vx0 vx0Var = (vx0) objectVolatile;
                if (vx0Var.e != null) {
                    bt.i("Must be called at most once");
                    return;
                }
                vx0 vx0VarA = vx0.a(vx0Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    mm0 mm0Var2 = this;
                    if (unsafe2.compareAndSwapObject(mm0Var2, j0, objectVolatile, vx0VarA)) {
                        em0 em0Var = vx0Var.b;
                        if (em0Var != null) {
                            mm0Var2.k(em0Var, cancellationException);
                        }
                        sn2 sn2Var = vx0Var.c;
                        if (sn2Var != null) {
                            mm0Var2.l(sn2Var, cancellationException, vx0Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(mm0Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        mm0Var = mm0Var2;
                        break;
                    }
                    this = mm0Var2;
                }
            } else {
                mm0 mm0Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                vx0 vx0Var2 = new vx0(objectVolatile, (em0) null, (sn2) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    vx0 vx0Var3 = vx0Var2;
                    Unsafe unsafe3 = iu.a;
                    mm0Var = mm0Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(mm0Var, j0, objectVolatile, vx0Var3);
                    vx0Var2 = vx0Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(mm0Var, j) != objectVolatile) {
                        break;
                    } else {
                        mm0Var3 = mm0Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = mm0Var;
        }
    }

    @Override // defpackage.d71
    public final d71 c() {
        q51 q51Var = this.f0;
        if (q51Var instanceof d71) {
            return (d71) q51Var;
        }
        return null;
    }

    @Override // defpackage.qp1
    public final q51 d() {
        return this.f0;
    }

    @Override // defpackage.qp1
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        Throwable thA = sj6.a(obj);
        if (thA != null) {
            obj = new xx0(thA, false);
        }
        D(obj, this.Z, null);
    }

    @Override // defpackage.qp1
    public final Object g(Object obj) {
        return obj instanceof vx0 ? ((vx0) obj).a : obj;
    }

    @Override // defpackage.qp1
    public final Object i() {
        return r();
    }

    @Override // defpackage.lm0
    public final z31 j(Object obj, sn2 sn2Var) {
        return H(obj, sn2Var);
    }

    public final void k(em0 em0Var, Throwable th) {
        try {
            em0Var.b(th);
        } catch (Throwable th2) {
            vr3.F(this.g0, new yx0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(sn2 sn2Var, Throwable th, Object obj) {
        s61 s61Var = this.g0;
        try {
            sn2Var.x(th, obj, s61Var);
        } catch (Throwable th2) {
            vr3.F(s61Var, new yx0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(nz6 nz6Var, Throwable th) {
        s61 s61Var = this.g0;
        int intVolatile = iu.a.getIntVolatile(this, h0) & 536870911;
        if (intVolatile == 536870911) {
            bt.i("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nz6Var.h(intVolatile, s61Var);
        } catch (Throwable th2) {
            vr3.F(s61Var, new yx0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        Unsafe unsafe = iu.a;
        long j = i0;
        gq1 gq1Var = (gq1) unsafe.getObjectVolatile(this, j);
        if (gq1Var == null) {
            return;
        }
        gq1Var.a();
        unsafe.putObjectVolatile(this, j, t55.X);
    }

    public final void o(int i) {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    bt.i("Already resumed");
                    return;
                }
                boolean z = i == 4;
                q51 q51Var = this.f0;
                if (!z && (q51Var instanceof np1)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.Z;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        np1 np1Var = (np1) q51Var;
                        u61 u61Var = np1Var.f0;
                        s61 s61VarW = np1Var.g0.w();
                        if (op1.c(u61Var, s61VarW)) {
                            op1.b(u61Var, s61VarW, this);
                            return;
                        }
                        d42 d42VarA = j98.a();
                        if (d42VarA.Z >= 4294967296L) {
                            d42VarA.e1(this);
                            return;
                        }
                        d42VarA.f1(true);
                        try {
                            u15.N(this, q51Var, true);
                            do {
                            } while (d42VarA.h1());
                        } catch (Throwable th) {
                            try {
                                this.h(th);
                            } finally {
                                d42VarA.d1(true);
                            }
                        }
                        return;
                    }
                }
                u15.N(this, q51Var, z);
                return;
            }
            mm0 mm0Var = this;
            if (unsafe.compareAndSwapInt(mm0Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = mm0Var;
            }
        }
    }

    public Throwable p(rm3 rm3Var) {
        return rm3Var.R();
    }

    public final Object q() {
        bm3 bm3Var;
        boolean zX = x();
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    bt.i("Already suspended");
                    return null;
                }
                if (zX) {
                    this.C();
                }
                Object objR = this.r();
                if (objR instanceof xx0) {
                    throw ((xx0) objR).a;
                }
                int i2 = this.Z;
                if ((i2 != 1 && i2 != 2) || (bm3Var = (bm3) this.g0.H0(oy1.E0)) == null || bm3Var.k()) {
                    return this.g(objR);
                }
                CancellationException cancellationExceptionR = bm3Var.R();
                this.b(cancellationExceptionR);
                throw cancellationExceptionR;
            }
            mm0 mm0Var = this;
            if (unsafe.compareAndSwapInt(mm0Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((gq1) unsafe.getObjectVolatile(mm0Var, i0)) == null) {
                    mm0Var.t();
                }
                if (zX) {
                    mm0Var.C();
                }
                return c71.X;
            }
            this = mm0Var;
        }
    }

    public final Object r() {
        return iu.a.getObjectVolatile(this, j0);
    }

    public final void s() {
        gq1 gq1VarT = t();
        if (gq1VarT == null || (r() instanceof b65)) {
            return;
        }
        gq1VarT.a();
        iu.a.putObjectVolatile(this, i0, t55.X);
    }

    public final gq1 t() {
        bm3 bm3Var = (bm3) this.g0.H0(oy1.E0);
        if (bm3Var == null) {
            return null;
        }
        gq1 gq1VarW = u70.W(bm3Var, true, new hr0(this));
        while (true) {
            Unsafe unsafe = iu.a;
            long j = i0;
            mm0 mm0Var = this;
            if (unsafe.compareAndSwapObject(mm0Var, j, (Object) null, gq1VarW) || unsafe.getObjectVolatile(mm0Var, j) != null) {
                break;
            }
            this = mm0Var;
        }
        return gq1VarW;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(B());
        sb.append('(');
        sb.append(zc1.n0(this.f0));
        sb.append("){");
        Object objR = r();
        if (objR instanceof b65) {
            str = "Active";
        } else {
            str = objR instanceof qm0 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(zc1.L(this));
        return sb.toString();
    }

    public final void u(gn2 gn2Var) {
        v(new dm0(gn2Var, (byte) 1));
    }

    public final void v(b65 b65Var) {
        b65 b65Var2;
        mm0 mm0Var;
        mm0 mm0Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = iu.a;
            long j = j0;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof o5) {
                while (true) {
                    Unsafe unsafe3 = iu.a;
                    mm0 mm0Var3 = this;
                    b65 b65Var3 = b65Var;
                    mm0Var = mm0Var3;
                    b65Var2 = b65Var3;
                    if (unsafe3.compareAndSwapObject(mm0Var3, j0, objectVolatile, b65Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(mm0Var, j) != objectVolatile) {
                        break;
                    }
                    this = mm0Var;
                    b65Var = b65Var2;
                }
            } else {
                b65Var2 = b65Var;
                mm0Var = this;
                if ((objectVolatile instanceof em0) || (objectVolatile instanceof nz6)) {
                    A(b65Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof xx0) {
                    xx0 xx0Var = (xx0) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(xx0Var, xx0.b, 0, 1)) {
                        A(b65Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof qm0) {
                        Throwable th = xx0Var.a;
                        if (b65Var2 instanceof em0) {
                            mm0Var.k((em0) b65Var2, th);
                            return;
                        } else {
                            mm0Var.m((nz6) b65Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof vx0) {
                    vx0 vx0Var = (vx0) objectVolatile;
                    if (vx0Var.b != null) {
                        A(b65Var2, objectVolatile);
                        throw null;
                    }
                    if (b65Var2 instanceof nz6) {
                        return;
                    }
                    em0 em0Var = (em0) b65Var2;
                    Throwable th2 = vx0Var.e;
                    if (th2 != null) {
                        mm0Var.k(em0Var, th2);
                        return;
                    }
                    vx0 vx0VarA = vx0.a(vx0Var, em0Var, null, 29);
                    do {
                        unsafe = iu.a;
                        if (unsafe.compareAndSwapObject(mm0Var, j0, objectVolatile, vx0VarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(mm0Var, j) == objectVolatile);
                } else {
                    if (b65Var2 instanceof nz6) {
                        return;
                    }
                    vx0 vx0Var2 = new vx0(objectVolatile, (em0) b65Var2, (sn2) null, (Throwable) null, 28);
                    while (true) {
                        vx0 vx0Var3 = vx0Var2;
                        Unsafe unsafe4 = iu.a;
                        mm0Var2 = mm0Var;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(mm0Var2, j0, objectVolatile, vx0Var3);
                        vx0Var2 = vx0Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(mm0Var2, j) != objectVolatile) {
                            break;
                        } else {
                            mm0Var = mm0Var2;
                        }
                    }
                }
                this = mm0Var2;
                b65Var = b65Var2;
            }
            mm0Var2 = mm0Var;
            this = mm0Var2;
            b65Var = b65Var2;
        }
    }

    @Override // defpackage.q51
    public final s61 w() {
        return this.g0;
    }

    public final boolean x() {
        if (this.Z == 2) {
            return iu.a.getObjectVolatile((np1) this.f0, np1.j0) != null;
        }
        return false;
    }

    @Override // defpackage.lm0
    public final void y(Object obj, sn2 sn2Var) {
        D(obj, this.Z, sn2Var);
    }

    @Override // defpackage.lm0
    public final boolean z(Throwable th) {
        Throwable cancellationException;
        mm0 mm0Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = j0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b65)) {
                return false;
            }
            boolean z = (objectVolatile instanceof em0) || (objectVolatile instanceof nz6);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            qm0 qm0Var = new qm0(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = iu.a;
                mm0Var = this;
                if (unsafe2.compareAndSwapObject(mm0Var, j0, objectVolatile, qm0Var)) {
                    b65 b65Var = (b65) objectVolatile;
                    if (b65Var instanceof em0) {
                        mm0Var.k((em0) objectVolatile, th);
                    } else if (b65Var instanceof nz6) {
                        mm0Var.m((nz6) objectVolatile, th);
                    }
                    if (!mm0Var.x()) {
                        mm0Var.n();
                    }
                    mm0Var.o(mm0Var.Z);
                    return true;
                }
                if (unsafe2.getObjectVolatile(mm0Var, j) != objectVolatile) {
                    break;
                }
                this = mm0Var;
            }
            this = mm0Var;
        }
    }
}
