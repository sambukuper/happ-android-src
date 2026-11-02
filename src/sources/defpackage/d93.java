package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d93 {
    public final int a;
    public final wg1 b;
    public final qi0 c;

    public d93(int i, wg1 wg1Var, qi0 qi0Var) {
        wg1Var.getClass();
        this.a = i;
        this.b = wg1Var;
        this.c = qi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d93) {
            d93 d93Var = (d93) obj;
            return this.a == d93Var.a && dh3.f(this.b, d93Var.b) && this.c == d93Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) dl7.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
