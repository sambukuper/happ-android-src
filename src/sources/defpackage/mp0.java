package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp0 extends kp0 {
    public final xe2 f0;

    public mp0(int i, l90 l90Var, s61 s61Var, xe2 xe2Var) {
        super(s61Var, i, l90Var);
        this.f0 = xe2Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
    @Override // defpackage.kp0, defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) throws Throwable {
        Object objA;
        int i = this.Y;
        c71 c71Var = c71.X;
        if (i == -3) {
            s61 s61VarW = q51Var.w();
            Boolean bool = Boolean.FALSE;
            dx0 dx0Var = new dx0((byte) 23);
            s61 s61Var = this.X;
            s61 s61VarB0 = !((Boolean) s61Var.U(dx0Var, bool)).booleanValue() ? s61VarW.B0(s61Var) : ch3.w(s61VarW, s61Var, false);
            if (dh3.f(s61VarB0, s61VarW)) {
                Object objI = i(ze2Var, q51Var);
                if (objI == c71Var) {
                    return objI;
                }
            } else {
                pz2 pz2Var = pz2.E0;
                if (dh3.f(s61VarB0.H0(pz2Var), s61VarW.H0(pz2Var))) {
                    s61 s61VarW2 = q51Var.w();
                    if (!(ze2Var instanceof s27) && !(ze2Var instanceof a65)) {
                        ze2Var = new zj(ze2Var, s61VarW2);
                    }
                    Object objL0 = vr3.l0(s61VarB0, ze2Var, g98.b(s61VarB0), new q0((Object) this, (q51) null, (byte) 13), q51Var);
                    if (objL0 == c71Var) {
                        return objL0;
                    }
                } else {
                    objA = super.a(ze2Var, q51Var);
                    if (objA == c71Var) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(ze2Var, q51Var);
            if (objA == c71Var) {
                return objA;
            }
        }
        return dn8.a;
    }

    @Override // defpackage.kp0
    public final Object d(kv5 kv5Var, q51 q51Var) {
        Object objI = i(new s27(kv5Var), q51Var);
        return objI == c71.X ? objI : dn8.a;
    }

    public Object i(ze2 ze2Var, q51 q51Var) {
        Object objA = this.f0.a(ze2Var, q51Var);
        return objA == c71.X ? objA : dn8.a;
    }

    @Override // defpackage.kp0
    public final String toString() {
        return this.f0 + " -> " + super.toString();
    }
}
