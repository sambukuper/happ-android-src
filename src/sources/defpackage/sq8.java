package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sq8 {
    public final fg0 a;
    public final Map b;
    public final Set c;
    public we6 d;

    public /* synthetic */ sq8(fg0 fg0Var, LinkedHashMap linkedHashMap, we6 we6Var, int i) {
        this((i & 1) != 0 ? new fg0((byte) 0) : fg0Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : we6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq8)) {
            return false;
        }
        sq8 sq8Var = (sq8) obj;
        return dh3.f(this.a, sq8Var.a) && dh3.f(this.b, sq8Var.b) && dh3.f(this.c, sq8Var.c) && dh3.f(this.d, sq8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        we6 we6Var = this.d;
        return iHashCode + (we6Var == null ? 0 : Integer.hashCode(we6Var.a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public sq8(fg0 fg0Var, Map map, Set set, we6 we6Var) {
        fg0Var.getClass();
        map.getClass();
        this.a = fg0Var;
        this.b = map;
        this.c = set;
        this.d = we6Var;
    }
}
