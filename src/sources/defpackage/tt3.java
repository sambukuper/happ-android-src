package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt3 implements et4 {
    public static final /* synthetic */ nw3[] f = {new lx5(tt3.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final z47 b;
    public final v44 c;
    public final b54 d;
    public final te4 e;

    public tt3(z47 z47Var, db6 db6Var, v44 v44Var) {
        this.b = z47Var;
        this.c = v44Var;
        this.d = new b54(z47Var, db6Var, v44Var);
        this.e = new te4((ve4) ((c6) z47Var.Y).f0, new zk3(this, (byte) 5));
    }

    @Override // defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        et4[] et4VarArrH = h();
        Collection collectionA = this.d.a(pk1Var, gn2Var);
        for (et4 et4Var : et4VarArrH) {
            collectionA = z39.m(collectionA, et4Var.a(pk1Var, gn2Var));
        }
        return collectionA == null ? m02.X : collectionA;
    }

    @Override // defpackage.et4
    public final Collection b(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        i(v15Var, x45Var);
        et4[] et4VarArrH = h();
        Collection collectionB = this.d.b(v15Var, x45Var);
        for (et4 et4Var : et4VarArrH) {
            collectionB = z39.m(collectionB, et4Var.b(v15Var, x45Var));
        }
        return collectionB == null ? m02.X : collectionB;
    }

    @Override // defpackage.et4
    public final Set c() {
        et4[] et4VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (et4 et4Var : et4VarArrH) {
            bw0.d0(linkedHashSet, et4Var.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // defpackage.et4
    public final Set d() {
        HashSet hashSetW = vr3.w(eu.W(h()));
        if (hashSetW == null) {
            return null;
        }
        hashSetW.addAll(this.d.d());
        return hashSetW;
    }

    @Override // defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        i(v15Var, x45Var);
        b54 b54Var = this.d;
        b54Var.getClass();
        ot0 ot0Var = null;
        sx4 sx4VarV = b54Var.v(v15Var, null);
        if (sx4VarV != null) {
            return sx4VarV;
        }
        for (et4 et4Var : h()) {
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
        i(v15Var, x45Var);
        et4[] et4VarArrH = h();
        this.d.getClass();
        Collection collectionM = d02.X;
        for (et4 et4Var : et4VarArrH) {
            collectionM = z39.m(collectionM, et4Var.f(v15Var, x45Var));
        }
        return collectionM == null ? m02.X : collectionM;
    }

    @Override // defpackage.et4
    public final Set g() {
        et4[] et4VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (et4 et4Var : et4VarArrH) {
            bw0.d0(linkedHashSet, et4Var.g());
        }
        linkedHashSet.addAll(this.d.g());
        return linkedHashSet;
    }

    public final et4[] h() {
        return (et4[]) hi5.e0(this.e, f[0]);
    }

    public final void i(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        String str = this.c.i0.a.a;
        v15Var.b().getClass();
        str.getClass();
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
