package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c14 extends b14 implements hw3 {
    public final g44 Y = x97.P(w74.X, new zk3(this, 11));

    @Override // defpackage.b14
    public final lz3 T() {
        return U().g0.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c14) && dh3.f(U(), ((c14) obj).U());
    }

    @Override // defpackage.xu3
    public final List g() {
        return U().g();
    }

    @Override // defpackage.xu3
    public final String getName() {
        return oi0.o(new StringBuilder("<get-"), U().g0.b, '>');
    }

    public final int hashCode() {
        return U().hashCode();
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return U().j();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return U().l();
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return (wd0) this.Y.getValue();
    }

    public final String toString() {
        return "getter of " + U();
    }
}
