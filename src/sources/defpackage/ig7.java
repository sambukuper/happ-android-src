package defpackage;

import androidx.leanback.widget.GridLayoutManager;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ig7 extends iu2 {
    public xr0 j;
    public int k;
    public Object l;
    public int m;

    @Override // defpackage.iu2
    public final boolean b(int i, boolean z) {
        Object[] objArr = this.a;
        if (this.b.G() == 0 || (!z && c(i))) {
            return false;
        }
        try {
            if (o(i, z)) {
                return true;
            }
            return q(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    @Override // defpackage.iu2
    public final int f(boolean z, int i, int[] iArr) {
        int i2;
        int iH = this.b.H(i);
        hg7 hg7VarK = k(i);
        int i3 = hg7VarK.Y;
        if (this.c) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = iH;
            for (int i7 = i + 1; i5 < this.e && i7 <= this.g; i7++) {
                hg7 hg7VarK2 = k(i7);
                i6 += hg7VarK2.g0;
                int i8 = hg7VarK2.Y;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i6 >= iH : i6 <= iH) {
                        i4 = i8;
                    } else {
                        iH = i6;
                        i = i7;
                        i2 = i8;
                        i4 = i2;
                    }
                }
            }
        } else {
            int i9 = 1;
            int i10 = i3;
            hg7 hg7VarK3 = hg7VarK;
            int i11 = iH;
            iH = this.b.L(i) + iH;
            i2 = i10;
            for (int i12 = i - 1; i9 < this.e && i12 >= this.f; i12--) {
                i11 -= hg7VarK3.g0;
                hg7VarK3 = k(i12);
                int i13 = hg7VarK3.Y;
                if (i13 != i10) {
                    i9++;
                    int iL = this.b.L(i12) + i11;
                    if (!z ? iL >= iH : iL <= iH) {
                        i10 = i13;
                    } else {
                        iH = iL;
                        i = i12;
                        i2 = i13;
                        i10 = i2;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iH;
    }

    @Override // defpackage.iu2
    public final int h(boolean z, int i, int[] iArr) {
        int iL;
        int iH = this.b.H(i);
        hg7 hg7VarK = k(i);
        int i2 = hg7VarK.Y;
        if (this.c) {
            int i3 = 1;
            iL = iH - this.b.L(i);
            int i4 = i2;
            for (int i5 = i - 1; i3 < this.e && i5 >= this.f; i5--) {
                iH -= hg7VarK.g0;
                hg7VarK = k(i5);
                int i6 = hg7VarK.Y;
                if (i6 != i4) {
                    i3++;
                    int iL2 = iH - this.b.L(i5);
                    if (!z ? iL2 >= iL : iL2 <= iL) {
                        i4 = i6;
                    } else {
                        iL = iL2;
                        i = i5;
                        i2 = i6;
                        i4 = i2;
                    }
                }
            }
        } else {
            int i7 = i2;
            int i8 = i7;
            int i9 = 1;
            int i10 = iH;
            for (int i11 = i + 1; i9 < this.e && i11 <= this.g; i11++) {
                hg7 hg7VarK2 = k(i11);
                i10 += hg7VarK2.g0;
                int i12 = hg7VarK2.Y;
                if (i12 != i8) {
                    i9++;
                    if (!z ? i10 >= iH : i10 <= iH) {
                        i8 = i12;
                    } else {
                        iH = i10;
                        i = i11;
                        i7 = i12;
                        i8 = i7;
                    }
                }
            }
            iL = iH;
            i2 = i7;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iL;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // defpackage.iu2
    public final cb0[] j(int i, int i2) {
        for (int i3 = 0; i3 < this.e; i3++) {
            this.h[i3].Y = 0;
        }
        if (i >= 0) {
            while (i <= i2) {
                cb0 cb0Var = this.h[k(i).Y];
                int i4 = cb0Var.Y;
                int i5 = cb0Var.Z;
                if ((i4 & i5) <= 0) {
                    cb0Var.b(i);
                    cb0Var.b(i);
                } else {
                    if (i4 == 0) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i6 = i5 & (i4 - 1);
                    if (((int[]) cb0Var.f0)[i6] != i - 1) {
                        cb0Var.b(i);
                        cb0Var.b(i);
                    } else {
                        if (i4 == 0) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        cb0Var.Y = i6;
                        cb0Var.b(i);
                    }
                }
                i++;
            }
        }
        return this.h;
    }

    @Override // defpackage.iu2
    public final void l(int i) {
        super.l(i);
        xr0 xr0Var = this.j;
        xr0Var.j((s() - i) + 1);
        if (xr0Var.l() == 0) {
            this.k = -1;
        }
    }

    @Override // defpackage.iu2
    public final boolean m(int i, boolean z) {
        Object[] objArr = this.a;
        if (this.b.G() == 0 || (!z && d(i))) {
            return false;
        }
        try {
            if (w(i, z)) {
                return true;
            }
            return y(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    public final boolean o(int i, boolean z) {
        int i2;
        int iH;
        int i3;
        xr0 xr0Var = this.j;
        if (xr0Var.l() != 0) {
            int iG = this.b.G();
            int i4 = this.g;
            if (i4 >= 0) {
                i2 = i4 + 1;
                iH = this.b.H(i4);
            } else {
                int i5 = this.i;
                i2 = i5 != -1 ? i5 : 0;
                if (i2 > s() + 1 || i2 < this.k) {
                    xr0Var.k(xr0Var.l());
                    return false;
                }
                if (i2 <= s()) {
                    iH = Integer.MAX_VALUE;
                }
            }
            int iS = s();
            int i6 = i2;
            while (i6 < iG && i6 <= iS) {
                hg7 hg7VarK = k(i6);
                if (iH != Integer.MAX_VALUE) {
                    iH += hg7VarK.g0;
                }
                int i7 = iH;
                int i8 = hg7VarK.Y;
                q02 q02Var = this.b;
                Object[] objArr = this.a;
                int iB = q02Var.B(i6, true, objArr, false);
                if (iB != hg7VarK.h0) {
                    hg7VarK.h0 = iB;
                    xr0Var.j(iS - i6);
                    i3 = i6;
                } else {
                    i3 = iS;
                }
                this.g = i6;
                if (this.f < 0) {
                    this.f = i6;
                }
                this.b.A(objArr[0], i6, iB, i8, i7);
                if (z || !c(i)) {
                    iH = i7 == Integer.MAX_VALUE ? this.b.H(i6) : i7;
                    if (i8 != this.e - 1 || !z) {
                        i6++;
                        iS = i3;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int p(int i, int i2, int i3) {
        int iH;
        xr0 xr0Var = this.j;
        int i4 = this.g;
        if (i4 >= 0 && (i4 != s() || (i4 = this.g) != i - 1)) {
            c2.g();
            return 0;
        }
        if (i4 >= 0) {
            iH = i3 - this.b.H(i4);
        } else if (xr0Var.l() <= 0 || i != s() + 1) {
            iH = 0;
        } else {
            int iS = s();
            while (true) {
                if (iS < this.k) {
                    iS = s();
                    break;
                }
                if (k(iS).Y == i2) {
                    break;
                }
                iS--;
            }
            iH = this.c ? (-k(iS).h0) - this.d : k(iS).h0 + this.d;
            for (int i5 = iS + 1; i5 <= s(); i5++) {
                iH -= k(i5).g0;
            }
        }
        hg7 hg7Var = new hg7(i2, iH);
        xr0Var.a(hg7Var);
        Object obj = this.l;
        if (obj != null) {
            hg7Var.h0 = this.m;
            this.l = null;
        } else {
            q02 q02Var = this.b;
            Object[] objArr = this.a;
            hg7Var.h0 = q02Var.B(i, true, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        if (xr0Var.l() == 1) {
            this.g = i;
            this.f = i;
            this.k = i;
        } else {
            int i6 = this.g;
            if (i6 < 0) {
                this.g = i;
                this.f = i;
            } else {
                this.g = i6 + 1;
            }
        }
        this.b.A(obj2, i, hg7Var.h0, i2, i3);
        return hg7Var.h0;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00c5 A[PHI: r9 r11
  0x00c5: PHI (r9v19 int) = (r9v11 int), (r9v4 int) binds: [B:78:0x00e3, B:66:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r11v9 int) = (r11v2 int), (r11v11 int) binds: [B:78:0x00e3, B:66:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean q(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int iV;
        int i4;
        int iG = this.b.G();
        int i5 = this.g;
        if (i5 < 0) {
            int i6 = this.i;
            i2 = i6 != -1 ? i6 : 0;
            i3 = (this.j.l() > 0 ? k(s()).Y + 1 : i2) % this.e;
            z2 = false;
            iV = 0;
        } else {
            if (i5 < s()) {
                return false;
            }
            int i7 = this.g;
            i2 = i7 + 1;
            i3 = k(i7).Y;
            int iR = r(true);
            if (iR < 0) {
                iV = Integer.MIN_VALUE;
                for (int i8 = 0; i8 < this.e; i8++) {
                    iV = this.c ? v(i8) : u(i8);
                    if (iV != Integer.MIN_VALUE) {
                        break;
                    }
                }
            } else {
                iV = this.c ? h(false, iR, null) : f(true, iR, null);
            }
            if (!this.c ? u(i3) >= iV : v(i3) <= iV) {
                i3++;
                if (i3 == this.e) {
                    iV = this.c ? i(false, null) : g(true, null);
                    i3 = 0;
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        while (true) {
            if (i3 < this.e) {
                if (i2 == iG || (!z && c(i))) {
                    break;
                }
                int iV2 = this.c ? v(i3) : u(i3);
                if (iV2 == Integer.MAX_VALUE || iV2 == Integer.MIN_VALUE) {
                    boolean z4 = this.c;
                    if (i3 == 0) {
                        int i9 = this.e - 1;
                        iV2 = z4 ? v(i9) : u(i9);
                        if (iV2 != Integer.MAX_VALUE && iV2 != Integer.MIN_VALUE) {
                            boolean z5 = this.c;
                            i4 = this.d;
                            if (z5) {
                                i4 = -i4;
                            }
                            iV2 += i4;
                        }
                    } else {
                        iV2 = z4 ? u(i3 - 1) : v(i3 - 1);
                    }
                } else {
                    boolean z6 = this.c;
                    i4 = this.d;
                    if (z6) {
                        i4 = -i4;
                    }
                    iV2 += i4;
                }
                int i10 = i2 + 1;
                int iP = p(i2, i3, iV2);
                if (z2) {
                    while (true) {
                        if (!this.c) {
                            if (iV2 + iP >= iV) {
                                break;
                            }
                            if (i10 != iG) {
                            }
                            return true;
                        }
                        if (iV2 - iP <= iV) {
                            break;
                        }
                        if (i10 != iG || (!z && c(i))) {
                            return true;
                        }
                        boolean z7 = this.c;
                        int i11 = this.d;
                        iV2 += z7 ? (-iP) - i11 : iP + i11;
                        int i12 = i10 + 1;
                        int iP2 = p(i10, i3, iV2);
                        i10 = i12;
                        iP = iP2;
                    }
                } else {
                    z2 = true;
                    iV = this.c ? v(i3) : u(i3);
                }
                i2 = i10;
                i3++;
                z3 = true;
            } else {
                if (z) {
                    break;
                }
                iV = this.c ? i(false, null) : g(true, null);
                i3 = 0;
            }
        }
        return z3;
    }

    public final int r(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.g; i >= this.f; i--) {
                int i2 = k(i).Y;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.e - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i3 = this.f; i3 <= this.g; i3++) {
            int i4 = k(i3).Y;
            if (i4 == this.e - 1) {
                z2 = true;
            } else if (z2 && i4 == 0) {
                return i3;
            }
        }
        return -1;
    }

    public final int s() {
        return (this.j.l() + this.k) - 1;
    }

    @Override // defpackage.iu2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final hg7 k(int i) {
        xr0 xr0Var = this.j;
        int i2 = i - this.k;
        if (i2 < 0 || i2 >= xr0Var.l()) {
            return null;
        }
        return (hg7) xr0Var.g(i2);
    }

    public final int u(int i) {
        int i2;
        hg7 hg7VarK;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        boolean z = this.c;
        q02 q02Var = this.b;
        if (z) {
            int iH = q02Var.H(i3);
            if (k(this.f).Y == i) {
                return iH;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    hg7VarK = k(i4);
                    iH += hg7VarK.g0;
                }
            } while (hg7VarK.Y != i);
            return iH;
        }
        int iH2 = q02Var.H(this.g);
        hg7 hg7VarK2 = k(this.g);
        if (hg7VarK2.Y == i) {
            i2 = hg7VarK2.h0;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iH2 -= hg7VarK2.g0;
                    hg7VarK2 = k(i5);
                }
            } while (hg7VarK2.Y != i);
            i2 = hg7VarK2.h0;
        }
        return iH2 + i2;
        return Integer.MIN_VALUE;
    }

    public final int v(int i) {
        hg7 hg7VarK;
        int i2;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        boolean z = this.c;
        q02 q02Var = this.b;
        if (!z) {
            int iH = q02Var.H(i3);
            if (k(this.f).Y == i) {
                return iH;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    hg7VarK = k(i4);
                    iH += hg7VarK.g0;
                }
            } while (hg7VarK.Y != i);
            return iH;
        }
        int iH2 = q02Var.H(this.g);
        hg7 hg7VarK2 = k(this.g);
        if (hg7VarK2.Y == i) {
            i2 = hg7VarK2.h0;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iH2 -= hg7VarK2.g0;
                    hg7VarK2 = k(i5);
                }
            } while (hg7VarK2.Y != i);
            i2 = hg7VarK2.h0;
        }
        return iH2 - i2;
        return Integer.MAX_VALUE;
    }

    public final boolean w(int i, boolean z) {
        int i2;
        int iH;
        int i3;
        xr0 xr0Var = this.j;
        if (xr0Var.l() != 0) {
            int i4 = this.f;
            if (i4 < 0) {
                int i5 = this.i;
                i2 = i5 != -1 ? i5 : 0;
                if (i2 <= s()) {
                    int i6 = this.k;
                    if (i2 >= i6 - 1) {
                        if (i2 >= i6) {
                            iH = Integer.MAX_VALUE;
                            i3 = 0;
                        }
                    }
                }
                xr0Var.k(xr0Var.l());
                return false;
            }
            iH = this.b.H(i4);
            i3 = k(this.f).g0;
            i2 = this.f - 1;
            int iMax = Math.max(((GridLayoutManager) this.b.Y).y0, this.k);
            for (int i7 = i2; i7 >= iMax; i7--) {
                hg7 hg7VarK = k(i7);
                int i8 = hg7VarK.Y;
                q02 q02Var = this.b;
                Object[] objArr = this.a;
                int iB = q02Var.B(i7, false, objArr, false);
                if (iB != hg7VarK.h0) {
                    xr0Var.k((i7 + 1) - this.k);
                    this.k = this.f;
                    this.l = objArr[0];
                    this.m = iB;
                    return false;
                }
                this.f = i7;
                if (this.g < 0) {
                    this.g = i7;
                }
                this.b.A(objArr[0], i7, iB, i8, iH - i3);
                if (z || !d(i)) {
                    iH = this.b.H(i7);
                    i3 = hg7VarK.g0;
                    if (i8 != 0 || !z) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int x(int i, int i2, int i3) {
        int i4;
        int i5 = this.f;
        if (i5 >= 0 && (i5 != this.k || i5 != i + 1)) {
            c2.g();
            return 0;
        }
        int i6 = this.k;
        hg7 hg7VarK = i6 >= 0 ? k(i6) : null;
        int iH = this.b.H(this.k);
        hg7 hg7Var = new hg7(i2, 0);
        xr0 xr0Var = this.j;
        int i7 = (xr0Var.b - 1) & xr0Var.d;
        xr0Var.b = i7;
        ((Object[]) xr0Var.e)[i7] = hg7Var;
        if (i7 == xr0Var.c) {
            xr0Var.e();
        }
        Object obj = this.l;
        if (obj != null) {
            int i8 = this.m;
            hg7Var.h0 = i8;
            this.l = null;
            i4 = i8;
        } else {
            q02 q02Var = this.b;
            Object[] objArr = this.a;
            int iB = q02Var.B(i, false, objArr, false);
            hg7Var.h0 = iB;
            obj = objArr[0];
            i4 = iB;
        }
        Object obj2 = obj;
        this.f = i;
        this.k = i;
        if (this.g < 0) {
            this.g = i;
        }
        int i9 = !this.c ? i3 - i4 : i3 + i4;
        if (hg7VarK != null) {
            hg7VarK.g0 = iH - i9;
        }
        this.b.A(obj2, i, i4, i2, i9);
        return hg7Var.h0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00bd A[PHI: r8 r10
  0x00bd: PHI (r8v19 int) = (r8v11 int), (r8v4 int) binds: [B:75:0x00da, B:63:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r10v8 int) = (r10v1 int), (r10v10 int) binds: [B:75:0x00da, B:63:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean y(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int iU;
        int i4;
        int i5 = this.f;
        if (i5 < 0) {
            int i6 = this.i;
            i2 = i6 != -1 ? i6 : 0;
            i3 = (this.j.l() > 0 ? (k(this.k).Y + this.e) - 1 : i2) % this.e;
            z2 = false;
            iU = 0;
        } else {
            if (i5 > this.k) {
                return false;
            }
            i2 = i5 - 1;
            i3 = k(i5).Y;
            int iR = r(false);
            if (iR < 0) {
                i3--;
                iU = Integer.MAX_VALUE;
                for (int i7 = this.e - 1; i7 >= 0; i7--) {
                    iU = this.c ? u(i7) : v(i7);
                    if (iU != Integer.MAX_VALUE) {
                        break;
                    }
                }
            } else {
                iU = this.c ? f(true, iR, null) : h(false, iR, null);
            }
            if (!this.c ? v(i3) <= iU : u(i3) >= iU) {
                i3--;
                if (i3 < 0) {
                    i3 = this.e - 1;
                    iU = this.c ? g(true, null) : i(false, null);
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        while (true) {
            if (i3 >= 0) {
                if (i2 < 0 || (!z && d(i))) {
                    break;
                }
                int iU2 = this.c ? u(i3) : v(i3);
                if (iU2 == Integer.MAX_VALUE || iU2 == Integer.MIN_VALUE) {
                    int i8 = this.e - 1;
                    boolean z4 = this.c;
                    if (i3 == i8) {
                        iU2 = z4 ? u(0) : v(0);
                        if (iU2 != Integer.MAX_VALUE && iU2 != Integer.MIN_VALUE) {
                            boolean z5 = this.c;
                            i4 = this.d;
                            if (!z5) {
                                i4 = -i4;
                            }
                            iU2 += i4;
                        }
                    } else {
                        int i9 = i3 + 1;
                        iU2 = z4 ? v(i9) : u(i9);
                    }
                } else {
                    boolean z6 = this.c;
                    i4 = this.d;
                    if (!z6) {
                        i4 = -i4;
                    }
                    iU2 += i4;
                }
                int i10 = i2 - 1;
                int iX = x(i2, i3, iU2);
                if (z2) {
                    while (true) {
                        if (!this.c) {
                            if (iU2 - iX <= iU) {
                                break;
                            }
                            if (i10 >= 0) {
                            }
                            return true;
                        }
                        if (iU2 + iX >= iU) {
                            break;
                        }
                        if (i10 >= 0 || (!z && d(i))) {
                            return true;
                        }
                        boolean z7 = this.c;
                        int i11 = this.d;
                        iU2 += z7 ? iX + i11 : (-iX) - i11;
                        int i12 = i10 - 1;
                        int iX2 = x(i10, i3, iU2);
                        i10 = i12;
                        iX = iX2;
                    }
                } else {
                    z2 = true;
                    iU = this.c ? u(i3) : v(i3);
                }
                i2 = i10;
                i3--;
                z3 = true;
            } else {
                if (z) {
                    break;
                }
                iU = this.c ? g(true, null) : i(false, null);
                i3 = this.e - 1;
            }
        }
        return z3;
    }
}
