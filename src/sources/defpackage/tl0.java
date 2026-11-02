package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements lg0 {
    public final b7 X;
    public final b7 Y;
    public final hr8 Z;
    public final wi0 f0;
    public final vh0 i0;
    public final ih0 l0;
    public hq8 p0;
    public gl7 q0;
    public final dq r0;
    public final dq s0;
    public final xd6 u0;
    public final ArrayList g0 = new ArrayList();
    public final ArrayList h0 = new ArrayList();
    public List j0 = Collections.EMPTY_LIST;
    public Range k0 = iz.h;
    public final Object m0 = new Object();
    public boolean n0 = true;
    public l11 o0 = null;
    public final xd6 t0 = new xd6((byte) 11);

    public tl0(cj0 cj0Var, cj0 cj0Var2, a7 a7Var, a7 a7Var2, dq dqVar, dq dqVar2, vh0 vh0Var, xd6 xd6Var, hr8 hr8Var) {
        this.l0 = a7Var.Z;
        this.X = new b7(cj0Var, a7Var);
        if (cj0Var2 == null || a7Var2 == null) {
            this.Y = null;
        } else {
            this.Y = new b7(cj0Var2, a7Var2);
        }
        this.r0 = dqVar;
        this.s0 = dqVar2;
        this.i0 = vh0Var;
        this.Z = hr8Var;
        this.f0 = z68.C(a7Var, a7Var2);
        this.u0 = xd6Var;
    }

    public static void D(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            hq8 hq8Var = (hq8) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                hq8Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            hq8Var.g = hashSet;
        }
    }

    public static ArrayList E(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hq8) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw p61.k(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap i(LinkedHashSet linkedHashSet, jf6 jf6Var) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            map.put(hq8Var, hq8Var.g);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = jf6Var != null ? jf6Var.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            hq8Var.g = hashSet;
        }
        return map;
    }

    public static Matrix u(Rect rect, Size size) {
        mb6.o(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static x53 v() {
        h53 h53Var = new h53((byte) 1);
        zx zxVar = u18.I;
        k05 k05Var = h53Var.Y;
        k05Var.o(zxVar, "ImageCapture-Extra");
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        Integer num = (Integer) k05Var.a(y53.f0, null);
        if (num != null) {
            k05Var.o(e63.p, num);
        } else {
            u53 u53Var = x53.A;
            zx zxVar2 = y53.g0;
            if (Objects.equals(k05Var.a(zxVar2, null), 2)) {
                k05Var.o(e63.p, 32);
            } else if (Objects.equals(k05Var.a(zxVar2, null), 3)) {
                k05Var.o(e63.p, 32);
                k05Var.o(e63.q, numValueOf);
            } else if (Objects.equals(k05Var.a(zxVar2, null), 1)) {
                k05Var.o(e63.p, 4101);
                k05Var.o(e63.r, px1.c);
            } else {
                k05Var.o(e63.p, numValueOf);
            }
        }
        y53 y53Var = new y53(qd5.c(k05Var));
        i63.G(y53Var);
        x53 x53Var = new x53(y53Var);
        Size size = (Size) k05Var.a(i63.w, null);
        if (size != null) {
            x53Var.t = new Rational(size.getWidth(), size.getHeight());
        }
        mb6.r((Executor) k05Var.a(ji3.C, ki3.a()), "The IO executor can't be null");
        zx zxVar3 = y53.Z;
        if (k05Var.X.containsKey(zxVar3)) {
            Integer num2 = (Integer) k05Var.d(zxVar3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                u52.j(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && k05Var.a(y53.k0, null) == null) {
                bt.q("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return x53Var;
    }

    public static HashMap y(ArrayList arrayList, hr8 hr8Var, hr8 hr8Var2, Range range) {
        er8 er8VarG;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hq8 hq8Var = (hq8) it.next();
            if (hq8Var instanceof gl7) {
                gl7 gl7Var = (gl7) hq8Var;
                mt5 mt5Var = new mt5(qd5.c(new h53((byte) 2).Y));
                i63.G(mt5Var);
                lt5 lt5Var = new lt5(mt5Var);
                lt5Var.r = lt5.y;
                er8 er8VarG2 = lt5Var.g(false, hr8Var);
                if (er8VarG2 == null) {
                    er8VarG = null;
                } else {
                    k05 k05VarK = k05.k(er8VarG2);
                    k05VarK.w(u18.J);
                    er8VarG = ((fg0) gl7Var.m(k05VarK)).d();
                }
            } else {
                er8VarG = hq8Var.g(false, hr8Var);
            }
            er8 er8VarG3 = hq8Var.g(true, hr8Var2);
            k05 k05VarK2 = er8VarG3 != null ? k05.k(er8VarG3) : k05.j();
            k05VarK2.o(er8.Q, 0);
            if (!iz.h.equals(range)) {
                k05VarK2.l(er8.R, k11.Y, range);
                k05VarK2.o(er8.S, Boolean.TRUE);
            }
            er8 er8VarD = hq8Var.m(k05VarK2).d();
            pl0 pl0Var = new pl0();
            pl0Var.a = er8VarG;
            pl0Var.b = er8VarD;
            map.put(hq8Var, pl0Var);
        }
        return map;
    }

    public final List A() {
        ArrayList arrayList;
        synchronized (this.m0) {
            arrayList = new ArrayList(this.g0);
        }
        return arrayList;
    }

    public final void B() {
        synchronized (this.m0) {
            this.l0.u();
        }
    }

    public final void C(ArrayList arrayList) {
        synchronized (this.m0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((hq8) it.next()).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.g0);
            linkedHashSet.removeAll(arrayList);
            f(t(linkedHashSet, this.Y != null));
        }
    }

    @Override // defpackage.lg0
    public final xi0 c() {
        throw null;
    }

    public final void d(Collection collection, jf6 jf6Var) {
        Objects.toString(collection);
        Objects.toString(jf6Var);
        hi5.z0("CameraUseCaseAdapter");
        synchronized (this.m0) {
            try {
                b7 b7Var = this.X;
                ih0 ih0Var = this.l0;
                b7Var.j(ih0Var);
                b7 b7Var2 = this.Y;
                if (b7Var2 != null) {
                    b7Var2.j(ih0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.g0);
                linkedHashSet.addAll(collection);
                HashMap mapI = i(linkedHashSet, jf6Var);
                try {
                    f(t(linkedHashSet, this.Y != null));
                } catch (IllegalArgumentException e) {
                    D(mapI);
                    throw new nl0(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(wc0 wc0Var) {
        Map map = wc0Var.i.a;
        ArrayList<hq8> arrayList = wc0Var.b;
        synchronized (this.m0) {
            try {
                for (hq8 hq8Var : arrayList) {
                    Rect rectH = this.X.Y.X.h();
                    iz izVar = (iz) map.get(hq8Var);
                    izVar.getClass();
                    hq8Var.C(u(rectH, izVar.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.j0;
        ArrayList arrayList2 = wc0Var.b;
        LinkedHashSet linkedHashSet = wc0Var.a;
        ArrayList arrayListE = E(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListE2 = E(arrayList3, arrayListE);
        if (!arrayListE2.isEmpty()) {
            arrayListE2.toString();
            hi5.z0("CameraUseCaseAdapter");
        }
        Iterator it = wc0Var.e.iterator();
        while (it.hasNext()) {
            ((hq8) it.next()).F(this.X);
        }
        this.X.n(wc0Var.e);
        if (this.Y != null) {
            for (hq8 hq8Var2 : wc0Var.e) {
                b7 b7Var = this.Y;
                Objects.requireNonNull(b7Var);
                hq8Var2.F(b7Var);
            }
            b7 b7Var2 = this.Y;
            Objects.requireNonNull(b7Var2);
            b7Var2.n(wc0Var.e);
        }
        if (wc0Var.e.isEmpty()) {
            for (hq8 hq8Var3 : wc0Var.d) {
                Map map2 = wc0Var.i.a;
                if (map2.containsKey(hq8Var3)) {
                    iz izVar2 = (iz) map2.get(hq8Var3);
                    Objects.requireNonNull(izVar2);
                    l11 l11Var = izVar2.f;
                    if (l11Var != null) {
                        f57 f57Var = hq8Var3.o;
                        qd5 qd5Var = f57Var.g.b;
                        Objects.requireNonNull(l11Var);
                        if (l11Var.b().size() == f57Var.g.b.b().size()) {
                            Iterator it2 = l11Var.b().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    zx zxVar = (zx) it2.next();
                                    if (!qd5Var.X.containsKey(zxVar) || !Objects.equals(qd5Var.d(zxVar), l11Var.d(zxVar))) {
                                    }
                                }
                            }
                        }
                        hq8Var3.i = hq8Var3.z(l11Var);
                        if (this.n0) {
                            this.X.i(hq8Var3);
                            b7 b7Var3 = this.Y;
                            if (b7Var3 != null) {
                                b7Var3.i(hq8Var3);
                            }
                        }
                    }
                }
            }
        }
        for (hq8 hq8Var4 : wc0Var.c) {
            pl0 pl0Var = (pl0) wc0Var.h.get(hq8Var4);
            Objects.requireNonNull(pl0Var);
            b7 b7Var4 = this.Y;
            b7 b7Var5 = this.X;
            er8 er8Var = pl0Var.a;
            if (b7Var4 != null) {
                hq8Var4.b(b7Var5, b7Var4, er8Var, pl0Var.b);
                iz izVar3 = (iz) wc0Var.i.a.get(hq8Var4);
                izVar3.getClass();
                il7 il7Var = wc0Var.j;
                il7Var.getClass();
                hq8Var4.H(izVar3, (iz) il7Var.a.get(hq8Var4));
            } else {
                hq8Var4.b(b7Var5, null, er8Var, pl0Var.b);
                iz izVar4 = (iz) wc0Var.i.a.get(hq8Var4);
                izVar4.getClass();
                hq8Var4.H(izVar4, null);
            }
        }
        if (this.n0) {
            this.X.o(wc0Var.c);
            b7 b7Var6 = this.Y;
            if (b7Var6 != null) {
                b7Var6.o(wc0Var.c);
            }
        }
        Iterator it3 = wc0Var.c.iterator();
        while (it3.hasNext()) {
            ((hq8) it3.next()).s();
        }
        this.g0.clear();
        this.g0.addAll(wc0Var.a);
        this.h0.clear();
        this.h0.addAll(wc0Var.b);
        this.p0 = wc0Var.g;
        this.q0 = wc0Var.f;
    }

    public final void k() {
        synchronized (this.m0) {
            try {
                if (!this.n0) {
                    if (!this.h0.isEmpty()) {
                        this.X.j(this.l0);
                        b7 b7Var = this.Y;
                        if (b7Var != null) {
                            b7Var.j(this.l0);
                        }
                    }
                    this.X.o(this.h0);
                    b7 b7Var2 = this.Y;
                    if (b7Var2 != null) {
                        b7Var2.o(this.h0);
                    }
                    synchronized (this.m0) {
                        try {
                            l11 l11Var = this.o0;
                            if (l11Var != null) {
                                this.X.Z.c(l11Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.h0.iterator();
                    while (it.hasNext()) {
                        ((hq8) it.next()).s();
                    }
                    this.n0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02da  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        if (r3 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        return t(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wc0 t(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.t(java.util.LinkedHashSet, boolean):wc0");
    }

    public final void w() {
        synchronized (this.m0) {
            try {
                if (this.n0) {
                    this.X.n(new ArrayList(this.h0));
                    b7 b7Var = this.Y;
                    if (b7Var != null) {
                        b7Var.n(new ArrayList(this.h0));
                    }
                    synchronized (this.m0) {
                        z6 z6Var = this.X.Z;
                        this.o0 = z6Var.b.g();
                        z6Var.h();
                    }
                    this.n0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int x() {
        boolean z;
        synchronized (this.m0) {
            try {
                vh0 vh0Var = this.i0;
                synchronized (vh0Var.b) {
                    z = vh0Var.e;
                }
                return z == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet z(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.m0) {
            Iterator it = this.j0.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            hq8 hq8Var = (hq8) it2.next();
            mb6.o(!(hq8Var instanceof gl7), "Only support one level of sharing for now.");
            Iterator it3 = hq8Var.l().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(hq8Var);
                    break;
                }
            }
        }
        return hashSet;
    }
}
