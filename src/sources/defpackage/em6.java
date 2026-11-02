package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class em6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        pu.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public em6(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em6)) {
            return false;
        }
        em6 em6Var = (em6) obj;
        return Float.compare(this.a, em6Var.a) == 0 && Float.compare(this.b, em6Var.b) == 0 && Float.compare(this.c, em6Var.c) == 0 && Float.compare(this.d, em6Var.d) == 0 && z51.x(this.e, em6Var.e) && z51.x(this.f, em6Var.f) && z51.x(this.g, em6Var.g) && z51.x(this.h, em6Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + p61.g(p61.g(p61.g(pc6.d(pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String strG0 = yn0.g0(this.a);
        String strG1 = yn0.g0(this.b);
        String strG2 = yn0.g0(this.c);
        String strG3 = yn0.g0(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strG0);
        sb.append(", ");
        sb.append(strG1);
        sb.append(", ");
        sb.append(strG2);
        String strP = oi0.p(sb, ", ", strG3);
        long j = this.e;
        long j2 = this.f;
        boolean zX = z51.x(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zX && z51.x(j2, j3) && z51.x(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return pc6.q("RoundRect(rect=", strP, ", radius=", yn0.g0(Float.intBitsToFloat(i)), ")");
            }
            String strG4 = yn0.g0(Float.intBitsToFloat(i));
            return oi0.p(oi0.t("RoundRect(rect=", strP, ", x=", strG4, ", y="), yn0.g0(Float.intBitsToFloat(i2)), ")");
        }
        String strV = z51.V(j);
        String strV2 = z51.V(j2);
        String strV3 = z51.V(j3);
        String strV4 = z51.V(j4);
        StringBuilder sbT = oi0.t("RoundRect(rect=", strP, ", topLeft=", strV, ", topRight=");
        oi0.y(sbT, strV2, ", bottomRight=", strV3, ", bottomLeft=");
        return oi0.p(sbT, strV4, ")");
    }
}
