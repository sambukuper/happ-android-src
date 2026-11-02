package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class el1 {
    public static final /* synthetic */ int a = 0;

    static {
        v15.e("value");
    }

    public static final boolean a(ot8 ot8Var) {
        Boolean boolW = jb5.w(i21.K(ot8Var), oy1.s0, dl1.X);
        boolW.getClass();
        return boolW.booleanValue();
    }

    public static ld0 b(ld0 ld0Var, gn2 gn2Var) {
        ld0Var.getClass();
        return (ld0) jb5.p(i21.K(ld0Var), new ra((byte) 23, false), new c91(new ea6(), gn2Var));
    }

    public static final fk2 c(ed1 ed1Var) {
        gk2 gk2VarF = bl1.f(ed1Var);
        gk2VarF.getClass();
        if (!gk2VarF.d()) {
            gk2VarF = null;
        }
        if (gk2VarF != null) {
            return gk2VarF.i();
        }
        return null;
    }

    public static final sx4 d(gm gmVar) {
        gmVar.getClass();
        ot0 ot0VarX = gmVar.c().n0().x();
        if (ot0VarX instanceof sx4) {
            return (sx4) ot0VarX;
        }
        return null;
    }

    public static final zz3 e(ed1 ed1Var) {
        ed1Var.getClass();
        vx4 vx4VarC = bl1.c(ed1Var);
        vx4VarC.getClass();
        return vx4VarC.f();
    }

    public static final qs0 f(ot0 ot0Var) {
        ed1 ed1VarP;
        qs0 qs0VarF;
        if (ot0Var == null || (ed1VarP = ot0Var.p()) == null) {
            return null;
        }
        if (ed1VarP instanceof tf5) {
            fk2 fk2Var = ((uf5) ((tf5) ed1VarP)).i0;
            v15 name = ot0Var.getName();
            name.getClass();
            return new qs0(fk2Var, name);
        }
        if (!(ed1VarP instanceof pt0) || (qs0VarF = f((ot0) ed1VarP)) == null) {
            return null;
        }
        v15 name2 = ot0Var.getName();
        name2.getClass();
        return qs0VarF.d(name2);
    }

    public static final fk2 g(ed1 ed1Var) {
        ed1Var.getClass();
        fk2 fk2VarG = bl1.g(ed1Var);
        return fk2VarG != null ? fk2VarG : bl1.f(ed1Var.p()).a(ed1Var.getName()).i();
    }

    public static final void h(vx4 vx4Var) {
        vx4Var.getClass();
        if (vx4Var.W(a24.a) == null) {
            return;
        }
        c2.m();
    }

    public static final ld0 i(ld0 ld0Var) {
        ld0Var.getClass();
        return ld0Var instanceof cx5 ? ((cx5) ld0Var).l0 : ld0Var;
    }
}
