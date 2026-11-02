package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os3 implements ls0 {
    public static final v15 g;
    public static final qs0 h;
    public final wx4 a;
    public final gn2 b;
    public final te4 c;
    public static final /* synthetic */ nw3[] e = {new lx5(os3.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final k32 d = new k32();
    public static final fk2 f = ug7.k;

    static {
        gk2 gk2Var = tg7.c;
        g = gk2Var.g();
        fk2 fk2VarI = gk2Var.i();
        h = new qs0(fk2VarI.b(), fk2VarI.a.g());
    }

    public os3(ve4 ve4Var, wx4 wx4Var) {
        cl1 cl1Var = cl1.o0;
        this.a = wx4Var;
        this.b = cl1Var;
        this.c = new te4(ve4Var, new c3((Object) this, (Object) ve4Var, (byte) 19));
    }

    @Override // defpackage.ls0
    public final sx4 a(qs0 qs0Var) {
        qs0Var.getClass();
        if (!qs0Var.equals(h)) {
            return null;
        }
        return (ms0) hi5.e0(this.c, e[0]);
    }

    @Override // defpackage.ls0
    public final Collection b(fk2 fk2Var) {
        fk2Var.getClass();
        if (!fk2Var.equals(f)) {
            return m02.X;
        }
        return w45.U((ms0) hi5.e0(this.c, e[0]));
    }

    @Override // defpackage.ls0
    public final boolean c(fk2 fk2Var, v15 v15Var) {
        fk2Var.getClass();
        v15Var.getClass();
        return v15Var.equals(g) && fk2Var.equals(f);
    }
}
