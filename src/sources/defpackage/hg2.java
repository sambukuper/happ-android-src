package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ rn2 Y;
    public final /* synthetic */ ea6 Z;

    public /* synthetic */ hg2(rn2 rn2Var, ea6 ea6Var, byte b) {
        this.X = b;
        this.Y = rn2Var;
        this.Z = ea6Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        gg2 gg2Var;
        kg2 kg2Var;
        byte b = this.X;
        ea6 ea6Var = this.Z;
        dn8 dn8Var = dn8.a;
        rn2 rn2Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof gg2) {
                    gg2Var = (gg2) q51Var;
                    int i = gg2Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gg2Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        gg2Var = new gg2(this, q51Var);
                    }
                } else {
                    gg2Var = new gg2(this, q51Var);
                }
                Object objK = gg2Var.f0;
                int i2 = gg2Var.g0;
                if (i2 == 0) {
                    w39.n0(objK);
                    gg2Var.i0 = obj;
                    gg2Var.g0 = 1;
                    objK = rn2Var.K(obj, gg2Var);
                    if (objK == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = gg2Var.i0;
                    w39.n0(objK);
                }
                if (!((Boolean) objK).booleanValue()) {
                    return dn8Var;
                }
                ea6Var.X = obj;
                throw new h(this);
            default:
                if (q51Var instanceof kg2) {
                    kg2Var = (kg2) q51Var;
                    int i3 = kg2Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kg2Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        kg2Var = new kg2(this, q51Var);
                    }
                } else {
                    kg2Var = new kg2(this, q51Var);
                }
                Object objK2 = kg2Var.f0;
                int i4 = kg2Var.g0;
                if (i4 == 0) {
                    w39.n0(objK2);
                    kg2Var.i0 = obj;
                    kg2Var.g0 = 1;
                    objK2 = rn2Var.K(obj, kg2Var);
                    if (objK2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i4 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = kg2Var.i0;
                    w39.n0(objK2);
                }
                if (!((Boolean) objK2).booleanValue()) {
                    return dn8Var;
                }
                ea6Var.X = obj;
                throw new h(this);
        }
    }
}
