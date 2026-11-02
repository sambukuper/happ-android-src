package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jq3 extends t1 {
    public final ao3 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq3(vm3 vm3Var, ao3 ao3Var, String str) {
        super(vm3Var, str);
        vm3Var.getClass();
        ao3Var.getClass();
        this.h0 = ao3Var;
        this.X.add("primitive");
    }

    @Override // defpackage.t1
    public final ao3 F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.h0;
        }
        bt.q("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.t1
    public final ao3 T() {
        return this.h0;
    }

    @Override // defpackage.f01
    public final int e(e37 e37Var) {
        e37Var.getClass();
        return 0;
    }
}
