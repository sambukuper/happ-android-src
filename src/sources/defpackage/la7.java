package defpackage;

import androidx.leanback.widget.GridLayoutManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class la7 extends iu2 {
    public final r75 j = new r75((byte) 5, 0);

    public la7() {
        n(1);
    }

    @Override // defpackage.iu2
    public final void e(int i, int i2, xr0 xr0Var) {
        int iO;
        int i3;
        if (!this.c ? i2 < 0 : i2 > 0) {
            if (this.g == this.b.G() - 1) {
                return;
            }
            int i4 = this.g;
            if (i4 >= 0) {
                iO = i4 + 1;
            } else {
                int i5 = this.i;
                iO = i5 != -1 ? Math.min(i5, this.b.G() - 1) : 0;
            }
            int iL = this.b.L(this.g) + this.d;
            int iH = this.b.H(this.g);
            if (this.c) {
                iL = -iL;
            }
            i3 = iL + iH;
        } else {
            if (this.f == 0) {
                return;
            }
            iO = o();
            int iH2 = this.b.H(this.f);
            boolean z = this.c;
            int i6 = this.d;
            if (!z) {
                i6 = -i6;
            }
            i3 = iH2 + i6;
        }
        xr0Var.b(iO, Math.abs(i3 - i));
    }

    @Override // defpackage.iu2
    public final r75 k(int i) {
        return this.j;
    }

    @Override // defpackage.iu2
    public final boolean m(int i, boolean z) {
        int iH;
        if (this.b.G() == 0 || (!z && d(i))) {
            return false;
        }
        int i2 = ((GridLayoutManager) this.b.Y).y0;
        boolean z2 = false;
        for (int iO = o(); iO >= i2; iO--) {
            q02 q02Var = this.b;
            Object[] objArr = this.a;
            int iB = q02Var.B(iO, false, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iH = this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f = iO;
                this.g = iO;
            } else {
                boolean z3 = this.c;
                q02 q02Var2 = this.b;
                iH = z3 ? q02Var2.H(iO + 1) + this.d + iB : (q02Var2.H(iO + 1) - this.d) - iB;
                this.f = iO;
            }
            this.b.A(objArr[0], iO, iB, 0, iH);
            z2 = true;
            if (z || d(i)) {
                break;
            }
        }
        return z2;
    }

    public final int o() {
        int i = this.f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.i;
        q02 q02Var = this.b;
        return i2 != -1 ? Math.min(i2, q02Var.G() - 1) : q02Var.G() - 1;
    }
}
