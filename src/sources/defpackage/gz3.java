package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gz3 {
    public final zu3 a;

    public gz3(zu3 zu3Var) {
        zu3Var.getClass();
        this.a = zu3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gz3) {
            return dh3.f(this.a, ((gz3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zc1.M(this.a).getName();
    }
}
