package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ ea6 i0;
    public final /* synthetic */ String j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk0(ea6 ea6Var, String str, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = ea6Var;
        this.j0 = str;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        hb5 hb5Var = (hb5) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((uk0) n(q51Var, hb5Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.j0;
        ea6 ea6Var = this.i0;
        switch (b) {
            case 0:
                uk0 uk0Var = new uk0(ea6Var, str, q51Var, (byte) 0);
                uk0Var.h0 = obj;
                return uk0Var;
            default:
                uk0 uk0Var2 = new uk0(ea6Var, str, q51Var, (byte) 1);
                uk0Var2.h0 = obj;
                return uk0Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        ea6 ea6Var = this.i0;
        String str = this.j0;
        switch (b) {
            case 0:
                w39.n0(obj);
                hb5 hb5Var = (hb5) this.h0;
                vi0.b(str);
                ea6Var.X = null;
                return hb5Var;
            default:
                w39.n0(obj);
                hb5 hb5Var2 = (hb5) this.h0;
                vi0.b(str);
                ea6Var.X = null;
                return hb5Var2;
        }
    }
}
