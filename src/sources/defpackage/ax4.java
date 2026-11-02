package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ax4 {
    public final boolean a;
    public final boolean b;
    public final Boolean c;
    public final Boolean d;

    public ax4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z3;
        this.b = z4;
        this.c = Boolean.valueOf(z);
        this.d = Boolean.valueOf(z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax4)) {
            return false;
        }
        ax4 ax4Var = (ax4) obj;
        return dh3.f(this.c, ax4Var.c) && dh3.f(this.d, ax4Var.d) && this.b == ax4Var.b && this.a == ax4Var.a;
    }

    public final int hashCode() {
        int iF = pc6.f(kz6.X.hashCode() * 31, 31, this.a);
        Boolean bool = this.c;
        int iHashCode = (iF + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        return Boolean.hashCode(this.b) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
