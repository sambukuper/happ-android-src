package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements fu4 {
    public final n50 a;
    public final n50 b;
    public final int c;

    public c9(n50 n50Var, n50 n50Var2, int i) {
        this.a = n50Var;
        this.b = n50Var2;
        this.c = i;
    }

    @Override // defpackage.fu4
    public final int a(lf3 lf3Var, long j, int i, z24 z24Var) {
        int iA = this.b.a(0, lf3Var.d(), z24Var);
        int i2 = -this.a.a(0, i, z24Var);
        z24 z24Var2 = z24.X;
        int i3 = this.c;
        if (z24Var != z24Var2) {
            i3 = -i3;
        }
        return lf3Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return this.a.equals(c9Var.a) && this.b.equals(c9Var.b) && this.c == c9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + pc6.d(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return pc6.r(sb, this.c, ')');
    }
}
