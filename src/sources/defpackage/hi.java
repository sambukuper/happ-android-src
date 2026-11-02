package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements v09 {
    public final short a;
    public final String b;
    public final rh5 c = z51.H(fe3.e);
    public final rh5 d = z51.H(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public hi(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final fe3 e() {
        return (fe3) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hi) {
            return this.a == ((hi) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(w19 w19Var, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(w19Var.a.h(s));
            f(w19Var.a.t(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
