package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oy8 implements gq8 {
    public final HashSet X;
    public final hr8 g0;
    public final cj0 h0;
    public final cj0 i0;
    public final HashSet k0;
    public final HashMap l0;
    public final gf6 m0;
    public final gf6 n0;
    public final HashMap Y = new HashMap();
    public final HashMap Z = new HashMap();
    public final HashMap f0 = new HashMap();
    public final yg0 j0 = new yg0(this);

    public oy8(cj0 cj0Var, cj0 cj0Var2, HashSet hashSet, hr8 hr8Var, kp5 kp5Var) {
        this.h0 = cj0Var;
        this.i0 = cj0Var2;
        this.g0 = hr8Var;
        this.X = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            map.put(hq8Var, hq8Var.p(cj0Var.s(), null, hq8Var.g(true, hr8Var)));
        }
        this.l0 = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.k0 = hashSet2;
        this.m0 = new gf6(cj0Var, hashSet2);
        if (this.i0 != null) {
            this.n0 = new gf6(this.i0, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            hq8 hq8Var2 = (hq8) it2.next();
            this.f0.put(hq8Var2, Boolean.FALSE);
            this.Z.put(hq8Var2, new ny8(cj0Var, this, kp5Var));
        }
    }

    public static void u(xx7 xx7Var, wg1 wg1Var, f57 f57Var) {
        xx7Var.d();
        try {
            s08.b();
            xx7Var.a();
            wx7 wx7Var = xx7Var.l;
            wx7Var.g(wg1Var, new tx7(wx7Var, (byte) 0));
        } catch (ug1 unused) {
            d57 d57Var = f57Var.f;
            if (d57Var != null) {
                d57Var.a(f57Var);
            }
        }
    }

    public static wg1 v(hq8 hq8Var) {
        List listB = hq8Var instanceof x53 ? hq8Var.o.b() : Collections.unmodifiableList(hq8Var.o.g.a);
        mb6.s(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (wg1) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.gq8
    public final void d(hq8 hq8Var) {
        wg1 wg1VarV;
        s08.b();
        xx7 xx7Var = (xx7) this.Y.get(hq8Var);
        Objects.requireNonNull(xx7Var);
        if (x(hq8Var) && (wg1VarV = v(hq8Var)) != null) {
            u(xx7Var, wg1VarV, hq8Var.o);
        }
    }

    @Override // defpackage.gq8
    public final void f(hq8 hq8Var) {
        s08.b();
        if (x(hq8Var)) {
            return;
        }
        this.f0.put(hq8Var, Boolean.TRUE);
        wg1 wg1VarV = v(hq8Var);
        if (wg1VarV != null) {
            xx7 xx7Var = (xx7) this.Y.get(hq8Var);
            Objects.requireNonNull(xx7Var);
            u(xx7Var, wg1VarV, hq8Var.o);
        }
    }

    @Override // defpackage.gq8
    public final void i(hq8 hq8Var) {
        s08.b();
        if (x(hq8Var)) {
            xx7 xx7Var = (xx7) this.Y.get(hq8Var);
            Objects.requireNonNull(xx7Var);
            wg1 wg1VarV = v(hq8Var);
            if (wg1VarV != null) {
                u(xx7Var, wg1VarV, hq8Var.o);
                return;
            }
            s08.b();
            xx7Var.a();
            xx7Var.l.a();
        }
    }

    @Override // defpackage.gq8
    public final void k(hq8 hq8Var) {
        s08.b();
        if (x(hq8Var)) {
            this.f0.put(hq8Var, Boolean.FALSE);
            xx7 xx7Var = (xx7) this.Y.get(hq8Var);
            Objects.requireNonNull(xx7Var);
            s08.b();
            xx7Var.a();
            xx7Var.l.a();
        }
    }

    public final xy t(hq8 hq8Var, gf6 gf6Var, cj0 cj0Var, xx7 xx7Var, int i, boolean z) {
        int i2;
        int iN = cj0Var.c().n(i);
        boolean zE = hd8.e(xx7Var.b);
        er8 er8Var = (er8) this.l0.get(hq8Var);
        Objects.requireNonNull(er8Var);
        ts5 ts5VarB = gf6Var.b(er8Var, xx7Var.d, hd8.b(xx7Var.b), z);
        Rect rect = ts5VarB.a;
        Size size = ts5VarB.b;
        int i3 = hd8.i((xx7Var.i + cj0Var.c().n(((i63) hq8Var.h).H(0))) - iN);
        boolean zO = hq8Var.o(cj0Var) ^ zE;
        if (hq8Var instanceof lt5) {
            i2 = 1;
        } else {
            i2 = hq8Var instanceof x53 ? 4 : 2;
        }
        return new xy(UUID.randomUUID(), i2, hq8Var instanceof x53 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 34, rect, hd8.g(i3, size), i3, zO);
    }

    public final HashMap w(xx7 xx7Var, boolean z) {
        HashMap map = new HashMap();
        for (hq8 hq8Var : this.X) {
            er8 er8Var = (er8) this.l0.get(hq8Var);
            Objects.requireNonNull(er8Var);
            Size size = this.m0.b(er8Var, xx7Var.d, hd8.b(xx7Var.b), z).c;
            map.put(hq8Var, size);
            Objects.toString(size);
            Objects.toString(hq8Var);
            hi5.z0("VirtualCameraAdapter");
        }
        return map;
    }

    public final boolean x(hq8 hq8Var) {
        Boolean bool = (Boolean) this.f0.get(hq8Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.Y;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            hq8 hq8Var = (hq8) entry.getKey();
            xx7 xx7Var = (xx7) entry.getValue();
            hq8Var.E(xx7Var.d);
            hq8Var.C(xx7Var.b);
            xy0 xy0VarB = xx7Var.g.b();
            Size size = (Size) map2.get(hq8Var);
            if (size != null) {
                xy0VarB.Z = size;
            }
            hq8Var.H(xy0VarB.b(), null);
            hq8Var.s();
        }
    }
}
