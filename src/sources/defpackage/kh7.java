package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kh7 implements kq8, kr8 {
    public final qj0 a;
    public final ax b;
    public final pr8 c;
    public final Object d;
    public qq8 e;
    public final ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public Integer k;

    public kh7(qj0 qj0Var, ax axVar, pr8 pr8Var) {
        qj0Var.getClass();
        pr8Var.getClass();
        this.a = qj0Var;
        this.b = axVar;
        this.c = pr8Var;
        this.d = new Object();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 1;
    }

    @Override // defpackage.kr8
    public final void a(LinkedHashSet linkedHashSet) {
        q51 q51Var = null;
        w51.G(this.c.f, null, null, new ar6(q51Var, (Object) wv0.c1(linkedHashSet), (Object) this, (byte) 4), 3);
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.e = qq8Var;
        f();
    }

    public final void c(Exception exc) {
        List listY0;
        synchronized (this.d) {
            listY0 = wv0.Y0(this.f);
            this.f.clear();
        }
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            ((ux0) it.next()).l0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int iM;
        if (num != null) {
            iM = num.intValue();
        } else if (i != 0) {
            iM = i != 1 ? 1 : 3;
        } else {
            iM = this.b.M();
        }
        if (z && vj8.T(this.a.b)) {
            hi5.i0("CXCP");
            iM = 5;
        }
        hi5.i0("CXCP");
        return iM;
    }

    public final int e() {
        int iP;
        synchronized (this.d) {
            iP = vj8.P(this.a.b, d(this.h, this.j, this.k));
        }
        return iP;
    }

    public final ux0 f() {
        ux0 ux0Var = new ux0();
        da6 da6Var = new da6();
        synchronized (this.d) {
            this.f.add(ux0Var);
            long j = this.g + 1;
            this.g = j;
            da6Var.X = j;
        }
        w51.G(this.c.f, null, null, new ar6((q51) null, (Object) this, (Object) da6Var, (byte) 5), 3);
        return ux0Var;
    }

    @Override // defpackage.kq8
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}
