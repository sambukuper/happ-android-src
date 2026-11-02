package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c78 {
    public final p88 a;
    public final int b;

    public c78(p88 p88Var, int i) {
        this.a = p88Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c78)) {
            return false;
        }
        c78 c78Var = (c78) obj;
        return this.b == c78Var.b && this.a.equals(c78Var.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
