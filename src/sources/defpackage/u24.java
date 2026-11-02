package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u24 {
    public static final u24 e = new u24(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public u24(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (kt1.a(f, 0.0f) < 0 || kt1.a(f3, 0.0f) < 0 || kt1.a(f2, 0.0f) < 0 || kt1.a(f4, 0.0f) < 0) {
            vc3.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u24)) {
            return false;
        }
        u24 u24Var = (u24) obj;
        return kt1.b(this.a, u24Var.a) && kt1.b(this.b, u24Var.b) && kt1.b(this.c, u24Var.c) && kt1.b(this.d, u24Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String strC = kt1.c(this.a);
        String strC2 = kt1.c(this.b);
        return oi0.q(oi0.t("LayerOutsets(left=", strC, ", top=", strC2, ", right="), kt1.c(this.c), ", bottom=", kt1.c(this.d), ")");
    }
}
