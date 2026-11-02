package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ht4 {
    public final String a;
    public final Map b;

    public ht4(String str, Map map) {
        this.a = str;
        this.b = w51.P(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht4)) {
            return false;
        }
        ht4 ht4Var = (ht4) obj;
        return dh3.f(this.a, ht4Var.a) && dh3.f(this.b, ht4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
