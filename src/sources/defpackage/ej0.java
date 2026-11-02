package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements cj0 {
    public final lr8 X;
    public final aj0 Y;
    public final qh0 Z;
    public final pr8 f0;
    public final ok0 g0;
    public final String h0;
    public ih0 i0;
    public final int j0;
    public final pv k0;

    public ej0(jh0 jh0Var, lr8 lr8Var, aj0 aj0Var, qh0 qh0Var, pr8 pr8Var, ok0 ok0Var) {
        jh0Var.getClass();
        lr8Var.getClass();
        aj0Var.getClass();
        qh0Var.getClass();
        pr8Var.getClass();
        ok0Var.getClass();
        this.X = lr8Var;
        this.Y = aj0Var;
        this.Z = qh0Var;
        this.f0 = pr8Var;
        this.g0 = ok0Var;
        String str = jh0Var.Y;
        this.h0 = str;
        lh0 lh0Var = mh0.a;
        lh0Var.getClass();
        this.i0 = lh0Var;
        qv qvVar = fj0.a;
        qvVar.getClass();
        this.j0 = qv.b.incrementAndGet(qvVar);
        this.k0 = nr4.e(false);
        if (hi5.i0("CXCP")) {
            toString();
            vi0.b(str);
        }
    }

    @Override // defpackage.cj0
    public final xb4 a() {
        return u15.u(new o61(w51.G(this.f0.a, null, null, new dj0(this, null, (byte) 1), 3), (byte) 0));
    }

    @Override // defpackage.cj0
    public final r85 b() {
        return this.g0.b;
    }

    @Override // defpackage.gq8
    public final void d(hq8 hq8Var) {
        lr8 lr8Var = this.X;
        lr8Var.getClass();
        synchronized (lr8Var.k) {
            if (lr8Var.l.contains(hq8Var)) {
                lr8Var.k(lr8Var.l);
            }
        }
    }

    @Override // defpackage.gq8
    public final void f(hq8 hq8Var) {
        this.X.a(hq8Var);
    }

    @Override // defpackage.cj0
    public final qh0 g() {
        return this.Z;
    }

    @Override // defpackage.cj0
    public final ih0 h() {
        return this.i0;
    }

    @Override // defpackage.gq8
    public final void i(hq8 hq8Var) {
        lr8 lr8Var = this.X;
        lr8Var.getClass();
        synchronized (lr8Var.k) {
            if (lr8Var.l.contains(hq8Var)) {
                lr8Var.l();
            }
        }
    }

    @Override // defpackage.cj0
    public final void j(ih0 ih0Var) {
        ih0 ih0Var2;
        if (ih0Var == null) {
            ih0Var2 = mh0.a;
            ih0Var2.getClass();
        } else {
            ih0Var2 = ih0Var;
        }
        this.i0 = ih0Var2;
        if (ih0Var != null) {
            ih0Var.u();
        }
        synchronized (this.X.k) {
        }
    }

    @Override // defpackage.gq8
    public final void k(hq8 hq8Var) {
        lr8 lr8Var = this.X;
        lr8Var.getClass();
        synchronized (lr8Var.k) {
            if (lr8Var.m.remove(hq8Var)) {
                lr8Var.l();
            }
        }
    }

    @Override // defpackage.cj0
    public final void l(boolean z) {
        lr8 lr8Var = this.X;
        synchronized (lr8Var.k) {
            lr8Var.n = z;
            nq8 nq8VarH = lr8Var.h();
            if (nq8VarH != null) {
                w51.G(nq8VarH.b.f, null, null, new mq8(null, nq8VarH, z), 3);
            }
        }
    }

    @Override // defpackage.cj0
    public final boolean m() {
        return this.k0.b();
    }

    @Override // defpackage.cj0
    public final void n(ArrayList arrayList) {
        this.X.g(wv0.Y0(arrayList));
    }

    @Override // defpackage.cj0
    public final void o(ArrayList arrayList) {
        this.X.d(wv0.Y0(arrayList));
    }

    @Override // defpackage.cj0
    public final void p() {
        if (hi5.i0("CXCP")) {
            toString();
        }
        if (this.k0.a()) {
            w51.G(this.f0.a, null, null, new dj0(this, null, (byte) 0), 3);
        }
    }

    @Override // defpackage.cj0
    public final void r(boolean z) {
        lr8 lr8Var = this.X;
        synchronized (lr8Var.k) {
            lr8Var.p = z;
        }
    }

    @Override // defpackage.cj0
    public final aj0 s() {
        return this.Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) vi0.b(this.h0));
        sb.append('(');
        return oi0.n(sb, this.j0, ")>");
    }
}
