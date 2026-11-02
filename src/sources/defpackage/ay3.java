package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ay3 implements hx1 {
    public final zx3 a;

    public ay3(zx3 zx3Var) {
        this.a = zx3Var;
    }

    @Override // defpackage.hx1, defpackage.pk
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final pu8 a(ug8 ug8Var) {
        int[] iArr;
        Object[] objArr;
        zx3 zx3Var = this.a;
        vz4 vz4Var = zx3Var.b;
        uz4 uz4Var = new uz4(vz4Var.e + 2);
        vz4 vz4Var2 = new vz4(vz4Var.e);
        int[] iArr2 = vz4Var.b;
        Object[] objArr2 = vz4Var.c;
        long[] jArr = vz4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            yx3 yx3Var = (yx3) objArr2[i5];
                            uz4Var.a(i6);
                            vz4Var2.h(i6, new ou8((wk) ug8Var.a.B(yx3Var.a), yx3Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!vz4Var.a(0)) {
            int i7 = uz4Var.b;
            if (i7 < 0) {
                kp5.k("Index must be between 0 and size");
                return null;
            }
            uz4Var.b(i7 + 1);
            int[] iArr3 = uz4Var.a;
            int i8 = uz4Var.b;
            if (i8 != 0) {
                eu.e0(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            uz4Var.b++;
        }
        if (!vz4Var.a(zx3Var.a)) {
            uz4Var.a(zx3Var.a);
        }
        int i9 = uz4Var.b;
        if (i9 != 0) {
            int[] iArr4 = uz4Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new pu8(uz4Var, vz4Var2, zx3Var.a, yx1.d);
    }
}
