package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt5 extends hq8 {
    public static final jt5 x = new jt5();
    public static final ScheduledExecutorService y = km4.J();
    public kt5 q;
    public Executor r;
    public b57 s;
    public v73 t;
    public xx7 u;
    public hy7 v;
    public c57 w;

    @Override // defpackage.hq8
    public final iz A(iz izVar, iz izVar2) {
        Objects.toString(izVar);
        Objects.toString(izVar2);
        hi5.z0("Preview");
        K((mt5) this.h, izVar);
        return izVar;
    }

    @Override // defpackage.hq8
    public final void B() {
        I();
    }

    @Override // defpackage.hq8
    public final void E(Rect rect) {
        this.k = rect;
        cj0 cj0VarD = d();
        xx7 xx7Var = this.u;
        if (cj0VarD == null || xx7Var == null) {
            return;
        }
        s08.g(new vx7(xx7Var, i(cj0VarD, o(cj0VarD)), ((Integer) ((i63) this.h).a(i63.u, -1)).intValue()));
    }

    public final void I() {
        c57 c57Var = this.w;
        if (c57Var != null) {
            c57Var.b();
            this.w = null;
        }
        v73 v73Var = this.t;
        if (v73Var != null) {
            v73Var.a();
            this.t = null;
        }
        xx7 xx7Var = this.u;
        if (xx7Var != null) {
            xx7Var.b();
            this.u = null;
        }
        hy7 hy7Var = this.v;
        if (hy7Var != null) {
            synchronized (hy7Var.a) {
                hy7Var.m = null;
                hy7Var.n = null;
            }
        }
        this.v = null;
    }

    public final void J(kt5 kt5Var) {
        s08.b();
        if (kt5Var == null) {
            this.q = null;
            this.d = 2;
            s();
        } else {
            this.q = kt5Var;
            this.r = y;
            if (c() != null) {
                K((mt5) this.h, this.i);
                r();
            }
            q();
        }
    }

    public final void K(mt5 mt5Var, iz izVar) {
        s08.b();
        cj0 cj0VarD = d();
        Objects.requireNonNull(cj0VarD);
        I();
        byte b = 1;
        mb6.s(null, this.u == null);
        Matrix matrix = this.l;
        boolean zQ = cj0VarD.q();
        Size size = izVar.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int i = i(cj0VarD, o(cj0VarD));
        i63 i63Var = (i63) this.h;
        zx zxVar = i63.u;
        xx7 xx7Var = new xx7(1, 34, izVar, matrix, zQ, rect, i, ((Integer) i63Var.a(zxVar, -1)).intValue(), cj0VarD.q() && o(cj0VarD));
        this.u = xx7Var;
        c1 c1Var = new c1(this, (byte) 27);
        s08.b();
        xx7Var.a();
        xx7Var.m.add(c1Var);
        hy7 hy7VarC = this.u.c(cj0VarD, true);
        this.v = hy7VarC;
        this.t = hy7VarC.k;
        if (this.q != null) {
            cj0 cj0VarD2 = d();
            xx7 xx7Var2 = this.u;
            if (cj0VarD2 != null && xx7Var2 != null) {
                s08.g(new vx7(xx7Var2, i(cj0VarD2, o(cj0VarD2)), ((Integer) ((i63) this.h).a(zxVar, -1)).intValue()));
            }
            kt5 kt5Var = this.q;
            kt5Var.getClass();
            hy7 hy7Var = this.v;
            hy7Var.getClass();
            this.r.execute(new sc4(kt5Var, hy7Var, (byte) 5));
        }
        b57 b57VarD = b57.d(mt5Var, izVar.a);
        xm0 xm0Var = b57VarD.b;
        b57VarD.h = izVar.d;
        a(b57VarD, izVar);
        int iB = mt5Var.B();
        if (iB != 0 && iB != 0) {
            ((k05) xm0Var.g0).o(er8.a0, Integer.valueOf(iB));
        }
        l11 l11Var = izVar.f;
        if (l11Var != null) {
            xm0Var.d(l11Var);
        }
        if (this.q != null) {
            b57VarD.b(this.t, izVar.c, ((Integer) ((i63) this.h).a(i63.v, -1)).intValue());
        }
        c57 c57Var = this.w;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new t53(this, b));
        this.w = c57Var2;
        b57VarD.f = c57Var2;
        this.s = b57VarD;
        Object[] objArr = {b57VarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.hq8
    public final er8 g(boolean z, hr8 hr8Var) {
        x.getClass();
        mt5 mt5Var = jt5.a;
        l11 l11VarA = hr8Var.a(mt5Var.s(), 1);
        if (z) {
            l11VarA = l11.q(l11VarA, mt5Var);
        }
        if (l11VarA == null) {
            return null;
        }
        return new mt5(qd5.c(((h53) m(l11VarA)).Y));
    }

    @Override // defpackage.hq8
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.hq8
    public final dr8 m(l11 l11Var) {
        return new h53(k05.k(l11Var), (byte) 2);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // defpackage.hq8
    public final er8 v(aj0 aj0Var, dr8 dr8Var) {
        dr8Var.b().o(e63.p, 34);
        return dr8Var.d();
    }

    @Override // defpackage.hq8
    public final iz z(l11 l11Var) {
        this.s.a(l11Var);
        Object[] objArr = {this.s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        xy0 xy0VarB = this.i.b();
        xy0VarB.i0 = l11Var;
        return xy0VarB.b();
    }
}
