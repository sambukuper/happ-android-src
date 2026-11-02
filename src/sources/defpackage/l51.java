package defpackage;

import androidx.compose.foundation.layout.b;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l51 {
    public static final h51 a;

    static {
        ox1 ox1Var = bg.a;
        long j = dw0.c;
        long j2 = dw0.b;
        a = new h51(j, j2, j2, dw0.b(0.38f, j2), dw0.b(0.38f, j2));
    }

    public static final void a(h51 h51Var, kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-527864079);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(h51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            o50 o50Var = j51.a;
            kx4 kx4VarV = dh3.V(os4.z(hi5.C0(u15.f(mb6.a0(kx4Var, 3.0f, km6.a(4.0f)), h51Var.a, u70.e)), 0.0f, j51.d, 1), dh3.G(lp2Var));
            int i3 = (i2 << 3) & 7168;
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarV);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            zy0Var.x(uw0.a, lp2Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) h51Var, (Object) kx4Var, (Object) zy0Var, i, (byte) 5);
        }
    }

    public static final void b(kx4 kx4Var, h51 h51Var, final gn2 gn2Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        lp2Var.X(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (lp2Var.f(h51Var) ? 32 : 16);
        }
        int i7 = i4 | (lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        byte b = 1;
        if (lp2Var.N(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                kx4Var = hx4.X;
            }
            if (i6 != 0) {
                h51Var = a;
            }
            a(h51Var, kx4Var, jm4.U(-250345048, new o90(gn2Var, h51Var, b), lp2Var), lp2Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            lp2Var.Q();
        }
        final kx4 kx4Var2 = kx4Var;
        final h51 h51Var2 = h51Var;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(h51Var2, gn2Var, i, i2) { // from class: k51
                public final /* synthetic */ h51 Y;
                public final /* synthetic */ gn2 Z;
                public final /* synthetic */ byte f0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f0 = i2;
                }

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    l51.b(this.X, this.Y, this.Z, (lp2) obj, iP, this.f0);
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, h51 h51Var, kx4 kx4Var, sn2 sn2Var, dn2 dn2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-2001167027);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(h51Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(sn2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.h(dn2Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        byte b = 1;
        if (lp2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            o50 o50Var = j51.a;
            float f = j51.c;
            ft ftVar = new ft(f, new bt());
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objK = lp2Var.K();
            if (z2 || objK == zz0.a) {
                objK = new q30(z, dn2Var, b);
                lp2Var.g0(objK);
            }
            kx4 kx4VarZ = os4.z(b.i(x97.k(kx4Var, z, str, (dn2) objK).y(b.a), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            wq6 wq6VarA = vq6.a(ftVar, o50Var, lp2Var, 54);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarZ);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, wq6VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var, numValueOf);
            pn7.l(lp2Var);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            if (sn2Var == null) {
                lp2Var.W(-1597947094);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1597947093);
                float f2 = j51.e;
                kx4 kx4VarF = b.f(hx4.X, f2, 0.0f, f2, f2, 2);
                xr4 xr4VarC = g80.c(pz2.Z, false);
                int iHashCode2 = Long.hashCode(lp2Var.T);
                kl5 kl5VarL2 = lp2Var.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarF);
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(dx0Var, lp2Var, xr4VarC);
                pn7.m(dx0Var2, lp2Var, kl5VarL2);
                oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
                pn7.m(dx0Var4, lp2Var, kx4VarQ2);
                sn2Var.x(new dw0(z ? h51Var.c : h51Var.e), lp2Var, 0);
                lp2Var.p(true);
                lp2Var.p(false);
            }
            long j = z ? h51Var.b : h51Var.d;
            wl7.b(str, new d44(1.0f, true), new o88(j, j51.h, j51.i, null, j51.k, j51.b, 0, j51.j, 16613240), null, 0, false, 1, 0, null, lp2Var, (i2 & 14) | 1572864, 952);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j40(str, z, h51Var, kx4Var, sn2Var, dn2Var, i);
        }
    }
}
