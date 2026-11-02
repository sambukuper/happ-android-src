package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b54 extends i54 {
    public final db6 n;
    public final v44 o;
    public final se4 p;
    public final vt1 q;

    public b54(z47 z47Var, db6 db6Var, v44 v44Var) {
        super(z47Var, null);
        this.n = db6Var;
        this.o = v44Var;
        ve4 ve4Var = (ve4) ((c6) z47Var.Y).f0;
        this.p = new se4(ve4Var, new zk3(z47Var, this, (byte) 13));
        this.q = ve4Var.c(new d3(this, z47Var, (byte) 12));
    }

    @Override // defpackage.f54, defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        if (!pk1Var.a(pk1.l | pk1.e)) {
            return d02.X;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            ed1 ed1Var = (ed1) obj;
            if (ed1Var instanceof sx4) {
                v15 name = ((sx4) ed1Var).getName();
                name.getClass();
                if (((Boolean) gn2Var.B(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return v(v15Var, null);
    }

    @Override // defpackage.f54, defpackage.ft4, defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return d02.X;
    }

    @Override // defpackage.f54
    public final Set h(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        if (!pk1Var.a(pk1.e)) {
            return m02.X;
        }
        Set set = (Set) this.p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(v15.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.f54
    public final ed1 q() {
        return this.o;
    }

    public final sx4 v(v15 v15Var, ta6 ta6Var) {
        v15 v15Var2 = hf7.a;
        v15Var.getClass();
        String strB = v15Var.b();
        strB.getClass();
        if (strB.length() <= 0 || v15Var.Y) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (ta6Var == null && set != null && !set.contains(v15Var.b())) {
            return null;
        }
        return (sx4) this.q.B(new x44(v15Var, ta6Var));
    }
}
