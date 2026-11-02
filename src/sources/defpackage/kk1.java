package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 extends u1 {
    public static final /* synthetic */ nw3[] i0 = {new lx5(kk1.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new lx5(kk1.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public final t14 Y;
    public final boolean Z;
    public final tb6 f0;
    public final tb6 g0;
    public final g44 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(t14 t14Var, dn2 dn2Var, boolean z) {
        super(dn2Var);
        t14Var.getClass();
        this.Y = t14Var;
        this.Z = z;
        this.f0 = zc1.X(null, new jk1(this, (byte) 0));
        this.g0 = zc1.X(null, new c3((Object) this, (Object) dn2Var, (byte) 10));
        this.h0 = x97.P(w74.X, new jk1(this, (byte) 1));
    }

    @Override // defpackage.u1
    public final boolean B() {
        t14 t14Var = this.Y;
        if (t14Var != null) {
            v15 v15Var = zz3.e;
            return zz3.B(t14Var, tg7.b);
        }
        zz3.a(138);
        throw null;
    }

    @Override // defpackage.u1
    public final boolean F() {
        return this.Y instanceof r66;
    }

    @Override // defpackage.u1
    public final boolean G() {
        return w79.I(this.Y);
    }

    @Override // defpackage.u1
    public final u1 K() {
        mo8 mo8VarQ0 = this.Y.q0();
        if (mo8VarQ0 instanceof ce2) {
            return new kk1(((ce2) mo8VarQ0).Y, 0);
        }
        return null;
    }

    @Override // defpackage.pw3
    public final List L() {
        nw3 nw3Var = i0[1];
        Object objInvoke = this.g0.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.pw3
    public final lv3 M() {
        nw3 nw3Var = i0[0];
        return (lv3) this.f0.invoke();
    }

    @Override // defpackage.u1
    public final u1 N(boolean z) {
        t14 t14VarJ;
        t14 t14Var = this.Y;
        if (z) {
            t14VarJ = ra.j(t14Var.q0(), true);
            if (t14VarJ == null) {
                return this;
            }
        } else {
            hh1 hh1Var = t14Var instanceof hh1 ? (hh1) t14Var : null;
            if (hh1Var == null || (t14VarJ = hh1Var.Y) == null) {
                return this;
            }
        }
        return new kk1(t14VarJ, null, false);
    }

    @Override // defpackage.u1
    public final u1 S(boolean z) {
        t14 t14Var = this.Y;
        t14Var.getClass();
        if (!(t14Var.q0() instanceof ce2) && t14Var.o0() == z) {
            return this;
        }
        mo8 mo8VarG = cj8.g(t14Var, z);
        mo8VarG.getClass();
        return new kk1(mo8VarG, null, false);
    }

    @Override // defpackage.u1
    public final u1 T() {
        mo8 mo8VarQ0 = this.Y.q0();
        if (mo8VarQ0 instanceof ce2) {
            return new kk1(((ce2) mo8VarQ0).Z, 0);
        }
        return null;
    }

    public final lv3 U(t14 t14Var) {
        ov3 ov3VarR;
        sw3 sw3VarR;
        t14 t14VarB;
        if (this.Z) {
            ot0 ot0VarX = t14Var.n0().x();
            e65 e65Var = ot0VarX instanceof e65 ? (e65) ot0VarX : null;
            if (e65Var != null) {
                return new qw3(el1.g(e65Var));
            }
        }
        ot0 ot0VarX2 = t14Var.n0().x();
        if (ot0VarX2 instanceof sx4) {
            Class clsQ = ms8.q((sx4) ot0VarX2);
            if (clsQ != null) {
                if (!zz3.z(t14Var)) {
                    if (cj8.e(t14Var)) {
                        return new ev3(clsQ);
                    }
                    Class cls = (Class) ia6.b.get(clsQ);
                    if (cls != null) {
                        clsQ = cls;
                    }
                    return new ev3(clsQ);
                }
                ni8 ni8Var = (ni8) wv0.Q0(t14Var.l0());
                if (ni8Var == null || (t14VarB = ni8Var.b()) == null) {
                    return new ev3(clsQ);
                }
                lv3 lv3VarU = U(y08.j(t14VarB));
                if (lv3VarU != null) {
                    return new ev3(ms8.e(zc1.N(ci8.u(lv3VarU))));
                }
                xw3.j(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (ot0VarX2 instanceof hi8) {
            hi8 hi8Var = (hi8) ot0VarX2;
            ed1 ed1VarP = hi8Var.p();
            ed1VarP.getClass();
            if (ed1VarP instanceof sx4) {
                sw3VarR = jb5.R((sx4) ed1VarP);
            } else if (ed1VarP instanceof ld0) {
                ed1 ed1VarP2 = ((ld0) ed1VarP).p();
                ed1VarP2.getClass();
                if (ed1VarP2 instanceof sx4) {
                    ov3VarR = jb5.R((sx4) ed1VarP2);
                } else {
                    am1 am1Var = ed1VarP instanceof am1 ? (am1) ed1VarP : null;
                    if (am1Var == null) {
                        xw3.j(ed1VarP, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    xl1 xl1VarN = am1Var.N();
                    if (xl1VarN instanceof st3) {
                        qb6 qb6Var = ((st3) xl1VarN).Z;
                        qb6 qb6Var2 = qb6Var != null ? qb6Var : null;
                        if (qb6Var2 == null) {
                            b61.p("Container of top-level deserialized member is not resolved: ", am1Var, " (", qb6Var);
                            return null;
                        }
                        mv3 mv3VarC = yb6.a.c(qb6Var2.a);
                        mv3VarC.getClass();
                        ov3VarR = (ew3) mv3VarC;
                    } else if (xl1VarN instanceof qd4) {
                        ov3VarR = ((qd4) xl1VarN).X;
                    } else {
                        if (!(xl1VarN instanceof xb6)) {
                            xw3.j(am1Var, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        ov3VarR = a02.Y;
                    }
                }
                Object objJ = ed1VarP.J(new mj0(ov3VarR), dn8.a);
                objJ.getClass();
                sw3VarR = (sw3) objJ;
            } else {
                xw3.j(ed1VarP, "Unknown type parameter container: ");
            }
            return new rw3(sw3VarR, hi8Var);
        }
        return null;
    }

    @Override // defpackage.u1
    public final boolean equals(Object obj) {
        if (!q08.a) {
            return super.equals(obj);
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return dh3.f(this.Y, kk1Var.Y) && dh3.f(M(), kk1Var.M()) && L().equals(kk1Var.L());
    }

    @Override // defpackage.u1
    public final pw3 f() {
        t14 t14Var = this.Y;
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        g gVar = mo8VarQ0 instanceof g ? (g) mo8VarQ0 : null;
        aa7 aa7Var = gVar != null ? gVar.Z : null;
        if (aa7Var != null) {
            return new kk1(aa7Var, this.X, true);
        }
        return null;
    }

    @Override // defpackage.u1
    public final int hashCode() {
        if (!q08.a) {
            return super.hashCode();
        }
        int iHashCode = this.Y.hashCode() * 31;
        lv3 lv3VarM = M();
        return L().hashCode() + ((iHashCode + (lv3VarM != null ? lv3VarM.hashCode() : 0)) * 31);
    }

    @Override // defpackage.u1
    public final g44 t() {
        return this.h0;
    }

    @Override // defpackage.u1
    public final zu3 v() {
        ot0 ot0VarX = this.Y.n0().x();
        sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
        if (sx4Var != null) {
            String str = ll3.a;
            if (ll3.j.containsKey(bl1.f(sx4Var))) {
                if (q08.a) {
                    lv3 lv3VarM = M();
                    lv3VarM.getClass();
                    return new rk1((zu3) lv3VarM, sx4Var);
                }
                lv3 lv3VarM2 = M();
                lv3VarM2.getClass();
                return va0.a((zu3) lv3VarM2);
            }
        }
        return null;
    }

    @Override // defpackage.u1
    public final boolean x() {
        t14 t14Var = this.Y;
        t14Var.getClass();
        return t14Var.q0() instanceof hh1;
    }

    @Override // defpackage.pw3
    public final boolean z() {
        return this.Y.o0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kk1(t14 t14Var, int i) {
        this(t14Var, null, false);
        t14Var.getClass();
    }
}
