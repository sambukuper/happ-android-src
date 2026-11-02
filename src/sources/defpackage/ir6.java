package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir6 {
    public static final qs0 a;

    static {
        fk2 fk2Var = new fk2("java.lang.Void");
        a = new qs0(fk2Var.b(), fk2Var.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jt3 a(ho2 ho2Var) {
        String strY = gv3.y(ho2Var);
        if (strY == null) {
            if (ho2Var instanceof hx5) {
                String strB = el1.i(ho2Var).getName().b();
                strB.getClass();
                strY = js3.a(strB);
            } else if (ho2Var instanceof tx5) {
                String strB2 = el1.i(ho2Var).getName().b();
                strB2.getClass();
                strY = js3.b(strB2);
            } else {
                strY = ((fd1) ho2Var).getName().b();
                strY.getClass();
            }
        }
        return new jt3(new lt3(strY, w45.y(ho2Var, 1)));
    }

    public static jm4 b(fx5 fx5Var) {
        fx5Var.getClass();
        fx5 fx5VarA = ((fx5) bl1.r(fx5Var)).a();
        fx5VarA.getClass();
        if (fx5VarA instanceof im1) {
            im1 im1Var = (im1) fx5VarA;
            cz5 cz5Var = im1Var.E0;
            aq2 aq2Var = lu3.d;
            aq2Var.getClass();
            fu3 fu3Var = (fu3) ch3.y(cz5Var, aq2Var);
            if (fu3Var != null) {
                return new yt3(fx5VarA, cz5Var, fu3Var, im1Var.F0, im1Var.G0);
            }
        } else if (fx5VarA instanceof gl3) {
            gl3 gl3Var = (gl3) fx5VarA;
            ke7 source = gl3Var.getSource();
            hr6 hr6Var = source instanceof hr6 ? (hr6) source : null;
            xa6 xa6Var = hr6Var != null ? hr6Var.X : null;
            if (xa6Var instanceof za6) {
                return new wt3(((za6) xa6Var).a);
            }
            if (!(xa6Var instanceof cb6)) {
                om0.h("Incorrect resolution sequence for Java field ", fx5VarA, " (source = ", xa6Var);
                return null;
            }
            Method method = ((cb6) xa6Var).a;
            tx5 tx5Var = gl3Var.B0;
            ke7 source2 = tx5Var != null ? tx5Var.getSource() : null;
            hr6 hr6Var2 = source2 instanceof hr6 ? (hr6) source2 : null;
            xa6 xa6Var2 = hr6Var2 != null ? hr6Var2.X : null;
            cb6 cb6Var = xa6Var2 instanceof cb6 ? (cb6) xa6Var2 : null;
            return new xt3(method, cb6Var != null ? cb6Var.a : null);
        }
        hx5 hx5VarB = fx5VarA.b();
        hx5VarB.getClass();
        jt3 jt3VarA = a(hx5VarB);
        tx5 tx5VarD = fx5VarA.d();
        return new zt3(jt3VarA, tx5VarD != null ? a(tx5VarD) : null);
    }

    public static dh3 c(ho2 ho2Var) {
        ho2Var.getClass();
        ho2 ho2VarA = ((ho2) bl1.r(ho2Var)).a();
        ho2VarA.getClass();
        if (ho2VarA instanceof ml1) {
            am1 am1Var = (am1) ho2VarA;
            d2 d2VarX = am1Var.x();
            if (d2VarX instanceof vy5) {
                r62 r62Var = mu3.a;
                lt3 lt3VarC = mu3.c((vy5) d2VarX, am1Var.M(), am1Var.G());
                if (lt3VarC != null) {
                    return new jt3(lt3VarC);
                }
            }
            if (d2VarX instanceof iy5) {
                r62 r62Var2 = mu3.a;
                lt3 lt3VarA = mu3.a((iy5) d2VarX, am1Var.M(), am1Var.G());
                if (lt3VarA != null) {
                    ed1 ed1VarP = ho2Var.p();
                    ed1VarP.getClass();
                    return bd3.a(ed1VarP) ? new jt3(lt3VarA) : new it3(lt3VarA);
                }
            }
            return a(ho2VarA);
        }
        if (ho2VarA instanceof dl3) {
            ke7 source = ((dl3) ho2VarA).getSource();
            hr6 hr6Var = source instanceof hr6 ? (hr6) source : null;
            xa6 xa6Var = hr6Var != null ? hr6Var.X : null;
            cb6 cb6Var = xa6Var instanceof cb6 ? (cb6) xa6Var : null;
            if (cb6Var != null) {
                return new ht3(cb6Var.a);
            }
            xw3.j(ho2VarA, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(ho2VarA instanceof yj3)) {
            return a(ho2VarA);
        }
        ke7 source2 = ((yj3) ho2VarA).getSource();
        hr6 hr6Var2 = source2 instanceof hr6 ? (hr6) source2 : null;
        xa6 xa6Var2 = hr6Var2 != null ? hr6Var2.X : null;
        if (xa6Var2 instanceof wa6) {
            return new gt3(((wa6) xa6Var2).a);
        }
        if (xa6Var2 instanceof ta6) {
            Class cls = ((ta6) xa6Var2).a;
            if (cls.isAnnotation()) {
                return new ft3(cls);
            }
        }
        om0.h("Incorrect resolution sequence for Java constructor ", ho2VarA, " (", xa6Var2);
        return null;
    }
}
