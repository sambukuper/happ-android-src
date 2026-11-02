package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xt2 {
    public boolean A;
    public RectF B;
    public final zt2 a;
    public Outline f;
    public float j;
    public mb6 k;
    public lf l;
    public lf m;
    public boolean n;
    public um0 o;
    public df p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public fi1 b = z39.Z;
    public z24 c = z24.X;
    public gn2 d = ti.w0;
    public final wi e = new wi(this, 5);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final wg r = new wg();

    static {
        dh3.f(Build.FINGERPRINT, "robolectric");
    }

    public xt2(zt2 zt2Var) {
        this.a = zt2Var;
        zt2Var.F(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            zt2 zt2Var = this.a;
            if (z || zt2Var.M() > 0.0f) {
                lf lfVar = this.l;
                if (lfVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = lfVar instanceof lf;
                    if (!z2) {
                        u52.k("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = lfVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            b4.u(outline, lfVar);
                        } else {
                            if (!z2) {
                                u52.k("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = lfVar;
                    if (outline != null) {
                        outline.setAlpha(zt2Var.a());
                        outline2 = outline;
                    }
                    zt2Var.h(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        zt2Var.F(false);
                        zt2Var.j();
                    } else {
                        zt2Var.F(this.A);
                    }
                } else {
                    zt2Var.F(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jR = u15.R(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jR = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jR >> 32);
                    int i5 = (int) (jR & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(zt2Var.a());
                    zt2Var.h(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                zt2Var.F(false);
                zt2Var.h(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            wg wgVar = this.r;
            xt2 xt2Var = (xt2) wgVar.b;
            if (xt2Var != null) {
                xt2Var.q--;
                xt2Var.b();
                wgVar.b = null;
            }
            t05 t05Var = (t05) wgVar.d;
            if (t05Var != null) {
                Object[] objArr = t05Var.b;
                long[] jArr = t05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    xt2 xt2Var2 = (xt2) objArr[(i << 3) + i3];
                                    xt2Var2.q--;
                                    xt2Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                t05Var.b();
            }
            this.a.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(sv1 sv1Var) {
        wg wgVar = this.r;
        wgVar.c = (xt2) wgVar.b;
        t05 t05Var = (t05) wgVar.d;
        if (t05Var != null && t05Var.h()) {
            t05 t05Var2 = (t05) wgVar.e;
            if (t05Var2 == null) {
                t05 t05Var3 = vw6.a;
                t05Var2 = new t05();
                wgVar.e = t05Var2;
            }
            t05Var2.j(t05Var);
            t05Var.b();
        }
        wgVar.a = true;
        this.d.B(sv1Var);
        wgVar.a = false;
        xt2 xt2Var = (xt2) wgVar.c;
        if (xt2Var != null) {
            xt2Var.q--;
            xt2Var.b();
        }
        t05 t05Var4 = (t05) wgVar.e;
        if (t05Var4 == null || !t05Var4.h()) {
            return;
        }
        Object[] objArr = t05Var4.b;
        long[] jArr = t05Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            xt2 xt2Var2 = (xt2) objArr[(i << 3) + i3];
                            xt2Var2.q--;
                            xt2Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        t05Var4.b();
    }

    public final mb6 d() {
        mb6 ae5Var;
        mb6 mb6Var = this.k;
        lf lfVar = this.l;
        if (mb6Var != null) {
            return mb6Var;
        }
        if (lfVar != null) {
            zd5 zd5Var = new zd5(lfVar);
            this.k = zd5Var;
            return zd5Var;
        }
        long jR = u15.R(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jR = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jR >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jR & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            ae5Var = new be5(pu.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            ae5Var = new ae5(new s86(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = ae5Var;
        return ae5Var;
    }

    public final void e(fi1 fi1Var, z24 z24Var, long j, gn2 gn2Var) {
        boolean zA = pf3.a(this.u, j);
        zt2 zt2Var = this.a;
        if (!zA) {
            this.u = j;
            long j2 = this.t;
            zt2Var.k((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = fi1Var;
        this.c = z24Var;
        this.d = gn2Var;
        zt2Var.C(fi1Var, z24Var, this, this.e);
    }

    public final void f(float f) {
        zt2 zt2Var = this.a;
        if (zt2Var.a() == f) {
            return;
        }
        zt2Var.v(f);
    }

    public final void g(long j, long j2, float f) {
        float f2 = this.v;
        long jF = z85.f(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (z85.b(this.h, jF) && ua7.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jF;
        this.i = j2;
        this.j = f;
        a();
    }
}
