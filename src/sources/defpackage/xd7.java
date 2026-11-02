package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd7 {
    public final gn2 a;
    public boolean c;
    public o61 h;
    public wd7 i;
    public final AtomicReference b = new AtomicReference(null);
    public final b1 d = new b1(this, 23);
    public final t16 e = new t16((Object) this, (byte) 21);
    public final c15 f = new c15(0, new wd7[16]);
    public final Object g = new Object();
    public long j = -1;

    public xd7(gn2 gn2Var) {
        this.a = gn2Var;
    }

    public final void a() {
        synchronized (this.g) {
            c15 c15Var = this.f;
            Object[] objArr = c15Var.X;
            int i = c15Var.Z;
            for (int i2 = 0; i2 < i; i2++) {
                wd7 wd7Var = (wd7) objArr[i2];
                wd7Var.e.a();
                wd7Var.f.a();
                wd7Var.l.a();
                wd7Var.m.clear();
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        d01.b("Unexpected notification");
                        b61.n();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                c15 c15Var = this.f;
                Object[] objArr = c15Var.X;
                int i = c15Var.Z;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((wd7) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj, gn2 gn2Var, dn2 dn2Var) {
        c15 c15Var;
        Object obj2;
        wd7 wd7Var;
        boolean z;
        wd7 wd7Var2;
        long j;
        long j2;
        wd7 wd7Var3;
        dd7 pe8Var;
        long j3;
        Object obj3;
        f05 f05Var;
        Object obj4;
        int i;
        long j4;
        f05 f05Var2;
        long jF = ry7.f();
        synchronized (this.g) {
            c15Var = this.f;
            Object[] objArr = c15Var.X;
            int i2 = c15Var.Z;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((wd7) obj2).a == gn2Var) {
                    break;
                } else {
                    i3++;
                }
            }
            wd7Var = (wd7) obj2;
            z = true;
            if (wd7Var == null) {
                gn2Var.getClass();
                ci8.i(1, gn2Var);
                wd7Var = new wd7(gn2Var);
                c15Var.b(wd7Var);
            }
            wd7Var2 = this.i;
            j = this.j;
        }
        Object obj5 = c15Var;
        if (j != -1 && j != jF) {
            obj5 = c15Var;
            String name = Thread.currentThread().getName();
            StringBuilder sbS = pc6.s(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbS.append(jF);
            sbS.append(", name=");
            sbS.append(name);
            sbS.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            wr5.a(sbS.toString());
            obj5 = sbS;
        }
        try {
            obj5 = c15Var;
            synchronized (this.g) {
                try {
                    this.i = wd7Var;
                    this.j = jF;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj5;
                }
            }
            t16 t16Var = this.e;
            Object obj6 = wd7Var.b;
            f05 f05Var3 = wd7Var.c;
            int i4 = wd7Var.d;
            wd7Var.b = obj;
            wd7Var.c = (f05) wd7Var.f.g(obj);
            if (wd7Var.d == -1) {
                wd7Var.d = Long.hashCode(kd7.h().g());
            }
            kp2 kp2Var = wd7Var.i;
            c15 c15VarA = rd7.a();
            try {
                c15VarA.b(kp2Var);
                if (t16Var == null) {
                    dn2Var.invoke();
                    wd7Var3 = wd7Var;
                } else {
                    dd7 dd7Var = (dd7) kd7.b.get();
                    if (dd7Var instanceof pe8) {
                        wd7Var3 = wd7Var;
                        if (((pe8) dd7Var).t == ry7.f()) {
                            gn2 gn2Var2 = ((pe8) dd7Var).r;
                            gn2 gn2Var3 = ((pe8) dd7Var).s;
                            try {
                                ((pe8) dd7Var).r = kd7.i(t16Var, gn2Var2, true);
                                ((pe8) dd7Var).s = gn2Var3;
                                dn2Var.invoke();
                                ((pe8) dd7Var).r = gn2Var2;
                                ((pe8) dd7Var).s = gn2Var3;
                            } catch (Throwable th2) {
                                ((pe8) dd7Var).r = gn2Var2;
                                ((pe8) dd7Var).s = gn2Var3;
                                throw th2;
                            }
                        }
                    } else {
                        wd7Var3 = wd7Var;
                    }
                    if (dd7Var == null || (dd7Var instanceof x05)) {
                        pe8Var = new pe8(dd7Var instanceof x05 ? (x05) dd7Var : null, t16Var, null, true, false);
                    } else {
                        pe8Var = dd7Var.u(t16Var);
                    }
                    try {
                        dd7 dd7VarJ = pe8Var.j();
                        try {
                            dn2Var.invoke();
                            dd7.q(dd7VarJ);
                            pe8Var.c();
                        } catch (Throwable th3) {
                            try {
                                dd7.q(dd7VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    pe8Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c15VarA.k(c15VarA.Z - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                c15VarA.k(c15VarA.Z - 1);
                wd7 wd7Var4 = wd7Var3;
                Object obj7 = wd7Var4.b;
                obj7.getClass();
                int i5 = wd7Var4.d;
                f05 f05Var4 = wd7Var4.c;
                if (f05Var4 != null) {
                    try {
                        long[] jArr = f05Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                f05 f05Var5 = f05Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            f05Var2 = f05Var5;
                                            Object obj8 = f05Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = f05Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    s05 s05Var = wd7Var4.e;
                                                    w39.i0(s05Var, obj8, obj7);
                                                    obj4 = obj7;
                                                    if ((obj8 instanceof zi1) && !s05Var.c(obj8)) {
                                                        w39.j0(wd7Var4.l, obj8);
                                                        wd7Var4.m.remove(obj8);
                                                    }
                                                } else {
                                                    obj4 = obj7;
                                                }
                                                if (z3) {
                                                    f05Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = wd7Var2;
                                                    this.j = j2;
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            obj4 = obj7;
                                            i = i8;
                                            j4 = j5;
                                            f05Var2 = f05Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        f05Var5 = f05Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                        obj7 = obj4;
                                    }
                                    obj3 = obj7;
                                    f05Var = f05Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    obj3 = obj7;
                                    f05Var = f05Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                f05Var4 = f05Var;
                                z = z2;
                                j = j3;
                                obj7 = obj3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = wd7Var2;
                            this.j = j2;
                        }
                        throw th;
                    }
                } else {
                    j3 = j;
                }
                wd7Var4.b = obj6;
                wd7Var4.c = f05Var3;
                wd7Var4.d = i4;
                synchronized (this.g) {
                    this.i = wd7Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void d() {
        b1 b1Var = this.d;
        kd7.b(kd7.a);
        synchronized (kd7.c) {
            kd7.h = wv0.I0(kd7.h, b1Var);
        }
        this.h = new o61(b1Var, (byte) 26);
    }
}
