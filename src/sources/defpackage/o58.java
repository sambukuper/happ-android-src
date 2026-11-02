package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o58 implements re2, ao2 {
    public final /* synthetic */ a74 a;

    public o58(a74 a74Var) {
        this.a = a74Var;
    }

    @Override // defpackage.ao2
    public final on2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof re2) || !(obj instanceof ao2)) {
            return false;
        }
        return this.a.equals(((ao2) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.re2
    public final float invoke() {
        return ((Number) this.a.get()).floatValue();
    }
}
