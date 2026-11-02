package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yd8 implements lh7 {
    public final ug8 X;
    public final rh5 Y;
    public final rh5 Z;
    public final rh5 f0;
    public final rh5 g0;
    public final nh5 h0;
    public boolean i0;
    public final rh5 j0;
    public wk k0;
    public final ph5 l0;
    public boolean m0;
    public final wf7 n0;
    public final /* synthetic */ ce8 o0;

    public yd8(ce8 ce8Var, Object obj, wk wkVar, ug8 ug8Var) {
        this.o0 = ce8Var;
        this.X = ug8Var;
        rh5 rh5VarH = z51.H(obj);
        this.Y = rh5VarH;
        Object objB = null;
        rh5 rh5VarH2 = z51.H(wl7.V(0.0f, 0.0f, null, 7));
        this.Z = rh5VarH2;
        this.f0 = z51.H(new t18((ta2) rh5VarH2.getValue(), ug8Var, obj, rh5VarH.getValue(), wkVar));
        this.g0 = z51.H(Boolean.TRUE);
        this.h0 = new nh5(-1.0f);
        this.j0 = z51.H(obj);
        this.k0 = wkVar;
        this.l0 = new ph5(a().b());
        Float f = (Float) iz8.a.get(ug8Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            wk wkVar2 = (wk) ug8Var.a.B(obj);
            int iB = wkVar2.b();
            for (int i = 0; i < iB; i++) {
                wkVar2.e(i, fFloatValue);
            }
            objB = this.X.b.B(wkVar2);
        }
        this.n0 = wl7.V(0.0f, 0.0f, objB, 3);
    }

    public final t18 a() {
        return (t18) this.f0.getValue();
    }

    public final void b() {
        if (this.h0.l() == -1.0f) {
            this.m0 = true;
            if (dh3.f(a().c, a().d)) {
                c(a().c);
            } else {
                c(a().f(0L));
                this.k0 = a().d(0L);
            }
        }
    }

    public final void c(Object obj) {
        this.j0.setValue(obj);
    }

    public final void e(Object obj, boolean z) {
        ta2 ta2Var;
        rh5 rh5Var = this.Y;
        boolean zF = dh3.f(null, rh5Var.getValue());
        ph5 ph5Var = this.l0;
        rh5 rh5Var2 = this.f0;
        wf7 wf7Var = this.n0;
        if (zF) {
            rh5Var2.setValue(new t18(wf7Var, this.X, obj, obj, this.k0.c()));
            this.i0 = true;
            ph5Var.m(a().b());
            return;
        }
        rh5 rh5Var3 = this.Z;
        if (!z || this.m0) {
            ta2Var = (ta2) rh5Var3.getValue();
        } else if (((ta2) rh5Var3.getValue()) instanceof wf7) {
            ta2Var = wf7Var;
            ta2Var = (ta2) rh5Var3.getValue();
        }
        ta2Var = wf7Var;
        ce8 ce8Var = this.o0;
        pk zg7Var = ta2Var;
        if (ce8Var.e() > 0) {
            zg7Var = new zg7(ta2Var, ce8Var.e());
        }
        rh5Var2.setValue(new t18(zg7Var, this.X, obj, rh5Var.getValue(), this.k0));
        ph5Var.m(a().b());
        this.i0 = false;
        ce8Var.k(true);
        if (ce8Var.g()) {
            vd7 vd7Var = ce8Var.j;
            int size = vd7Var.size();
            for (int i = 0; i < size; i++) {
                yd8 yd8Var = (yd8) vd7Var.get(i);
                yd8Var.l0.l();
                yd8Var.b();
            }
            ce8Var.k(false);
        }
    }

    public final void f(Object obj, Object obj2, ta2 ta2Var) {
        this.Y.setValue(obj2);
        this.Z.setValue(ta2Var);
        if (dh3.f(a().d, obj) && dh3.f(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, ta2 ta2Var, Object obj2, wk wkVar) {
        Object value;
        if (this.i0 && dh3.f(obj, null)) {
            return;
        }
        rh5 rh5Var = this.Y;
        boolean zF = dh3.f(rh5Var.getValue(), obj);
        nh5 nh5Var = this.h0;
        if (zF && nh5Var.l() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        rh5Var.setValue(obj);
        this.Z.setValue(ta2Var);
        if (obj2 == null) {
            value = nh5Var.l() == -3.0f ? obj : this.j0.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            c(value);
            if (wkVar != null) {
                this.k0 = wkVar;
            }
        }
        rh5 rh5Var2 = this.g0;
        e(value, !((Boolean) rh5Var2.getValue()).booleanValue());
        rh5Var2.setValue(Boolean.valueOf(nh5Var.l() == -3.0f));
        if (nh5Var.l() >= 0.0f) {
            c(a().f((long) (nh5Var.l() * a().b())));
        } else if (nh5Var.l() == -3.0f) {
            c(obj);
        }
        this.i0 = false;
        nh5Var.m(-1.0f);
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return this.j0.getValue();
    }

    public final String toString() {
        return "current value: " + this.j0.getValue() + ", target: " + this.Y.getValue() + ", spec: " + ((ta2) this.Z.getValue());
    }
}
