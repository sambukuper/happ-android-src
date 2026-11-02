package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iy {
    public final wu4 a;
    public final cz b;

    public iy(wu4 wu4Var, cz czVar) {
        this.a = wu4Var;
        this.b = czVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iy) {
            iy iyVar = (iy) obj;
            if (this.a != iyVar.a) {
                return false;
            }
            Object obj2 = fu5.X;
            if (obj2.equals(obj2) && this.b.equals(iyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ fu5.X.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + fu5.X + ", productData=" + this.b + "}";
    }
}
