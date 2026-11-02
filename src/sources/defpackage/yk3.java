package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yk3 extends lb6 implements pv3, gw3 {
    public yk3() {
        super(yu3.k);
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return T().Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return T().f0;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return d02.X;
    }

    @Override // defpackage.kb6
    public final boolean R() {
        return T().R();
    }

    public abstract cl3 T();

    @Override // defpackage.xu3
    public final zw3 e() {
        return T().e();
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return d02.X;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        T().getClass();
        return ex4.FINAL;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
