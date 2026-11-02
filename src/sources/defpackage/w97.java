package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w97 extends vh8 implements Serializable {
    public final l37 Z;
    public final ConcurrentHashMap f0;
    public final HashMap g0;

    public w97(l37 l37Var, dh8 dh8Var, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(dh8Var, l37Var.Y.X);
        this.Z = l37Var;
        this.f0 = concurrentHashMap;
        this.g0 = map;
        l37Var.f(xp4.z0);
    }

    @Override // defpackage.vh8
    public final String b(Object obj) {
        return d(obj.getClass());
    }

    @Override // defpackage.vh8
    public final String c(Class cls, Object obj) {
        return obj == null ? d(cls) : d(obj.getClass());
    }

    public final String d(Class cls) {
        if (cls == null) {
            return null;
        }
        Class clsA = vh8.a(cls);
        String name = clsA.getName();
        ConcurrentHashMap concurrentHashMap = this.f0;
        String strK = (String) concurrentHashMap.get(name);
        if (strK == null) {
            Class cls2 = this.X.b(null, clsA, uh8.f0).j0;
            xp4 xp4Var = xp4.Z;
            l37 l37Var = this.Z;
            if (l37Var.f(xp4Var)) {
                dh8 dh8VarC = l37Var.c(cls2);
                ((b30) l37Var.Y.Y).getClass();
                z20 z20VarE0 = b30.E0(l37Var, dh8VarC);
                if (z20VarE0 == null) {
                    z20VarE0 = z20.d(l37Var, dh8VarC, bl.g(l37Var, dh8VarC, l37Var));
                }
                strK = l37Var.d().K(z20VarE0.e);
            }
            if (strK == null) {
                String name2 = cls2.getName();
                int iMax = Math.max(name2.lastIndexOf(46), name2.lastIndexOf(36));
                if (iMax >= 0) {
                    name2 = name2.substring(iMax + 1);
                }
                strK = name2;
            }
            concurrentHashMap.put(name, strK);
        }
        return strK;
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", w97.class.getName(), this.g0);
    }
}
