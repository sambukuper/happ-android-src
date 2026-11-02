package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements ld1 {
    public final ta6 a;
    public final gn2 b;
    public final f0 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public js0(ta6 ta6Var, gn2 gn2Var) {
        ta6Var.getClass();
        this.a = ta6Var;
        this.b = gn2Var;
        f0 f0Var = new f0(this, (byte) 10);
        this.c = f0Var;
        la2 la2Var = new la2(new hu(ta6Var.d(), (byte) 1), true, f0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ka2 ka2Var = new ka2(la2Var);
        while (ka2Var.hasNext()) {
            Object next = ka2Var.next();
            v15 v15VarC = ((cb6) next).c();
            Object arrayList = linkedHashMap.get(v15VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(v15VarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        la2 la2Var2 = new la2(new hu(this.a.b(), (byte) 1), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ka2 ka2Var2 = new ka2(la2Var2);
        while (ka2Var2.hasNext()) {
            Object next2 = ka2Var2.next();
            linkedHashMap2.put(((za6) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        gn2 gn2Var2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) gn2Var2.B(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iG = aq4.G(xv0.Z(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((fb6) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.ld1
    public final Set a() {
        la2 la2Var = new la2(new hu(this.a.d(), (byte) 1), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ka2 ka2Var = new ka2(la2Var);
        while (ka2Var.hasNext()) {
            linkedHashSet.add(((cb6) ka2Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.ld1
    public final fb6 b(v15 v15Var) {
        v15Var.getClass();
        return (fb6) this.f.get(v15Var);
    }

    @Override // defpackage.ld1
    public final Collection c(v15 v15Var) {
        List list = (List) this.d.get(v15Var);
        return list != null ? list : d02.X;
    }

    @Override // defpackage.ld1
    public final za6 d(v15 v15Var) {
        return (za6) this.e.get(v15Var);
    }

    @Override // defpackage.ld1
    public final Set e() {
        return this.f.keySet();
    }

    @Override // defpackage.ld1
    public final Set f() {
        la2 la2Var = new la2(new hu(this.a.b(), (byte) 1), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ka2 ka2Var = new ka2(la2Var);
        while (ka2Var.hasNext()) {
            linkedHashSet.add(((za6) ka2Var.next()).c());
        }
        return linkedHashSet;
    }
}
