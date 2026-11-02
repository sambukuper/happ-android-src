package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jm2 implements AutoCloseable, me6 {
    public final cl7 X;
    public final hm2 Y;
    public final oe5 Z = new oe5(se5.b);
    public final LinkedHashMap f0;
    public final Set g0;

    public jm2(cl7 cl7Var, hm2 hm2Var) {
        this.X = cl7Var;
        this.Y = hm2Var;
        ip4 ip4Var = cl7Var.g0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aq4.G(ip4Var.k0));
        Iterator it = ip4Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((dl7) entry.getKey()).a;
            if (cl7Var.g(i) == null) {
                bt.i("Required value was null.");
                throw null;
            }
            cl7Var.k(i).getClass();
            throw null;
        }
        this.f0 = linkedHashMap;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(xv0.Z(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            fl0 fl0VarG = this.X.g(((dl7) it2.next()).a);
            if (fl0VarG == null) {
                bt.i("Required value was null.");
                throw null;
            }
            arrayList.add(fl0VarG);
        }
        this.g0 = wv0.c1(arrayList);
    }

    @Override // defpackage.me6
    public final void C(te6 te6Var, long j, long j2) throws Throwable {
        te6Var.getClass();
        qm2 qm2Var = new qm2(te6Var, j, j2, this.g0);
        this.Z.m(j, j2, j, qm2Var.d);
        gb4 gb4Var = qm2Var.e;
        int iA = gb4Var.a();
        for (int i = 0; i < iA; i++) {
            om2 om2Var = (om2) gb4Var.get(i);
            Object obj = this.f0.get(new dl7(om2Var.c));
            if (obj == null) {
                bt.i("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new pe5(om2Var.d));
            if (obj2 == null) {
                bt.i("Required value was null.");
                return;
            }
            oe5 oe5Var = (oe5) obj2;
            oe5Var.m(j, j2, j2, om2Var);
            if (!te6Var.U().keySet().contains(new dl7(om2Var.c))) {
                oe5Var.g(qm2Var.a);
            }
        }
        km2 km2Var = new km2(qm2Var);
        if (!te6Var.a0()) {
            this.Y.g(te6Var.getRequest());
        }
        km2Var.g();
    }

    @Override // defpackage.me6
    public final void X(te6 te6Var, long j, se6 se6Var) {
        this.Z.k(j, new ve5(10));
        if (se6Var.D()) {
            return;
        }
        for (dl7 dl7Var : te6Var.U().keySet()) {
            int i = dl7Var.a;
            Map map = (Map) this.f0.get(dl7Var);
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((oe5) it.next()).g(j);
                }
            }
        }
    }

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        this.Z.k(j, deVar);
    }

    @Override // defpackage.me6
    public final void a0(ne6 ne6Var) {
        ne6Var.getClass();
        this.Y.g(ne6Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.Y.close();
        this.Z.close();
        Iterator it = this.f0.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((oe5) it2.next()).close();
            }
        }
    }

    @Override // defpackage.me6
    public final void g(te6 te6Var, long j, int i, int i2) {
        Map map = (Map) this.f0.get(new dl7(i));
        if (map == null) {
            return;
        }
        if (this.X.k(i) == null) {
            bt.i("Required value was null.");
        } else {
            if (!map.containsKey(new pe5(i2))) {
                bt.i("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((oe5) it.next()).g(j);
            }
        }
    }
}
