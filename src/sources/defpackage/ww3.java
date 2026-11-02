package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ww3 {
    public static final ww3 c;
    public static final ww3 d;
    public final Map a;
    public final boolean b;

    static {
        e02 e02Var = e02.X;
        c = new ww3(e02Var, false);
        d = new ww3(e02Var, true);
    }

    public ww3(Map map, boolean z) {
        map.getClass();
        this.a = map;
        this.b = z;
    }

    public final ww3 a(boolean z) {
        if (z == this.b) {
            return this;
        }
        Map map = this.a;
        if (!map.isEmpty() || z) {
            return (map.isEmpty() && z) ? d : new ww3(map, z);
        }
        return c;
    }

    public final uw3 b(pw3 pw3Var, yw3 yw3Var) {
        uw3 uw3VarD = d(pw3Var, yw3Var);
        boolean z = this.b;
        if (z) {
            pw3 pw3Var2 = uw3VarD.b;
            return new uw3(pw3Var2 != null ? x97.v(pw3Var2, pw3Var2, false) : null, uw3VarD.a);
        }
        if (!z) {
            return uw3VarD;
        }
        b61.c();
        return null;
    }

    public final pw3 c(pw3 pw3Var, String str) {
        pw3Var.getClass();
        pw3 pw3Var2 = b(pw3Var, yw3.X).b;
        if (pw3Var2 == null) {
            throw new IllegalStateException("Projection in top level type is not possible".concat(str != null ? ": ".concat(str) : ".").toString());
        }
        return pw3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public final uw3 d(pw3 pw3Var, yw3 yw3Var) {
        zk6 zk6Var;
        boolean z;
        boolean z2;
        u1 u1Var;
        u1 u1Var2;
        u1 u1VarT;
        u1 u1VarK;
        Map map = this.a;
        if (map.isEmpty()) {
            return new uw3(pw3Var, yw3Var);
        }
        boolean z3 = pw3Var instanceof u1;
        u1 u1Var3 = z3 ? (u1) pw3Var : null;
        u1 u1VarK2 = u1Var3 != null ? u1Var3.K() : null;
        u1 u1Var4 = z3 ? (u1) pw3Var : null;
        u1 u1VarT2 = u1Var4 != null ? u1Var4.T() : null;
        if (u1VarK2 != null && u1VarT2 != null) {
            uw3 uw3VarD = d(u1VarK2, yw3Var);
            pw3 pw3Var2 = uw3VarD.b;
            u1 u1Var5 = pw3Var2 instanceof u1 ? (u1) pw3Var2 : null;
            if (u1Var5 != null && (u1VarK = u1Var5.K()) != null) {
                uw3VarD = new uw3(u1VarK, uw3VarD.a);
            }
            uw3 uw3VarD2 = d(u1VarT2, yw3Var);
            pw3 pw3Var3 = uw3VarD2.b;
            u1 u1Var6 = pw3Var3 instanceof u1 ? (u1) pw3Var3 : null;
            if (u1Var6 != null && (u1VarT = u1Var6.T()) != null) {
                uw3VarD2 = new uw3(u1VarT, uw3VarD2.a);
            }
            pw3 pw3Var4 = uw3VarD2.b;
            pw3 pw3Var5 = uw3VarD.b;
            return (pw3Var4 == null || pw3Var5 == null) ? uw3.c : new uw3(eu7.e(pw3Var5, pw3Var4, ((u1) pw3Var).F()), uw3VarD.a);
        }
        lv3 lv3VarM = pw3Var.M();
        if (lv3VarM == null) {
            return new uw3(pw3Var, yw3Var);
        }
        uw3 uw3Var = (uw3) map.get(lv3VarM);
        if (uw3Var == null) {
            if (!pw3Var.L().isEmpty()) {
                List<uw3> listL = pw3Var.L();
                ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
                for (uw3 uw3Var2 : listL) {
                    yw3 yw3Var2 = uw3Var2.a;
                    pw3 pw3Var6 = uw3Var2.b;
                    arrayList.add((pw3Var6 == null || yw3Var2 == null) ? uw3.c : d(pw3Var6, yw3Var2));
                }
                boolean z4 = pw3Var.z();
                List listQ = pw3Var.Q();
                u1 u1Var7 = pw3Var instanceof u1 ? (u1) pw3Var : null;
                pw3Var = w45.F(lv3VarM, arrayList, z4, listQ, u1Var7 != null ? u1Var7.v() : null);
            }
            return new uw3(pw3Var, yw3Var);
        }
        pw3 pw3VarN = uw3Var.b;
        yw3 yw3Var3 = uw3Var.a;
        if (pw3VarN == null || yw3Var3 == null) {
            return uw3Var;
        }
        yw3 yw3Var4 = yw3.X;
        if (yw3Var3 != yw3Var4) {
            if (yw3Var != yw3Var4 && yw3Var3 != yw3Var) {
                bt.i("CONFLICTING_PROJECTION");
                return null;
            }
            yw3Var = yw3Var3;
        }
        if (pw3Var instanceof x14) {
            x14 x14Var = (x14) pw3Var;
            if (((!(x14Var instanceof u1) || ((u1) x14Var).K() == null) ? null : (fe2) x14Var) == null) {
                if (pw3VarN instanceof u1) {
                    u1 u1Var8 = (u1) pw3VarN;
                    u1 u1VarK3 = u1Var8.K();
                    Boolean boolValueOf = u1VarK3 != null ? Boolean.valueOf(u1VarK3.z()) : null;
                    u1 u1VarT3 = u1Var8.T();
                    if (dh3.f(boolValueOf, u1VarT3 != null ? Boolean.valueOf(u1VarT3.z()) : null) || pw3Var.z()) {
                        zk6Var = (zk6) pw3VarN;
                        z = false;
                        if (pw3Var.z()) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        u1 u1VarS = ((u1) zk6Var).S(z2);
                        if (pw3Var instanceof u1) {
                            u1Var = (u1) pw3Var;
                        } else {
                            u1Var = null;
                        }
                        if (u1Var == null) {
                            if (zk6Var instanceof u1) {
                            }
                            if (u1Var2 != null) {
                                z = true;
                            }
                        } else {
                            if (zk6Var instanceof u1) {
                            }
                            if (u1Var2 != null) {
                                z = true;
                            }
                        }
                        pw3VarN = u1VarS.N(z);
                    }
                } else {
                    zk6Var = (zk6) pw3VarN;
                    z = false;
                    if (pw3Var.z() || pw3VarN.z()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    u1 u1VarS2 = ((u1) zk6Var).S(z2);
                    if (pw3Var instanceof u1) {
                        u1Var = (u1) pw3Var;
                    } else {
                        u1Var = null;
                    }
                    if (u1Var == null && u1Var.x()) {
                        z = true;
                    } else {
                        u1Var2 = zk6Var instanceof u1 ? (u1) zk6Var : null;
                        if (u1Var2 != null && u1Var2.x() && !pw3Var.z()) {
                            z = true;
                        }
                    }
                    pw3VarN = u1VarS2.N(z);
                }
                return new uw3(pw3VarN, yw3Var);
            }
        }
        om0.l("'", pw3Var, "' must be non flexible");
        return null;
    }
}
