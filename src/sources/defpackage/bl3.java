package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bl3 extends yk3 implements iw3, hw3 {
    public final g44 Y = x97.P(w74.X, new zk3(this, (byte) 0));
    public final cl3 Z;

    public bl3(cl3 cl3Var) {
        this.Z = cl3Var;
    }

    @Override // defpackage.yk3
    public final cl3 T() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bl3) {
            return dh3.f(this.Z, ((bl3) obj).Z);
        }
        return false;
    }

    @Override // defpackage.gw3
    public final nw3 f() {
        return this.Z;
    }

    @Override // defpackage.xu3
    public final List g() {
        return this.Z.g();
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<get-" + this.Z.getName() + '>';
    }

    public final int hashCode() {
        return this.Z.hashCode();
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return this.Z.get();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return this.Z.j();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return this.Z.l();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.Y.getValue();
    }

    public final String toString() {
        return "getter of " + this.Z;
    }
}
