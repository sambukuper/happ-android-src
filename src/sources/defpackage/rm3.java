package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rm3 implements bm3 {
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ int Z = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = iu.a;
        Y = unsafe.objectFieldOffset(rm3.class.getDeclaredField("_state$volatile"));
        X = unsafe.objectFieldOffset(rm3.class.getDeclaredField("_parentHandle$volatile"));
    }

    public rm3(boolean z) {
        this._state$volatile = z ? sm3.g : sm3.f;
    }

    public static jr0 Z(we4 we4Var) {
        while (we4Var.i()) {
            we4Var = we4Var.h();
        }
        while (true) {
            we4Var = we4Var.g();
            if (!we4Var.i()) {
                if (we4Var instanceof jr0) {
                    return (jr0) we4Var;
                }
                if (we4Var instanceof k55) {
                    return null;
                }
            }
        }
    }

    public static String i0(Object obj) {
        if (!(obj instanceof km3)) {
            if (obj instanceof bb3) {
                return ((bb3) obj).k() ? "Active" : "New";
            }
            return obj instanceof xx0 ? "Cancelled" : "Completed";
        }
        km3 km3Var = (km3) obj;
        if (km3Var.c()) {
            return "Cancelling";
        }
        return km3Var.d() ? "Completing" : "Active";
    }

    public final void A(bb3 bb3Var, Object obj) {
        Unsafe unsafe = iu.a;
        long j = X;
        ir0 ir0Var = (ir0) unsafe.getObjectVolatile(this, j);
        if (ir0Var != null) {
            ir0Var.a();
            unsafe.putObjectVolatile(this, j, t55.X);
        }
        yx0 yx0Var = null;
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        Throwable th = xx0Var != null ? xx0Var.a : null;
        if (bb3Var instanceof gm3) {
            try {
                ((gm3) bb3Var).n(th);
                return;
            } catch (Throwable th2) {
                O(new yx0("Exception in completion handler " + bb3Var + " for " + this, th2));
                return;
            }
        }
        k55 k55VarL = bb3Var.l();
        if (k55VarL != null) {
            k55VarL.c(new hb4(1), 1);
            Object objF = k55VarL.f();
            objF.getClass();
            for (we4 we4VarG = (we4) objF; !we4VarG.equals(k55VarL); we4VarG = we4VarG.g()) {
                if (we4VarG instanceof gm3) {
                    try {
                        ((gm3) we4VarG).n(th);
                    } catch (Throwable th3) {
                        if (yx0Var != null) {
                            gv3.g(yx0Var, th3);
                        } else {
                            yx0Var = new yx0("Exception in completion handler " + we4VarG + " for " + this, th3);
                        }
                    }
                }
            }
            if (yx0Var != null) {
                O(yx0Var);
            }
        }
    }

    public final Throwable B(Object obj) {
        Throwable thB;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new cm3(v(), null, this) : th;
        }
        obj.getClass();
        rm3 rm3Var = (rm3) obj;
        Object objM = rm3Var.M();
        if (objM instanceof km3) {
            thB = ((km3) objM).b();
        } else if (objM instanceof xx0) {
            thB = ((xx0) objM).a;
        } else {
            if (objM instanceof bb3) {
                b61.o(objM, "Cannot be cancelling child in this state: ");
                return null;
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new cm3("Parent job is ".concat(i0(objM)), thB, rm3Var) : cancellationException;
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.bm3
    public final ir0 C(rm3 rm3Var) {
        rm3 rm3Var2;
        jr0 jr0Var = new jr0(rm3Var);
        jr0Var.f0 = this;
        loop0: while (true) {
            Object objM = this.M();
            if (objM instanceof tz1) {
                tz1 tz1Var = (tz1) objM;
                if (tz1Var.X) {
                    while (true) {
                        Unsafe unsafe = iu.a;
                        long j = Y;
                        rm3Var2 = this;
                        if (unsafe.compareAndSwapObject(rm3Var2, j, objM, jr0Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(rm3Var2, j) != objM) {
                            break;
                        }
                        this = rm3Var2;
                    }
                } else {
                    rm3Var2 = this;
                    rm3Var2.f0(tz1Var);
                }
                this = rm3Var2;
            } else {
                rm3Var2 = this;
                boolean z = objM instanceof bb3;
                t55 t55Var = t55.X;
                Throwable thB = null;
                if (!z) {
                    Object objM2 = rm3Var2.M();
                    xx0 xx0Var = objM2 instanceof xx0 ? (xx0) objM2 : null;
                    jr0Var.n(xx0Var != null ? xx0Var.a : null);
                    return t55Var;
                }
                k55 k55VarL = ((bb3) objM).l();
                if (k55VarL != null) {
                    if (k55VarL.c(jr0Var, 7)) {
                        break;
                    }
                    boolean zC = k55VarL.c(jr0Var, 3);
                    Object objM3 = rm3Var2.M();
                    if (objM3 instanceof km3) {
                        thB = ((km3) objM3).b();
                    } else {
                        xx0 xx0Var2 = objM3 instanceof xx0 ? (xx0) objM3 : null;
                        if (xx0Var2 != null) {
                            thB = xx0Var2.a;
                        }
                    }
                    jr0Var.n(thB);
                    if (zC) {
                        break;
                    }
                    return t55Var;
                }
                rm3Var2.g0((gm3) objM);
                this = rm3Var2;
            }
        }
        return jr0Var;
    }

    @Override // defpackage.bm3
    public final y45 C0() {
        ci8.i(3, qm3.X);
        qm3 qm3Var = qm3.X;
        y45 y45Var = new y45();
        y45Var.X = this;
        return y45Var;
    }

    @Override // defpackage.bm3
    public final gq1 D(gn2 gn2Var) {
        return Q(true, new ii3(gn2Var));
    }

    public final Object F(km3 km3Var, Object obj) throws Throwable {
        Throwable th;
        rm3 rm3Var;
        km3 km3Var2;
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        Throwable th2 = xx0Var != null ? xx0Var.a : null;
        synchronized (km3Var) {
            try {
                km3Var.c();
                ArrayList<Throwable> arrayListE = km3Var.e(th2);
                Throwable thH = H(km3Var, arrayListE);
                if (thH != null) {
                    try {
                        if (arrayListE.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                            for (Throwable th3 : arrayListE) {
                                if (th3 != thH && th3 != thH && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    gv3.g(thH, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thH != null && thH != th2) {
                    obj = new xx0(thH, false);
                }
                if (thH != null && (t(thH) || N(thH))) {
                    obj.getClass();
                    iu.a.compareAndSwapInt((xx0) obj, xx0.b, 0, 1);
                }
                d0(obj);
                Object fb3Var = obj instanceof bb3 ? new fb3((bb3) obj) : obj;
                while (true) {
                    Unsafe unsafe = iu.a;
                    long j = Y;
                    rm3Var = this;
                    km3Var2 = km3Var;
                    if (unsafe.compareAndSwapObject(rm3Var, j, km3Var2, fb3Var) || unsafe.getObjectVolatile(rm3Var, j) != km3Var2) {
                        break;
                    }
                    this = rm3Var;
                    km3Var = km3Var2;
                }
                rm3Var.A(km3Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object G() throws Throwable {
        Object objM = M();
        if (objM instanceof bb3) {
            bt.i("This job has not completed yet");
            return null;
        }
        if (objM instanceof xx0) {
            throw ((xx0) objM).a;
        }
        return sm3.a(objM);
    }

    public final Throwable H(km3 km3Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (km3Var.c()) {
                return new cm3(v(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof ua8) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof ua8)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    public boolean I() {
        return true;
    }

    public boolean K() {
        return this instanceof ux0;
    }

    public final k55 L(bb3 bb3Var) {
        k55 k55VarL = bb3Var.l();
        if (k55VarL != null) {
            return k55VarL;
        }
        if (bb3Var instanceof tz1) {
            return new k55();
        }
        if (bb3Var instanceof gm3) {
            g0((gm3) bb3Var);
            return null;
        }
        b61.o(bb3Var, "State should have list: ");
        return null;
    }

    public final Object M() {
        return iu.a.getObjectVolatile(this, Y);
    }

    public boolean N(Throwable th) {
        return false;
    }

    public final void P(bm3 bm3Var) {
        long j = X;
        t55 t55Var = t55.X;
        if (bm3Var == null) {
            iu.a.putObjectVolatile(this, j, t55Var);
            return;
        }
        bm3Var.start();
        ir0 ir0VarC = bm3Var.C(this);
        Unsafe unsafe = iu.a;
        unsafe.putObjectVolatile(this, j, ir0VarC);
        if (S()) {
            ir0VarC.a();
            unsafe.putObjectVolatile(this, j, t55Var);
        }
    }

    public final gq1 Q(boolean z, gm3 gm3Var) {
        rm3 rm3Var;
        gm3 gm3Var2;
        boolean zC;
        gm3Var.f0 = this;
        loop0: while (true) {
            Object objM = this.M();
            if (!(objM instanceof tz1)) {
                rm3Var = this;
                gm3Var2 = gm3Var;
                boolean z2 = objM instanceof bb3;
                t55 t55Var = t55.X;
                if (z2) {
                    bb3 bb3Var = (bb3) objM;
                    k55 k55VarL = bb3Var.l();
                    if (k55VarL == null) {
                        rm3Var.g0((gm3) objM);
                    } else {
                        if (gm3Var2.m()) {
                            km3 km3Var = bb3Var instanceof km3 ? (km3) bb3Var : null;
                            Throwable thB = km3Var != null ? km3Var.b() : null;
                            if (thB == null) {
                                zC = k55VarL.c(gm3Var2, 5);
                            } else if (z) {
                                gm3Var2.n(thB);
                                return t55Var;
                            }
                        } else {
                            zC = k55VarL.c(gm3Var2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = rm3Var;
                    gm3Var = gm3Var2;
                } else if (z) {
                    Object objM2 = rm3Var.M();
                    xx0 xx0Var = objM2 instanceof xx0 ? (xx0) objM2 : null;
                    gm3Var2.n(xx0Var != null ? xx0Var.a : null);
                }
                return t55Var;
            }
            tz1 tz1Var = (tz1) objM;
            if (tz1Var.X) {
                while (true) {
                    Unsafe unsafe = iu.a;
                    long j = Y;
                    rm3Var = this;
                    gm3Var2 = gm3Var;
                    if (unsafe.compareAndSwapObject(rm3Var, j, objM, gm3Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(rm3Var, j) != objM) {
                        break;
                    }
                    this = rm3Var;
                    gm3Var = gm3Var2;
                }
            } else {
                rm3Var = this;
                gm3Var2 = gm3Var;
                rm3Var.f0(tz1Var);
            }
            this = rm3Var;
            gm3Var = gm3Var2;
        }
        return gm3Var2;
    }

    @Override // defpackage.bm3
    public final CancellationException R() {
        CancellationException cancellationException;
        Object objM = M();
        if (objM instanceof km3) {
            Throwable thB = ((km3) objM).b();
            if (thB == null) {
                b61.o(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
            return cancellationException == null ? new cm3(strConcat, thB, this) : cancellationException;
        }
        if (objM instanceof bb3) {
            b61.o(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM instanceof xx0)) {
            return new cm3(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((xx0) objM).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new cm3(v(), th, this) : cancellationException;
    }

    public final boolean S() {
        return !(M() instanceof bb3);
    }

    public boolean T() {
        return this instanceof m60;
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    public final boolean V(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(M(), obj);
            if (objJ0 == sm3.a) {
                return false;
            }
            if (objJ0 == sm3.b) {
                return true;
            }
        } while (objJ0 == sm3.c);
        d(objJ0);
        return true;
    }

    @Override // defpackage.bm3
    public final Object V0(s51 s51Var) {
        Object objM;
        dn8 dn8Var;
        do {
            objM = M();
            boolean z = objM instanceof bb3;
            dn8Var = dn8.a;
            if (!z) {
                u70.I(s51Var.w());
                return dn8Var;
            }
        } while (h0(objM) < 0);
        mm0 mm0Var = new mm0(1, mb6.H(s51Var));
        mm0Var.s();
        mm0Var.v(new dm0(u70.W(this, true, new bk6(mm0Var)), (byte) 2));
        Object objQ = mm0Var.q();
        c71 c71Var = c71.X;
        if (objQ != c71Var) {
            objQ = dn8Var;
        }
        return objQ == c71Var ? objQ : dn8Var;
    }

    public final Object W(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(M(), obj);
            if (objJ0 == sm3.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
                throw new IllegalStateException(str, xx0Var != null ? xx0Var.a : null);
            }
        } while (objJ0 == sm3.c);
        return objJ0;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.bm3
    public final gq1 Y(boolean z, boolean z2, d0 d0Var) {
        return Q(z2, z ? new hi3(d0Var) : new ii3(d0Var));
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    public final void b0(k55 k55Var, Throwable th) {
        k55Var.c(new hb4(4), 4);
        Object objF = k55Var.f();
        objF.getClass();
        yx0 yx0Var = null;
        for (we4 we4VarG = (we4) objF; !we4VarG.equals(k55Var); we4VarG = we4VarG.g()) {
            if ((we4VarG instanceof gm3) && ((gm3) we4VarG).m()) {
                try {
                    ((gm3) we4VarG).n(th);
                } catch (Throwable th2) {
                    if (yx0Var != null) {
                        gv3.g(yx0Var, th2);
                    } else {
                        yx0Var = new yx0("Exception in completion handler " + we4VarG + " for " + this, th2);
                    }
                }
            }
        }
        if (yx0Var != null) {
            O(yx0Var);
        }
        t(th);
    }

    public void e(Object obj) {
        d(obj);
    }

    public final void f0(tz1 tz1Var) {
        k55 k55Var = new k55();
        Object b93Var = tz1Var.X ? k55Var : new b93(k55Var);
        while (true) {
            Unsafe unsafe = iu.a;
            long j = Y;
            rm3 rm3Var = this;
            tz1 tz1Var2 = tz1Var;
            if (unsafe.compareAndSwapObject(rm3Var, j, tz1Var2, b93Var) || unsafe.getObjectVolatile(rm3Var, j) != tz1Var2) {
                return;
            }
            this = rm3Var;
            tz1Var = tz1Var2;
        }
    }

    @Override // defpackage.bm3
    public final u27 g() {
        return new hu(new nm3(this, null, (byte) 0), (byte) 3);
    }

    public final void g0(gm3 gm3Var) {
        gm3 gm3Var2;
        rm3 rm3Var;
        k55 k55Var = new k55();
        Unsafe unsafe = iu.a;
        unsafe.putObjectVolatile(k55Var, we4.Y, gm3Var);
        long j = we4.X;
        unsafe.putObjectVolatile(k55Var, j, gm3Var);
        loop0: while (true) {
            if (gm3Var.f() != gm3Var) {
                gm3Var2 = gm3Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = iu.a;
                gm3Var2 = gm3Var;
                if (unsafe2.compareAndSwapObject(gm3Var2, we4.X, gm3Var, k55Var)) {
                    k55Var.e(gm3Var2);
                    break loop0;
                }
                rm3Var = this;
                gm3Var = gm3Var2;
                if (unsafe2.getObjectVolatile(gm3Var2, j) != gm3Var2) {
                    break;
                } else {
                    this = rm3Var;
                }
            }
            this = rm3Var;
        }
        we4 we4VarG = gm3Var2.g();
        while (true) {
            Unsafe unsafe3 = iu.a;
            long j2 = Y;
            rm3 rm3Var2 = this;
            if (unsafe3.compareAndSwapObject(rm3Var2, j2, gm3Var2, we4VarG) || unsafe3.getObjectVolatile(rm3Var2, j2) != gm3Var2) {
                return;
            } else {
                this = rm3Var2;
            }
        }
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return oy1.E0;
    }

    public final Object h(q51 q51Var) throws Throwable {
        Object objM;
        do {
            objM = M();
            if (!(objM instanceof bb3)) {
                if (objM instanceof xx0) {
                    throw ((xx0) objM).a;
                }
                return sm3.a(objM);
            }
        } while (h0(objM) < 0);
        im3 im3Var = new im3(mb6.H(q51Var), this);
        im3Var.s();
        im3Var.v(new dm0(u70.W(this, true, new ak6(im3Var)), (byte) 2));
        return im3Var.q();
    }

    public final int h0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof tz1;
        long j = Y;
        if (!z) {
            rm3 rm3Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof b93)) {
                return 0;
            }
            k55 k55Var = ((b93) obj2).X;
            do {
                rm3 rm3Var2 = rm3Var;
                unsafe = iu.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(rm3Var2, Y, obj3, k55Var);
                rm3Var = rm3Var2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    rm3Var.e0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(rm3Var, j) == obj2);
            return -1;
        }
        if (((tz1) obj).X) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = iu.a;
            rm3 rm3Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(rm3Var3, Y, obj4, sm3.g)) {
                rm3Var3.e0();
                return 1;
            }
            if (unsafe2.getObjectVolatile(rm3Var3, j) != obj4) {
                return -1;
            }
            this = rm3Var3;
            obj = obj4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[LOOP:2: B:56:0x00b2->B:63:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean i(Object obj) {
        rm3 rm3Var;
        Throwable thB;
        Object objM;
        Throwable thB2;
        z31 z31Var;
        Object objJ0;
        bb3 bb3Var;
        k55 k55VarL;
        km3 km3Var;
        Unsafe unsafe;
        long j;
        Object objJ1 = sm3.a;
        if (K()) {
            do {
                Object objM2 = M();
                if (!(objM2 instanceof bb3) || ((objM2 instanceof km3) && ((km3) objM2).d())) {
                    objJ1 = sm3.a;
                    break;
                }
                objJ1 = j0(objM2, new xx0(B(obj), false));
            } while (objJ1 == sm3.c);
            if (objJ1 != sm3.b) {
                if (objJ1 == sm3.a) {
                    thB = null;
                    loop1: while (true) {
                        objM = this.M();
                        if (objM instanceof km3) {
                            if (objM instanceof bb3) {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                bb3Var = (bb3) objM;
                                if (bb3Var.k()) {
                                    k55VarL = this.L(bb3Var);
                                    if (k55VarL == null) {
                                        rm3Var = this;
                                    } else {
                                        km3Var = new km3(k55VarL, thB);
                                        while (true) {
                                            unsafe = iu.a;
                                            j = Y;
                                            rm3Var = this;
                                            if (unsafe.compareAndSwapObject(rm3Var, j, bb3Var, km3Var)) {
                                                rm3Var.b0(k55VarL, thB);
                                                objJ0 = sm3.a;
                                            } else if (unsafe.getObjectVolatile(rm3Var, j) != bb3Var) {
                                                this = rm3Var;
                                            }
                                        }
                                    }
                                    this = rm3Var;
                                } else {
                                    rm3Var = this;
                                    objJ0 = rm3Var.j0(objM, new xx0(thB, false));
                                    if (objJ0 != sm3.a) {
                                        b61.o(objM, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objJ0 != sm3.c) {
                                        this = rm3Var;
                                    }
                                }
                            } else {
                                rm3Var = this;
                                objJ0 = sm3.d;
                            }
                            objJ1 = objJ0;
                            break;
                        }
                        synchronized (objM) {
                            if (iu.a.getObjectVolatile((km3) objM, km3.Y) == sm3.e) {
                                z31Var = sm3.d;
                            } else {
                                boolean zC = ((km3) objM).c();
                                if (obj == null || !zC) {
                                    if (thB == null) {
                                        thB = this.B(obj);
                                    }
                                    ((km3) objM).a(thB);
                                }
                                thB2 = zC ? null : ((km3) objM).b();
                                if (thB2 != null) {
                                    this.b0(((km3) objM).X, thB2);
                                }
                                z31Var = sm3.a;
                            }
                        }
                        rm3Var = this;
                        objJ1 = z31Var;
                        break;
                    }
                }
                rm3Var = this;
                if (objJ1 != sm3.a && objJ1 != sm3.b) {
                    if (objJ1 == sm3.d) {
                        return false;
                    }
                    rm3Var.d(objJ1);
                    return true;
                }
            }
        } else {
            if (objJ1 == sm3.a) {
                thB = null;
                loop1: while (true) {
                    objM = this.M();
                    if (objM instanceof km3) {
                        if (objM instanceof bb3) {
                            if (thB == null) {
                                thB = this.B(obj);
                            }
                            bb3Var = (bb3) objM;
                            if (bb3Var.k()) {
                                k55VarL = this.L(bb3Var);
                                if (k55VarL == null) {
                                    rm3Var = this;
                                } else {
                                    km3Var = new km3(k55VarL, thB);
                                    while (true) {
                                        unsafe = iu.a;
                                        j = Y;
                                        rm3Var = this;
                                        if (unsafe.compareAndSwapObject(rm3Var, j, bb3Var, km3Var)) {
                                            rm3Var.b0(k55VarL, thB);
                                            objJ0 = sm3.a;
                                        } else if (unsafe.getObjectVolatile(rm3Var, j) != bb3Var) {
                                            this = rm3Var;
                                        }
                                    }
                                }
                                this = rm3Var;
                            } else {
                                rm3Var = this;
                                objJ0 = rm3Var.j0(objM, new xx0(thB, false));
                                if (objJ0 != sm3.a) {
                                    b61.o(objM, "Cannot happen in ");
                                    return false;
                                }
                                if (objJ0 != sm3.c) {
                                    this = rm3Var;
                                }
                            }
                        } else {
                            rm3Var = this;
                            objJ0 = sm3.d;
                        }
                        objJ1 = objJ0;
                        break;
                    }
                    synchronized (objM) {
                        if (iu.a.getObjectVolatile((km3) objM, km3.Y) == sm3.e) {
                            z31Var = sm3.d;
                        } else {
                            boolean zC2 = ((km3) objM).c();
                            if (obj == null) {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                ((km3) objM).a(thB);
                            } else {
                                if (thB == null) {
                                    thB = this.B(obj);
                                }
                                ((km3) objM).a(thB);
                            }
                            if (zC2) {
                            }
                            if (thB2 != null) {
                                this.b0(((km3) objM).X, thB2);
                            }
                            z31Var = sm3.a;
                        }
                        rm3Var = this;
                        objJ1 = z31Var;
                        break;
                    }
                }
            }
            rm3Var = this;
            if (objJ1 != sm3.a) {
                if (objJ1 == sm3.d) {
                    return false;
                }
                rm3Var.d(objJ1);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.bm3
    public final boolean isCancelled() {
        Object objM = M();
        if (objM instanceof xx0) {
            return true;
        }
        return (objM instanceof km3) && ((km3) objM).c();
    }

    public final Object j0(Object obj, Object obj2) {
        if (!(obj instanceof bb3)) {
            return sm3.a;
        }
        if ((!(obj instanceof tz1) && !(obj instanceof gm3)) || (obj instanceof jr0) || (obj2 instanceof xx0)) {
            rm3 rm3Var = this;
            bb3 bb3Var = (bb3) obj;
            k55 k55VarL = rm3Var.L(bb3Var);
            if (k55VarL == null) {
                return sm3.c;
            }
            km3 km3Var = bb3Var instanceof km3 ? (km3) bb3Var : null;
            if (km3Var == null) {
                km3Var = new km3(k55VarL, null);
            }
            km3 km3Var2 = km3Var;
            synchronized (km3Var2) {
                if (km3Var2.d()) {
                    return sm3.a;
                }
                iu.a.putIntVolatile(km3Var2, km3.Z, 1);
                if (km3Var2 != bb3Var) {
                    while (true) {
                        Unsafe unsafe = iu.a;
                        long j = Y;
                        rm3 rm3Var2 = rm3Var;
                        rm3Var = rm3Var2;
                        if (unsafe.compareAndSwapObject(rm3Var2, j, bb3Var, km3Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(rm3Var, j) != bb3Var) {
                            return sm3.c;
                        }
                    }
                }
                boolean zC = km3Var2.c();
                xx0 xx0Var = obj2 instanceof xx0 ? (xx0) obj2 : null;
                if (xx0Var != null) {
                    km3Var2.a(xx0Var.a);
                }
                Throwable thB = zC ? null : km3Var2.b();
                if (thB != null) {
                    rm3Var.b0(k55VarL, thB);
                }
                jr0 jr0VarZ = Z(k55VarL);
                if (jr0VarZ != null && rm3Var.k0(km3Var2, jr0VarZ, obj2)) {
                    return sm3.b;
                }
                k55VarL.c(new hb4(2), 2);
                jr0 jr0VarZ2 = Z(k55VarL);
                return (jr0VarZ2 == null || !rm3Var.k0(km3Var2, jr0VarZ2, obj2)) ? rm3Var.F(km3Var2, obj2) : sm3.b;
            }
        }
        bb3 bb3Var2 = (bb3) obj;
        Object fb3Var = obj2 instanceof bb3 ? new fb3((bb3) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = iu.a;
            long j2 = Y;
            rm3 rm3Var3 = this;
            if (unsafe2.compareAndSwapObject(rm3Var3, j2, bb3Var2, fb3Var)) {
                rm3Var3.d0(obj2);
                rm3Var3.A(bb3Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(rm3Var3, j2) != bb3Var2) {
                return sm3.c;
            }
            this = rm3Var3;
        }
    }

    @Override // defpackage.bm3
    public boolean k() {
        Object objM = M();
        return (objM instanceof bb3) && ((bb3) objM).k();
    }

    public final boolean k0(km3 km3Var, jr0 jr0Var, Object obj) {
        while (u70.W(jr0Var.g0, false, new jm3(this, km3Var, jr0Var, obj)) == t55.X) {
            jr0Var = Z(jr0Var);
            if (jr0Var == null) {
                return false;
            }
        }
        return true;
    }

    public void l(Throwable th) {
        i(th);
    }

    @Override // defpackage.bm3, defpackage.jp0
    public void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new cm3(v(), null, this);
        }
        l(cancellationException);
    }

    public Object p() {
        return G();
    }

    @Override // defpackage.bm3
    public final boolean start() {
        int iH0;
        do {
            iH0 = h0(M());
            if (iH0 == 0) {
                return false;
            }
        } while (iH0 != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ir0 ir0Var = (ir0) iu.a.getObjectVolatile(this, X);
        if (ir0Var == null || ir0Var == t55.X) {
            return z;
        }
        return ir0Var.b(th) || z;
    }

    public final String toString() {
        return (X() + '{' + i0(M()) + '}') + '@' + zc1.L(this);
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && I();
    }

    public void e0() {
    }

    public void O(yx0 yx0Var) {
        throw yx0Var;
    }

    public void d(Object obj) {
    }

    public void d0(Object obj) {
    }
}
