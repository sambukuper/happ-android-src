package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r68 b;

    public /* synthetic */ v30(r68 r68Var, byte b) {
        this.a = b;
        this.b = r68Var;
    }

    public final long a() {
        byte b = this.a;
        r68 r68Var = this.b;
        switch (b) {
            case 0:
                return r68Var.j(true).b;
            case 1:
                return r68Var.p(true, true).b;
            default:
                return r68Var.p(false, true).b;
        }
    }
}
