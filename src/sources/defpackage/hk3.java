package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hk3 extends lb6 implements iw3 {
    public final /* synthetic */ jk3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk3(jk3 jk3Var) {
        super(yu3.k);
        this.Y = jk3Var;
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.Y.Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return null;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return d02.X;
    }

    @Override // defpackage.kb6
    public final boolean R() {
        return false;
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        return zw3.X;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hk3) {
            return this.Y.equals(((hk3) obj).Y);
        }
        return false;
    }

    @Override // defpackage.gw3
    public final nw3 f() {
        return this.Y;
    }

    @Override // defpackage.xu3
    public final List g() {
        return d02.X;
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<get-entries>";
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return d02.X;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.Y.hashCode();
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return this.Y.Z;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return this.Y.j();
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return d02.X;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return this.Y.g0;
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "getter of " + this.Y;
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
