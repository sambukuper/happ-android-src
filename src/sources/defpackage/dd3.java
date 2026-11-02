package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends ft4 {
    public final et4 b;

    public dd3(et4 et4Var) {
        et4Var.getClass();
        this.b = et4Var;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        int i = pk1.l & pk1Var.b;
        pk1 pk1Var2 = i == 0 ? null : new pk1(i, pk1Var.a);
        if (pk1Var2 == null) {
            return d02.X;
        }
        Collection collectionA = this.b.a(pk1Var2, gn2Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof pt0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.ft4, defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        ot0 ot0VarE = this.b.e(v15Var, x45Var);
        if (ot0VarE != null) {
            sx4 sx4Var = ot0VarE instanceof sx4 ? (sx4) ot0VarE : null;
            if (sx4Var != null) {
                return sx4Var;
            }
            if (ot0VarE instanceof km1) {
                return (km1) ot0VarE;
            }
        }
        return null;
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Set g() {
        return this.b.g();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
