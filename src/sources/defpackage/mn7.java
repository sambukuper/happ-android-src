package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mn7 {
    public static final void a(qn7 qn7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        qn7Var.getClass();
        gn2Var.getClass();
        lp2Var.X(662307326);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(qn7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ci8.a(kx4Var, vj8.j0(y46.sub_routing_general_title, lp2Var), jm4.U(-1979266062, new p90(qn7Var, b.a, gn2Var, (byte) 8), lp2Var), lp2Var, ((i2 >> 6) & 14) | 384, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) qn7Var, (Object) gn2Var, (Object) kx4Var, i, (byte) 16);
        }
    }

    public static final void b(zo8 zo8Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2 lp2Var2 = lp2Var;
        zo8Var.getClass();
        String str = zo8Var.h0;
        lp2Var2.X(-183131769);
        int i2 = i | (lp2Var2.f(zo8Var) ? 4 : 2) | (lp2Var2.f(kx4Var) ? 32 : 16);
        if (lp2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            tw0 tw0VarA = rw0.a(new ft(4.0f, new bt()), pz2.q0, lp2Var2, 6);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, tw0VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            FillElement fillElement = b.a;
            String strJ0 = vj8.j0(y46.app_update_info_title, lp2Var2);
            ox1 ox1Var = es.a;
            o88 o88Var = ((ds) lp2Var2.j(ox1Var)).b;
            dj2 dj2Var = dj2.f0;
            ox1 ox1Var2 = ep.z;
            zc1.g(strJ0, fillElement, o88.a(o88Var, ((dp) lp2Var2.j(ox1Var2)).c.a, 0L, dj2Var, null, 0L, 0L, null, 16777210), 0, 0, 0, 0, false, null, lp2Var, 48, 504);
            lp2Var2 = lp2Var;
            ol olVar = new ol();
            olVar.b(vj8.j0(y46.app_update_info_version, lp2Var2));
            olVar.b(" ");
            int iD = olVar.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
            try {
                olVar.b(zo8Var.Y);
                olVar.c(iD);
                zc1.f(olVar.e(), fillElement, o88.a(((ds) lp2Var2.j(ox1Var)).d, ((dp) lp2Var2.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, lp2Var2, 48, 248);
                if (str != null) {
                    lp2Var2.W(1594513161);
                    ol olVar2 = new ol();
                    olVar2.b(vj8.j0(y46.app_update_info_size, lp2Var2));
                    olVar2.b(" ");
                    int iD2 = olVar2.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
                    try {
                        olVar2.b(str);
                        olVar2.c(iD2);
                        zc1.f(olVar2.e(), fillElement, o88.a(((ds) lp2Var2.j(ox1Var)).d, ((dp) lp2Var2.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, lp2Var2, 48, 248);
                        lp2Var2.p(false);
                    } catch (Throwable th) {
                        olVar2.c(iD2);
                        throw th;
                    }
                } else {
                    lp2Var2.W(1595022801);
                    lp2Var2.p(false);
                }
                lp2Var2.p(true);
            } catch (Throwable th2) {
                olVar.c(iD);
                throw th2;
            }
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new d67((byte) 7, i, zo8Var, kx4Var);
        }
    }

    public static final long c(long j, int i, int i2, int i3) {
        int i4;
        int iD = f88.d(j);
        int iC = f88.c(j);
        if (iC < i) {
            return j;
        }
        if (iD <= i && i2 <= iC) {
            i4 = i3 - (i2 - i);
            if (iD == iC) {
            }
            i = iC + i4;
            return ct7.c(iD, i);
        }
        if (iD > i && iC < i2) {
            i += i3;
            iD = i;
        } else if (iD >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iD) {
            iD = i + i3;
            i = (i3 - (i2 - i)) + iC;
        }
        return ct7.c(iD, i);
        iD += i4;
        i = iC + i4;
        return ct7.c(iD, i);
    }

    public static final Object d(tq5 tq5Var, String str, s51 s51Var) {
        Object objD = tq5Var.d(str, new b58((byte) 6), s51Var);
        return objD == c71.X ? objD : dn8.a;
    }

    public static vz e(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new vz(ue3.t(view));
        }
        return null;
    }

    public static final void f(g48 g48Var) {
        mi5 mi5Var = g48Var.Z;
        int length = mi5Var.length();
        int length2 = mi5Var.length() + 1;
        if (length < 0 || length >= length2) {
            zc3.a("Expected " + length + " to be in [0, " + length2 + ")");
        }
        g48Var.i0 = ct7.c(length, length);
    }

    public static final void g(g48 g48Var, int i, int i2) {
        g48Var.g(ct7.c(x97.n(i, 0, g48Var.Z.length()), x97.n(i2, 0, g48Var.Z.length())));
    }
}
