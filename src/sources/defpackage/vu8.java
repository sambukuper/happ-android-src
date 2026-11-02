package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vu8 {
    public final boolean a;
    public final uu8 b;
    public final int c;
    public final ka1[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public vu8(boolean z, uu8 uu8Var) {
        int i;
        this.a = z;
        this.b = uu8Var;
        if (z && uu8Var.equals(uu8.X)) {
            bt.i("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = uu8Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                b61.c();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new ka1[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        ka1[] ka1VarArr = this.d;
        ka1 ka1Var = ka1VarArr[i];
        if (ka1Var != null) {
            ka1Var.a = j;
            ka1Var.b = f;
        } else {
            ka1 ka1Var2 = new ka1();
            ka1Var2.a = j;
            ka1Var2.b = f;
            ka1VarArr[i] = ka1Var2;
        }
    }

    public final float b() {
        boolean z;
        uu8 uu8Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        ka1[] ka1VarArr = this.d;
        ka1 ka1Var = ka1VarArr[i3];
        if (ka1Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        ka1 ka1Var2 = ka1Var;
        do {
            ka1 ka1Var3 = ka1VarArr[i3];
            z = this.a;
            uu8Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (ka1Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = ka1Var.a;
                i = i4;
                f = 0.0f;
                long j2 = ka1Var3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - ka1Var2.a);
                ka1Var2 = (uu8Var == uu8.X || z) ? ka1Var3 : ka1Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = ka1Var3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = uu8Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                p38.d(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                b61.c();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            wc3.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ vu8() {
        this(false, uu8.X);
    }

    public vu8(boolean z) {
        this(z, uu8.Y);
    }
}
