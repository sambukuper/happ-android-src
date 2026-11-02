package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh3 extends nj6 {
    public byte Y;
    public final /* synthetic */ al5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(wy7 wy7Var, al5 al5Var) {
        super(wy7Var);
        this.Z = al5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.Y;
        if (b == 0) {
            this.Y = (byte) 1;
            w39.n0(obj);
            al5 al5Var = this.Z;
            ci8.i(1, al5Var);
            return al5Var.B(this);
        }
        if (b != 1) {
            bt.i("This coroutine had already completed");
            return null;
        }
        this.Y = (byte) 2;
        w39.n0(obj);
        return obj;
    }
}
