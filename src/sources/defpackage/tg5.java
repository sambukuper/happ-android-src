package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tg5 {
    public final ff a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public tg5(ff ffVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = ffVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final s86 a(s86 s86Var) {
        return s86Var.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = f88.b;
            if (f88.a(j, j2)) {
                return j2;
            }
        }
        int i = f88.c;
        int i2 = this.b;
        return ct7.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final s86 c(s86 s86Var) {
        float f = -this.f;
        return s86Var.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return x97.n(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg5) {
            tg5 tg5Var = (tg5) obj;
            if (this.a == tg5Var.a && this.b == tg5Var.b && this.c == tg5Var.c && this.d == tg5Var.d && this.e == tg5Var.e && Float.compare(this.f, tg5Var.f) == 0 && Float.compare(this.g, tg5Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + pc6.d(oi0.e(this.e, oi0.e(this.d, oi0.e(this.c, oi0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        oi0.x(sb, this.c, ", startLineIndex=", this.d, ", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
