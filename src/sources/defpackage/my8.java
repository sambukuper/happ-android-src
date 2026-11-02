package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class my8 extends gl {
    public final Class D0;
    public final dh8 E0;
    public final String F0;

    public my8(pi8 pi8Var, Class cls, String str, dh8 dh8Var) {
        super(pi8Var, null);
        this.D0 = cls;
        this.E0 = dh8Var;
        this.F0 = str;
    }

    @Override // defpackage.gl
    public final Object C0(Object obj) {
        throw new IllegalArgumentException(oi0.p(new StringBuilder("Cannot get virtual property '"), this.F0, "'"));
    }

    @Override // defpackage.vj8
    public final String L() {
        return this.F0;
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
        if (!it0.o(my8.class, obj)) {
            return false;
        }
        my8 my8Var = (my8) obj;
        return my8Var.D0 == this.D0 && my8Var.F0.equals(this.F0);
    }

    public final int hashCode() {
        return this.F0.hashCode();
    }

    public final String toString() {
        return "[virtual " + A0() + "]";
    }

    @Override // defpackage.gl
    public final Class z0() {
        return this.D0;
    }
}
