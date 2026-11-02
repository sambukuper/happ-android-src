package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z54 {
    public final b71 a;
    public final vt2 b;
    public final tb2 c;
    public ta2 d;
    public ta2 e;
    public ta2 f;
    public boolean g;
    public final rh5 h;
    public final rh5 i;
    public final rh5 j;
    public final rh5 k;
    public long l;
    public long m;
    public long n;
    public xt2 o;
    public final oi p;
    public final oi q;
    public final rh5 r;

    public z54(b71 b71Var, vt2 vt2Var, tb2 tb2Var) {
        this.a = b71Var;
        this.b = vt2Var;
        this.c = tb2Var;
        Boolean bool = Boolean.FALSE;
        this.h = z51.H(bool);
        this.i = z51.H(bool);
        this.j = z51.H(bool);
        this.k = z51.H(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        this.o = vt2Var != null ? vt2Var.c() : null;
        this.p = new oi(new hf3(0L), ys0.p0, null, 12);
        this.q = new oi(Float.valueOf(1.0f), ys0.j0, null, 12);
        this.r = z51.H(new hf3(0L));
    }

    public final void a() {
        xt2 xt2Var = this.o;
        ta2 ta2Var = this.d;
        rh5 rh5Var = this.i;
        boolean zBooleanValue = ((Boolean) rh5Var.getValue()).booleanValue();
        b71 b71Var = this.a;
        q51 q51Var = null;
        if (zBooleanValue || ta2Var == null || xt2Var == null) {
            if (b()) {
                if (xt2Var != null) {
                    xt2Var.f(1.0f);
                }
                w51.G(b71Var, null, null, new w54(this, q51Var, (byte) 0), 3);
                return;
            }
            return;
        }
        rh5Var.setValue(Boolean.TRUE);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            xt2Var.f(0.0f);
        }
        w51.G(b71Var, null, null, new y54(z, this, ta2Var, xt2Var, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        vt2 vt2Var;
        rh5 rh5Var = this.h;
        boolean zBooleanValue = ((Boolean) rh5Var.getValue()).booleanValue();
        byte b = 3;
        b71 b71Var = this.a;
        q51 q51Var = null;
        if (zBooleanValue) {
            rh5Var.setValue(Boolean.FALSE);
            w51.G(b71Var, null, null, new w54(this, q51Var, (byte) 2), 3);
        }
        rh5 rh5Var2 = this.i;
        if (((Boolean) rh5Var2.getValue()).booleanValue()) {
            rh5Var2.setValue(Boolean.FALSE);
            w51.G(b71Var, null, null, new w54(this, q51Var, b), 3);
        }
        if (b()) {
            this.j.setValue(Boolean.FALSE);
            w51.G(b71Var, null, null, new w54(this, q51Var, (byte) 4), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        xt2 xt2Var = this.o;
        if (xt2Var != null && (vt2Var = this.b) != null) {
            vt2Var.a(xt2Var);
        }
        this.o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        this.r.setValue(new hf3(j));
    }
}
