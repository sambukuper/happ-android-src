package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fh3 extends s51 {
    public byte f0;
    public final /* synthetic */ al5 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh3(wy7 wy7Var, s61 s61Var, al5 al5Var) {
        super(wy7Var, s61Var);
        this.g0 = al5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.f0;
        if (b == 0) {
            this.f0 = (byte) 1;
            w39.n0(obj);
            al5 al5Var = this.g0;
            ci8.i(1, al5Var);
            return al5Var.B(this);
        }
        if (b != 1) {
            bt.i("This coroutine had already completed");
            return null;
        }
        this.f0 = (byte) 2;
        w39.n0(obj);
        return obj;
    }
}
