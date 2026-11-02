package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l41 {
    public final s80 a;
    public final mm0 b;

    public l41(s80 s80Var, mm0 mm0Var) {
        this.a = s80Var;
        this.b = mm0Var;
    }

    public final String toString() {
        mm0 mm0Var = this.b;
        x61 x61Var = (x61) mm0Var.g0.H0(x61.Z);
        String str = x61Var != null ? x61Var.Y : null;
        int iHashCode = hashCode();
        km4.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? pc6.p("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + mm0Var + ")";
    }
}
