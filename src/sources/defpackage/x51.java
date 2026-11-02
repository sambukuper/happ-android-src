package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x51 implements rn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;
    public final Object f0;
    public final Object g0;

    public /* synthetic */ x51(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        u1 u1VarZ;
        byte b = this.X;
        Object obj3 = this.g0;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        byte b2 = 0;
        switch (b) {
            case 0:
                ClassLoader classLoader = (ClassLoader) obj6;
                li8 li8Var = (li8) obj5;
                dn2 dn2Var = (dn2) obj4;
                ea6 ea6Var = (ea6) obj3;
                int iIntValue = ((Number) obj).intValue();
                pz3 pz3Var = (pz3) obj2;
                pz3Var.getClass();
                if (pz3Var.equals(pz3.c)) {
                    return uw3.c;
                }
                mz3 mz3Var = pz3Var.b;
                if (mz3Var != null) {
                    u1VarZ = ys0.Z(mz3Var, classLoader, li8Var, true, dn2Var == null ? null : new y51(new f3(ea6Var, (byte) 7), iIntValue, b2));
                } else {
                    u1VarZ = null;
                }
                rz3 rz3Var = pz3Var.a;
                return new uw3(u1VarZ, rz3Var != null ? ys0.b0(rz3Var) : null);
            default:
                lp2 lp2Var = (lp2) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (lp2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    kx4 kx4VarO = x97.O(hx4.X, "Container");
                    i58 i58Var = new i58((y05) obj6, y05.class, "value", "getValue()Ljava/lang/Object;", 0);
                    pn7.i((q58) obj5);
                    kx4 kx4VarT = w79.t(kx4VarO, new sn((Object) i58Var, obj4, (Object) pz2.q0, (byte) 18));
                    zy0 zy0Var = (zy0) obj3;
                    xr4 xr4VarC = g80.c(pz2.Z, true);
                    int I = km4.I(lp2Var);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarT);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, xr4VarC);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    dx0 dx0Var = pz2.C0;
                    if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                        p61.v(I, lp2Var, I, dx0Var);
                    }
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    zy0Var.K(lp2Var, 0);
                    lp2Var.p(true);
                } else {
                    lp2Var.Q();
                }
                return dn8.a;
        }
    }
}
