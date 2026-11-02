package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class it4 {
    public final d53 a;
    public final Map b;

    public it4(d53 d53Var, Map map) {
        this.a = d53Var;
        this.b = w51.P(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it4)) {
            return false;
        }
        it4 it4Var = (it4) obj;
        return dh3.f(this.a, it4Var.a) && dh3.f(this.b, it4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
