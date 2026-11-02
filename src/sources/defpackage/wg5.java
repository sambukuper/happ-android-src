package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wg5 {
    public String a;
    public o88 b;
    public fi2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public fi1 i;
    public ff j;
    public boolean k;
    public long l;
    public sv4 m;
    public vg5 n;
    public z24 o;
    public long p;
    public int q;
    public int r;
    public long s;

    public wg5(String str, o88 o88Var, fi2 fi2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = o88Var;
        this.c = fi2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = cd3.b;
        this.h = cd3.a;
        this.l = 0L;
        if (!(true & true)) {
            yc3.a("width and height must be >= 0");
        }
        this.p = s31.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(wg5 wg5Var, long j, z24 z24Var) {
        o88 o88Var = wg5Var.b;
        sv4 sv4Var = wg5Var.m;
        fi1 fi1Var = wg5Var.i;
        fi1Var.getClass();
        sv4 sv4VarZ = hi5.Z(sv4Var, z24Var, o88Var, fi1Var, wg5Var.c);
        wg5Var.m = sv4VarZ;
        return sv4VarZ.a(wg5Var.g, j);
    }

    public final int a(int i, z24 z24Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = s31.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, z24Var);
        }
        vg5 vg5VarE = e(z24Var);
        long jI = w45.I(vg5VarE.l(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = z38.a(new ff((kf) vg5VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jI).f);
        int i6 = q31.i(jA);
        if (iA < i6) {
            iA = i6;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final boolean b(long j, z24 z24Var) {
        vg5 vg5Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, z24Var) : j;
        ff ffVar = this.j;
        boolean z2 = false;
        if (ffVar != null && (vg5Var = this.n) != null && !vg5Var.b() && z24Var == this.o && (q31.b(jF, this.p) || (q31.h(jF) == q31.h(this.p) && q31.j(jF) == q31.j(this.p) && q31.g(jF) >= ffVar.f && !ffVar.d.d))) {
            if (!q31.b(jF, this.p)) {
                ff ffVar2 = this.j;
                ffVar2.getClass();
                long jD = s31.d(jF, (((long) z38.a(Math.min(ffVar2.a.k0.c(), ffVar2.c()))) << 32) | (((long) z38.a(ffVar2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= ffVar2.c() && ((int) (4294967295L & jD)) >= ffVar2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        vg5 vg5VarE = e(z24Var);
        long jI = w45.I(vg5VarE.l(), this.d, jF, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        ff ffVar3 = new ff((kf) vg5VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jI);
        this.p = jF;
        int iA = z38.a(ffVar3.c());
        float f = ffVar3.f;
        long jD2 = s31.d(jF, (((long) z38.a(f)) & 4294967295L) | (((long) iA) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < ffVar3.c() || ((int) (jD2 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = ffVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = s31.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(fi1 fi1Var) {
        long jA;
        fi1 fi1Var2 = this.i;
        if (fi1Var != null) {
            int i = cd3.b;
            jA = cd3.a(fi1Var.getDensity(), fi1Var.b0());
        } else {
            jA = cd3.a;
        }
        if (fi1Var2 == null) {
            this.i = fi1Var;
            this.h = jA;
        } else if (fi1Var == null || this.h != jA) {
            this.i = fi1Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final vg5 e(z24 z24Var) {
        vg5 kfVar = this.n;
        if (kfVar == null || z24Var != this.o || kfVar.b()) {
            this.o = z24Var;
            String str = this.a;
            o88 o88VarD = xt7.d(this.b, z24Var);
            fi1 fi1Var = this.i;
            fi1Var.getClass();
            fi2 fi2Var = this.c;
            boolean z = this.e;
            d02 d02Var = d02.X;
            kfVar = new kf(str, o88VarD, d02Var, d02Var, fi2Var, fi1Var, z);
        }
        this.n = kfVar;
        return kfVar;
    }

    public final String toString() {
        return ie2.g(this.s, ", constraints=$)", oi0.t("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", cd3.b(this.h), ", history="));
    }
}
