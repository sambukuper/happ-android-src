package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh2 implements ao2 {
    public final /* synthetic */ gn2 a;

    public kh2(gn2 gn2Var) {
        this.a = gn2Var;
    }

    @Override // defpackage.ao2
    public final on2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh2)) {
            return false;
        }
        return dh3.f(this.a, ((ao2) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
