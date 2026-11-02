package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vi7 extends lj7 implements p51 {
    public static final vi7 f0 = new vi7((byte) 0);
    public static final vi7 g0 = new vi7((byte) 1);
    public final /* synthetic */ byte Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi7(byte b) {
        super(double[].class);
        this.Z = b;
        switch (b) {
            case 1:
                super(float[].class);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        byte b = this.Z;
        Class cls = this.X;
        switch (b) {
            case 0:
                no3 no3VarK = lj7.k(t37Var, d50Var, cls);
                if (no3VarK == null) {
                    return this;
                }
                int iOrdinal = no3VarK.Y.ordinal();
                return (iOrdinal == 7 || iOrdinal == 10) ? xi7.g0 : this;
            default:
                no3 no3VarK2 = lj7.k(t37Var, d50Var, cls);
                if (no3VarK2 == null) {
                    return this;
                }
                int iOrdinal2 = no3VarK2.Y.ordinal();
                return (iOrdinal2 == 7 || iOrdinal2 == 10) ? yi7.g0 : this;
        }
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        switch (this.Z) {
            case 0:
                return ((double[]) obj).length == 0;
            default:
                return ((float[]) obj).length == 0;
        }
    }

    @Override // defpackage.ar3
    public final /* bridge */ /* synthetic */ void e(Object obj, ro3 ro3Var, t37 t37Var) {
        switch (this.Z) {
            case 0:
                o((double[]) obj, ro3Var, t37Var);
                break;
            default:
                p((float[]) obj, ro3Var, t37Var);
                break;
        }
    }

    @Override // defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        switch (this.Z) {
            case 0:
                double[] dArr = (double[]) obj;
                z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(dArr, gr3.VALUE_EMBEDDED_OBJECT));
                o(dArr, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE);
                break;
            default:
                float[] fArr = (float[]) obj;
                z76 z76VarE2 = ri8Var.e(ro3Var, ri8Var.d(fArr, gr3.VALUE_EMBEDDED_OBJECT));
                p(fArr, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE2);
                break;
        }
    }

    public void o(double[] dArr, ro3 ro3Var, t37 t37Var) {
        int length = dArr.length << 3;
        byte[] bArr = new byte[length];
        int i = 0;
        for (double d : dArr) {
            long jDoubleToLongBits = Double.doubleToLongBits(d);
            int i2 = (int) (jDoubleToLongBits >> 32);
            bArr[i] = (byte) (i2 >> 24);
            bArr[i + 1] = (byte) (i2 >> 16);
            bArr[i + 2] = (byte) (i2 >> 8);
            bArr[i + 3] = (byte) i2;
            int i3 = (int) jDoubleToLongBits;
            bArr[i + 4] = (byte) (i3 >> 24);
            bArr[i + 5] = (byte) (i3 >> 16);
            bArr[i + 6] = (byte) (i3 >> 8);
            bArr[i + 7] = (byte) i3;
            i += 8;
        }
        ro3Var.u(t37Var.X.Y.i0, bArr, 0, length);
    }

    public void p(float[] fArr, ro3 ro3Var, t37 t37Var) {
        int length = fArr.length << 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (float f : fArr) {
            int iFloatToIntBits = Float.floatToIntBits(f);
            bArr[i] = (byte) (iFloatToIntBits >> 24);
            bArr[i + 1] = (byte) (iFloatToIntBits >> 16);
            int i2 = i + 3;
            bArr[i + 2] = (byte) (iFloatToIntBits >> 8);
            i += 4;
            bArr[i2] = (byte) iFloatToIntBits;
        }
        ro3Var.u(t37Var.X.Y.i0, bArr, 0, length);
    }
}
