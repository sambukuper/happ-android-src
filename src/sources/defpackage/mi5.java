package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mi5 implements CharSequence {
    public CharSequence X;
    public xr0 Y;
    public int Z;
    public int f0;

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            zc3.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            zc3.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            zc3.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            zc3.a("textStart must be non-negative, but was " + i3);
        }
        xr0 xr0Var = this.Y;
        int i5 = i4 - i3;
        if (xr0Var == null) {
            int iMax = Math.max(255, i5 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.X.length() - i2, 64);
            int i6 = i - iMin;
            g28.n(this.X, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            g28.n(this.X, cArr, i7, i2, i8);
            g28.n(charSequence, cArr, iMin, i3, i4);
            xr0 xr0Var2 = new xr0((byte) 1);
            xr0Var2.b = iMax;
            xr0Var2.e = cArr;
            xr0Var2.c = iMin + i5;
            xr0Var2.d = i7;
            this.Y = xr0Var2;
            this.Z = i6;
            this.f0 = i8;
            return;
        }
        int i9 = this.Z;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > xr0Var.b - xr0Var.f()) {
            this.X = toString();
            this.Y = null;
            this.Z = -1;
            this.f0 = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > xr0Var.f()) {
            int iF = i12 - xr0Var.f();
            int i13 = xr0Var.b;
            do {
                i13 *= 2;
            } while (i13 - xr0Var.b < iF);
            char[] cArr2 = new char[i13];
            System.arraycopy((char[]) xr0Var.e, 0, cArr2, 0, xr0Var.c);
            int i14 = xr0Var.b;
            int i15 = xr0Var.d;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            System.arraycopy((char[]) xr0Var.e, i15, cArr2, i17, (i16 + i15) - i15);
            xr0Var.e = cArr2;
            xr0Var.b = i13;
            xr0Var.d = i17;
        }
        int i18 = xr0Var.c;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = (char[]) xr0Var.e;
            System.arraycopy(cArr3, i11, cArr3, xr0Var.d - i19, i19);
            xr0Var.c = i10;
            xr0Var.d -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iF2 = xr0Var.f() + i10;
            int iF3 = xr0Var.f() + i11;
            int i20 = xr0Var.d;
            int i21 = iF2 - i20;
            char[] cArr4 = (char[]) xr0Var.e;
            System.arraycopy(cArr4, i20, cArr4, xr0Var.c, i21);
            i10 = xr0Var.c + i21;
            xr0Var.c = i10;
            xr0Var.d = iF3;
        } else {
            xr0Var.d = xr0Var.f() + i11;
            xr0Var.c = i10;
        }
        g28.n(charSequence, (char[]) xr0Var.e, i10, i3, i4);
        xr0Var.c += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        xr0 xr0Var = this.Y;
        if (xr0Var == null) {
            return this.X.charAt(i);
        }
        if (i < this.Z) {
            return this.X.charAt(i);
        }
        int iF = xr0Var.b - xr0Var.f();
        int i2 = this.Z;
        if (i >= iF + i2) {
            return this.X.charAt(i - ((iF - this.f0) + i2));
        }
        int i3 = i - i2;
        int i4 = xr0Var.c;
        char[] cArr = (char[]) xr0Var.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + xr0Var.d];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        xr0 xr0Var = this.Y;
        CharSequence charSequence = this.X;
        if (xr0Var == null) {
            return charSequence.length();
        }
        return (xr0Var.b - xr0Var.f()) + (charSequence.length() - (this.f0 - this.Z));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        xr0 xr0Var = this.Y;
        if (xr0Var == null) {
            return this.X.toString();
        }
        StringBuilder sb = new StringBuilder((this.X.length() + ((xr0Var.b - xr0Var.f()) + this.Z)) - this.f0);
        sb.append(this.X, 0, this.Z);
        sb.append((char[]) xr0Var.e, 0, xr0Var.c);
        char[] cArr = (char[]) xr0Var.e;
        int i = xr0Var.d;
        sb.append(cArr, i, xr0Var.b - i);
        CharSequence charSequence = this.X;
        sb.append(charSequence, this.f0, charSequence.length());
        return sb.toString();
    }
}
