package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class up8 {
    public static final tp8 Companion = new tp8();
    public static final g44[] d = {null, null, x97.P(w74.X, new ng8((byte) 4))};
    public final vo8 a;
    public final vo8 b;
    public final List c;

    public /* synthetic */ up8(int i, vo8 vo8Var, vo8 vo8Var2, List list) {
        if (7 != (i & 7)) {
            ch3.S(i, 7, sp8.a.d());
            throw null;
        }
        this.a = vo8Var;
        this.b = vo8Var2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up8)) {
            return false;
        }
        up8 up8Var = (up8) obj;
        return dh3.f(this.a, up8Var.a) && dh3.f(this.b, up8Var.b) && dh3.f(this.c, up8Var.c);
    }

    public final int hashCode() {
        vo8 vo8Var = this.a;
        int iHashCode = vo8Var == null ? 0 : vo8Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "UpdateType(beta=" + this.a + ", stable=" + this.b + ", block=" + this.c + ")";
    }
}
