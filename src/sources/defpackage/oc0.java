package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 {
    public final w78 a;

    public oc0(w78 w78Var) {
        this.a = w78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc0)) {
            return false;
        }
        w78 w78Var = this.a;
        ql qlVar = w78Var.a;
        w78 w78Var2 = ((oc0) obj).a;
        return dh3.f(qlVar, w78Var2.a) && w78Var.b.c(w78Var2.b) && dh3.f(w78Var.c, w78Var2.c) && w78Var.d == w78Var2.d && w78Var.e == w78Var2.e && w78Var.f == w78Var2.f && dh3.f(w78Var.g, w78Var2.g) && w78Var.h == w78Var2.h && w78Var.i == w78Var2.i && q31.b(w78Var.j, w78Var2.j);
    }

    public final int hashCode() {
        w78 w78Var = this.a;
        int iHashCode = w78Var.a.hashCode() * 31;
        o88 o88Var = w78Var.b;
        qe7 qe7Var = o88Var.a;
        long j = qe7Var.b;
        w88[] w88VarArr = v88.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        dj2 dj2Var = qe7Var.c;
        int i = (iHashCode2 + (dj2Var != null ? dj2Var.X : 0)) * 31;
        bj2 bj2Var = qe7Var.d;
        int iHashCode3 = (i + (bj2Var != null ? Integer.hashCode(bj2Var.a) : 0)) * 31;
        cj2 cj2Var = qe7Var.e;
        int iHashCode4 = (iHashCode3 + (cj2Var != null ? Integer.hashCode(cj2Var.a) : 0)) * 31;
        gi2 gi2Var = qe7Var.f;
        int iHashCode5 = (iHashCode4 + (gi2Var != null ? gi2Var.hashCode() : 0)) * 31;
        String str = qe7Var.g;
        int iG = p61.g((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, qe7Var.h, 31);
        x20 x20Var = qe7Var.i;
        int iHashCode6 = (iG + (x20Var != null ? Float.hashCode(x20Var.a) : 0)) * 31;
        g78 g78Var = qe7Var.j;
        int iHashCode7 = (iHashCode6 + (g78Var != null ? g78Var.hashCode() : 0)) * 31;
        ge4 ge4Var = qe7Var.k;
        int iHashCode8 = (iHashCode7 + (ge4Var != null ? ge4Var.X.hashCode() : 0)) * 31;
        long j2 = qe7Var.l;
        int i2 = dw0.h;
        int iG2 = p61.g(iHashCode8, j2, 31);
        qp5 qp5Var = qe7Var.o;
        int iHashCode9 = (o88Var.b.hashCode() + ((iG2 + (qp5Var != null ? qp5Var.hashCode() : 0)) * 31)) * 31;
        up5 up5Var = o88Var.c;
        return Long.hashCode(w78Var.j) + ((w78Var.i.hashCode() + ((w78Var.h.hashCode() + ((w78Var.g.hashCode() + oi0.e(w78Var.f, pc6.f((p61.f((iHashCode9 + (up5Var != null ? up5Var.hashCode() : 0) + iHashCode) * 31, 31, w78Var.c) + w78Var.d) * 31, 31, w78Var.e), 31)) * 31)) * 31)) * 31);
    }
}
