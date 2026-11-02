package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dg2 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0;
    public ze2 h0;
    public byte i0;
    public /* synthetic */ ze2 j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ on2 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg2(q51 q51Var, xk5 xk5Var) {
        super(3, q51Var);
        this.g0 = (byte) 1;
        this.l0 = xk5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        on2 on2Var = this.l0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                ze2 ze2Var = this.j0;
                Object obj2 = this.k0;
                byte b2 = this.i0;
                if (b2 == 0) {
                    w39.n0(obj);
                    this.j0 = null;
                    this.k0 = null;
                    this.h0 = ze2Var;
                    this.i0 = (byte) 1;
                    obj = ((rn2) on2Var).K(obj2, this);
                    if (obj != c71Var) {
                    }
                    return c71Var;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ze2Var = this.h0;
                w39.n0(obj);
                this.j0 = null;
                this.k0 = null;
                this.h0 = null;
                this.i0 = (byte) 2;
                if (ze2Var.l(obj, this) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
            case 1:
                ze2 ze2Var2 = this.j0;
                Object[] objArr = (Object[]) this.k0;
                byte b3 = this.i0;
                if (b3 == 0) {
                    w39.n0(obj);
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.j0 = null;
                    this.k0 = null;
                    this.h0 = ze2Var2;
                    this.i0 = (byte) 1;
                    obj = ((xk5) on2Var).F(obj3, obj4, obj5, this);
                    if (obj != c71Var) {
                    }
                    return c71Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ze2Var2 = this.h0;
                w39.n0(obj);
                this.j0 = null;
                this.k0 = null;
                this.h0 = null;
                this.i0 = (byte) 2;
                if (ze2Var2.l(obj, this) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
            default:
                ze2 ze2Var3 = this.j0;
                Object[] objArr2 = (Object[]) this.k0;
                byte b4 = this.i0;
                if (b4 == 0) {
                    w39.n0(obj);
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    this.j0 = null;
                    this.k0 = null;
                    this.h0 = ze2Var3;
                    this.i0 = (byte) 1;
                    obj = ((sn2) on2Var).x(obj6, obj7, this);
                    if (obj != c71Var) {
                    }
                    return c71Var;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ze2Var3 = this.h0;
                w39.n0(obj);
                this.j0 = null;
                this.k0 = null;
                this.h0 = null;
                this.i0 = (byte) 2;
                if (ze2Var3.l(obj, this) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        on2 on2Var = this.l0;
        ze2 ze2Var = (ze2) obj;
        switch (b) {
            case 0:
                dg2 dg2Var = new dg2((rn2) on2Var, (q51) obj3, (byte) 0);
                dg2Var.j0 = ze2Var;
                dg2Var.k0 = obj2;
                return dg2Var.q(dn8Var);
            case 1:
                dg2 dg2Var2 = new dg2((q51) obj3, (xk5) on2Var);
                dg2Var2.j0 = ze2Var;
                dg2Var2.k0 = (Object[]) obj2;
                return dg2Var2.q(dn8Var);
            default:
                dg2 dg2Var3 = new dg2((sn2) on2Var, (q51) obj3, (byte) 2);
                dg2Var3.j0 = ze2Var;
                dg2Var3.k0 = (Object[]) obj2;
                return dg2Var3.q(dn8Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg2(on2 on2Var, q51 q51Var, byte b) {
        super(3, q51Var);
        this.g0 = b;
        this.l0 = on2Var;
    }
}
