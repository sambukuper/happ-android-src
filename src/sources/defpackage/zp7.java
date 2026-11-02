package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zp7 extends ft4 {
    public final vx4 b;
    public final fk2 c;

    public zp7(vx4 vx4Var, fk2 fk2Var) {
        vx4Var.getClass();
        fk2Var.getClass();
        this.b = vx4Var;
        this.c = fk2Var;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        if (pk1Var.a(pk1.h)) {
            fk2 fk2Var = this.c;
            if (!fk2Var.a.c() || !pk1Var.a.contains(mk1.a)) {
                vx4 vx4Var = this.b;
                Collection collectionT = vx4Var.t(fk2Var, gn2Var);
                ArrayList arrayList = new ArrayList(collectionT.size());
                Iterator it = collectionT.iterator();
                while (it.hasNext()) {
                    v15 v15VarG = ((fk2) it.next()).a.g();
                    if (((Boolean) gn2Var.B(v15VarG)).booleanValue()) {
                        n74 n74Var = null;
                        if (!v15VarG.Y) {
                            n74 n74VarB0 = vx4Var.b0(fk2Var.a(v15VarG));
                            if (!((Boolean) hi5.e0(n74VarB0.j0, n74.l0[1])).booleanValue()) {
                                n74Var = n74VarB0;
                            }
                        }
                        if (n74Var != null) {
                            arrayList.add(n74Var);
                        }
                    }
                }
                return arrayList;
            }
        }
        return d02.X;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set d() {
        return m02.X;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
