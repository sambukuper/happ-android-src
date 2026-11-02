package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 {
    public final String a;
    public final Map b;

    public x82(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static x82 a(String str) {
        return new x82(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x82)) {
            return false;
        }
        x82 x82Var = (x82) obj;
        return this.a.equals(x82Var.a) && this.b.equals(x82Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
