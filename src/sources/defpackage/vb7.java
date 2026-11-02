package defpackage;

import androidx.compose.foundation.layout.b;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb7 {
    public static final float a = u15.u;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final iv8 f;

    static {
        float f2 = u15.s;
        b = f2;
        float f3 = u15.q;
        c = hi5.G(f2, f3);
        hi5.G(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new iv8(sb7.X);
    }

    public static final void a(final float f2, final gn2 gn2Var, final kx4 kx4Var, final jb7 jb7Var, final xz4 xz4Var, final int i, final zy0 zy0Var, sn2 sn2Var, final uu0 uu0Var, lp2 lp2Var, final int i2, final int i3) {
        int i4;
        final sn2 sn2Var2;
        sn2 sn2VarU;
        lp2Var.X(985901935);
        byte b2 = 2;
        boolean z = true;
        int i5 = i2 | (lp2Var.c(f2) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16) | (lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(true) ? 2048 : 1024) | (lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(jb7Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.f(xz4Var) ? 1048576 : 524288) | (lp2Var.d(i) ? 8388608 : 4194304) | 805306368;
        if ((i3 & 6) == 0) {
            i4 = i3 | (lp2Var.f(uu0Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (lp2Var.N(i5 & 1, ((306783379 & i5) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                sn2VarU = jm4.U(-294493388, new mg1(jb7Var, b2), lp2Var);
            } else {
                lp2Var.Q();
                sn2VarU = sn2Var;
            }
            lp2Var.q();
            boolean z2 = (29360128 & i5) == 8388608;
            if ((((i4 & 14) ^ 6) <= 4 || !lp2Var.f(uu0Var)) && (i4 & 6) != 4) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK = lp2Var.K();
            if (z3 || objK == zz0.a) {
                objK = new wb7(f2, i, uu0Var);
                lp2Var.g0(objK);
            }
            wb7 wb7Var = (wb7) objK;
            wb7Var.getClass();
            wb7Var.f0 = gn2Var;
            wb7Var.c(f2);
            b(wb7Var, kx4Var, null, xz4Var, zy0Var, sn2VarU, lp2Var, ((i5 >> 6) & 57344) | ((i5 >> 3) & 1008) | 1769472);
            sn2Var2 = sn2VarU;
        } else {
            lp2Var.Q();
            sn2Var2 = sn2Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(f2, gn2Var, kx4Var, jb7Var, xz4Var, i, zy0Var, sn2Var2, uu0Var, i2, i3) { // from class: qb7
                public final /* synthetic */ float X;
                public final /* synthetic */ gn2 Y;
                public final /* synthetic */ kx4 Z;
                public final /* synthetic */ jb7 f0;
                public final /* synthetic */ xz4 g0;
                public final /* synthetic */ byte h0;
                public final /* synthetic */ zy0 i0;
                public final /* synthetic */ sn2 j0;
                public final /* synthetic */ uu0 k0;
                public final /* synthetic */ int l0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.l0 = i3;
                }

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vb7.a(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, (lp2) obj, w79.P(100663297), w79.P(this.l0));
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(wb7 wb7Var, kx4 kx4Var, jb7 jb7Var, xz4 xz4Var, zy0 zy0Var, sn2 sn2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(409861960);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(wb7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.g(true) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(xz4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= lp2Var.h(sn2Var) ? 1048576 : 524288;
        }
        if (lp2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                pb7 pb7Var = pb7.a;
                jb7Var = pb7.e((iw0) lp2Var.j(kw0.a));
            } else {
                lp2Var.Q();
            }
            int i3 = i2 & (-7169);
            lp2Var.q();
            if (wb7Var.X < 0) {
                bt.q("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                c(kx4Var, wb7Var, xz4Var, zy0Var, sn2Var, lp2Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            }
        } else {
            lp2Var.Q();
        }
        jb7 jb7Var2 = jb7Var;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wu(wb7Var, kx4Var, jb7Var2, xz4Var, zy0Var, sn2Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(kx4 kx4Var, wb7 wb7Var, xz4 xz4Var, zy0 zy0Var, sn2 sn2Var, lp2 lp2Var, int i) {
        int i2;
        wb7 wb7Var2;
        xz4 xz4Var2;
        boolean z;
        sn2 sn2Var2 = sn2Var;
        uu0 uu0Var = wb7Var.Y;
        lp2Var.X(898172835);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(wb7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.g(true) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(xz4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(zy0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.h(sn2Var2) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        int i3 = i2;
        if (lp2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = lp2Var.j(y01.n) == z24.Y;
            wb7Var.k0 = z2;
            nh5 nh5Var = wb7Var.Z;
            boolean z3 = z2;
            sd5 sd5Var = wb7Var.n0;
            boolean z4 = sd5Var == sd5.Y && z3;
            sd sdVar = new sd(wb7Var, b2);
            aq5 aq5Var = yy7.a;
            vy7 vy7Var = new vy7(wb7Var, xz4Var, sdVar, 4);
            boolean zBooleanValue = ((Boolean) wb7Var.o0.getValue()).booleanValue();
            boolean zH = lp2Var.h(wb7Var);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zH || objK == beVar) {
                objK = new ar2(wb7Var, null, (byte) 2);
                lp2Var.g0(objK);
            }
            hx4 hx4Var = hx4.X;
            byte b3 = 1;
            kx4 kx4VarA = jv1.a(hx4Var, wb7Var, sd5Var, true, xz4Var, zBooleanValue, (sn2) objK, z4, 32);
            xz4Var2 = xz4Var;
            boolean z5 = z4;
            wb7Var2 = wb7Var;
            kb7 kb7Var = kb7.X;
            sd5 sd5Var2 = sd5.X;
            kx4 kx4VarM = sd5Var == sd5Var2 ? b.m(x97.O(hx4Var, kb7Var)) : b.o(x97.O(hx4Var, kb7Var));
            t03 t03Var = yf3.a;
            kx4 kx4VarY = kx4Var.y(xv4.X);
            float f2 = b;
            float f3 = a;
            kx4 kx4VarY2 = v07.a(b.f(kx4VarY, sd5Var == sd5Var2 ? f3 : f2, sd5Var == sd5Var2 ? f2 : f3, 0.0f, 0.0f, 12), false, new rb7(wb7Var2, b3)).y(sd5Var == sd5Var2 ? m4.b : m4.a);
            final float fL = nh5Var.l();
            final uu0 uu0Var2 = new uu0(uu0Var.X, uu0Var.Y);
            final byte b4 = wb7Var2.X;
            kx4 kx4VarV = ch3.v(v07.a(kx4VarY2, true, new gn2() { // from class: yw5
                @Override // defpackage.gn2
                public final Object B(Object obj) {
                    Float fValueOf = Float.valueOf(fL);
                    uu0 uu0Var3 = uu0Var2;
                    qw5 qw5Var = new qw5(((Number) x97.r(fValueOf, uu0Var3)).floatValue(), b4, uu0Var3);
                    nw3[] nw3VarArr = d17.a;
                    e17 e17Var = c17.c;
                    nw3 nw3Var = d17.a[1];
                    e17Var.getClass();
                    ((f17) obj).a(e17Var, qw5Var);
                    return dn8.a;
                }
            }), true, xz4Var2);
            byte b5 = wb7Var2.X;
            float fL2 = nh5Var.l();
            kx4 kx4Var2 = kx4VarM;
            gn2 gn2Var = wb7Var2.f0;
            if (b5 < 0) {
                bt.q("steps should be >= 0");
                return;
            }
            kx4 kx4VarY3 = mb6.S(kx4VarV, new ub7(gn2Var, uu0Var, b5, z5, fL2)).y(vy7Var).y(kx4VarA);
            boolean zH2 = lp2Var.h(wb7Var2);
            Object objK2 = lp2Var.K();
            if (zH2 || objK2 == beVar) {
                objK2 = new cb4(wb7Var2, (byte) 1);
                lp2Var.g0(objK2);
            }
            xr4 xr4Var = (xr4) objK2;
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY3);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, xr4Var);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var3);
            }
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            boolean zH3 = lp2Var.h(wb7Var2);
            Object objK3 = lp2Var.K();
            if (zH3 || objK3 == beVar) {
                z = false;
                objK3 = new rb7(wb7Var2, 0 == true ? 1 : 0);
                lp2Var.g0(objK3);
            } else {
                z = false;
            }
            kx4 kx4VarL = gv3.L(kx4Var2, (gn2) objK3);
            p50 p50Var = pz2.Z;
            xr4 xr4VarC = g80.c(p50Var, z);
            int I2 = km4.I(lp2Var);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarL);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I2))) {
                p61.v(I2, lp2Var, I2, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            int i4 = (i3 >> 3) & 14;
            zy0Var.x(wb7Var2, lp2Var, Integer.valueOf(((i3 >> 9) & 112) | i4));
            lp2Var.p(true);
            kx4 kx4VarO = x97.O(hx4Var, kb7.Y);
            xr4 xr4VarC2 = g80.c(p50Var, false);
            int I3 = km4.I(lp2Var);
            kl5 kl5VarL3 = lp2Var.l();
            kx4 kx4VarQ3 = w45.Q(lp2Var, kx4VarO);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC2);
            pn7.m(dx0Var2, lp2Var, kl5VarL3);
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I3))) {
                p61.v(I3, lp2Var, I3, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var, kx4VarQ3);
            sn2Var2 = sn2Var;
            sn2Var2.x(wb7Var2, lp2Var, Integer.valueOf(i4 | ((i3 >> 12) & 112)));
            lp2Var.p(true);
            lp2Var.p(true);
        } else {
            wb7Var2 = wb7Var;
            xz4Var2 = xz4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new kr4(kx4Var, wb7Var2, xz4Var2, zy0Var, sn2Var2, i);
        }
    }

    public static final float d(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(w51.H(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(w51.H(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? w51.H(f3, f4, fValueOf.floatValue()) : f2;
    }
}
