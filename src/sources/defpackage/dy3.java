package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dy3 {
    public final String a;
    public final Map b;

    public dy3(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy3)) {
            return false;
        }
        dy3 dy3Var = (dy3) obj;
        return dh3.f(this.a, dy3Var.a) && this.b.equals(dy3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        return "@" + this.a + '(' + wv0.y0(zp4.O(this.b), null, null, null, cl1.z0, 31) + ')';
    }
}
