package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b88 {
    public final rh5 a = z51.H(null);
    public ql b;
    public final vd7 c;

    public b88(ql qlVar) {
        b58 b58Var = new b58((byte) 3);
        qlVar.getClass();
        ol olVar = new ol(qlVar);
        ArrayList arrayList = olVar.Z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) b58Var.B(((nl) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                pl plVar = (pl) list.get(i2);
                Object obj = plVar.a;
                arrayList3.add(new nl(plVar.d, plVar.b, plVar.c, obj));
            }
            bw0.d0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = olVar.e();
        this.c = new vd7();
    }

    public static pl c(pl plVar, x78 x78Var) {
        bz4 bz4Var = x78Var.b;
        int iB = bz4Var.b(bz4Var.f - 1, false);
        if (plVar.b < iB) {
            return pl.a(plVar, null, 0, Math.min(plVar.c, iB), 11);
        }
        return null;
    }

    public final void a(int i, lp2 lp2Var) {
        boolean z;
        Object obj;
        lp2Var.X(1154651354);
        byte b = 4;
        char c = 2;
        int i2 = (lp2Var.h(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            bi biVar = (bi) lp2Var.j(y01.s);
            ql qlVar = this.b;
            List listA = qlVar.a(qlVar.Y.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                pl plVar = (pl) listA.get(i3);
                int i4 = plVar.b;
                Object obj2 = plVar.a;
                if (i4 != plVar.c) {
                    lp2Var.W(725478935);
                    Object objK = lp2Var.K();
                    Object obj3 = zz0.a;
                    if (objK == obj3) {
                        obj = objK;
                        Object xz4Var = new xz4();
                        lp2Var.g0(xz4Var);
                        obj = xz4Var;
                    }
                    obj = objK;
                    xz4 xz4Var2 = (xz4) obj;
                    kx4 kx4VarI = jm4.I(hx4.X, new gq6(this, plVar, (byte) 15));
                    Object objK2 = lp2Var.K();
                    Object obj4 = objK2;
                    if (objK2 == obj3) {
                        Object b58Var = new b58(b);
                        lp2Var.g0(b58Var);
                        obj4 = b58Var;
                    }
                    kx4 kx4VarA = v07.a(kx4VarI, z2, (gn2) obj4);
                    byte b2 = 14;
                    kx4 kx4VarZ = u15.z(kx4VarA.y(new g88(new jn0(this, plVar, (byte) 14))), xz4Var2);
                    fq5.a.getClass();
                    kx4 kx4VarN = gv3.N(kx4VarZ, ci8.e);
                    boolean zH = lp2Var.h(this) | lp2Var.f(plVar) | lp2Var.h(biVar);
                    Object objK3 = lp2Var.K();
                    Object obj5 = objK3;
                    if (zH || objK3 == obj3) {
                        Object a23Var = new a23(this, plVar, biVar);
                        lp2Var.g0(a23Var);
                        obj5 = a23Var;
                    }
                    g80.a(x97.s(kx4VarN, xz4Var2, null, false, null, (dn2) obj5, 508), lp2Var, 0);
                    pa4 pa4Var = (pa4) obj2;
                    c88 c88VarA = pa4Var.a();
                    if (c88VarA == null || (c88VarA.a == null && c88VarA.b == null && c88VarA.c == null && c88VarA.d == null)) {
                        z = false;
                        lp2Var.W(728331710);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(726303039);
                        Object objK4 = lp2Var.K();
                        Object obj6 = objK4;
                        if (objK4 == obj3) {
                            Object qa4Var = new qa4(xz4Var2);
                            lp2Var.g0(qa4Var);
                            obj6 = qa4Var;
                        }
                        qa4 qa4Var2 = (qa4) obj6;
                        Object objK5 = lp2Var.K();
                        boolean z3 = false;
                        Object obj7 = objK5;
                        if (objK5 == obj3) {
                            Object ym7Var = new ym7(qa4Var2, z3 ? 1 : 0, (byte) 5);
                            lp2Var.g0(ym7Var);
                            obj7 = ym7Var;
                        }
                        u70.h((rn2) obj7, lp2Var, dn8.a);
                        oh5 oh5Var = qa4Var2.b;
                        oh5 oh5Var2 = qa4Var2.b;
                        Boolean boolValueOf = Boolean.valueOf((oh5Var.l() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((oh5Var2.l() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((oh5Var2.l() & 4) != 0);
                        c88 c88VarA2 = pa4Var.a();
                        qe7 qe7Var = c88VarA2 != null ? c88VarA2.a : null;
                        c88 c88VarA3 = pa4Var.a();
                        qe7 qe7Var2 = c88VarA3 != null ? c88VarA3.b : null;
                        c88 c88VarA4 = pa4Var.a();
                        qe7 qe7Var3 = c88VarA4 != null ? c88VarA4.c : null;
                        c88 c88VarA5 = pa4Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, qe7Var, qe7Var2, qe7Var3, c88VarA5 != null ? c88VarA5.d : null};
                        boolean zH2 = lp2Var.h(this) | lp2Var.f(plVar);
                        Object objK6 = lp2Var.K();
                        Object obj8 = objK6;
                        if (zH2 || objK6 == obj3) {
                            Object gq6Var = new gq6(this, plVar, qa4Var2, b2);
                            lp2Var.g0(gq6Var);
                            obj8 = gq6Var;
                        }
                        b(objArr, (gn2) obj8, lp2Var, (i2 << 6) & 896);
                        z = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z);
                } else {
                    z = z2;
                    lp2Var.W(728345598);
                    lp2Var.p(z);
                }
                i3++;
                z2 = z;
                c = c;
                b = b;
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new b1(this, i, (byte) 28);
        }
    }

    public final void b(Object[] objArr, gn2 gn2Var, lp2 lp2Var, int i) {
        lp2Var.X(-2083052099);
        int i2 = (i & 48) == 0 ? (lp2Var.h(gn2Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        lp2Var.U(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (lp2Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= lp2Var.h(obj) ? 4 : 0;
        }
        lp2Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ps psVar = new ps(2);
            psVar.b(gn2Var);
            psVar.c(objArr);
            ArrayList arrayList = psVar.b;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = lp2Var.h(this) | ((i3 & 112) == 32);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new a40(this, gn2Var, b);
                lp2Var.g0(objK);
            }
            u70.c(array, (gn2) objK, lp2Var);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) this, (Object) objArr, (Object) gn2Var, i, (byte) 22);
        }
    }
}
