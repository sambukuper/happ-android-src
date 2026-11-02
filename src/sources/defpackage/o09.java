package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o09 implements gu4 {
    public final o50 a;
    public final int b;

    public o09(o50 o50Var, int i) {
        this.a = o50Var;
        this.b = i;
    }

    @Override // defpackage.gu4
    public final int a(lf3 lf3Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : x97.n(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o09)) {
            return false;
        }
        o09 o09Var = (o09) obj;
        return this.a.equals(o09Var.a) && this.b == o09Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return pc6.r(sb, this.b, ')');
    }
}
