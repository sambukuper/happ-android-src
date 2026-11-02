package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import coil3.compose.AsyncImagePainter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class eu7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(fu7 fu7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-1842311023);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(fu7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 256 : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ox1 ox1Var = pc.b;
            Context context = (Context) lp2Var.j(ox1Var);
            int iS = (int) os4.S(320.0f, lp2Var);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
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
            FillElement fillElement = b.a;
            kx4 kx4VarU = ch3.u(fillElement);
            kx4 kx4VarZ = os4.z(fillElement, 16.0f, 0.0f, 2);
            hx4 hx4Var = hx4.X;
            kx4 kx4VarB = b.b(hx4Var, 16.0f);
            bs7.a(fu7Var, gn2Var, kx4VarU, lp2Var, (i2 & 112) | (i2 & 14) | 384);
            ch3.f(lp2Var, kx4VarB);
            String strJ0 = vj8.j0(y46.sub_properties_migration_info_title, lp2Var);
            ox1 ox1Var2 = es.a;
            o88 o88Var = ((ds) lp2Var.j(ox1Var2)).a.c;
            ox1 ox1Var3 = ep.z;
            zc1.g(strJ0, kx4VarZ, o88.a(o88Var, ((dp) lp2Var.j(ox1Var3)).c.c, 0L, dj2.i0, (gi2) null, 0L, 0L, (aa4) null, 16777210), 3, 0, 0, 0, false, (gn2) null, lp2Var, 48, 496);
            ch3.f(lp2Var, b.b(hx4Var, 12.0f));
            zc1.g(vj8.j0(y46.sub_properties_migration_info_description, lp2Var), kx4VarZ, o88.a(((ds) lp2Var.j(ox1Var2)).b, ((dp) lp2Var.j(ox1Var3)).c.c, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 3, 0, 0, 0, false, (gn2) null, lp2Var, 48, 496);
            ch3.f(lp2Var, b.b(hx4Var, 32.0f));
            String strJ1 = vj8.j0(y46.sub_properties_migration_info_title, lp2Var);
            s63 s63Var = new s63(context);
            s63Var.j = pw6.Y;
            wo1.a(iS);
            wo1 wo1Var = new wo1(iS);
            wo1.a(iS);
            s63Var.i = new c86(new ta7(wo1Var, new wo1(iS)));
            s63Var.c = Integer.valueOf(w46.sub_settings_migration);
            km4.a(new fv((xu) lp2Var.j(zc4.a), s63Var.a(), pa7.a((Context) lp2Var.j(ox1Var))), strJ1, os4.z(fillElement, 16.0f, 0.0f, 2), AsyncImagePainter.v0, pz2.i0, y41.a, lp2Var, 384, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new as7(fu7Var, gn2Var, kx4Var, i, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(mu7 mu7Var, kx4 kx4Var, lp2 lp2Var, int i) {
        mu7Var.getClass();
        lp2Var.X(-1480577837);
        z24 z24Var = (z24) lp2Var.j(y01.n);
        y05 y05VarO = i21.o(mu7Var.c, lp2Var);
        boolean zH = lp2Var.h(mu7Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (zH || objK == beVar) {
            al5 al5Var = new al5(1, mu7Var, mu7.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsUiIntent;)V", 0, (byte) 20);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        pv3 pv3Var = (pv3) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new oh2();
            lp2Var.g0(objK2);
        }
        oh2 oh2Var = (oh2) objK2;
        sx2.b(kx4Var, jm4.U(-1582399530, new oh4(oh2Var, (byte) 1), lp2Var), (rn2) null, (rn2) null, 0, 0L, (v09) null, jm4.U(-1498342163, new h64(z24Var, oh2Var, y05VarO, pv3Var, (byte) 8), lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new d67((byte) 3, i, mu7Var, kx4Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(long j) {
        w88[] w88VarArr = v88.b;
        if ((j & 1095216660480L) == 0) {
            yc3.a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(long j, long j2) {
        w88[] w88VarArr = v88.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            yc3.a("Cannot perform operation for Unspecified type.");
        }
        if (w88.a(v88.b(j), v88.b(j2))) {
            return;
        }
        yc3.a("Cannot perform operation for " + w88.b(v88.b(j)) + " and " + w88.b(v88.b(j2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final u1 e(pw3 pw3Var, pw3 pw3Var2, boolean z) {
        r66 r66VarS;
        pw3Var.getClass();
        pw3Var2.getClass();
        if (!q08.a) {
            u1 u1Var = (u1) pw3Var;
            u1 u1Var2 = (u1) pw3Var2;
            return u1Var.equals(u1Var2) ? u1Var : new ae2(u1Var, u1Var2, z, (dn2) null);
        }
        aa7 aa7Var = ((kk1) pw3Var).Y;
        aa7Var.getClass();
        aa7 aa7Var2 = aa7Var;
        aa7 aa7Var3 = ((kk1) pw3Var2).Y;
        aa7Var3.getClass();
        aa7 aa7Var4 = aa7Var3;
        if (z) {
            r66VarS = new r66(aa7Var2, aa7Var4);
            v14.a.b(aa7Var2, aa7Var4);
        } else {
            r66VarS = dh3.s(aa7Var2, aa7Var4);
        }
        return new kk1(r66VarS, (dn2) null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(double d) {
        return i((float) d, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(int i) {
        return i(i, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long i(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        w88[] w88VarArr = v88.b;
        return jFloatToRawIntBits;
    }

    public abstract boolean h();

    public abstract void k(boolean z);

    public void j(boolean z) {
    }
}
