package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ dn2 j0;
    public final /* synthetic */ rn2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9(dn2 dn2Var, rn2 rn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = dn2Var;
        this.k0 = rn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((s9) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                s9 s9Var = new s9(this.j0, this.k0, q51Var, (byte) 0);
                s9Var.i0 = obj;
                return s9Var;
            default:
                s9 s9Var2 = new s9(this.j0, this.k0, q51Var, (byte) 1);
                s9Var2.i0 = obj;
                return s9Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        rn2 rn2Var = this.k0;
        dn2 dn2Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var = (b71) this.i0;
                ea6 ea6Var = new ea6();
                j31 j31VarL = w51.L(dn2Var);
                r9 r9Var = new r9(ea6Var, b71Var, rn2Var, (byte) 0);
                this.h0 = true;
                return j31VarL.a(r9Var, this) == c71Var ? c71Var : dn8Var;
            default:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var2 = (b71) this.i0;
                ea6 ea6Var2 = new ea6();
                j31 j31VarL2 = w51.L(dn2Var);
                r9 r9Var2 = new r9(ea6Var2, b71Var2, rn2Var, (byte) 1);
                this.h0 = true;
                return j31VarL2.a(r9Var2, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
