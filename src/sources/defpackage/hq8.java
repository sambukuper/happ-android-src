package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hq8 {
    public er8 e;
    public er8 f;
    public HashSet g;
    public er8 h;
    public iz i;
    public er8 j;
    public Rect k;
    public cj0 m;
    public cj0 n;
    public f57 o;
    public f57 p;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final Object c = new Object();
    public int d = 2;
    public Matrix l = new Matrix();

    public hq8(er8 er8Var) {
        new j78(this, (byte) 2);
        this.o = f57.a();
        this.p = f57.a();
        this.f = er8Var;
        this.h = er8Var;
    }

    public abstract iz A(iz izVar, iz izVar2);

    public abstract void B();

    public void C(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public final boolean D(int i) {
        Size size;
        int iH = ((i63) this.h).H(-1);
        if (iH != -1 && iH == i) {
            return false;
        }
        dr8 dr8VarM = m(this.f);
        i63 i63Var = (i63) dr8VarM.d();
        int iH2 = i63Var.H(-1);
        if (iH2 == -1 || iH2 != i) {
            h53 h53Var = (h53) dr8VarM;
            switch (h53Var.X) {
                case 0:
                    h53Var.Y.o(i63.t, Integer.valueOf(i));
                    break;
                case 1:
                    h53Var.Y.o(i63.t, Integer.valueOf(i));
                    break;
                default:
                    k05 k05Var = h53Var.Y;
                    k05Var.o(i63.t, Integer.valueOf(i));
                    k05Var.o(i63.u, Integer.valueOf(i));
                    break;
            }
        }
        if (iH2 != -1 && i != -1 && iH2 != i) {
            if (Math.abs(w39.m0(i) - w39.m0(iH2)) % 180 == 90 && (size = (Size) i63Var.a(i63.w, null)) != null) {
                h53 h53Var2 = (h53) dr8VarM;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (h53Var2.X) {
                    case 0:
                        h53Var2.Y.o(i63.w, size2);
                        break;
                    case 1:
                        h53Var2.Y.o(i63.w, size2);
                        break;
                    default:
                        h53Var2.Y.o(i63.w, size2);
                        break;
                }
            }
        }
        this.f = dr8VarM.d();
        cj0 cj0VarD = d();
        if (cj0VarD == null) {
            this.h = this.f;
            return true;
        }
        this.h = p(cj0VarD.s(), this.e, this.j);
        return true;
    }

    public void E(Rect rect) {
        this.k = rect;
    }

    public final void F(cj0 cj0Var) {
        B();
        synchronized (this.b) {
            try {
                cj0 cj0Var2 = this.m;
                if (cj0Var == cj0Var2) {
                    this.a.remove(cj0Var2);
                    this.m = null;
                }
                cj0 cj0Var3 = this.n;
                if (cj0Var == cj0Var3) {
                    this.a.remove(cj0Var3);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
        }
        this.i = null;
        this.k = null;
        this.h = this.f;
        this.e = null;
        this.j = null;
    }

    public final void G(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.o = (f57) list.get(0);
        if (list.size() > 1) {
            this.p = (f57) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (wg1 wg1Var : ((f57) it.next()).b()) {
                if (wg1Var.j == null) {
                    wg1Var.j = getClass();
                }
            }
        }
    }

    public final void H(iz izVar, iz izVar2) {
        this.i = A(izVar, izVar2);
    }

    public final void a(b57 b57Var, iz izVar) {
        Range range = iz.h;
        if (!range.equals(izVar.e)) {
            ((k05) b57Var.b.g0).o(ym0.f, izVar.e);
            return;
        }
        synchronized (this.b) {
            try {
                cj0 cj0Var = this.m;
                cj0Var.getClass();
                ArrayList arrayListC = cj0Var.s().s().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListC.size() > 1) {
                    z = false;
                }
                mb6.o(z, "There should not have more than one AeFpsRangeQuirk.");
                if (!arrayListC.isEmpty()) {
                    Range range2 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).a.getValue();
                    if (range2 != null) {
                        range = range2;
                    }
                    ((k05) b57Var.b.g0).o(ym0.f, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(cj0 cj0Var, cj0 cj0Var2, er8 er8Var, er8 er8Var2) {
        synchronized (this.b) {
            this.m = cj0Var;
            this.n = cj0Var2;
            this.a.add(cj0Var);
            if (cj0Var2 != null) {
                this.a.add(cj0Var2);
            }
        }
        this.e = er8Var;
        this.j = er8Var2;
        this.h = p(cj0Var.s(), this.e, this.j);
        synchronized (this.c) {
        }
        t();
    }

    public final Size c() {
        iz izVar = this.i;
        if (izVar != null) {
            return izVar.a;
        }
        return null;
    }

    public final cj0 d() {
        cj0 cj0Var;
        synchronized (this.b) {
            cj0Var = this.m;
        }
        return cj0Var;
    }

    public final qh0 e() {
        synchronized (this.b) {
            try {
                cj0 cj0Var = this.m;
                if (cj0Var == null) {
                    return qh0.a;
                }
                return cj0Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        cj0 cj0VarD = d();
        mb6.r(cj0VarD, "No camera attached to use case: " + this);
        return cj0VarD.s().e();
    }

    public abstract er8 g(boolean z, hr8 hr8Var);

    public final String h() {
        String str = (String) this.h.a(u18.I, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(cj0 cj0Var, boolean z) {
        int iN = cj0Var.s().n(((i63) this.h).H(0));
        return (cj0Var.q() || !z) ? iN : hd8.i(-iN);
    }

    public final cj0 j() {
        cj0 cj0Var;
        synchronized (this.b) {
            cj0Var = this.n;
        }
        return cj0Var;
    }

    public Set k(aj0 aj0Var) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public dr8 m(l11 l11Var) {
        return new h53(k05.k(l11Var), (byte) 0);
    }

    public boolean n() {
        return this instanceof k53;
    }

    public final boolean o(cj0 cj0Var) {
        int iIntValue = ((Integer) ((i63) this.h).a(i63.v, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return cj0Var.e();
        }
        bt.g(pc6.j(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final er8 p(aj0 aj0Var, er8 er8Var, er8 er8Var2) {
        k05 k05VarJ;
        if (er8Var2 != null) {
            k05VarJ = k05.k(er8Var2);
            k05VarJ.w(u18.I);
        } else {
            k05VarJ = k05.j();
        }
        TreeMap treeMap = k05VarJ.X;
        if (this.f.h(i63.s) || this.f.h(i63.w)) {
            zx zxVar = i63.A;
            if (treeMap.containsKey(zxVar)) {
                k05VarJ.w(zxVar);
            }
        }
        er8 er8Var3 = this.f;
        zx zxVar2 = i63.A;
        if (er8Var3.h(zxVar2)) {
            zx zxVar3 = i63.y;
            if (treeMap.containsKey(zxVar3) && ((ef6) this.f.d(zxVar2)).b != null) {
                k05VarJ.w(zxVar3);
            }
        }
        Iterator it = this.f.b().iterator();
        while (it.hasNext()) {
            l11.p(k05VarJ, k05VarJ, this.f, (zx) it.next());
        }
        if (er8Var != null) {
            for (zx zxVar4 : er8Var.b()) {
                if (!zxVar4.a.equals(u18.I.a)) {
                    l11.p(k05VarJ, k05VarJ, er8Var, zxVar4);
                }
            }
        }
        if (treeMap.containsKey(i63.w)) {
            zx zxVar5 = i63.s;
            if (treeMap.containsKey(zxVar5)) {
                k05VarJ.w(zxVar5);
            }
        }
        zx zxVar6 = i63.A;
        if (treeMap.containsKey(zxVar6)) {
            ((ef6) k05VarJ.d(zxVar6)).getClass();
        }
        Objects.toString(this.g);
        toString();
        hi5.z0("UseCase");
        HashSet<ru2> hashSet = this.g;
        if (hashSet != null) {
            int i = rx1.c;
            Range range = iz.h;
            lv8 lv8Var = mv8.c;
            px1 px1Var = px1.d;
            for (ru2 ru2Var : hashSet) {
                if (ru2Var instanceof rx1) {
                    px1Var = ((rx1) ru2Var).a;
                } else if (ru2Var instanceof ek2) {
                    ek2 ek2Var = (ek2) ru2Var;
                    range = new Range(Integer.valueOf(ek2Var.a), Integer.valueOf(ek2Var.b));
                } else if (ru2Var instanceof mv8) {
                    lv8Var = ((mv8) ru2Var).a;
                }
            }
            if ((this instanceof lt5) || ts7.f(this)) {
                k05VarJ.o(e63.r, px1Var);
            }
            k05VarJ.o(er8.R, range);
            int iOrdinal = lv8Var.ordinal();
            if (iOrdinal == 0) {
                k05VarJ.o(er8.a0, 0);
                k05VarJ.o(er8.b0, 0);
            } else if (iOrdinal == 1) {
                k05VarJ.o(er8.a0, 1);
                k05VarJ.o(er8.b0, 1);
            } else if (iOrdinal == 2) {
                k05VarJ.o(er8.a0, 0);
                k05VarJ.o(er8.b0, 2);
            } else if (iOrdinal == 3) {
                k05VarJ.o(er8.a0, 2);
                k05VarJ.o(er8.b0, 0);
            }
        }
        return v(aj0Var, m(k05VarJ));
    }

    public final void q() {
        this.d = 1;
        s();
    }

    public final void r() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gq8) it.next()).d(this);
        }
    }

    public final void s() {
        int iB = p61.B(this.d);
        HashSet hashSet = this.a;
        if (iB == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((gq8) it.next()).f(this);
            }
        } else {
            if (iB != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((gq8) it2.next()).k(this);
            }
        }
    }

    public er8 v(aj0 aj0Var, dr8 dr8Var) {
        return dr8Var.d();
    }

    public void w(int i) {
        D(i);
    }

    public iz z(l11 l11Var) {
        iz izVar = this.i;
        if (izVar == null) {
            u52.k("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        xy0 xy0VarB = izVar.b();
        xy0VarB.i0 = l11Var;
        return xy0VarB.b();
    }

    public void t() {
    }

    public void u() {
    }

    public void x() {
    }

    public void y() {
    }
}
