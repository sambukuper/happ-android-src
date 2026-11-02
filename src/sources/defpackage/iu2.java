package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iu2 {
    public q02 b;
    public boolean c;
    public int d;
    public int e;
    public cb0[] h;
    public final Object[] a = new Object[1];
    public int f = -1;
    public int g = -1;
    public int i = -1;

    public final boolean a() {
        return b(this.c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public boolean b(int i, boolean z) {
        int iMin;
        int iL;
        if (this.b.G() == 0 || (!z && c(i))) {
            return false;
        }
        int i2 = this.g;
        if (i2 >= 0) {
            iMin = i2 + 1;
        } else {
            int i3 = this.i;
            iMin = i3 != -1 ? Math.min(i3, this.b.G() - 1) : 0;
        }
        int i4 = iMin;
        boolean z2 = false;
        while (i4 < this.b.G()) {
            q02 q02Var = this.b;
            Object[] objArr = this.a;
            int iB = q02Var.B(i4, true, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iL = this.c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f = i4;
                this.g = i4;
            } else {
                boolean z3 = this.c;
                q02 q02Var2 = this.b;
                if (z3) {
                    int i5 = i4 - 1;
                    iL = (q02Var2.H(i5) - this.b.L(i5)) - this.d;
                } else {
                    int i6 = i4 - 1;
                    iL = this.d + this.b.L(i6) + q02Var2.H(i6);
                }
                this.g = i4;
            }
            this.b.A(objArr[0], i4, iB, 0, iL);
            if (z || c(i)) {
                return true;
            }
            i4++;
            z2 = true;
        }
        return z2;
    }

    public final boolean c(int i) {
        return this.g >= 0 && (!this.c ? g(false, null) < i - this.d : i(true, null) > i + this.d);
    }

    public final boolean d(int i) {
        return this.g >= 0 && (!this.c ? i(true, null) > i + this.d : g(false, null) < i - this.d);
    }

    public int f(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        boolean z2 = this.c;
        q02 q02Var = this.b;
        if (z2) {
            return q02Var.H(i);
        }
        return this.b.L(i) + q02Var.H(i);
    }

    public final int g(boolean z, int[] iArr) {
        return f(z, this.c ? this.f : this.g, iArr);
    }

    public int h(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        boolean z2 = this.c;
        q02 q02Var = this.b;
        return z2 ? q02Var.H(i) - this.b.L(i) : q02Var.H(i);
    }

    public final int i(boolean z, int[] iArr) {
        return h(z, this.c ? this.g : this.f, iArr);
    }

    public cb0[] j(int i, int i2) {
        cb0 cb0Var = this.h[0];
        cb0Var.Y = 0;
        cb0Var.b(i);
        this.h[0].b(i2);
        return this.h;
    }

    public abstract r75 k(int i);

    public void l(int i) {
        int i2;
        if (i >= 0 && (i2 = this.g) >= 0) {
            if (i2 >= i) {
                i2 = i - 1;
                this.g = i2;
            }
            int i3 = this.f;
            if (i2 < i3) {
                i3 = -1;
                this.g = -1;
                this.f = -1;
            }
            if (i3 < 0) {
                this.i = i;
            }
        }
    }

    public abstract boolean m(int i, boolean z);

    public final void n(int i) {
        if (i <= 0) {
            kp5.e();
            return;
        }
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.h = new cb0[i];
        for (int i2 = 0; i2 < this.e; i2++) {
            cb0[] cb0VarArr = this.h;
            cb0 cb0Var = new cb0((byte) 1);
            int iHighestOneBit = 8;
            if (Integer.bitCount(8) != 1) {
                iHighestOneBit = Integer.highestOneBit(7) << 1;
            }
            cb0Var.Z = iHighestOneBit - 1;
            cb0Var.f0 = new int[iHighestOneBit];
            cb0VarArr[i2] = cb0Var;
        }
    }

    public void e(int i, int i2, xr0 xr0Var) {
    }
}
