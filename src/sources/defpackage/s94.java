package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s94 implements v09 {
    public final v09 a;
    public final int b;

    public s94(v09 v09Var, int i) {
        this.a = v09Var;
        this.b = i;
    }

    @Override // defpackage.v09
    public final int a(fi1 fi1Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(fi1Var);
        }
        return 0;
    }

    @Override // defpackage.v09
    public final int b(fi1 fi1Var, z24 z24Var) {
        if (((z24Var == z24.X ? 4 : 1) & this.b) != 0) {
            return this.a.b(fi1Var, z24Var);
        }
        return 0;
    }

    @Override // defpackage.v09
    public final int c(fi1 fi1Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(fi1Var);
        }
        return 0;
    }

    @Override // defpackage.v09
    public final int d(fi1 fi1Var, z24 z24Var) {
        if (((z24Var == z24.X ? 8 : 2) & this.b) != 0) {
            return this.a.d(fi1Var, z24Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s94)) {
            return false;
        }
        s94 s94Var = (s94) obj;
        return dh3.f(this.a, s94Var.a) && this.b == s94Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = pw7.a;
        if ((i & i2) == i2) {
            pw7.f(sb, "Start");
        }
        int i3 = pw7.c;
        if ((i & i3) == i3) {
            pw7.f(sb, "Left");
        }
        if ((i & 16) == 16) {
            pw7.f(sb, "Top");
        }
        int i4 = pw7.b;
        if ((i & i4) == i4) {
            pw7.f(sb, "End");
        }
        int i5 = pw7.d;
        if ((i & i5) == i5) {
            pw7.f(sb, "Right");
        }
        if ((i & 32) == 32) {
            pw7.f(sb, "Bottom");
        }
        return "(" + this.a + " only " + pc6.p("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
