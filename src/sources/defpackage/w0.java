package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ x0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = x0Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((w0) n(q51Var, b71Var)).q(dn8Var);
                break;
            default:
                ((w0) n(q51Var, b71Var)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        x0 x0Var = this.h0;
        switch (b) {
            case 0:
                return new w0(x0Var, q51Var, (byte) 0);
            default:
                return new w0(x0Var, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = null;
        x0 x0Var = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                if (x0Var.F0 == null) {
                    d13 d13Var = new d13();
                    xz4 xz4Var = x0Var.s0;
                    if (xz4Var != null) {
                        w51.G(x0Var.M0(), null, null, new q0(xz4Var, d13Var, q51Var, (byte) 0), 3);
                    }
                    x0Var.F0 = d13Var;
                }
                break;
            default:
                w39.n0(obj);
                d13 d13Var2 = x0Var.F0;
                if (d13Var2 != null) {
                    e13 e13Var = new e13(d13Var2);
                    xz4 xz4Var2 = x0Var.s0;
                    if (xz4Var2 != null) {
                        w51.G(x0Var.M0(), null, null, new q0(xz4Var2, e13Var, q51Var, (byte) 1), 3);
                    }
                    x0Var.F0 = null;
                }
                break;
        }
        return dn8Var;
    }
}
