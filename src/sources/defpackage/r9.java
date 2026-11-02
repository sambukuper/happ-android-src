package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ea6 Y;
    public final /* synthetic */ b71 Z;
    public final /* synthetic */ rn2 f0;

    public /* synthetic */ r9(ea6 ea6Var, b71 b71Var, rn2 rn2Var, byte b) {
        this.X = b;
        this.Y = ea6Var;
        this.Z = b71Var;
        this.f0 = rn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        p9 p9Var;
        q9 q9Var;
        Object obj2 = obj;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        e71 e71Var = e71.f0;
        c71 c71Var = c71.X;
        ea6 ea6Var = this.Y;
        switch (b) {
            case 0:
                if (q51Var instanceof p9) {
                    p9Var = (p9) q51Var;
                    int i = p9Var.i0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p9Var.i0 = i - Integer.MIN_VALUE;
                    } else {
                        p9Var = new p9(this, q51Var);
                    }
                } else {
                    p9Var = new p9(this, q51Var);
                }
                Object obj3 = p9Var.g0;
                int i2 = p9Var.i0;
                if (i2 == 0) {
                    w39.n0(obj3);
                    bm3 bm3Var = (bm3) ea6Var.X;
                    if (bm3Var != null) {
                        bm3Var.m(new e9());
                        p9Var.f0 = obj2;
                        p9Var.i0 = 1;
                        if (bm3Var.V0(p9Var) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = p9Var.f0;
                    w39.n0(obj3);
                }
                rn2 rn2Var = this.f0;
                b71 b71Var = this.Z;
                ea6Var.X = w51.G(b71Var, null, e71Var, new o9(rn2Var, obj2, b71Var, null, (byte) 0), 1);
                return dn8Var;
            default:
                if (q51Var instanceof q9) {
                    q9Var = (q9) q51Var;
                    int i3 = q9Var.i0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q9Var.i0 = i3 - Integer.MIN_VALUE;
                    } else {
                        q9Var = new q9(this, q51Var);
                    }
                } else {
                    q9Var = new q9(this, q51Var);
                }
                Object obj4 = q9Var.g0;
                int i4 = q9Var.i0;
                if (i4 == 0) {
                    w39.n0(obj4);
                    bm3 bm3Var2 = (bm3) ea6Var.X;
                    if (bm3Var2 != null) {
                        bm3Var2.m(new f9());
                        q9Var.f0 = obj2;
                        q9Var.i0 = 1;
                        if (bm3Var2.V0(q9Var) == c71Var) {
                            return c71Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = q9Var.f0;
                    w39.n0(obj4);
                }
                rn2 rn2Var2 = this.f0;
                b71 b71Var2 = this.Z;
                ea6Var.X = w51.G(b71Var2, null, e71Var, new o9(rn2Var2, obj2, b71Var2, null, (byte) 1), 1);
                return dn8Var;
        }
    }
}
