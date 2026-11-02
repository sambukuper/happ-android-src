package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j18 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ dt5 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j18(dt5 dt5Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = dt5Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 1:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 2:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 3:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 4:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 5:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            case 6:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
            default:
                ((j18) n(q51Var, b71Var)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        dt5 dt5Var = this.h0;
        switch (b) {
            case 0:
                return new j18(dt5Var, q51Var, (byte) 0);
            case 1:
                return new j18(dt5Var, q51Var, (byte) 1);
            case 2:
                return new j18(dt5Var, q51Var, (byte) 2);
            case 3:
                return new j18(dt5Var, q51Var, (byte) 3);
            case 4:
                return new j18(dt5Var, q51Var, (byte) 4);
            case 5:
                return new j18(dt5Var, q51Var, (byte) 5);
            case 6:
                return new j18(dt5Var, q51Var, (byte) 6);
            default:
                return new j18(dt5Var, q51Var, (byte) 7);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        dt5 dt5Var = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                dt5Var.a();
                break;
            case 1:
                w39.n0(obj);
                dt5Var.b();
                break;
            case 2:
                w39.n0(obj);
                dt5Var.b();
                break;
            case 3:
                w39.n0(obj);
                dt5Var.a();
                break;
            case 4:
                w39.n0(obj);
                dt5Var.b();
                break;
            case 5:
                w39.n0(obj);
                dt5Var.b();
                break;
            case 6:
                w39.n0(obj);
                dt5Var.a();
                break;
            default:
                w39.n0(obj);
                dt5Var.b();
                break;
        }
        return dn8Var;
    }
}
