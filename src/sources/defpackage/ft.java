package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ft implements et, gt {
    public final float X;
    public final bt Y;
    public final float Z;

    public ft(float f, bt btVar) {
        this.X = f;
        this.Y = btVar;
        this.Z = f;
    }

    @Override // defpackage.et, defpackage.gt
    public final float a() {
        return this.Z;
    }

    @Override // defpackage.et
    public final void d(zr4 zr4Var, int i, int[] iArr, z24 z24Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iX0 = zr4Var.x0(this.X);
        boolean z = z24Var == z24.Y;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iX0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iX0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int iRound = Math.round((1.0f + (z24Var == z24.X ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                iRound -= i2;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iRound;
                }
            }
        }
    }

    @Override // defpackage.gt
    public final void e(int i, zr4 zr4Var, int[] iArr, int[] iArr2) {
        d(zr4Var, i, iArr, z24.X, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft) {
            ft ftVar = (ft) obj;
            return kt1.b(this.X, ftVar.X) && this.Y == ftVar.Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.Y.hashCode() + pc6.f(Float.hashCode(this.X) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + kt1.c(this.X) + ", " + this.Y + ")";
    }
}
