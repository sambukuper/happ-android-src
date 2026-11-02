package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class co2 extends n0 {
    public final /* synthetic */ do2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(do2 do2Var) {
        super(do2Var.g0);
        this.Z = do2Var;
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return true;
    }

    @Override // defpackage.i3
    public final Collection a() {
        List<qs0> listL;
        do2 do2Var = this.Z;
        int i = do2Var.j0;
        so2 so2Var = do2Var.i0;
        oo2 oo2Var = oo2.d;
        if (dh3.f(so2Var, oo2Var)) {
            listL = i21.K(do2.n0);
        } else if (dh3.f(so2Var, po2.d)) {
            listL = i21.L(do2.o0, new qs0(ug7.k, oo2Var.a(i)));
        } else {
            ro2 ro2Var = ro2.d;
            if (dh3.f(so2Var, ro2Var)) {
                listL = i21.K(do2.n0);
            } else {
                if (!dh3.f(so2Var, qo2.d)) {
                    int i2 = h7.a;
                    bt.i("should not be called");
                    return null;
                }
                listL = i21.L(do2.o0, new qs0(ug7.f, ro2Var.a(i)));
            }
        }
        vx4 vx4VarP = ((uf5) do2Var.h0).p();
        ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
        for (qs0 qs0Var : listL) {
            sx4 sx4VarM = oc.m(vx4VarP, qs0Var);
            if (sx4VarM == null) {
                throw new IllegalStateException(("Built-in class " + qs0Var + " not found").toString());
            }
            List listV0 = wv0.V0(sx4VarM.l().g().size(), do2Var.m0);
            ArrayList arrayList2 = new ArrayList(xv0.Z(listV0, 10));
            Iterator it = listV0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new wg7(((hi8) it.next()).X()));
            }
            ch8.Y.getClass();
            arrayList.add(dh3.M(ch8.Z, sx4VarM, arrayList2));
        }
        return wv0.Y0(arrayList);
    }

    @Override // defpackage.i3
    public final lh4 d() {
        return lh4.G0;
    }

    @Override // defpackage.lh8
    public final List g() {
        return this.Z.m0;
    }

    @Override // defpackage.n0
    /* JADX INFO: renamed from: k */
    public final sx4 x() {
        return this.Z;
    }

    public final String toString() {
        return this.Z.toString();
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return this.Z;
    }
}
