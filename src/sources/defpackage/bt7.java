package defpackage;

import android.R;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class bt7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(boolean z, boolean z2, qs7 qs7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        boolean z3;
        lp2Var.X(-476955441);
        if ((i & 6) == 0) {
            i2 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= lp2Var.g(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(qs7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (lp2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
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
            kx4 kx4VarU = ch3.u(b.a);
            kx4 kx4VarB = b.b(hx4.X, 16.0f);
            if (z) {
                lp2Var.W(461773353);
                lp2Var.p(false);
            } else {
                lp2Var.W(461535025);
                us7.a(qs7Var.a, gn2Var, kx4VarU, lp2Var, ((i3 >> 6) & 112) | 384);
                ch3.f(lp2Var, kx4VarB);
                lp2Var.p(false);
            }
            ys7.a(z, z3, qs7Var, gn2Var, kx4VarU, lp2Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
            if (z) {
                lp2Var.W(462782217);
                lp2Var.p(false);
            } else {
                lp2Var.W(462069155);
                ch3.f(lp2Var, kx4VarB);
                int i4 = ((i3 >> 6) & 112) | 384;
                ct7.b(qs7Var.g, gn2Var, kx4VarU, lp2Var, i4);
                ch3.f(lp2Var, kx4VarB);
                gs8.a(qs7Var.h, gn2Var, kx4VarU, lp2Var, i4);
                ch3.f(lp2Var, kx4VarB);
                xt7.a(qs7Var.i, gn2Var, kx4VarU, lp2Var, i4);
                lp2Var.p(false);
            }
            ch3.f(lp2Var, kx4VarB);
            dt7.a(qs7Var.j, gn2Var, kx4VarU, lp2Var, ((i3 >> 6) & 112) | 384);
            ch3.f(lp2Var, kx4VarB);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ws7(z, z2, qs7Var, gn2Var, kx4Var, i, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(yt7 yt7Var, kx4 kx4Var, lp2 lp2Var, int i) {
        yt7Var.getClass();
        lp2Var.X(-867735885);
        z24 z24Var = (z24) lp2Var.j(y01.n);
        y05 y05VarO = i21.o(yt7Var.e, lp2Var);
        boolean zH = lp2Var.h(yt7Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (zH || objK == beVar) {
            al5 al5Var = new al5(1, yt7Var, yt7.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/subscription_properties/SubscriptionPropertiesUiIntent;)V", 0, (byte) 19);
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
        boolean zF = lp2Var.f(pv3Var);
        Object objK3 = lp2Var.K();
        if (zF || objK3 == beVar) {
            objK3 = new aa3(pv3Var, (byte) 15);
            lp2Var.g0(objK3);
        }
        hi5.F(false, (dn2) objK3, lp2Var, 0);
        sx2.b(kx4Var, jm4.U(-452983114, new d67(pv3Var, oh2Var, (byte) 1), lp2Var), (rn2) null, (rn2) null, 0, 0L, (v09) null, jm4.U(305896653, new zv2(z24Var, oh2Var, yt7Var, y05VarO, pv3Var, (byte) 4), lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new d67((byte) 2, i, yt7Var, kx4Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(int i, int i2, kd8 kd8Var) {
        mb3 mb3Var;
        id8 id8Var;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        zi1 zi1Var = kd8Var.d;
        qf3 qf3Var = (zi1Var == null || (id8Var = (id8) zi1Var.getValue()) == null) ? null : id8Var.b;
        long jA = qf3Var != null ? qf3Var.a(i, false) : ct7.c(i, i);
        long jF = kd8Var.f(jA);
        if (f88.b(jA) && f88.b(jF)) {
            mb3Var = mb3.X;
        } else if (f88.b(jA) || f88.b(jF)) {
            mb3Var = (!f88.b(jA) || f88.b(jF)) ? mb3.f0 : mb3.Y;
        } else {
            mb3Var = mb3.Z;
        }
        int iOrdinal = mb3Var.ordinal();
        f09 f09Var = f09.Y;
        f09 f09Var2 = f09.X;
        if (iOrdinal == 0) {
            if (z) {
                f09Var = f09Var2;
            }
            return nr4.n(i, f09Var);
        }
        if (iOrdinal == 1) {
            if (z) {
                return i == ((int) (jF >> 32)) ? nr4.n(i, f09Var2) : nr4.n((int) (jF & 4294967295L), f09Var);
            }
            return i == ((int) (jF & 4294967295L)) ? nr4.n(i, f09Var) : nr4.n((int) (jF >> 32), f09Var2);
        }
        if (iOrdinal == 2) {
            return z ? nr4.n((int) (jF & 4294967295L), f09Var2) : nr4.n((int) (jF >> 32), f09Var);
        }
        if (iOrdinal == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        b61.c();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ViewGroup d(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int f(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return e(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PorterDuff.Mode g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return f(i3, i2, bArr);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return f(i3, i2, bArr);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static final ch8 i(ch8 ch8Var, sm smVar) {
        ch8 ch8VarK;
        ch8Var.getClass();
        if (xm.a(ch8Var) == smVar) {
            return ch8Var;
        }
        wm wmVar = (wm) xm.b.a(xm.a[0], ch8Var);
        if (wmVar != null) {
            if (ch8Var.isEmpty()) {
                ch8VarK = ch8Var;
            } else {
                ut utVar = ch8Var.X;
                ArrayList arrayList = new ArrayList();
                for (Object obj : utVar) {
                    if (!dh3.f((wm) obj, wmVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == ch8Var.X.a()) {
                    ch8VarK = ch8Var;
                } else {
                    ch8.Y.getClass();
                    ch8VarK = xd6.k(arrayList);
                }
            }
            if (ch8VarK != null) {
                ch8Var = ch8VarK;
            }
        }
        if (smVar.iterator().hasNext() || !smVar.isEmpty()) {
            wm wmVar2 = new wm(smVar);
            xd6 xd6Var = ch8.Y;
            zu3 zu3VarB = yb6.a.b(wm.class);
            xd6Var.getClass();
            String strP = zu3VarB.p();
            strP.getClass();
            if (ch8Var.X.get(xd6Var.r(strP)) == null) {
                return ch8Var.isEmpty() ? new ch8(i21.K(wmVar2)) : xd6.k(wv0.I0(wv0.Y0(ch8Var), wmVar2));
            }
        }
        return ch8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ch8 j(sm smVar) {
        smVar.getClass();
        if (smVar.isEmpty()) {
            ch8.Y.getClass();
            return ch8.Z;
        }
        xd6 xd6Var = ch8.Y;
        List listK = i21.K(new wm(smVar));
        xd6Var.getClass();
        return xd6.k(listK);
    }
}
