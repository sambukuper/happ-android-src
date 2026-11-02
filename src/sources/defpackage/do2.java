package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class do2 extends m0 {
    public static final qs0 n0 = new qs0(ug7.k, v15.e("Function"));
    public static final qs0 o0 = new qs0(ug7.i, v15.e("KFunction"));
    public final ve4 g0;
    public final tf5 h0;
    public final so2 i0;
    public final int j0;
    public final co2 k0;
    public final fo2 l0;
    public final List m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do2(ve4 ve4Var, oa0 oa0Var, so2 so2Var, int i) {
        super(ve4Var, so2Var.a(i));
        oa0Var.getClass();
        this.g0 = ve4Var;
        this.h0 = oa0Var;
        this.i0 = so2Var;
        this.j0 = i;
        this.k0 = new co2(this);
        this.l0 = new fo2(ve4Var, this, (byte) 0);
        ArrayList arrayList = new ArrayList();
        kf3 kf3Var = new kf3(1, i, 1);
        ArrayList arrayList2 = new ArrayList(xv0.Z(kf3Var, 10));
        Iterator it = kf3Var.iterator();
        while (true) {
            jf3 jf3Var = (jf3) it;
            if (!jf3Var.Z) {
                break;
            }
            arrayList.add(ii8.K0(this, rt8.IN_VARIANCE, v15.e("P" + jf3Var.nextInt()), arrayList.size(), this.g0));
            arrayList2.add(dn8.a);
        }
        arrayList.add(ii8.K0(this, rt8.OUT_VARIANCE, v15.e("R"), arrayList.size(), this.g0));
        this.m0 = wv0.Y0(arrayList);
        so2 so2Var2 = this.i0;
        eo2.X.getClass();
        so2Var2.getClass();
        if (so2Var2.equals(oo2.d) || so2Var2.equals(ro2.d) || so2Var2.equals(po2.d)) {
            return;
        }
        so2Var2.equals(qo2.d);
    }

    @Override // defpackage.sx4
    public final Collection B() {
        return d02.X;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.e;
        fl1Var.getClass();
        return fl1Var;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        return us0.Y;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return oy1.f0;
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        return ke7.G;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean k() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        return this.m0;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        return this.k0;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        return fx4.g0;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return false;
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        return dt4.b;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        return this.h0;
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        return this.l0;
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return null;
    }

    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        return null;
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return false;
    }
}
