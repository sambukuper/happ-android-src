package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class re4 {
    public final Object a;
    public final dn2 b;

    public re4(Object obj, dn2 dn2Var) {
        this.a = obj;
        this.b = dn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && re4.class == obj.getClass() && this.a.equals(((re4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
