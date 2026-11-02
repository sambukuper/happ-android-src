package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp7 {
    public static final g55 a = new g55((byte) 27);
    public static final Object b = new Object();

    public static final void a(kx4 kx4Var, rn2 rn2Var, lp2 lp2Var, int i, int i2) {
        int i3;
        lp2Var.X(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(rn2Var) ? 32 : 16;
        }
        if (lp2Var.N(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                kx4Var = hx4.X;
            }
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new vp7(lh4.k0);
                lp2Var.g0(objK);
            }
            b((vp7) objK, kx4Var, rn2Var, lp2Var, (i3 << 3) & 1008);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ea3(kx4Var, rn2Var, i, i2);
        }
    }

    public static final void b(vp7 vp7Var, kx4 kx4Var, rn2 rn2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-511989831);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(vp7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(rn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(lp2Var.T);
            jp2 jp2VarJ0 = km4.j0(lp2Var);
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            kl5 kl5VarL = lp2Var.l();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(vp7Var.c, lp2Var, vp7Var);
            pn7.m(vp7Var.d, lp2Var, jp2VarJ0);
            pn7.m(vp7Var.e, lp2Var, rn2Var);
            uz0.j.getClass();
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            lp2Var.p(true);
            if (lp2Var.z()) {
                lp2Var.W(-1259187287);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1259245908);
                boolean zH = lp2Var.h(vp7Var);
                Object objK = lp2Var.K();
                if (zH || objK == zz0.a) {
                    objK = new hr5(vp7Var, (byte) 25);
                    lp2Var.g0(objK);
                }
                u70.q((dn2) objK, lp2Var);
                lp2Var.p(false);
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) vp7Var, (Object) kx4Var, (Object) rn2Var, i, (byte) 17);
        }
    }
}
