package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ep8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ rp8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep8(rp8 rp8Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = rp8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        o05 o05Var = (o05) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((ep8) n(q51Var, o05Var)).q(dn8Var);
                break;
            default:
                ((ep8) n(q51Var, o05Var)).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                ep8 ep8Var = new ep8(this.i0, q51Var, (byte) 0);
                ep8Var.h0 = obj;
                return ep8Var;
            default:
                ep8 ep8Var2 = new ep8(this.i0, q51Var, (byte) 1);
                ep8Var2.h0 = obj;
                return ep8Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        rp8 rp8Var = this.i0;
        o05 o05Var = (o05) this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                o05Var.d(rp8Var.c);
                break;
            default:
                w39.n0(obj);
                o05Var.d(rp8Var.b);
                break;
        }
        return dn8Var;
    }
}
