package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc0 {
    public static final mc0 b = new mc0();
    public final w35 a;

    public mc0() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mc0) {
            return dh3.f(this.a, ((mc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        w35 w35Var = this.a;
        if (w35Var != null) {
            return w35Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public mc0(w35 w35Var) {
        this.a = w35Var;
    }
}
