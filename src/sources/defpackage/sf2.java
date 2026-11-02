package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 implements xe2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xe2 Y;
    public final /* synthetic */ rn2 Z;

    public /* synthetic */ sf2(xe2 xe2Var, rn2 rn2Var, byte b) {
        this.X = b;
        this.Y = xe2Var;
        this.Z = rn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        xf2 xf2Var;
        zf2 zf2Var;
        h e;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        rn2 rn2Var = this.Z;
        xe2 xe2Var = this.Y;
        switch (b) {
            case 0:
                Object objA = xe2Var.a(new zj(new aa6(), ze2Var, rn2Var, (byte) 3), q51Var);
                return objA == c71Var ? objA : dn8Var;
            case 1:
                if (q51Var instanceof xf2) {
                    xf2Var = (xf2) q51Var;
                    int i = xf2Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xf2Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        xf2Var = new xf2(this, q51Var);
                    }
                } else {
                    xf2Var = new xf2(this, q51Var);
                }
                Object obj = xf2Var.f0;
                int i2 = xf2Var.g0;
                if (i2 == 0) {
                    w39.n0(obj);
                    zf2 zf2Var2 = new zf2(rn2Var, ze2Var);
                    try {
                        xf2Var.i0 = zf2Var2;
                        xf2Var.g0 = 1;
                        return xe2Var.a(zf2Var2, xf2Var) == c71Var ? c71Var : dn8Var;
                    } catch (h e2) {
                        zf2Var = zf2Var2;
                        e = e2;
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zf2Var = xf2Var.i0;
                    try {
                        w39.n0(obj);
                        return dn8Var;
                    } catch (h e3) {
                        e = e3;
                    }
                }
                if (e.X != zf2Var) {
                    throw e;
                }
                s61 s61Var = xf2Var.Y;
                s61Var.getClass();
                u70.I(s61Var);
                return dn8Var;
            default:
                Object objA2 = xe2Var.a(new zf2(ze2Var, rn2Var), q51Var);
                return objA2 == c71Var ? objA2 : dn8Var;
        }
    }
}
