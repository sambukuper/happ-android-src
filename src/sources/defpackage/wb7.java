package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wb7 implements lv1 {
    public final byte X;
    public final uu0 Y;
    public final nh5 Z;
    public gn2 f0;
    public final boolean g0 = true;
    public final float[] h0;
    public final oh5 i0;
    public final oh5 j0;
    public boolean k0;
    public final oh5 l0;
    public final oh5 m0;
    public final sd5 n0;
    public final rh5 o0;
    public final hr5 p0;
    public final nh5 q0;
    public final nh5 r0;
    public final ka s0;
    public final m15 t0;

    /* JADX WARN: Multi-variable type inference failed */
    public wb7(float f, int i, uu0 uu0Var) {
        float[] fArr;
        this.X = i;
        this.Y = uu0Var;
        this.Z = new nh5(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.h0 = fArr;
        this.i0 = new oh5(0);
        this.j0 = new oh5(0);
        this.l0 = new oh5(0);
        this.m0 = new oh5(0);
        this.n0 = sd5.Y;
        this.o0 = z51.H(Boolean.FALSE);
        this.p0 = new hr5(this, (byte) 21);
        uu0 uu0Var2 = this.Y;
        float f2 = uu0Var2.X;
        float f3 = uu0Var2.Y - f2;
        this.q0 = new nh5(w51.H(0.0f, 0.0f, x97.m(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.r0 = new nh5(0.0f);
        this.s0 = new ka(this, (byte) 1);
        this.t0 = new m15();
    }

    public final void a(float f) {
        float fMax;
        float fMin;
        if (this.n0 == sd5.X) {
            float fL = this.j0.l();
            oh5 oh5Var = this.m0;
            fMax = Math.max(fL - (oh5Var.l() / 2.0f), 0.0f);
            fMin = Math.min(oh5Var.l() / 2.0f, fMax);
        } else {
            float fL2 = this.i0.l();
            oh5 oh5Var2 = this.l0;
            fMax = Math.max(fL2 - (oh5Var2.l() / 2.0f), 0.0f);
            fMin = Math.min(oh5Var2.l() / 2.0f, fMax);
        }
        nh5 nh5Var = this.q0;
        float fL3 = nh5Var.l() + f;
        nh5 nh5Var2 = this.r0;
        nh5Var.m(nh5Var2.l() + fL3);
        nh5Var2.m(0.0f);
        float fD = vb7.d(nh5Var.l(), this.h0, fMin, fMax);
        uu0 uu0Var = this.Y;
        float f2 = fMax - fMin;
        float fH = w51.H(uu0Var.X, uu0Var.Y, x97.m(f2 == 0.0f ? 0.0f : (fD - fMin) / f2, 0.0f, 1.0f));
        if (fH == this.Z.l()) {
            return;
        }
        gn2 gn2Var = this.f0;
        if (gn2Var != null) {
            gn2Var.B(Float.valueOf(fH));
        } else {
            c(fH);
        }
    }

    public final float b() {
        uu0 uu0Var = this.Y;
        float f = uu0Var.X;
        float f2 = uu0Var.Y;
        float fM = x97.m(this.Z.l(), f, f2);
        float f3 = f2 - f;
        return x97.m(f3 == 0.0f ? 0.0f : (fM - f) / f3, 0.0f, 1.0f);
    }

    public final void c(float f) {
        if (this.g0) {
            uu0 uu0Var = this.Y;
            float f2 = uu0Var.X;
            float f3 = uu0Var.Y;
            f = vb7.d(x97.m(f, f2, f3), this.h0, f2, f3);
        }
        this.Z.m(f);
    }

    @Override // defpackage.lv1
    public final Object i(pi piVar, wu1 wu1Var) {
        Object objN = gv3.n(new t17(this, piVar, null, (byte) 6), wu1Var);
        return objN == c71.X ? objN : dn8.a;
    }
}
