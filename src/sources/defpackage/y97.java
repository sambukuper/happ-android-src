package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y97 extends u37 implements Serializable {
    public HashMap X;
    public HashMap Y;
    public boolean Z;

    @Override // defpackage.u37
    public final ar3 a(dh8 dh8Var) {
        ar3 ar3VarB;
        ar3 ar3Var;
        Class superclass = dh8Var.j0;
        ss0 ss0Var = new ss0(superclass);
        if (superclass.isInterface()) {
            HashMap map = this.Y;
            if (map != null && (ar3Var = (ar3) map.get(ss0Var)) != null) {
                return ar3Var;
            }
        } else {
            HashMap map2 = this.X;
            if (map2 != null) {
                ar3 ar3Var2 = (ar3) map2.get(ss0Var);
                if (ar3Var2 != null) {
                    return ar3Var2;
                }
                if (this.Z && dh8Var.J0()) {
                    ss0Var.Y = Enum.class;
                    String name = Enum.class.getName();
                    ss0Var.X = name;
                    ss0Var.Z = name.hashCode();
                    ar3 ar3Var3 = (ar3) this.X.get(ss0Var);
                    if (ar3Var3 != null) {
                        return ar3Var3;
                    }
                }
                for (Class superclass2 = superclass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    ss0Var.Y = superclass2;
                    String name2 = superclass2.getName();
                    ss0Var.X = name2;
                    ss0Var.Z = name2.hashCode();
                    ar3 ar3Var4 = (ar3) this.X.get(ss0Var);
                    if (ar3Var4 != null) {
                        return ar3Var4;
                    }
                }
            }
        }
        if (this.Y == null) {
            return null;
        }
        ar3 ar3VarB2 = b(superclass, ss0Var);
        if (ar3VarB2 != null) {
            return ar3VarB2;
        }
        if (superclass.isInterface()) {
            return null;
        }
        do {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return null;
            }
            ar3VarB = b(superclass, ss0Var);
        } while (ar3VarB == null);
        return ar3VarB;
    }

    public final ar3 b(Class cls, ss0 ss0Var) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            ss0Var.Y = cls2;
            String name = cls2.getName();
            ss0Var.X = name;
            ss0Var.Z = name.hashCode();
            ar3 ar3Var = (ar3) this.Y.get(ss0Var);
            if (ar3Var != null) {
                return ar3Var;
            }
            ar3 ar3VarB = b(cls2, ss0Var);
            if (ar3VarB != null) {
                return ar3VarB;
            }
        }
        return null;
    }
}
