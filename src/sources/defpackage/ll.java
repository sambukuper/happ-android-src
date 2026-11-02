package defpackage;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ll extends gl {
    public final ul D0;
    public final dh8 E0;
    public final int F0;

    public ll(ul ulVar, dh8 dh8Var, pi8 pi8Var, yr2 yr2Var, int i) {
        super(pi8Var, yr2Var);
        this.D0 = ulVar;
        this.E0 = dh8Var;
        this.F0 = i;
    }

    @Override // defpackage.gl
    public final Member B0() {
        return this.D0.B0();
    }

    @Override // defpackage.gl
    public final Object C0(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(this.D0.z0().getName()));
    }

    @Override // defpackage.gl
    public final vj8 E0(yr2 yr2Var) {
        if (yr2Var == this.C0) {
            return this;
        }
        ul ulVar = this.D0;
        yr2[] yr2VarArr = ulVar.D0;
        int i = this.F0;
        yr2VarArr[i] = yr2Var;
        return ulVar.F0(i);
    }

    @Override // defpackage.vj8
    public final int K() {
        return this.D0.K();
    }

    @Override // defpackage.vj8
    public final Class N() {
        return this.E0.j0;
    }

    @Override // defpackage.vj8
    public final dh8 Q() {
        return this.E0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!it0.o(ll.class, obj)) {
            return false;
        }
        ll llVar = (ll) obj;
        return llVar.D0.equals(this.D0) && llVar.F0 == this.F0;
    }

    public final int hashCode() {
        return this.D0.hashCode() + this.F0;
    }

    public final String toString() {
        return "[parameter #" + this.F0 + ", annotations: " + this.C0 + "]";
    }

    @Override // defpackage.gl
    public final Class z0() {
        return this.D0.z0();
    }
}
