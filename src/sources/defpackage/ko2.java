package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 extends q97 {
    public ko2(ed1 ed1Var, ko2 ko2Var, int i, boolean z) {
        super(ed1Var, ko2Var, oy1.f0, id5.g, i, ke7.G);
        this.q0 = true;
        this.y0 = z;
        this.z0 = false;
    }

    @Override // defpackage.jo2, defpackage.ho2
    public final boolean F() {
        return false;
    }

    @Override // defpackage.q97, defpackage.jo2
    public final jo2 I0(int i, sm smVar, ed1 ed1Var, ho2 ho2Var, v15 v15Var, ke7 ke7Var) {
        ed1Var.getClass();
        if (i == 0) {
            throw null;
        }
        smVar.getClass();
        return new ko2(ed1Var, (ko2) ho2Var, i, this.y0);
    }

    @Override // defpackage.jo2
    public final jo2 J0(io2 io2Var) {
        v15 v15Var;
        ko2 ko2Var = (ko2) super.J0(io2Var);
        if (ko2Var == null) {
            return null;
        }
        List listL = ko2Var.L();
        listL.getClass();
        if (listL.isEmpty()) {
            return ko2Var;
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            t14 t14VarC = ((ot8) it.next()).c();
            t14VarC.getClass();
            if (w79.u(t14VarC) != null) {
                List listL2 = ko2Var.L();
                listL2.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(listL2, 10));
                Iterator it2 = listL2.iterator();
                while (it2.hasNext()) {
                    t14 t14VarC2 = ((ot8) it2.next()).c();
                    t14VarC2.getClass();
                    arrayList.add(w79.u(t14VarC2));
                }
                int size = ko2Var.L().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listL3 = ko2Var.L();
                    listL3.getClass();
                    ArrayList<qg5> arrayListE1 = wv0.e1(arrayList, listL3);
                    if (arrayListE1.isEmpty()) {
                        return ko2Var;
                    }
                    for (qg5 qg5Var : arrayListE1) {
                        if (!dh3.f((v15) qg5Var.X, ((ot8) qg5Var.Y).getName())) {
                        }
                    }
                    return ko2Var;
                }
                List<ot8> listL4 = ko2Var.L();
                listL4.getClass();
                ArrayList arrayList2 = new ArrayList(xv0.Z(listL4, 10));
                for (ot8 ot8Var : listL4) {
                    v15 name = ot8Var.getName();
                    name.getClass();
                    int i = ot8Var.j0;
                    int i2 = i - size;
                    if (i2 >= 0 && (v15Var = (v15) arrayList.get(i2)) != null) {
                        name = v15Var;
                    }
                    arrayList2.add(ot8Var.H0(ko2Var, name, i));
                }
                io2 io2VarM0 = ko2Var.M0(wi8.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((v15) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                io2VarM0.x0 = Boolean.valueOf(z);
                io2VarM0.i0 = arrayList2;
                io2VarM0.g0 = ko2Var.G0();
                jo2 jo2VarJ0 = super.J0(io2VarM0);
                jo2VarJ0.getClass();
                return jo2VarJ0;
            }
        }
        return ko2Var;
    }

    @Override // defpackage.jo2, defpackage.ho2
    public final boolean i() {
        return false;
    }

    @Override // defpackage.jo2, defpackage.ts4
    public final boolean k() {
        return false;
    }
}
