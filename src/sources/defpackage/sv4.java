package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sv4 {
    public static sv4 h;
    public final z24 a;
    public final o88 b;
    public final ii1 c;
    public final fi2 d;
    public final o88 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public sv4(z24 z24Var, o88 o88Var, ii1 ii1Var, fi2 fi2Var) {
        this.a = z24Var;
        this.b = o88Var;
        this.c = ii1Var;
        this.d = fi2Var;
        this.e = xt7.d(o88Var, z24Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = tv4.a;
            o88 o88Var = this.e;
            d02 d02Var = d02.X;
            fi2 fi2Var = this.d;
            ii1 ii1Var = this.c;
            ff ffVar = new ff(new kf(str, o88Var, d02Var, d02Var, fi2Var, ii1Var, false), 1, 1, s31.b(0, 0, 0, 0, 15));
            i3 = 1;
            float f3 = new ff(new kf(tv4.b, o88Var, d02Var, d02Var, this.d, ii1Var, true), 2, 1, s31.b(0, 0, 0, 0, 15)).f;
            float f4 = ffVar.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i3) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = q31.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = q31.i(j);
        }
        return s31.a(q31.j(j), q31.h(j), i2, q31.g(j));
    }
}
