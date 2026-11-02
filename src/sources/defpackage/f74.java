package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f74 {
    public final int a;
    public final List b;
    public final p8 c;
    public final z24 d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final d64 k;
    public final long l;
    public int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public boolean r;
    public int s = Integer.MIN_VALUE;
    public int t;
    public int u;
    public final int[] v;

    public f74(int i, List list, p8 p8Var, z24 z24Var, int i2, int i3, int i4, long j, Object obj, Object obj2, d64 d64Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = p8Var;
        this.d = z24Var;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = d64Var;
        this.l = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            eo5 eo5Var = (eo5) list.get(i6);
            i5 += eo5Var.Y;
            iMax = Math.max(iMax, eo5Var.X);
        }
        this.n = i5;
        this.q = iMax;
        this.v = new int[this.b.size() * 2];
        this.p = this.g;
        this.o = i5;
    }

    public final int a() {
        int i = this.o + this.p;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            return ((long) this.m) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.v;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(do5 do5Var, boolean z) {
        if (this.s == Integer.MIN_VALUE) {
            zc3.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eo5 eo5Var = (eo5) list.get(i);
            int i2 = this.t - eo5Var.Y;
            int i3 = this.u;
            long jB = b(i);
            b64 b64Var = (b64) this.k.a.g(this.i);
            xt2 xt2Var = null;
            Object[] objArr = 0;
            z54 z54Var = b64Var != null ? b64Var.a[i] : null;
            if (z54Var != null) {
                if (z) {
                    z54Var.n = jB;
                } else {
                    if (!hf3.a(z54Var.n, 9223372034707292159L)) {
                        jB = z54Var.n;
                    }
                    long jC = hf3.c(jB, ((hf3) z54Var.r.getValue()).a);
                    int i4 = (int) (jB & 4294967295L);
                    if (((i4 <= i2 && ((int) (jC & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jC & 4294967295L)) >= i3)) && ((Boolean) z54Var.h.getValue()).booleanValue()) {
                        w51.G(z54Var.a, null, null, new w54(z54Var, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    jB = jC;
                }
                xt2Var = z54Var.o;
            }
            long jC2 = hf3.c(jB, this.h);
            if (!z && z54Var != null) {
                z54Var.m = jC2;
            }
            if (xt2Var != null) {
                do5Var.d(eo5Var);
                eo5Var.T(hf3.c(jC2, eo5Var.g0), 0.0f, xt2Var);
            } else {
                dx4 dx4Var = fo5.a;
                do5Var.d(eo5Var);
                eo5Var.S(hf3.c(jC2, eo5Var.g0), 0.0f, dx4Var);
            }
        }
    }

    public final void d(int i, int i2, int i3) {
        this.m = i;
        this.s = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            eo5 eo5Var = (eo5) list.get(i4);
            int i5 = i4 * 2;
            p8 p8Var = this.c;
            if (p8Var == null) {
                throw ie2.d("null horizontalAlignment when isVertical == true");
            }
            int iA = p8Var.a(eo5Var.X, i2, this.d);
            int[] iArr = this.v;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += eo5Var.Y;
        }
        this.t = -this.e;
        this.u = this.s + this.f;
    }
}
