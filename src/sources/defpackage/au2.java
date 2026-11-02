package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class au2 implements lf5 {
    public xt2 X;
    public final vt2 Y;
    public final AndroidComposeView Z;
    public rn2 f0;
    public dn2 g0;
    public boolean i0;
    public float[] k0;
    public boolean l0;
    public int p0;
    public mb6 r0;
    public boolean s0;
    public boolean t0;
    public boolean v0;
    public long h0 = 9223372034707292159L;
    public final float[] j0 = or4.a();
    public fi1 m0 = i21.b();
    public z24 n0 = z24.X;
    public final um0 o0 = new um0();
    public long q0 = gd8.b;
    public boolean u0 = true;
    public final vj2 w0 = new vj2((Object) this, (byte) 2);

    public au2(xt2 xt2Var, vt2 vt2Var, AndroidComposeView androidComposeView, rn2 rn2Var, dn2 dn2Var) {
        this.X = xt2Var;
        this.Y = vt2Var;
        this.Z = androidComposeView;
        this.f0 = rn2Var;
        this.g0 = dn2Var;
    }

    public final float[] a() {
        float[] fArrA = this.k0;
        if (fArrA == null) {
            fArrA = or4.a();
            this.k0 = fArrA;
        }
        if (this.t0) {
            this.t0 = false;
            float[] fArrB = b();
            if (this.u0) {
                return fArrB;
            }
            if (!x97.D(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.s0;
        float[] fArr = this.j0;
        if (z) {
            xt2 xt2Var = this.X;
            long jG = xt2Var.z;
            zt2 zt2Var = xt2Var.a;
            if ((9223372034707292159L & jG) == 9205357640488583168L) {
                jG = vj8.G(u15.R(this.h0));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
            float fD = zt2Var.D();
            float fX = zt2Var.x();
            float fG = zt2Var.G();
            float fP = zt2Var.p();
            float fS = zt2Var.s();
            float fC = zt2Var.c();
            float fN = zt2Var.N();
            double d = ((double) fG) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fX * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fX * fSin);
            double d2 = ((double) fP) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fD * fCos2);
            float f10 = (f3 * fCos2) + ((-fD) * fSin2);
            double d3 = ((double) fS) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fC;
            float f16 = f14 * fC;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fC;
            float f18 = f12 * fN;
            float f19 = fCos * fCos3 * fN;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fN;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.s0 = false;
            this.u0 = ch3.K(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.l0 || this.i0) {
            return;
        }
        this.Z.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = AndroidComposeView.l();
        AndroidComposeView androidComposeView = this.Z;
        if (zL) {
            androidComposeView.K(-4.0f);
        }
        xt2 xt2Var = this.X;
        if (!hf3.a(xt2Var.t, j)) {
            xt2Var.t = j;
            xt2Var.a.k((int) (j >> 32), xt2Var.u, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            gw8.e(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
    }

    public final void e(long j) {
        if (pf3.a(j, this.h0)) {
            return;
        }
        if (AndroidComposeView.l()) {
            this.Z.K(-4.0f);
        }
        this.h0 = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.l0) {
            this.l0 = z;
            AndroidComposeView androidComposeView = this.Z;
            j05 j05Var = androidComposeView.F0;
            boolean z2 = androidComposeView.H0;
            if (!z) {
                if (z2) {
                    return;
                }
                j05Var.k(this);
                j05 j05Var2 = androidComposeView.G0;
                if (j05Var2 != null) {
                    j05Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                j05Var.a(this);
                return;
            }
            j05 j05Var3 = androidComposeView.G0;
            if (j05Var3 == null) {
                j05Var3 = new j05();
                androidComposeView.G0 = j05Var3;
            }
            j05Var3.a(this);
        }
    }

    public final void g() {
        AndroidComposeView.l();
        if (this.l0) {
            if (!gd8.a(this.q0, gd8.b) && !pf3.a(this.X.u, this.h0)) {
                xt2 xt2Var = this.X;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.q0 >> 32)) * ((int) (this.h0 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.q0 & 4294967295L)) * ((int) (this.h0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!z85.b(xt2Var.z, jFloatToRawIntBits)) {
                    xt2Var.z = jFloatToRawIntBits;
                    xt2Var.a.t(jFloatToRawIntBits);
                }
            }
            this.X.e(this.m0, this.n0, this.h0, this.w0);
            f(false);
        }
    }
}
