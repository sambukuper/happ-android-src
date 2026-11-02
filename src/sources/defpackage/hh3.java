package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hh3 extends s51 {
    public byte f0;
    public final /* synthetic */ rn2 g0;
    public final /* synthetic */ q51 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh3(q51 q51Var, s61 s61Var, rn2 rn2Var, q51 q51Var2) {
        super(q51Var, s61Var);
        this.g0 = rn2Var;
        this.h0 = q51Var2;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.f0;
        if (b != 0) {
            if (b != 1) {
                bt.i("This coroutine had already completed");
                return null;
            }
            this.f0 = (byte) 2;
            w39.n0(obj);
            return obj;
        }
        this.f0 = (byte) 1;
        w39.n0(obj);
        rn2 rn2Var = this.g0;
        rn2Var.getClass();
        ci8.i(2, rn2Var);
        return rn2Var.K(this.h0, this);
    }
}
