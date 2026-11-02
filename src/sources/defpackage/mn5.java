package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mn5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ long i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn5(ux0 ux0Var, long j, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = ux0Var;
        this.i0 = j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((mn5) n((q51) obj2, (b71) obj)).q(dn8Var);
                break;
            case 1:
                ((mn5) n((q51) obj2, (b71) obj)).q(dn8Var);
                break;
            case 2:
                ((mn5) n((q51) obj2, (b71) obj)).q(dn8Var);
                break;
            default:
                ((mn5) n((q51) obj2, (ry6) obj)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new mn5((ux0) this.h0, this.i0, q51Var, (byte) 0);
            case 1:
                return new mn5((ux0) this.h0, this.i0, q51Var, (byte) 1);
            case 2:
                return new mn5((ux0) this.h0, this.i0, q51Var, (byte) 2);
            default:
                mn5 mn5Var = new mn5(this.i0, q51Var);
                mn5Var.h0 = obj;
                return mn5Var;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        long j = this.i0;
        switch (b) {
            case 0:
                w39.n0(obj);
                ((ux0) this.h0).V(new Long(j));
                break;
            case 1:
                w39.n0(obj);
                ((ux0) this.h0).V(new Long(j));
                break;
            case 2:
                w39.n0(obj);
                ((ux0) this.h0).V(new Long(j));
                break;
            default:
                w39.n0(obj);
                sy6 sy6Var = ((ry6) this.h0).a;
                sy6Var.d(sy6Var.k, j, 1);
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn5(long j, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 3;
        this.i0 = j;
    }
}
