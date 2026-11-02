package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 {
    public final fk2 a;
    public final fk2 b;
    public final boolean c;

    public qs0(fk2 fk2Var, fk2 fk2Var2, boolean z) {
        fk2Var.getClass();
        fk2Var2.getClass();
        this.a = fk2Var;
        this.b = fk2Var2;
        this.c = z;
        fk2Var2.a.c();
    }

    public static final String c(fk2 fk2Var) {
        String str = fk2Var.a.a;
        return fm7.e0(str, '/') ? p61.l('`', "`", str) : str;
    }

    public final fk2 a() {
        fk2 fk2Var = this.a;
        boolean zC = fk2Var.a.c();
        fk2 fk2Var2 = this.b;
        if (zC) {
            return fk2Var2;
        }
        return new fk2(fk2Var.a.a + '.' + fk2Var2.a.a);
    }

    public final String b() {
        fk2 fk2Var = this.a;
        boolean zC = fk2Var.a.c();
        fk2 fk2Var2 = this.b;
        if (zC) {
            return c(fk2Var2);
        }
        return mm7.X(fk2Var.a.a, '.', '/') + "/" + c(fk2Var2);
    }

    public final qs0 d(v15 v15Var) {
        v15Var.getClass();
        return new qs0(this.a, this.b.a(v15Var), this.c);
    }

    public final qs0 e() {
        fk2 fk2VarB = this.b.b();
        if (fk2VarB.a.c()) {
            return null;
        }
        return new qs0(this.a, fk2VarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs0)) {
            return false;
        }
        qs0 qs0Var = (qs0) obj;
        return dh3.f(this.a, qs0Var.a) && dh3.f(this.b, qs0Var.b) && this.c == qs0Var.c;
    }

    public final v15 f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zC = this.a.a.c();
        String strB = b();
        return zC ? "/".concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qs0(fk2 fk2Var, v15 v15Var) {
        this(fk2Var, wl7.h0(v15Var), false);
        fk2Var.getClass();
        v15Var.getClass();
        fk2 fk2Var2 = fk2.c;
    }
}
