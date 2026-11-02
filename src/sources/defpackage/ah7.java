package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah7 implements ju8 {
    public final ju8 X;
    public final long Y;

    public ah7(ju8 ju8Var, long j) {
        this.X = ju8Var;
        this.Y = j;
    }

    @Override // defpackage.ju8
    public final boolean a() {
        return this.X.a();
    }

    @Override // defpackage.ju8
    public final long d(wk wkVar, wk wkVar2, wk wkVar3) {
        return this.X.d(wkVar, wkVar2, wkVar3) + this.Y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah7)) {
            return false;
        }
        ah7 ah7Var = (ah7) obj;
        return ah7Var.Y == this.Y && dh3.f(ah7Var.X, this.X);
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + (this.X.hashCode() * 31);
    }

    @Override // defpackage.ju8
    public final wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        long j2 = this.Y;
        return j < j2 ? wkVar3 : this.X.m(j - j2, wkVar, wkVar2, wkVar3);
    }

    @Override // defpackage.ju8
    public final wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        long j2 = this.Y;
        return j < j2 ? wkVar : this.X.z(j - j2, wkVar, wkVar2, wkVar3);
    }
}
