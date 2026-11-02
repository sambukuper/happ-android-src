package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ub6 extends w39 {
    public final km i0;
    public final boolean j0;

    public ub6(km kmVar, boolean z) {
        this.i0 = kmVar;
        this.j0 = z;
    }

    @Override // defpackage.w39
    public final km F() {
        return this.i0;
    }

    @Override // defpackage.w39
    public final boolean H() {
        return this.j0;
    }

    @Override // defpackage.w39
    public final gk2 M(zk6 zk6Var) {
        qs0 qs0VarF0;
        fk2 fk2VarA;
        String strP;
        zk6Var.getClass();
        u1 u1Var = (u1) zk6Var;
        zu3 zu3VarV = u1Var.v();
        if (zu3VarV != null && (strP = zu3VarV.p()) != null) {
            return new gk2(strP);
        }
        lv3 lv3VarM = u1Var.M();
        ev3 ev3Var = lv3VarM instanceof ev3 ? (ev3) lv3VarM : null;
        if (ev3Var == null || (qs0VarF0 = ev3Var.f0()) == null || (fk2VarA = qs0VarF0.a()) == null) {
            return null;
        }
        return fk2VarA.a;
    }

    @Override // defpackage.w39
    public final boolean U(x14 x14Var) {
        x14Var.getClass();
        u1 u1Var = x14Var instanceof u1 ? (u1) x14Var : null;
        lv3 lv3VarM = u1Var != null ? u1Var.M() : null;
        zu3 zu3Var = lv3VarM instanceof zu3 ? (zu3) lv3VarM : null;
        if (zu3Var == null) {
            return false;
        }
        return zc1.M(zu3Var).isArray();
    }

    @Override // defpackage.w39
    public final boolean V() {
        return this.i0 == km.METHOD_RETURN_TYPE;
    }

    @Override // defpackage.w39
    public final boolean X(ji8 ji8Var) {
        ji8Var.getClass();
        ev3 ev3Var = null;
        rw3 rw3Var = ji8Var instanceof rw3 ? (rw3) ji8Var : null;
        if (rw3Var == null) {
            return false;
        }
        sw3 sw3Var = rw3Var.Z;
        if (sw3Var instanceof ev3) {
            ev3Var = (ev3) sw3Var;
        } else if (sw3Var instanceof kb6) {
            ov3 ov3VarD = ((kb6) sw3Var).D();
            if (ov3VarD instanceof ev3) {
                ev3Var = (ev3) ov3VarD;
            }
        }
        return ev3Var != null && ev3Var.i0() == null;
    }
}
