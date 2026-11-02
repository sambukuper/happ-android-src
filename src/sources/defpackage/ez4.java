package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ez4 {
    public ql a;
    public fi2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public mx h;
    public sv4 i;
    public long j;
    public fi1 k;
    public o88 l;
    public y5 m;
    public z24 n;
    public x78 o;
    public int p;
    public int q;
    public dz4 r;
    public long s;

    public ez4(ql qlVar, o88 o88Var, fi2 fi2Var, int i, boolean z, int i2, int i3, List list, mx mxVar) {
        this.a = qlVar;
        this.b = fi2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = mxVar;
        int i4 = cd3.b;
        this.j = cd3.a;
        this.l = o88Var;
        this.p = -1;
        this.q = -1;
    }

    public final int a(int i, z24 z24Var) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = s31.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jA = h(jA, z24Var);
        }
        int iA = z38.a(b(jA, z24Var).e);
        int i4 = q31.i(jA);
        if (iA < i4) {
            iA = i4;
        }
        this.p = i;
        this.q = iA;
        return iA;
    }

    public final bz4 b(long j, z24 z24Var) {
        y5 y5VarE = e(z24Var);
        long jI = w45.I(y5VarE.l(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new bz4(y5VarE, jI, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, z24 z24Var) {
        this.s = (this.s << 2) | 3;
        long jH = this.f > 1 ? h(j, z24Var) : j;
        x78 x78Var = this.o;
        if (x78Var != null) {
            bz4 bz4Var = x78Var.b;
            w78 w78Var = x78Var.a;
            if (!bz4Var.a.b()) {
                z24 z24Var2 = w78Var.h;
                long j2 = w78Var.j;
                if (z24Var == z24Var2 && (q31.b(jH, j2) || (q31.h(jH) == q31.h(j2) && q31.j(jH) == q31.j(j2) && q31.g(jH) >= bz4Var.e && !bz4Var.c))) {
                    x78 x78Var2 = this.o;
                    x78Var2.getClass();
                    if (q31.b(jH, x78Var2.a.j)) {
                        return false;
                    }
                    x78 x78Var3 = this.o;
                    x78Var3.getClass();
                    this.o = g(z24Var, jH, x78Var3.b);
                    return true;
                }
            }
        }
        mx mxVar = this.h;
        if (mxVar != null) {
            this.n = z24Var;
            long j3 = this.l.a.b;
            dz4 dz4Var = this.r;
            if (dz4Var == null) {
                dz4Var = new dz4(this);
                this.r = dz4Var;
            }
            float fG0 = dz4Var.G0(mxVar.c);
            float fG1 = dz4Var.G0(mxVar.a);
            float fG2 = dz4Var.G0(mxVar.b);
            float f = 2.0f;
            float f2 = (fG1 + fG2) / 2.0f;
            float f3 = fG2;
            float f4 = fG1;
            while (f3 - f4 >= fG0) {
                float f5 = f;
                float f6 = f3;
                if (mx.a(dz4Var.a(j, dz4Var.M(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float fFloor = (((float) Math.floor((f4 - fG1) / fG0)) * fG0) + fG1;
            float f7 = fG0 + fFloor;
            if (f7 <= fG2 && !mx.a(dz4Var.a(j, dz4Var.M(f7)))) {
                fFloor = f7;
            }
            long jM = dz4Var.M(fFloor);
            if (v88.d(jM)) {
                jM = fz4.a(j3, jM);
            }
            long j4 = jM;
            dz4 dz4Var2 = this.r;
            if (dz4Var2 == null) {
                dz4Var2 = new dz4(this);
                this.r = dz4Var2;
            }
            x78 x78Var4 = dz4Var2.X;
            if (x78Var4 != null) {
                w78 w78Var2 = x78Var4.a;
                if (v88.a(j4, w78Var2.b.a.b) && w78Var2.f == this.c) {
                    this.o = x78Var4;
                    return true;
                }
            }
            f(o88.a(this.l, 0L, j4, null, null, 0L, 0L, null, 16777213));
        }
        this.o = g(z24Var, jH, b(jH, z24Var));
        return true;
    }

    public final void d(fi1 fi1Var) {
        long jA;
        fi1 fi1Var2 = this.k;
        if (fi1Var != null) {
            int i = cd3.b;
            jA = cd3.a(fi1Var.getDensity(), fi1Var.b0());
        } else {
            jA = cd3.a;
        }
        if (fi1Var2 == null) {
            this.k = fi1Var;
            this.j = jA;
            return;
        }
        if (fi1Var == null || this.j != jA) {
            this.k = fi1Var;
            this.j = jA;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final y5 e(z24 z24Var) {
        y5 y5Var = this.m;
        if (y5Var == null || z24Var != this.n || y5Var.b()) {
            this.n = z24Var;
            ql qlVar = this.a;
            o88 o88VarD = xt7.d(this.l, z24Var);
            fi1 fi1Var = this.k;
            fi1Var.getClass();
            fi2 fi2Var = this.b;
            List list = this.g;
            if (list == null) {
                list = d02.X;
            }
            y5Var = new y5(qlVar, o88VarD, list, fi1Var, fi2Var, this.d);
        }
        this.m = y5Var;
        return y5Var;
    }

    public final void f(o88 o88Var) {
        boolean zC = o88Var.c(this.l);
        this.l = o88Var;
        if (zC) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final x78 g(z24 z24Var, long j, bz4 bz4Var) {
        float fMin = Math.min(bz4Var.a.l(), bz4Var.d);
        ql qlVar = this.a;
        o88 o88Var = this.l;
        List list = this.g;
        if (list == null) {
            list = d02.X;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        fi1 fi1Var = this.k;
        fi1Var.getClass();
        return new x78(new w78(qlVar, o88Var, list, i, z, i2, fi1Var, z24Var, this.b, j), bz4Var, s31.d(j, (((long) z38.a(fMin)) << 32) | (((long) z38.a(bz4Var.e)) & 4294967295L)));
    }

    public final long h(long j, z24 z24Var) {
        sv4 sv4Var = this.i;
        o88 o88Var = this.l;
        fi1 fi1Var = this.k;
        fi1Var.getClass();
        sv4 sv4VarZ = hi5.Z(sv4Var, z24Var, o88Var, fi1Var, this.b);
        this.i = sv4VarZ;
        return sv4VarZ.a(this.f, j);
    }

    public final String toString() {
        String str = this.o != null ? "<TextLayoutResult>" : "null";
        String strB = cd3.b(this.j);
        long j = this.s;
        x78 x78Var = this.o;
        Object q31Var = x78Var != null ? new q31(x78Var.a.j) : "null";
        StringBuilder sbT = oi0.t("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbT.append(j);
        sbT.append(", constraints=");
        sbT.append(q31Var);
        sbT.append(")");
        return sbT.toString();
    }
}
