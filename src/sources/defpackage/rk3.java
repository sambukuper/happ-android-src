package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rk3 extends yk3 implements vv3, uv3 {
    public final g44 Y;
    public final g44 Z;
    public final sk3 f0;

    public rk3(sk3 sk3Var) {
        al3 al3Var = new al3(this, (byte) 0);
        w74 w74Var = w74.X;
        this.Y = x97.P(w74Var, al3Var);
        this.Z = x97.P(w74Var, new al3(this, (byte) 1));
        this.f0 = sk3Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws a53 {
        ((rk3) this.f0.k0.getValue()).S(obj);
        return dn8.a;
    }

    @Override // defpackage.yk3
    public final cl3 T() {
        return this.f0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk3) {
            return dh3.f(this.f0, ((rk3) obj).f0);
        }
        return false;
    }

    @Override // defpackage.gw3
    public final nw3 f() {
        return this.f0;
    }

    @Override // defpackage.xu3
    public final List g() {
        return wv0.I0(this.f0.g(), this.Y.getValue());
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "<set-" + this.f0.getName() + '>';
    }

    public final int hashCode() {
        return this.f0.hashCode();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        pw3 pw3Var = rg7.a;
        return rg7.e;
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return wv0.I0(this.f0.l(), this.Y.getValue());
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.Z.getValue();
    }

    public final String toString() {
        return "setter of " + this.f0;
    }
}
