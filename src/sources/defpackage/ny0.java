package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface ny0 {
    default Object a(Class cls) {
        return k(e26.a(cls));
    }

    default Set e(e26 e26Var) {
        return (Set) i(e26Var).get();
    }

    default w06 f(Class cls) {
        return j(e26.a(cls));
    }

    w06 i(e26 e26Var);

    w06 j(e26 e26Var);

    default Object k(e26 e26Var) {
        w06 w06VarJ = j(e26Var);
        if (w06VarJ == null) {
            return null;
        }
        return w06VarJ.get();
    }
}
