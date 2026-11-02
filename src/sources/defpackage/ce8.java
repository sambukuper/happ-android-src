package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ce8 {
    public final b15 a;
    public final ce8 b;
    public final String c;
    public final rh5 d = z51.H(c());
    public final rh5 e = z51.H(null);
    public final rh5 f = z51.H(new xd8(c(), c()));
    public final ph5 g = new ph5(0);
    public final ph5 h = new ph5(Long.MIN_VALUE);
    public final rh5 i;
    public final vd7 j;
    public final vd7 k;
    public final rh5 l;

    public ce8(b15 b15Var, ce8 ce8Var, String str) {
        this.a = b15Var;
        this.b = ce8Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.i = z51.H(bool);
        this.j = new vd7();
        this.k = new vd7();
        this.l = z51.H(bool);
        rd7.b(new od8(this, (byte) 1));
    }

    public final void a(Object obj, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? lp2Var.f(obj) : lp2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(this) ? 32 : 16;
        }
        byte b = 0;
        if (!lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            lp2Var.Q();
        } else if (g()) {
            lp2Var.W(467722849);
            lp2Var.p(false);
        } else {
            lp2Var.W(466062241);
            l(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (z || objK == beVar) {
                objK = rd7.b(new od8(this, b));
                lp2Var.g0(objK);
            }
            if (((Boolean) ((lh7) objK).getValue()).booleanValue()) {
                lp2Var.W(466470356);
                Object objK2 = lp2Var.K();
                if (objK2 == beVar) {
                    objK2 = u70.D(lp2Var);
                    lp2Var.g0(objK2);
                }
                b71 b71Var = (b71) objK2;
                boolean zH = lp2Var.h(b71Var) | (i3 == 32);
                Object objK3 = lp2Var.K();
                if (zH || objK3 == beVar) {
                    objK3 = new gq6(b71Var, this, (byte) 17);
                    lp2Var.g0(objK3);
                }
                u70.b(b71Var, this, (gn2) objK3, lp2Var);
                lp2Var.p(false);
            } else {
                lp2Var.W(467712929);
                lp2Var.p(false);
            }
            lp2Var.p(false);
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 9, i, this, obj);
        }
    }

    public final long b() {
        vd7 vd7Var = this.j;
        int size = vd7Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((yd8) vd7Var.get(i)).l0.l());
        }
        vd7 vd7Var2 = this.k;
        int size2 = vd7Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((ce8) vd7Var2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return this.a.b.getValue();
    }

    public final boolean d() {
        vd7 vd7Var = this.j;
        int size = vd7Var.size();
        for (int i = 0; i < size; i++) {
            ((yd8) vd7Var.get(i)).getClass();
        }
        vd7 vd7Var2 = this.k;
        int size2 = vd7Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ce8) vd7Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        ce8 ce8Var = this.b;
        return ce8Var != null ? ce8Var.e() : this.g.l();
    }

    public final wd8 f() {
        return (wd8) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        b15 b15Var = this.a;
        rh5 rh5Var = b15Var.a;
        ph5 ph5Var = this.h;
        if (ph5Var.l() == Long.MIN_VALUE) {
            ph5Var.m(j);
            b15Var.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) rh5Var.getValue()).booleanValue()) {
            rh5Var.setValue(Boolean.TRUE);
        }
        k(false);
        vd7 vd7Var = this.j;
        int size = vd7Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            yd8 yd8Var = (yd8) vd7Var.get(i);
            rh5 rh5Var2 = yd8Var.g0;
            rh5 rh5Var3 = yd8Var.g0;
            if (!((Boolean) rh5Var2.getValue()).booleanValue()) {
                long jB = z ? yd8Var.a().b() : j;
                yd8Var.c(yd8Var.a().f(jB));
                yd8Var.k0 = yd8Var.a().d(jB);
                if (yd8Var.a().e(jB)) {
                    rh5Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) rh5Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        vd7 vd7Var2 = this.k;
        int size2 = vd7Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ce8 ce8Var = (ce8) vd7Var2.get(i2);
            if (!dh3.f(ce8Var.d.getValue(), ce8Var.c())) {
                ce8Var.h(j, z);
            }
            if (!dh3.f(ce8Var.d.getValue(), ce8Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.m(Long.MIN_VALUE);
        Object value = this.d.getValue();
        b15 b15Var = this.a;
        b15Var.b.setValue(value);
        if (this.b == null) {
            this.g.m(0L);
        }
        b15Var.a.setValue(Boolean.FALSE);
        vd7 vd7Var = this.k;
        int size = vd7Var.size();
        for (int i = 0; i < size; i++) {
            ((ce8) vd7Var.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.h.m(Long.MIN_VALUE);
        b15 b15Var = this.a;
        b15Var.a.setValue(Boolean.FALSE);
        boolean zG = g();
        rh5 rh5Var = this.d;
        if (!zG || !dh3.f(c(), obj) || !dh3.f(rh5Var.getValue(), obj2)) {
            if (!dh3.f(c(), obj)) {
                b15Var.b.setValue(obj);
            }
            rh5Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new xd8(obj, obj2));
        }
        vd7 vd7Var = this.k;
        int size = vd7Var.size();
        for (int i = 0; i < size; i++) {
            ce8 ce8Var = (ce8) vd7Var.get(i);
            ce8Var.getClass();
            if (ce8Var.g()) {
                ce8Var.j(ce8Var.c(), ce8Var.d.getValue());
            }
        }
        vd7 vd7Var2 = this.j;
        int size2 = vd7Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((yd8) vd7Var2.get(i2)).b();
        }
    }

    public final void k(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void l(Object obj) {
        rh5 rh5Var = this.d;
        if (dh3.f(rh5Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new xd8(rh5Var.getValue(), obj));
        if (!dh3.f(c(), rh5Var.getValue())) {
            this.a.b.setValue(rh5Var.getValue());
        }
        rh5Var.setValue(obj);
        if (this.h.l() == Long.MIN_VALUE) {
            k(true);
        }
        vd7 vd7Var = this.j;
        int size = vd7Var.size();
        for (int i = 0; i < size; i++) {
            ((yd8) vd7Var.get(i)).h0.m(-2.0f);
        }
    }

    public final String toString() {
        vd7 vd7Var = this.j;
        int size = vd7Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((yd8) vd7Var.get(i)) + ", ";
        }
        return str;
    }
}
