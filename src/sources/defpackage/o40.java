package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o40 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ jc8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(jc8 jc8Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = jc8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((o40) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((o40) n((q51) obj2, bool)).q(dn8Var);
                return dn8Var;
            case 2:
                return ((o40) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((o40) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        jc8 jc8Var = this.i0;
        switch (b) {
            case 0:
                return new o40(jc8Var, q51Var, (byte) 0);
            case 1:
                o40 o40Var = new o40(jc8Var, q51Var, (byte) 1);
                o40Var.h0 = ((Boolean) obj).booleanValue();
                return o40Var;
            case 2:
                return new o40(jc8Var, q51Var, (byte) 2);
            default:
                return new o40(jc8Var, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        f15 f15Var = f15.X;
        dn8 dn8Var = dn8.a;
        jc8 jc8Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (jc8Var.c(f15Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 1:
                w39.n0(obj);
                if (!this.h0) {
                    jc8Var.a();
                }
                return dn8Var;
            case 2:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (jc8Var.c(f15.Y, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (jc8Var.c(f15Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
        }
    }
}
