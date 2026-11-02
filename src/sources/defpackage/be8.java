package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class be8 {
    public final u72 a;
    public final eb7 b;
    public final fp0 c;
    public final qw6 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ be8(u72 u72Var, eb7 eb7Var, fp0 fp0Var, qw6 qw6Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : u72Var, (i & 2) != 0 ? null : eb7Var, (i & 4) != 0 ? null : fp0Var, (i & 8) != 0 ? null : qw6Var, (i & 32) == 0, (i & 64) != 0 ? e02.X : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be8)) {
            return false;
        }
        be8 be8Var = (be8) obj;
        return dh3.f(this.a, be8Var.a) && dh3.f(this.b, be8Var.b) && dh3.f(this.c, be8Var.c) && dh3.f(this.d, be8Var.d) && this.e == be8Var.e && dh3.f(this.f, be8Var.f);
    }

    public final int hashCode() {
        u72 u72Var = this.a;
        int iHashCode = (u72Var == null ? 0 : u72Var.hashCode()) * 31;
        eb7 eb7Var = this.b;
        int iHashCode2 = (iHashCode + (eb7Var == null ? 0 : eb7Var.hashCode())) * 31;
        fp0 fp0Var = this.c;
        int iHashCode3 = (iHashCode2 + (fp0Var == null ? 0 : fp0Var.hashCode())) * 31;
        qw6 qw6Var = this.d;
        return this.f.hashCode() + pc6.f((iHashCode3 + (qw6Var != null ? qw6Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public be8(u72 u72Var, eb7 eb7Var, fp0 fp0Var, qw6 qw6Var, boolean z, Map map) {
        this.a = u72Var;
        this.b = eb7Var;
        this.c = fp0Var;
        this.d = qw6Var;
        this.e = z;
        this.f = map;
    }
}
