package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface l11 {
    static void p(k05 k05Var, l11 l11Var, l11 l11Var2, zx zxVar) {
        if (!Objects.equals(zxVar, i63.A)) {
            k05Var.l(zxVar, l11Var2.i(zxVar), l11Var2.d(zxVar));
            return;
        }
        ef6 ef6Var = (ef6) l11Var2.a(zxVar, null);
        ef6 ef6Var2 = (ef6) l11Var.a(zxVar, null);
        k11 k11VarI = l11Var2.i(zxVar);
        if (ef6Var == null) {
            ef6Var = ef6Var2;
        } else if (ef6Var2 != null) {
            pz2 pz2Var = ef6Var2.a;
            ff6 ff6Var = ef6Var2.b;
            pz2 pz2Var2 = ef6Var.a;
            if (pz2Var2 != null) {
                pz2Var = pz2Var2;
            }
            ff6 ff6Var2 = ef6Var.b;
            if (ff6Var2 != null) {
                ff6Var = ff6Var2;
            }
            ef6Var = new ef6(pz2Var, ff6Var);
        }
        k05Var.l(zxVar, k11VarI, ef6Var);
    }

    static qd5 q(l11 l11Var, l11 l11Var2) {
        if (l11Var == null && l11Var2 == null) {
            return qd5.Z;
        }
        k05 k05VarK = l11Var2 != null ? k05.k(l11Var2) : k05.j();
        if (l11Var != null) {
            Iterator it = l11Var.b().iterator();
            while (it.hasNext()) {
                p(k05VarK, l11Var2, l11Var, (zx) it.next());
            }
        }
        return qd5.c(k05VarK);
    }

    Object a(zx zxVar, Object obj);

    Set b();

    Object d(zx zxVar);

    Set e(zx zxVar);

    Object f(zx zxVar, k11 k11Var);

    void g(jn0 jn0Var);

    boolean h(zx zxVar);

    k11 i(zx zxVar);
}
