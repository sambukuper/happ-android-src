package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class na7 extends cw0 {
    public Object f0;
    public Object g0;
    public t05 h0;
    public t05 i0;
    public n17 j0;
    public final t16 k0;
    public final o61 l0;

    public na7() {
        super((byte) 4);
        this.k0 = new t16(this, (byte) 20);
        b1 b1Var = new b1(this, (byte) 21);
        kd7.b(kd7.a);
        synchronized (kd7.c) {
            kd7.h = wv0.I0(kd7.h, b1Var);
        }
        this.l0 = new o61(b1Var, (byte) 26);
    }

    @Override // defpackage.cw0
    public final gn2 B0(n17 n17Var) {
        n17 n17Var2 = this.j0;
        if (n17Var2 != null && !n17Var2.equals(n17Var)) {
            wr5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.j0 = n17Var;
        return this.k0;
    }

    @Override // defpackage.cw0
    public final void C0(jp0 jp0Var) {
        this.j0 = null;
        this.g0 = null;
        this.i0 = null;
        p0();
    }

    @Override // defpackage.cw0
    public final void g0(n17 n17Var) {
        this.g0 = null;
        this.i0 = null;
    }

    @Override // defpackage.cw0
    public final void p0() {
        synchronized (this.X) {
            try {
                this.f0 = this.g0;
                if (this.i0 == null) {
                    this.h0 = null;
                } else {
                    t05 t05Var = this.h0;
                    if (t05Var == null) {
                        t05 t05Var2 = vw6.a;
                        t05Var = new t05();
                        this.h0 = t05Var;
                    }
                    this.h0 = this.i0;
                    this.i0 = t05Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cw0
    public final void r0() {
        this.l0.h();
        this.g0 = null;
        this.i0 = null;
        synchronized (this.X) {
            this.j0 = null;
            this.f0 = null;
            this.h0 = null;
        }
    }
}
