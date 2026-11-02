package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tz6 implements em0, vz8 {
    public static final /* synthetic */ long h0 = iu.a.objectFieldOffset(tz6.class.getDeclaredField("state$volatile"));
    public final s61 X;
    public Object Z;
    private volatile /* synthetic */ Object state$volatile = uz6.a;
    public ArrayList Y = new ArrayList(2);
    public int f0 = -1;
    public Object g0 = uz6.d;

    public tz6(s61 s61Var) {
        this.X = s61Var;
    }

    public static Object d(tz6 tz6Var, uy7 uy7Var) {
        return iu.a.getObjectVolatile(tz6Var, h0) instanceof rz6 ? tz6Var.c(uy7Var) : tz6Var.e(uy7Var);
    }

    @Override // defpackage.vz8
    public final void a(nz6 nz6Var, int i) {
        this.Z = nz6Var;
        this.f0 = i;
    }

    @Override // defpackage.em0
    public final void b(Throwable th) {
        tz6 tz6Var;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == uz6.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = iu.a;
                tz6Var = this;
                if (unsafe2.compareAndSwapObject(tz6Var, h0, objectVolatile, uz6.c)) {
                    ArrayList arrayList = tz6Var.Y;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((rz6) it.next()).a();
                    }
                    tz6Var.g0 = uz6.d;
                    tz6Var.Y = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(tz6Var, j) != objectVolatile) {
                    break;
                } else {
                    this = tz6Var;
                }
            }
            this = tz6Var;
        }
    }

    public final Object c(s51 s51Var) {
        Unsafe unsafe = iu.a;
        long j = h0;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        rz6 rz6Var = (rz6) objectVolatile;
        Object obj = rz6Var.d;
        Object obj2 = this.g0;
        ArrayList<rz6> arrayList = this.Y;
        if (arrayList != null) {
            for (rz6 rz6Var2 : arrayList) {
                if (rz6Var2 != rz6Var) {
                    rz6Var2.a();
                }
            }
            iu.a.putObjectVolatile(this, j, uz6.b);
            this.g0 = uz6.d;
            this.Y = null;
        }
        Object objX = rz6Var.c.x(rz6Var.a, obj, obj2);
        on2 on2Var = rz6Var.e;
        return obj == uz6.e ? ((gn2) on2Var).B(s51Var) : ((rn2) on2Var).K(objX, s51Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object e(s51 s51Var) {
        sz6 sz6Var;
        Object obj;
        mm0 mm0Var;
        Unsafe unsafe;
        if (s51Var instanceof sz6) {
            sz6Var = (sz6) s51Var;
            int i = sz6Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                sz6Var.h0 = i - Integer.MIN_VALUE;
            } else {
                sz6Var = new sz6(this, s51Var);
            }
        } else {
            sz6Var = new sz6(this, s51Var);
        }
        sz6 sz6Var2 = sz6Var;
        Object obj2 = sz6Var2.f0;
        int i2 = sz6Var2.h0;
        Object obj3 = c71.X;
        if (i2 == 0) {
            w39.n0(obj2);
            sz6Var2.h0 = 1;
            mm0 mm0Var2 = new mm0(1, mb6.H(sz6Var2));
            mm0Var2.s();
            loop0: while (true) {
                Unsafe unsafe2 = iu.a;
                long j = h0;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                obj = dn8.a;
                mm0 mm0Var3 = mm0Var2;
                z31 z31Var = uz6.a;
                if (objectVolatile == z31Var) {
                    mm0 mm0Var4 = mm0Var3;
                    while (true) {
                        Unsafe unsafe3 = iu.a;
                        mm0Var = mm0Var4;
                        if (unsafe3.compareAndSwapObject(this, h0, objectVolatile, mm0Var4)) {
                            mm0Var.v(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        mm0Var4 = mm0Var;
                    }
                    mm0Var2 = mm0Var;
                } else {
                    mm0Var = mm0Var3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof rz6)) {
                            b61.o(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        rz6 rz6Var = (rz6) objectVolatile;
                        Object obj4 = this.g0;
                        sn2 sn2Var = rz6Var.f;
                        mm0Var.y(obj, sn2Var != null ? (sn2) sn2Var.x(this, rz6Var.d, obj4) : null);
                        break;
                    }
                    do {
                        unsafe = iu.a;
                        if (unsafe.compareAndSwapObject(this, h0, objectVolatile, z31Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                rz6 rz6VarF = f(it.next());
                                rz6VarF.getClass();
                                rz6VarF.g = null;
                                rz6VarF.h = -1;
                                h(rz6VarF, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    mm0Var2 = mm0Var;
                }
            }
            Object objQ = mm0Var.q();
            if (objQ == obj3) {
                obj = objQ;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(obj2);
                return obj2;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj2);
        sz6Var2.h0 = 2;
        Object objC = c(sz6Var2);
        return objC == obj3 ? obj3 : objC;
    }

    public final rz6 f(Object obj) {
        ArrayList arrayList = this.Y;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((rz6) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        rz6 rz6Var = (rz6) obj2;
        if (rz6Var != null) {
            return rz6Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(yr6 yr6Var, rn2 rn2Var) {
        h(new rz6(this, yr6Var.Y, (sn2) yr6Var.Z, (sn2) yr6Var.f0, null, (uy7) rn2Var, (sn2) yr6Var.g0), false);
    }

    public final void h(rz6 rz6Var, boolean z) {
        Object obj = rz6Var.a;
        Unsafe unsafe = iu.a;
        long j = h0;
        if (unsafe.getObjectVolatile(this, j) instanceof rz6) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.Y;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((rz6) it.next()).a == obj) {
                        kp5.h(oi0.k(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        rz6Var.b.x(obj, this, rz6Var.d);
        if (this.g0 != uz6.d) {
            iu.a.putObjectVolatile(this, j, rz6Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.Y;
            arrayList2.getClass();
            arrayList2.add(rz6Var);
        }
        rz6Var.g = this.Z;
        rz6Var.h = this.f0;
        this.Z = null;
        this.f0 = -1;
    }

    public final int i(Object obj, Object obj2) {
        tz6 tz6Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = iu.a;
            long j = h0;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof lm0) {
                rz6 rz6VarF = this.f(obj);
                if (rz6VarF != null) {
                    sn2 sn2Var = rz6VarF.f;
                    sn2 sn2Var2 = sn2Var != null ? (sn2) sn2Var.x(this, rz6VarF.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = iu.a;
                        tz6Var = this;
                        if (unsafe4.compareAndSwapObject(tz6Var, h0, objectVolatile, rz6VarF)) {
                            lm0 lm0Var = (lm0) objectVolatile;
                            tz6Var.g0 = obj2;
                            z31 z31VarJ = lm0Var.j(dn8.a, sn2Var2);
                            if (z31VarJ == null) {
                                tz6Var.g0 = uz6.d;
                                return 2;
                            }
                            lm0Var.E(z31VarJ);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(tz6Var, j) != objectVolatile) {
                            break;
                        }
                        this = tz6Var;
                    }
                } else {
                    continue;
                }
            } else {
                tz6Var = this;
                if (dh3.f(objectVolatile, uz6.b) || (objectVolatile instanceof rz6)) {
                    return 3;
                }
                if (dh3.f(objectVolatile, uz6.c)) {
                    return 2;
                }
                if (dh3.f(objectVolatile, uz6.a)) {
                    List listK = i21.K(obj);
                    do {
                        unsafe2 = iu.a;
                        if (unsafe2.compareAndSwapObject(tz6Var, h0, objectVolatile, listK)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(tz6Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        b61.o(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListI0 = wv0.I0((Collection) objectVolatile, obj);
                    do {
                        unsafe = iu.a;
                        if (unsafe.compareAndSwapObject(tz6Var, h0, objectVolatile, arrayListI0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(tz6Var, j) == objectVolatile);
                }
            }
            this = tz6Var;
        }
    }
}
