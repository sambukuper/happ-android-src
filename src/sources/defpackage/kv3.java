package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv3 extends s21 {
    public kv3(qs0 qs0Var, int i) {
        super(new iv3(new vs0(qs0Var, i)));
    }

    @Override // defpackage.s21
    public final t14 a(vx4 vx4Var) {
        t14 t14VarC;
        vx4Var.getClass();
        ch8.Y.getClass();
        ch8 ch8Var = ch8.Z;
        zz3 zz3VarF = vx4Var.f();
        zz3VarF.getClass();
        sx4 sx4VarJ = zz3VarF.j(tg7.Q.i());
        Object obj = this.a;
        jv3 jv3Var = (jv3) obj;
        if (jv3Var instanceof hv3) {
            t14VarC = ((hv3) obj).a;
        } else {
            if (!(jv3Var instanceof iv3)) {
                b61.c();
                return null;
            }
            vs0 vs0Var = ((iv3) obj).a;
            qs0 qs0Var = vs0Var.a;
            int i = vs0Var.b;
            sx4 sx4VarM = oc.m(vx4Var, qs0Var);
            if (sx4VarM == null) {
                t14VarC = u32.c(s32.UNRESOLVED_KCLASS_CONSTANT_VALUE, qs0Var.toString(), String.valueOf(i));
            } else {
                aa7 aa7VarX = sx4VarM.X();
                aa7VarX.getClass();
                t14 t14VarN = y08.n(aa7VarX);
                for (int i2 = 0; i2 < i; i2++) {
                    t14VarN = vx4Var.f().h(t14VarN);
                }
                t14VarC = t14VarN;
            }
        }
        return dh3.M(ch8Var, sx4VarJ, i21.K(new wg7(t14VarC)));
    }
}
