package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fk2 {
    public static final fk2 c = new fk2(_UrlKt.FRAGMENT_ENCODE_SET);
    public final gk2 a;
    public transient fk2 b;

    public fk2(String str) {
        str.getClass();
        this.a = new gk2(this, str);
    }

    public final fk2 a(v15 v15Var) {
        v15Var.getClass();
        return new fk2(this.a.a(v15Var), this);
    }

    public final fk2 b() {
        fk2 fk2Var = this.b;
        if (fk2Var != null) {
            return fk2Var;
        }
        gk2 gk2Var = this.a;
        if (gk2Var.c()) {
            bt.i("root");
            return null;
        }
        fk2 fk2Var2 = new fk2(gk2Var.e());
        this.b = fk2Var2;
        return fk2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk2) {
            return dh3.f(this.a, ((fk2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public fk2(gk2 gk2Var) {
        this.a = gk2Var;
    }

    public fk2(gk2 gk2Var, fk2 fk2Var) {
        this.a = gk2Var;
        this.b = fk2Var;
    }
}
