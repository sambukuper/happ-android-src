package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r05 {
    public final /* synthetic */ byte a;
    public float b;
    public float c;
    public float d;
    public float e;

    public r05(r05 r05Var) {
        this.a = (byte) 1;
        this.b = r05Var.b;
        this.c = r05Var.c;
        this.d = r05Var.d;
        this.e = r05Var.e;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    public void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return oi0.q(oi0.t("MutableRect(", yn0.g0(this.b), ", ", yn0.g0(this.c), ", "), yn0.g0(this.d), ", ", yn0.g0(this.e), ")");
            default:
                return "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]";
        }
    }

    public r05(float f, float f2, float f3, float f4) {
        this.a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public r05() {
        this.a = (byte) 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
