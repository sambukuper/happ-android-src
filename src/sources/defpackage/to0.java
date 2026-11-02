package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 {
    public static final to0 c = new to0(wv0.c1(new ArrayList()), null);
    public final Set a;
    public final g33 b;

    public to0(Set set, g33 g33Var) {
        this.a = set;
        this.b = g33Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof to0)) {
            return false;
        }
        to0 to0Var = (to0) obj;
        return to0Var.a.equals(this.a) && dh3.f(to0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        g33 g33Var = this.b;
        return iHashCode + (g33Var != null ? g33Var.hashCode() : 0);
    }
}
