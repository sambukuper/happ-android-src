package defpackage;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w41 extends jx4 implements rv1, g34, w07 {
    public q8 q0;
    public z41 r0;
    public float s0 = 1.0f;
    public boolean t0 = true;
    public String u0;
    public u31 v0;
    public final AsyncImagePainter w0;

    public w41(AsyncImagePainter asyncImagePainter, q8 q8Var, z41 z41Var, String str, u31 u31Var) {
        this.q0 = q8Var;
        this.r0 = z41Var;
        this.u0 = str;
        this.v0 = u31Var;
        this.w0 = asyncImagePainter;
    }

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jB = s31.b(0, i, 0, 0, 13);
        u31 u31Var = this.v0;
        if (u31Var != null) {
            u31Var.e(jB);
        }
        if (this.w0.getR0() == 9205357640488583168L) {
            return tr4Var.a(i);
        }
        long jZ0 = Z0(jB);
        return Math.max(q31.i(jZ0), tr4Var.a(i));
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        u31 u31Var = this.v0;
        if (u31Var != null) {
            u31Var.e(j);
        }
        eo5 eo5VarO = tr4Var.o(Z0(j));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 0));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        b71 b71VarM0 = M0();
        AsyncImagePainter asyncImagePainter = this.w0;
        asyncImagePainter.n0 = b71VarM0;
        asyncImagePainter.c();
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.w0.b();
    }

    @Override // defpackage.jx4
    public final void S0() {
        this.w0.l(null);
    }

    public final long Y0(long j) {
        if (ua7.e(j)) {
            return 0L;
        }
        long r0 = this.w0.getR0();
        if (r0 != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (r0 >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r0 & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jB = this.r0.b(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jB >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jB))) <= Float.MAX_VALUE) {
                return z68.J0(jFloatToRawIntBits, jB);
            }
        }
        return j;
    }

    public final long Z0(long j) {
        float fJ;
        int i;
        float f;
        boolean zF = q31.f(j);
        boolean zE = q31.e(j);
        if (!zF || !zE) {
            boolean z = q31.d(j) && q31.c(j);
            AsyncImagePainter asyncImagePainter = this.w0;
            long r0 = asyncImagePainter.getR0();
            if (r0 != 9205357640488583168L) {
                if (!z || (!zF && !zE)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (r0 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r0 & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = xs8.b;
                        float fJ2 = q31.j(j);
                        float fH = q31.h(j);
                        if (fIntBitsToFloat < fJ2) {
                            fIntBitsToFloat = fJ2;
                        }
                        if (fIntBitsToFloat <= fH) {
                            fH = fIntBitsToFloat;
                        }
                        fJ = fH;
                    } else {
                        fJ = q31.j(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = xs8.b;
                        float fI = q31.i(j);
                        float fG = q31.g(j);
                        if (fIntBitsToFloat2 < fI) {
                            fIntBitsToFloat2 = fI;
                        }
                        if (fIntBitsToFloat2 <= fG) {
                            fG = fIntBitsToFloat2;
                        }
                        f = fG;
                    } else {
                        i = q31.i(j);
                    }
                    long jY0 = Y0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                    return q31.a(j, s31.g(nr4.O(Float.intBitsToFloat((int) (jY0 >> 32))), j), 0, s31.f(nr4.O(Float.intBitsToFloat((int) (jY0 & 4294967295L))), j), 0, 10);
                }
                fJ = q31.h(j);
                i = q31.g(j);
                f = i;
                long jY1 = Y0((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                return q31.a(j, s31.g(nr4.O(Float.intBitsToFloat((int) (jY1 >> 32))), j), 0, s31.f(nr4.O(Float.intBitsToFloat((int) (jY1 & 4294967295L))), j), 0, 10);
            }
            if (z && ((av) asyncImagePainter.u0.X.getValue()).getPainter() != null) {
                return q31.a(j, q31.h(j), 0, q31.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        String str = this.u0;
        if (str != null) {
            d17.b(f17Var, str);
            d17.d(f17Var, 5);
        }
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jB = s31.b(0, 0, 0, i, 7);
        u31 u31Var = this.v0;
        if (u31Var != null) {
            u31Var.e(jB);
        }
        if (this.w0.getR0() == 9205357640488583168L) {
            return tr4Var.m(i);
        }
        long jZ0 = Z0(jB);
        return Math.max(q31.j(jZ0), tr4Var.m(i));
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jB = s31.b(0, 0, 0, i, 7);
        u31 u31Var = this.v0;
        if (u31Var != null) {
            u31Var.e(jB);
        }
        if (this.w0.getR0() == 9205357640488583168L) {
            return tr4Var.k(i);
        }
        long jZ0 = Z0(jB);
        return Math.max(q31.j(jZ0), tr4Var.k(i));
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        um0 um0Var = p34Var.X;
        long jY0 = Y0(um0Var.e());
        long jA = this.q0.a(xs8.a(jY0), xs8.a(um0Var.e()), p34Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        lr lrVar = um0Var.Y;
        long jP = lrVar.p();
        lrVar.k().g();
        try {
            wl6 wl6Var = (wl6) lrVar.Y;
            lr lrVar2 = (lr) wl6Var.Y;
            if (this.t0) {
                lrVar2.k().m(0.0f, 0.0f, Float.intBitsToFloat((int) (lrVar2.p() >> 32)), Float.intBitsToFloat((int) (4294967295L & lrVar2.p())), 1);
            }
            wl6Var.V(i, i2);
            this.w0.g(p34Var, jY0, this.s0, null);
            lrVar.k().p();
            lrVar.D(jP);
            p34Var.a();
        } catch (Throwable th) {
            p61.w(lrVar, jP);
            throw th;
        }
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jB = s31.b(0, i, 0, 0, 13);
        u31 u31Var = this.v0;
        if (u31Var != null) {
            u31Var.e(jB);
        }
        if (this.w0.getR0() == 9205357640488583168L) {
            return tr4Var.K(i);
        }
        long jZ0 = Z0(jB);
        return Math.max(q31.i(jZ0), tr4Var.K(i));
    }
}
