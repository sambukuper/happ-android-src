package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ ef0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf0(ef0 ef0Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = ef0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((bf0) n(q51Var, b71Var)).q(dn8Var);
                return c71Var;
            case 1:
                ((bf0) n(q51Var, b71Var)).q(dn8Var);
                return c71Var;
            default:
                return ((bf0) n(q51Var, b71Var)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ef0 ef0Var = this.i0;
        switch (b) {
            case 0:
                return new bf0(ef0Var, q51Var, (byte) 0);
            case 1:
                return new bf0(ef0Var, q51Var, (byte) 1);
            default:
                return new bf0(ef0Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        sy8 sy8Var;
        sn0 sn0Var;
        Object objA;
        byte b = 1;
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (z) {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    b61.n();
                    return null;
                }
                w39.n0(obj);
                ef0 ef0Var = this.i0;
                h76 h76Var = ef0Var.g.i0;
                af0 af0Var = new af0(ef0Var, (byte) 0);
                this.h0 = true;
                h76Var.X.a(af0Var, this);
                return c71Var;
            case 1:
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (z2) {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    b61.n();
                    return null;
                }
                w39.n0(obj);
                ef0 ef0Var2 = this.i0;
                f76 f76Var = ef0Var2.g.k0;
                af0 af0Var2 = new af0(ef0Var2, b);
                this.h0 = true;
                f76Var.X.a(af0Var2, this);
                return c71Var2;
            default:
                c71 c71Var3 = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    ef0 ef0Var3 = this.i0;
                    this.h0 = true;
                    ea6 ea6Var = new ea6();
                    synchronized (ef0Var3.q) {
                        sy8Var = ef0Var3.y;
                        sn0Var = ef0Var3.z;
                        ea6Var.X = sn0Var;
                    }
                    if (sy8Var == null || sn0Var == null || (objA = sy8Var.i.a(new te0(ea6Var, ef0Var3, b), this)) != c71Var3) {
                        objA = dn8.a;
                    }
                    if (objA == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }
}
