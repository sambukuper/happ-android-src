package defpackage;

import io.sentry.c2;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx4 extends fd1 implements vx4 {
    public final ve4 g0;
    public final zz3 h0;
    public final Map i0;
    public final cg5 j0;
    public ux4 k0;
    public wf5 l0;
    public final boolean m0;
    public final pe4 n0;
    public final vz7 o0;

    public wx4(v15 v15Var, ve4 ve4Var, zz3 zz3Var, int i) {
        super(oy1.f0, v15Var);
        this.g0 = ve4Var;
        this.h0 = zz3Var;
        if (!v15Var.Y) {
            u52.j(v15Var, "Module name must be special: ");
            throw null;
        }
        this.i0 = e02.X;
        cg5.a.getClass();
        cg5 cg5Var = (cg5) W(lh4.u0);
        this.j0 = cg5Var == null ? bg5.b : cg5Var;
        this.m0 = true;
        this.n0 = ve4Var.b(new f0(this, (byte) 24));
        this.o0 = new vz7(new ps3(this, (byte) 1));
    }

    @Override // defpackage.vx4
    public final boolean A(vx4 vx4Var) {
        vx4Var.getClass();
        if (this == vx4Var) {
            return true;
        }
        this.k0.getClass();
        if (wv0.m0(m02.X, vx4Var)) {
            return true;
        }
        a0();
        return vx4Var.a0().contains(this);
    }

    public final void G0() {
        if (this.m0) {
            return;
        }
        if (W(ph3.a) != null) {
            c2.m();
        } else {
            throw new oh3("Accessing invalid module descriptor " + this);
        }
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.l(this, obj);
    }

    @Override // defpackage.vx4
    public final Object W(jh0 jh0Var) {
        jh0Var.getClass();
        Object obj = this.i0.get(jh0Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.vx4
    public final List a0() {
        if (this.k0 != null) {
            return d02.X;
        }
        String str = getName().X;
        str.getClass();
        xw3.l("Dependencies of module ", str, " were not set");
        return null;
    }

    @Override // defpackage.vx4
    public final n74 b0(fk2 fk2Var) {
        fk2Var.getClass();
        G0();
        return (n74) this.n0.B(fk2Var);
    }

    @Override // defpackage.vx4
    public final zz3 f() {
        return this.h0;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        return null;
    }

    @Override // defpackage.vx4
    public final Collection t(fk2 fk2Var, gn2 gn2Var) {
        fk2Var.getClass();
        G0();
        G0();
        return ((j01) this.o0.getValue()).t(fk2Var, gn2Var);
    }

    @Override // defpackage.fd1
    public final String toString() {
        StringBuilder sb = new StringBuilder(fd1.F0(this));
        if (!this.m0) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        wf5 wf5Var = this.l0;
        sb.append(wf5Var != null ? wf5Var.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
