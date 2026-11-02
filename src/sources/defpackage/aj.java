package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj extends g24 implements rn2 {
    public final /* synthetic */ byte Y = 0;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ zy0 g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(Object obj, kx4 kx4Var, gn2 gn2Var, q8 q8Var, String str, gn2 gn2Var2, zy0 zy0Var, int i) {
        super(2);
        this.Z = obj;
        this.h0 = kx4Var;
        this.f0 = gn2Var;
        this.i0 = q8Var;
        this.j0 = str;
        this.k0 = gn2Var2;
        this.g0 = zy0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.k0;
        Object obj4 = this.j0;
        Object obj5 = this.i0;
        Object obj6 = this.h0;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Number) obj2).intValue();
                rj5 rj5Var = (rj5) obj5;
                lj ljVar = (lj) obj4;
                ce8 ce8Var = (ce8) obj6;
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    rh5 rh5Var = ce8Var.e;
                    rh5 rh5Var2 = ce8Var.d;
                    Object value = rh5Var.getValue();
                    Object obj7 = this.Z;
                    boolean zG = lp2Var.g(dh3.f(obj7, value));
                    Object objK = lp2Var.K();
                    gn2 gn2Var = this.f0;
                    be beVar = zz0.a;
                    if (zG || objK == beVar) {
                        objK = (!dh3.f(obj7, rh5Var.getValue()) || rj5Var == null) ? (dh3.f(obj7, ce8Var.f().a()) || dh3.f(obj7, ce8Var.f().c())) ? (a51) gn2Var.B(ljVar) : (a51) gn2Var.B(new rj5(ljVar, ce8Var.f().a(), obj7)) : (a51) gn2Var.B(rj5Var);
                        lp2Var.g0(objK);
                    }
                    a51 a51Var = (a51) objK;
                    boolean zG2 = lp2Var.g(dh3.f(ce8Var.f().c(), obj7)) | lp2Var.g(dh3.f(obj7, rh5Var.getValue()));
                    Object objK2 = lp2Var.K();
                    if (zG2 || objK2 == beVar) {
                        objK2 = (dh3.f(ce8Var.f().c(), obj7) || (dh3.f(obj7, rh5Var.getValue()) && rj5Var != null)) ? h62.b : (dh3.f(obj7, ce8Var.f().a()) || dh3.f(obj7, ce8Var.f().c())) ? ((a51) gn2Var.B(ljVar)).b : ((a51) gn2Var.B(new rj5(ljVar, obj7, ce8Var.f().a()))).b;
                        lp2Var.g0(objK2);
                    }
                    h62 h62Var = (h62) objK2;
                    Object objK3 = lp2Var.K();
                    if (objK3 == beVar) {
                        objK3 = new gj(dh3.f(obj7, rh5Var2.getValue()));
                        lp2Var.g0(objK3);
                    }
                    gj gjVar = (gj) objK3;
                    g22 g22Var = a51Var.a;
                    h79 h79Var = new h79(obj7, a51Var.c.l());
                    gjVar.X.setValue(Boolean.valueOf(dh3.f(obj7, rh5Var2.getValue())));
                    gjVar.Y.setValue(Boolean.valueOf((!dh3.f(obj7, rh5Var.getValue()) || dh3.f(obj7, rh5Var2.getValue()) || dh3.f(obj7, ce8Var.c())) ? false : true));
                    kx4 kx4VarY = h79Var.y(gjVar);
                    boolean zH = lp2Var.h(obj7);
                    Object objK4 = lp2Var.K();
                    if (zH || objK4 == beVar) {
                        objK4 = new wi(obj7, (byte) 0);
                        lp2Var.g0(objK4);
                    }
                    gn2 gn2Var2 = (gn2) objK4;
                    boolean zF = lp2Var.f(h62Var);
                    Object objK5 = lp2Var.K();
                    if (zF || objK5 == beVar) {
                        objK5 = new xi(h62Var);
                        lp2Var.g0(objK5);
                    }
                    zc1.a(ce8Var, gn2Var2, kx4VarY, g22Var, h62Var, (rn2) objK5, jm4.U(1831990167, new zi(obj7, (vd7) obj3, ljVar, this.g0), lp2Var), lp2Var, 100663296);
                }
                break;
            default:
                ((Number) obj2).intValue();
                z91.c(this.Z, (kx4) obj6, this.f0, (q8) obj5, (String) obj4, (gn2) obj3, this.g0, (lp2) obj, w79.P(1794481));
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(Object obj, ce8 ce8Var, rj5 rj5Var, gn2 gn2Var, lj ljVar, vd7 vd7Var, zy0 zy0Var) {
        super(2);
        this.Z = obj;
        this.h0 = ce8Var;
        this.i0 = rj5Var;
        this.f0 = gn2Var;
        this.j0 = ljVar;
        this.k0 = vd7Var;
        this.g0 = zy0Var;
    }
}
