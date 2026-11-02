package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x53 extends hq8 {
    public static final u53 A = new u53();
    public final int q;
    public final AtomicReference r;
    public final int s;
    public Rational t;
    public final ix6 u;
    public b57 v;
    public f63 w;
    public g18 x;
    public c57 y;
    public final k42 z;

    public x53(y53 y53Var) {
        super(y53Var);
        this.r = new AtomicReference(null);
        this.s = -1;
        this.t = null;
        this.z = new k42();
        y53 y53Var2 = (y53) this.h;
        zx zxVar = y53.Y;
        if (y53Var2.h(zxVar)) {
            this.q = ((Integer) y53Var2.d(zxVar)).intValue();
        } else {
            this.q = 1;
        }
        ((Integer) y53Var2.a(y53.j0, 0)).getClass();
        this.u = new ix6((v53) y53Var2.a(y53.k0, null));
    }

    public static boolean L(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hq8
    public final iz A(iz izVar, iz izVar2) {
        Objects.toString(izVar);
        Objects.toString(izVar2);
        hi5.z0("ImageCapture");
        b57 b57VarJ = J(f(), (y53) this.h, izVar);
        this.v = b57VarJ;
        Object[] objArr = {b57VarJ.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        q();
        return izVar;
    }

    @Override // defpackage.hq8
    public final void B() {
        ix6 ix6Var = this.u;
        ix6Var.b();
        ix6Var.a();
        g18 g18Var = this.x;
        if (g18Var != null) {
            g18Var.a();
        }
        I(false);
        e().e(null);
    }

    public final void I(boolean z) {
        g18 g18Var;
        s08.b();
        c57 c57Var = this.y;
        if (c57Var != null) {
            c57Var.b();
            this.y = null;
        }
        f63 f63Var = this.w;
        if (f63Var != null) {
            f63Var.l();
            this.w = null;
        }
        if (!z && (g18Var = this.x) != null) {
            g18Var.a();
            this.x = null;
        }
        e().a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x003e  */
    public final b57 J(String str, y53 y53Var, iz izVar) {
        l11 l11VarA;
        HashSet hashSet;
        v73 v73Var;
        boolean zContains;
        byte b = 0;
        s08.b();
        Objects.toString(izVar);
        Size size = izVar.a;
        cj0 cj0VarD = d();
        Objects.requireNonNull(cj0VarD);
        boolean z = !cj0VarD.q();
        CameraCharacteristics cameraCharacteristics = null;
        if (this.w != null) {
            mb6.s(null, z);
            this.w.l();
        }
        xi0 xi0VarC = d().c();
        if ((xi0VarC instanceof a7) && (l11VarA = ((hr8) ((a7) xi0VarC).Z.a(ih0.c, hr8.a)).a(gr8.X, 1)) != null) {
            zx zxVar = i63.z;
            qd5 qd5Var = (qd5) l11VarA;
            if (qd5Var.X.containsKey(zxVar)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) qd5Var.d(zxVar)).iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            if (xi0VarC != null ? ((aj0) xi0VarC).w().contains(4101) : false) {
                hashSet.add(1);
            }
            if (xi0VarC != null) {
                aj0 aj0Var = (aj0) xi0VarC;
                if (aj0Var.v().contains(3)) {
                    zContains = aj0Var.w().contains(32);
                } else {
                    zContains = false;
                }
            } else {
                zContains = false;
            }
            if (zContains) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        er8 er8Var = this.h;
        zx zxVar2 = y53.g0;
        Integer num = (Integer) er8Var.a(zxVar2, 0);
        num.getClass();
        boolean zContains2 = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.h.a(zxVar2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        mb6.o(zContains2, sb.toString());
        if (((Boolean) this.h.a(y53.l0, Boolean.FALSE)).booleanValue()) {
            y53Var.n();
            d().h().u();
        }
        if (d() != null) {
            try {
                Object objO = d().s().o();
                if (objO instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objO;
                }
            } catch (Exception unused) {
            }
        }
        this.w = new f63(y53Var, size, cameraCharacteristics, z);
        g18 g18Var = this.x;
        if (g18Var == null) {
            Objects.requireNonNull((cr8) this.h.a(er8.d0, new cr8()));
            g18 g18Var2 = new g18(this.z);
            this.x = g18Var2;
            g18Var = g18Var2;
        }
        f63 f63Var = this.w;
        s08.b();
        g18Var.Y = f63Var;
        f63Var.getClass();
        s08.b();
        lr lrVar = (lr) f63Var.Z;
        s08.b();
        mb6.s("The ImageReader is not initialized.", ((z76) lrVar.Y) != null);
        z76 z76Var = (z76) lrVar.Y;
        synchronized (z76Var.Z) {
            z76Var.h0 = g18Var;
        }
        f63 f63Var2 = this.w;
        b57 b57VarD = b57.d((y53) f63Var2.Y, izVar.a);
        xx xxVar = (xx) f63Var2.f0;
        v73 v73Var2 = xxVar.a;
        Objects.requireNonNull(v73Var2);
        px1 px1Var = px1.d;
        y5 y5VarA = fz.a(v73Var2);
        y5VarA.h0 = px1Var;
        b57VarD.a.add(y5VarA.u());
        if (xxVar.f.size() > 1 && (v73Var = xxVar.b) != null) {
            y5 y5VarA2 = fz.a(v73Var);
            y5VarA2.h0 = px1Var;
            b57VarD.a.add(y5VarA2.u());
        }
        v73 v73Var3 = xxVar.c;
        if (v73Var3 != null) {
            b57VarD.i = fz.a(v73Var3).u();
        }
        b57VarD.h = izVar.d;
        if (this.q == 2 && !izVar.g) {
            e().b(b57VarD);
        }
        l11 l11Var = izVar.f;
        if (l11Var != null) {
            b57VarD.b.d(l11Var);
        }
        c57 c57Var = this.y;
        if (c57Var != null) {
            c57Var.b();
        }
        c57 c57Var2 = new c57(new t53(this, b));
        this.y = c57Var2;
        b57VarD.f = c57Var2;
        return b57VarD;
    }

    public final int K() {
        int iIntValue;
        synchronized (this.r) {
            iIntValue = this.s;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((y53) this.h).a(y53.Z, 2)).intValue();
            }
        }
        return iIntValue;
    }

    @Override // defpackage.hq8
    public final er8 g(boolean z, hr8 hr8Var) {
        A.getClass();
        y53 y53Var = u53.a;
        l11 l11VarA = hr8Var.a(y53Var.s(), this.q);
        if (z) {
            l11VarA = l11.q(l11VarA, y53Var);
        }
        if (l11VarA == null) {
            return null;
        }
        return new y53(qd5.c(((h53) m(l11VarA)).Y));
    }

    @Override // defpackage.hq8
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.hq8
    public final dr8 m(l11 l11Var) {
        return new h53(k05.k(l11Var), (byte) 1);
    }

    @Override // defpackage.hq8
    public final boolean n() {
        return true;
    }

    @Override // defpackage.hq8
    public final void t() {
        mb6.r(d(), "Attached camera cannot be null");
        if (K() == 3) {
            cj0 cj0VarD = d();
            if ((cj0VarD != null ? cj0VarD.c().j() : -1) == 0) {
                return;
            }
            bt.q("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // defpackage.hq8
    public final void u() {
        hi5.z0("ImageCapture");
        synchronized (this.r) {
            try {
                if (this.r.get() == null) {
                    e().d(K());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e().e(this.u);
    }

    @Override // defpackage.hq8
    public final er8 v(aj0 aj0Var, dr8 dr8Var) {
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        HashSet<ru2> hashSet = this.g;
        boolean z = false;
        if (hashSet != null) {
            boolean z2 = false;
            for (ru2 ru2Var : hashSet) {
                if (ru2Var instanceof c63) {
                    z2 = ((c63) ru2Var).a;
                }
            }
            dr8Var.b().o(y53.g0, Integer.valueOf(z2 ? 1 : 0));
        }
        if (aj0Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            k05 k05VarB = dr8Var.b();
            zx zxVar = y53.i0;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(k05VarB.a(zxVar, bool2))) {
                hi5.z0("ImageCapture");
            } else {
                hi5.z0("ImageCapture");
                dr8Var.b().o(zxVar, bool2);
            }
        }
        k05 k05VarB2 = dr8Var.b();
        Boolean bool3 = Boolean.TRUE;
        zx zxVar2 = y53.i0;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(k05VarB2.a(zxVar2, bool4))) {
            if (d() != null) {
                d().h().u();
            }
            Integer num = (Integer) k05VarB2.a(y53.f0, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                hi5.z0("ImageCapture");
            }
            if (!z) {
                hi5.z0("ImageCapture");
                k05VarB2.o(zxVar2, bool4);
            }
        }
        Integer num2 = (Integer) dr8Var.b().a(y53.f0, null);
        if (num2 != null) {
            if (d() != null) {
                d().h().u();
            }
            dr8Var.b().o(e63.p, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            k05 k05VarB3 = dr8Var.b();
            zx zxVar3 = y53.g0;
            if (Objects.equals(k05VarB3.a(zxVar3, null), 2)) {
                dr8Var.b().o(e63.p, 32);
            } else if (Objects.equals(dr8Var.b().a(zxVar3, null), 3)) {
                dr8Var.b().o(e63.p, 32);
                dr8Var.b().o(e63.q, numValueOf);
            } else if (Objects.equals(dr8Var.b().a(zxVar3, null), 1)) {
                dr8Var.b().o(e63.p, 4101);
                dr8Var.b().o(e63.r, px1.c);
            } else if (z) {
                dr8Var.b().o(e63.p, 35);
            } else {
                List list = (List) dr8Var.b().a(i63.z, null);
                if (list == null || L(PSKKeyManager.MAX_KEY_LENGTH_BYTES, list)) {
                    dr8Var.b().o(e63.p, numValueOf);
                } else if (L(35, list)) {
                    dr8Var.b().o(e63.p, 35);
                }
            }
        }
        return dr8Var.d();
    }

    @Override // defpackage.hq8
    public final void w(int i) {
        Rational rational;
        int iH = ((i63) this.h).H(0);
        if (!D(i) || this.t == null) {
            return;
        }
        int iAbs = Math.abs(w39.m0(i) - w39.m0(iH));
        Rational rational2 = this.t;
        if (iAbs == 90 || iAbs == 270) {
            if (rational2 != null) {
                rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
            }
            this.t = rational2;
        }
        rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
        rational2 = rational;
        this.t = rational2;
    }

    @Override // defpackage.hq8
    public final void y() {
        ix6 ix6Var = this.u;
        ix6Var.b();
        ix6Var.a();
        g18 g18Var = this.x;
        if (g18Var != null) {
            g18Var.a();
        }
    }

    @Override // defpackage.hq8
    public final iz z(l11 l11Var) {
        this.v.a(l11Var);
        Object[] objArr = {this.v.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        xy0 xy0VarB = this.i.b();
        xy0VarB.i0 = l11Var;
        return xy0VarB.b();
    }
}
