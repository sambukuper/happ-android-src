package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d9 implements gu4 {
    public final o50 a;
    public final o50 b;
    public final int c;

    public d9(o50 o50Var, o50 o50Var2, int i) {
        this.a = o50Var;
        this.b = o50Var2;
        this.c = i;
    }

    @Override // defpackage.gu4
    public final int a(lf3 lf3Var, long j, int i) {
        int iA = this.b.a(0, lf3Var.b());
        return lf3Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return this.a.equals(d9Var.a) && this.b.equals(d9Var.b) && this.c == d9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + pc6.d(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return pc6.r(sb, this.c, ')');
    }
}
