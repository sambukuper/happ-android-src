package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r79 implements kq8 {
    public final p79 a;
    public final float b;
    public final float c;
    public final vz7 d;
    public final vz7 e;
    public boolean f;
    public qq8 g;
    public ux0 h;

    public r79(p79 p79Var) {
        this.a = p79Var;
        this.b = p79Var.c();
        this.c = p79Var.a();
        final byte b = 0;
        this.d = new vz7(new dn2(this) { // from class: q79
            public final /* synthetic */ r79 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                r79 r79Var = this.Y;
                switch (b2) {
                    case 0:
                        return new s79(r79Var.b, r79Var.c);
                    default:
                        return new yz4((s79) r79Var.d.getValue());
                }
            }
        });
        final byte b2 = 1;
        this.e = new vz7(new dn2(this) { // from class: q79
            public final /* synthetic */ r79 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                r79 r79Var = this.Y;
                switch (b3) {
                    case 0:
                        return new s79(r79Var.b, r79Var.c);
                    default:
                        return new yz4((s79) r79Var.d.getValue());
                }
            }
        });
    }

    public final xb4 a(s79 s79Var, boolean z, boolean z2) {
        s79Var.getClass();
        ux0 ux0Var = new ux0();
        ux0 ux0Var2 = this.h;
        if (ux0Var2 != null) {
            if (z) {
                p61.y("Cancelled due to another zoom value being set.", ux0Var2);
            } else {
                zc1.f0(ux0Var, ux0Var2);
            }
        }
        this.h = ux0Var;
        boolean zC = s08.c();
        vz7 vz7Var = this.e;
        if (zC) {
            ((yz4) vz7Var.getValue()).j(s79Var);
        } else {
            ((yz4) vz7Var.getValue()).k(s79Var);
        }
        qq8 qq8Var = this.g;
        if (qq8Var != null) {
            p79 p79Var = this.a;
            zc1.f0(z2 ? p79Var.p(qq8Var) : p79Var.m(qq8Var), ux0Var);
        } else {
            p61.y("Camera is not active.", ux0Var);
        }
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = o61.class;
        try {
            ux0Var.D(new y0((Object) qd0Var, (byte) 19));
            qd0Var.a = "Job.asListenableFuture";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        return vr3.P(ud0Var);
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        boolean z;
        this.g = qq8Var;
        s79 s79Var = (s79) ((yz4) this.e.getValue()).d();
        if (s79Var == null) {
            s79Var = (s79) this.d.getValue();
        }
        if (this.f) {
            z = true;
        } else {
            s79Var.getClass();
            z = false;
        }
        a(s79Var, false, z);
        this.f = true;
    }

    @Override // defpackage.kq8
    public final void reset() {
        a((s79) this.d.getValue(), true, true);
    }
}
