package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class pl5 extends nl5 {
    public final ol5 g0;
    public Object h0;
    public boolean i0;
    public int j0;

    public pl5(ol5 ol5Var, kf8[] kf8VarArr) {
        super(ol5Var.Z, kf8VarArr);
        this.g0 = ol5Var;
        this.j0 = ol5Var.g0;
    }

    public final void f(int i, if8 if8Var, Object obj, int i2, int i3, boolean z) {
        int i4;
        kf8[] kf8VarArr = (kf8[]) this.f0;
        int i5 = i2 * 5;
        if (i5 <= 30) {
            int iE = 1 << us7.e(i, i5);
            if (!if8Var.i(iE)) {
                int iU = if8Var.u(iE);
                if8 if8VarT = if8Var.t(iU);
                kf8 kf8Var = kf8VarArr[i2];
                Object[] objArr = if8Var.d;
                int iBitCount = Integer.bitCount(if8Var.a) * 2;
                kf8Var.getClass();
                objArr.getClass();
                kf8Var.Y = objArr;
                kf8Var.Z = iBitCount;
                kf8Var.f0 = iU;
                f(i, if8VarT, obj, i2 + 1, i3, z);
                return;
            }
            int iF = if8Var.f(iE);
            if (iE == (z ? 1 << us7.e(i3, i5) : 0) && i2 < (i4 = this.Y)) {
                kf8 kf8Var2 = kf8VarArr[i4];
                Object[] objArr2 = if8Var.d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                kf8Var2.getClass();
                kf8Var2.Y = objArr3;
                kf8Var2.Z = 2;
                kf8Var2.f0 = 0;
                return;
            }
            kf8 kf8Var3 = kf8VarArr[i2];
            Object[] objArr4 = if8Var.d;
            int iBitCount2 = Integer.bitCount(if8Var.a) * 2;
            kf8Var3.getClass();
            objArr4.getClass();
            kf8Var3.Y = objArr4;
            kf8Var3.Z = iBitCount2;
            kf8Var3.f0 = iF;
            this.Y = i2;
            return;
        }
        kf8 kf8Var4 = kf8VarArr[i2];
        Object[] objArr5 = if8Var.d;
        int length = objArr5.length;
        kf8Var4.getClass();
        kf8Var4.Y = objArr5;
        kf8Var4.Z = length;
        kf8Var4.f0 = 0;
        while (true) {
            kf8 kf8Var5 = kf8VarArr[i2];
            if (dh3.f(kf8Var5.Y[kf8Var5.f0], obj)) {
                this.Y = i2;
                return;
            } else {
                kf8VarArr[i2].f0 += 2;
            }
        }
    }

    @Override // defpackage.nl5, java.util.Iterator
    public final Object next() {
        if (this.g0.g0 != this.j0) {
            bt.c();
            return null;
        }
        if (!this.Z) {
            bt.n();
            return null;
        }
        kf8 kf8Var = ((kf8[]) this.f0)[this.Y];
        this.h0 = kf8Var.Y[kf8Var.f0];
        this.i0 = true;
        return super.next();
    }

    @Override // defpackage.nl5, java.util.Iterator
    public final void remove() {
        pl5 pl5Var;
        if (!this.i0) {
            c2.g();
            return;
        }
        boolean z = this.Z;
        ol5 ol5Var = this.g0;
        if (!z) {
            pl5Var = this;
            ci8.f(ol5Var).remove(pl5Var.h0);
        } else {
            if (!z) {
                bt.n();
                return;
            }
            kf8 kf8Var = ((kf8[]) this.f0)[this.Y];
            Object obj = kf8Var.Y[kf8Var.f0];
            ci8.f(ol5Var).remove(this.h0);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            if8 if8Var = ol5Var.Z;
            Object obj2 = this.h0;
            pl5Var = this;
            pl5Var.f(iHashCode, if8Var, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        pl5Var.h0 = null;
        pl5Var.i0 = false;
        pl5Var.j0 = ol5Var.g0;
    }
}
