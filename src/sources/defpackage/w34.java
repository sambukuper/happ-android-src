package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w34 implements yr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yr4 b;
    public final /* synthetic */ b44 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yr4 e;

    public /* synthetic */ w34(yr4 yr4Var, b44 b44Var, int i, yr4 yr4Var2, byte b) {
        this.a = b;
        this.c = b44Var;
        this.d = i;
        this.e = yr4Var2;
        this.b = yr4Var;
    }

    @Override // defpackage.yr4
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    @Override // defpackage.yr4
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    @Override // defpackage.yr4
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // defpackage.yr4
    public final void d() {
        byte b = this.a;
        yr4 yr4Var = this.e;
        int i = this.d;
        b44 b44Var = this.c;
        switch (b) {
            case 0:
                b44Var.g0 = i;
                yr4Var.d();
                c15 c15Var = b44Var.o0;
                s05 s05Var = b44Var.n0;
                long[] jArr = s05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = s05Var.b[i5];
                                    up7 up7Var = (up7) s05Var.c[i5];
                                    int i6 = c15Var.i(obj);
                                    if (i6 < 0 || i6 >= b44Var.g0) {
                                        if (i6 >= 0) {
                                            Object[] objArr = c15Var.X;
                                            Object obj2 = objArr[i6];
                                            objArr[i6] = sp7.b;
                                        }
                                        if (b44Var.l0.b(obj)) {
                                            up7Var.a();
                                        }
                                        s05Var.k(i5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                b44Var.f(b44Var.f0);
                break;
            default:
                b44Var.f0 = i;
                yr4Var.d();
                if (b44Var.X.k0 == null) {
                    b44Var.f(b44Var.f0);
                }
                break;
        }
    }

    @Override // defpackage.yr4
    public final gn2 e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // defpackage.yr4
    public final rn2 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // defpackage.yr4
    public final gn2 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }
}
