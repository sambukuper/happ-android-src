package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kr3 extends ir3 {
    public final aq3 l0;
    public final List m0;
    public final int n0;
    public int o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr3(vm3 vm3Var, aq3 aq3Var) {
        super(vm3Var, aq3Var, (String) null, 12);
        vm3Var.getClass();
        this.l0 = aq3Var;
        List listY0 = wv0.Y0(aq3Var.X.keySet());
        this.m0 = listY0;
        this.n0 = listY0.size() * 2;
        this.o0 = -1;
    }

    @Override // defpackage.ir3, defpackage.t1
    public final ao3 F(String str) {
        str.getClass();
        if (this.o0 % 2 != 0) {
            return (ao3) zp4.H(this.l0, str);
        }
        sc3 sc3Var = co3.a;
        return new kp3(str, true);
    }

    @Override // defpackage.ir3, defpackage.t1
    public final String R(e37 e37Var, int i) {
        e37Var.getClass();
        return (String) this.m0.get(i / 2);
    }

    @Override // defpackage.ir3, defpackage.t1
    public final ao3 T() {
        return this.l0;
    }

    @Override // defpackage.ir3
    /* JADX INFO: renamed from: Y */
    public final aq3 T() {
        return this.l0;
    }

    @Override // defpackage.ir3, defpackage.f01
    public final int e(e37 e37Var) {
        e37Var.getClass();
        int i = this.o0;
        if (i >= this.n0 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.o0 = i2;
        return i2;
    }

    @Override // defpackage.ir3, defpackage.t1, defpackage.f01
    public final void n(e37 e37Var) {
        e37Var.getClass();
    }
}
