package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class td0 extends u2 {
    public final /* synthetic */ ud0 j0;

    public td0(ud0 ud0Var) {
        this.j0 = ud0Var;
    }

    @Override // defpackage.u2
    public final String h() {
        qd0 qd0Var = (qd0) this.j0.X.get();
        if (qd0Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + qd0Var.a + "]";
    }
}
