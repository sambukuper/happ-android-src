package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y68 {
    public final xd6 a;
    public g48 b;
    public final rh5 c;
    public final rh5 d;
    public final rh5 e;
    public final rh5 f;
    public final lr5 g;
    public final c15 h;

    public y68(String str, long j, xd6 xd6Var) {
        this.a = xd6Var;
        this.b = new g48(new h48(str, ct7.d(str.length(), j), null, null, null, null, null, 124), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = z51.H(bool);
        this.d = z51.H(new h48(str, j, null, null, null, null, null, 124));
        this.e = z51.H(bool);
        this.f = z51.H(bool);
        this.g = new lr5((Object) this, (byte) 24);
        this.h = new c15(0, new lh[16]);
    }

    public final void a(g48 g48Var) {
        boolean z = ((c15) g48Var.a().Y).Z > 0;
        boolean z2 = !f88.a(g48Var.i0, this.b.i0);
        boolean zF = true ^ dh3.f(g48Var.f0, this.b.f0);
        if (z) {
            d(c(), g48.h(g48Var, 0L, null, 15), g48Var.a(), e58.Y);
        }
        g(g48Var, z, z2, zF);
    }

    public final void b(de3 de3Var, boolean z, e58 e58Var) {
        h48 h48VarC = c();
        if (((c15) this.b.a().Y).Z == 0 && f88.a(h48VarC.f0, this.b.i0)) {
            if (dh3.f(h48VarC.g0, this.b.j0) && dh3.f(h48VarC.h0, this.b.l0) && dh3.f(h48VarC.X, this.b.k0)) {
                return;
            }
            h48 h48VarC2 = c();
            String string = this.b.Z.toString();
            g48 g48Var = this.b;
            long j = g48Var.i0;
            f88 f88Var = g48Var.j0;
            h(h48VarC2, new h48(string, j, f88Var, g48Var.l0, z68.y(f88Var, g48Var.k0), null, h48VarC.Y, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((c15) this.b.a().Y).Z != 0;
        String string2 = this.b.Z.toString();
        g48 g48Var2 = this.b;
        long j2 = g48Var2.i0;
        f88 f88Var2 = g48Var2.j0;
        h48 h48Var = new h48(string2, j2, f88Var2, g48Var2.l0, z68.y(f88Var2, g48Var2.k0), null, z68.K(this.b), 32);
        if (de3Var == null) {
            if (z3 && z) {
                z2 = true;
            }
            h(h48VarC, h48Var, z2);
            d(h48VarC, h48Var, this.b.a(), e58Var);
            return;
        }
        g48 g48Var3 = new g48(h48Var, this.b.a(), h48VarC, null, 8);
        de3Var.i(g48Var3);
        boolean zQ = mm7.Q(g48Var3.Z, h48Var);
        boolean z4 = !zQ;
        boolean zA = f88.a(g48Var3.i0, h48Var.f0);
        boolean z5 = !zA;
        p88 p88Var = g48Var3.f0;
        c78 c78Var = h48Var.Y;
        boolean zF = dh3.f(p88Var, c78Var != null ? c78Var.a : null);
        boolean z6 = !zF;
        if (zQ && zA && zF) {
            h(h48VarC, g48.h(g48Var3, 0L, h48Var.g0, 13), z);
        } else {
            g(g48Var3, z4, z5, z6);
        }
        d(h48VarC, c(), g48Var3.a(), e58Var);
    }

    public final h48 c() {
        return (h48) this.d.getValue();
    }

    public final void d(h48 h48Var, h48 h48Var2, mj0 mj0Var, e58 e58Var) {
        int iOrdinal = e58Var.ordinal();
        xd6 xd6Var = this.a;
        if (iOrdinal == 0) {
            du7.e(xd6Var, h48Var, h48Var2, mj0Var, true);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                du7.e(xd6Var, h48Var, h48Var2, mj0Var, false);
                return;
            } else {
                b61.c();
                return;
            }
        }
        ((rh5) xd6Var.Z).setValue(null);
        bm8 bm8Var = (bm8) xd6Var.Y;
        bm8Var.b.clear();
        bm8Var.c.clear();
    }

    public final void e(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void g(g48 g48Var, boolean z, boolean z2, boolean z3) {
        h48 h48VarH = g48.h(this.b, 0L, null, 15);
        if (z || z3) {
            this.b = new g48(new h48(g48Var.Z.toString(), g48Var.i0, null, null, null, null, z68.K(g48Var), 60), null, null, null, 14);
        } else if (z2) {
            g48 g48Var2 = this.b;
            long j = g48Var.i0;
            int i = f88.c;
            g48Var2.g(ct7.c((int) (j >> 32), (int) (j & 4294967295L)));
        }
        if (z || z2 || !dh3.f(h48VarH.g0, g48Var.j0)) {
            this.b.f(null);
        }
        h(h48VarH, g48.h(this.b, 0L, null, 15), true);
    }

    public final void h(h48 h48Var, h48 h48Var2, boolean z) {
        this.d.setValue(h48Var2);
        c15 c15Var = this.h;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            lh lhVar = (lh) objArr[i2];
            boolean z2 = (!z || mm7.Q(h48Var.Z, h48Var2) || h48Var.g0 == null) ? false : true;
            mj0 mj0Var = lhVar.a;
            long j = h48Var.f0;
            f88 f88Var = h48Var.g0;
            long j2 = h48Var2.f0;
            f88 f88Var2 = h48Var2.g0;
            if (z2) {
                mj0Var.W().restartInput((View) mj0Var.Y);
            } else if (!f88.a(j, j2) || !dh3.f(f88Var, f88Var2)) {
                mj0Var.W().updateSelection((View) mj0Var.Y, f88.d(j2), f88.c(j2), f88Var2 != null ? f88.d(f88Var2.a) : -1, f88Var2 != null ? f88.c(f88Var2.a) : -1);
            }
        }
        f(false);
    }

    public final String toString() {
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            return "TextFieldState(selection=" + f88.f(c().f0) + ", text=\"" + ((Object) c().Z) + "\")";
        } finally {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
        }
    }
}
