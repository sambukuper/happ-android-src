package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr {
    public static final wr c = new wr(be.n(i21.L(new dw0(ep.p), new dw0(ep.q))), ep.t);
    public static final wr d = new wr(be.n(i21.L(new dw0(ep.r), new dw0(ep.s))), ep.u);
    public final ea4 a;
    public final long b;

    public wr(ea4 ea4Var, long j) {
        this.a = ea4Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) obj;
        if (!this.a.equals(wrVar.a)) {
            return false;
        }
        long j = wrVar.b;
        int i = dw0.h;
        return tk8.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = dw0.h;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "AppSnackbarColors(backgroundGradient=" + this.a + ", divider=" + dw0.h(this.b) + ")";
    }
}
