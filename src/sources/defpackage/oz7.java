package defpackage;

import androidx.compose.foundation.layout.b;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oz7 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final cd7 f;

    static {
        float f2 = vj8.o0;
        a = f2;
        b = vj8.v0;
        c = vj8.u0;
        float f3 = vj8.r0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new cd7();
    }

    public static final void a(boolean z, gn2 gn2Var, kx4 kx4Var, boolean z2, lz7 lz7Var, lp2 lp2Var, int i) {
        int i2;
        lz7 lz7Var2;
        kx4 kx4VarT0;
        lp2Var.X(-263339167);
        if ((i & 6) == 0) {
            i2 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= lp2Var.g(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            lz7Var2 = lz7Var;
            i3 |= lp2Var.f(lz7Var2) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        } else {
            lz7Var2 = lz7Var;
        }
        int i4 = i3 | 1572864;
        if (lp2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            lp2Var.W(1768604058);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new xz4();
                lp2Var.g0(objK);
            }
            xz4 xz4Var = (xz4) objK;
            lp2Var.p(false);
            if (gn2Var != null) {
                t03 t03Var = yf3.a;
                kx4VarT0 = u70.t0(z, xz4Var, z2, new kl6(2), gn2Var);
            } else {
                kx4VarT0 = hx4.X;
            }
            int i5 = i4 << 3;
            int i6 = i4 >> 6;
            b(b.e(b.n(kx4Var.y(kx4VarT0)), c, d), z, z2, lz7Var2, xz4Var, q77.b(vj8.m0, lp2Var), lp2Var, (i6 & 7168) | (i5 & 112) | (i6 & 896) | (i5 & 57344));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new k66(z, gn2Var, kx4Var, z2, lz7Var, i, (byte) 1);
        }
    }

    public static final void b(final kx4 kx4Var, final boolean z, final boolean z2, final lz7 lz7Var, final xz4 xz4Var, final x67 x67Var, lp2 lp2Var, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        lp2Var.X(-670917213);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.g(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(lz7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.f(xz4Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= lp2Var.f(x67Var) ? 1048576 : 524288;
        }
        if (lp2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? lz7Var.b : lz7Var.f;
            } else {
                j = z ? lz7Var.j : lz7Var.n;
            }
            if (z2) {
                j2 = z ? lz7Var.a : lz7Var.e;
            } else {
                j2 = z ? lz7Var.i : lz7Var.m;
            }
            x67 x67VarB = q77.b(vj8.t0, lp2Var);
            float f2 = vj8.s0;
            if (z2) {
                j3 = j2;
                j4 = z ? lz7Var.c : lz7Var.g;
            } else {
                j3 = j2;
                j4 = z ? lz7Var.k : lz7Var.o;
            }
            kx4 kx4VarF = u15.f(kx4Var.y(new c70(f2, new fe7(j4), x67VarB)), j, x67VarB);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarF);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, xr4VarC);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var3);
            }
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            kx4 kx4VarF2 = u15.f(qb3.a(l80.a(hx4.X, pz2.h0).y(new y98(xz4Var, z, w39.q0(ly4.Y, lp2Var))), xz4Var, hl6.a(vj8.q0 / 2.0f, 4, 0L, false)), j3, x67Var);
            xr4 xr4VarC2 = g80.c(pz2.i0, false);
            int I2 = km4.I(lp2Var);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarF2);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, xr4VarC2);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I2))) {
                p61.v(I2, lp2Var, I2, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            lp2Var.W(1236071411);
            lp2Var.p(false);
            lp2Var.p(true);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: nz7
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oz7.b(kx4Var, z, z2, lz7Var, xz4Var, x67Var, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }
}
