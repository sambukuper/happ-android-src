package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements et4 {
    public final String b;
    public final et4[] c;

    public yo0(String str, et4[] et4VarArr) {
        this.b = str;
        this.c = et4VarArr;
    }

    @Override // defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        et4[] et4VarArr = this.c;
        int length = et4VarArr.length;
        if (length == 0) {
            return d02.X;
        }
        if (length == 1) {
            return et4VarArr[0].a(pk1Var, gn2Var);
        }
        Collection collectionM = null;
        for (et4 et4Var : et4VarArr) {
            collectionM = z39.m(collectionM, et4Var.a(pk1Var, gn2Var));
        }
        return collectionM == null ? m02.X : collectionM;
    }

    @Override // defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        et4[] et4VarArr = this.c;
        int length = et4VarArr.length;
        if (length == 0) {
            return d02.X;
        }
        if (length == 1) {
            return et4VarArr[0].b(v15Var, x45Var);
        }
        Collection collectionM = null;
        for (et4 et4Var : et4VarArr) {
            collectionM = z39.m(collectionM, et4Var.b(v15Var, x45Var));
        }
        return collectionM == null ? m02.X : collectionM;
    }

    @Override // defpackage.et4
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (et4 et4Var : this.c) {
            bw0.d0(linkedHashSet, et4Var.c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.et4
    public final Set d() {
        return vr3.w(eu.W(this.c));
    }

    @Override // defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        ot0 ot0Var = null;
        for (et4 et4Var : this.c) {
            ot0 ot0VarE = et4Var.e(v15Var, x45Var);
            if (ot0VarE != null) {
                if (!(ot0VarE instanceof pt0) || !((ts4) ot0VarE).C()) {
                    return ot0VarE;
                }
                if (ot0Var == null) {
                    ot0Var = ot0VarE;
                }
            }
        }
        return ot0Var;
    }

    @Override // defpackage.et4
    public final Collection f(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        et4[] et4VarArr = this.c;
        int length = et4VarArr.length;
        if (length == 0) {
            return d02.X;
        }
        if (length == 1) {
            return et4VarArr[0].f(v15Var, x45Var);
        }
        Collection collectionM = null;
        for (et4 et4Var : et4VarArr) {
            collectionM = z39.m(collectionM, et4Var.f(v15Var, x45Var));
        }
        return collectionM == null ? m02.X : collectionM;
    }

    @Override // defpackage.et4
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (et4 et4Var : this.c) {
            bw0.d0(linkedHashSet, et4Var.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.b;
    }
}
