package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qb6 {
    public final Class a;
    public final b04 b;

    public qb6(Class cls, b04 b04Var) {
        this.a = cls;
        this.b = b04Var;
    }

    public final String a() {
        String strReplace = this.a.getName().replace('.', '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb6) {
            return this.a.equals(((qb6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qb6.class.getName() + ": " + this.a;
    }
}
