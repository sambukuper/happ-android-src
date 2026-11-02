package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public xr0(int i) {
        this.a = (byte) 0;
        if (!(i >= 1)) {
            bt.q("capacity must be >= 1");
            throw null;
        }
        if (!(i <= 1073741824)) {
            bt.q("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.d = i - 1;
        this.e = new Object[i];
    }

    public void a(Object obj) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = obj;
        int i2 = this.d & (i + 1);
        this.c = i2;
        if (i2 == this.b) {
            e();
        }
    }

    public void b(int i, int i2) {
        if (i < 0) {
            bt.q("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            bt.q("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.e;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public a07 c(int i) {
        return new a07(z91.G((x78) this.e, i), i, 1L);
    }

    public void d(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        j jVar = recyclerView.s0;
        if (recyclerView.r0 == null || jVar == null || !jVar.k0) {
            return;
        }
        if (z) {
            if (!recyclerView.j0.y()) {
                jVar.u(recyclerView.r0.a(), this);
            }
        } else if (!recyclerView.P()) {
            jVar.t(this.b, this.c, recyclerView.k1, this);
        }
        int i = this.d;
        if (i > jVar.l0) {
            jVar.l0 = i;
            jVar.m0 = z;
            recyclerView.h0.n();
        }
    }

    public void e() {
        Object[] objArr = (Object[]) this.e;
        int length = objArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            kp5.t("Max array capacity exceeded");
            return;
        }
        Object[] objArr2 = new Object[i3];
        eu.g0(objArr, objArr2, 0, i, length);
        eu.g0((Object[]) this.e, objArr2, i2, 0, this.b);
        this.e = objArr2;
        this.b = 0;
        this.c = length;
        this.d = i3 - 1;
    }

    public int f() {
        return this.d - this.c;
    }

    public Object g(int i) {
        if (i < 0 || i >= l()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = ((Object[]) this.e)[this.d & (this.b + i)];
        obj.getClass();
        return obj;
    }

    public int h(int i) {
        return ((wc5) this.e).n0[this.c + i];
    }

    public Object i(int i) {
        return ((wc5) this.e).p0[this.d + i];
    }

    public void j(int i) {
        if (i <= 0) {
            return;
        }
        if (i > l()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.c;
        int i3 = i < i2 ? i2 - i : 0;
        for (int i4 = i3; i4 < i2; i4++) {
            ((Object[]) this.e)[i4] = null;
        }
        int i5 = this.c;
        int i6 = i5 - i3;
        int i7 = i - i6;
        this.c = i5 - i6;
        if (i7 > 0) {
            int length = ((Object[]) this.e).length;
            this.c = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < length; i9++) {
                ((Object[]) this.e)[i9] = null;
            }
            this.c = i8;
        }
    }

    public void k(int i) {
        if (i <= 0) {
            return;
        }
        if (i > l()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = ((Object[]) this.e).length;
        int i2 = this.b;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            ((Object[]) this.e)[i2] = null;
            i2++;
        }
        int i3 = this.b;
        int i4 = length - i3;
        int i5 = i - i4;
        this.b = this.d & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                ((Object[]) this.e)[i6] = null;
            }
            this.b = i5;
        }
    }

    public int l() {
        return this.d & (this.c - this.b);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return _UrlKt.FRAGMENT_ENCODE_SET;
            case 4:
                int i = this.b;
                x78 x78Var = (x78) this.e;
                lf6 lf6VarG = z91.G(x78Var, i);
                int i2 = this.c;
                lf6 lf6VarG2 = z91.G(x78Var, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(lf6VarG);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(lf6VarG2);
                sb.append("), prevOffset=");
                return oi0.n(sb, i3, ")");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xr0(byte b) {
        this.a = b;
    }

    public xr0(wc5 wc5Var) {
        this.a = (byte) 3;
        this.e = wc5Var;
    }

    public xr0(int i, int i2, int i3, x78 x78Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = x78Var;
    }
}
