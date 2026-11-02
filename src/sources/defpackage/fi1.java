package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface fi1 {
    default float A(long j) {
        if (!w88.a(v88.b(j), 4294967296L)) {
            yc3.b("Only Sp can convert to Px");
        }
        float[] fArr = yi2.a;
        if (b0() < 1.03f) {
            return b0() * v88.c(j);
        }
        xi2 xi2VarA = yi2.a(b0());
        if (xi2VarA != null) {
            return xi2VarA.b(v88.c(j));
        }
        return b0() * v88.c(j);
    }

    default long D0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fH0 = h0(nt1.b(j));
        float fH1 = h0(nt1.a(j));
        return (((long) Float.floatToRawIntBits(fH0)) << 32) | (((long) Float.floatToRawIntBits(fH1)) & 4294967295L);
    }

    default float G0(long j) {
        if (!w88.a(v88.b(j), 4294967296L)) {
            yc3.b("Only Sp can convert to Px");
        }
        return h0(A(j));
    }

    default long M(float f) {
        return q(W(f));
    }

    default float R(int i) {
        return i / getDensity();
    }

    default float W(float f) {
        return f / getDensity();
    }

    float b0();

    float getDensity();

    default float h0(float f) {
        return getDensity() * f;
    }

    default long q(float f) {
        float[] fArr = yi2.a;
        if (b0() < 1.03f) {
            return eu7.i(f / b0(), 4294967296L);
        }
        xi2 xi2VarA = yi2.a(b0());
        return eu7.i(xi2VarA != null ? xi2VarA.a(f) : f / b0(), 4294967296L);
    }

    default long r(long j) {
        if (j != 9205357640488583168L) {
            return hi5.G(W(Float.intBitsToFloat((int) (j >> 32))), W(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default int x0(float f) {
        float fH0 = h0(f);
        if (Float.isInfinite(fH0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fH0);
    }
}
