package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class td {
    public final fi1 a;
    public long b = 9205357640488583168L;
    public final dy1 c;
    public final rh5 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final oh1 i;

    public td(Context context, fi1 fi1Var, long j, ig5 ig5Var) {
        this.a = fi1Var;
        dy1 dy1Var = new dy1(context, z51.U(j));
        this.c = dy1Var;
        this.d = new rh5(dn8.a, lh4.i0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        sd sdVar = new sd(this, (byte) 0);
        aq5 aq5Var = yy7.a;
        cz7 cz7Var = new cz7(null, null, sdVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new sl7(cz7Var, this, dy1Var) : new hs2(cz7Var, this, dy1Var, ig5Var);
    }

    public final void a() {
        boolean z;
        dy1 dy1Var = this.c;
        EdgeEffect edgeEffect = dy1Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = dy1Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = dy1Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = dy1Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.rn2 r21, defpackage.s51 r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.b(long, rn2, s51):java.lang.Object");
    }

    public final long c() {
        long jG = this.b;
        if ((9223372034707292159L & jG) == 9205357640488583168L) {
            jG = vj8.G(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(dn8.a);
        }
    }

    public final boolean e() {
        dy1 dy1Var = this.c;
        EdgeEffect edgeEffect = dy1Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? tc.k(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = dy1Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? tc.k(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = dy1Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? tc.k(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = dy1Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? tc.k(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fV = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fV = tc.v(edgeEffectB, fV, f);
        } else {
            edgeEffectB.onPull(fV, f);
        }
        return (i2 >= 31 ? tc.k(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fV) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = tc.v(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? tc.k(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fV = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fV = tc.v(edgeEffectD, fV, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fV, fIntBitsToFloat);
        }
        return (i2 >= 31 ? tc.k(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fV) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = tc.v(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? tc.k(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = ua7.a(this.g, 0L);
        boolean zA2 = ua7.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iO = nr4.O(Float.intBitsToFloat((int) (j >> 32)));
            long jO = (((long) nr4.O(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iO) << 32);
            dy1 dy1Var = this.c;
            dy1Var.c = jO;
            EdgeEffect edgeEffect = dy1Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jO >> 32), (int) (jO & 4294967295L));
            }
            EdgeEffect edgeEffect2 = dy1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jO >> 32), (int) (jO & 4294967295L));
            }
            EdgeEffect edgeEffect3 = dy1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jO & 4294967295L), (int) (jO >> 32));
            }
            EdgeEffect edgeEffect4 = dy1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jO & 4294967295L), (int) (jO >> 32));
            }
            EdgeEffect edgeEffect5 = dy1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jO >> 32), (int) (jO & 4294967295L));
            }
            EdgeEffect edgeEffect6 = dy1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jO >> 32), (int) (jO & 4294967295L));
            }
            EdgeEffect edgeEffect7 = dy1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jO & 4294967295L), (int) (jO >> 32));
            }
            EdgeEffect edgeEffect8 = dy1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jO), (int) (jO >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
