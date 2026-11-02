package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nj7 {
    public ur3 a;
    public tr3 b;
    public String c;
    public vh8 d;

    public final si8 a(l37 l37Var, dh8 dh8Var, ArrayList arrayList) {
        int iLastIndexOf;
        d50 d50Var = null;
        if (this.a == ur3.NONE || dh8Var.j0.isPrimitive()) {
            return null;
        }
        if (this.a == ur3.DEDUCTION) {
            return ku.d;
        }
        uh8 uh8Var = l37Var.Y.X;
        l37Var.f(xp4.E0);
        vh8 at0Var = this.d;
        byte b = 2;
        byte b2 = 1;
        if (at0Var == null) {
            ur3 ur3Var = this.a;
            if (ur3Var == null) {
                bt.i("Cannot build, 'init()' not yet called");
                return null;
            }
            int iOrdinal = ur3Var.ordinal();
            if (iOrdinal == 0) {
                at0Var = null;
            } else if (iOrdinal == 1) {
                at0Var = new at0(dh8Var, uh8Var, arrayList);
            } else if (iOrdinal == 2) {
                at0Var = new uv4(dh8Var, uh8Var, arrayList);
            } else if (iOrdinal == 3) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                l37Var.f(xp4.z0);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f25 f25Var = (f25) it.next();
                        Class cls = f25Var.X;
                        String name = f25Var.Z;
                        if (name == null && (iLastIndexOf = (name = cls.getName()).lastIndexOf(46)) >= 0) {
                            name = name.substring(iLastIndexOf + 1);
                        }
                        concurrentHashMap.put(cls.getName(), name);
                    }
                }
                at0Var = new fi8(l37Var, dh8Var, concurrentHashMap, null);
            } else if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    bt.p(this.a, "Do not know how to construct standard type id resolver for idType: ");
                    return null;
                }
                at0Var = new at0(dh8Var, uh8Var, arrayList);
            } else {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                l37Var.f(xp4.z0);
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f25 f25Var2 = (f25) it2.next();
                        Class cls2 = f25Var2.X;
                        String name2 = f25Var2.Z;
                        if (name2 == null) {
                            name2 = cls2.getName();
                            int iMax = Math.max(name2.lastIndexOf(46), name2.lastIndexOf(36));
                            if (iMax >= 0) {
                                name2 = name2.substring(iMax + 1);
                            }
                        }
                        concurrentHashMap2.put(cls2.getName(), name2);
                    }
                }
                at0Var = new w97(l37Var, dh8Var, concurrentHashMap2, null);
            }
        }
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            return new nu(at0Var, null, this.c);
        }
        if (iOrdinal2 == 1) {
            return new ku(at0Var, d50Var, b);
        }
        if (iOrdinal2 == 2) {
            return new ku(at0Var, d50Var, b2);
        }
        if (iOrdinal2 == 3) {
            return new mu(at0Var, null, this.c);
        }
        if (iOrdinal2 == 4) {
            return new lu(at0Var, null, this.c);
        }
        bt.p(this.b, "Do not know how to construct standard type serializer for inclusion type: ");
        return null;
    }

    public final void b(wr3 wr3Var) {
        ur3 ur3Var = wr3Var.X;
        Objects.requireNonNull(ur3Var);
        this.a = ur3Var;
        this.b = wr3Var.Y;
        String str = wr3Var.Z;
        if (str == null || str.isEmpty()) {
            str = ur3Var.X;
        }
        this.c = str;
    }
}
