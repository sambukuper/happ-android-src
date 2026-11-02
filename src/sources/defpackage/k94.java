package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k94 extends xw8 {
    public final vz4 b;

    public k94() {
        vz4 vz4Var = gf3.a;
        this.b = new vz4();
    }

    @Override // defpackage.xw8
    public final void d() {
        vz4 vz4Var = this.b;
        int[] iArr = vz4Var.b;
        Object[] objArr = vz4Var.c;
        long[] jArr = vz4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        j05 j05Var = (j05) objArr[i4];
                        Object[] objArr2 = j05Var.a;
                        int i6 = j05Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            j94 j94Var = (j94) objArr2[i7];
                            pm0 pm0Var = j94Var.d;
                            if (pm0Var != null) {
                                pm0Var.cancel();
                            }
                            j94Var.d = null;
                            dp4 dp4Var = (dp4) j94Var.a.Y;
                            dp4Var.Y = true;
                            dp4Var.X = false;
                            dp4Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
