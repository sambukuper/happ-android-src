package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fw7 implements et4 {
    public final et4 b;
    public final wi8 c;
    public HashMap d;
    public final vz7 e;

    public fw7(et4 et4Var, wi8 wi8Var) {
        et4Var.getClass();
        wi8Var.getClass();
        this.b = et4Var;
        new vz7(new zk3(wi8Var, (byte) 24));
        this.c = new wi8(z91.U(wi8Var.a));
        this.e = new vz7(new zk3(this, (byte) 25));
    }

    @Override // defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return i(this.b.b(v15Var, x45Var));
    }

    @Override // defpackage.et4
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.et4
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        ot0 ot0VarE = this.b.e(v15Var, x45Var);
        if (ot0VarE != null) {
            return (ot0) h(ot0VarE);
        }
        return null;
    }

    @Override // defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return i(this.b.f(v15Var, x45Var));
    }

    @Override // defpackage.et4
    public final Set g() {
        return this.b.g();
    }

    public final ed1 h(ed1 ed1Var) {
        wi8 wi8Var = this.c;
        if (wi8Var.a.e()) {
            return ed1Var;
        }
        HashMap map = this.d;
        if (map == null) {
            map = new HashMap();
            this.d = map;
        }
        Object objG = map.get(ed1Var);
        if (objG == null) {
            if (!(ed1Var instanceof ew7)) {
                b61.o(ed1Var, "Unknown descriptor in scope: ");
                return null;
            }
            objG = ((ew7) ed1Var).g(wi8Var);
            if (objG == null) {
                xw3.l("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", ed1Var, " substitution fails");
                return null;
            }
            map.put(ed1Var, objG);
        }
        return (ed1) objG;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((ed1) it.next()));
        }
        return linkedHashSet;
    }
}
