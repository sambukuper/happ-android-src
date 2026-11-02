package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wn0 extends u1 implements fo0 {
    public final pw3 Y;
    public final xn0 Z;
    public final boolean f0;
    public final qc3 g0;

    public wn0(pw3 pw3Var, xn0 xn0Var, boolean z) {
        super(vn0.X);
        this.Y = pw3Var;
        this.Z = xn0Var;
        this.f0 = z;
        this.g0 = new qc3(d02.X);
    }

    @Override // defpackage.pw3
    public final List L() {
        return d02.X;
    }

    @Override // defpackage.pw3
    public final lv3 M() {
        return null;
    }

    @Override // defpackage.u1
    public final u1 S(boolean z) {
        return z == this.f0 ? this : new wn0(this.Y, this.Z, z);
    }

    @Override // defpackage.u1
    public final boolean equals(Object obj) {
        if (!(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return dh3.f(this.Y, wn0Var.Y) && this.Z == wn0Var.Z && this.f0 == wn0Var.f0;
    }

    @Override // defpackage.u1
    public final int hashCode() {
        pw3 pw3Var = this.Y;
        int iHashCode = pw3Var != null ? pw3Var.hashCode() : 0;
        return Boolean.hashCode(this.f0) + ((this.Z.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.u1
    public final g44 t() {
        return this.g0;
    }

    @Override // defpackage.u1
    public final String toString() {
        return this.Z.toString();
    }

    @Override // defpackage.pw3
    public final boolean z() {
        return this.f0;
    }
}
