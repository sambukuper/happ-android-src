package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 extends hd1 implements am1, pt0 {
    public final ve4 i0;
    public final fl1 j0;
    public List k0;
    public final g3 l0;
    public final pz5 m0;
    public final w15 n0;
    public final ux4 o0;
    public final dv8 p0;
    public final xl1 q0;
    public aa7 r0;
    public aa7 s0;
    public List t0;
    public aa7 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km1(ve4 ve4Var, ed1 ed1Var, sm smVar, v15 v15Var, fl1 fl1Var, pz5 pz5Var, w15 w15Var, ux4 ux4Var, dv8 dv8Var, xl1 xl1Var) {
        super(ed1Var, smVar, v15Var, ke7.G);
        ve4Var.getClass();
        ed1Var.getClass();
        fl1Var.getClass();
        pz5Var.getClass();
        w15Var.getClass();
        ux4Var.getClass();
        dv8Var.getClass();
        ve4Var.getClass();
        ed1Var.getClass();
        fl1Var.getClass();
        this.i0 = ve4Var;
        this.j0 = fl1Var;
        ve4Var.a(new f3(this, (byte) 0));
        this.l0 = new g3(this);
        this.m0 = pz5Var;
        this.n0 = w15Var;
        this.o0 = ux4Var;
        this.p0 = dv8Var;
        this.q0 = xl1Var;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.am1
    public final ux4 G() {
        return this.o0;
    }

    public final sx4 H0() {
        if (vr3.J(I0())) {
            return null;
        }
        ot0 ot0VarX = I0().n0().x();
        if (ot0VarX instanceof sx4) {
            return (sx4) ot0VarX;
        }
        return null;
    }

    public final aa7 I0() {
        aa7 aa7Var = this.s0;
        if (aa7Var != null) {
            return aa7Var;
        }
        dh3.T("expandedType");
        throw null;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.k(this, obj);
    }

    public final aa7 J0() {
        aa7 aa7Var = this.r0;
        if (aa7Var != null) {
            return aa7Var;
        }
        dh3.T("underlyingType");
        throw null;
    }

    public final void K0(List list, aa7 aa7Var, aa7 aa7Var2) {
        et4 et4VarR0;
        aa7 aa7VarP;
        aa7Var.getClass();
        aa7Var2.getClass();
        this.k0 = list;
        this.r0 = aa7Var;
        this.s0 = aa7Var2;
        this.t0 = pw7.d(this);
        sx4 sx4VarH0 = H0();
        if (sx4VarH0 == null || (et4VarR0 = sx4VarH0.r0()) == null) {
            et4VarR0 = dt4.b;
        }
        et4 et4Var = et4VarR0;
        ve7 ve7Var = new ve7(this, (byte) 12);
        q32 q32Var = cj8.a;
        if (u32.f(this)) {
            aa7VarP = u32.c(s32.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            lh8 lh8VarL = l();
            if (lh8VarL == null) {
                cj8.a(12);
                throw null;
            }
            List listD = cj8.d(((g3) lh8VarL).g());
            ch8.Y.getClass();
            aa7VarP = dh3.P(ch8.Z, lh8VarL, listD, false, et4Var, ve7Var);
        }
        this.u0 = aa7VarP;
    }

    @Override // defpackage.am1
    public final w15 M() {
        return this.n0;
    }

    @Override // defpackage.am1
    public final xl1 N() {
        return this.q0;
    }

    @Override // defpackage.ot0
    public final aa7 X() {
        aa7 aa7Var = this.u0;
        if (aa7Var != null) {
            return aa7Var;
        }
        dh3.T("defaultTypeImpl");
        throw null;
    }

    @Override // defpackage.ts4
    public final fl1 e() {
        return this.j0;
    }

    @Override // defpackage.ew7
    public final gd1 g(wi8 wi8Var) {
        wi8Var.getClass();
        if (wi8Var.a.e()) {
            return this;
        }
        ed1 ed1VarP = p();
        ed1VarP.getClass();
        sm annotations = getAnnotations();
        annotations.getClass();
        v15 name = getName();
        name.getClass();
        km1 km1Var = new km1(this.i0, ed1VarP, annotations, name, this.j0, this.m0, this.n0, this.o0, this.p0, this.q0);
        List listK0 = k0();
        aa7 aa7VarJ0 = J0();
        rt8 rt8Var = rt8.INVARIANT;
        km1Var.K0(listK0, s08.a(wi8Var.f(aa7VarJ0, rt8Var)), s08.a(wi8Var.f(I0(), rt8Var)));
        return km1Var;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean k() {
        return false;
    }

    @Override // defpackage.pt0
    public final List k0() {
        List list = this.k0;
        if (list != null) {
            return list;
        }
        dh3.T("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        return this.l0;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return cj8.c(J0(), new f0(this, (byte) 3), null);
    }

    @Override // defpackage.fd1
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // defpackage.am1
    public final d2 x() {
        return this.m0;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ed1 a() {
        return this;
    }

    @Override // defpackage.hd1
    /* JADX INFO: renamed from: G0 */
    public final gd1 a() {
        return this;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    public final ot0 a() {
        return this;
    }
}
