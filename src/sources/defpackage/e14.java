package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e14 extends b14 implements uv3 {
    public final g44 Y;
    public final g44 Z;

    public e14() {
        d14 d14Var = new d14(this, (byte) 0);
        w74 w74Var = w74.X;
        this.Y = x97.P(w74Var, d14Var);
        this.Z = x97.P(w74Var, new d14(this, (byte) 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e14) && dh3.f(U(), ((e14) obj).U());
    }

    @Override // defpackage.xu3
    public final List g() {
        return wv0.I0(U().g(), this.Y.getValue());
    }

    @Override // defpackage.xu3
    public final String getName() {
        return oi0.o(new StringBuilder("<set-"), U().g0.b, '>');
    }

    public final int hashCode() {
        return U().hashCode();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        pw3 pw3Var = rg7.a;
        return rg7.e;
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return wv0.I0(U().l(), this.Y.getValue());
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.Z.getValue();
    }

    public final String toString() {
        return "setter of " + U();
    }
}
