package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p86 extends m01 {
    public final ai a;
    public final f63 b;
    public final Object c;
    public bm3 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public t05 h;
    public final c15 i;
    public final ArrayList j;
    public final ArrayList k;
    public final s05 l;
    public final zz2 m;
    public final s05 n;
    public final s05 o;
    public ArrayList p;
    public t05 q;
    public mm0 r;
    public final oh7 s;
    public boolean t;
    public final oh7 u;
    public final f63 v;
    public final dm3 w;
    public final s61 x;
    public final g55 y;
    public static final oh7 z = ph7.a(lm5.f0);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public p86(s61 s61Var) {
        ai aiVar = new ai(new k86(this, (byte) 0));
        this.a = aiVar;
        this.b = new f63(new k86(this, (byte) 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new t05();
        this.i = new c15(0, new r01[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new s05();
        this.m = new zz2((byte) 15);
        this.n = new s05();
        this.o = new s05();
        this.s = ph7.a(null);
        this.u = ph7.a(m86.Z);
        this.v = new f63((byte) 28);
        dm3 dm3Var = new dm3((bm3) s61Var.H0(oy1.E0));
        dm3Var.D(new t16((Object) this, (byte) 2));
        this.w = dm3Var;
        this.x = s61Var.B0(aiVar).B0(dm3Var);
        this.y = new g55((byte) 10);
    }

    public static final void G(ArrayList arrayList, p86 p86Var, r01 r01Var) {
        arrayList.clear();
        synchronized (p86Var.c) {
            Iterator it = p86Var.k.iterator();
            if (it.hasNext()) {
                ((wy4) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(x05 x05Var) {
        try {
            if (x05Var.w() instanceof fd7) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            x05Var.c();
        } catch (Throwable th) {
            x05Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.Z != 0 || z() || B() || this.l.e != 0;
    }

    public final boolean B() {
        return !this.t && (((rv) ((y5) this.b.Z).g0).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.Z != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? d02.X : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        lm0 lm0VarY;
        synchronized (this.c) {
            lm0VarY = y();
            if (((m86) this.u.getValue()).compareTo(m86.Y) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (lm0VarY != null) {
            ((mm0) lm0VarY).f(dn8.a);
        }
    }

    public final void F(r01 r01Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((wy4) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, t05 t05Var) {
        x05 x05VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((wy4) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            r01 r01Var = (r01) entry.getKey();
            List list2 = (List) entry.getValue();
            if (r01Var.x0.F) {
                d01.a("Check failed");
            }
            t16 t16Var = new t16((Object) r01Var, (byte) 1);
            zw2 zw2Var = new zw2(r01Var, t05Var, (byte) 24);
            dd7 dd7VarH = kd7.h();
            x05 x05Var = dd7VarH instanceof x05 ? (x05) dd7VarH : null;
            if (x05Var == null || (x05VarC = x05Var.C(t16Var, zw2Var)) == null) {
                bt.i("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                dd7 dd7VarJ = x05VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                wy4 wy4Var = (wy4) list2.get(i2);
                                s05 s05Var = this.l;
                                wy4Var.getClass();
                                Object objA = kz4.a(s05Var);
                                arrayList.add(new qg5(wy4Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                qg5 qg5Var = (qg5) arrayList.get(i3);
                                if (qg5Var.Y == null) {
                                    zz2 zz2Var = this.m;
                                    ((wy4) qg5Var.X).getClass();
                                    if (((s05) zz2Var.Y).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            qg5 qg5Var2 = (qg5) arrayList.get(i4);
                                            if (qg5Var2.Y == null) {
                                                zz2 zz2Var2 = this.m;
                                                ((wy4) qg5Var2.X).getClass();
                                                s05 s05Var2 = (s05) zz2Var2.Y;
                                                if (s05Var2.i()) {
                                                    ((s05) zz2Var2.Z).a();
                                                }
                                            }
                                            arrayList3.add(qg5Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((qg5) arrayList.get(i5)).Y != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((qg5) arrayList.get(i6)).Y == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        qg5 qg5Var3 = (qg5) arrayList.get(i7);
                                        if (qg5Var3.Y == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        bw0.d0(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((qg5) obj2).Y != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    r01Var.r(arrayList);
                    dd7.q(dd7VarJ);
                    w(x05VarC);
                } catch (Throwable th2) {
                    dd7.q(dd7VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(x05VarC);
                throw th3;
            }
        }
        return wv0.Y0(map.keySet());
    }

    public final r01 I(r01 r01Var, t05 t05Var) {
        x05 x05VarC;
        if (r01Var.x0.F || r01Var.y0 == 3) {
            return null;
        }
        t05 t05Var2 = this.q;
        byte b = 1;
        if (t05Var2 == null || !t05Var2.c(r01Var)) {
            t16 t16Var = new t16(r01Var, b);
            zw2 zw2Var = new zw2(r01Var, t05Var, (byte) 24);
            dd7 dd7VarH = kd7.h();
            x05 x05Var = dd7VarH instanceof x05 ? (x05) dd7VarH : null;
            if (x05Var == null || (x05VarC = x05Var.C(t16Var, zw2Var)) == null) {
                bt.i("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    dd7 dd7VarJ = x05VarC.j();
                    if (t05Var != null) {
                        try {
                            if (t05Var.h()) {
                                a23 a23Var = new a23((Object) t05Var, (Object) r01Var, (byte) 14);
                                lp2 lp2Var = r01Var.x0;
                                if (lp2Var.F) {
                                    d01.a("Preparing a composition while composing is not supported");
                                }
                                lp2Var.F = true;
                                try {
                                    a23Var.invoke();
                                    lp2Var.F = false;
                                } catch (Throwable th) {
                                    lp2Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            dd7.q(dd7VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = r01Var.w();
                    dd7.q(dd7VarJ);
                    w(x05VarC);
                    if (zW) {
                        return r01Var;
                    }
                } catch (Throwable th3) {
                    w(x05VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, r01 r01Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof mz0)) {
            synchronized (this.c) {
                l86 l86Var = (l86) this.s.getValue();
                if (l86Var != null) {
                    throw l86Var.a;
                }
                oh7 oh7Var = this.s;
                l86 l86Var2 = new l86(th);
                oh7Var.getClass();
                oh7Var.n(null, l86Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                this.j.clear();
                this.i.g();
                this.h = new t05();
                this.k.clear();
                this.l.a();
                this.n.a();
                oh7 oh7Var2 = this.s;
                l86 l86Var3 = new l86(th);
                oh7Var2.getClass();
                oh7Var2.n(null, l86Var3);
                if (r01Var != null) {
                    L(r01Var);
                }
                if (y() != null) {
                    d01.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            ww6 ww6Var = new ww6(this.h);
            this.h = new t05();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((r01) listD.get(i)).x(ww6Var);
                    if (((m86) this.u.getValue()).compareTo(m86.Y) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    t05 t05Var = this.h;
                    int i2 = t05Var.d;
                    Iterator<E> it = ww6Var.iterator();
                    while (it.hasNext()) {
                        t05Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(r01 r01Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(r01Var)) {
            arrayList.add(r01Var);
        }
        if (this.f.remove(r01Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.m01
    public final void a(r01 r01Var, rn2 rn2Var) throws Throwable {
        m86 m86Var;
        byte b;
        boolean z2;
        x05 x05VarC;
        boolean z3 = r01Var.x0.F;
        synchronized (this.c) {
            m86 m86Var2 = (m86) this.u.getValue();
            m86Var = m86.Y;
            b = 1;
            z2 = m86Var2.compareTo(m86Var) > 0 ? !D().contains(r01Var) : true;
        }
        try {
            t16 t16Var = new t16(r01Var, b);
            zw2 zw2Var = new zw2(r01Var, null, (byte) 24);
            dd7 dd7VarH = kd7.h();
            x05 x05Var = dd7VarH instanceof x05 ? (x05) dd7VarH : null;
            if (x05Var == null || (x05VarC = x05Var.C(t16Var, zw2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dd7 dd7VarJ = x05VarC.j();
                try {
                    r01Var.j(rn2Var);
                    dd7.q(dd7VarJ);
                    w(x05VarC);
                    synchronized (this.c) {
                        if (((m86) this.u.getValue()).compareTo(m86Var) > 0 && !D().contains(r01Var)) {
                            this.f.add(r01Var);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        kd7.h().m();
                    }
                    try {
                        F(r01Var);
                        try {
                            r01Var.d();
                            r01Var.f();
                            if (z3) {
                                return;
                            }
                            kd7.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, r01Var);
                    }
                } catch (Throwable th3) {
                    dd7.q(dd7VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(x05VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th5, r01Var);
        }
    }

    @Override // defpackage.m01
    public final t05 b(r01 r01Var, u87 u87Var, rn2 rn2Var) {
        f63 f63Var = this.v;
        try {
            u87 u87Var2 = r01Var.r0;
            r01Var.r0 = u87Var;
            try {
                a(r01Var, rn2Var);
                t05 t05Var = (t05) f63Var.get();
                if (t05Var == null) {
                    t05Var = vw6.a;
                    t05Var.getClass();
                }
                r01Var.r0 = u87Var2;
                f63Var.A(null);
                return t05Var;
            } catch (Throwable th) {
                r01Var.r0 = u87Var2;
                throw th;
            }
        } catch (Throwable th2) {
            f63Var.A(null);
            throw th2;
        }
    }

    @Override // defpackage.m01
    public final s61 j() {
        return this.x;
    }

    @Override // defpackage.m01
    public final void l(r01 r01Var) {
        lm0 lm0VarY;
        synchronized (this.c) {
            if (this.i.h(r01Var)) {
                lm0VarY = null;
            } else {
                this.i.b(r01Var);
                lm0VarY = y();
            }
        }
        if (lm0VarY != null) {
            ((mm0) lm0VarY).f(dn8.a);
        }
    }

    @Override // defpackage.m01
    public final vy4 m(wy4 wy4Var) {
        vy4 vy4Var;
        synchronized (this.c) {
            vy4Var = (vy4) this.n.j(wy4Var);
        }
        return vy4Var;
    }

    @Override // defpackage.m01
    public final t05 n(r01 r01Var, u87 u87Var, t05 t05Var) {
        f63 f63Var = this.v;
        try {
            K();
            r01Var.x(new ww6(t05Var));
            u87 u87Var2 = r01Var.r0;
            r01Var.r0 = u87Var;
            try {
                r01 r01VarI = I(r01Var, null);
                if (r01VarI != null) {
                    F(r01Var);
                    r01VarI.d();
                    r01VarI.f();
                }
                t05 t05Var2 = (t05) f63Var.get();
                if (t05Var2 == null) {
                    t05Var2 = vw6.a;
                    t05Var2.getClass();
                }
                r01Var.r0 = u87Var2;
                f63Var.A(null);
                return t05Var2;
            } catch (Throwable th) {
                r01Var.r0 = u87Var2;
                throw th;
            }
        } catch (Throwable th2) {
            f63Var.A(null);
            throw th2;
        }
    }

    @Override // defpackage.m01
    public final void q(j86 j86Var) {
        f63 f63Var = this.v;
        t05 t05Var = (t05) f63Var.get();
        if (t05Var == null) {
            t05 t05Var2 = vw6.a;
            t05Var = new t05();
            f63Var.A(t05Var);
        }
        t05Var.a(j86Var);
    }

    @Override // defpackage.m01
    public final void r(r01 r01Var) {
        synchronized (this.c) {
            try {
                t05 t05Var = this.q;
                if (t05Var == null) {
                    t05 t05Var2 = vw6.a;
                    t05Var = new t05();
                    this.q = t05Var;
                }
                t05Var.a(r01Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m01
    public final pm0 s(tb2 tb2Var) {
        f63 f63Var = this.b;
        y5 y5Var = (y5) f63Var.Z;
        s45 s45Var = new s45();
        s45Var.a = tb2Var;
        return y5Var.p(s45Var, (a23) f63Var.f0);
    }

    @Override // defpackage.m01
    public final void v(r01 r01Var) {
        synchronized (this.c) {
            if (this.f.remove(r01Var)) {
                this.g = null;
            }
            this.i.j(r01Var);
            this.j.remove(r01Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((m86) this.u.getValue()).compareTo(m86.g0) >= 0) {
                oh7 oh7Var = this.u;
                m86 m86Var = m86.Y;
                oh7Var.getClass();
                oh7Var.n(null, m86Var);
            }
        }
        this.w.m(null);
    }

    public final lm0 y() {
        oh7 oh7Var = this.u;
        int iCompareTo = ((m86) oh7Var.getValue()).compareTo(m86.Y);
        oh7 oh7Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        c15 c15Var = this.i;
        if (iCompareTo > 0) {
            Object value = oh7Var2.getValue();
            m86 m86Var = m86.h0;
            m86 m86Var2 = m86.Z;
            if (value == null) {
                if (this.d == null) {
                    this.h = new t05();
                    c15Var.g();
                    if (z() || B()) {
                        m86Var2 = m86.f0;
                    }
                } else {
                    m86Var2 = (c15Var.Z == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !B() && this.l.e == 0) ? m86.g0 : m86Var;
                }
            }
            oh7Var.n(null, m86Var2);
            if (m86Var2 != m86Var) {
                return null;
            }
            mm0 mm0Var = this.r;
            this.r = null;
            return mm0Var;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = d02.X;
        this.h = new t05();
        c15Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        mm0 mm0Var2 = this.r;
        if (mm0Var2 != null) {
            mm0Var2.z(null);
        }
        this.r = null;
        oh7Var2.m(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((rv) ((y5) this.a.Z).g0).get() & 134217727) > 0;
    }
}
