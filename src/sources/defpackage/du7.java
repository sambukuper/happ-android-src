package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class du7 {
    public static final void a(kx4 kx4Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        lp2 lp2Var2;
        lp2Var.X(1223783145);
        int i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            dh3.b(vj8.j0(y46.title_subscription, lp2Var), kx4Var2, null, null, lp2Var2, (i2 << 3) & 112, 12);
        } else {
            kx4Var2 = kx4Var;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var2, i, (byte) 5);
        }
    }

    public static et4 b(String str, Collection collection) {
        et4 yo0Var;
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(xv0.Z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((t14) it.next()).K());
        }
        oc7 oc7VarA = z39.A(arrayList);
        int i = oc7VarA.X;
        if (i != 0) {
            yo0Var = i != 1 ? new yo0(str, (et4[]) oc7VarA.toArray(new et4[0])) : (et4) oc7VarA.get(0);
        } else {
            yo0Var = dt4.b;
        }
        return oc7VarA.X <= 1 ? yo0Var : new p74(yo0Var);
    }

    public static int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        bt.q(pc6.j(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final boolean d(char c) {
        return '0' <= c && c < ':';
    }

    public static final void e(xd6 xd6Var, h48 h48Var, h48 h48Var2, mj0 mj0Var, boolean z) {
        c15 c15Var = (c15) mj0Var.Y;
        int i = c15Var.Z;
        if (i > 1) {
            xd6Var.B(new u88(0, h48Var.Z.toString(), h48Var2.Z.toString(), h48Var.f0, h48Var2.f0, 0L, false, 32));
            return;
        }
        if (i == 1) {
            gp0 gp0Var = (gp0) c15Var.X[0];
            long jC = ct7.c(gp0Var.c, gp0Var.d);
            gp0 gp0Var2 = (gp0) ((c15) mj0Var.Y).X[0];
            long jC2 = ct7.c(gp0Var2.a, gp0Var2.b);
            if (f88.b(jC) && f88.b(jC2)) {
                return;
            }
            xd6Var.B(new u88(f88.d(jC), h48Var.Z.subSequence(f88.d(jC), f88.c(jC)).toString(), h48Var2.Z.subSequence(f88.d(jC2), f88.c(jC2)).toString(), h48Var.f0, h48Var2.f0, 0L, z, 32));
        }
    }

    public static final String f(int i, String str) {
        int iL0;
        CharSequence charSequenceSubSequence;
        if (str.length() >= i + 12 && fm7.e0("+-", str.charAt(0)) && (iL0 = fm7.l0(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (iL0 - i2 < 12) {
                int i4 = iL0 - 10;
                if (i4 < 1) {
                    kp5.k(ie2.h("End index (", i4, ") is less than start index (1)."));
                    return null;
                }
                if (i4 == 1) {
                    charSequenceSubSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (iL0 - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequenceSubSequence = sb;
                }
                return charSequenceSubSequence.toString();
            }
        }
        return str;
    }
}
