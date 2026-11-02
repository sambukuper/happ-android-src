package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kl3 {
    public final qs0 a;
    public final qs0 b;
    public final qs0 c;

    public kl3(qs0 qs0Var, qs0 qs0Var2, qs0 qs0Var3) {
        this.a = qs0Var;
        this.b = qs0Var2;
        this.c = qs0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl3)) {
            return false;
        }
        kl3 kl3Var = (kl3) obj;
        return this.a.equals(kl3Var.a) && this.b.equals(kl3Var.b) && this.c.equals(kl3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
