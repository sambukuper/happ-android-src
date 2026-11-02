package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ot8 extends qt8 implements zg5 {
    public final int j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final t14 n0;
    public final ot8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot8(jd0 jd0Var, ot8 ot8Var, int i, sm smVar, v15 v15Var, t14 t14Var, boolean z, boolean z2, boolean z3, t14 t14Var2, ke7 ke7Var) {
        super(jd0Var, smVar, v15Var, t14Var, ke7Var);
        jd0Var.getClass();
        smVar.getClass();
        v15Var.getClass();
        t14Var.getClass();
        ke7Var.getClass();
        this.j0 = i;
        this.k0 = z;
        this.l0 = z2;
        this.m0 = z3;
        this.n0 = t14Var2;
        this.o0 = ot8Var == null ? this : ot8Var;
    }

    @Override // defpackage.pt8
    public final s21 H() {
        return null;
    }

    public ot8 H0(ko2 ko2Var, v15 v15Var, int i) {
        sm annotations = getAnnotations();
        annotations.getClass();
        t14 t14VarC = c();
        t14VarC.getClass();
        return new ot8(ko2Var, null, i, annotations, v15Var, t14VarC, I0(), this.l0, this.m0, this.n0, ke7.G);
    }

    public final boolean I0() {
        return this.k0 && ((ld0) p()).r() != 2;
    }

    @Override // defpackage.ed1
    public final Object J(id1 id1Var, Object obj) {
        return id1Var.e(this, obj);
    }

    @Override // defpackage.hd1, defpackage.ed1
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final jd0 p() {
        ed1 ed1VarP = super.p();
        ed1VarP.getClass();
        return (jd0) ed1VarP;
    }

    @Override // defpackage.hd1, defpackage.fd1, defpackage.ed1
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final ot8 a() {
        ot8 ot8Var = this.o0;
        return ot8Var == this ? this : ot8Var.a();
    }

    @Override // defpackage.pt8
    public final boolean R() {
        return false;
    }

    @Override // defpackage.jd1, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.f;
        fl1Var.getClass();
        return fl1Var;
    }

    @Override // defpackage.ew7
    public final gd1 g(wi8 wi8Var) {
        wi8Var.getClass();
        if (wi8Var.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jd0
    public final Collection q() {
        Collection collectionQ = p().q();
        collectionQ.getClass();
        Collection collection = collectionQ;
        ArrayList arrayList = new ArrayList(xv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ot8) ((jd0) it.next()).L().get(this.j0));
        }
        return arrayList;
    }
}
