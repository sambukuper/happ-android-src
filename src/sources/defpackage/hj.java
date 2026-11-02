package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lhj;", "S", "Lqx4;", "Lkj;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class hj<S> extends qx4 {
    public final sd8 X;
    public final y05 Y;
    public final lj Z;

    public hj(sd8 sd8Var, y05 y05Var, lj ljVar) {
        this.X = sd8Var;
        this.Y = y05Var;
        this.Z = ljVar;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new kj(this.X, this.Y, this.Z);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        kj kjVar = (kj) jx4Var;
        kjVar.r0 = this.X;
        kjVar.s0 = this.Y;
        kjVar.t0 = this.Z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return dh3.f(hjVar.X, this.X) && hjVar.Y.equals(this.Y);
    }

    public final int hashCode() {
        int iHashCode = this.Z.hashCode() * 31;
        sd8 sd8Var = this.X;
        return this.Y.hashCode() + ((iHashCode + (sd8Var != null ? sd8Var.hashCode() : 0)) * 31);
    }
}
