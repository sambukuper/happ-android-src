package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 extends t1 {
    public final dn3 h0;
    public final int i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr3(vm3 vm3Var, dn3 dn3Var) {
        super(vm3Var, null);
        vm3Var.getClass();
        this.h0 = dn3Var;
        this.i0 = dn3Var.X.size();
        this.j0 = -1;
    }

    @Override // defpackage.t1
    public final ao3 F(String str) {
        str.getClass();
        return (ao3) this.h0.X.get(Integer.parseInt(str));
    }

    @Override // defpackage.t1
    public final String R(e37 e37Var, int i) {
        e37Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.t1
    public final ao3 T() {
        return this.h0;
    }

    @Override // defpackage.f01
    public final int e(e37 e37Var) {
        e37Var.getClass();
        int i = this.j0;
        if (i >= this.i0 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.j0 = i2;
        return i2;
    }
}
