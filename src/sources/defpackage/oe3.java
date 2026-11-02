package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe3 implements gg5 {
    public final v09 a;
    public final wp7 b;

    public oe3(v09 v09Var, wp7 wp7Var) {
        this.a = v09Var;
        this.b = wp7Var;
    }

    @Override // defpackage.gg5
    public final float a() {
        v09 v09Var = this.a;
        wp7 wp7Var = this.b;
        return wp7Var.R(v09Var.c(wp7Var));
    }

    @Override // defpackage.gg5
    public final float b(z24 z24Var) {
        v09 v09Var = this.a;
        wp7 wp7Var = this.b;
        return wp7Var.R(v09Var.d(wp7Var, z24Var));
    }

    @Override // defpackage.gg5
    public final float c(z24 z24Var) {
        v09 v09Var = this.a;
        wp7 wp7Var = this.b;
        return wp7Var.R(v09Var.b(wp7Var, z24Var));
    }

    @Override // defpackage.gg5
    public final float d() {
        v09 v09Var = this.a;
        wp7 wp7Var = this.b;
        return wp7Var.R(v09Var.a(wp7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe3)) {
            return false;
        }
        oe3 oe3Var = (oe3) obj;
        return dh3.f(this.a, oe3Var.a) && this.b.equals(oe3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
