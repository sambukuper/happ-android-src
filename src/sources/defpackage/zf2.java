package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zf2 implements ze2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ ze2 Y;
    public final /* synthetic */ rn2 Z;

    public zf2(ze2 ze2Var, rn2 rn2Var) {
        this.Y = ze2Var;
        this.Z = rn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        yf2 yf2Var;
        pg2 pg2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        rn2 rn2Var = this.Z;
        int i = 0;
        ze2 ze2Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof yf2) {
                    yf2Var = (yf2) q51Var;
                    int i2 = yf2Var.g0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        yf2Var.g0 = i2 - Integer.MIN_VALUE;
                    } else {
                        yf2Var = new yf2(this, q51Var);
                    }
                } else {
                    yf2Var = new yf2(this, q51Var);
                }
                Object objK = yf2Var.f0;
                int i3 = yf2Var.g0;
                if (i3 == 0) {
                    w39.n0(objK);
                    yf2Var.i0 = obj;
                    yf2Var.j0 = 0;
                    yf2Var.g0 = 1;
                    objK = rn2Var.K(obj, yf2Var);
                    if (objK != c71Var) {
                    }
                    return c71Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        w39.n0(objK);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = yf2Var.j0;
                obj = yf2Var.i0;
                w39.n0(objK);
                if (!((Boolean) objK).booleanValue()) {
                    throw new h(this);
                }
                yf2Var.i0 = null;
                yf2Var.j0 = i;
                yf2Var.g0 = 2;
                if (ze2Var.l(obj, yf2Var) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
            default:
                if (q51Var instanceof pg2) {
                    pg2Var = (pg2) q51Var;
                    int i4 = pg2Var.g0;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pg2Var.g0 = i4 - Integer.MIN_VALUE;
                    } else {
                        pg2Var = new pg2(this, q51Var);
                    }
                } else {
                    pg2Var = new pg2(this, q51Var);
                }
                Object obj2 = pg2Var.f0;
                int i5 = pg2Var.g0;
                if (i5 == 0) {
                    w39.n0(obj2);
                    pg2Var.i0 = obj;
                    pg2Var.j0 = ze2Var;
                    pg2Var.k0 = 0;
                    pg2Var.g0 = 1;
                    if (rn2Var.K(obj, pg2Var) != c71Var) {
                    }
                    return c71Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        w39.n0(obj2);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = pg2Var.k0;
                ze2Var = pg2Var.j0;
                obj = pg2Var.i0;
                w39.n0(obj2);
                pg2Var.i0 = null;
                pg2Var.j0 = null;
                pg2Var.k0 = i;
                pg2Var.g0 = 2;
                if (ze2Var.l(obj, pg2Var) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
        }
    }

    public zf2(rn2 rn2Var, ze2 ze2Var) {
        this.Z = rn2Var;
        this.Y = ze2Var;
    }
}
