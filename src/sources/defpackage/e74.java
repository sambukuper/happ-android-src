package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e74 implements yr4 {
    public final f74 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final yr4 e;
    public final float f;
    public final boolean g;
    public final b71 h;
    public final fi1 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final sd5 p;
    public final int q;
    public final int r;

    public e74(f74 f74Var, int i, boolean z, float f, yr4 yr4Var, float f2, boolean z2, b71 b71Var, fi1 fi1Var, long j, int i2, List list, int i3, int i4, int i5, sd5 sd5Var, int i6, int i7) {
        this.a = f74Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = yr4Var;
        this.f = f2;
        this.g = z2;
        this.h = b71Var;
        this.i = fi1Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = sd5Var;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.yr4
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.yr4
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.yr4
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.yr4
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.yr4
    public final gn2 e() {
        return this.e.e();
    }

    @Override // defpackage.yr4
    public final rn2 f() {
        return this.e.f();
    }

    @Override // defpackage.yr4
    public final gn2 g() {
        return this.e.g();
    }

    public final e74 h(int i, boolean z) {
        f74 f74Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (f74Var = this.a) == null) {
            return null;
        }
        int iA = f74Var.a();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= iA) {
            return null;
        }
        f74 f74Var2 = (f74) wv0.r0(list);
        f74 f74Var3 = (f74) wv0.A0(list);
        if (f74Var2.r || f74Var3.r) {
            return null;
        }
        int i3 = f74Var2.m;
        int i4 = this.n;
        int i5 = this.m;
        if (i < 0) {
            if (Math.min((f74Var2.a() + i3) - i5, (f74Var3.a() + f74Var3.m) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - f74Var3.m) <= i) {
            return null;
        }
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            f74 f74Var4 = (f74) list.get(i6);
            f74Var4.getClass();
            int[] iArr = f74Var4.v;
            if (!f74Var4.r) {
                f74Var4.m += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = f74Var4.b.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        b64 b64Var = (b64) f74Var4.k.a.g(f74Var4.i);
                        z54 z54Var = b64Var != null ? b64Var.a[i8] : null;
                        if (z54Var != null) {
                            long j = z54Var.l;
                            z54Var.l = (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
                        }
                        i8++;
                        size = size;
                    }
                }
            }
            i6++;
            size = size;
        }
        return new e74(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long i() {
        yr4 yr4Var = this.e;
        return (((long) yr4Var.b()) << 32) | (((long) yr4Var.a()) & 4294967295L);
    }
}
