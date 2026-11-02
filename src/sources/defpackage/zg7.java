package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zg7 implements pk {
    public final pk a;
    public final long b;

    public zg7(ta2 ta2Var, long j) {
        this.a = ta2Var;
        this.b = j;
    }

    @Override // defpackage.pk
    public final ju8 a(ug8 ug8Var) {
        return new ah7(this.a.a(ug8Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zg7)) {
            return false;
        }
        zg7 zg7Var = (zg7) obj;
        return zg7Var.b == this.b && dh3.f(zg7Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
