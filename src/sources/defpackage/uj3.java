package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uj3 {
    public static final v15 a = v15.e("message");
    public static final v15 b = v15.e("allowedTargets");
    public static final v15 c = v15.e("value");
    public static final Map d = zp4.J(new qg5(tg7.t, ks3.c), new qg5(tg7.w, ks3.d), new qg5(tg7.x, ks3.f));

    public static pr5 a(fk2 fk2Var, vj3 vj3Var, z47 z47Var) {
        ja6 ja6VarA;
        fk2Var.getClass();
        vj3Var.getClass();
        z47Var.getClass();
        if (fk2Var.equals(tg7.m)) {
            fk2 fk2Var2 = ks3.e;
            fk2Var2.getClass();
            ja6 ja6VarA2 = vj3Var.a(fk2Var2);
            if (ja6VarA2 != null) {
                return new dk3(ja6VarA2, z47Var);
            }
        }
        fk2 fk2Var3 = (fk2) d.get(fk2Var);
        if (fk2Var3 == null || (ja6VarA = vj3Var.a(fk2Var3)) == null) {
            return null;
        }
        return b(ja6VarA, z47Var, false);
    }

    public static pr5 b(ja6 ja6Var, z47 z47Var, boolean z) {
        z47Var.getClass();
        qs0 qs0VarA = ia6.a(zc1.M(zc1.K(ja6Var.a)));
        fk2 fk2Var = ks3.c;
        fk2Var.getClass();
        if (qs0VarA.equals(new qs0(fk2Var.b(), fk2Var.a.g()))) {
            return new il3(ja6Var, z47Var);
        }
        fk2 fk2Var2 = ks3.d;
        fk2Var2.getClass();
        if (qs0VarA.equals(new qs0(fk2Var2.b(), fk2Var2.a.g()))) {
            return new hl3(ja6Var, z47Var);
        }
        fk2 fk2Var3 = ks3.f;
        fk2Var3.getClass();
        if (qs0VarA.equals(new qs0(fk2Var3.b(), fk2Var3.a.g()))) {
            return new tj3(z47Var, ja6Var, tg7.x);
        }
        fk2 fk2Var4 = ks3.e;
        fk2Var4.getClass();
        if (qs0VarA.equals(new qs0(fk2Var4.b(), fk2Var4.a.g()))) {
            return null;
        }
        return new m44(ja6Var, z47Var, z);
    }
}
