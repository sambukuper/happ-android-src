package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class om7 extends tv1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public om7(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om7)) {
            return false;
        }
        om7 om7Var = (om7) obj;
        return this.a == om7Var.a && this.b == om7Var.b && this.c == om7Var.c && this.d == om7Var.d;
    }

    public final int hashCode() {
        return oi0.e(this.d, oi0.e(this.c, pc6.d(Float.hashCode(this.a) * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        return oi0.q(ie2.k("Stroke(width=", this.a, ", miter=", this.b, ", cap="), str, ", join=", str2, ", pathEffect=null)");
    }
}
