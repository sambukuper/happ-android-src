package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xt7 {
    public static final void a(ps7 ps7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        ps7Var.getClass();
        gn2Var.getClass();
        lp2Var.X(899275401);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(ps7Var) ? 4 : 2) | i;
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
            FillElement fillElement = b.a;
            y68 y68VarA0 = z68.A0(ps7Var.a, lp2Var, 2);
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
            ci8.a(fillElement, vj8.j0(y46.sub_properties_ua_title, lp2Var), jm4.U(1780060659, new h64(ps7Var, gn2Var, fillElement, y68VarA0), lp2Var), lp2Var, 390, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) ps7Var, (Object) gn2Var, (Object) kx4Var, i, (byte) 21);
        }
    }

    public static final ArrayList b(ArrayList arrayList, List list, ho2 ho2Var) {
        t14 t14VarF;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<qg5> arrayListE1 = wv0.e1(arrayList, list);
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayListE1, 10));
        for (qg5 qg5Var : arrayListE1) {
            t14 t14Var = (t14) qg5Var.X;
            ot8 ot8Var = (ot8) qg5Var.Y;
            int i = ot8Var.j0;
            sm annotations = ot8Var.getAnnotations();
            v15 name = ot8Var.getName();
            name.getClass();
            boolean zI0 = ot8Var.I0();
            boolean z = ot8Var.l0;
            boolean z2 = ot8Var.m0;
            if (ot8Var.n0 != null) {
                int i2 = el1.a;
                vx4 vx4VarC = bl1.c(ho2Var);
                vx4VarC.getClass();
                t14VarF = vx4VarC.f().f(t14Var);
            } else {
                t14VarF = null;
            }
            t14 t14Var2 = t14VarF;
            ke7 source = ot8Var.getSource();
            source.getClass();
            arrayList2.add(new ot8(ho2Var, null, i, annotations, name, t14Var, zI0, z, z2, t14Var2, source));
        }
        return arrayList2;
    }

    public static final h54 c(sx4 sx4Var) {
        sx4 sx4Var2;
        sx4Var.getClass();
        int i = el1.a;
        Iterator it = sx4Var.X().n0().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                sx4Var2 = null;
                break;
            }
            t14 t14Var = (t14) it.next();
            if (!zz3.y(t14Var)) {
                ot0 ot0VarX = t14Var.n0().x();
                if (bl1.l(ot0VarX, us0.X) || bl1.l(ot0VarX, us0.Z)) {
                    ot0VarX.getClass();
                    sx4Var2 = (sx4) ot0VarX;
                    break;
                }
            }
        }
        if (sx4Var2 == null) {
            return null;
        }
        et4 et4VarO0 = sx4Var2.o0();
        h54 h54Var = et4VarO0 instanceof h54 ? (h54) et4VarO0 : null;
        return h54Var == null ? c(sx4Var2) : h54Var;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final o88 d(o88 o88Var, z24 z24Var) {
        long j;
        i78 i78Var;
        int i;
        int i2;
        e88 e88Var;
        qe7 qe7Var = o88Var.a;
        f78 f78Var = re7.d;
        f78 f78Var2 = qe7Var.a;
        if (f78Var2.equals(e78.a)) {
            f78Var2 = re7.d;
        }
        f78 f78Var3 = f78Var2;
        long j2 = qe7Var.b;
        w88[] w88VarArr = v88.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = re7.a;
        }
        long j3 = j2;
        dj2 dj2Var = qe7Var.c;
        if (dj2Var == null) {
            dj2Var = dj2.g0;
        }
        dj2 dj2Var2 = dj2Var;
        bj2 bj2Var = qe7Var.d;
        bj2 bj2Var2 = new bj2(bj2Var != null ? bj2Var.a : 0);
        cj2 cj2Var = qe7Var.e;
        cj2 cj2Var2 = new cj2(cj2Var != null ? cj2Var.a : 65535);
        gi2 gi2Var = qe7Var.f;
        if (gi2Var == null) {
            gi2Var = gi2.a;
        }
        gi2 gi2Var2 = gi2Var;
        String str = qe7Var.g;
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        long j4 = qe7Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = re7.b;
        }
        long j5 = j4;
        x20 x20Var = qe7Var.i;
        float f = x20Var != null ? x20Var.a : 0.0f;
        x20 x20Var2 = new x20(Float.isNaN(f) ? 0.0f : f);
        g78 g78Var = qe7Var.j;
        if (g78Var == null) {
            g78Var = g78.c;
        }
        g78 g78Var2 = g78Var;
        ge4 ge4VarL = qe7Var.k;
        if (ge4VarL == null) {
            ge4 ge4Var = ge4.Z;
            ge4VarL = uo5.a.l();
        }
        ge4 ge4Var2 = ge4VarL;
        long j6 = qe7Var.l;
        if (j6 == 16) {
            j6 = re7.c;
        }
        long j7 = j6;
        x38 x38Var = qe7Var.m;
        if (x38Var == null) {
            x38Var = x38.b;
        }
        x38 x38Var2 = x38Var;
        t67 t67Var = qe7Var.n;
        if (t67Var == null) {
            t67Var = t67.d;
        }
        t67 t67Var2 = t67Var;
        qp5 qp5Var = qe7Var.o;
        tv1 tv1Var = qe7Var.p;
        if (tv1Var == null) {
            tv1Var = ea2.a;
        }
        qe7 qe7Var2 = new qe7(f78Var3, j3, dj2Var2, bj2Var2, cj2Var2, gi2Var2, str2, j5, x20Var2, g78Var2, ge4Var2, j7, x38Var2, t67Var2, qp5Var, tv1Var);
        xg5 xg5Var = o88Var.b;
        int i3 = yg5.b;
        int i4 = xg5Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = xg5Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = z24Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        b61.c();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = xg5Var.c;
            if ((j & 1095216660480L) == 0) {
                j = yg5.a;
            }
            i78Var = xg5Var.d;
            if (i78Var == null) {
                i78Var = i78.c;
            }
            fp5 fp5Var = xg5Var.e;
            aa4 aa4Var = xg5Var.f;
            i = xg5Var.g;
            if (i == 0) {
                i = v94.b;
            }
            i2 = xg5Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            e88Var = xg5Var.i;
            if (e88Var == null) {
                e88Var = e88.c;
            }
            return new o88(qe7Var2, new xg5(i4, i6, j, i78Var, fp5Var, aa4Var, i, i2, e88Var), o88Var.c);
        }
        int iOrdinal2 = z24Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            b61.c();
            return null;
        }
        i6 = i5;
        j = xg5Var.c;
        if ((j & 1095216660480L) == 0) {
            j = yg5.a;
        }
        i78Var = xg5Var.d;
        if (i78Var == null) {
            i78Var = i78.c;
        }
        fp5 fp5Var2 = xg5Var.e;
        aa4 aa4Var2 = xg5Var.f;
        i = xg5Var.g;
        if (i == 0) {
            i = v94.b;
        }
        i2 = xg5Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        e88Var = xg5Var.i;
        if (e88Var == null) {
            e88Var = e88.c;
        }
        return new o88(qe7Var2, new xg5(i4, i6, j, i78Var, fp5Var2, aa4Var2, i, i2, e88Var), o88Var.c);
    }

    public static final Object e(Set set, Object obj, Object obj2, Enum r4, boolean z) {
        Object obj3;
        if (!z) {
            if (r4 != null) {
                set = wv0.c1(q57.a0(set, r4));
            }
            return wv0.P0(set);
        }
        if (set.contains(obj)) {
            obj3 = obj;
        } else {
            obj3 = set.contains(obj2) ? obj2 : null;
        }
        if (dh3.f(obj3, obj) && dh3.f(r4, obj2)) {
            return null;
        }
        return r4 == null ? obj3 : r4;
    }

    public static void f(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            b4.r(window, z);
        } else {
            if (i >= 30) {
                b4.q(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
