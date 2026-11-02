package defpackage;

import android.graphics.BlurMaskFilter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 {
    public final mb6 a;
    public lf b;
    public g60 c;
    public long d;
    public long e;
    public long f;
    public z24 g;
    public float h;
    public final s67 i;
    public final df j;
    public je k;

    public tw1(s67 s67Var, mb6 mb6Var) {
        this.a = mb6Var;
        int i = dw0.h;
        this.d = dw0.g;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = z24.X;
        this.h = 1.0f;
        this.i = s67Var;
        this.j = u15.c();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public final void a(sv1 sv1Var, g60 g60Var, long j, long j2, float f, int i) {
        g60 g60Var2;
        char c;
        long j3;
        je jeVarD;
        mb6 mb6Var = this.a;
        if (mb6Var instanceof zd5) {
            this.b = ((zd5) mb6Var).j0;
            this.e = 0L;
        } else if (mb6Var instanceof be5) {
            be5 be5Var = (be5) mb6Var;
            em6 em6Var = be5Var.j0;
            if (pu.z(em6Var)) {
                this.b = null;
                this.e = em6Var.e;
            } else {
                this.b = be5Var.k0;
                this.e = 0L;
            }
        } else if (!(mb6Var instanceof ae5)) {
            b61.c();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (g60Var != null) {
            g60Var2 = g60Var;
        } else if (j2 != 16) {
            g60 g60Var3 = this.c;
            if (g60Var3 != null) {
                long j4 = this.d;
                int i2 = dw0.h;
                if (!tk8.a(j4, j2)) {
                    g60Var3 = new g60(j2, 5);
                    this.d = j2;
                    this.c = g60Var3;
                }
            } else {
                g60Var3 = new g60(j2, 5);
                this.d = j2;
                this.c = g60Var3;
            }
            g60Var2 = g60Var3;
        } else {
            g60Var2 = null;
        }
        long j5 = this.f;
        if (j5 != 9205357640488583168L && ua7.a(j5, j) && this.g == sv1Var.getLayoutDirection() && this.h == sv1Var.getDensity()) {
            c = ' ';
            j3 = 4294967295L;
        } else {
            long j6 = this.e;
            lf lfVar = this.b;
            s67 s67Var = this.i;
            float fH0 = sv1Var.h0(s67Var.a);
            float fH1 = sv1Var.h0(s67Var.b);
            df dfVar = this.j;
            if (lfVar != null) {
                float f2 = fH1 * 2.0f;
                float f3 = (fH0 * 2.0f) + f2;
                c = ' ';
                j3 = 4294967295L;
                jeVarD = mb6.d((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f3), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f3), 1);
                eb ebVarA = fb.a(jeVarD);
                if (fH1 > 0.0f) {
                    float f4 = fH0 + fH1;
                    ebVarA.n(f4, f4);
                    pu.p(dfVar, fH0 > 0.0f ? new BlurMaskFilter(fH0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    ebVarA.e(lfVar, dfVar);
                    pu.p(dfVar, fH0 > 0.0f ? new BlurMaskFilter(fH0, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    dfVar.l(f2);
                    ebVarA.e(lfVar, dfVar);
                } else {
                    pu.p(dfVar, fH0 > 0.0f ? new BlurMaskFilter(fH0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    ebVarA.n(fH0, fH0);
                    ebVarA.e(lfVar, dfVar);
                }
            } else {
                c = ' ';
                j3 = 4294967295L;
                float f5 = (fH1 * 2.0f) + (fH0 * 2.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f5;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f5;
                je jeVarD2 = mb6.d((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
                eb ebVarA2 = fb.a(jeVarD2);
                float f6 = fIntBitsToFloat - fH0;
                float f7 = fIntBitsToFloat2 - fH0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                pu.p(dfVar, fH0 > 0.0f ? new BlurMaskFilter(fH0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                ebVarA2.a.drawRoundRect(fH0, fH0, f6, f7, fIntBitsToFloat3, fIntBitsToFloat4, dfVar.a);
                jeVarD = jeVarD2;
            }
            this.k = jeVarD;
            this.f = j;
            this.g = sv1Var.getLayoutDirection();
            this.h = sv1Var.getDensity();
        }
        je jeVar = this.k;
        if (jeVar != null) {
            s67 s67Var2 = this.i;
            float f8 = -(sv1Var.h0(s67Var2.b) + sv1Var.h0(s67Var2.a));
            sv1.U(sv1Var, jeVar, (((long) Float.floatToRawIntBits(f8)) << c) | (((long) Float.floatToRawIntBits(f8)) & j3), f, g60Var2, i, 8);
        }
    }
}
