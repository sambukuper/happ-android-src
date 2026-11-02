package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class x90 implements jp0 {
    public static final /* synthetic */ AtomicLongFieldUpdater f0 = AtomicLongFieldUpdater.newUpdater(x90.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g0;
    public static final /* synthetic */ AtomicLongFieldUpdater h0;
    public static final /* synthetic */ AtomicLongFieldUpdater i0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater k0;
    public static final /* synthetic */ long l0;
    public static final /* synthetic */ long m0;
    public static final /* synthetic */ long n0;
    public static final /* synthetic */ long o0;
    public static final /* synthetic */ long p0;
    public static final /* synthetic */ long q0;
    public static final /* synthetic */ long r0;
    public static final /* synthetic */ long s0;
    public static final /* synthetic */ long t0;
    public final int X;
    public final gn2 Y;
    public final m30 Z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = iu.a;
        t0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        g0 = AtomicLongFieldUpdater.newUpdater(x90.class, "receivers$volatile");
        r0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("receivers$volatile"));
        h0 = AtomicLongFieldUpdater.newUpdater(x90.class, "bufferEnd$volatile");
        m0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("bufferEnd$volatile"));
        i0 = AtomicLongFieldUpdater.newUpdater(x90.class, "completedExpandBuffersAndPauseFlag$volatile");
        p0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        j0 = AtomicReferenceFieldUpdater.newUpdater(x90.class, Object.class, "sendSegment$volatile");
        s0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("sendSegment$volatile"));
        k0 = AtomicReferenceFieldUpdater.newUpdater(x90.class, Object.class, "receiveSegment$volatile");
        q0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("receiveSegment$volatile"));
        n0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("bufferEndSegment$volatile"));
        l0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("_closeCause$volatile"));
        o0 = unsafe.objectFieldOffset(x90.class.getDeclaredField("closeHandler$volatile"));
    }

    public x90(int i, gn2 gn2Var) {
        long j;
        this.X = i;
        this.Y = gn2Var;
        if (i < 0) {
            em7.c(ie2.h("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        vp0 vp0Var = z90.a;
        if (i != 0) {
            j = i != Integer.MAX_VALUE ? i : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = k();
        vp0 vp0Var2 = new vp0(0L, null, this, 3);
        this.sendSegment$volatile = vp0Var2;
        this.receiveSegment$volatile = vp0Var2;
        if (C()) {
            vp0Var2 = z90.a;
            vp0Var2.getClass();
        }
        this.bufferEndSegment$volatile = vp0Var2;
        this.Z = gn2Var != null ? new m30((Object) this, (byte) 1) : null;
        this._closeCause$volatile = z90.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object G(x90 x90Var, s51 s51Var) {
        v90 v90Var;
        vp0 vp0Var;
        if (s51Var instanceof v90) {
            v90Var = (v90) s51Var;
            int i = v90Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                v90Var.h0 = i - Integer.MIN_VALUE;
            } else {
                v90Var = new v90(x90Var, s51Var);
            }
        } else {
            v90Var = new v90(x90Var, s51Var);
        }
        v90 v90Var2 = v90Var;
        Object obj = v90Var2.f0;
        int i2 = v90Var2.h0;
        if (i2 != 0) {
            if (i2 == 1) {
                w39.n0(obj);
                return ((up0) obj).a;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        vp0 vp0Var2 = (vp0) iu.a.getObjectVolatile(x90Var, q0);
        while (!x90Var.z()) {
            long andIncrement = g0.getAndIncrement(x90Var);
            long j = z90.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (vp0Var2.f0 != j2) {
                vp0 vp0VarI = x90Var.i(j2, vp0Var2);
                if (vp0VarI == null) {
                    continue;
                } else {
                    vp0Var = vp0VarI;
                }
            } else {
                vp0Var = vp0Var2;
            }
            x90 x90Var2 = x90Var;
            Object objM = x90Var2.M(vp0Var, i3, andIncrement, null);
            if (objM == z90.m) {
                bt.i("unexpected");
                return null;
            }
            if (objM != z90.o) {
                if (objM != z90.n) {
                    vp0Var.a();
                    return objM;
                }
                v90Var2.h0 = 1;
                Object objH = x90Var2.H(vp0Var, i3, andIncrement, v90Var2);
                c71 c71Var = c71.X;
                return objH == c71Var ? c71Var : objH;
            }
            if (andIncrement < x90Var2.v()) {
                vp0Var.a();
            }
            x90Var = x90Var2;
            vp0Var2 = vp0Var;
        }
        return new sp0(x90Var.l());
    }

    public final boolean A() {
        return y(iu.a.getLongVolatile(this, t0), false);
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long jK = k();
        return jK == 0 || jK == Long.MAX_VALUE;
    }

    public final void D(long j, vp0 vp0Var) {
        x90 x90Var;
        vp0 vp0Var2;
        vp0 vp0Var3;
        while (vp0Var.f0 < j && (vp0Var3 = (vp0) vp0Var.c()) != null) {
            vp0Var = vp0Var3;
        }
        while (true) {
            vp0 vp0Var4 = vp0Var;
            while (vp0Var4.d() && (vp0Var2 = (vp0) vp0Var4.c()) != null) {
                vp0Var4 = vp0Var2;
            }
            while (true) {
                Unsafe unsafe = iu.a;
                long j2 = n0;
                nz6 nz6Var = (nz6) unsafe.getObjectVolatile(this, j2);
                if (nz6Var.f0 >= vp0Var4.f0) {
                    return;
                }
                if (!vp0Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    x90Var = this;
                    if (unsafe2.compareAndSwapObject(x90Var, n0, nz6Var, vp0Var4)) {
                        if (nz6Var.f()) {
                            nz6Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(x90Var, j2) != nz6Var) {
                        break;
                    } else {
                        this = x90Var;
                    }
                }
                if (vp0Var4.f()) {
                    vp0Var4.e();
                }
                this = x90Var;
            }
            vp0Var = vp0Var4;
        }
    }

    public final Object E(q51 q51Var, Object obj) {
        xl8 xl8VarT;
        mm0 mm0Var = new mm0(1, mb6.H(q51Var));
        mm0Var.s();
        gn2 gn2Var = this.Y;
        if (gn2Var == null || (xl8VarT = jm4.t(gn2Var, obj, null)) == null) {
            mm0Var.f(new rj6(u()));
        } else {
            gv3.g(xl8VarT, u());
            mm0Var.f(new rj6(xl8VarT));
        }
        Object objQ = mm0Var.q();
        return objQ == c71.X ? objQ : dn8.a;
    }

    public final void F(Object obj, mm0 mm0Var) {
        gn2 gn2Var = this.Y;
        if (gn2Var != null) {
            jm4.s(gn2Var, obj, mm0Var.g0);
        }
        mm0Var.f(new rj6(u()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object H(vp0 vp0Var, int i, long j, s51 s51Var) {
        w90 w90Var;
        up0 up0Var;
        vb vbVar;
        if (s51Var instanceof w90) {
            w90Var = (w90) s51Var;
            int i2 = w90Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w90Var.h0 = i2 - Integer.MIN_VALUE;
            } else {
                w90Var = new w90(this, s51Var);
            }
        } else {
            w90Var = new w90(this, s51Var);
        }
        Object objQ = w90Var.f0;
        int i3 = w90Var.h0;
        vb vbVar2 = null;
        if (i3 == 0) {
            w39.n0(objQ);
            w90Var.h0 = 1;
            mm0 mm0VarT = u70.T(mb6.H(w90Var));
            try {
                h86 h86Var = new h86(mm0VarT);
                Object objM = M(vp0Var, i, j, h86Var);
                if (objM == z90.m) {
                    h86Var.a(vp0Var, i);
                } else {
                    Object obj = z90.o;
                    gn2 gn2Var = this.Y;
                    if (objM == obj) {
                        if (j < v()) {
                            vp0Var.a();
                        }
                        vp0 vp0Var2 = (vp0) iu.a.getObjectVolatile(this, q0);
                        while (true) {
                            if (z()) {
                                mm0VarT.f(new up0(new sp0(l())));
                            } else {
                                long andIncrement = g0.getAndIncrement(this);
                                long j2 = z90.b;
                                long j3 = andIncrement / j2;
                                int i4 = (int) (andIncrement % j2);
                                if (vp0Var2.f0 != j3) {
                                    vp0 vp0VarI = i(j3, vp0Var2);
                                    if (vp0VarI != null) {
                                        vp0Var2 = vp0VarI;
                                    }
                                }
                                Object objM2 = M(vp0Var2, i4, andIncrement, h86Var);
                                if (objM2 == z90.m) {
                                    h86Var.a(vp0Var2, i4);
                                } else if (objM2 == z90.o) {
                                    if (andIncrement < v()) {
                                        vp0Var2.a();
                                    }
                                } else {
                                    if (objM2 == z90.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    vp0Var2.a();
                                    up0Var = new up0(objM2);
                                    if (gn2Var != null) {
                                        vbVar = new vb(3, this, x90.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 5);
                                        vbVar2 = vbVar;
                                    }
                                    mm0VarT.y(up0Var, vbVar2);
                                }
                            }
                        }
                    } else {
                        vp0Var.a();
                        up0Var = new up0(objM);
                        if (gn2Var != null) {
                            vbVar = new vb(3, this, x90.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 5);
                            vbVar2 = vbVar;
                        }
                        mm0VarT.y(up0Var, vbVar2);
                    }
                }
                objQ = mm0VarT.q();
                c71 c71Var = c71.X;
                if (objQ == c71Var) {
                    return c71Var;
                }
            } catch (Throwable th) {
                mm0VarT.C();
                throw th;
            }
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objQ);
        }
        return ((up0) objQ).a;
    }

    public final void I(tz6 tz6Var) {
        vp0 vp0Var;
        tz6 tz6Var2;
        vp0 vp0Var2 = (vp0) iu.a.getObjectVolatile(this, q0);
        while (!this.z()) {
            long andIncrement = g0.getAndIncrement(this);
            long j = z90.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (vp0Var2.f0 != j2) {
                vp0 vp0VarI = this.i(j2, vp0Var2);
                if (vp0VarI == null) {
                    continue;
                } else {
                    vp0Var = vp0VarI;
                }
            } else {
                vp0Var = vp0Var2;
            }
            Object objM = this.M(vp0Var, i, andIncrement, tz6Var);
            vp0Var2 = vp0Var;
            if (objM == z90.m) {
                if (tz6Var == 0) {
                    tz6Var2 = null;
                }
                if (tz6Var2 == null) {
                    tz6Var2 = tz6Var;
                    return;
                }
                tz6Var2 = tz6Var;
                tz6Var2.Z = vp0Var2;
                tz6Var2.f0 = i;
                return;
            }
            if (objM != z90.o) {
                if (objM == z90.n) {
                    bt.i("unexpected");
                    return;
                } else {
                    vp0Var2.a();
                    tz6Var.g0 = objM;
                    return;
                }
            }
            if (andIncrement < this.v()) {
                vp0Var2.a();
            }
            this = this;
            tz6Var = tz6Var;
        }
        tz6Var.g0 = z90.l;
    }

    public final void J(vz8 vz8Var, boolean z) {
        if (vz8Var instanceof lm0) {
            ((q51) vz8Var).f(new rj6(z ? p() : u()));
            return;
        }
        if (vz8Var instanceof h86) {
            ((h86) vz8Var).X.f(new up0(new sp0(l())));
            return;
        }
        if (!(vz8Var instanceof q90)) {
            if (vz8Var instanceof tz6) {
                ((tz6) vz8Var).i(this, z90.l);
                return;
            } else {
                b61.o(vz8Var, "Unexpected waiter: ");
                return;
            }
        }
        q90 q90Var = (q90) vz8Var;
        mm0 mm0Var = q90Var.Y;
        mm0Var.getClass();
        q90Var.Y = null;
        q90Var.X = z90.l;
        Throwable thL = q90Var.Z.l();
        if (thL == null) {
            mm0Var.f(Boolean.FALSE);
        } else {
            mm0Var.f(new rj6(thL));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        byte b = 0;
        if (obj instanceof tz6) {
            return ((tz6) obj).i(this, obj2) == 0;
        }
        boolean z = obj instanceof h86;
        gn2 gn2Var = this.Y;
        sn2 vbVar = null;
        if (z) {
            mm0 mm0Var = ((h86) obj).X;
            up0 up0Var = new up0(obj2);
            if (gn2Var != null) {
                vbVar = new vb(3, this, x90.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 5);
            }
            vp0 vp0Var = z90.a;
            z31 z31VarJ = mm0Var.j(up0Var, vbVar);
            if (z31VarJ == null) {
                return false;
            }
            mm0Var.E(z31VarJ);
            return true;
        }
        if (!(obj instanceof q90)) {
            if (!(obj instanceof lm0)) {
                b61.o(obj, "Unexpected receiver type: ");
                return false;
            }
            lm0 lm0Var = (lm0) obj;
            vbVar = gn2Var != null ? new vb(3, this, x90.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 4) : null;
            vp0 vp0Var2 = z90.a;
            z31 z31VarJ2 = lm0Var.j(obj2, vbVar);
            if (z31VarJ2 == null) {
                return false;
            }
            lm0Var.E(z31VarJ2);
            return true;
        }
        q90 q90Var = (q90) obj;
        mm0 mm0Var2 = q90Var.Y;
        mm0Var2.getClass();
        q90Var.Y = null;
        q90Var.X = obj2;
        Boolean bool = Boolean.TRUE;
        gn2 gn2Var2 = q90Var.Z.Y;
        vbVar = gn2Var2 != null ? new o90(gn2Var2, obj2, b) : null;
        vp0 vp0Var3 = z90.a;
        z31 z31VarJ3 = mm0Var2.j(bool, vbVar);
        if (z31VarJ3 == null) {
            return false;
        }
        mm0Var2.E(z31VarJ3);
        return true;
    }

    public final boolean L(Object obj, vp0 vp0Var, int i) {
        bg8 bg8Var;
        boolean z = obj instanceof lm0;
        dn8 dn8Var = dn8.a;
        if (z) {
            lm0 lm0Var = (lm0) obj;
            vp0 vp0Var2 = z90.a;
            z31 z31VarJ = lm0Var.j(dn8Var, null);
            if (z31VarJ == null) {
                return false;
            }
            lm0Var.E(z31VarJ);
            return true;
        }
        if (!(obj instanceof tz6)) {
            b61.o(obj, "Unexpected waiter: ");
            return false;
        }
        int i2 = ((tz6) obj).i(this, dn8Var);
        bg8 bg8Var2 = bg8.X;
        bg8 bg8Var3 = bg8.Y;
        if (i2 == 0) {
            bg8Var = bg8Var2;
        } else if (i2 == 1) {
            bg8Var = bg8Var3;
        } else if (i2 == 2) {
            bg8Var = bg8.Z;
        } else {
            if (i2 != 3) {
                kp5.g(i2, "Unexpected internal result: ");
                return false;
            }
            bg8Var = bg8.f0;
        }
        if (bg8Var == bg8Var3) {
            vp0Var.n(i, null);
        }
        return bg8Var == bg8Var2;
    }

    public final Object M(vp0 vp0Var, int i, long j, Object obj) {
        Object objL = vp0Var.l(i);
        AtomicReferenceArray atomicReferenceArray = vp0Var.j0;
        long j2 = t0;
        if (objL == null) {
            if (j >= (iu.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return z90.n;
                }
                if (vp0Var.k(i, objL, obj)) {
                    h();
                    return z90.m;
                }
            }
        } else if (objL == z90.d && vp0Var.k(i, objL, z90.i)) {
            h();
            Object obj2 = atomicReferenceArray.get(i * 2);
            vp0Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = vp0Var.l(i);
            if (objL2 == null || objL2 == z90.e) {
                if (j < (iu.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (vp0Var.k(i, objL2, z90.h)) {
                        h();
                        return z90.o;
                    }
                } else {
                    if (obj == null) {
                        return z90.n;
                    }
                    if (vp0Var.k(i, objL2, obj)) {
                        h();
                        return z90.m;
                    }
                }
            } else if (objL2 != z90.d) {
                z31 z31Var = z90.j;
                if (objL2 == z31Var) {
                    return z90.o;
                }
                if (objL2 == z90.h) {
                    return z90.o;
                }
                if (objL2 == z90.l) {
                    h();
                    return z90.o;
                }
                if (objL2 != z90.g && vp0Var.k(i, objL2, z90.f)) {
                    boolean z = objL2 instanceof wz8;
                    if (z) {
                        objL2 = ((wz8) objL2).a;
                    }
                    if (L(objL2, vp0Var, i)) {
                        vp0Var.o(i, z90.i);
                        h();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        vp0Var.n(i, null);
                        return obj3;
                    }
                    vp0Var.o(i, z31Var);
                    vp0Var.i();
                    if (z) {
                        h();
                    }
                    return z90.o;
                }
            } else if (vp0Var.k(i, objL2, z90.i)) {
                h();
                Object obj4 = atomicReferenceArray.get(i * 2);
                vp0Var.n(i, null);
                return obj4;
            }
        }
    }

    public final int N(vp0 vp0Var, int i, Object obj, long j, Object obj2, boolean z) {
        vp0Var.n(i, obj);
        if (z) {
            return O(vp0Var, i, obj, j, obj2, z);
        }
        Object objL = vp0Var.l(i);
        if (objL == null) {
            if (c(j)) {
                if (vp0Var.k(i, null, z90.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (vp0Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof vz8) {
            vp0Var.n(i, null);
            if (K(objL, obj)) {
                vp0Var.o(i, z90.i);
                return 0;
            }
            z31 z31Var = z90.k;
            if (vp0Var.j0.getAndSet((i * 2) + 1, z31Var) == z31Var) {
                return 5;
            }
            vp0Var.m(i, true);
            return 5;
        }
        return O(vp0Var, i, obj, j, obj2, z);
    }

    public final int O(vp0 vp0Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objL = vp0Var.l(i);
            if (objL == null) {
                if (!c(j) || z) {
                    if (z) {
                        if (vp0Var.k(i, null, z90.j)) {
                            vp0Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (vp0Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (vp0Var.k(i, null, z90.d)) {
                    break;
                }
            } else {
                if (objL != z90.e) {
                    z31 z31Var = z90.k;
                    if (objL == z31Var) {
                        vp0Var.n(i, null);
                        return 5;
                    }
                    if (objL == z90.h) {
                        vp0Var.n(i, null);
                        return 5;
                    }
                    if (objL == z90.l) {
                        vp0Var.n(i, null);
                        A();
                        return 4;
                    }
                    vp0Var.n(i, null);
                    if (objL instanceof wz8) {
                        objL = ((wz8) objL).a;
                    }
                    if (K(objL, obj)) {
                        vp0Var.o(i, z90.i);
                        return 0;
                    }
                    if (vp0Var.j0.getAndSet((i * 2) + 1, z31Var) != z31Var) {
                        vp0Var.m(i, true);
                    }
                    return 5;
                }
                if (vp0Var.k(i, objL, z90.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j) {
        x90 x90Var = this;
        if (x90Var.C()) {
            return;
        }
        while (x90Var.k() <= j) {
            x90Var = this;
        }
        int i = z90.c;
        int i2 = 0;
        while (true) {
            long j2 = p0;
            if (i2 < i) {
                long jK = x90Var.k();
                if (jK == (iu.a.getLongVolatile(x90Var, j2) & 4611686018427387903L) && jK == x90Var.k()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = iu.a;
                    long longVolatile = unsafe.getLongVolatile(x90Var, j2);
                    if (unsafe.compareAndSwapLong(x90Var, p0, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        x90Var = this;
                    }
                }
                while (true) {
                    long jK2 = x90Var.k();
                    Unsafe unsafe2 = iu.a;
                    long longVolatile2 = unsafe2.getLongVolatile(x90Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jK2 == j3 && jK2 == x90Var.k()) {
                        break;
                    }
                    if (z) {
                        x90Var = this;
                    } else {
                        x90Var = this;
                        unsafe2.compareAndSwapLong(x90Var, p0, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = iu.a;
                    long longVolatile3 = unsafe3.getLongVolatile(x90Var, j2);
                    if (unsafe3.compareAndSwapLong(x90Var, p0, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        x90Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[RETURN] */
    @Override // defpackage.n17
    public Object a(q51 q51Var, Object obj) {
        dn8 dn8Var;
        Object objQ;
        c71 c71Var;
        int i;
        x90 x90Var = this;
        Unsafe unsafe = iu.a;
        long j = s0;
        vp0 vp0Var = (vp0) unsafe.getObjectVolatile(x90Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(x90Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zY = x90Var.y(andIncrement, false);
            int i2 = z90.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = vp0Var.f0;
            c71 c71Var2 = c71.X;
            dn8Var = dn8.a;
            if (j5 != j4) {
                vp0 vp0VarJ = x90Var.j(j4, vp0Var);
                if (vp0VarJ != null) {
                    vp0Var = vp0VarJ;
                } else if (zY) {
                    Object objE = E(q51Var, obj);
                    if (objE == c71Var2) {
                        return objE;
                    }
                }
            }
            int iN = x90Var.N(vp0Var, i3, obj, j2, null, zY);
            if (iN == 0) {
                vp0Var.a();
                return dn8Var;
            }
            if (iN != 1) {
                if (iN == 2) {
                    if (!zY) {
                        break;
                    }
                    vp0Var.i();
                    Object objE2 = E(q51Var, obj);
                    if (objE2 == c71Var2) {
                        return objE2;
                    }
                } else if (iN == 3) {
                    mm0 mm0VarT = u70.T(mb6.H(q51Var));
                    try {
                        int iN2 = N(vp0Var, i3, obj, j2, mm0VarT, false);
                        if (iN2 != 0) {
                            if (iN2 == 1) {
                                c71Var2 = c71Var2;
                                mm0VarT.f(dn8Var);
                            } else if (iN2 != 2) {
                                if (iN2 != 4) {
                                    String str = "unexpected";
                                    if (iN2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    vp0Var.a();
                                    vp0 vp0Var2 = (vp0) iu.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zY2 = y(andIncrement2, false);
                                        int i4 = z90.b;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                                        long j7 = i4;
                                        c71Var2 = c71Var2;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (vp0Var2.f0 != j8) {
                                            vp0 vp0VarJ2 = j(j8, vp0Var2);
                                            if (vp0VarJ2 != null) {
                                                i = i5;
                                                vp0Var2 = vp0VarJ2;
                                            } else if (zY2) {
                                            }
                                        } else {
                                            i = i5;
                                        }
                                        int iN3 = N(vp0Var2, i, obj, j6, mm0VarT, zY2);
                                        if (iN3 == 0) {
                                            vp0Var2.a();
                                        } else if (iN3 != 1) {
                                            if (iN3 == 2) {
                                                if (!zY2) {
                                                    mm0VarT.a(vp0Var2, i + i4);
                                                    break;
                                                }
                                                vp0Var2.i();
                                            } else {
                                                if (iN3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iN3 != 4) {
                                                    if (iN3 == 5) {
                                                        vp0Var2.a();
                                                    }
                                                    str = str;
                                                } else if (j6 < t()) {
                                                    vp0Var2.a();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c71Var2 = c71Var2;
                                    if (j2 < t()) {
                                        vp0Var.a();
                                    }
                                }
                                F(obj, mm0VarT);
                                break;
                            } else {
                                c71Var2 = c71Var2;
                                mm0VarT.a(vp0Var, i3 + i2);
                            }
                            objQ = mm0VarT.q();
                            c71Var = c71Var2;
                            if (objQ != c71Var) {
                                objQ = dn8Var;
                            }
                            if (objQ == c71Var) {
                                return objQ;
                            }
                        } else {
                            c71Var2 = c71Var2;
                            vp0Var.a();
                        }
                        mm0VarT.f(dn8Var);
                        objQ = mm0VarT.q();
                        c71Var = c71Var2;
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
                } else if (iN != 4) {
                    if (iN == 5) {
                        vp0Var.a();
                    }
                    x90Var = this;
                } else {
                    if (j2 < t()) {
                        vp0Var.a();
                    }
                    Object objE3 = E(q51Var, obj);
                    if (objE3 == c71Var2) {
                        return objE3;
                    }
                }
            } else {
                break;
            }
        }
        return dn8Var;
    }

    @Override // defpackage.n17
    public Object b(Object obj) {
        x90 x90Var = this;
        Unsafe unsafe = iu.a;
        long longVolatile = unsafe.getLongVolatile(x90Var, t0);
        long j = 1152921504606846975L;
        boolean z = x90Var.y(longVolatile, false) ? false : !x90Var.c(longVolatile & 1152921504606846975L);
        tp0 tp0Var = up0.b;
        if (z) {
            return tp0Var;
        }
        Object obj2 = z90.j;
        vp0 vp0Var = (vp0) unsafe.getObjectVolatile(x90Var, s0);
        while (true) {
            long andIncrement = f0.getAndIncrement(x90Var);
            long j2 = andIncrement & j;
            boolean zY = x90Var.y(andIncrement, false);
            int i = z90.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (vp0Var.f0 != j4) {
                vp0 vp0VarJ = x90Var.j(j4, vp0Var);
                if (vp0VarJ != null) {
                    vp0Var = vp0VarJ;
                } else {
                    if (zY) {
                        return new sp0(x90Var.u());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iN = x90Var.N(vp0Var, i2, obj, j2, obj2, zY);
            dn8 dn8Var = dn8.a;
            if (iN == 0) {
                vp0Var.a();
                return dn8Var;
            }
            if (iN == 1) {
                return dn8Var;
            }
            if (iN == 2) {
                if (zY) {
                    vp0Var.i();
                    return new sp0(u());
                }
                vz8 vz8Var = obj2 instanceof vz8 ? (vz8) obj2 : null;
                if (vz8Var != null) {
                    vz8Var.a(vp0Var, i2 + i);
                }
                vp0Var.i();
                return tp0Var;
            }
            if (iN == 3) {
                bt.i("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j2 < t()) {
                    vp0Var.a();
                }
                return new sp0(u());
            }
            if (iN == 5) {
                vp0Var.a();
            }
            j = 1152921504606846975L;
            x90Var = this;
        }
    }

    public final boolean c(long j) {
        return j < k() || j < t() + ((long) this.X);
    }

    public final boolean d(Throwable th) {
        return e(th, false);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z) {
            do {
                unsafe4 = iu.a;
                j4 = t0;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                vp0 vp0Var = z90.a;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        z31 z31Var = z90.s;
        while (true) {
            Unsafe unsafe5 = iu.a;
            long j5 = l0;
            if (unsafe5.compareAndSwapObject(this, j5, z31Var, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != z31Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = iu.a;
                j3 = t0;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = iu.a;
                j = t0;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        A();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = iu.a;
                long j6 = o0;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                z31 z31Var2 = objectVolatile == null ? z90.q : z90.r;
                do {
                    unsafe2 = iu.a;
                    if (unsafe2.compareAndSwapObject(this, o0, objectVolatile, z31Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                ci8.i(1, objectVolatile);
                ((gn2) objectVolatile).B(l());
                return z2;
            }
        }
        return z2;
    }

    public final vp0 f(long j) {
        i11 i11Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = iu.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, n0);
        vp0 vp0Var = (vp0) unsafe2.getObjectVolatile(this, s0);
        if (vp0Var.f0 > ((vp0) objectVolatile).f0) {
            objectVolatile = vp0Var;
        }
        vp0 vp0Var2 = (vp0) unsafe2.getObjectVolatile(this, q0);
        if (vp0Var2.f0 > ((vp0) objectVolatile).f0) {
            objectVolatile = vp0Var2;
        }
        i11 i11Var2 = (i11) objectVolatile;
        loop0: while (true) {
            i11Var = i11Var2;
            while (true) {
                int i = i11.Z;
                i11Var.getClass();
                Object objectVolatile2 = iu.a.getObjectVolatile(i11Var, i11.X);
                z31 z31Var = h11.a;
                if (objectVolatile2 == z31Var) {
                    break loop0;
                }
                i11Var2 = (i11) objectVolatile2;
                if (i11Var2 == null) {
                    do {
                        unsafe = iu.a;
                        j3 = i11.X;
                        if (unsafe.compareAndSwapObject(i11Var, j3, (Object) null, z31Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(i11Var, j3) == null);
                }
            }
        }
        vp0 vp0Var3 = (vp0) i11Var;
        if (B()) {
            vp0 vp0Var4 = vp0Var3;
            loop3: while (true) {
                int i2 = z90.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (vp0Var4.f0 * ((long) z90.b)) + ((long) i2);
                        if (j2 >= t()) {
                            while (true) {
                                Object objL = vp0Var4.l(i2);
                                if (objL != null && objL != z90.e) {
                                    if (objL != z90.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (vp0Var4.k(i2, objL, z90.l)) {
                                    vp0Var4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        vp0Var4 = (vp0) ((i11) iu.a.getObjectVolatile(vp0Var4, i11.Y));
                        if (vp0Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                g(j2);
            }
        }
        Object objF = null;
        loop6: for (vp0 vp0Var5 = vp0Var3; vp0Var5 != null; vp0Var5 = (vp0) ((i11) iu.a.getObjectVolatile(vp0Var5, i11.Y))) {
            for (int i3 = z90.b - 1; -1 < i3; i3--) {
                if ((vp0Var5.f0 * ((long) z90.b)) + ((long) i3) < j) {
                    break loop6;
                }
                while (true) {
                    Object objL2 = vp0Var5.l(i3);
                    if (objL2 != null && objL2 != z90.e) {
                        if (!(objL2 instanceof wz8)) {
                            if (!(objL2 instanceof vz8)) {
                                break;
                            }
                            if (vp0Var5.k(i3, objL2, z90.l)) {
                                objF = dh3.F(objF, objL2);
                                vp0Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (vp0Var5.k(i3, objL2, z90.l)) {
                                objF = dh3.F(objF, ((wz8) objL2).a);
                                vp0Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (vp0Var5.k(i3, objL2, z90.l)) {
                            vp0Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                J((vz8) objF, true);
                return vp0Var3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((vz8) arrayList.get(size), true);
            }
        }
        return vp0Var3;
    }

    public final void g(long j) {
        xl8 xl8VarT;
        vp0 vp0Var = (vp0) iu.a.getObjectVolatile(this, q0);
        while (true) {
            Unsafe unsafe = iu.a;
            long j2 = r0;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.X) + longVolatile, this.k())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = z90.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (vp0Var.f0 != j4) {
                    vp0 vp0VarI = this.i(j4, vp0Var);
                    if (vp0VarI != null) {
                        vp0Var = vp0VarI;
                    }
                }
                vp0 vp0Var2 = vp0Var;
                Object objM = this.M(vp0Var2, i, longVolatile, null);
                if (objM != z90.o) {
                    vp0Var2.a();
                    gn2 gn2Var = this.Y;
                    if (gn2Var != null && (xl8VarT = jm4.t(gn2Var, objM, null)) != null) {
                        throw xl8VarT;
                    }
                } else if (longVolatile < this.v()) {
                    vp0Var2.a();
                }
                vp0Var = vp0Var2;
            }
        }
    }

    public final void h() {
        Object objA;
        Unsafe unsafe;
        if (C()) {
            return;
        }
        Unsafe unsafe2 = iu.a;
        long j = n0;
        vp0 vp0Var = (vp0) unsafe2.getObjectVolatile(this, j);
        while (true) {
            long andIncrement = h0.getAndIncrement(this);
            long j2 = andIncrement / ((long) z90.b);
            if (v() <= andIncrement) {
                if (vp0Var.f0 < j2 && vp0Var.c() != null) {
                    D(j2, vp0Var);
                }
                w(1L);
                return;
            }
            if (vp0Var.f0 != j2) {
                y90 y90Var = y90.X;
                while (true) {
                    objA = h11.a(vp0Var, j2, y90Var);
                    if (!ys0.G(objA)) {
                        nz6 nz6VarC = ys0.C(objA);
                        while (true) {
                            nz6 nz6Var = (nz6) iu.a.getObjectVolatile(this, j);
                            if (nz6Var.f0 >= nz6VarC.f0) {
                                break;
                            }
                            if (!nz6VarC.j()) {
                                break;
                            }
                            do {
                                unsafe = iu.a;
                                if (unsafe.compareAndSwapObject(this, n0, nz6Var, nz6VarC)) {
                                    if (!nz6Var.f()) {
                                        break;
                                    }
                                    nz6Var.e();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j) == nz6Var);
                            if (nz6VarC.f()) {
                                nz6VarC.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                vp0 vp0Var2 = null;
                if (ys0.G(objA)) {
                    A();
                    D(j2, vp0Var);
                    w(1L);
                } else {
                    vp0 vp0Var3 = (vp0) ys0.C(objA);
                    long j3 = vp0Var3.f0;
                    if (j3 > j2) {
                        long j4 = ((long) z90.b) * j3;
                        if (iu.a.compareAndSwapLong(this, m0, 1 + andIncrement, j4)) {
                            w(j4 - andIncrement);
                        } else {
                            w(1L);
                        }
                    } else {
                        vp0Var2 = vp0Var3;
                    }
                }
                if (vp0Var2 == null) {
                    continue;
                } else {
                    vp0Var = vp0Var2;
                }
            }
            int i = (int) (andIncrement % ((long) z90.b));
            Object objL = vp0Var.l(i);
            boolean z = objL instanceof vz8;
            long j5 = r0;
            if (!z || andIncrement < iu.a.getLongVolatile(this, j5) || !vp0Var.k(i, objL, z90.g)) {
                while (true) {
                    Object objL2 = vp0Var.l(i);
                    if (objL2 instanceof vz8) {
                        if (andIncrement < iu.a.getLongVolatile(this, j5)) {
                            if (vp0Var.k(i, objL2, new wz8((vz8) objL2))) {
                                w(1L);
                                return;
                            }
                        } else if (vp0Var.k(i, objL2, z90.g)) {
                            if (!L(objL2, vp0Var, i)) {
                                vp0Var.o(i, z90.j);
                                vp0Var.i();
                                break;
                            } else {
                                vp0Var.o(i, z90.d);
                                w(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == z90.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (vp0Var.k(i, objL2, z90.e)) {
                                w(1L);
                                return;
                            }
                        } else if (objL2 == z90.d || objL2 == z90.h || objL2 == z90.i || objL2 == z90.k || objL2 == z90.l) {
                            w(1L);
                            return;
                        } else if (objL2 != z90.f) {
                            b61.o(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                w(1L);
            } else if (L(objL, vp0Var, i)) {
                vp0Var.o(i, z90.d);
                w(1L);
                return;
            } else {
                vp0Var.o(i, z90.j);
                vp0Var.i();
                w(1L);
            }
        }
    }

    public final vp0 i(long j, vp0 vp0Var) {
        Object objA;
        vp0 vp0Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        vp0 vp0Var3 = z90.a;
        y90 y90Var = y90.X;
        loop0: while (true) {
            objA = h11.a(vp0Var, j, y90Var);
            if (!ys0.G(objA)) {
                nz6 nz6VarC = ys0.C(objA);
                while (true) {
                    Unsafe unsafe3 = iu.a;
                    long j3 = q0;
                    nz6 nz6Var = (nz6) unsafe3.getObjectVolatile(this, j3);
                    if (nz6Var.f0 >= nz6VarC.f0) {
                        break loop0;
                    }
                    if (!nz6VarC.j()) {
                        break;
                    }
                    do {
                        unsafe2 = iu.a;
                        if (unsafe2.compareAndSwapObject(this, q0, nz6Var, nz6VarC)) {
                            if (!nz6Var.f()) {
                                break loop0;
                            }
                            nz6Var.e();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == nz6Var);
                    if (nz6VarC.f()) {
                        nz6VarC.e();
                    }
                }
            } else {
                break;
            }
        }
        if (ys0.G(objA)) {
            A();
            if (vp0Var.f0 * ((long) z90.b) < v()) {
                vp0Var.a();
                return null;
            }
        } else {
            vp0 vp0Var4 = (vp0) ys0.C(objA);
            long j4 = vp0Var4.f0;
            if (C() || j > k() / ((long) z90.b)) {
                vp0Var2 = vp0Var4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = iu.a;
                long j5 = n0;
                nz6 nz6Var2 = (nz6) unsafe4.getObjectVolatile(this, j5);
                if (nz6Var2.f0 >= j4 || !vp0Var4.j()) {
                    vp0Var2 = vp0Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = iu.a;
                    vp0Var2 = vp0Var4;
                    if (unsafe5.compareAndSwapObject(this, n0, nz6Var2, vp0Var4)) {
                        if (!nz6Var2.f()) {
                            break loop3;
                        }
                        nz6Var2.e();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != nz6Var2) {
                        break;
                    }
                    vp0Var4 = vp0Var2;
                }
                if (vp0Var2.f()) {
                    vp0Var2.e();
                }
                vp0Var4 = vp0Var2;
            }
            if (j4 <= j) {
                return vp0Var2;
            }
            long j6 = j4 * ((long) z90.b);
            do {
                unsafe = iu.a;
                j2 = r0;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) z90.b) < v()) {
                vp0Var2.a();
            }
        }
        return null;
    }

    @Override // defpackage.jp0
    public final q90 iterator() {
        return new q90(this);
    }

    public final vp0 j(long j, vp0 vp0Var) {
        Object objA;
        vp0 vp0Var2;
        long j2;
        Unsafe unsafe;
        x90 x90Var = this;
        vp0 vp0Var3 = z90.a;
        y90 y90Var = y90.X;
        loop0: while (true) {
            objA = h11.a(vp0Var, j, y90Var);
            if (!ys0.G(objA)) {
                nz6 nz6VarC = ys0.C(objA);
                while (true) {
                    Unsafe unsafe2 = iu.a;
                    long j3 = s0;
                    nz6 nz6Var = (nz6) unsafe2.getObjectVolatile(x90Var, j3);
                    if (nz6Var.f0 >= nz6VarC.f0) {
                        break loop0;
                    }
                    if (!nz6VarC.j()) {
                        break;
                    }
                    do {
                        unsafe = iu.a;
                        if (unsafe.compareAndSwapObject(x90Var, s0, nz6Var, nz6VarC)) {
                            if (!nz6Var.f()) {
                                break loop0;
                            }
                            nz6Var.e();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(x90Var, j3) == nz6Var);
                    if (nz6VarC.f()) {
                        nz6VarC.e();
                    }
                }
            } else {
                break;
            }
        }
        vp0 vp0Var4 = null;
        if (ys0.G(objA)) {
            x90Var.A();
            if (vp0Var.f0 * ((long) z90.b) >= x90Var.t()) {
                return null;
            }
            vp0Var.a();
            return null;
        }
        vp0 vp0Var5 = (vp0) ys0.C(objA);
        long j4 = vp0Var5.f0;
        if (j4 <= j) {
            return vp0Var5;
        }
        long j5 = j4 * ((long) z90.b);
        while (true) {
            Unsafe unsafe3 = iu.a;
            long j6 = t0;
            long longVolatile = unsafe3.getLongVolatile(x90Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                vp0Var2 = vp0Var4;
                j2 = j4;
                break;
            }
            vp0Var2 = vp0Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(x90Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            x90Var = this;
            vp0Var4 = vp0Var2;
            j4 = j2;
        }
        if (j2 * ((long) z90.b) >= t()) {
            return vp0Var2;
        }
        vp0Var5.a();
        return vp0Var2;
    }

    public final long k() {
        return iu.a.getLongVolatile(this, m0);
    }

    public final Throwable l() {
        return (Throwable) iu.a.getObjectVolatile(this, l0);
    }

    @Override // defpackage.jp0
    public final void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    @Override // defpackage.jp0
    public final yr6 n() {
        r90 r90Var = r90.X;
        ci8.i(3, r90Var);
        s90 s90Var = s90.X;
        ci8.i(3, s90Var);
        return new yr6(this, r90Var, s90Var, this.Z, (byte) 1);
    }

    @Override // defpackage.jp0
    public final yr6 o() {
        t90 t90Var = t90.X;
        ci8.i(3, t90Var);
        u90 u90Var = u90.X;
        ci8.i(3, u90Var);
        return new yr6(this, t90Var, u90Var, this.Z, (byte) 1);
    }

    public final Throwable p() {
        Throwable thL = l();
        return thL == null ? new xu0("Channel was closed") : thL;
    }

    @Override // defpackage.jp0
    public final Object q() {
        vp0 vp0Var;
        Unsafe unsafe = iu.a;
        long longVolatile = unsafe.getLongVolatile(this, r0);
        long longVolatile2 = unsafe.getLongVolatile(this, t0);
        if (y(longVolatile2, true)) {
            return new sp0(l());
        }
        long j = longVolatile2 & 1152921504606846975L;
        tp0 tp0Var = up0.b;
        if (longVolatile >= j) {
            return tp0Var;
        }
        Object obj = z90.k;
        vp0 vp0Var2 = (vp0) unsafe.getObjectVolatile(this, q0);
        while (!this.z()) {
            long andIncrement = g0.getAndIncrement(this);
            long j2 = z90.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (vp0Var2.f0 != j3) {
                vp0 vp0VarI = this.i(j3, vp0Var2);
                if (vp0VarI == null) {
                    continue;
                } else {
                    vp0Var = vp0VarI;
                }
            } else {
                vp0Var = vp0Var2;
            }
            x90 x90Var = this;
            Object objM = x90Var.M(vp0Var, i, andIncrement, obj);
            vp0Var2 = vp0Var;
            if (objM == z90.m) {
                vz8 vz8Var = obj instanceof vz8 ? (vz8) obj : null;
                if (vz8Var != null) {
                    vz8Var.a(vp0Var2, i);
                }
                x90Var.P(andIncrement);
                vp0Var2.i();
                return tp0Var;
            }
            if (objM != z90.o) {
                if (objM != z90.n) {
                    vp0Var2.a();
                    return objM;
                }
                bt.i("unexpected");
                return null;
            }
            if (andIncrement < x90Var.v()) {
                vp0Var2.a();
            }
            this = x90Var;
        }
        return new sp0(this.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [mm0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.jp0
    public final Object r(q51 q51Var) throws Throwable {
        vp0 vp0Var;
        Throwable th;
        ?? r1;
        mm0 mm0Var;
        vb vbVar;
        vp0 vp0Var2;
        Unsafe unsafe = iu.a;
        ?? r2 = q0;
        vp0 vp0Var3 = (vp0) unsafe.getObjectVolatile(this, (long) r2);
        while (!this.z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g0;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = z90.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (vp0Var3.f0 != j2) {
                vp0 vp0VarI = this.i(j2, vp0Var3);
                if (vp0VarI == null) {
                    continue;
                } else {
                    vp0Var = vp0VarI;
                }
            } else {
                vp0Var = vp0Var3;
            }
            x90 x90Var = this;
            Object objM = x90Var.M(vp0Var, i, andIncrement, null);
            z31 z31Var = z90.m;
            vb vbVar2 = null;
            if (objM == z31Var) {
                bt.i("unexpected");
                return null;
            }
            z31 z31Var2 = z90.o;
            if (objM == z31Var2) {
                if (andIncrement < x90Var.v()) {
                    vp0Var.a();
                }
                this = x90Var;
                vp0Var3 = vp0Var;
            } else {
                if (objM != z90.n) {
                    vp0Var.a();
                    return objM;
                }
                mm0 mm0VarT = u70.T(mb6.H(q51Var));
                try {
                    Object objM2 = x90Var.M(vp0Var, i, andIncrement, mm0VarT);
                    try {
                        if (objM2 == z31Var) {
                            mm0VarT.a(vp0Var, i);
                        } else {
                            gn2 gn2Var = x90Var.Y;
                            try {
                                if (objM2 == z31Var2) {
                                    if (andIncrement < x90Var.v()) {
                                        vp0Var.a();
                                    }
                                    vp0 vp0Var4 = (vp0) iu.a.getObjectVolatile(x90Var, (long) r2);
                                    while (true) {
                                        if (x90Var.z()) {
                                            mm0VarT.f(new rj6(x90Var.p()));
                                        } else {
                                            mm0 mm0Var2 = mm0VarT;
                                            try {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(x90Var);
                                                long j3 = z90.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (vp0Var4.f0 != j4) {
                                                    try {
                                                        vp0 vp0VarI2 = x90Var.i(j4, vp0Var4);
                                                        if (vp0VarI2 == null) {
                                                            mm0VarT = mm0Var2;
                                                        } else {
                                                            vp0Var2 = vp0VarI2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r1 = mm0Var2;
                                                        r1.C();
                                                        throw th;
                                                    }
                                                } else {
                                                    vp0Var2 = vp0Var4;
                                                }
                                                x90 x90Var2 = x90Var;
                                                objM2 = x90Var2.M(vp0Var2, i2, andIncrement2, mm0Var2);
                                                x90Var = x90Var2;
                                                vp0 vp0Var5 = vp0Var2;
                                                mm0Var = mm0Var2;
                                                if (objM2 == z90.m) {
                                                    mm0Var.a(vp0Var5, i2);
                                                } else if (objM2 == z90.o) {
                                                    if (andIncrement2 < x90Var.v()) {
                                                        vp0Var5.a();
                                                    }
                                                    vp0Var4 = vp0Var5;
                                                    mm0VarT = mm0Var;
                                                } else {
                                                    if (objM2 == z90.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    vp0Var5.a();
                                                    if (gn2Var != null) {
                                                        vbVar = new vb(3, x90Var, x90.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 4);
                                                        vbVar2 = vbVar;
                                                    }
                                                    mm0Var.y(objM2, vbVar2);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r2 = mm0Var2;
                                                th = th;
                                                r1 = r2;
                                                r1.C();
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    mm0Var = mm0VarT;
                                    vp0Var.a();
                                    if (gn2Var != null) {
                                        vbVar = new vb(3, x90Var, x90.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 4);
                                        vbVar2 = vbVar;
                                    }
                                    mm0Var.y(objM2, vbVar2);
                                }
                                return mm0Var.q();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        mm0Var = mm0VarT;
                        return mm0Var.q();
                    } catch (Throwable th5) {
                        th = th5;
                        r1 = mm0VarT;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r2 = mm0VarT;
                }
            }
        }
        Throwable thP = this.p();
        int i3 = gg7.a;
        throw thP;
    }

    @Override // defpackage.jp0
    public final Object s(yw0 yw0Var) {
        return G(this, yw0Var);
    }

    public final long t() {
        return iu.a.getLongVolatile(this, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = iu.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, t0) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.X + ',');
        sb.append("data=[");
        int i = 0;
        List listL = i21.L(unsafe.getObjectVolatile(this, q0), unsafe.getObjectVolatile(this, s0), unsafe.getObjectVolatile(this, n0));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((vp0) obj) != z90.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            bt.n();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((vp0) next).f0;
            do {
                Object next2 = it.next();
                long j2 = ((vp0) next2).f0;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        vp0 vp0Var = (vp0) next;
        long jT = t();
        long jV = v();
        loop2: while (true) {
            int i2 = z90.b;
            for (int i3 = i; i3 < i2; i3++) {
                long j3 = (vp0Var.f0 * ((long) z90.b)) + ((long) i3);
                if (j3 >= jV && j3 >= jT) {
                    break loop2;
                }
                Object objL = vp0Var.l(i3);
                Object obj2 = vp0Var.j0.get(i3 * 2);
                if (objL instanceof lm0) {
                    string = (jV > j3 || j3 >= jT) ? (jT > j3 || j3 >= jV) ? "cont" : "send" : "receive";
                } else if (objL instanceof tz6) {
                    string = (jV > j3 || j3 >= jT) ? (jT > j3 || j3 >= jV) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof h86) {
                    string = "receiveCatching";
                } else if (objL instanceof wz8) {
                    string = "EB(" + objL + ')';
                } else if (dh3.f(objL, z90.f) || dh3.f(objL, z90.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(z90.e) && !objL.equals(z90.i) && !objL.equals(z90.h) && !objL.equals(z90.k) && !objL.equals(z90.j) && !objL.equals(z90.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            vp0Var = (vp0) vp0Var.c();
            if (vp0Var == null) {
                break;
            }
            i = 0;
        }
        if (fm7.p0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thL = l();
        return thL == null ? new yu0("Channel was closed") : thL;
    }

    public final long v() {
        return iu.a.getLongVolatile(this, t0) & 1152921504606846975L;
    }

    public final void w(long j) {
        if ((i0.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((iu.a.getLongVolatile(this, p0) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean y(long j, boolean z) {
        x90 x90Var = this;
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                x90Var.f(j & 1152921504606846975L);
                if (z) {
                    while (true) {
                        Unsafe unsafe = iu.a;
                        long j2 = q0;
                        vp0 vp0VarI = (vp0) unsafe.getObjectVolatile(x90Var, j2);
                        long jT = x90Var.t();
                        if (x90Var.v() <= jT) {
                            break;
                        }
                        long j3 = z90.b;
                        long j4 = jT / j3;
                        if (vp0VarI.f0 != j4 && (vp0VarI = x90Var.i(j4, vp0VarI)) == null) {
                            if (((vp0) unsafe.getObjectVolatile(x90Var, j2)).f0 < j4) {
                                break;
                            }
                        } else {
                            vp0VarI.a();
                            int i2 = (int) (jT % j3);
                            while (true) {
                                Object objL = vp0VarI.l(i2);
                                if (objL != null && objL != z90.e) {
                                    if (objL != z90.d && (objL == z90.j || objL == z90.l || objL == z90.i || objL == z90.h || (objL != z90.g && (objL == z90.f || jT != x90Var.t())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (vp0VarI.k(i2, objL, z90.h)) {
                                        x90Var.h();
                                        break;
                                    }
                                    x90Var = this;
                                }
                            }
                            iu.a.compareAndSwapLong(x90Var, r0, jT, 1 + jT);
                            x90Var = this;
                        }
                    }
                }
            } else {
                if (i != 3) {
                    kp5.h(pc6.j(i, "unexpected close status: "));
                    return false;
                }
                vp0 vp0VarF = x90Var.f(j & 1152921504606846975L);
                xl8 xl8VarT = null;
                Object objF = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = vp0VarF.j0;
                    for (int i3 = z90.b - 1; -1 < i3; i3--) {
                        long j5 = (vp0VarF.f0 * ((long) z90.b)) + ((long) i3);
                        while (true) {
                            Object objL2 = vp0VarF.l(i3);
                            if (objL2 == z90.i) {
                                break loop0;
                            }
                            z31 z31Var = z90.d;
                            gn2 gn2Var = x90Var.Y;
                            if (objL2 != z31Var) {
                                if (objL2 != z90.e && objL2 != null) {
                                    if (!(objL2 instanceof vz8) && !(objL2 instanceof wz8)) {
                                        z31 z31Var2 = z90.g;
                                        if (objL2 == z31Var2 || objL2 == z90.f) {
                                            break loop0;
                                        }
                                        if (objL2 != z31Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < x90Var.t()) {
                                            break loop0;
                                        }
                                        vz8 vz8Var = objL2 instanceof wz8 ? ((wz8) objL2).a : (vz8) objL2;
                                        if (vp0VarF.k(i3, objL2, z90.l)) {
                                            if (gn2Var != null) {
                                                xl8VarT = jm4.t(gn2Var, atomicReferenceArray.get(i3 * 2), xl8VarT);
                                            }
                                            objF = dh3.F(objF, vz8Var);
                                            vp0VarF.n(i3, null);
                                            vp0VarF.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (vp0VarF.k(i3, objL2, z90.l)) {
                                        vp0VarF.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < x90Var.t()) {
                                    break loop0;
                                }
                                if (vp0VarF.k(i3, objL2, z90.l)) {
                                    if (gn2Var != null) {
                                        xl8VarT = jm4.t(gn2Var, atomicReferenceArray.get(i3 * 2), xl8VarT);
                                    }
                                    vp0VarF.n(i3, null);
                                    vp0VarF.i();
                                    break;
                                }
                            }
                        }
                    }
                    vp0VarF = (vp0) ((i11) iu.a.getObjectVolatile(vp0VarF, i11.Y));
                } while (vp0VarF != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x90Var.J((vz8) arrayList.get(size), false);
                        }
                    } else {
                        x90Var.J((vz8) objF, false);
                    }
                }
                if (xl8VarT != null) {
                    throw xl8VarT;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        return y(iu.a.getLongVolatile(this, t0), true);
    }
}
