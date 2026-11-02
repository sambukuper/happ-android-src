package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ar3 {
    public Class b() {
        return Object.class;
    }

    public boolean c(t37 t37Var, Object obj) {
        return false;
    }

    public boolean d() {
        return this instanceof oo8;
    }

    public abstract void e(Object obj, ro3 ro3Var, t37 t37Var);

    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) {
        Class<?> clsB = b();
        if (clsB == null) {
            clsB = obj.getClass();
        }
        t37Var.z(clsB, pc6.q("Type id handling not implemented for type ", clsB.getName(), " (by serializer of type ", getClass().getName(), ")"));
        throw null;
    }

    public boolean h() {
        return false;
    }

    public ar3 g(c25 c25Var) {
        return this;
    }

    public ar3 i(Set set) {
        return this;
    }
}
