package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ti4 implements fi1 {
    public boolean X;
    public long Y = 9223372034707292159L;
    public long Z = 0;
    public final /* synthetic */ vi4 f0;

    public ti4(vi4 vi4Var) {
        this.f0 = vi4Var;
    }

    public final void a(w03 w03Var, float f) {
        vi4 vi4Var = this.f0;
        d7 d7Var = vi4Var.s0;
        if (d7Var == null) {
            d7Var = new d7();
            vi4Var.s0 = d7Var;
        }
        int iV0 = eu.v0(w03Var, (w03[]) d7Var.c);
        if (iV0 >= 0) {
            float[] fArr = (float[]) d7Var.d;
            if (fArr[iV0] != f) {
                fArr[iV0] = f;
                ((byte[]) d7Var.e)[iV0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) d7Var.e;
                if (bArr[iV0] == 2) {
                    bArr[iV0] = 0;
                    return;
                }
                return;
            }
        }
        int i = d7Var.b;
        w03[] w03VarArr = (w03[]) d7Var.c;
        if (i == w03VarArr.length) {
            int i2 = i * 2;
            d7Var.c = (w03[]) Arrays.copyOf(w03VarArr, i2);
            d7Var.d = Arrays.copyOf((float[]) d7Var.d, i2);
            d7Var.e = Arrays.copyOf((byte[]) d7Var.e, i2);
        }
        ((w03[]) d7Var.c)[i] = w03Var;
        ((byte[]) d7Var.e)[i] = 3;
        ((float[]) d7Var.d)[i] = f;
        d7Var.b++;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.f0.b0();
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.f0.getDensity();
    }
}
