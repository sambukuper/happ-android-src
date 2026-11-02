package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ft4 implements et4 {
    @Override // defpackage.et4
    public Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return d02.X;
    }

    @Override // defpackage.et4
    public Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return d02.X;
    }

    @Override // defpackage.et4
    public Set c() {
        Collection collectionA = a(pk1.p, cl1.i0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof q97) {
                v15 name = ((q97) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.et4
    public Set d() {
        return null;
    }

    @Override // defpackage.et4
    public ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return null;
    }

    @Override // defpackage.et4
    public Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return d02.X;
    }

    @Override // defpackage.et4
    public Set g() {
        Collection collectionA = a(pk1.q, cl1.i0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof pt8) {
                v15 name = ((pt8) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
