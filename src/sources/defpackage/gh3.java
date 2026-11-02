package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gh3 extends nj6 {
    public byte Y;
    public final /* synthetic */ rn2 Z;
    public final /* synthetic */ q51 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh3(q51 q51Var, q51 q51Var2, rn2 rn2Var) {
        super(q51Var);
        this.Z = rn2Var;
        this.f0 = q51Var2;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.Y;
        if (b != 0) {
            if (b != 1) {
                bt.i("This coroutine had already completed");
                return null;
            }
            this.Y = (byte) 2;
            w39.n0(obj);
            return obj;
        }
        this.Y = (byte) 1;
        w39.n0(obj);
        rn2 rn2Var = this.Z;
        rn2Var.getClass();
        ci8.i(2, rn2Var);
        return rn2Var.K(this.f0, this);
    }
}
