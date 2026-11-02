package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yp2 extends bq2 {
    public final b92 X;

    public yp2(xp2 xp2Var) {
        xp2Var.Y.f();
        xp2Var.Z = false;
        this.X = xp2Var.Y;
    }

    public final boolean i() {
        gc7 gc7Var = this.X.a;
        for (int i = 0; i < gc7Var.Y.size(); i++) {
            if (!b92.e((Map.Entry) gc7Var.Y.get(i))) {
                return false;
            }
        }
        Iterator it = gc7Var.c().iterator();
        while (it.hasNext()) {
            if (!b92.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int j() {
        gc7 gc7Var = this.X.a;
        int iD = 0;
        for (int i = 0; i < gc7Var.Y.size(); i++) {
            Map.Entry entry = (Map.Entry) gc7Var.Y.get(i);
            iD += b92.d((zp2) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : gc7Var.c()) {
            iD += b92.d((zp2) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(aq2 aq2Var) {
        o(aq2Var);
        zp2 zp2Var = aq2Var.d;
        Object obj = this.X.a.get(zp2Var);
        if (obj == null) {
            return aq2Var.b;
        }
        if (!zp2Var.Z) {
            return aq2Var.a(obj);
        }
        if (zp2Var.Y.X != c39.k0) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(aq2Var.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(aq2 aq2Var) {
        o(aq2Var);
        zp2 zp2Var = aq2Var.d;
        b92 b92Var = this.X;
        b92Var.getClass();
        if (!zp2Var.Z) {
            return b92Var.a.get(zp2Var) != null;
        }
        bt.q("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void m() {
        this.X.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean n(iv0 iv0Var, nv0 nv0Var, r62 r62Var, int i) throws rh3 {
        boolean z;
        boolean z2;
        Object objB;
        d2 d2Var;
        int i2 = i & 7;
        aq2 aq2Var = (aq2) r62Var.a.get(new q62(a(), i >>> 3));
        if (aq2Var == null) {
            z2 = true;
            z = false;
        } else {
            zp2 zp2Var = aq2Var.d;
            a39 a39Var = zp2Var.Y;
            b92 b92Var = b92.c;
            if (i2 == a39Var.Y) {
                z2 = false;
                z = false;
            } else if (zp2Var.Z && a39Var.a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return iv0Var.q(i, nv0Var);
        }
        up2 up2VarC = null;
        b92 b92Var2 = this.X;
        if (z) {
            int iE = iv0Var.e(iv0Var.k());
            zp2 zp2Var2 = aq2Var.d;
            if (zp2Var2.Y != a39.i0) {
                while (iv0Var.c() > 0) {
                    b92Var2.a(zp2Var2, b92.h(iv0Var, zp2Var2.Y));
                }
            } else if (iv0Var.c() > 0) {
                iv0Var.k();
                throw null;
            }
            iv0Var.d(iE);
            return true;
        }
        zp2 zp2Var3 = aq2Var.d;
        a39 a39Var2 = zp2Var3.Y;
        boolean z3 = zp2Var3.Z;
        a39 a39Var3 = zp2Var3.Y;
        int iOrdinal = a39Var2.X.ordinal();
        if (iOrdinal == 7) {
            iv0Var.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objB = b92.h(iv0Var, a39Var3);
        } else {
            if (!z3 && (d2Var = (d2) b92Var2.a.get(zp2Var3)) != null) {
                up2VarC = d2Var.e();
            }
            if (up2VarC == null) {
                up2VarC = aq2Var.c.c();
            }
            if (a39Var3 == a39.g0) {
                short s = zp2Var3.X;
                iv0Var.b();
                iv0Var.i++;
                up2VarC.c(iv0Var, r62Var);
                iv0Var.a((s << 3) | 4);
                iv0Var.i--;
            } else {
                int iK = iv0Var.k();
                iv0Var.b();
                int iE2 = iv0Var.e(iK);
                iv0Var.i++;
                up2VarC.c(iv0Var, r62Var);
                iv0Var.a(0);
                iv0Var.i--;
                iv0Var.d(iE2);
            }
            objB = up2VarC.b();
        }
        if (z3) {
            b92Var2.a(zp2Var3, aq2Var.b(objB));
            return true;
        }
        b92Var2.i(zp2Var3, aq2Var.b(objB));
        return true;
    }

    public final void o(aq2 aq2Var) {
        if (aq2Var.a == a()) {
            return;
        }
        bt.q("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public yp2() {
        this.X = new b92();
    }
}
