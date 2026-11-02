package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kt8 implements v09 {
    public final String a;
    public final rh5 b;

    public kt8(pe3 pe3Var, String str) {
        this.a = str;
        this.b = z51.H(pe3Var);
    }

    @Override // defpackage.v09
    public final int a(fi1 fi1Var) {
        return e().b;
    }

    @Override // defpackage.v09
    public final int b(fi1 fi1Var, z24 z24Var) {
        return e().c;
    }

    @Override // defpackage.v09
    public final int c(fi1 fi1Var) {
        return e().d;
    }

    @Override // defpackage.v09
    public final int d(fi1 fi1Var, z24 z24Var) {
        return e().a;
    }

    public final pe3 e() {
        return (pe3) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kt8) {
            return dh3.f(e(), ((kt8) obj).e());
        }
        return false;
    }

    public final void f(pe3 pe3Var) {
        this.b.setValue(pe3Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
