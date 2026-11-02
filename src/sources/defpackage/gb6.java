package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gb6 implements vj3 {
    @Override // defpackage.vj3
    public ja6 a(fk2 fk2Var) {
        Object next;
        fk2Var.getClass();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (dh3.f(ia6.a(zc1.M(zc1.K(((ja6) next).a))).a(), fk2Var)) {
                return (ja6) next;
            }
        }
        next = null;
        return (ja6) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof gb6) && dh3.f(b(), ((gb6) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
