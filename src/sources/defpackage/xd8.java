package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd8 implements wd8 {
    public final Object a;
    public final Object b;

    public xd8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.wd8
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.wd8
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wd8)) {
            return false;
        }
        wd8 wd8Var = (wd8) obj;
        return dh3.f(this.a, wd8Var.a()) && dh3.f(this.b, wd8Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
