package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ my6 i0;
    public /* synthetic */ long j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(my6 my6Var, long j, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = my6Var;
        this.j0 = j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                long j = ((z85) obj).a;
                x2 x2Var = new x2(this.i0, (q51) obj2);
                x2Var.j0 = j;
                return x2Var.q(dn8Var);
            case 1:
                return ((x2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((x2) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((x2) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                x2 x2Var = new x2(this.i0, q51Var);
                x2Var.j0 = ((z85) obj).a;
                return x2Var;
            case 1:
                return new x2(this.i0, this.j0, q51Var, (byte) 1);
            case 2:
                return new x2(this.i0, this.j0, q51Var, (byte) 2);
            default:
                return new x2(this.i0, this.j0, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        my6 my6Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                long j = this.j0;
                this.h0 = true;
                Object objB = iy6.b(my6Var.T0, j, this);
                return objB == c71Var ? c71Var : objB;
            case 1:
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
                sy6 sy6Var = my6Var.T0;
                mn5 mn5Var = new mn5(this.j0, null);
                this.h0 = true;
                return sy6Var.g(f15.Y, mn5Var, this) == c71Var ? c71Var : dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                sy6 sy6Var2 = my6Var.T0;
                long j2 = this.j0;
                this.h0 = true;
                return sy6Var2.c(j2, true, this) == c71Var ? c71Var : dn8Var;
            default:
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                sy6 sy6Var3 = my6Var.T0;
                long j3 = this.j0;
                this.h0 = true;
                return sy6Var3.c(j3, false, this) == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(my6 my6Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.i0 = my6Var;
    }
}
