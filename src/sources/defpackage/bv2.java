package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bv2 extends k09 {
    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        si1 si1Var = this.h;
        if (si1Var.c && !si1Var.j) {
            si1Var.d((int) ((((si1) si1Var.l.get(0)).g * ((av2) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.k09
    public final void d() {
        m31 m31Var = this.b;
        av2 av2Var = (av2) m31Var;
        int i = av2Var.r0;
        int i2 = av2Var.s0;
        int i3 = av2Var.u0;
        si1 si1Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                si1Var.l.add(m31Var.T.d.h);
                this.b.T.d.h.k.add(si1Var);
                si1Var.f = i;
            } else if (i2 != -1) {
                si1Var.l.add(m31Var.T.d.i);
                this.b.T.d.i.k.add(si1Var);
                si1Var.f = -i2;
            } else {
                si1Var.b = true;
                si1Var.l.add(m31Var.T.d.i);
                this.b.T.d.i.k.add(si1Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            si1Var.l.add(m31Var.T.e.h);
            this.b.T.e.h.k.add(si1Var);
            si1Var.f = i;
        } else if (i2 != -1) {
            si1Var.l.add(m31Var.T.e.i);
            this.b.T.e.i.k.add(si1Var);
            si1Var.f = -i2;
        } else {
            si1Var.b = true;
            si1Var.l.add(m31Var.T.e.i);
            this.b.T.e.i.k.add(si1Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void m(si1 si1Var) {
        si1 si1Var2 = this.h;
        si1Var2.k.add(si1Var);
        si1Var.l.add(si1Var2);
    }
}
