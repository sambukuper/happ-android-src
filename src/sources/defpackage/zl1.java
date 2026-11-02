package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 {
    public static final Set b = w45.U(a04.CLASS);
    public static final Set c = eu.L0(new a04[]{a04.FILE_FACADE, a04.MULTIFILE_CLASS_PART});
    public static final hv4 d;
    public static final hv4 e;
    public hl1 a;

    static {
        new hv4(false, new int[]{1, 1, 2});
        d = new hv4(false, new int[]{1, 1, 11});
        e = new hv4(false, new int[]{1, 1, 13});
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final hm1 a(tf5 tf5Var, qb6 qb6Var) {
        String[] strArr;
        qg5 qg5VarI;
        qb6Var.getClass();
        b04 b04Var = qb6Var.b;
        hv4 hv4Var = b04Var.b;
        String[] strArr2 = b04Var.c;
        if (strArr2 == null) {
            strArr2 = b04Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains(b04Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = b04Var.e) != null) {
            try {
                try {
                    qg5VarI = mu3.i(strArr2, strArr);
                } catch (rh3 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(qb6Var.a()), e2);
                }
            } catch (Throwable th) {
                c().c.getClass();
                hv4 hv4VarE = e();
                hv4VarE.getClass();
                hv4 hv4Var2 = hv4Var.f ? hv4.g : hv4.h;
                int i = hv4Var2.b;
                int i2 = hv4VarE.b;
                if (i > i2 || (i >= i2 && hv4Var2.c > hv4VarE.c)) {
                    hv4VarE = hv4Var2;
                }
                int i3 = hv4Var.c;
                int i4 = hv4Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = hv4VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > hv4VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                qg5VarI = null;
            }
            if (qg5VarI != null) {
                qt3 qt3Var = (qt3) qg5VarI.X;
                zy5 zy5Var = (zy5) qg5VarI.Y;
                d(qb6Var);
                st3 st3Var = new st3(qb6Var, zy5Var, qt3Var, f(qb6Var), b(qb6Var));
                return new hm1(tf5Var, zy5Var, qt3Var, hv4Var, st3Var, c(), "scope for " + st3Var + " in " + tf5Var, tz.l0);
            }
        }
        return null;
    }

    public final wl1 b(qb6 qb6Var) {
        c().c.getClass();
        int i = qb6Var.b.g;
        return ((i & 16) == 0 || (i & 32) != 0) ? wl1.X : wl1.Y;
    }

    public final hl1 c() {
        hl1 hl1Var = this.a;
        if (hl1Var != null) {
            return hl1Var;
        }
        dh3.T("components");
        throw null;
    }

    public final ab3 d(qb6 qb6Var) {
        c().c.getClass();
        b04 b04Var = qb6Var.b;
        hv4 hv4Var = b04Var.b;
        hv4 hv4Var2 = b04Var.b;
        hv4 hv4VarE = e();
        hv4VarE.getClass();
        hv4 hv4Var3 = hv4Var2.f ? hv4.g : hv4.h;
        int i = hv4Var3.b;
        int i2 = hv4VarE.b;
        if (i > i2 || (i >= i2 && hv4Var3.c > hv4VarE.c)) {
            hv4VarE = hv4Var3;
        }
        int i3 = hv4Var2.c;
        int i4 = hv4Var2.b;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = hv4VarE.b;
            if (i4 > i5 || (i4 >= i5 && i3 > hv4VarE.c)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        hv4 hv4Var4 = hv4.g;
        hv4 hv4VarE2 = e();
        hv4 hv4VarE3 = e();
        boolean z2 = hv4Var.f;
        hv4VarE3.getClass();
        hv4 hv4Var5 = z2 ? hv4Var4 : hv4.h;
        int i6 = hv4Var5.b;
        int i7 = hv4VarE3.b;
        return new ab3(hv4Var, hv4Var4, hv4VarE2, (i6 <= i7 && (i6 < i7 || hv4Var5.c <= hv4VarE3.c)) ? hv4VarE3 : hv4Var5, qb6Var.a());
    }

    public final hv4 e() {
        c().c.getClass();
        return hv4.g;
    }

    public final boolean f(qb6 qb6Var) {
        c().c.getClass();
        c().c.getClass();
        b04 b04Var = qb6Var.b;
        return (b04Var.g & 2) != 0 && b04Var.b.equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final hs0 g(qb6 qb6Var) {
        String[] strArr;
        qg5 qg5VarF;
        b04 b04Var = qb6Var.b;
        hv4 hv4Var = b04Var.b;
        String[] strArr2 = b04Var.c;
        if (strArr2 == null) {
            strArr2 = b04Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!b.contains(b04Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = b04Var.e) != null) {
            try {
                try {
                    qg5VarF = mu3.f(strArr2, strArr);
                } catch (rh3 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(qb6Var.a()), e2);
                }
            } catch (Throwable th) {
                c().c.getClass();
                hv4 hv4VarE = e();
                hv4VarE.getClass();
                hv4 hv4Var2 = hv4Var.f ? hv4.g : hv4.h;
                int i = hv4Var2.b;
                int i2 = hv4VarE.b;
                if (i > i2 || (i >= i2 && hv4Var2.c > hv4VarE.c)) {
                    hv4VarE = hv4Var2;
                }
                int i3 = hv4Var.c;
                int i4 = hv4Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = hv4VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > hv4VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                qg5VarF = null;
            }
            if (qg5VarF != null) {
                qt3 qt3Var = (qt3) qg5VarF.X;
                fy5 fy5Var = (fy5) qg5VarF.Y;
                d(qb6Var);
                return new hs0(qt3Var, fy5Var, hv4Var, new l04(qb6Var, new sr5(f(qb6Var)), b(qb6Var)));
            }
        }
        return null;
    }
}
