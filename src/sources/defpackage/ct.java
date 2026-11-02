package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ct implements et {
    public final /* synthetic */ byte X;

    public /* synthetic */ ct(byte b) {
        this.X = b;
    }

    @Override // defpackage.et
    public final void d(zr4 zr4Var, int i, int[] iArr, z24 z24Var, int[] iArr2) {
        byte b = this.X;
        z24 z24Var2 = z24.X;
        int i2 = 0;
        switch (b) {
            case 0:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int i8 = i - i6;
                int length2 = iArr.length;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            case 2:
                if (iArr.length != 0) {
                    int i11 = 0;
                    for (int i12 : iArr) {
                        i11 += i12;
                    }
                    float fMax = (i - i11) / Math.max(iArr.length - 1, 1);
                    int length3 = iArr.length;
                    float f = 0.0f;
                    int i13 = 0;
                    while (i2 < length3) {
                        int i14 = iArr[i2];
                        iArr2[i13] = Math.round(f);
                        f += i14 + fMax;
                        i2++;
                        i13++;
                    }
                    break;
                }
                break;
            case 3:
                if (z24Var == z24Var2) {
                    int i15 = 0;
                    for (int i16 : iArr) {
                        i15 += i16;
                    }
                    int i17 = i - i15;
                    int length4 = iArr.length;
                    int i18 = 0;
                    while (i2 < length4) {
                        int i19 = iArr[i2];
                        iArr2[i18] = i17;
                        i17 += i19;
                        i2++;
                        i18++;
                    }
                } else {
                    for (int length5 = iArr.length - 1; -1 < length5; length5--) {
                        int i20 = iArr[length5];
                        iArr2[length5] = i2;
                        i2 += i20;
                    }
                }
                break;
            default:
                if (z24Var == z24Var2) {
                    int length6 = iArr.length;
                    int i21 = 0;
                    int i22 = 0;
                    while (i2 < length6) {
                        int i23 = iArr[i2];
                        iArr2[i21] = i22;
                        i22 += i23;
                        i2++;
                        i21++;
                    }
                } else {
                    int length7 = iArr.length;
                    int i24 = 0;
                    while (i2 < length7) {
                        i24 += iArr[i2];
                        i2++;
                    }
                    int i25 = i - i24;
                    for (int length8 = iArr.length - 1; -1 < length8; length8--) {
                        int i26 = iArr[length8];
                        iArr2[length8] = i25;
                        i25 += i26;
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.X) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "AbsoluteArrangement#SpaceBetween";
            case 3:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
