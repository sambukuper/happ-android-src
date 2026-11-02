package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface b76 extends l11 {
    @Override // defpackage.l11
    default Object a(zx zxVar, Object obj) {
        return m().a(zxVar, obj);
    }

    @Override // defpackage.l11
    default Set b() {
        return m().b();
    }

    @Override // defpackage.l11
    default Object d(zx zxVar) {
        return m().d(zxVar);
    }

    @Override // defpackage.l11
    default Set e(zx zxVar) {
        return m().e(zxVar);
    }

    @Override // defpackage.l11
    default Object f(zx zxVar, k11 k11Var) {
        return m().f(zxVar, k11Var);
    }

    @Override // defpackage.l11
    default void g(jn0 jn0Var) {
        m().g(jn0Var);
    }

    @Override // defpackage.l11
    default boolean h(zx zxVar) {
        return m().h(zxVar);
    }

    @Override // defpackage.l11
    default k11 i(zx zxVar) {
        return m().i(zxVar);
    }

    l11 m();
}
