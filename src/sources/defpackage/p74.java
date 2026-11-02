package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p74 implements et4 {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public p74(ve4 ve4Var, dn2 dn2Var) {
        ve4Var.getClass();
        this.c = new te4(ve4Var, new bm1(dn2Var, (byte) 1));
    }

    @Override // defpackage.et4
    public Collection a(pk1 pk1Var, gn2 gn2Var) {
        switch (this.b) {
            case 1:
                pk1Var.getClass();
                Collection collectionI = i(pk1Var, gn2Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((ed1) obj) instanceof jd0) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return wv0.H0(z68.E0(arrayList, ve7.h0), arrayList2);
            default:
                return i(pk1Var, gn2Var);
        }
    }

    @Override // defpackage.et4
    public Collection b(v15 v15Var, x45 x45Var) {
        switch (this.b) {
            case 1:
                v15Var.getClass();
                return z68.E0(j(v15Var, x45Var), ve7.f0);
            default:
                return j(v15Var, x45Var);
        }
    }

    @Override // defpackage.et4
    public final Set c() {
        return l().c();
    }

    @Override // defpackage.et4
    public final Set d() {
        return l().d();
    }

    @Override // defpackage.et4
    public final ot0 e(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        x45Var.getClass();
        return l().e(v15Var, x45Var);
    }

    @Override // defpackage.et4
    public Collection f(v15 v15Var, x45 x45Var) {
        switch (this.b) {
            case 1:
                v15Var.getClass();
                return z68.E0(k(v15Var, x45Var), ve7.g0);
            default:
                return k(v15Var, x45Var);
        }
    }

    @Override // defpackage.et4
    public final Set g() {
        return l().g();
    }

    public final et4 h() {
        if (!(l() instanceof p74)) {
            return l();
        }
        et4 et4VarL = l();
        et4VarL.getClass();
        return ((p74) et4VarL).h();
    }

    public final Collection i(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return l().a(pk1Var, gn2Var);
    }

    public final Collection j(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return l().b(v15Var, x45Var);
    }

    public final Collection k(v15 v15Var, x45 x45Var) {
        v15Var.getClass();
        return l().f(v15Var, x45Var);
    }

    public final et4 l() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (et4) ((te4) obj).invoke();
            default:
                return (et4) obj;
        }
    }

    public p74(et4 et4Var) {
        this.c = et4Var;
    }
}
