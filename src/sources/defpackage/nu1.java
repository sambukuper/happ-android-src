package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 extends qj6 implements rn2 {
    public final /* synthetic */ byte Z = 1;
    public byte f0;
    public /* synthetic */ Object g0;
    public Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ on2 j0;
    public final /* synthetic */ on2 k0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(w01 w01Var, m30 m30Var, rn2 rn2Var, dn2 dn2Var, xo xoVar, q51 q51Var) {
        super(2, q51Var);
        this.h0 = w01Var;
        this.i0 = m30Var;
        this.j0 = rn2Var;
        this.k0 = dn2Var;
        this.l0 = xoVar;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        bz7 bz7Var = (bz7) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((nu1) n(q51Var, bz7Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.l0;
        on2 on2Var = this.k0;
        on2 on2Var2 = this.j0;
        Object obj3 = this.i0;
        switch (b) {
            case 0:
                nu1 nu1Var = new nu1((w01) this.h0, (m30) obj3, (rn2) on2Var2, (dn2) on2Var, (xo) obj2, q51Var);
                nu1Var.g0 = obj;
                return nu1Var;
            default:
                nu1 nu1Var2 = new nu1((b71) obj3, (gs1) on2Var2, (v28) on2Var, (dt5) obj2, q51Var);
                nu1Var2.g0 = obj;
                return nu1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        bz7 bz7Var;
        Object objA;
        bz7 bz7Var2;
        bm3 bm3VarG;
        Object objB;
        q51 q51Var;
        Object objI;
        hq5 hq5Var;
        long j;
        r68 r68Var;
        s48 s48Var;
        boolean z;
        y78 y78Var;
        byte b = this.Z;
        on2 on2Var = this.k0;
        on2 on2Var2 = this.j0;
        c71 c71Var = c71.X;
        Object obj2 = this.l0;
        Object obj3 = this.i0;
        dn8 dn8Var = dn8.a;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                byte b4 = this.f0;
                if (b4 != 0) {
                    if (b4 == 1) {
                        bz7Var = (bz7) this.g0;
                        w39.n0(obj);
                        objA = obj;
                    } else {
                        if (b4 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    return dn8Var;
                }
                w39.n0(obj);
                bz7Var = (bz7) this.g0;
                this.g0 = bz7Var;
                this.f0 = (byte) 1;
                objA = q18.a(bz7Var, false, bq5.X, this);
                if (objA == c71Var) {
                    return c71Var;
                }
                this.g0 = null;
                this.f0 = (byte) 2;
                if (qu1.h(bz7Var, (hq5) objA, (w01) this.h0, (m30) obj3, (rn2) on2Var2, (dn2) on2Var, (xo) obj2, this) == c71Var) {
                    return c71Var;
                }
                return dn8Var;
            default:
                b71 b71Var = (b71) obj3;
                dt5 dt5Var = (dt5) obj2;
                byte b5 = this.f0;
                q51 q51Var2 = null;
                if (b5 != 0) {
                    if (b5 == 1) {
                        bm3VarG = (og7) this.h0;
                        bz7Var2 = (bz7) this.g0;
                        w39.n0(obj);
                        objB = obj;
                    } else {
                        if (b5 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bm3VarG = (bm3) this.g0;
                        w39.n0(obj);
                        objI = obj;
                        q51Var = null;
                    }
                    hq5Var = (hq5) objI;
                    if (hq5Var == null) {
                        q18.f(b71Var, bm3VarG, new j18(dt5Var, q51Var, b2));
                    } else {
                        hq5Var.a();
                        q18.f(b71Var, bm3VarG, new j18(dt5Var, q51Var, b3));
                        v28 v28Var = (v28) on2Var;
                        j = hq5Var.c;
                        a23 a23Var = (a23) v28Var.Y;
                        r68Var = (r68) v28Var.Z;
                        s48Var = (s48) v28Var.f0;
                        a23Var.invoke();
                        z = r68Var.i;
                        y78Var = r68Var.b;
                        if (z && r68Var.h) {
                            s48Var.invoke();
                            if (r68Var.a.d().length() > 0) {
                                r68Var.x(true);
                            }
                            r68Var.y(s88.X);
                            r68Var.v(ys7.c(y78Var, y78Var.a(j)));
                        }
                    }
                    return dn8Var;
                }
                w39.n0(obj);
                bz7Var2 = (bz7) this.g0;
                bm3VarG = w51.G(b71Var, null, e71.f0, new k18(dt5Var, q51Var2, b2), 1);
                this.g0 = bz7Var2;
                this.h0 = bm3VarG;
                this.f0 = (byte) 1;
                objB = q18.b(bz7Var2, this, 3);
                if (objB == c71Var) {
                    return c71Var;
                }
                hq5 hq5Var2 = (hq5) objB;
                hq5Var2.a();
                gs1 gs1Var = (gs1) on2Var2;
                if (gs1Var != q18.a) {
                    q51Var = null;
                    q18.f(b71Var, bm3VarG, new qk4((Object) gs1Var, (Object) dt5Var, (Object) hq5Var2, q51Var2, (byte) 21));
                } else {
                    q51Var = null;
                }
                this.g0 = bm3VarG;
                this.h0 = q51Var;
                this.f0 = (byte) 2;
                objI = q18.i(bz7Var2, bq5.Y, this);
                if (objI == c71Var) {
                    return c71Var;
                }
                hq5Var = (hq5) objI;
                if (hq5Var == null) {
                    q18.f(b71Var, bm3VarG, new j18(dt5Var, q51Var, b2));
                } else {
                    hq5Var.a();
                    q18.f(b71Var, bm3VarG, new j18(dt5Var, q51Var, b3));
                    v28 v28Var2 = (v28) on2Var;
                    j = hq5Var.c;
                    a23 a23Var2 = (a23) v28Var2.Y;
                    r68Var = (r68) v28Var2.Z;
                    s48Var = (s48) v28Var2.f0;
                    a23Var2.invoke();
                    z = r68Var.i;
                    y78Var = r68Var.b;
                    if (z) {
                        s48Var.invoke();
                        if (r68Var.a.d().length() > 0) {
                            r68Var.x(true);
                        }
                        r68Var.y(s88.X);
                        r68Var.v(ys7.c(y78Var, y78Var.a(j)));
                    }
                }
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(b71 b71Var, gs1 gs1Var, v28 v28Var, dt5 dt5Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = b71Var;
        this.j0 = gs1Var;
        this.k0 = v28Var;
        this.l0 = dt5Var;
    }
}
