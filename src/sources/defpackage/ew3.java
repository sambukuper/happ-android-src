package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ew3 extends ov3 {
    public static final /* synthetic */ int f0 = 0;
    public final Class Y;
    public final g44 Z = x97.P(w74.X, new bw3(this, 0));

    public ew3(Class cls) {
        this.Y = cls;
    }

    @Override // defpackage.ov3
    public final Collection V() {
        return d02.X;
    }

    @Override // defpackage.ov3
    public final Collection W() {
        return d02.X;
    }

    @Override // defpackage.ov3
    public final Collection X(v15 v15Var) {
        tb6 tb6Var = ((dw3) this.Z.getValue()).e;
        nw3 nw3Var = dw3.g[1];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return ((et4) objInvoke).b(v15Var, x45.Y);
    }

    @Override // defpackage.ov3
    public final fx5 Y(int i) {
        tb6 tb6Var = ((dw3) this.Z.getValue()).e;
        nw3 nw3Var = dw3.g[1];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        et4 et4Var = (et4) objInvoke;
        hm1 hm1Var = et4Var instanceof hm1 ? (hm1) et4Var : null;
        if (hm1Var != null) {
            jl1 jl1Var = hm1Var.b;
            zy5 zy5Var = hm1Var.h;
            aq2 aq2Var = lu3.l;
            aq2Var.getClass();
            cz5 cz5Var = (cz5) ch3.z(zy5Var, aq2Var, i);
            if (cz5Var != null) {
                qd4 qd4Var = new qd4(this);
                w15 w15Var = (w15) jl1Var.Y;
                tz5 tz5Var = zy5Var.i0;
                tz5Var.getClass();
                return (fx5) ms8.g(this.Y, qd4Var, cz5Var, w15Var, new ux4(tz5Var), (s50) jl1Var.h0, g0.m0);
            }
        }
        return null;
    }

    @Override // defpackage.ov3
    public final kz3 Z(int i) {
        jz3 jz3Var = (jz3) wv0.Q0((List) ((dw3) this.Z.getValue()).c.getValue());
        if (jz3Var == null) {
            return null;
        }
        gz3 gz3Var = rt3.b;
        gz3Var.getClass();
        return (kz3) wv0.u0(i, ((rt3) jb5.N(jz3Var.d, gz3Var)).a);
    }

    @Override // defpackage.ov3
    public final Class a0() {
        Class cls = (Class) ((dw3) this.Z.getValue()).f.getValue();
        return cls == null ? this.Y : cls;
    }

    @Override // defpackage.ov3
    public final Collection b0(v15 v15Var) {
        tb6 tb6Var = ((dw3) this.Z.getValue()).e;
        nw3 nw3Var = dw3.g[1];
        Object objInvoke = tb6Var.invoke();
        objInvoke.getClass();
        return ((et4) objInvoke).f(v15Var, x45.Y);
    }

    public final ArrayList e0() {
        List list = (List) ((dw3) this.Z.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList, ((jz3) it.next()).a);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ew3) {
            return this.Y.equals(((ew3) obj).Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.Y.hashCode();
    }

    @Override // defpackage.fs0
    public final Class t() {
        return this.Y;
    }

    public final String toString() {
        return "file class " + ia6.a(this.Y).a();
    }
}
