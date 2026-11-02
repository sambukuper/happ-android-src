package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj6 extends r10 {
    public nj6(q51 q51Var) {
        super(q51Var);
        if (q51Var == null || q51Var.w() == b02.X) {
            return;
        }
        bt.q("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.q51
    public final s61 w() {
        return b02.X;
    }
}
