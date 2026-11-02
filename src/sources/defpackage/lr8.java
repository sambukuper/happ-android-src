package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lr8 {
    public final rj0 a;
    public final vh0 b;
    public final mj0 c;
    public final t79 d;
    public final dj4 e;
    public final ok0 f;
    public final v06 g;
    public final v06 h;
    public final bm0 i;
    public final mi0 j;
    public final Object k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LinkedHashSet q;
    public final lv4 r;
    public final mx7 s;
    public final o8 t;
    public final py7 u;
    public volatile t5 v;
    public final ArrayList w;
    public final Set x;

    public lr8(rj0 rj0Var, vh0 vh0Var, mj0 mj0Var, t79 t79Var, dj4 dj4Var, Set set, xe0 xe0Var, ok0 ok0Var, yr2 yr2Var, v06 v06Var, v06 v06Var2, w02 w02Var, qj0 qj0Var, bm0 bm0Var, mi0 mi0Var, Context context, wp1 wp1Var) {
        vh0Var.getClass();
        t79Var.getClass();
        dj4Var.getClass();
        set.getClass();
        xe0Var.getClass();
        ok0Var.getClass();
        yr2Var.getClass();
        v06Var.getClass();
        v06Var2.getClass();
        w02Var.getClass();
        qj0Var.getClass();
        mi0Var.getClass();
        this.a = rj0Var;
        this.b = vh0Var;
        this.c = mj0Var;
        this.d = t79Var;
        this.e = dj4Var;
        this.f = ok0Var;
        this.g = yr2Var;
        this.h = v06Var2;
        this.i = bm0Var;
        this.j = mi0Var;
        this.k = new Object();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.o = true;
        this.p = true;
        this.q = new LinkedHashSet();
        this.r = new lv4(qj0Var, new kv4(), wp1Var);
        jj0 jj0Var = qj0Var.b;
        this.s = new mx7(context, jj0Var, w02Var, m82.o);
        this.t = new o8(jj0Var);
        this.u = new py7((Object) this, (byte) 11);
        this.w = new ArrayList();
        Set setB1 = wv0.b1(set);
        setB1.add(xe0Var);
        this.x = setB1;
    }

    public final void a(hq8 hq8Var) {
        hq8Var.getClass();
        synchronized (this.k) {
            if (this.m.add(hq8Var)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.X.a(bm0.n0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSet)) {
            c();
            return true;
        }
        if (!linkedHashSet.contains(this.r) || j(linkedHashSet)) {
            return false;
        }
        lv4 lv4Var = this.r;
        lv4Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(lv4Var)) {
                l();
            }
        }
        g(i21.K(lv4Var));
        lv4Var.F((cj0) this.g.get());
        return true;
    }

    public final void c() {
        cj0 cj0Var = (cj0) this.g.get();
        lv4 lv4Var = this.r;
        lv4Var.b(cj0Var, null, null, null);
        lv4Var.H(iz.a(nv4.a).b(), null);
        d(i21.K(lv4Var));
        a(lv4Var);
    }

    public final void d(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (hi5.m0()) {
                    toString();
                }
                return;
            }
            if (hi5.i0("CXCP")) {
                list.toString();
                toString();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((hq8) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((hq8) it.next()).x();
            }
            if (this.l.addAll(list) && !b(wv0.v0(this.l, this.m))) {
                n();
                this.e.a(wv0.Y0(this.l));
                k(this.l);
            }
            if (this.o) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((hq8) it2.next()).u();
                }
            } else {
                this.q.addAll(arrayList);
            }
        }
    }

    public final Object e(uy7 uy7Var) {
        List listY0;
        synchronized (this.k) {
            f();
            this.r.B();
            listY0 = wv0.Y0(this.w);
        }
        Object objY = jb5.y(listY0, uy7Var);
        return objY == c71.X ? objY : dn8.a;
    }

    public final void f() {
        bm3 bm3VarA;
        nq8 nq8VarH = h();
        this.v = null;
        vh0 vh0Var = this.b;
        xi0 xi0Var = (xi0) this.h.get();
        vh0Var.getClass();
        xi0Var.getClass();
        synchronized (vh0Var.b) {
            try {
                if (vh0Var.f) {
                    ArrayList arrayList = vh0Var.d;
                    jj0 jj0Var = (jj0) ci8.Q(xi0Var, yb6.a.b(jj0.class));
                    String str = jj0Var != null ? ((lf0) jj0Var).X : null;
                    vi0 vi0Var = str != null ? new vi0(str) : null;
                    if (vi0Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(vi0Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nq8VarH != null) {
            if (nq8VarH.h.a()) {
                nq8VarH.c.close();
                bm3VarA = w51.G(nq8VarH.b.f, null, null, new mq8(null, nq8VarH), 3);
            } else {
                bm3VarA = vr3.a(dn8.a);
            }
            this.w.add(bm3VarA);
            bm3VarA.D(new gq6(this, bm3VarA, (byte) 22));
        }
        synchronized (this.k) {
        }
    }

    public final void g(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (hi5.m0()) {
                    toString();
                }
                return;
            }
            if (hi5.i0("CXCP")) {
                list.toString();
                toString();
            }
            this.m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hq8 hq8Var = (hq8) it.next();
                if (this.l.contains(hq8Var)) {
                    hq8Var.y();
                }
            }
            if (this.l.removeAll(list)) {
                if (b(wv0.v0(this.l, this.m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.d.d(false);
                    this.e.a(d02.X);
                } else {
                    n();
                    this.e.a(wv0.Y0(this.l));
                }
                k(this.l);
            }
            this.q.removeAll(list);
        }
    }

    public final nq8 h() {
        t5 t5Var = this.v;
        if (t5Var != null) {
            return (nq8) ((u06) t5Var.o0).get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i() {
        boolean z;
        synchronized (this.k) {
            vh0 vh0Var = this.b;
            synchronized (vh0Var.b) {
                z = vh0Var.e;
            }
            return z == 2 ? 1 : 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    public final boolean j(LinkedHashSet linkedHashSet) {
        boolean z;
        mx7 mx7Var;
        boolean z2;
        ?? r20;
        byte b;
        int i;
        boolean zA;
        er8 er8Var;
        ?? r0;
        List listK;
        if (((Boolean) this.i.X.a(bm0.n0, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                hq8 hq8Var = (hq8) it.next();
                lv4 lv4Var = this.r;
                if (!dh3.f(hq8Var, lv4Var)) {
                    List listB = hq8Var.o.b();
                    listB.getClass();
                    if (!listB.isEmpty()) {
                        ArrayList<hq8> arrayList = new ArrayList();
                        for (Object obj : this.l) {
                            if (!dh3.f((hq8) obj, lv4Var)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                            e57 e57Var = new e57();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                e57Var.a(((hq8) it2.next()).o);
                            }
                            f57 f57VarB = e57Var.b();
                            List listUnmodifiableList = Collections.unmodifiableList(f57VarB.g.a);
                            listUnmodifiableList.getClass();
                            List listB2 = f57VarB.b();
                            listB2.getClass();
                            if (!listB2.isEmpty()) {
                                if (listB2.isEmpty()) {
                                    z = true;
                                    break;
                                }
                                Iterator it3 = listB2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    if (!dh3.f(((wg1) it3.next()).j, MediaCodec.class)) {
                                        z = false;
                                        break;
                                    }
                                }
                                boolean zIsEmpty = listUnmodifiableList.isEmpty();
                                if (!z && !zIsEmpty) {
                                    break;
                                }
                                if (lv4Var.c() == null) {
                                    lv4Var.H(iz.a(nv4.a).b(), null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    boolean zHasNext = it4.hasNext();
                                    mx7Var = this.s;
                                    if (!zHasNext) {
                                        z2 = true;
                                        r20 = 0;
                                        break;
                                    }
                                    hq8 hq8Var2 = (hq8) it4.next();
                                    Size sizeC = hq8Var2.c();
                                    iz izVar = hq8Var2.i;
                                    if (sizeC == null || izVar == null) {
                                        z2 = true;
                                        r20 = 0;
                                        hi5.m0();
                                        arrayList2.clear();
                                        break;
                                    }
                                    rx7 rx7VarP = mx7Var.p(i(), hq8Var2.h.n(), sizeC, hq8Var2.h.r());
                                    int iN = hq8Var2.h.n();
                                    px1 px1Var = izVar.c;
                                    if (hq8Var2 instanceof gl7) {
                                        er8 er8Var2 = ((gl7) hq8Var2).h;
                                        er8Var2.getClass();
                                        listK = (List) ((hl7) er8Var2).d(hl7.Y);
                                        listK.getClass();
                                    } else {
                                        listK = i21.K(hq8Var2.h.s());
                                    }
                                    List list = listK;
                                    l11 l11VarJ = izVar.f;
                                    if (l11VarJ == null) {
                                        l11VarJ = k05.j();
                                    }
                                    l11 l11Var = l11VarJ;
                                    int i2 = izVar.d;
                                    Range range = izVar.e;
                                    Boolean bool = (Boolean) hq8Var2.h.a(er8.S, Boolean.FALSE);
                                    Objects.requireNonNull(bool);
                                    arrayList2.add(new rx(rx7VarP, iN, sizeC, px1Var, list, l11Var, i2, range, bool.booleanValue(), hq8Var2.h.v(sizeC)));
                                    it4 = it4;
                                }
                                if (arrayList2.isEmpty()) {
                                    r0 = r20;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (hq8 hq8Var3 : arrayList) {
                                        List<wg1> listB3 = hq8Var3.o.b();
                                        listB3.getClass();
                                        for (wg1 wg1Var : listB3) {
                                            int i3 = i();
                                            int iN2 = hq8Var3.h.n();
                                            Size size = wg1Var.h;
                                            size.getClass();
                                            arrayList3.add(mx7Var.p(i3, iN2, size, hq8Var3.h.r()));
                                        }
                                    }
                                    int i4 = i();
                                    Iterator it5 = this.t.n(arrayList2, i21.K(lv4Var.h), i21.K(Integer.valueOf((int) r20))).entrySet().iterator();
                                    while (true) {
                                        b = 10;
                                        if (!it5.hasNext()) {
                                            i = 8;
                                            break;
                                        }
                                        if (((px1) ((Map.Entry) it5.next()).getValue()).b == 10) {
                                            i = 10;
                                            break;
                                        }
                                    }
                                    boolean zB = ts7.b(arrayList);
                                    lv8 lv8VarE = ts7.e(arrayList, new b58(b));
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : arrayList) {
                                        if (obj2 instanceof x53) {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    x53 x53Var = (x53) wv0.t0(arrayList4);
                                    ?? r26 = (x53Var == null || (er8Var = x53Var.h) == null || er8Var.n() != 4101) ? r20 : z2;
                                    Range range2 = iz.h;
                                    range2.getClass();
                                    lx7 lx7Var = new lx7(i4, i, zB, lv8VarE, r26, false, false, false, range2, false);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList3);
                                    int i5 = i();
                                    int iN3 = lv4Var.h.n();
                                    Size sizeC2 = lv4Var.c();
                                    sizeC2.getClass();
                                    arrayList5.add(mx7Var.p(i5, iN3, sizeC2, lv4Var.h.r()));
                                    d02 d02Var = d02.X;
                                    zA = this.s.a(lx7Var, arrayList5, e02.X, d02Var, d02Var);
                                    r0 = zA;
                                    if (hi5.i0("CXCP")) {
                                        arrayList3.toString();
                                        Objects.toString(lv4Var);
                                    }
                                }
                                if (r0 != 0) {
                                    r0 = zA;
                                    return z2;
                                }
                                r0 = zA;
                                return r20;
                            }
                            break;
                        }
                        break;
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(LinkedHashSet linkedHashSet) {
        f();
        List listY0 = wv0.Y0(linkedHashSet);
        Object[] objArr = 0;
        if (listY0.isEmpty()) {
            for (kq8 kq8Var : this.x) {
                kq8Var.b(null);
                kq8Var.reset();
            }
            return;
        }
        if (!this.o) {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((kq8) it.next()).b(null);
            }
        }
        st2 st2Var = new st2(this.f);
        synchronized (this.k) {
        }
        h57 h57Var = new h57(listY0, this.p);
        mi0 mi0Var = this.j;
        py7 py7Var = this.u;
        synchronized (this.k) {
        }
        mi0Var.getClass();
        py7Var.getClass();
        jq8 jq8Var = new jq8(py7Var, st2Var, h57Var, new vz7(new g00((Object) h57Var, (Object) mi0Var, (Object) st2Var, (byte) 19)));
        if (!this.o) {
            vh0 vh0Var = this.b;
            xi0 xi0Var = (xi0) this.h.get();
            vh0Var.getClass();
            xi0Var.getClass();
            synchronized (vh0Var.b) {
                try {
                    if (vh0Var.f) {
                        ArrayList arrayList = vh0Var.d;
                        jj0 jj0Var = (jj0) ci8.Q(xi0Var, yb6.a.b(jj0.class));
                        String str = jj0Var != null ? ((lf0) jj0Var).X : null;
                        vi0 vi0Var = str != null ? new vi0(str) : null;
                        if (vi0Var == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(vi0Var.a);
                        synchronized (vh0Var.b) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        mj0 mj0Var = this.c;
        this.v = new t5((l91) mj0Var.Y, (n91) mj0Var.Z, jq8Var);
        nq8 nq8VarH = h();
        if (nq8VarH == null) {
            bt.i("Required value was null.");
            return;
        }
        w51.G(nq8VarH.b.f, null, null, new l40((q51) (objArr == true ? 1 : 0), (Object) nq8VarH, (byte) 17), 3);
        Iterator it2 = this.x.iterator();
        while (it2.hasNext()) {
            ((kq8) it2.next()).b(nq8VarH.c);
        }
        w51.G(nq8VarH.b.f, null, null, new mq8(null, nq8VarH, this.n), 3);
        m(wv0.v0(this.l, this.m));
        if (hi5.i0("CXCP")) {
            Objects.toString(this.q);
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            ((hq8) it3.next()).u();
        }
        this.q.clear();
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSetV0 = wv0.v0(this.l, this.m);
        if (((Boolean) this.i.X.a(bm0.n0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSetV0)) {
            c();
            return;
        }
        if (!linkedHashSetV0.contains(this.r) || j(linkedHashSetV0)) {
            m(linkedHashSetV0);
            return;
        }
        lv4 lv4Var = this.r;
        lv4Var.getClass();
        synchronized (this.k) {
            if (this.m.remove(lv4Var)) {
                l();
            }
        }
        g(i21.K(lv4Var));
        lv4Var.F((cj0) this.g.get());
    }

    public final void m(LinkedHashSet linkedHashSet) {
        nq8 nq8VarH = h();
        if (nq8VarH != null) {
            nq8VarH.c.f(linkedHashSet, this.p);
            for (kq8 kq8Var : this.x) {
                if (kq8Var instanceof kr8) {
                    ((kr8) kq8Var).a(linkedHashSet);
                }
            }
        }
    }

    public final void n() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((hq8) it.next()).h.a(er8.U, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.d(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
