package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 extends ob6 {
    public static final /* synthetic */ nw3[] g0 = {new lx5(qj1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new lx5(qj1.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final ej1 X;
    public final int Y;
    public final fw3 Z;
    public final tb6 f0;

    public qj1(ej1 ej1Var, int i, fw3 fw3Var, dn2 dn2Var) {
        this.X = ej1Var;
        this.Y = i;
        this.Z = fw3Var;
        this.f0 = zc1.X(null, dn2Var);
        zc1.X(null, new pj1(this, (byte) 0));
    }

    @Override // defpackage.ob6
    public final pw3 B() {
        t14 t14VarC = K().c();
        t14VarC.getClass();
        kk1 kk1Var = new kk1(t14VarC, new pj1(this, (byte) 1), false);
        return this.Z == fw3.X ? kk1Var : mb6.c0(this.X, kk1Var);
    }

    @Override // defpackage.ob6
    public final boolean F() {
        zg5 zg5VarK = K();
        ot8 ot8Var = zg5VarK instanceof ot8 ? (ot8) zg5VarK : null;
        if (ot8Var != null) {
            return el1.a(ot8Var);
        }
        return false;
    }

    @Override // defpackage.ob6
    public final boolean G() {
        zg5 zg5VarK = K();
        return (zg5VarK instanceof ot8) && ((ot8) zg5VarK).n0 != null;
    }

    public final zg5 K() {
        nw3 nw3Var = g0[0];
        Object objInvoke = this.f0.invoke();
        objInvoke.getClass();
        return (zg5) objInvoke;
    }

    @Override // defpackage.wu3
    public final List Q() {
        throw null;
    }

    @Override // defpackage.ob6
    public final kb6 f() {
        return this.X;
    }

    @Override // defpackage.ob6
    public final String getName() {
        zg5 zg5VarK = K();
        ot8 ot8Var = zg5VarK instanceof ot8 ? (ot8) zg5VarK : null;
        if (ot8Var != null && !ot8Var.p().z()) {
            v15 name = ot8Var.getName();
            name.getClass();
            if (!name.Y) {
                return name.b();
            }
        }
        return null;
    }

    @Override // defpackage.ob6
    public final boolean t() {
        zg5 zg5VarK = K();
        ot8 ot8Var = zg5VarK instanceof ot8 ? (ot8) zg5VarK : null;
        return ot8Var != null && ot8Var.I0();
    }

    @Override // defpackage.ob6
    public final int v() {
        return this.Y;
    }

    @Override // defpackage.ob6
    public final fw3 x() {
        return this.Z;
    }
}
